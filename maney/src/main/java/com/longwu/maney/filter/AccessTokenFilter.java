package com.longwu.maney.filter;

import com.longwu.maney.service.RedisCacheUtil;
import io.netty.util.internal.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AccessTokenFilter implements Filter {

    private String[] excludedPageArray;
    private String excludedPages;

    @Autowired
    RedisCacheUtil<String> redisCacheUtil;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        excludedPages = filterConfig.getInitParameter("excludedUrl");
        if (!StringUtil.isNullOrEmpty(excludedPages)) {
            excludedPageArray = excludedPages.split(",");
        }
        return;

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        String accessToken = request.getParameter("access_token");
        if (canIgnore(request)) {
            filterChain.doFilter(request, response);
            return;
        }
        if (StringUtils.isEmpty(accessToken)){
            request.getRequestDispatcher("/error/401").forward(request, response);
        }else{
            String redisToken = this.redisCacheUtil.getCacheObject("access:"+accessToken);
            if (redisToken == null){
                request.getRequestDispatcher("/error/401").forward(request, response);
            }else{
                filterChain.doFilter(request, response);
            }
        }


    }

    @Override
    public void destroy() {

    }

    private boolean canIgnore(ServletRequest request) {
        boolean isExcludedPage = false;
        for (String page : excludedPageArray) {// 判断是否在过滤url之外
            if (StringUtils.contains(page,"**")){
                if (StringUtils.contains(((HttpServletRequest) request).getServletPath(),page.replace("**",""))) {
                    isExcludedPage = true;
                    break;
                }
            }else{
                if (((HttpServletRequest) request).getServletPath().equals(page)) {
                    isExcludedPage = true;
                    break;
                }
            }
        }
        return isExcludedPage;
    }

}

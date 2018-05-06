package com.longwu.maney.config;

import com.longwu.maney.filter.AccessTokenFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class ConfigurationFilter {

    @Bean
    AccessTokenFilter accessTokenFilter(){
        return new AccessTokenFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(accessTokenFilter());//添加过滤器
        registration.addUrlPatterns("/*");//设置过滤路径，/*所有路径
        registration.addInitParameter("excludedUrl", "/user/**,/error/**,/oauth/**");
        registration.setName("MyFilter");//h设置优先级
        registration.setOrder(Ordered.HIGHEST_PRECEDENCE);//设置优先级
        return registration;
    }

}

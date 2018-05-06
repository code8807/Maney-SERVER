package com.longwu.maney.controller;

import com.longwu.maney.Constant.Constant;
import com.longwu.maney.service.TestService;
import com.longwu.maney.vo.UserLogin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    TestService testService;

    @RequestMapping(value = "/test1")
    public Map<String, Object> test1() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code","200");
        map.put("msg","无需登录");
        int a = 1/0;
        return map;
    }

    @RequestMapping(value = "/test4", method = RequestMethod.GET)
    public Map<String, Object> test4(@AuthenticationPrincipal Principal principal) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code","200");
        map.put("msg",principal.getName()+"你已登录");
        return map;
    }

    @RequestMapping(value = "/test5")
    public Map<String, Object> test5() {
        UserLogin userDetails = (UserLogin) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code","200");
        map.put("msg",userDetails.getUsername()+"你已登录"+"用户号为"+userDetails.getId());
        return map;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object login(HttpServletResponse resp) throws IOException {
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("<script type=\"text/javascript\">alert('请去登录！！！')</script>");
        return null;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public Map<String, Object> test2(String userid) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map.put("code", Constant.AJAX_CODE_SUCCESS);
            map.put("msg",Constant.AJAX_MSG_SUCCESS);
            map.put("body",this.testService.setRedis(userid));
            return map;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            map.put("code", Constant.AJAX_CODE_ERROR);
            map.put("msg", Constant.AJAX_MSG_ERROR);
            map.put("body", e.getMessage());
            return map;
        }
    }

    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public Map<String, Object> test3(String userid) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            map.put("code", Constant.AJAX_CODE_SUCCESS);
            map.put("msg",Constant.AJAX_MSG_SUCCESS);
            map.put("body",this.testService.getRedis(userid));
            return map;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            map.put("code", Constant.AJAX_CODE_ERROR);
            map.put("msg", Constant.AJAX_MSG_ERROR);
            map.put("body", e.getMessage());
            return map;
        }
    }
}

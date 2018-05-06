package com.longwu.maney.controller.common;

import com.longwu.maney.Constant.Constant;
import com.longwu.maney.vo.UserLogin;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/error")
public class FailController {

    private static final Log LOGGER = LogFactory.getLog(FailController.class);

    @RequestMapping("/500")
    public HashMap<String, Object> handle500(Exception e){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("code", Constant.AJAX_CODE_ERROR);
        map.put("body", "error");
        map.put("msg", "网络异常，请稍候重试");
        Object object = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();;
        if (object.equals("anonymousUser")){
            LOGGER.error("操作系统异常，未获取用户登录信息，用户会话或已超时", e);
            return map;
        }else{
            UserLogin userDetails = (UserLogin)object;
            LOGGER.error(String.format("用户[userId:%s]操作系统异常",
                    userDetails == null ? "": userDetails.getId()
            ),e);
            return map;
        }
    }

    @RequestMapping("/401")
    public HashMap<String, Object> handle401(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("code", Constant.AJAX_TIME_OUT);
        map.put("body", "");
        map.put("msg", "");
        return map;
    }

    @RequestMapping("/404")
    public HashMap<String, Object> handle404(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("code", Constant.AJAX_CODE_ERROR);
        map.put("body", "");
        map.put("msg", "找不到该资源");
        return map;
    }
}

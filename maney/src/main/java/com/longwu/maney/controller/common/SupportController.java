package com.longwu.maney.controller.common;

import com.longwu.maney.Constant.Constant;
import com.longwu.maney.model.UserInfo;
import com.longwu.maney.service.RedisCacheUtil;
import com.longwu.maney.service.user.UserService;
import com.longwu.maney.utils.SmsHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SupportController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RedisCacheUtil redisCacheUtil;
    @Autowired
    UserService userService;

    public static final String REG_TYPE = "reg";
    public static final String PWD_TYPE = "pwd";

    /**
     * 接受验证码
     */
    @RequestMapping(value="/sendcode", method=RequestMethod.POST)
    public Map<String, Object> sendcode(String userMob,String type) {
        Map<String, Object> data = new HashMap<>();
        UserInfo userInfo = this.userService.findByUserMob(userMob);
        if (userInfo != null && REG_TYPE.equals(type)){
            data.put("code",Constant.AJAX_CODE_ERROR);
            data.put("msg", "该手机号已注册");
            data.put("body","");
            return data;
        }
        SmsHelper sh = new SmsHelper();
        String code = sh.SmsRegister(userMob);
        if (REG_TYPE.equals(type)){
            this.redisCacheUtil.setCacheObject(userMob+REG_TYPE,code,5*60L);
        }else if (PWD_TYPE.equals(type)){
            this.redisCacheUtil.setCacheObject(userMob+PWD_TYPE,code,5*60L);
        }else{
            data.put("code",Constant.AJAX_CODE_ERROR);
            data.put("msg", "参数错误");
            data.put("body","");
            return (data);
        }
        data.put("code",Constant.AJAX_CODE_SUCCESS);
        data.put("msg", "");
        data.put("body",code);
        return (data);
    }
}

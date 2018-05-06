package com.longwu.maney.controller.user;

import com.longwu.maney.Constant.Constant;
import com.longwu.maney.model.UserInfo;
import com.longwu.maney.service.RedisCacheUtil;
import com.longwu.maney.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/user")
public class RegController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;
    @Autowired
    RedisCacheUtil<String> redisCacheUtil;

    /**
     * 注册提交
     */
    @RequestMapping(value="/reg", method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> reg(String userMob, String verCode, String userPwd, String userPwd2) {
        Map<String, Object> map = new HashMap<>();
        try{
            if (!userPwd.equals(userPwd2)){
                map.put("code", Constant.AJAX_CODE_ERROR);
                map.put("msg", "两次密码输入不一致");
                map.put("body","");
                return map;
            }
            // 验证码判断
            String rightCode = this.redisCacheUtil.getCacheObject(userMob+"reg");
            // 验证码超时判断
            if (rightCode == null){
                map.put("code", Constant.AJAX_CODE_ERROR);
                map.put("msg", "验证码过期");
                map.put("body","");
                return map;
            }
            if (!verCode.equals(rightCode)){
                logger.error("电话号码是："+userMob+"提交验证码："+verCode+"系统存放验证码："+rightCode);
                map.put("code", Constant.AJAX_CODE_ERROR);
                map.put("msg", "验证码错误");
                map.put("body","");
                return map;
            }
            UserInfo userInfo = this.userService.findByUserMob(userMob);
            if (userInfo != null) {
                map.put("code", Constant.AJAX_CODE_ERROR);
                map.put("msg", "手机号码已注册");
                map.put("body","");
                return map;
            }
            this.userService.createUser(userPwd,userMob);
            map.put("code", Constant.AJAX_CODE_SUCCESS);
            map.put("msg",  "");
            map.put("body","");
            return map;
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            map.put("code", Constant.AJAX_CODE_ERROR);
            map.put("msg", Constant.JH_ALERT_SYSTEM);
            map.put("body","");
            return map;
        }
    }
}

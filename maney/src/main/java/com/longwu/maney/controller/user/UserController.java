package com.longwu.maney.controller.user;

import com.longwu.maney.Constant.Constant;
import com.longwu.maney.model.UserInfo;
import com.longwu.maney.service.RedisCacheUtil;
import com.longwu.maney.service.user.UserService;
import com.longwu.maney.utils.ShaUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController
@RequestMapping(value="/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RedisCacheUtil<String> redisCacheUtil;
    @Autowired
    UserService userService;

    /**
     * 重置密码
     */
    @RequestMapping(value="/resetpwd", method=RequestMethod.POST)
    public HashMap<String, Object> resetpwd(String userMob, String userPwd, String verCode, HttpServletResponse response, HttpServletRequest request) {
        HashMap<String, Object> map = new HashMap<>();
        try{
            // 验证码判断
            String rightCode = this.redisCacheUtil.getCacheObject(userMob+"pwd");
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

            UserInfo userAuth = this.userService.findByUserMob(userMob);
            this.userService.changePassword(userAuth.getUserId(),ShaUtil.encode(userPwd));
            map.put("code", Constant.AJAX_CODE_SUCCESS);
            map.put("msg",  "");
            map.put("body","");
            return map;
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
            map.put("code", Constant.AJAX_CODE_ERROR);
            map.put("msg", Constant.JH_ALERT_SYSTEM);
            map.put("body","");
            return map;
        }
    }
}

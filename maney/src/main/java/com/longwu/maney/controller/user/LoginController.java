package com.longwu.maney.controller.user;

import com.alibaba.fastjson.JSON;
import com.longwu.maney.Constant.Constant;
import com.longwu.maney.model.UserInfo;
import com.longwu.maney.model.UserLogin;
import com.longwu.maney.service.user.UserLoginService;
import com.longwu.maney.service.user.UserService;
import com.longwu.maney.utils.HttpclientUtil;
import com.longwu.maney.utils.ShaUtil;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@RestController
@RequestMapping(value="/user")
public class LoginController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;
    @Autowired
    UserLoginService userLoginService;

    /**
     * 首页
     */
    @RequestMapping(value="/login", method=RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(String userMob, String userPwd, HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> data = new HashMap<>();
        try {
            UserInfo userInfo = this.userService.findByUserMob(userMob);
            if (userInfo == null) {
                data.put("code", Constant.AJAX_CODE_ERROR);
                data.put("msg", "找不到该用户");
                data.put("body","");
                return data;
            }
            if (!(ShaUtil.encode(userPwd)).equals(userInfo.getUserPwd())) {
                data.put("code", Constant.AJAX_CODE_ERROR);
                data.put("msg", "密码错误");
                data.put("body","");
                return data;
            }
            HttpclientUtil hu = new HttpclientUtil();
            Map<String,String> params = new TreeMap<>();
            params.put("username",userMob);
            params.put("password",userPwd);
            params.put("grant_type","password");
            params.put("scope","select");
            params.put("client_id",Constant.CLIENTID);
            params.put("client_secret",Constant.CLIENTSECRET);
            String result = hu.HttpClientPost(Constant.LOCAL_IP+Constant.OAUTH2_URL,params);
            Map<String,String> results = JSON.parseObject(result,Map.class);
            String accessToken = results.get("access_token");
            Cookie cookie = new Cookie(Constant.SESSION_NAME, accessToken);
            cookie.setPath("/");
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);
            UserLogin muUserLogin = this.userLoginService.findByUserId(String.valueOf(userInfo.getUserId()));
            UserLogin userLogin = new UserLogin();
            if (muUserLogin == null) {
                userLogin.setUserId(String.valueOf(userInfo.getUserId()));
                userLogin.setUserPwd(accessToken);
                DateTime now = new DateTime();
                userLogin.setLoginTime(now.toString(Constant.DATE_yyyyMMddHHmmss));
                this.userLoginService.addUserLogin(userLogin);
            } else {
                userLogin.setUserId(String.valueOf(userInfo.getUserId()));
                userLogin.setUserPwd(accessToken);
                DateTime now = new DateTime();
                userLogin.setLoginTime(now.toString(Constant.DATE_yyyyMMddHHmmss));
                this.userLoginService.updateUserLogin(userLogin);
            }
            data.put("code", Constant.AJAX_CODE_SUCCESS);
            data.put("msg",  "");
            data.put("body","");
            return data;
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            data.put("code", Constant.AJAX_CODE_ERROR);
            data.put("msg", Constant.JH_ALERT_SYSTEM);
            data.put("body","");
            return data;
        }
    }
}

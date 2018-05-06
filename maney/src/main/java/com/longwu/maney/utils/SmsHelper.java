package com.longwu.maney.utils;

import com.alibaba.fastjson.JSON;
import com.longwu.maney.Constant.Constant;
import com.longwu.maney.vo.support.SmsResponse;
import com.longwu.maney.vo.support.TempleSMS;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmsHelper {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    /**
     * 短信注册类
     */
    public String SmsRegister(String mobileNum){
        TempleSMS ts = new TempleSMS();
        ts.setSid(Constant.SMS_USER_ID);
        ts.setAppId(Constant.SMS_APP_ID);
        MD5Hash mh = new MD5Hash();
        DateTime now = new DateTime();
        String time = now.toString(Constant.DATE_yyyyMMddHHmmssSSS);
        ts.setSign(mh.getMD5ofStr(ts.getSid()+time+Constant.SMS_ID_TOKEN).toLowerCase());
        ts.setTime(time);
        ts.setTemplateId(Constant.SMS_REG_TEMP);
        ts.setTo(mobileNum);
        String random = CommUtils.genRandom(5);
        ts.setParam(random +",3");
        logger.info(ts.toString());
        HttpclientUtil hcu = new HttpclientUtil();
        try{
            int flag = 0;
            String result = hcu.HttpClientPost(Constant.SMS_VERIFY_URL, ts);
            logger.info(result);
            for (int n=0;n<result.length();n++){
                if (result.charAt(n)=='{'){
                    flag=flag+1;
                }
                if (flag==2){
                    flag = n;
                    break;
                }
            }
            String mresult = result.substring(flag, result.length()-1);
            SmsResponse smsResponse = JSON.parseObject(mresult, SmsResponse.class);
            if (!smsResponse.getRespCode().equals("000000")){
                return "短信发送失败,请联系客服";
            }
            }catch (Exception e){
                e.printStackTrace();
                logger.error(e.getMessage());
                return "短信发送失败,请联系客服";
            }
        return random;
    }
    
    /**
     * 忘记密码短信类
     */
    public String SmsForPwd(String mobileNum){
        TempleSMS ts = new TempleSMS();
        ts.setSid(Constant.SMS_USER_ID);
        ts.setAppId(Constant.SMS_APP_ID);
        MD5Hash mh = new MD5Hash();
        DateTime now = new DateTime();
        String time = now.toString(Constant.DATE_yyyyMMddHHmmssSSS);
        ts.setSign(mh.getMD5ofStr(ts.getSid()+time+Constant.SMS_ID_TOKEN).toLowerCase());
        ts.setTime(time);
        ts.setTemplateId(Constant.SMS_PWD_TEMP);
        ts.setTo(mobileNum);
        String random = CommUtils.genRandom(5);
        ts.setParam(random +",3");
        logger.info(ts.toString());
        HttpclientUtil hcu = new HttpclientUtil();
        try{
            int flag = 0;
            String result = hcu.HttpClientPost(Constant.SMS_VERIFY_URL, ts);
            logger.info(result);
            for (int n=0;n<result.length();n++){
                if (result.charAt(n)=='{'){
                    flag=flag+1;
                }
                if (flag==2){
                    flag = n;
                    break;
                }
            }
            String mresult = result.substring(flag, result.length()-1);
            SmsResponse smsResponse = JSON.parseObject(mresult, SmsResponse.class);
            if (!smsResponse.getRespCode().equals("000000")){
                return "短信发送失败,请联系客服";
            }
            }catch (Exception e){
                e.printStackTrace();
                logger.error(e.getMessage());
                return "短信发送失败,请联系客服";
            }
        return random;
    }
    
    
    
    
    /**
     * 预约商户通知短信类
     */
    public String SmsForyuyue(String mobileNum,String goodsName,String merName,String merAddr,String actDate,String yuyueTime,String userMobile){
        TempleSMS ts = new TempleSMS();
        ts.setSid(Constant.SMS_USER_ID);
        ts.setAppId(Constant.SMS_APP_ID);
        MD5Hash mh = new MD5Hash();
        DateTime now = new DateTime();
        String time = now.toString(Constant.DATE_yyyyMMddHHmmssSSS);
        ts.setSign(mh.getMD5ofStr(ts.getSid()+time+Constant.SMS_ID_TOKEN).toLowerCase());
        ts.setTime(time);
        ts.setTemplateId(Constant.SMS_YUYUE_TEMP);
        ts.setTo(mobileNum);
        String random = CommUtils.genRandom(5);
        ts.setParam(goodsName+","+merName +","+merAddr+","+actDate+"日"+yuyueTime+"时"+","+userMobile);
        logger.info(ts.toString());
        HttpclientUtil hcu = new HttpclientUtil();
        try{
            int flag = 0;
            String result = hcu.HttpClientPost(Constant.SMS_VERIFY_URL, ts);
            logger.info(result);
            for (int n=0;n<result.length();n++){
                if (result.charAt(n)=='{'){
                    flag=flag+1;
                }
                if (flag==2){
                    flag = n;
                    break;
                }
            }
            String mresult = result.substring(flag, result.length()-1);
            SmsResponse smsResponse = JSON.parseObject(mresult, SmsResponse.class);
            if (!smsResponse.getRespCode().equals("000000")){
                return "短信发送失败,请联系客服";
            }
            }catch (Exception e){
                e.printStackTrace();
                logger.error(e.getMessage());
                return "短信发送失败,请联系客服";
            }
        return random;
    }
    
    
    /**
     * 总馆商户卡券通知短信类
     */
    public String SmsForLongWuHui(String mobileNum,String userName){
        TempleSMS ts = new TempleSMS();
        ts.setSid(Constant.SMS_USER_ID);
        ts.setAppId(Constant.SMS_APP_ID);
        MD5Hash mh = new MD5Hash();
        DateTime now = new DateTime();
        String time = now.toString(Constant.DATE_yyyyMMddHHmmssSSS);
        ts.setSign(mh.getMD5ofStr(ts.getSid()+time+Constant.SMS_ID_TOKEN).toLowerCase());
        ts.setTime(time);
        ts.setTemplateId(Constant.SMS_LONGWUHUI_TEMP);
        ts.setTo(mobileNum);
        String random = CommUtils.genRandom(5);
        ts.setParam(userName);
        logger.info(ts.toString());
        HttpclientUtil hcu = new HttpclientUtil();
        try{
            int flag = 0;
            String result = hcu.HttpClientPost(Constant.SMS_VERIFY_URL, ts);
            logger.info(result);
            for (int n=0;n<result.length();n++){
                if (result.charAt(n)=='{'){
                    flag=flag+1;
                }
                if (flag==2){
                    flag = n;
                    break;
                }
            }
            String mresult = result.substring(flag, result.length()-1);
            SmsResponse smsResponse = JSON.parseObject(mresult, SmsResponse.class);
            if (!smsResponse.getRespCode().equals("000000")){
                return "短信发送失败,请联系客服";
            }
            }catch (Exception e){
                e.printStackTrace();
                logger.error(e.getMessage());
                return "短信发送失败,请联系客服";
            }
        return random;
    }
}

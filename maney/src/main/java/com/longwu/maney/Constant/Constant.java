package com.longwu.maney.Constant;

public interface Constant {

    /**
     * Date & Time
     */
    public static final String DATE_yyyyMMddHHmmssSSS = "yyyyMMddHHmmssSSS";
    public static final String DATE_yyyyMMddHHmmss = "yyyyMMddHHmmss";
    public static final String DATE_yyyyMMddHHmm = "yyyyMMddHHmm";
    public static final String DATE_yyyyMMdd = "yyyyMMdd";
    public static final String DATE_yyyyMM = "yyyyMM";
    public static final String DATE_MMddHHmmss = "MMddHHmmss";
    public static final String DATE_HHmmss = "HHmmss";
    public static final String DATE_HHmm = "HHmm";
    public static final String DATE_HH = "HH";
    public static final String DATE_mm = "mm";
    public static final String DATE_yyyy_MM_dd = "yyyy-MM-dd";
    public static final String DATE_EEEEMMdd = "EEEE MM/dd";
    /**
     * 金额
     */
    public static final String AMT_DEFAULT = "0.00";
    public static final String AMT_FORMAT = "0.0000####";
    public static final String AMT_INT = "0";

    /**
     * 符号
     */
    public static final String STRING_STAR = "*";
    public static final String STRING_VERTICALLINE = "\\|";
    public static final String STRING_EQUAL = "=";
    public static final String STRING_AND = "&";
    public static final String STRING_SLASH = "/";
    public static final String STRING_COMMA = ",";
    public static final String STRING_DOT = ".";
    public static final String STRING_UNDERLINE = "_";
    public static final String STRING_LINE = "-";

    public static final String URL_SLASH = "://";
    public static final String URL_APPNAME = "/go";

    /**
     * 常用字符串
     */
    public static final String STRING_EMPTY = "";
    public static final String STRING_BLANK = " ";
    public static final String STRING_000 = "000";
    public static final String STRING_000000 = "000000";
    public static final String STRING_235959 = "235959";
    public static final String STRING_UNKNOWN = "UNKNOWN";
    public static final String STRING_TEMPLET = "TEMPLET";
    public static final String STRING_ALL = "ALL";
    public static final String STRING_SYSTEM = "system";

    /**
     * 数字
     */
    public static final String STRING_0 = "0";
    public static final String STRING_1 = "1";
    public static final String STRING_2 = "2";
    public static final String STRING_3 = "3";
    public static final String STRING_4 = "4";
    public static final String STRING_5 = "5";
    public static final String STRING_6 = "6";
    public static final String STRING_7 = "7";
    public static final String STRING_8 = "8";
    public static final String STRING_10 = "10";
    public static final String STRING_11 = "11";
    public static final String STRING_100 = "100";

    /**
     * ajax 返回
     */
    public static final int AJAX_CODE_SUCCESS = 200;
    public static final int AJAX_CODE_ERROR = 500;
    public static final int AJAX_TIME_OUT = 111;
    public static final int APP_UPDATE = 112;
    public static final int AJAX_DATABASE_ERROR = 805;
    public static final int AJAX_CODE_CREATED = 201;
    public static final int AJAX_OBJECT_INEXIST = 803;
    public static final int AJAX_TASK_CLOSED = 222;
    public static final String AJAX_STAT_OK = "OK";
    public static final String AJAX_STAT_FAIL = "FAIL";
    public static final String AJAX_MSG_SUCCESS = "SUCCESS";
    public static final String AJAX_MSG_FAIL = "FAIL";
    public static final String AJAX_MSG_ERROR = "ERROR";
    public static final String AJAX_MSG_RETRY = "RETRY";
    public static final String JH_ALERT_SYSTEM = "系统错误";
    /**
     * 短信参数
     */
    /**
     * 短信验证码服务
     */
    public static final String SMS_VERIFY_URL = ""; //短信验证码中心地址
    public static final String SMS_ID_TOKEN = ""; //短信账户密钥
    public static final String SMS_USER_ID = ""; //短信账户ID
    public static final String SMS_APP_ID = ""; //短信应用ID
    public static final String SMS_REG_TEMP = "10294"; //注册短信模版号
    public static final String SMS_PWD_TEMP = "15064"; //忘记密码短信模版号
    public static final String SMS_YUYUE_TEMP = "23555"; //预约通知商户短信模版号
    public static final String SMS_LONGWUHUI_TEMP = "25037"; //总部卡券商户短信模版号
    public static final String SMS_FREEYUYUE_TEMP = "28522"; //公众号免费预约商户短信模版号
    public static final String SMS_FREEYUYUE_SEND_USER_TEMP = "28718"; //公众号免费预约发送预约者短信模版号
    public static final String SMS_FREEYUYUE_DEFAULT_MOBLIE = "";//默认总部客服短信接收
    public static final String SMS_APPLY_GRADE_TEMP = "29773"; //申请段位报名成功发送短信模版号
    public static final String SMS_BUY_COACH_TEMP = "33165"; //私教购买成功向教练发送短信模版号
    public static final String SMS_BUY_MER_TEMP = "33235"; //私教购买成功向商户发送短信模版号
    public static final String SMS_BUY_USER_TEMP = "33236"; //私教购买成功向用户发送短信模版号

    /**
     * 系统
     */
    public static final String LOCAL_IP = "http://127.0.0.1:8080/maney";
    public static final String OAUTH2_URL = "/oauth/token";
    public static final String CLIENTID = "client";
    public static final String CLIENTSECRET = "maney";
    public static final String SESSION_NAME = "maneyCookie";
}

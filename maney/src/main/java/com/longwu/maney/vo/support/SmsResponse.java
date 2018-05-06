package com.longwu.maney.vo.support;

/**
 * 短信返回类
 * 
 */
public class SmsResponse {
    String respCode;
    String failure;
    String templateSMS;
    
    public String getRespCode() {
        return respCode;
    }
    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }
    public String getFailure() {
        return failure;
    }
    public void setFailure(String failure) {
        this.failure = failure;
    }
    public String getTemplateSMS() {
        return templateSMS;
    }
    public void setTemplateSMS(String templateSMS) {
        this.templateSMS = templateSMS;
    }
    
    @Override
    public String toString() {
        return "SmsResponse [respCode=" + respCode + ", failure=" + failure + ", templateSMS="
               + templateSMS + "]";
    }
}

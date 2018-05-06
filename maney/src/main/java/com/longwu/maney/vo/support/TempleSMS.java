package com.longwu.maney.vo.support;

/**
 * 短信模版类
 * 
 * @author leo.guo
 * @version $Id: TempleSMS.java, v 0.1 2015-7-23 下午1:49:16 leo.guo Exp $
 */
public class TempleSMS {
    
    String sid;
    String appId;
    String time;
    String sign;
    String to;
    String templateId;
    String param;
    
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	
	@Override
	public String toString() {
		return "TempleSMS [sid=" + sid + ", appId=" + appId + ", time=" + time + ", sign=" + sign + ", to=" + to
				+ ", templateId=" + templateId + ", param=" + param + "]";
	}
   
}

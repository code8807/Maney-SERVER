package com.longwu.maney.utils;

import com.longwu.maney.Constant.Constant;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期时间工具类
 */
public class DateUtils {

	public static final String COMMON_DATE_PATTERN = "yyyy-MM-dd";
	public static final String DATE_TIME_PATTERN = "yyyyMMddHHmmss";
	public static final String TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 获取N天前的日期
	 */
	public static LocalDate getBeforeDate(LocalDate curDate, int interval) {
		return curDate.minusDays(interval);
	}

	/**
	 * 获取N天后的日期
	 */
	public static LocalDate getAfterDate(LocalDate curDate, int interval) {
		return curDate.plusDays(interval);
	}

	/**
	 * 根据yyyyMMddHHmmss获取DateTime
	 */
	public static DateTime getDateTimeByString(String trdTime) {
		return DateTimeFormat.forPattern(Constant.DATE_yyyyMMddHHmmss).parseDateTime(trdTime);
	}

	/**
	 * 返回pattern格式的字符串
	 * 
	 * @param pattern
	 * @return
	 */
	public static String getStringForPattern(String pattern) {

		if (pattern == null) {
			return null;
		}
		Date date = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		return simpleDateFormat.format(date);
	}

	/**
	 * 由yyyyMMdd格式的字符串返回yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static String numberToDate(String string) throws ParseException {

		if (string == null)
			return null;

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME_PATTERN);
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(TIME_PATTERN);
		Date temp = (Date) simpleDateFormat.parse(string);
		return simpleDateFormat2.format(temp);
	}

	/**
	 * 由yyyy-MM-dd HH:mm:ss格式的字符串返回yyyyMMdd
	 * 
	 * @param date
	 * @return
	 */
	public static String revNumberToDate(String string) throws ParseException {

		if (string == null)
			return null;

		String first = string.replace("-", "");
		String second = first.replace(":", "");
		String third = second.replace(" ", "");
		return third.trim();
	}

	
	//获取当前时间
	public static String getDateAndTime(){
		DateTime date = new DateTime();
		return date.toString(DATE_TIME_PATTERN);
	}
	
	//获取当前时间日期
	public static String getDateYYYYMMDD(){
		DateTime date = new DateTime();
		return date.toString(DATE_TIME_PATTERN).substring(0, 8);
	}
	
	//YYYYMMDDHHMMSS 变成YYYY-MM-DD获取当前时间
	public static String getDate(String date1){
		String date = date1.substring(0,8);
		return date.substring(0,4)+"-"+date.substring(4, 6)+"-"+date.substring(6,8);
	}
		
	/*
     * 返回星期几
	 * @param  YYYYMMDD
	 * 
	 *@return 
	 */
	public static String getWeekOfDate(String date1) {
		String[] weekOfDays = {"日", "一", "二", "三", "四", "五", "六"}; 
		Date date = getDatebyYYYYMMDD(date1);
		Calendar calendar = Calendar.getInstance();      
	    if(date != null){        
	         calendar.setTime(date);      
	    }        
	    int w = calendar.get(Calendar.DAY_OF_WEEK) - 1;      
	    if (w < 0){        
	        w = 0;      
	    }      
	    return weekOfDays[w]; 
	}
	
	/*
     * 返回Date格式
	 * @param  YYYYMMDD
	 * 
	 *@return Date
	 */
	public static Date getDatebyYYYYMMDD(String time) {
		SimpleDateFormat bartDateFormat = 	new SimpleDateFormat("yyyyMMdd"); 

		Date date=null;
		try { 
		 date = bartDateFormat.parse(time); 
		}
		catch (Exception ex) { 
		  //System.out.println(ex.getMessage()); 
		} 
		return date;
	}

	/*
     * 返回Date格式
	 * @param  yyyy-MM-dd HH:mm:ss
	 *
	 *@return Date
	 */
	public static Date getDatebyYYYYMMDDHHMMSS(String time) {
		SimpleDateFormat bartDateFormat = 	new SimpleDateFormat("yyyyMMddHHmmss");

		Date date=null;
		try {
			date = bartDateFormat.parse(time);
		}
		catch (Exception ex) {
			//System.out.println(ex.getMessage());
		}
		return date;
	}
	
	public static String format(Date date, String format){
		SimpleDateFormat bartDateFormat = new SimpleDateFormat(format);
		return bartDateFormat.format(date);
	}
}

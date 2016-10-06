package com.elitedentalgroup.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *  DateTimeUtil is used to convert String to Date
 * @author chanpov
 *
 */
public class DateTimeUtils {
	
	public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

    /**
     * 
     * @param source
     * @param pattern
     * @return Date Object
     * @throws ParseException
     */
    public static Date fromString(String source, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(source);
    }

    /**
     * 
     * @param dateStr
     * @return Date Object
     */
    public static Date parseDateTime(String dateStr) {
        try {
            return DATE_TIME_FORMAT.parse(dateStr);
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * 
     * @param dateStr
     * @return Date Object
     */
    public static Date parseDate(String dateStr) {
        try {
            return DATE_FORMAT.parse(dateStr);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 
     * @param date
     * @return String
     */
    public static String formatDateTime(Date date) {
        if (date == null) {
            return "";
        } else {
            return DATE_TIME_FORMAT.format(date);
        }
    }

    /**
     * 
     * @param date
     * @return String
     */
    public static String formatDate(Date date) {
        if (date == null) {
            return "";
        } else {
            return DATE_FORMAT.format(date);
        }
    }
    
    /**
     * 
     * @param date
     * @return Long
     */
    public static Long getLongOfDate(Date date){
		String stringDateTime = formatDateTime(date);
		return Long.valueOf(stringDateTime.trim());
	}
}

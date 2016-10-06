package com.elitedentalgroup.util;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.RandomStringUtils;
/**
 * String Utility
 * @author seakleng
 *
 */
public abstract class StringUtils {
	
	
	/**
	 * Replaces String with Map
	 * 
	 * @param template 
	 * 	<br/> String content has {key}
	 * @param params
	 *  <br/> Map has pairs of keys and values to replace on the source String
	 * @return
	 */
	public static String raplaceWithMap( String template, Map< String, String > params ) {
		String replacedValue = template;
		
		Set<Entry<String,String>> entrySet = params.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String keyExpression = String.format("{%s}", entry.getKey());
			String value = entry.getValue();
			replacedValue = org.springframework.util.StringUtils.replace(
					replacedValue, keyExpression, value );
		}
		
		return replacedValue;
		
	}
	
	/**
	 * Generate random password as 8 digit
	 * @return
	 */
	public static String generateRandomCode(){
		return RandomStringUtils.randomAlphanumeric(8);
	}
	
	/**
	 * Convert savada@gmail.com to s*v*da@gmail.com
	 * @param rawText
	 * @return
	 */
	public static String makeStringPattern(String rawText) {
		char charAt0 = rawText.charAt(0);
		char charAt2 = rawText.charAt(2);
		String replaceText = String.format("%c*%c*", charAt0, charAt2);
		return replaceText.concat(rawText.substring(4));
	}
	
}

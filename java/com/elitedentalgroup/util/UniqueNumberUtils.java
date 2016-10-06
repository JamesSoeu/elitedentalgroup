package com.elitedentalgroup.util;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Utility to generate unique long value
 * @author seakleng
 *
 */
public abstract class UniqueNumberUtils {
	private static SimpleDateFormat dtFormatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	private static Long cacheGeneratedValue = 0L;
	
	/**
	 * Generate unique long value
	 * @return
	 */
	public synchronized static Long generate() {
		Long generatedValue = Long.parseLong(dtFormatter.format(new Date()));
		if(generatedValue.equals(cacheGeneratedValue)) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			generatedValue = generate();
		}
		
		cacheGeneratedValue = generatedValue;
		
		return generatedValue;
	}
	
	public synchronized static String generateAsString() { 
		return UniqueNumberUtils.generate().toString();
	}
}

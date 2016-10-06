package com.elitedentalgroup.util;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
/**
 * Utility to encode password using Sha
 * @see ShaPasswordEncoder
 * @author seakleng
 *
 */
public abstract class PasswordEncoder {
	public static final String PASSWORD_ENCODE_SALT = "LifeOn.PWD";
	
	private static ShaPasswordEncoder encoder = new ShaPasswordEncoder();
	
	public static String encode(String password) {
		return encoder.encodePassword(password, PASSWORD_ENCODE_SALT);
	}
	
	
	public static boolean match(String rawPassword, String encodePassword) {
		return encoder.encodePassword(rawPassword, PASSWORD_ENCODE_SALT).equals(encodePassword);
	}
}

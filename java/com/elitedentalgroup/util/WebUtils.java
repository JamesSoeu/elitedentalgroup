package com.elitedentalgroup.util;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Web utilities to get session from {@link HttpServletRequest}
 * @author seakleng
 *
 */
public abstract class WebUtils {
	public static final String USER_SESSION_ATTRIBUTE = "SPRING_SECURITY_CONTEXT";
	private final static Logger logger = LoggerFactory.getLogger(WebUtils.class);
	
	
	/**
	 * Get User from current session
	 * @return
	 * @throws ServletException
	 * @throws AuthenticationException 
	 */
	public static User getUserFromSession() {
		User user = null;
		
		try {
			SecurityContext context = SecurityContextHolder.getContext();
			Authentication authentication = context.getAuthentication();
			if(authentication != null && authentication.isAuthenticated()) {
				Object principal = authentication.getPrincipal();
				
				if(principal instanceof User){
					user = (User) principal;
					if(user != null && user.getUsername() == null) {
						user = null;
					}
				}
				
			}
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		
		return user;
    }
	
	/**
	 * Get servlet request from {@link RequestContextHolder}
	 * @return
	 */
	public static HttpServletRequest getHoldServletRequest() {
        ServletRequestAttributes requestServletRequestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        
        return requestServletRequestAttributes != null ? 
        		requestServletRequestAttributes.getRequest() : null;
    }
	
	/**
	 * Get request path without context root
	 * @param request
	 * @return
	 */
	public static String getRequestPath(HttpServletRequest request) {
		return request.getRequestURI().replaceFirst(request.getContextPath(), "");
	}
	
}

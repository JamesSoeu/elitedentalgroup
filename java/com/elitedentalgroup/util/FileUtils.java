package com.elitedentalgroup.util;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletContext;

import org.apache.commons.io.FilenameUtils;

public class FileUtils {

	private static final String THUMNAIL = "thumnail";

	/**
	 * 
	 * @param path
	 */
	public static void checkFolder(String path) {
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	/**
	 * 
	 * @return
	 */
	public static String getFolderRelativePath() {
		String result = "";
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		result = File.separator + "upload" + File.separator + year + File.separator + month + File.separator + day;
		return result;
	}

	public static String getFolderRelativePathForBrower() {
		String result = "";
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		result = "upload/" + year + "/" + month + "/" + day;
		return result;
	}

	/**
	 * 
	 * @return
	 */
	public static String getThumnailFolderRelativePath() {
		return getFolderRelativePath() + FileUtils.THUMNAIL + File.separator;
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getFileExtension(String fileName) {
		String[] parts = fileName.split("\\.");
		return parts[1];
	}

	/**
	 * 
	 * @param contentType
	 * @return
	 */
	public static String getTypeOfFile(String contentType) {
		String[] parts = contentType.split("/");
		return parts[0];
	}

	/**
	 * 
	 * @param relativePath
	 * @return
	 */
	public static String getConvertPathBackToforwardslash(String relativePath) {
		return relativePath.replace("\\", "/");
	}

	/**
	 * 
	 * @param fileName
	 * @param context
	 * @return
	 */
	public static String getFileTypeFromMineType(String fileName, ServletContext context) {

		String filename = FilenameUtils.getName(fileName);
		String contentType = context.getMimeType(filename);
		String[] parts = contentType.split("/");
		return parts[0];
	}
}

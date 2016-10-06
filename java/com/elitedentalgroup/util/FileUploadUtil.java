package com.elitedentalgroup.util;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {

	public static String upload(MultipartFile mpf) throws IllegalStateException, IOException {

		String workspacePath = System.getProperty("project.home");

		String relativePath = FileUtils.getFolderRelativePath();
		String fullPath = workspacePath + File.separator + relativePath;
		FileUtils.checkFolder(fullPath);

		String OriginalfileName = mpf.getOriginalFilename();
		mpf.transferTo(new File(fullPath + File.separator + OriginalfileName));
		String fileUploadedPath = relativePath + File.separator + OriginalfileName;
		return fileUploadedPath;

	}
	
	public static Boolean delete(String filePath){
		String workspacePath = System.getProperty("project.home");
		filePath = workspacePath +filePath;
		File file = new File(filePath);
		if (file.isFile()){
			return file.delete();
		}
		
		return false;
	}

}

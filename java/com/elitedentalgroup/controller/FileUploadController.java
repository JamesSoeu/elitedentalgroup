package com.elitedentalgroup.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.elitedentalgroup.util.FileUtils;
import com.elitedentalgroup.util.UniqueNumberUtils;
import com.mysql.jdbc.Field;

@Controller
@RequestMapping("/api/upload")
public class FileUploadController {

	@RequestMapping(value = "/file", method = RequestMethod.POST)
	public @ResponseBody String uploadFile(MultipartHttpServletRequest request, HttpServletResponse response)
			throws IllegalStateException, IOException, AuthenticationException, ServletException {

		String workspacePath = System.getProperty("project.home");

		String relativePath = FileUtils.getFolderRelativePath();
		String fullPath = workspacePath + File.separator + relativePath;
		FileUtils.checkFolder(fullPath);

		Iterator<String> itr = request.getFileNames();
		String fileExtension = "png";
		String OriginalfileName = UniqueNumberUtils.generateAsString();
		while (itr.hasNext()) {
			MultipartFile mpf = request.getFile(itr.next());
			OriginalfileName = mpf.getOriginalFilename();
			/* fileExtension = FilenameUtils.getExtension(OriginalfileName); */

			mpf.transferTo(new File(fullPath + File.separator + OriginalfileName));
		}

		String uri = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/"
				+ request.getContextPath() + "/" + FileUtils.getFolderRelativePathForBrower() + "/" + OriginalfileName;
		String funcNum = request.getParameter("CKEditorFuncNum");
		String message = "The uploaded file has been renamed";
		return "<script type='text/javascript'>window.parent.CKEDITOR.tools.callFunction(" + funcNum + ", '" + uri
				+ "','" + message + "');</script>";

	}

}

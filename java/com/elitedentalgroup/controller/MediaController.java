package com.elitedentalgroup.controller;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.service.api.IMediaService;
import com.elitedentalgroup.util.UniqueNumberUtils;

@RestController
@RequestMapping("/media")
public class MediaController {

	@Autowired
	IMediaService mediaService;
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String addNew(MultipartHttpServletRequest request, HttpServletResponse response){
		MediaDTO media = new MediaDTO();
		media.setCreatedDate(new Date());
		String mediaId = UniqueNumberUtils.generateAsString();
		media.setMediaId(mediaId);
		mediaService.insert(media);
		return mediaId;
	}
}

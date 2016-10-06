package com.elitedentalgroup.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.dto.RequestServiceDTO;
import com.elitedentalgroup.dto.ServiceDTO;
import com.elitedentalgroup.service.api.IMediaService;
import com.elitedentalgroup.service.api.IServiceService;
import com.elitedentalgroup.util.FileUploadUtil;
import com.elitedentalgroup.util.MediaTypeEnum;
import com.elitedentalgroup.util.UniqueNumberUtils;

@Controller
@RequestMapping("/api/service")
public class ServiceController {

	@Autowired
	IServiceService serviceService;

	@Autowired
	IMediaService mediaService;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Boolean addNew(@ModelAttribute RequestServiceDTO serviceDto, HttpServletRequest request) throws IllegalStateException, IOException {
		Boolean result = false;
		String serviceId = UniqueNumberUtils.generateAsString();
		
		serviceDto.setServiceId(serviceId);
		serviceDto.setCreatedDate(new Date());
		 
		result = serviceService.insert(serviceDto);
		if ( result ){
			if ( serviceDto.getFile()!= null){
				MediaDTO media = new MediaDTO();
				String uploadedPath = FileUploadUtil.upload(serviceDto.getFile());
				media.setPath(uploadedPath);
				media.setCreatedDate(new Date());
				media.setMediaId(UniqueNumberUtils.generateAsString());
				media.setMediaType(MediaTypeEnum.IMAGE);
				
				media.setService(serviceDto);
				result = mediaService.insert(media);
			}
		}
		
		return result;

	}
	
	@RequestMapping (value="/update", method = RequestMethod.POST)
	public @ResponseBody Boolean update( @ModelAttribute RequestServiceDTO serviceDto, @RequestParam(value="mediaId", required=false) String mediaId, HttpServletRequest request) throws IllegalStateException, IOException {
		Boolean result = false;
		result = serviceService.update(serviceDto);
		if ( result ){
			if ( serviceDto.getFile() != null ){
				// remove old media because this cases one server, one media
				if (mediaService.delete(mediaId)){
					MediaDTO media = new MediaDTO();
					String uploadedPath = FileUploadUtil.upload(serviceDto.getFile());
					media.setPath(uploadedPath);
					media.setCreatedDate(new Date());
					media.setMediaId(UniqueNumberUtils.generateAsString());
					media.setMediaType(MediaTypeEnum.IMAGE);
					
					media.setService(serviceDto);
					result = mediaService.insert(media);
				}
			}
		}
		
		return result;
		
	}
	
	@RequestMapping( value = "/delete/{serviceId}" )
	public  String deleteService ( @PathVariable String serviceId){
		Boolean deleted = serviceService.delete(serviceId);
		return "serviceList";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<MediaDTO> getMediaServiceList() {
		return serviceService.getMediaServiceDtoList();
	}

	@RequestMapping(value = "/{serviceId}", method = RequestMethod.GET)
	public @ResponseBody ServiceDTO getServiceById(@PathVariable String serviceId) {
		return serviceService.getServiceDtoById(serviceId);
	}
	

	@RequestMapping(value ="/media-service/{serviceId}", method = RequestMethod.GET)
	public @ResponseBody MediaDTO getMediaSerivce(@PathVariable String serviceId) {
		return serviceService.getMediaServiceDtoById(serviceId);
	}
	
	
}

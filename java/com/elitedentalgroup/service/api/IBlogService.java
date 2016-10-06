package com.elitedentalgroup.service.api;

import java.util.List;

import com.elitedentalgroup.dto.BlogDTO;
import com.elitedentalgroup.dto.MediaDTO;

/**
 * 
 * @author Elite Dental Group
 *
 */
public interface IBlogService {

	Boolean insert(BlogDTO blog);

	Boolean update(BlogDTO blog);

	Boolean delete(String blogId);

	BlogDTO getBlogById(String blogId);

	List<MediaDTO> getMediaBlogList();
	
	MediaDTO getMediaBlogById(String blogId);
}

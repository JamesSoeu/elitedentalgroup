package com.elitedentalgroup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.BlogDTO;
import com.elitedentalgroup.dto.MediaDTO;

@Repository
public interface BlogDAO {

	Boolean insert(BlogDTO blog);

	Boolean update(BlogDTO blog);

	Boolean delete(String blogId);

	BlogDTO getBlogById(String blogId);

	List<MediaDTO> getMediaBlogList();
	
	MediaDTO getMediaBlogById(String blogId);
}

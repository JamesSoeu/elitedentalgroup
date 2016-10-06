package com.elitedentalgroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitedentalgroup.dao.BlogDAO;
import com.elitedentalgroup.dto.BlogDTO;
import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.service.api.IBlogService;

/**
 * 
 * @author Elite Dental Group
 *
 */
@Service
public class BlogServiceImpl implements IBlogService {

	@Autowired
	private BlogDAO blogDao;

	public Boolean insert(BlogDTO blog) {
		return blogDao.insert(blog);
	}

	public Boolean update(BlogDTO blog) {
		return blogDao.update(blog);
	}

	@Override
	public Boolean delete(String blogId) {
		return blogDao.delete(blogId);
	}

	@Override
	public BlogDTO getBlogById(String blogId) {
		return blogDao.getBlogById(blogId);
	}

	@Override
	public List<MediaDTO> getMediaBlogList() {
		return blogDao.getMediaBlogList();
	}

	@Override
	public MediaDTO getMediaBlogById(String blogId) {
		return blogDao.getMediaBlogById(blogId);
	}

}

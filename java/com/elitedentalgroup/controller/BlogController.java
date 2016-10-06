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

import com.elitedentalgroup.dto.AuthorDTO;
import com.elitedentalgroup.dto.BlogDTO;
import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.dto.RequestBlogDTO;
import com.elitedentalgroup.dto.RequestServiceDTO;
import com.elitedentalgroup.service.api.IAuthorService;
import com.elitedentalgroup.service.api.IBlogService;
import com.elitedentalgroup.service.api.IMediaService;
import com.elitedentalgroup.util.FileUploadUtil;
import com.elitedentalgroup.util.MediaTypeEnum;
import com.elitedentalgroup.util.UniqueNumberUtils;

@Controller
@RequestMapping("/api/blog")
public class BlogController {

	@Autowired
	IBlogService blogService;

	@Autowired
	IAuthorService authorService;

	@Autowired
	IMediaService mediaService;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Boolean addNew(@ModelAttribute RequestBlogDTO blog) throws IllegalStateException, IOException {
		Boolean result = false;
		blog.setBlogId(UniqueNumberUtils.generateAsString());
		blog.setCreatedDate(new Date());
		AuthorDTO author = new AuthorDTO();
		author.setAuthorId("AUT002");
		blog.setAuthorDto(author);
		result = blogService.insert(blog);
		if (result) {

			String uploadedPath = FileUploadUtil.upload(blog.getFile());

			MediaDTO media = new MediaDTO();
			media.setCreatedDate(new Date());
			media.setMediaId(UniqueNumberUtils.generateAsString());
			media.setPath(uploadedPath);
			media.setMediaType(MediaTypeEnum.IMAGE);
			media.setBlog(blog);
			result = mediaService.insert(media);
		}

		return result;

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody Boolean update(@ModelAttribute RequestBlogDTO blog,
			@RequestParam(value = "mediaId", required = false) String mediaId, HttpServletRequest request)
			throws IllegalStateException, IOException {
		Boolean result = false;
		result = blogService.update(blog);
		if (result) {
			if (blog.getFile() != null) {

				// remove old media because this cases one server, one media
				if (mediaService.getMediaById(mediaId) != null) {
					mediaService.delete(mediaId);
					FileUploadUtil.delete(request.getParameter("mediaOldPath"));
				}
				MediaDTO media = new MediaDTO();
				String uploadedPath = FileUploadUtil.upload(blog.getFile());
				media.setPath(uploadedPath);
				media.setCreatedDate(new Date());
				media.setMediaId(UniqueNumberUtils.generateAsString());
				media.setMediaType(MediaTypeEnum.IMAGE);

				media.setBlog(blog);
				result = mediaService.insert(media);
			}
		}

		return result;

	}

	@RequestMapping(value = "/{blogId}", method = RequestMethod.GET)
	public @ResponseBody BlogDTO getBlogById(@PathVariable String blogId) {
		return blogService.getBlogById(blogId);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<MediaDTO> getBlogList() {
		return blogService.getMediaBlogList();
	}

	@RequestMapping(value = "/blogMedia/{blogId}", method = RequestMethod.GET)
	public @ResponseBody MediaDTO getBlogMediaById(@PathVariable String blogId) {
		return blogService.getMediaBlogById(blogId);
	}

	@RequestMapping(value = "/delete/{blogId}")
	public String deleteBlog(@PathVariable String blogId) {
		Boolean deleted = blogService.delete(blogId);
		return "blogList";
	}

	@RequestMapping(value = "/author/{authorId}", method = RequestMethod.GET)
	public @ResponseBody AuthorDTO getAuthorById(@PathVariable String authorId) {
		return authorService.getAuthorById(authorId);
	}
}

package com.elitedentalgroup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elitedentalgroup.dao.MediaDAO;
import com.elitedentalgroup.dto.MediaDTO;
import com.elitedentalgroup.service.api.IMediaService;

/**
 * 
 * @author Elite Dental Group
 *
 */
@Service
public class MediaServiceImpl implements IMediaService {

	@Autowired
	MediaDAO mediaDao;
	
	@Override
	public Boolean insert(MediaDTO media) {
		return mediaDao.insert(media);
	}

	@Override
	public Boolean update(MediaDTO media) {
		return mediaDao.update(media);
	}

	@Override
	public Boolean delete(String mediaId) {
		return mediaDao.delete(mediaId);
	}

	@Override
	public MediaDTO getMediaById(String mediaId) {
		return mediaDao.getMediaById(mediaId);
	}

	@Override
	public List<MediaDTO> getMediaList() {
		return mediaDao.getMediaList();
	}

}

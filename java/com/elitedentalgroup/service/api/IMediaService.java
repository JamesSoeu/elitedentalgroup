package com.elitedentalgroup.service.api;

import java.util.List;

import com.elitedentalgroup.dto.MediaDTO;

/**
 * 
 * @media Elite Dental Group
 *
 */
public interface IMediaService {

	Boolean insert(MediaDTO media);

	Boolean update(MediaDTO media);

	Boolean delete(String mediaId);

	MediaDTO getMediaById(String mediaId);

	List<MediaDTO> getMediaList();
}

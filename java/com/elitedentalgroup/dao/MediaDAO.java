package com.elitedentalgroup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.elitedentalgroup.dto.MediaDTO;

/**
 * 
 * @author Elite Dental Group
 *
 */
@Repository
public interface MediaDAO {

	Boolean insert(MediaDTO media);

	Boolean update(MediaDTO media);

	Boolean delete(String mediaId);

	MediaDTO getMediaById(String mediaId);

	List<MediaDTO> getMediaList();
}

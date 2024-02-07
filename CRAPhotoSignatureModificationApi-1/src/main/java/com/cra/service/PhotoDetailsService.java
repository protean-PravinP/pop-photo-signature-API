package com.cra.service;

import com.cra.Dto.PhotoAndSignatureUpdateDto;
import com.cra.model.PhotoDetails;

public interface PhotoDetailsService {

	PhotoDetails getPhotoDetailsByPran(Long Pran);
	
	PhotoDetails save(PhotoAndSignatureUpdateDto PhotoAndSignatureUpdateDto);
	
	
}

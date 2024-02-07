package com.cra.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cra.Dto.PhotoAndSignatureUpdateDto;
import com.cra.model.PhotoDetails;
import com.cra.repositories.PhotoDetailsRepository;
import com.cra.service.PhotoDetailsService;

@Service
public class PhotoDetailsServiceImpl implements PhotoDetailsService {
	
	@Autowired
	PhotoDetailsRepository photoDetailsRepo;

	@Override
	public PhotoDetails save(PhotoAndSignatureUpdateDto PhotoAndSignatureUpdateDto) {
		// TODO Auto-generated method stub
		
		
		PhotoDetails photoDetails = new  PhotoDetails();
		photoDetails.setPrn(null);
		photoDetails.setAckId(null);
		photoDetails.setPran(null);
		photoDetails.setPhoto(null);
		photoDetails.setChgReason(null);
		photoDetails.setCrtdBy(null);
		photoDetails.setCrtdTmstmp(null);
		photoDetails.setMdfdBy(null);
		photoDetails.setMdfdTmstmp(null);
		
		// save call of photo save
		
		return null;
	}

	@Override
	public PhotoDetails getPhotoDetailsByPran(Long Pran) {
		// TODO Auto-generated method stub
		return photoDetailsRepo.findByPran(Pran);
	}

	
	
}

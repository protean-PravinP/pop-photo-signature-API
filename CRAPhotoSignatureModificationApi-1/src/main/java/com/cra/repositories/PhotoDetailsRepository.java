package com.cra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cra.model.PhotoDetails;

@Repository
public interface PhotoDetailsRepository extends JpaRepository<PhotoDetails,Long>{
	
	PhotoDetails findByPran(Long pran);

}

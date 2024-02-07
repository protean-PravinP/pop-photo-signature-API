package com.cra.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cra.Dto.PhotoAndSignatureUpdateDto;
import com.cra.service.PhotoAndSignatureUpdateService;
import com.cra.service.PhotoDetailsAuditService;
import com.cra.service.PhotoDetailsService;
import com.cra.service.SingnatureDetailsAuditService;
import com.cra.service.SingnatureDetailsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;


@Service 
public class PhotoAndSignatureUpdateServiceImpl implements PhotoAndSignatureUpdateService{

	
	@Autowired
	PhotoDetailsService PhotoDetailsService;
	
	@Autowired
	PhotoDetailsAuditService PhotoDetailsAuditService;
	
	@Autowired
	SingnatureDetailsService SingnatureDetailsService;
	
	@Autowired
	SingnatureDetailsAuditService SingnatureDetailsAuditService;
	
    @PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public String updatePhotoAndSignature(String requestJsonString) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			PhotoAndSignatureUpdateDto photoAndSignatureUpdateDto = mapper.readValue(requestJsonString, PhotoAndSignatureUpdateDto.class);
			
			
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String findUserById(String userId) {
		
		return isUserExist(userId).toString();
		
	}
	
	public List<Object[]> isUserExist(String userId ) {
        Query query = entityManager.createNativeQuery("SELECT * FROM SEC.SEC_USER WHERE SU_USR_ID_PK = '"+ userId +"'" );
       
        // Execute the select query
        List<Object[]> resultList = query.getResultList();
        

        Arrays.stream(resultList.get(0)).forEach(System.out::println);
        return resultList;
    }
	

}

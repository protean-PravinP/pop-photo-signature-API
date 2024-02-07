package com.cra.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cra.service.PhotoAndSignatureUpdateService;
import com.cra.util.Utilitites;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Log4j2
@RestController
@RequestMapping("/api/v1/pop")
public class PhotoAndSignatureUpdateController {

	
	@Autowired
	PhotoAndSignatureUpdateService photoAndSignatureUpdateService;
	
	
	//PhotoAndSignature change
	
	@PostMapping(value = "/PhotoAndSignature", produces = "application/json")
	public String photoAndSignatureChange(@RequestBody String requestJsonString, @RequestHeader Map<String, String> HEADER_DATA, HttpServletRequest request) {
		//log.info("");
		
		if(Utilitites.isValidRequest(requestJsonString)) {
			
			// Json parser 
			photoAndSignatureUpdateService.updatePhotoAndSignature(requestJsonString);
			
			
		}else {
			
		}
		
		
		
		return null;
	}
	
	@GetMapping("/POP")
	public String appCheck() {
		
		return  photoAndSignatureUpdateService.findUserById();
	}
	
}


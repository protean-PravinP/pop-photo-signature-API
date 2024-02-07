package com.cra.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhotoSignatureDtls {
	
	   @JsonProperty("Photo") 
	    public String photo;
	    @JsonProperty("Signature") 
	    public String signature;
	    @JsonProperty("DocumentProof") 
	    public String documentProof;
	    @JsonProperty("IdentityProof") 
	    public String identityProof;
	    @JsonProperty("IdentityProofDocNumber") 
	    public String identityProofDocNumber;
	    @JsonProperty("IdentityProofDocName") 
	    public String identityProofDocName;

}

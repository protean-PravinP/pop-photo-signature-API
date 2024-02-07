package com.cra.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitialDtls {
	
	@JsonProperty("Pran") 
    public String pran;
    @JsonProperty("RequestTypeFlag") 
    public String requestTypeFlag;
    @JsonProperty("ReceiptNo") 
    public String receiptNo;

}

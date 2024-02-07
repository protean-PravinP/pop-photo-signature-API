package com.cra.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Embeddable
public class SignatureDetailsId implements Serializable {
	private static final long serialVersionUID = 1L;
	public Long prn;
	public Long pran;
    // Getters, setters, equals, and hashCode methods
}

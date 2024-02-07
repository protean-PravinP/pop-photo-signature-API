package com.cra.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SUB_PHO_DTL_AUD", schema="SUB")
public class PhotoDetailsAudit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2089204498064939240L;
	
	@Id
	@Column(name = "SPD_AUD_PRN")
	private Long prn;	
	
	@Column(name = "SPD_AUD_ACK")
	private Long ackId;	
	
	@Column(name = "SPD_AUD_PRAN")
	private Long pran;	
	
	@Column(name = "SPD_AUD_CHNG_REASON")
	private String changeReason;	
	
	@Column(name = "SPD_AUD_PHOTO")
	private String photo;	
	
	@Column(name = "SPD_AUD_CRTD_BY")
	private String crtdBy;	
	
	@Column(name = "SPD_AUD_CRTD_TMSTMP")
	private Date crtdTmstmp;
	
	@Column(name = "SPD_AUD_MODI_BY")
	private String mdfBy;	
	
	@Column(name = "SPD_AUD_MODI_TMSTMP")
	private Date mdfTmstmp;

	public Long getPrn() {
		return prn;
	}

	public void setPrn(Long prn) {
		this.prn = prn;
	}

	public Long getAckId() {
		return ackId;
	}

	public void setAckId(Long ackId) {
		this.ackId = ackId;
	}

	public Long getPran() {
		return pran;
	}

	public void setPran(Long pran) {
		this.pran = pran;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCrtdBy() {
		return crtdBy;
	}

	public void setCrtdBy(String crtdBy) {
		this.crtdBy = crtdBy;
	}

	public Date getCrtdTmstmp() {
		return crtdTmstmp;
	}

	public void setCrtdTmstmp(Date crtdTmstmp) {
		this.crtdTmstmp = crtdTmstmp;
	}

	public String getMdfBy() {
		return mdfBy;
	}

	public void setMdfBy(String mdfBy) {
		this.mdfBy = mdfBy;
	}

	public Date getMdfTmstmp() {
		return mdfTmstmp;
	}

	public void setMdfTmstmp(Date mdfTmstmp) {
		this.mdfTmstmp = mdfTmstmp;
	}	
	
}

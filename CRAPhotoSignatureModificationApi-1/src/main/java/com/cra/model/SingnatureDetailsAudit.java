package com.cra.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SUB_SIG_DTL_AUD", schema="SUB")
public class SingnatureDetailsAudit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8589610842015994555L;
	
	@Id
	@Column(name = "SSD_AUD_PRN")
	private Long prn;	
	
	@Column(name = "SSD_AUD_ACK")
	private Long ackId;	
	
	@Column(name = "SSD_AUD_PRAN")
	private Long pran;
	
	@Column(name = "SSD_AUD_CHNG_REASON")
	private String changeReason;
	
	@Column(name = "SSD_AUD_SIG")
	private String sig;
	
	@Column(name = "SSD_AUD_CRTD_BY")
	private String crtdBy;
	
	@Column(name = "SSD_AUD_CRTD_TMSTMP")
	private Date crtdTmstmp;
	
	@Column(name = "SSD_AUD_MODI_BY")
	private String mdfBy;	
	
	@Column(name = "SSD_AUD_MODI_TMSTMP")
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

	public String getSig() {
		return sig;
	}

	public void setSig(String sig) {
		this.sig = sig;
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

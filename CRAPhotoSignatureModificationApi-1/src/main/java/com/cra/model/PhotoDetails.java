package com.cra.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Builder;

@Builder
@Entity
@Table(name="SUB_PHO_DTL",schema="SUB")
public class PhotoDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "SPD_PRN", nullable=false, length = 8)
	private Long prn;
	
	@Column(name = "SPD_ACK", nullable=false)
	private Long ackId;
	
	@Id
	@Column(name = "SPD_PRAN", nullable=false)
	private Long pran;
	
	@Column(name = "SPD_CHNG_REASON", nullable=true, length = 100)
	private String chgReason ;
	
	@Column(name = "SPD_PHOTO", nullable=false, length = 25000)
	private String photo;
	
	@Column(name = "SPD_CRTD_BY", nullable=false, length = 12)
	private String crtdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPD_CRTD_TMSTMP", nullable=false)
	private Date crtdTmstmp;
	
	@Column(name = "SPD_MODI_BY", nullable=true, length = 12)
	private String mdfdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPD_MODI_TMSTMP", nullable=true)
	private Date mdfdTmstmp = null;

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

	public String getChgReason() {
		return chgReason;
	}

	public void setChgReason(String chgReason) {
		this.chgReason = chgReason;
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

	public String getMdfdBy() {
		return mdfdBy;
	}

	public void setMdfdBy(String mdfdBy) {
		this.mdfdBy = mdfdBy;
	}

	public Date getMdfdTmstmp() {
		return mdfdTmstmp;
	}

	public void setMdfdTmstmp(Date mdfdTmstmp) {
		this.mdfdTmstmp = mdfdTmstmp;
	}
	
	
}

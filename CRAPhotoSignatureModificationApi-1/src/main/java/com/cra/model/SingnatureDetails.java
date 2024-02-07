package com.cra.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@IdClass(SignatureDetailsId.class)
@Table(name="SUB_SIG_DTL",schema="SUB")
public class SingnatureDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1810475166642324136L;

	@Id
	@Column(name = "SSD_PRN", nullable=false, length = 8)
	public Long prn;
	
	@Column(name = "SSD_ACK", nullable=false, length = 8)
	public Long ackId;
	
	@Id
	@Column(name = "SSD_PRAN", nullable=false, length = 8)
	public Long pran;
	
	@Column(name = "SSD_SIG", nullable=false, length = 25000)
	public String sign;
	
	@Column(name = "SSD_CHNG_REASON", nullable=true, length = 100)
	public String chgReason;
	
	@Column(name = "SSD_CRTD_BY", nullable=false, length = 12)
	public String crtdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SSD_CRTD_TMSTMP", nullable=false, length = 10)
	public Date crtdTmstmp;
	
	@Column(name = "SSD_MODI_BY", nullable=true, length = 12)
	public String mdfdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SSD_MODI_TMSTMP", nullable=true, length = 10)
	public Date mdfdTmstmp;

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

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getChgReason() {
		return chgReason;
	}

	public void setChgReason(String chgReason) {
		this.chgReason = chgReason;
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

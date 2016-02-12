/*
 * Project : TWB
 * Copyright (C) 2016 BP Oil UK Ltd.
 * BP PROPRIETARY/CONFIDENTIAL
 */
package com.it.bp.dps.domain.entity;	//NOPMD

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.it.bp.dps.domain.entity.base.BaseTableListener;

/**
 * A table that deals with Audit Transaction Entries.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "NGAUT_AUDIT_TRANSACTION")
@EntityListeners(BaseTableListener.class)
public class NgautAuditTransactionDBO implements Serializable {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NGAUT_PK")
	private Integer ngautPk;

	@Column(name = "TRANSACTION_TIME")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date transactionTime;
	
	@Column(name = "USER_SCUSR_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer userScusrFk;
	
	@Column(name = "REGION_RDREG_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer regionRdregFk;

	public Integer getNgautPk() {
		return ngautPk;
	}

	public void setNgautPk(Integer ngautPk) {
		this.ngautPk = ngautPk;
	}

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	public Integer getUserScusrFk() {
		return userScusrFk;
	}

	public void setUserScusrFk(Integer userScusrFk) {
		this.userScusrFk = userScusrFk;
	}

	public Integer getRegionRdregFk() {
		return regionRdregFk;
	}

	public void setRegionRdregFk(Integer regionRdregFk) {
		this.regionRdregFk = regionRdregFk;
	}
	
	
}
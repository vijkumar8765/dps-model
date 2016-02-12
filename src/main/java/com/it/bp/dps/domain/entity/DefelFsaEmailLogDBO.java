/*
 * Project : TWB
 * Copyright (C) 2016 BP Oil UK Ltd.
 * BP PROPRIETARY/CONFIDENTIAL
 */
package com.it.bp.dps.domain.entity;	//NOPMD

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.it.bp.dps.domain.entity.base.BaseTable;
import com.it.bp.dps.domain.entity.base.BaseTableAware;
import com.it.bp.dps.domain.entity.base.BaseTableListener;

/**
 * A table that deals with Audit Transaction Entries.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEFEL_FSA_EMAIL_LOG")
@EntityListeners(BaseTableListener.class)
public class DefelFsaEmailLogDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEFEL_PK")
	private Integer defelPk;

	@Column(name = "DEAL_REFERENCE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String dealReference;
	
	@Column(name = "EMAIL_STATUS_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer emailStatusRdcodFk;

	@Embedded
	private BaseTable baseTable;
	
	public BaseTable getBaseTable() {
		if (baseTable == null) {
			baseTable = new BaseTable();
		}
		return baseTable;
	}

	public void setBaseTable(BaseTable baseTable) {
		this.baseTable = baseTable;
	}

	public Integer getDefelPk() {
		return defelPk;
	}

	public void setDefelPk(Integer defelPk) {
		this.defelPk = defelPk;
	}

	public String getDealReference() {
		return dealReference;
	}

	public void setDealReference(String dealReference) {
		this.dealReference = dealReference;
	}

	public Integer getEmailStatusRdcodFk() {
		return emailStatusRdcodFk;
	}

	public void setEmailStatusRdcodFk(Integer emailStatusRdcodFk) {
		this.emailStatusRdcodFk = emailStatusRdcodFk;
	}	
}
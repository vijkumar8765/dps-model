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
 * A table that deals with Deal Chains.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DECHA_CHAIN")
@EntityListeners(BaseTableListener.class)
public class DechaChainDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
		
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DECHA_PK")
	private Integer dechaPk;

	@Column(name = "CHAIN_PREFIX_RDCHP_FK")
	@NotNull
	private Integer chainPrefixRdchpFk;
	
	@Column(name = "CHAIN_NUMBER")
	@NotNull
	private Integer chainNumber;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
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

	public Integer getDechaPk() {
		return dechaPk;
	}

	public void setDechaPk(Integer dechaPk) {
		this.dechaPk = dechaPk;
	}

	public Integer getChainPrefixRdchpFk() {
		return chainPrefixRdchpFk;
	}

	public void setChainPrefixRdchpFk(Integer chainPrefixRdchpFk) {
		this.chainPrefixRdchpFk = chainPrefixRdchpFk;
	}

	public Integer getChainNumber() {
		return chainNumber;
	}

	public void setChainNumber(Integer chainNumber) {
		this.chainNumber = chainNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
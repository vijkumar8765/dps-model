/*
 * Project : TWB
 * Copyright (C) 2016 BP Oil UK Ltd.
 * BP PROPRIETARY/CONFIDENTIAL
 */
package com.it.bp.dps.domain.entity;	//NOPMD

import java.io.Serializable;
import java.math.BigDecimal;

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
 * A table that deals with Deal Chain Details.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DECHN_CHAIN_DETAILS")
@EntityListeners(BaseTableListener.class)
public class DechnChainDetailsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DECHN_PK")
	private Integer dechnPk;

	@Column(name = "PERCENTAGE")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal percentage;
	
	@Column(name = "HOUSE_DEAL_TYPE")
	@Basic(fetch = FetchType.EAGER)
	private String houseDealType;
	
	@Column(name = "CHAIN_DECHA_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer chainDechaFk;
	
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

	public Integer getDechnPk() {
		return dechnPk;
	}

	public void setDechnPk(Integer dechnPk) {
		this.dechnPk = dechnPk;
	}

	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

	public String getHouseDealType() {
		return houseDealType;
	}

	public void setHouseDealType(String houseDealType) {
		this.houseDealType = houseDealType;
	}

	public Integer getChainDechaFk() {
		return chainDechaFk;
	}

	public void setChainDechaFk(Integer chainDechaFk) {
		this.chainDechaFk = chainDechaFk;
	}

}
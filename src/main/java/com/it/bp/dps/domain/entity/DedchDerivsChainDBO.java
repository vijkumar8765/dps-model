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
 * A table that deals with Deal Chain Details.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEDCH_DERIVS_CHAIN")
@EntityListeners(BaseTableListener.class)
public class DedchDerivsChainDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEDCH_PK")
	private Integer dedchPk;

	@Column(name = "DERIVS_DEAL_DEDER_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer derivsDealDederFk;
	
	@Column(name = "CHAIN_DECHN_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer chainDechnFk;
	
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

	public Integer getDedchPk() {
		return dedchPk;
	}

	public void setDedchPk(Integer dedchPk) {
		this.dedchPk = dedchPk;
	}

	public Integer getDerivsDealDederFk() {
		return derivsDealDederFk;
	}

	public void setDerivsDealDederFk(Integer derivsDealDederFk) {
		this.derivsDealDederFk = derivsDealDederFk;
	}

	public Integer getChainDechnFk() {
		return chainDechnFk;
	}

	public void setChainDechnFk(Integer chainDechnFk) {
		this.chainDechnFk = chainDechnFk;
	}
}
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
 * A table that deals with Deal Relations.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEDRE_DEAL_RELATIONS")
@EntityListeners(BaseTableListener.class)
public class DedreDealRelationsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEDRE_PK")
	private Integer dedrePk;

	@Column(name = "DEAL_A_DEDEL_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer dealADedelFk;
	
	@Column(name = "DEAL_B_DEDEL_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealBDedelFk;
	
	@Column(name = "RELATION_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer relationTypeRdcodFk;
	
	@Column(name = "LOCK_NUM")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer lockNum;
	
	@Column(name = "DEAL_A_DEDER_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealADederFk;
	
	@Column(name = "DEAL_B_DEDER_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealBDederFk;
	
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

	public Integer getDedrePk() {
		return dedrePk;
	}

	public void setDedrePk(Integer dedrePk) {
		this.dedrePk = dedrePk;
	}

	public Integer getDealADedelFk() {
		return dealADedelFk;
	}

	public void setDealADedelFk(Integer dealADedelFk) {
		this.dealADedelFk = dealADedelFk;
	}

	public Integer getDealBDedelFk() {
		return dealBDedelFk;
	}

	public void setDealBDedelFk(Integer dealBDedelFk) {
		this.dealBDedelFk = dealBDedelFk;
	}

	public Integer getRelationTypeRdcodFk() {
		return relationTypeRdcodFk;
	}

	public void setRelationTypeRdcodFk(Integer relationTypeRdcodFk) {
		this.relationTypeRdcodFk = relationTypeRdcodFk;
	}

	public Integer getLockNum() {
		return lockNum;
	}

	public void setLockNum(Integer lockNum) {
		this.lockNum = lockNum;
	}

	public Integer getDealADederFk() {
		return dealADederFk;
	}

	public void setDealADederFk(Integer dealADederFk) {
		this.dealADederFk = dealADederFk;
	}

	public Integer getDealBDederFk() {
		return dealBDederFk;
	}

	public void setDealBDederFk(Integer dealBDederFk) {
		this.dealBDederFk = dealBDederFk;
	}
}
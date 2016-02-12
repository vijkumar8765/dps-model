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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.it.bp.dps.domain.entity.base.BaseTable;
import com.it.bp.dps.domain.entity.base.BaseTableAware;
import com.it.bp.dps.domain.entity.base.BaseTableListener;

/**
 * A table for Tracking Deal Events
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DETRS_TRCK_EVENT_STATES")
@EntityListeners(BaseTableListener.class)
public class DetrsTrckEventStatesDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DETRS_PK")
	private Integer detrsPk;

	@Column(name = "DEAL_DEDEL_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer dealDedelFk;
	
	@Column(name = "COMMITMENT_DEPCM_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer commitmentDepcmFk;
	
	@Column(name = "EXERCISE_UNIT_DEEXU_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer exerciseUnitDeexuFk;
	
	@Column(name = "EVENT_XML")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private java.sql.Clob eventXml;
	
	@Column(name = "FLOATING_PRICING_DEPFL_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer floatingPricingDepflFk;
	
	@Column(name = "EXCHANGE_PRICING_DEEXP_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer exchangePricingDeexpFk;
	
	@Column(name = "DUE_DATE")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Integer dueDate;
	
	@Column(name = "EVENT_TYPE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer eventType;
	
	@Embedded
	private BaseTable baseTable;
	
	public BaseTable getBaseTable() {
		if (baseTable == null) {
			baseTable = new BaseTable();
		}
		return baseTable;
	}

	public Integer getDetrsPk() {
		return detrsPk;
	}

	public void setDetrsPk(Integer detrsPk) {
		this.detrsPk = detrsPk;
	}

	public Integer getDealDedelFk() {
		return dealDedelFk;
	}

	public void setDealDedelFk(Integer dealDedelFk) {
		this.dealDedelFk = dealDedelFk;
	}

	public Integer getCommitmentDepcmFk() {
		return commitmentDepcmFk;
	}

	public void setCommitmentDepcmFk(Integer commitmentDepcmFk) {
		this.commitmentDepcmFk = commitmentDepcmFk;
	}

	public Integer getExerciseUnitDeexuFk() {
		return exerciseUnitDeexuFk;
	}

	public void setExerciseUnitDeexuFk(Integer exerciseUnitDeexuFk) {
		this.exerciseUnitDeexuFk = exerciseUnitDeexuFk;
	}

	public java.sql.Clob getEventXml() {
		return eventXml;
	}

	public void setEventXml(java.sql.Clob eventXml) {
		this.eventXml = eventXml;
	}

	public Integer getFloatingPricingDepflFk() {
		return floatingPricingDepflFk;
	}

	public void setFloatingPricingDepflFk(Integer floatingPricingDepflFk) {
		this.floatingPricingDepflFk = floatingPricingDepflFk;
	}

	public Integer getExchangePricingDeexpFk() {
		return exchangePricingDeexpFk;
	}

	public void setExchangePricingDeexpFk(Integer exchangePricingDeexpFk) {
		this.exchangePricingDeexpFk = exchangePricingDeexpFk;
	}

	public Integer getDueDate() {
		return dueDate;
	}

	public void setDueDate(Integer dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getEventType() {
		return eventType;
	}

	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

	public void setBaseTable(BaseTable baseTable) {
		this.baseTable = baseTable;
	}
}
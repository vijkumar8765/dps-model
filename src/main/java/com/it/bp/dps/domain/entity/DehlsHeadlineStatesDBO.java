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
 * A table for creating Deal Headlines
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEHLS_HEADLINE_STATES")
@EntityListeners(BaseTableListener.class)
public class DehlsHeadlineStatesDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEHLS_PK")
	private Integer dehlsPk;

	@Column(name = "CHAIN_DECHN_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer chainDechnFk;
	
	@Column(name = "REGION_RDREG_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer regionRdregFk;
	
	@Column(name = "INSTRUMENT_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer instrumentTypeRdcodFk;
	
	@Column(name = "DEAL_ENTERED_DATE")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	private Date dealEnteredDate;
	
	@Column(name = "EVENT_XML")
	@Basic(fetch = FetchType.EAGER)
	private java.sql.Clob eventXml;
	
	@Column(name = "DEAL_DEDEL_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealDedelFk;
	
	@Embedded
	private BaseTable baseTable;
	
	public BaseTable getBaseTable() {
		if (baseTable == null) {
			baseTable = new BaseTable();
		}
		return baseTable;
	}

	public Integer getDehlsPk() {
		return dehlsPk;
	}

	public void setDehlsPk(Integer dehlsPk) {
		this.dehlsPk = dehlsPk;
	}

	public Integer getChainDechnFk() {
		return chainDechnFk;
	}

	public void setChainDechnFk(Integer chainDechnFk) {
		this.chainDechnFk = chainDechnFk;
	}

	public Integer getRegionRdregFk() {
		return regionRdregFk;
	}

	public void setRegionRdregFk(Integer regionRdregFk) {
		this.regionRdregFk = regionRdregFk;
	}

	public Integer getInstrumentTypeRdcodFk() {
		return instrumentTypeRdcodFk;
	}

	public void setInstrumentTypeRdcodFk(Integer instrumentTypeRdcodFk) {
		this.instrumentTypeRdcodFk = instrumentTypeRdcodFk;
	}

	public Date getDealEnteredDate() {
		return dealEnteredDate;
	}

	public void setDealEnteredDate(Date dealEnteredDate) {
		this.dealEnteredDate = dealEnteredDate;
	}

	public java.sql.Clob getEventXml() {
		return eventXml;
	}

	public void setEventXml(java.sql.Clob eventXml) {
		this.eventXml = eventXml;
	}

	public Integer getDealDedelFk() {
		return dealDedelFk;
	}

	public void setDealDedelFk(Integer dealDedelFk) {
		this.dealDedelFk = dealDedelFk;
	}

	public void setBaseTable(BaseTable baseTable) {
		this.baseTable = baseTable;
	}
}
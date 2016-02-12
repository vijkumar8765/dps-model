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
 * A table for creating Brokerage Deals.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEBRK_BROKERAGE")
@EntityListeners(BaseTableListener.class)
public class DebrkBrokerageDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEBRK_PK")
	private Integer debrkPk;

	@Column(name = "BROKER_RDCMB_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer brokerRdcmbFk;
	
	@Column(name = "BROKERAGE_RATE")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal brokerageRate;
	
	@Column(name = "UNITS_RDPUN_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer unitsRdpunFk;
	
	@Column(name = "DEAL_EVENT_RDDLE_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealEventRddleFk;

	@Column(name = "FIXED_BROKERAGE_AMT")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal fixedBrokerageAmt;

	@Column(name = "CURRENCY_RDCAB_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer currencyRdcabFk;
	
	@Column(name = "LOCK_NUM")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer lockNum;
	
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

	public Integer getDebrkPk() {
		return debrkPk;
	}

	public void setDebrkPk(Integer debrkPk) {
		this.debrkPk = debrkPk;
	}

	public Integer getBrokerRdcmbFk() {
		return brokerRdcmbFk;
	}

	public void setBrokerRdcmbFk(Integer brokerRdcmbFk) {
		this.brokerRdcmbFk = brokerRdcmbFk;
	}

	public BigDecimal getBrokerageRate() {
		return brokerageRate;
	}

	public void setBrokerageRate(BigDecimal brokerageRate) {
		this.brokerageRate = brokerageRate;
	}

	public Integer getUnitsRdpunFk() {
		return unitsRdpunFk;
	}

	public void setUnitsRdpunFk(Integer unitsRdpunFk) {
		this.unitsRdpunFk = unitsRdpunFk;
	}

	public Integer getDealEventRddleFk() {
		return dealEventRddleFk;
	}

	public void setDealEventRddleFk(Integer dealEventRddleFk) {
		this.dealEventRddleFk = dealEventRddleFk;
	}

	public BigDecimal getFixedBrokerageAmt() {
		return fixedBrokerageAmt;
	}

	public void setFixedBrokerageAmt(BigDecimal fixedBrokerageAmt) {
		this.fixedBrokerageAmt = fixedBrokerageAmt;
	}

	public Integer getCurrencyRdcabFk() {
		return currencyRdcabFk;
	}

	public void setCurrencyRdcabFk(Integer currencyRdcabFk) {
		this.currencyRdcabFk = currencyRdcabFk;
	}

	public Integer getLockNum() {
		return lockNum;
	}

	public void setLockNum(Integer lockNum) {
		this.lockNum = lockNum;
	}
}
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
 * A table for creating OTC Extended Credit Swap Settlements.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEXCR_EXTENDED_CREDIT")
@EntityListeners(BaseTableListener.class)
public class DexcrExtendedCreditDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEXCR_PK")
	private Integer dexcrPk;

	@Column(name = "SETTLEMENT_DESET_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer settlementDesetFk;
	
	@Column(name = "OFFSET_DAYS")
	@Basic(fetch = FetchType.EAGER)
	private Integer offsetDays;
	
	@Column(name = "CALENDAR_WORK_DAYS_IND")
	@Basic(fetch = FetchType.EAGER)
	private String calendarWorkDaysInd;
	
	@Column(name = "FROM_AFTER_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	private String fromAfterIndicator;
	
	@Column(name = "INTEREST_RATE_PREMIUM")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal interestRatePremium;
	
	@Column(name = "PRICE_PREMIUM")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal pricePremium;
	
	@Column(name = "PREMIUM_RDPUN_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer premiumRdpunFk;
	
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

	public Integer getDexcrPk() {
		return dexcrPk;
	}

	public void setDexcrPk(Integer dexcrPk) {
		this.dexcrPk = dexcrPk;
	}

	public Integer getSettlementDesetFk() {
		return settlementDesetFk;
	}

	public void setSettlementDesetFk(Integer settlementDesetFk) {
		this.settlementDesetFk = settlementDesetFk;
	}

	public Integer getOffsetDays() {
		return offsetDays;
	}

	public void setOffsetDays(Integer offsetDays) {
		this.offsetDays = offsetDays;
	}

	public String getCalendarWorkDaysInd() {
		return calendarWorkDaysInd;
	}

	public void setCalendarWorkDaysInd(String calendarWorkDaysInd) {
		this.calendarWorkDaysInd = calendarWorkDaysInd;
	}

	public String getFromAfterIndicator() {
		return fromAfterIndicator;
	}

	public void setFromAfterIndicator(String fromAfterIndicator) {
		this.fromAfterIndicator = fromAfterIndicator;
	}

	public BigDecimal getInterestRatePremium() {
		return interestRatePremium;
	}

	public void setInterestRatePremium(BigDecimal interestRatePremium) {
		this.interestRatePremium = interestRatePremium;
	}

	public BigDecimal getPricePremium() {
		return pricePremium;
	}

	public void setPricePremium(BigDecimal pricePremium) {
		this.pricePremium = pricePremium;
	}

	public Integer getPremiumRdpunFk() {
		return premiumRdpunFk;
	}

	public void setPremiumRdpunFk(Integer premiumRdpunFk) {
		this.premiumRdpunFk = premiumRdpunFk;
	}
}
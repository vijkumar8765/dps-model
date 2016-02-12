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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.it.bp.dps.domain.entity.base.BaseTable;
import com.it.bp.dps.domain.entity.base.BaseTableAware;
import com.it.bp.dps.domain.entity.base.BaseTableListener;

/**
 * A table for creating OTC Swap Settlement Terms.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DESCO_SETTLEMENT_CONVS")
@EntityListeners(BaseTableListener.class)
public class DescoSettlementConvsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DESCO_PK")
	private Integer descoPk;

	@Column(name = "FROM_CURRENCY_RDCAB_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer fromCurrencyRdcabFk;
	
	@Column(name = "TO_CURRENCY_RDCAB_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer toCurrencyRdcabFk;
	
	@Column(name = "FIXED_EXCHANGE_RATE")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal fixedExchangeRate;
	
	@Column(name = "START_DATE")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	private Integer startDate;
	
	@Column(name = "END_DATE")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	private Integer endDate;
	
	@Column(name = "DEAL_EVENT_RDDLE_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealEventRddleFk;
	
	@Column(name = "OFFSET_FROM_EVENT")
	@Basic(fetch = FetchType.EAGER)
	private Integer offsetFromEvent;
	
	@Column(name = "CALENDAR_WORK_DAYS_IND")
	@Basic(fetch = FetchType.EAGER)
	private String calendarWorkDaysInd;
	
	@Column(name = "FROM_AFTER_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	private String fromAfterIndicator;
	
	@Column(name = "SPLIT_PREVIOUS_NEXT_IND")
	@Basic(fetch = FetchType.EAGER)
	private String splitPreviousNextInd;
	
	@Column(name = "CALENDAR_RDCAL_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer calendarRdcalFk;
	
	@Column(name = "TIME_OF_DAY")
	@Basic(fetch = FetchType.EAGER)
	private String timeOfDay;
	
	@Column(name = "TIMEZONE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer timezoneRdcodFk;
	
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

	public Integer getDescoPk() {
		return descoPk;
	}

	public void setDescoPk(Integer descoPk) {
		this.descoPk = descoPk;
	}

	public Integer getFromCurrencyRdcabFk() {
		return fromCurrencyRdcabFk;
	}

	public void setFromCurrencyRdcabFk(Integer fromCurrencyRdcabFk) {
		this.fromCurrencyRdcabFk = fromCurrencyRdcabFk;
	}

	public Integer getToCurrencyRdcabFk() {
		return toCurrencyRdcabFk;
	}

	public void setToCurrencyRdcabFk(Integer toCurrencyRdcabFk) {
		this.toCurrencyRdcabFk = toCurrencyRdcabFk;
	}

	public BigDecimal getFixedExchangeRate() {
		return fixedExchangeRate;
	}

	public void setFixedExchangeRate(BigDecimal fixedExchangeRate) {
		this.fixedExchangeRate = fixedExchangeRate;
	}

	public Integer getStartDate() {
		return startDate;
	}

	public void setStartDate(Integer startDate) {
		this.startDate = startDate;
	}

	public Integer getEndDate() {
		return endDate;
	}

	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}

	public Integer getDealEventRddleFk() {
		return dealEventRddleFk;
	}

	public void setDealEventRddleFk(Integer dealEventRddleFk) {
		this.dealEventRddleFk = dealEventRddleFk;
	}

	public Integer getOffsetFromEvent() {
		return offsetFromEvent;
	}

	public void setOffsetFromEvent(Integer offsetFromEvent) {
		this.offsetFromEvent = offsetFromEvent;
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

	public String getSplitPreviousNextInd() {
		return splitPreviousNextInd;
	}

	public void setSplitPreviousNextInd(String splitPreviousNextInd) {
		this.splitPreviousNextInd = splitPreviousNextInd;
	}

	public Integer getCalendarRdcalFk() {
		return calendarRdcalFk;
	}

	public void setCalendarRdcalFk(Integer calendarRdcalFk) {
		this.calendarRdcalFk = calendarRdcalFk;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public Integer getTimezoneRdcodFk() {
		return timezoneRdcodFk;
	}

	public void setTimezoneRdcodFk(Integer timezoneRdcodFk) {
		this.timezoneRdcodFk = timezoneRdcodFk;
	}

}
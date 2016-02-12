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
import javax.validation.constraints.NotNull;

import com.it.bp.dps.domain.entity.base.BaseTable;
import com.it.bp.dps.domain.entity.base.BaseTableAware;
import com.it.bp.dps.domain.entity.base.BaseTableListener;

/**
 * A table for creating OTC Swap Settlement Terms.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DESET_SETTLEMENT_TERMS")
@EntityListeners(BaseTableListener.class)
public class DesetSettlementTermsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DESET_PK")
	private Integer desetPk;

	@Column(name = "CURRENCY_RDCAB_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer currencyRdcabFk;
	
	@Column(name = "SETTLEMENT_BASIS_RDDLE_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer settlementBasisRddleFk;
	
	@Column(name = "OFFSET_FROM_EVENT")
	@Basic(fetch = FetchType.EAGER)
	private Integer offsetFromEvent;
	
	@Column(name = "CALENDAR_WORK_DAYS_IND")
	@Basic(fetch = FetchType.EAGER)
	private String caldndarWorkDaysInd;
	
	@Column(name = "FROM_AFTER_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	private String fromAfterIndicator;
	
	@Column(name = "SPLIT_PREVIOUS_NEXT_IND")
	@Basic(fetch = FetchType.EAGER)
	private String splitPreviousNextInd;
	
	@Column(name = "CALENDAR_RDCAL_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer calendarRdcalFk;
	
	@Column(name = "FIXED_PAYMENT_DUE_DATE")
	@Basic(fetch = FetchType.EAGER)
	private Date fixedPaymentDueDate;
	
	@Column(name = "ALT_BASIS_RDDLE_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer altBasisRddleFk;
	
	@Column(name = "ALT_OFFSET_FROM_EVENT")
	@Basic(fetch = FetchType.EAGER)
	private Integer altOffsetFromEvent;
	
	@Column(name = "ALT_CAL_WORK_IND")
	@Basic(fetch = FetchType.EAGER)
	private String altCalWorkInd;

	@Column(name = "ALT_FROM_AFTER_IND")
	@Basic(fetch = FetchType.EAGER)
	private String altFromAfterInd;
	
	@Column(name = "PROV_BASIS_AGREED_IND")
	@Basic(fetch = FetchType.EAGER)
	private String provBasisAgreedInd;
	
	@Column(name = "MULTI_CURRENCY_IND")
	@Basic(fetch = FetchType.EAGER)
	private String multiCurrencyInd;
	
	@Column(name = "EARLY_LATE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer earlyLateRdcodFk;
	
	@Column(name = "DAY_OF_MONTH_NUM")
	@Basic(fetch = FetchType.EAGER)
	private Integer dayOfMonthNum;
	
	@Column(name = "MONTH_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer monthRdcodFk;
	
	@Column(name = "EOM_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String eomIndicator;
	
	@Column(name = "PROV_PRICING_BASIS_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer provPricingBasisRdcodFk;
	
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

	public Integer getDesetPk() {
		return desetPk;
	}

	public void setDesetPk(Integer desetPk) {
		this.desetPk = desetPk;
	}

	public Integer getCurrencyRdcabFk() {
		return currencyRdcabFk;
	}

	public void setCurrencyRdcabFk(Integer currencyRdcabFk) {
		this.currencyRdcabFk = currencyRdcabFk;
	}

	public Integer getSettlementBasisRddleFk() {
		return settlementBasisRddleFk;
	}

	public void setSettlementBasisRddleFk(Integer settlementBasisRddleFk) {
		this.settlementBasisRddleFk = settlementBasisRddleFk;
	}

	public Integer getOffsetFromEvent() {
		return offsetFromEvent;
	}

	public void setOffsetFromEvent(Integer offsetFromEvent) {
		this.offsetFromEvent = offsetFromEvent;
	}

	public String getCaldndarWorkDaysInd() {
		return caldndarWorkDaysInd;
	}

	public void setCaldndarWorkDaysInd(String caldndarWorkDaysInd) {
		this.caldndarWorkDaysInd = caldndarWorkDaysInd;
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

	public Date getFixedPaymentDueDate() {
		return fixedPaymentDueDate;
	}

	public void setFixedPaymentDueDate(Date fixedPaymentDueDate) {
		this.fixedPaymentDueDate = fixedPaymentDueDate;
	}

	public Integer getAltBasisRddleFk() {
		return altBasisRddleFk;
	}

	public void setAltBasisRddleFk(Integer altBasisRddleFk) {
		this.altBasisRddleFk = altBasisRddleFk;
	}

	public Integer getAltOffsetFromEvent() {
		return altOffsetFromEvent;
	}

	public void setAltOffsetFromEvent(Integer altOffsetFromEvent) {
		this.altOffsetFromEvent = altOffsetFromEvent;
	}

	public String getAltCalWorkInd() {
		return altCalWorkInd;
	}

	public void setAltCalWorkInd(String altCalWorkInd) {
		this.altCalWorkInd = altCalWorkInd;
	}

	public String getAltFromAfterInd() {
		return altFromAfterInd;
	}

	public void setAltFromAfterInd(String altFromAfterInd) {
		this.altFromAfterInd = altFromAfterInd;
	}

	public String getProvBasisAgreedInd() {
		return provBasisAgreedInd;
	}

	public void setProvBasisAgreedInd(String provBasisAgreedInd) {
		this.provBasisAgreedInd = provBasisAgreedInd;
	}

	public String getMultiCurrencyInd() {
		return multiCurrencyInd;
	}

	public void setMultiCurrencyInd(String multiCurrencyInd) {
		this.multiCurrencyInd = multiCurrencyInd;
	}

	public Integer getEarlyLateRdcodFk() {
		return earlyLateRdcodFk;
	}

	public void setEarlyLateRdcodFk(Integer earlyLateRdcodFk) {
		this.earlyLateRdcodFk = earlyLateRdcodFk;
	}

	public Integer getDayOfMonthNum() {
		return dayOfMonthNum;
	}

	public void setDayOfMonthNum(Integer dayOfMonthNum) {
		this.dayOfMonthNum = dayOfMonthNum;
	}

	public Integer getMonthRdcodFk() {
		return monthRdcodFk;
	}

	public void setMonthRdcodFk(Integer monthRdcodFk) {
		this.monthRdcodFk = monthRdcodFk;
	}

	public String getEomIndicator() {
		return eomIndicator;
	}

	public void setEomIndicator(String eomIndicator) {
		this.eomIndicator = eomIndicator;
	}

	public Integer getProvPricingBasisRdcodFk() {
		return provPricingBasisRdcodFk;
	}

	public void setProvPricingBasisRdcodFk(Integer provPricingBasisRdcodFk) {
		this.provPricingBasisRdcodFk = provPricingBasisRdcodFk;
	}
}
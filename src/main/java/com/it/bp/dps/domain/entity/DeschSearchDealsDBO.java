/*
 * Project : TWB
 * Copyright (C) 2016 BP Oil UK Ltd.
 * BP PROPRIETARY/CONFIDENTIAL
 */
package com.it.bp.dps.domain.entity;	//NOPMD

import java.io.Serializable;
import java.math.BigDecimal;
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
 * A table for creating Derivative Deals (OTC Swap Deals).
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DESCH_SEARCH_DEALS")
@EntityListeners(BaseTableListener.class)
public class DeschSearchDealsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = 5341721900227643875L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DESCH_PK")
	private Integer deschPk;

	@Column(name = "DEAL_KEY")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealKey;
	
	@Column(name = "DEAL_REFERENCE")
	@Basic(fetch = FetchType.EAGER)
	private String dealReference;
	
	@Column(name = "OWNING_COMPANY_RDCMB_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer owningCompanyRdcmbFk;
	
	@Column(name = "COUNTER_PARTY_RDCMB_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer counterPartyRdcmbFk;
	
	@Column(name = "DEAL_DONE_DATE")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	private Date dealDoneDate;
	
	@Column(name = "TRADER_SCUSR_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer traderScuseFk;

	@Column(name = "CHAIN_PREFIX_RDCHP_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer chainPrefixRdchpFk;
	
	@Column(name = "CHAIN_NUMBER")
	@Basic(fetch = FetchType.EAGER)
	private String chainNumber;
	
	@Column(name = "BUY_SELL")
	@Basic(fetch = FetchType.EAGER)
	private String buySell;

	@Column(name = "INSTRUMENT_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer instrumentTypeRdcodFk;
	
	@Column(name = "DEAL_TYPE_RDDLT_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealTypeRddltFk;
	
	@Column(name = "PRODUCT_RDDPR_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer productRddprFk;
	
	@Column(name = "QUANTITY_UOM")
	@Basic(fetch = FetchType.EAGER)
	private String quantityUom;
	
	@Column(name = "GRADE_RDGRD_FK")
	@Basic(fetch = FetchType.EAGER)
	private String gradeRdgrdFk;
	
	@Column(name = "TERMS_RDDET_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer termsRddetFk;
	
	@Column(name = "LOADING_LOCATION_RDLOC_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer loadingLocationRdlocFk;
	
	@Column(name = "DISCHARGE_LOCATION_RDLOC_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dischargeLocationRdlocFk;
	
	@Column(name = "PUT_CALL")
	@Basic(fetch = FetchType.EAGER)
	private String putCall;
	
	@Column(name = "STRIKE_FIXED_PRICE")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal strikeFixedPrice;
	
	@Column(name = "OPTION_PREMIUM")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal optionPremium;
	
	@Column(name = "NUMBER_OF_STRIPS")
	@Basic(fetch = FetchType.EAGER)
	private Integer numberOfStrips;
	
	@Column(name = "BENCH_RDBCH_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer benchRdbchFk;
	
	@Column(name = "DEAL_STATUS_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealStatusRdcodFk;
	
	@Column(name = "BROKER_RDCMB_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer brokerRdcmbFk;
	
	@Column(name = "ICE_DEAL_ID")
	@Basic(fetch = FetchType.EAGER)
	private Integer iceDealId;
	
	@Column(name = "DELIVERY_PERIOD_RDDEP_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer deliveryPeriodRddepFk;
	
	@Column(name = "LOCK_NUM")
	@Basic(fetch = FetchType.EAGER)
	private Integer lockNum;
	
	@Column(name = "SPOT_TERM_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	private String spotTermIndicator;
	
	@Column(name = "START_DATE")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name = "END_DATE")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name = "TO_CHAIN_PREFIX_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer toChainPrefixFk;

	@Column(name = "TO_CHAIN_NUMBER")
	@Basic(fetch = FetchType.EAGER)
	private String toChainNumber;
	
	@Column(name = "OPERATOR_SCUSR_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer operatorScusrFk;
	
	@Column(name = "DEAL_ORIGIN_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealOriginRdcodFk;
	
	@Column(name = "REGION")
	@Basic(fetch = FetchType.EAGER)
	private Integer region;

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

	public Integer getDeschPk() {
		return deschPk;
	}

	public void setDeschPk(Integer deschPk) {
		this.deschPk = deschPk;
	}

	public Integer getDealKey() {
		return dealKey;
	}

	public void setDealKey(Integer dealKey) {
		this.dealKey = dealKey;
	}

	public String getDealReference() {
		return dealReference;
	}

	public void setDealReference(String dealReference) {
		this.dealReference = dealReference;
	}

	public Integer getOwningCompanyRdcmbFk() {
		return owningCompanyRdcmbFk;
	}

	public void setOwningCompanyRdcmbFk(Integer owningCompanyRdcmbFk) {
		this.owningCompanyRdcmbFk = owningCompanyRdcmbFk;
	}

	public Integer getCounterPartyRdcmbFk() {
		return counterPartyRdcmbFk;
	}

	public void setCounterPartyRdcmbFk(Integer counterPartyRdcmbFk) {
		this.counterPartyRdcmbFk = counterPartyRdcmbFk;
	}

	public Date getDealDoneDate() {
		return dealDoneDate;
	}

	public void setDealDoneDate(Date dealDoneDate) {
		this.dealDoneDate = dealDoneDate;
	}

	public Integer getTraderScuseFk() {
		return traderScuseFk;
	}

	public void setTraderScuseFk(Integer traderScuseFk) {
		this.traderScuseFk = traderScuseFk;
	}

	public Integer getChainPrefixRdchpFk() {
		return chainPrefixRdchpFk;
	}

	public void setChainPrefixRdchpFk(Integer chainPrefixRdchpFk) {
		this.chainPrefixRdchpFk = chainPrefixRdchpFk;
	}

	public String getChainNumber() {
		return chainNumber;
	}

	public void setChainNumber(String chainNumber) {
		this.chainNumber = chainNumber;
	}

	public String getBuySell() {
		return buySell;
	}

	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}

	public Integer getInstrumentTypeRdcodFk() {
		return instrumentTypeRdcodFk;
	}

	public void setInstrumentTypeRdcodFk(Integer instrumentTypeRdcodFk) {
		this.instrumentTypeRdcodFk = instrumentTypeRdcodFk;
	}

	public Integer getDealTypeRddltFk() {
		return dealTypeRddltFk;
	}

	public void setDealTypeRddltFk(Integer dealTypeRddltFk) {
		this.dealTypeRddltFk = dealTypeRddltFk;
	}

	public Integer getProductRddprFk() {
		return productRddprFk;
	}

	public void setProductRddprFk(Integer productRddprFk) {
		this.productRddprFk = productRddprFk;
	}

	public String getQuantityUom() {
		return quantityUom;
	}

	public void setQuantityUom(String quantityUom) {
		this.quantityUom = quantityUom;
	}

	public String getGradeRdgrdFk() {
		return gradeRdgrdFk;
	}

	public void setGradeRdgrdFk(String gradeRdgrdFk) {
		this.gradeRdgrdFk = gradeRdgrdFk;
	}

	public Integer getTermsRddetFk() {
		return termsRddetFk;
	}

	public void setTermsRddetFk(Integer termsRddetFk) {
		this.termsRddetFk = termsRddetFk;
	}

	public Integer getLoadingLocationRdlocFk() {
		return loadingLocationRdlocFk;
	}

	public void setLoadingLocationRdlocFk(Integer loadingLocationRdlocFk) {
		this.loadingLocationRdlocFk = loadingLocationRdlocFk;
	}

	public Integer getDischargeLocationRdlocFk() {
		return dischargeLocationRdlocFk;
	}

	public void setDischargeLocationRdlocFk(Integer dischargeLocationRdlocFk) {
		this.dischargeLocationRdlocFk = dischargeLocationRdlocFk;
	}

	public String getPutCall() {
		return putCall;
	}

	public void setPutCall(String putCall) {
		this.putCall = putCall;
	}

	public BigDecimal getStrikeFixedPrice() {
		return strikeFixedPrice;
	}

	public void setStrikeFixedPrice(BigDecimal strikeFixedPrice) {
		this.strikeFixedPrice = strikeFixedPrice;
	}

	public BigDecimal getOptionPremium() {
		return optionPremium;
	}

	public void setOptionPremium(BigDecimal optionPremium) {
		this.optionPremium = optionPremium;
	}

	public Integer getNumberOfStrips() {
		return numberOfStrips;
	}

	public void setNumberOfStrips(Integer numberOfStrips) {
		this.numberOfStrips = numberOfStrips;
	}

	public Integer getBenchRdbchFk() {
		return benchRdbchFk;
	}

	public void setBenchRdbchFk(Integer benchRdbchFk) {
		this.benchRdbchFk = benchRdbchFk;
	}

	public Integer getDealStatusRdcodFk() {
		return dealStatusRdcodFk;
	}

	public void setDealStatusRdcodFk(Integer dealStatusRdcodFk) {
		this.dealStatusRdcodFk = dealStatusRdcodFk;
	}

	public Integer getBrokerRdcmbFk() {
		return brokerRdcmbFk;
	}

	public void setBrokerRdcmbFk(Integer brokerRdcmbFk) {
		this.brokerRdcmbFk = brokerRdcmbFk;
	}

	public Integer getIceDealId() {
		return iceDealId;
	}

	public void setIceDealId(Integer iceDealId) {
		this.iceDealId = iceDealId;
	}

	public Integer getDeliveryPeriodRddepFk() {
		return deliveryPeriodRddepFk;
	}

	public void setDeliveryPeriodRddepFk(Integer deliveryPeriodRddepFk) {
		this.deliveryPeriodRddepFk = deliveryPeriodRddepFk;
	}

	public Integer getLockNum() {
		return lockNum;
	}

	public void setLockNum(Integer lockNum) {
		this.lockNum = lockNum;
	}

	public String getSpotTermIndicator() {
		return spotTermIndicator;
	}

	public void setSpotTermIndicator(String spotTermIndicator) {
		this.spotTermIndicator = spotTermIndicator;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getToChainPrefixFk() {
		return toChainPrefixFk;
	}

	public void setToChainPrefixFk(Integer toChainPrefixFk) {
		this.toChainPrefixFk = toChainPrefixFk;
	}

	public String getToChainNumber() {
		return toChainNumber;
	}

	public void setToChainNumber(String toChainNumber) {
		this.toChainNumber = toChainNumber;
	}

	public Integer getOperatorScusrFk() {
		return operatorScusrFk;
	}

	public void setOperatorScusrFk(Integer operatorScusrFk) {
		this.operatorScusrFk = operatorScusrFk;
	}

	public Integer getDealOriginRdcodFk() {
		return dealOriginRdcodFk;
	}

	public void setDealOriginRdcodFk(Integer dealOriginRdcodFk) {
		this.dealOriginRdcodFk = dealOriginRdcodFk;
	}

	public Integer getRegion() {
		return region;
	}

	public void setRegion(Integer region) {
		this.region = region;
	}

}
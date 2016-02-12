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
 * A table for creating Derivative Deals (OTC Swap Deals).
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEDER_DERIVS_DEALS")
@EntityListeners(BaseTableListener.class)
public class DederDerivsDealsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = 5341721900227643875L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEDER_PK")
	private Integer dederPk;
	
	@Column(name = "DEAL_DEDEL_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer dealDedelFk;
	
	@Column(name = "DEAL_REFERENCE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String dealReference;

	@Column(name = "FREQUENCY_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer frequencyRdcodFk;
	
	@Column(name = "QUANTITY_BASIS_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer quantityBasisRdcodFk;
	
	@Column(name = "BROKERAGE_DEBRK_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer brokerageDebrkFk;
	
	@Column(name = "DERIVS_PRODUCT_RDDPR_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer derivsProductRddprFk;
	
	@Column(name = "DEAL_TYPE_RDDLT_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer dealTypeRddltFk;
	
	@Column(name = "OPTION_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer optionTypeRdcodFk;
	
	@Column(name = "PAYMENT_SECURITY_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer paymentSecurityRdcodFk;
	
	@Column(name = "CONVERSION_DECON_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer conversionDeconFk;
	
	@Column(name = "SETTLE_CONV_DESCO_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer settltConvDescoFk;
	
	@Column(name = "LOCK_NUM")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer lockNum;
	
	@Column(name = "EFS_APPLICABLE_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	private String efsApplicableIndicator;
	
	@Column(name = "EFS_EXCHANGE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer efsExchangeRdcodFk;
	
	@Column(name = "QUANTO_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	private String quantoIndicator;
	
	@Column(name = "MASTER_AGREEMENT_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer masterAgreementTypeRdcodFk;
	
	@Column(name = "MASTER_AGREEMENT_VERSION")
	@Basic(fetch = FetchType.EAGER)
	private Integer masterAgreementVersion;
	
	@Column(name = "COLLATERAL_CODE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer collateralCodeRdcodFk;
	
	@Column(name = "COLLATERAL_PORTFOLIO_CODE")
	@Basic(fetch = FetchType.EAGER)
	private Integer collateralPortfolioCode;
	
	@Column(name = "DODDFRANK_IND")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String doddfrankInd;
	
	@Column(name = "EMIR_IND")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String emirInd;
	
	@Column(name = "DF_REPORTER_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dfReporterRdcodFk;
	
	@Column(name = "EMIR_REPORTER_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer emirReporterRdcodFk;
	
	@Column(name = "UNIQUE_TRADE_IDENTIFIER")
	@Basic(fetch = FetchType.EAGER)
	private Integer uniqueTradeIdentifier;
	
	@Column(name = "UTI_SOURCE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer utiSourceRdcodFk;
	
	@Column(name = "CONFIRMATION_DATE_TIME")
	@Basic(fetch = FetchType.EAGER)
	private Date confirmationDateTime;
	
	@Column(name = "CONTRACT_DOC_LINK")
	@Basic(fetch = FetchType.EAGER)
	private String contractDocLink;

	@Column(name = "LIFECYCLE_EVENT_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer lifecycleEventRdcodFk;
	
	@Column(name = "OWNING_COMPANY_HEDGE_IND")
	@Basic(fetch = FetchType.EAGER)
	private String owningCompanyHedgeInd;
	
	@Column(name = "COUNTERPARTY_HEDGE_IND")
	@Basic(fetch = FetchType.EAGER)
	private String counterpartyHedgeInd;
	
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

	public Integer getDederPk() {
		return dederPk;
	}

	public void setDederPk(Integer dederPk) {
		this.dederPk = dederPk;
	}

	public Integer getDealDedelFk() {
		return dealDedelFk;
	}

	public void setDealDedelFk(Integer dealDedelFk) {
		this.dealDedelFk = dealDedelFk;
	}

	public String getDealReference() {
		return dealReference;
	}

	public void setDealReference(String dealReference) {
		this.dealReference = dealReference;
	}

	public Integer getFrequencyRdcodFk() {
		return frequencyRdcodFk;
	}

	public void setFrequencyRdcodFk(Integer frequencyRdcodFk) {
		this.frequencyRdcodFk = frequencyRdcodFk;
	}

	public Integer getQuantityBasisRdcodFk() {
		return quantityBasisRdcodFk;
	}

	public void setQuantityBasisRdcodFk(Integer quantityBasisRdcodFk) {
		this.quantityBasisRdcodFk = quantityBasisRdcodFk;
	}

	public Integer getBrokerageDebrkFk() {
		return brokerageDebrkFk;
	}

	public void setBrokerageDebrkFk(Integer brokerageDebrkFk) {
		this.brokerageDebrkFk = brokerageDebrkFk;
	}

	public Integer getDerivsProductRddprFk() {
		return derivsProductRddprFk;
	}

	public void setDerivsProductRddprFk(Integer derivsProductRddprFk) {
		this.derivsProductRddprFk = derivsProductRddprFk;
	}

	public Integer getDealTypeRddltFk() {
		return dealTypeRddltFk;
	}

	public void setDealTypeRddltFk(Integer dealTypeRddltFk) {
		this.dealTypeRddltFk = dealTypeRddltFk;
	}

	public Integer getOptionTypeRdcodFk() {
		return optionTypeRdcodFk;
	}

	public void setOptionTypeRdcodFk(Integer optionTypeRdcodFk) {
		this.optionTypeRdcodFk = optionTypeRdcodFk;
	}

	public Integer getPaymentSecurityRdcodFk() {
		return paymentSecurityRdcodFk;
	}

	public void setPaymentSecurityRdcodFk(Integer paymentSecurityRdcodFk) {
		this.paymentSecurityRdcodFk = paymentSecurityRdcodFk;
	}

	public Integer getConversionDeconFk() {
		return conversionDeconFk;
	}

	public void setConversionDeconFk(Integer conversionDeconFk) {
		this.conversionDeconFk = conversionDeconFk;
	}

	public Integer getSettltConvDescoFk() {
		return settltConvDescoFk;
	}

	public void setSettltConvDescoFk(Integer settltConvDescoFk) {
		this.settltConvDescoFk = settltConvDescoFk;
	}

	public Integer getLockNum() {
		return lockNum;
	}

	public void setLockNum(Integer lockNum) {
		this.lockNum = lockNum;
	}

	public String getEfsApplicableIndicator() {
		return efsApplicableIndicator;
	}

	public void setEfsApplicableIndicator(String efsApplicableIndicator) {
		this.efsApplicableIndicator = efsApplicableIndicator;
	}

	public Integer getEfsExchangeRdcodFk() {
		return efsExchangeRdcodFk;
	}

	public void setEfsExchangeRdcodFk(Integer efsExchangeRdcodFk) {
		this.efsExchangeRdcodFk = efsExchangeRdcodFk;
	}

	public String getQuantoIndicator() {
		return quantoIndicator;
	}

	public void setQuantoIndicator(String quantoIndicator) {
		this.quantoIndicator = quantoIndicator;
	}

	public Integer getMasterAgreementTypeRdcodFk() {
		return masterAgreementTypeRdcodFk;
	}

	public void setMasterAgreementTypeRdcodFk(Integer masterAgreementTypeRdcodFk) {
		this.masterAgreementTypeRdcodFk = masterAgreementTypeRdcodFk;
	}

	public Integer getMasterAgreementVersion() {
		return masterAgreementVersion;
	}

	public void setMasterAgreementVersion(Integer masterAgreementVersion) {
		this.masterAgreementVersion = masterAgreementVersion;
	}

	public Integer getCollateralCodeRdcodFk() {
		return collateralCodeRdcodFk;
	}

	public void setCollateralCodeRdcodFk(Integer collateralCodeRdcodFk) {
		this.collateralCodeRdcodFk = collateralCodeRdcodFk;
	}

	public Integer getCollateralPortfolioCode() {
		return collateralPortfolioCode;
	}

	public void setCollateralPortfolioCode(Integer collateralPortfolioCode) {
		this.collateralPortfolioCode = collateralPortfolioCode;
	}

	public String getDoddfrankInd() {
		return doddfrankInd;
	}

	public void setDoddfrankInd(String doddfrankInd) {
		this.doddfrankInd = doddfrankInd;
	}

	public String getEmirInd() {
		return emirInd;
	}

	public void setEmirInd(String emirInd) {
		this.emirInd = emirInd;
	}

	public Integer getDfReporterRdcodFk() {
		return dfReporterRdcodFk;
	}

	public void setDfReporterRdcodFk(Integer dfReporterRdcodFk) {
		this.dfReporterRdcodFk = dfReporterRdcodFk;
	}

	public Integer getEmirReporterRdcodFk() {
		return emirReporterRdcodFk;
	}

	public void setEmirReporterRdcodFk(Integer emirReporterRdcodFk) {
		this.emirReporterRdcodFk = emirReporterRdcodFk;
	}

	public Integer getUniqueTradeIdentifier() {
		return uniqueTradeIdentifier;
	}

	public void setUniqueTradeIdentifier(Integer uniqueTradeIdentifier) {
		this.uniqueTradeIdentifier = uniqueTradeIdentifier;
	}

	public Integer getUtiSourceRdcodFk() {
		return utiSourceRdcodFk;
	}

	public void setUtiSourceRdcodFk(Integer utiSourceRdcodFk) {
		this.utiSourceRdcodFk = utiSourceRdcodFk;
	}

	public Date getConfirmationDateTime() {
		return confirmationDateTime;
	}

	public void setConfirmationDateTime(Date confirmationDateTime) {
		this.confirmationDateTime = confirmationDateTime;
	}

	public String getContractDocLink() {
		return contractDocLink;
	}

	public void setContractDocLink(String contractDocLink) {
		this.contractDocLink = contractDocLink;
	}

	public Integer getLifecycleEventRdcodFk() {
		return lifecycleEventRdcodFk;
	}

	public void setLifecycleEventRdcodFk(Integer lifecycleEventRdcodFk) {
		this.lifecycleEventRdcodFk = lifecycleEventRdcodFk;
	}

	public String getOwningCompanyHedgeInd() {
		return owningCompanyHedgeInd;
	}

	public void setOwningCompanyHedgeInd(String owningCompanyHedgeInd) {
		this.owningCompanyHedgeInd = owningCompanyHedgeInd;
	}

	public String getCounterpartyHedgeInd() {
		return counterpartyHedgeInd;
	}

	public void setCounterpartyHedgeInd(String counterpartyHedgeInd) {
		this.counterpartyHedgeInd = counterpartyHedgeInd;
	}
}
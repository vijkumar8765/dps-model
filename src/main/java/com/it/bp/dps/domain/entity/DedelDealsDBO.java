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

import org.hibernate.annotations.GenericGenerator;

import com.it.bp.dps.domain.entity.base.BaseTable;
import com.it.bp.dps.domain.entity.base.BaseTableAware;
import com.it.bp.dps.domain.entity.base.BaseTableListener;

/**
 * A table for creating deals.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEDEL_DEALS")
@EntityListeners(BaseTableListener.class)
public class DedelDealsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = 5341721900227643875L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEDEL_PK")
	private Integer deDelPk;

	@Column(name = "OWNING_COMPANY_RDCMB_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer owningCompanyRdcmbFk;

	@Column(name = "TRADER_SCUSR_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer traderScusrFk;

	@Column(name = "COUNTERPARTY_RDCMB_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer counterPartyRdcmbFk;
	
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	@GenericGenerator(name = "deal_id", strategy="com.it.bp.dps.domain.entity.DealIdGenerator")
	@GeneratedValue(generator = "deal_id")
	@Column(name = "DEAL_REFERENCE")
	private String dealReference;
	
	@Column(name = "DEAL_DONE_DATE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Date dealDoneDate;
	
	@Column(name = "DEAL_ENTERED_DATE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Date dealEnteredDate;

	@Column(name = "DEAL_STATUS_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer dealStatusRdcodFk;
	
	@Column(name = "COUNTERPARTY_TRADER_NAME")
	@Basic(fetch = FetchType.EAGER)
	private Integer counterpartyTraderName;
	
	@Column(name = "LOCK_NUM")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer lockNum;
	
	@Column(name = "SPOT_TERM_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	private String spotTermIndicator;
	
	@Column(name = "AGENT_SCUSR_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer agentScusrFk;
	
	@Column(name = "OPERATOR_SCUSR_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer operatorScusrFk;
	
	@Column(name = "OTO_NOMINATION_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer oToNominationRdcodFk;
	
	@Column(name = "NON_STANDARD_CONTRACT_IND")
	@Basic(fetch = FetchType.EAGER)
	private String nonStandardContractInd;
	
	@Column(name = "LEG_COUNTER")
	@Basic(fetch = FetchType.EAGER)
	private Integer legCounter;
	
	@Column(name = "COMBINATION_TYPE")
	@Basic(fetch = FetchType.EAGER)
	private String combinationType;
	
	@Column(name = "MSG_VERSION")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer msgVersion;
	
	@Column(name = "AUTOMATIC_OPERATIONS")
	@Basic(fetch = FetchType.EAGER)
	private String automaticOperations;
	
	@Column(name = "DEAL_TIME")
	@Basic(fetch = FetchType.EAGER)
	private String dealTime;
	
	@Column(name = "DEAL_TIMEZONE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealTimezoneRdcodFk;
	
	@Column(name = "DEAL_ORIGIN_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer dealOriginRdcodFk;
	
	@Column(name = "BOUTIQUE_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	private String boutiqueIndicator;	
	
	@Column(name = "MARINE_DEAL_IND")
	@Basic(fetch = FetchType.EAGER)
	private String marineDealInd;
	
	@Column(name = "CUSTOMER_PURCHASE_ORDER")
	@Basic(fetch = FetchType.EAGER)
	private String customerPurchaseOrder;

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

	public Integer getDeDelPk() {
		return deDelPk;
	}

	public void setDeDelPk(Integer deDelPk) {
		this.deDelPk = deDelPk;
	}

	public Integer getOwningCompanyRdcmbFk() {
		return owningCompanyRdcmbFk;
	}

	public void setOwningCompanyRdcmbFk(Integer owningCompanyRdcmbFk) {
		this.owningCompanyRdcmbFk = owningCompanyRdcmbFk;
	}

	public Integer getTraderScusrFk() {
		return traderScusrFk;
	}

	public void setTraderScusrFk(Integer traderScusrFk) {
		this.traderScusrFk = traderScusrFk;
	}

	public Integer getCounterPartyRdcmbFk() {
		return counterPartyRdcmbFk;
	}

	public void setCounterPartyRdcmbFk(Integer counterPartyRdcmbFk) {
		this.counterPartyRdcmbFk = counterPartyRdcmbFk;
	}

	public String getDealReference() {
		return dealReference;
	}

	public void setDealReference(String dealReference) {
		this.dealReference = dealReference;
	}

	public Date getDealDoneDate() {
		return dealDoneDate;
	}

	public void setDealDoneDate(Date dealDoneDate) {
		this.dealDoneDate = dealDoneDate;
	}

	public Date getDealEnteredDate() {
		return dealEnteredDate;
	}

	public void setDealEnteredDate(Date dealEnteredDate) {
		this.dealEnteredDate = dealEnteredDate;
	}

	public Integer getDealStatusRdcodFk() {
		return dealStatusRdcodFk;
	}

	public void setDealStatusRdcodFk(Integer dealStatusRdcodFk) {
		this.dealStatusRdcodFk = dealStatusRdcodFk;
	}

	public Integer getCounterpartyTraderName() {
		return counterpartyTraderName;
	}

	public void setCounterpartyTraderName(Integer counterpartyTraderName) {
		this.counterpartyTraderName = counterpartyTraderName;
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

	public Integer getAgentScusrFk() {
		return agentScusrFk;
	}

	public void setAgentScusrFk(Integer agentScusrFk) {
		this.agentScusrFk = agentScusrFk;
	}

	public Integer getOperatorScusrFk() {
		return operatorScusrFk;
	}

	public void setOperatorScusrFk(Integer operatorScusrFk) {
		this.operatorScusrFk = operatorScusrFk;
	}

	public Integer getoToNominationRdcodFk() {
		return oToNominationRdcodFk;
	}

	public void setoToNominationRdcodFk(Integer oToNominationRdcodFk) {
		this.oToNominationRdcodFk = oToNominationRdcodFk;
	}

	public String getNonStandardContractInd() {
		return nonStandardContractInd;
	}

	public void setNonStandardContractInd(String nonStandardContractInd) {
		this.nonStandardContractInd = nonStandardContractInd;
	}

	public Integer getLegCounter() {
		return legCounter;
	}

	public void setLegCounter(Integer legCounter) {
		this.legCounter = legCounter;
	}

	public String getCombinationType() {
		return combinationType;
	}

	public void setCombinationType(String combinationType) {
		this.combinationType = combinationType;
	}

	public Integer getMsgVersion() {
		return msgVersion;
	}

	public void setMsgVersion(Integer msgVersion) {
		this.msgVersion = msgVersion;
	}

	public String getAutomaticOperations() {
		return automaticOperations;
	}

	public void setAutomaticOperations(String automaticOperations) {
		this.automaticOperations = automaticOperations;
	}

	public String getDealTime() {
		return dealTime;
	}

	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}

	public Integer getDealTimezoneRdcodFk() {
		return dealTimezoneRdcodFk;
	}

	public void setDealTimezoneRdcodFk(Integer dealTimezoneRdcodFk) {
		this.dealTimezoneRdcodFk = dealTimezoneRdcodFk;
	}

	public Integer getDealOriginRdcodFk() {
		return dealOriginRdcodFk;
	}

	public void setDealOriginRdcodFk(Integer dealOriginRdcodFk) {
		this.dealOriginRdcodFk = dealOriginRdcodFk;
	}

	public String getBoutiqueIndicator() {
		return boutiqueIndicator;
	}

	public void setBoutiqueIndicator(String boutiqueIndicator) {
		this.boutiqueIndicator = boutiqueIndicator;
	}

	public String getMarineDealInd() {
		return marineDealInd;
	}

	public void setMarineDealInd(String marineDealInd) {
		this.marineDealInd = marineDealInd;
	}

	public String getCustomerPurchaseOrder() {
		return customerPurchaseOrder;
	}

	public void setCustomerPurchaseOrder(String customerPurchaseOrder) {
		this.customerPurchaseOrder = customerPurchaseOrder;
	}
}
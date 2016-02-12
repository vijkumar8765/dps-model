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
 * A table for creating Derivative Deals (OTC Swap Deals).
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DESWS_SWAP_SETTLEMENTS")
@EntityListeners(BaseTableListener.class)
public class DeswsSwapSettlementsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = 5341721900227643875L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DESWS_PK")
	private Integer deswsPk;

	@Column(name = "DERIVS_DEAL_DEDER_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer derivsDealDederFk;
	
	@Column(name = "STRIP_NUMBER")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer stripNumber;

	@Column(name = "BUY_SELL_INDICATOR")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String buySellIndicator;
	
	@Column(name = "QUANTITY_AMOUNT")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer quantityAmount;
	
	@Column(name = "QUANTITY_UNITS_RDUOM_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer quantityUnitsRduomFk;
	
	@Column(name = "PRICE_A_DEPRC_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer priceADeprcFk;
	
	@Column(name = "PRICE_B_DEPRC_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer priceBDeprcFk;
	
	@Column(name = "SETTLEMENT_DESET_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer settlementDesetFk;
	
	@Column(name = "NON_STANDARD_PRICING")
	@Basic(fetch = FetchType.EAGER)
	private String nonStandardPricing;
	
	@Column(name = "NON_STANDARD_SETTLEMENT")
	@Basic(fetch = FetchType.EAGER)
	private String nonStandardSettlement;

	@Column(name = "IST_BO_SYSTEM_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer istBoSystemRdcodFk;
	
	@Column(name = "CP_BO_SYSTEM_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer cpBoSystemRdcodFk;
	
	@Column(name = "PRICING_SYSTEM_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer pricingSystemRdcodFk;
	
	@Column(name = "LEG_LAST_UPDATE_USER")
	@Basic(fetch = FetchType.EAGER)
	private Integer legLastUpdateUser;
	
	@Column(name = "LEG_LAST_UPDATE_TIME")
	@Basic(fetch = FetchType.EAGER)
    @Temporal(TemporalType.TIMESTAMP)
	private Date legLastUpdateTime;
	
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

	public Integer getDeswsPk() {
		return deswsPk;
	}

	public void setDeswsPk(Integer deswsPk) {
		this.deswsPk = deswsPk;
	}

	public Integer getDerivsDealDederFk() {
		return derivsDealDederFk;
	}

	public void setDerivsDealDederFk(Integer derivsDealDederFk) {
		this.derivsDealDederFk = derivsDealDederFk;
	}

	public Integer getStripNumber() {
		return stripNumber;
	}

	public void setStripNumber(Integer stripNumber) {
		this.stripNumber = stripNumber;
	}

	public String getBuySellIndicator() {
		return buySellIndicator;
	}

	public void setBuySellIndicator(String buySellIndicator) {
		this.buySellIndicator = buySellIndicator;
	}

	public Integer getQuantityAmount() {
		return quantityAmount;
	}

	public void setQuantityAmount(Integer quantityAmount) {
		this.quantityAmount = quantityAmount;
	}

	public Integer getQuantityUnitsRduomFk() {
		return quantityUnitsRduomFk;
	}

	public void setQuantityUnitsRduomFk(Integer quantityUnitsRduomFk) {
		this.quantityUnitsRduomFk = quantityUnitsRduomFk;
	}

	public Integer getPriceADeprcFk() {
		return priceADeprcFk;
	}

	public void setPriceADeprcFk(Integer priceADeprcFk) {
		this.priceADeprcFk = priceADeprcFk;
	}

	public Integer getPriceBDeprcFk() {
		return priceBDeprcFk;
	}

	public void setPriceBDeprcFk(Integer priceBDeprcFk) {
		this.priceBDeprcFk = priceBDeprcFk;
	}

	public Integer getSettlementDesetFk() {
		return settlementDesetFk;
	}

	public void setSettlementDesetFk(Integer settlementDesetFk) {
		this.settlementDesetFk = settlementDesetFk;
	}

	public String getNonStandardPricing() {
		return nonStandardPricing;
	}

	public void setNonStandardPricing(String nonStandardPricing) {
		this.nonStandardPricing = nonStandardPricing;
	}

	public String getNonStandardSettlement() {
		return nonStandardSettlement;
	}

	public void setNonStandardSettlement(String nonStandardSettlement) {
		this.nonStandardSettlement = nonStandardSettlement;
	}

	public Integer getIstBoSystemRdcodFk() {
		return istBoSystemRdcodFk;
	}

	public void setIstBoSystemRdcodFk(Integer istBoSystemRdcodFk) {
		this.istBoSystemRdcodFk = istBoSystemRdcodFk;
	}

	public Integer getCpBoSystemRdcodFk() {
		return cpBoSystemRdcodFk;
	}

	public void setCpBoSystemRdcodFk(Integer cpBoSystemRdcodFk) {
		this.cpBoSystemRdcodFk = cpBoSystemRdcodFk;
	}

	public Integer getPricingSystemRdcodFk() {
		return pricingSystemRdcodFk;
	}

	public void setPricingSystemRdcodFk(Integer pricingSystemRdcodFk) {
		this.pricingSystemRdcodFk = pricingSystemRdcodFk;
	}

	public Integer getLegLastUpdateUser() {
		return legLastUpdateUser;
	}

	public void setLegLastUpdateUser(Integer legLastUpdateUser) {
		this.legLastUpdateUser = legLastUpdateUser;
	}

	public Date getLegLastUpdateTime() {
		return legLastUpdateTime;
	}

	public void setLegLastUpdateTime(Date legLastUpdateTime) {
		this.legLastUpdateTime = legLastUpdateTime;
	}
}
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
 * A table that deals with Deal Pricing.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEPRT_PRICING_TERM")
@EntityListeners(BaseTableListener.class)
public class DeprtPricingTermDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPRT_PK")
	private Integer deprtPk;

	@Column(name = "PRICING_DEPRC_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer pricingDeprcFk;
	
	@Column(name = "PRCG_TERM_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer prcgTermTypeRdcodFk;
	
	@Column(name = "FLOOR_CEILING_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer floorCeilingRdcodFk;
	
	@Column(name = "PERCENTAGE_WEIGHTING")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal percentageWeighting;
	
	@Column(name = "QUANTITY_AMOUNT")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal quantityAmount;
	
	@Column(name = "QUANTITY_UNITS_RDUOM_PK")
	@Basic(fetch = FetchType.EAGER)
	private Integer quantityUnitsRduomPk;
	
	@Column(name = "REMAINING_QUANTITY_IND")
	@Basic(fetch = FetchType.EAGER)
	private String remainingQuantityInd;
	
	@Column(name = "OPTIONAL_IND")
	@Basic(fetch = FetchType.EAGER)
	private String optionalInd;
	
	@Column(name = "PRICING_TERM_NUMBER")
	@Basic(fetch = FetchType.EAGER)
	private Integer pricingTermNumber;
	
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

	public Integer getDeprtPk() {
		return deprtPk;
	}

	public void setDeprtPk(Integer deprtPk) {
		this.deprtPk = deprtPk;
	}

	public Integer getPricingDeprcFk() {
		return pricingDeprcFk;
	}

	public void setPricingDeprcFk(Integer pricingDeprcFk) {
		this.pricingDeprcFk = pricingDeprcFk;
	}

	public Integer getPrcgTermTypeRdcodFk() {
		return prcgTermTypeRdcodFk;
	}

	public void setPrcgTermTypeRdcodFk(Integer prcgTermTypeRdcodFk) {
		this.prcgTermTypeRdcodFk = prcgTermTypeRdcodFk;
	}

	public Integer getFloorCeilingRdcodFk() {
		return floorCeilingRdcodFk;
	}

	public void setFloorCeilingRdcodFk(Integer floorCeilingRdcodFk) {
		this.floorCeilingRdcodFk = floorCeilingRdcodFk;
	}

	public BigDecimal getPercentageWeighting() {
		return percentageWeighting;
	}

	public void setPercentageWeighting(BigDecimal percentageWeighting) {
		this.percentageWeighting = percentageWeighting;
	}

	public BigDecimal getQuantityAmount() {
		return quantityAmount;
	}

	public void setQuantityAmount(BigDecimal quantityAmount) {
		this.quantityAmount = quantityAmount;
	}

	public Integer getQuantityUnitsRduomPk() {
		return quantityUnitsRduomPk;
	}

	public void setQuantityUnitsRduomPk(Integer quantityUnitsRduomPk) {
		this.quantityUnitsRduomPk = quantityUnitsRduomPk;
	}

	public String getRemainingQuantityInd() {
		return remainingQuantityInd;
	}

	public void setRemainingQuantityInd(String remainingQuantityInd) {
		this.remainingQuantityInd = remainingQuantityInd;
	}

	public String getOptionalInd() {
		return optionalInd;
	}

	public void setOptionalInd(String optionalInd) {
		this.optionalInd = optionalInd;
	}

	public Integer getPricingTermNumber() {
		return pricingTermNumber;
	}

	public void setPricingTermNumber(Integer pricingTermNumber) {
		this.pricingTermNumber = pricingTermNumber;
	}
}
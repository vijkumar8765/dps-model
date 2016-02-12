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
 * A table that deals with Deal Pricing Lines.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEPLI_PRICING_LINES")
@EntityListeners(BaseTableListener.class)
public class DepliPricingLinesDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPLI_PK")
	private Integer depliPk;

	@Column(name = "PRICING_DEPRC_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer pricingDeprcFk;
	
	@Column(name = "FLOAT_PRICE_DEPFL_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer floatPriceDepflFk;
	
	@Column(name = "TIME_SERIES_RDTSE_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer timeSeriesRdtseFk;
	
	@Column(name = "PERCENTAGE_WEIGHTING")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private BigDecimal percentageWeighting;
	
	@Column(name = "CONVERSION_FACTOR")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal conversionFactor;
	
	@Column(name = "PREMIUM_VALUE")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal premiumValue;
	
	@Column(name = "PREMIUM_UNITS_RDPUN_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer premiumUnitsRdpunFk;
	
	@Column(name = "ROLL_RULE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer rollRuleRdcodFk;
	
	@Column(name = "PRICING_LINE_NUMBER")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer pricingLineNumber;
	
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

	public Integer getDepliPk() {
		return depliPk;
	}

	public void setDepliPk(Integer depliPk) {
		this.depliPk = depliPk;
	}

	public Integer getPricingDeprcFk() {
		return pricingDeprcFk;
	}

	public void setPricingDeprcFk(Integer pricingDeprcFk) {
		this.pricingDeprcFk = pricingDeprcFk;
	}

	public Integer getFloatPriceDepflFk() {
		return floatPriceDepflFk;
	}

	public void setFloatPriceDepflFk(Integer floatPriceDepflFk) {
		this.floatPriceDepflFk = floatPriceDepflFk;
	}

	public Integer getTimeSeriesRdtseFk() {
		return timeSeriesRdtseFk;
	}

	public void setTimeSeriesRdtseFk(Integer timeSeriesRdtseFk) {
		this.timeSeriesRdtseFk = timeSeriesRdtseFk;
	}

	public BigDecimal getPercentageWeighting() {
		return percentageWeighting;
	}

	public void setPercentageWeighting(BigDecimal percentageWeighting) {
		this.percentageWeighting = percentageWeighting;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public BigDecimal getPremiumValue() {
		return premiumValue;
	}

	public void setPremiumValue(BigDecimal premiumValue) {
		this.premiumValue = premiumValue;
	}

	public Integer getPremiumUnitsRdpunFk() {
		return premiumUnitsRdpunFk;
	}

	public void setPremiumUnitsRdpunFk(Integer premiumUnitsRdpunFk) {
		this.premiumUnitsRdpunFk = premiumUnitsRdpunFk;
	}

	public Integer getRollRuleRdcodFk() {
		return rollRuleRdcodFk;
	}

	public void setRollRuleRdcodFk(Integer rollRuleRdcodFk) {
		this.rollRuleRdcodFk = rollRuleRdcodFk;
	}

	public Integer getPricingLineNumber() {
		return pricingLineNumber;
	}

	public void setPricingLineNumber(Integer pricingLineNumber) {
		this.pricingLineNumber = pricingLineNumber;
	}
}
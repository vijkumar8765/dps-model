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
 * A table that deals with Floating Pricing Deals.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEPFL_FLOATING_PRICING")
@EntityListeners(BaseTableListener.class)
public class DepflFloatingPricingDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPFL_PK")
	private Integer depflPk;

	@Column(name = "PRICING_DEPRC_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer pricingDeprcFk;
	
	@Column(name = "PRCG_TERM_DEPRT_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer prcgTermDeprtFk;
	
	@Column(name = "PERCENTAGE_WEIGHTING")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal percentageWeighting;
	
	@Column(name = "COMMON_PRICING_BASIS")
	@Basic(fetch = FetchType.EAGER)
	private String commonPricingBasis;
	
	@Column(name = "PREMIUM_VALUE")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal premiumValue;
	
	@Column(name = "PREMIUM_UNITS_RDPUN_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer premiumUnitsRdpunFk;
	
	@Column(name = "PRCG_PERIOD_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer prcgPeriodTypeRdcodFk;
	
	@Column(name = "ALLDAY_PRICING_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer alldayPricingRdcodFk;
	
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

	public Integer getDepflPk() {
		return depflPk;
	}

	public void setDepflPk(Integer depflPk) {
		this.depflPk = depflPk;
	}

	public Integer getPricingDeprcFk() {
		return pricingDeprcFk;
	}

	public void setPricingDeprcFk(Integer pricingDeprcFk) {
		this.pricingDeprcFk = pricingDeprcFk;
	}

	public Integer getPrcgTermDeprtFk() {
		return prcgTermDeprtFk;
	}

	public void setPrcgTermDeprtFk(Integer prcgTermDeprtFk) {
		this.prcgTermDeprtFk = prcgTermDeprtFk;
	}

	public BigDecimal getPercentageWeighting() {
		return percentageWeighting;
	}

	public void setPercentageWeighting(BigDecimal percentageWeighting) {
		this.percentageWeighting = percentageWeighting;
	}

	public String getCommonPricingBasis() {
		return commonPricingBasis;
	}

	public void setCommonPricingBasis(String commonPricingBasis) {
		this.commonPricingBasis = commonPricingBasis;
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

	public Integer getPrcgPeriodTypeRdcodFk() {
		return prcgPeriodTypeRdcodFk;
	}

	public void setPrcgPeriodTypeRdcodFk(Integer prcgPeriodTypeRdcodFk) {
		this.prcgPeriodTypeRdcodFk = prcgPeriodTypeRdcodFk;
	}

	public Integer getAlldayPricingRdcodFk() {
		return alldayPricingRdcodFk;
	}

	public void setAlldayPricingRdcodFk(Integer alldayPricingRdcodFk) {
		this.alldayPricingRdcodFk = alldayPricingRdcodFk;
	}
}
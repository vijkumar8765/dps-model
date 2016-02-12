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
 * A table that deals with Fixed Pricing Deals.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEPRF_FIXED_PRICING")
@EntityListeners(BaseTableListener.class)
public class DeprfFixedPricingDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPRF_PK")
	private Integer deprfPk;

	@Column(name = "PRICING_DEPRC_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer pricingDeprcFk;
	
	@Column(name = "PRCG_TERM_DEPRT_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer prcgTermDeprtFk;
	
	@Column(name = "UNITS_RDPUN_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer unitsRdpunFk;
	
	@Column(name = "FIXED_PRICE_VALUE")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal fixedPriceValue;
	
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

	public Integer getDeprfPk() {
		return deprfPk;
	}

	public void setDeprfPk(Integer deprfPk) {
		this.deprfPk = deprfPk;
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

	public Integer getUnitsRdpunFk() {
		return unitsRdpunFk;
	}

	public void setUnitsRdpunFk(Integer unitsRdpunFk) {
		this.unitsRdpunFk = unitsRdpunFk;
	}

	public BigDecimal getFixedPriceValue() {
		return fixedPriceValue;
	}

	public void setFixedPriceValue(BigDecimal fixedPriceValue) {
		this.fixedPriceValue = fixedPriceValue;
	}
}
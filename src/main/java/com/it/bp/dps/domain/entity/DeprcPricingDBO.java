/*
 * Project : TWB
 * Copyright (C) 2016 BP Oil UK Ltd.
 * BP PROPRIETARY/CONFIDENTIAL
 */
package com.it.bp.dps.domain.entity;	//NOPMD

import java.io.Serializable;

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
@Table(schema = "DEOWNERBS1", name = "DEPRC_PRICING")
@EntityListeners(BaseTableListener.class)
public class DeprcPricingDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPRC_PK")
	private Integer deprcPk;

	@Column(name = "ROUNDING_DECIMAL_PLACES")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer roundingDecimalPlaces;
	
	@Column(name = "UNITS_RDPUN_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer unitsRdpunFk;
	
	@Column(name = "MULTIPLIER_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer multiplierTypeRdcodFk;
	
	@Column(name = "MULTIPLIER_BASE_VALUE")
	@Basic(fetch = FetchType.EAGER)
	private Integer multiplierBaseValue;
	
	@Column(name = "MULTIPLIER_EXPECTED_VALUE")
	@Basic(fetch = FetchType.EAGER)
	private Integer multiplierExpectedValue;
	
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

	public Integer getDeprcPk() {
		return deprcPk;
	}

	public void setDeprcPk(Integer deprcPk) {
		this.deprcPk = deprcPk;
	}

	public Integer getRoundingDecimalPlaces() {
		return roundingDecimalPlaces;
	}

	public void setRoundingDecimalPlaces(Integer roundingDecimalPlaces) {
		this.roundingDecimalPlaces = roundingDecimalPlaces;
	}

	public Integer getUnitsRdpunFk() {
		return unitsRdpunFk;
	}

	public void setUnitsRdpunFk(Integer unitsRdpunFk) {
		this.unitsRdpunFk = unitsRdpunFk;
	}

	public Integer getMultiplierTypeRdcodFk() {
		return multiplierTypeRdcodFk;
	}

	public void setMultiplierTypeRdcodFk(Integer multiplierTypeRdcodFk) {
		this.multiplierTypeRdcodFk = multiplierTypeRdcodFk;
	}

	public Integer getMultiplierBaseValue() {
		return multiplierBaseValue;
	}

	public void setMultiplierBaseValue(Integer multiplierBaseValue) {
		this.multiplierBaseValue = multiplierBaseValue;
	}

	public Integer getMultiplierExpectedValue() {
		return multiplierExpectedValue;
	}

	public void setMultiplierExpectedValue(Integer multiplierExpectedValue) {
		this.multiplierExpectedValue = multiplierExpectedValue;
	}
}
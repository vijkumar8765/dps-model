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
 * A table for creating Deal Conversions.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DECON_CONVERSION_BASIS")
@EntityListeners(BaseTableListener.class)
public class DeconConversionBasisDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DECON_PK")
	private Integer deconPk;

	@Column(name = "FROM_UNITS_RDUOM_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer fromUnitsRduomFk;
	
	@Column(name = "TO_UNITS_RDUOM_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer toUnitsRduomFk;
	
	@Column(name = "CARGO_DENSITY_BASIS")
	@Basic(fetch = FetchType.EAGER)
	private String cargoDensityBasis;
	
	@Column(name = "CONVERSION_FACTOR")
	@Basic(fetch = FetchType.EAGER)
	private BigDecimal conversionFactor;
	
	@Embedded
	private BaseTable baseTable;
	
	public BaseTable getBaseTable() {
		if (baseTable == null) {
			baseTable = new BaseTable();
		}
		return baseTable;
	}

	public Integer getDeconPk() {
		return deconPk;
	}

	public void setDeconPk(Integer deconPk) {
		this.deconPk = deconPk;
	}

	public Integer getFromUnitsRduomFk() {
		return fromUnitsRduomFk;
	}

	public void setFromUnitsRduomFk(Integer fromUnitsRduomFk) {
		this.fromUnitsRduomFk = fromUnitsRduomFk;
	}

	public Integer getToUnitsRduomFk() {
		return toUnitsRduomFk;
	}

	public void setToUnitsRduomFk(Integer toUnitsRduomFk) {
		this.toUnitsRduomFk = toUnitsRduomFk;
	}

	public String getCargoDensityBasis() {
		return cargoDensityBasis;
	}

	public void setCargoDensityBasis(String cargoDensityBasis) {
		this.cargoDensityBasis = cargoDensityBasis;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public void setBaseTable(BaseTable baseTable) {
		this.baseTable = baseTable;
	}
}
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
 * A table that deals with Deal Dates.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEFXD_FIXED_DATES")
@EntityListeners(BaseTableListener.class)
public class DefxdFixedDatesDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEFXD_PK")
	private Integer defxdPk;

	@Column(name = "PRICING_DEPRC_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer pricingDeprcFk;
	
	@Column(name = "FLOAT_PRICE_DEPFL_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer floatPriceDepflFk;
	
	@Column(name = "START_DATE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Date startDate;
	
	@Column(name = "END_DATE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Date endDate;
	
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

	public Integer getDefxdPk() {
		return defxdPk;
	}

	public void setDefxdPk(Integer defxdPk) {
		this.defxdPk = defxdPk;
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
}
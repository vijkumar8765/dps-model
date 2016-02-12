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
 * A table for creating Financial Swap Settlement Deals.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEOFS_FIN_SWAP_SETTLES")
@EntityListeners(BaseTableListener.class)
public class DeofsFinSwapSettlesDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEOFS_PK")
	private Integer deofsPk;

	@Column(name = "EXERCISE_UNIT_DEEXU_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer excerciseUnitDeexu_Fk;
	
	@Column(name = "EXERCISE_DESET_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer exerciseDesetFk;
	
	@Column(name = "EXERCISE_DEPRC_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer excerciseDeprcFk;
	
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

	public Integer getDeofsPk() {
		return deofsPk;
	}

	public void setDeofsPk(Integer deofsPk) {
		this.deofsPk = deofsPk;
	}

	public Integer getExcerciseUnitDeexu_Fk() {
		return excerciseUnitDeexu_Fk;
	}

	public void setExcerciseUnitDeexu_Fk(Integer excerciseUnitDeexu_Fk) {
		this.excerciseUnitDeexu_Fk = excerciseUnitDeexu_Fk;
	}

	public Integer getExerciseDesetFk() {
		return exerciseDesetFk;
	}

	public void setExerciseDesetFk(Integer exerciseDesetFk) {
		this.exerciseDesetFk = exerciseDesetFk;
	}

	public Integer getExcerciseDeprcFk() {
		return excerciseDeprcFk;
	}

	public void setExcerciseDeprcFk(Integer excerciseDeprcFk) {
		this.excerciseDeprcFk = excerciseDeprcFk;
	}


}
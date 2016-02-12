/*
 * Project : TWB
 * Copyright (C) 2016 BP Oil UK Ltd.
 * BP PROPRIETARY/CONFIDENTIAL
 */
package com.it.bp.dps.domain.entity;	//NOPMD

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.it.bp.dps.domain.entity.base.BaseTableListener;

/**
 * A table that writes audit entries for Deals.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "NGAUF_AUDIT_FIELD")
@EntityListeners(BaseTableListener.class)
public class NgaufAuditFieldDBO implements Serializable{

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NGAUF_PK")
	private Integer ngaufPk;

	@Column(name = "OBJECT_NGAUO_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer objectNgauoFk;
	
	@Column(name = "FIELD_NAME")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String fieldName;
	
	@Column(name = "FROM_VALUE")
	@Basic(fetch = FetchType.EAGER)
	private String fromValue;
	
	@Column(name = "TO_VALUE")
	@Basic(fetch = FetchType.EAGER)
	private String toValue;

	public Integer getNgaufPk() {
		return ngaufPk;
	}

	public void setNgaufPk(Integer ngaufPk) {
		this.ngaufPk = ngaufPk;
	}

	public Integer getObjectNgauoFk() {
		return objectNgauoFk;
	}

	public void setObjectNgauoFk(Integer objectNgauoFk) {
		this.objectNgauoFk = objectNgauoFk;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFromValue() {
		return fromValue;
	}

	public void setFromValue(String fromValue) {
		this.fromValue = fromValue;
	}

	public String getToValue() {
		return toValue;
	}

	public void setToValue(String toValue) {
		this.toValue = toValue;
	}
	
	
}
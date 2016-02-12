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
 * A table that deals with Audit Entries for Deals.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "NGAUO_AUDIT_OBJECT")
@EntityListeners(BaseTableListener.class)
public class NgauoAuditObjectDBO implements Serializable {
	  
	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NGAUO_PK")
	private Integer ngauoPk;

	@Column(name = "TRANSACTION_NGAUT_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer transactionNgautFk;
	
	@Column(name = "PARENT_NAME")
	@Basic(fetch = FetchType.EAGER)
	private String parentName;
	
	@Column(name = "PARENT_FK")
	@Basic(fetch = FetchType.EAGER)
	private Integer parentFk;
	
	@Column(name = "OBJECT_NAME")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String objectName;
	
	@Column(name = "OBJECT_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer objectFk;
	
	@Column(name = "ACTION")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String action;
	
	@Column(name = "ROOT_ID")
	@Basic(fetch = FetchType.EAGER)
	private Integer rootId;
	
	@Column(name = "ROOT_NAME")
	@Basic(fetch = FetchType.EAGER)
	private Integer rootName;

	public Integer getNgauoPk() {
		return ngauoPk;
	}

	public void setNgauoPk(Integer ngauoPk) {
		this.ngauoPk = ngauoPk;
	}

	public Integer getTransactionNgautFk() {
		return transactionNgautFk;
	}

	public void setTransactionNgautFk(Integer transactionNgautFk) {
		this.transactionNgautFk = transactionNgautFk;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Integer getParentFk() {
		return parentFk;
	}

	public void setParentFk(Integer parentFk) {
		this.parentFk = parentFk;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public Integer getObjectFk() {
		return objectFk;
	}

	public void setObjectFk(Integer objectFk) {
		this.objectFk = objectFk;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getRootId() {
		return rootId;
	}

	public void setRootId(Integer rootId) {
		this.rootId = rootId;
	}

	public Integer getRootName() {
		return rootName;
	}

	public void setRootName(Integer rootName) {
		this.rootName = rootName;
	}
}
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.it.bp.dps.domain.entity.base.BaseTable;
import com.it.bp.dps.domain.entity.base.BaseTableAware;
import com.it.bp.dps.domain.entity.base.BaseTableListener;

/**
 * A table that is used for creating messaging events.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DEMRL_MSG_REPUBLISH_LOG")
@EntityListeners(BaseTableListener.class)
public class DemrlMsgRepublishLogDBO implements BaseTableAware, Serializable {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEMRL_PK")
	private Integer demrlPk;
	
	@Column(name = "REPUBLISH_TIME")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date republishTime;
	
	@Column(name = "MESSAGE_TYPE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String messageType;
	
	@Column(name = "NGPUB_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer ngpubFk;
	
	@Column(name = "PK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer pk;
	
	@Column(name = "BK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String bk;
	
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

	public Integer getDemrlPk() {
		return demrlPk;
	}

	public void setDemrlPk(Integer demrlPk) {
		this.demrlPk = demrlPk;
	}

	public Date getRepublishTime() {
		return republishTime;
	}

	public void setRepublishTime(Date republishTime) {
		this.republishTime = republishTime;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Integer getNgpubFk() {
		return ngpubFk;
	}

	public void setNgpubFk(Integer ngpubFk) {
		this.ngpubFk = ngpubFk;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getBk() {
		return bk;
	}

	public void setBk(String bk) {
		this.bk = bk;
	}
}
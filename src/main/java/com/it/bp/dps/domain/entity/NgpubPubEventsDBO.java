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
 * A table that is used for creating messaging events.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "NGPUB_PUB_EVENTS")
@EntityListeners(BaseTableListener.class)
public class NgpubPubEventsDBO implements Serializable {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NGPUB_PK")
	private Integer ngpubPk;

	@Column(name = "MESSAGE_TYPE")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String messageType;
	
	@Column(name = "TIME_STAMP")
	@Basic(fetch = FetchType.EAGER)
	private String timeStamp;
	
	@Column(name = "COMPONENT")
	@Basic(fetch = FetchType.EAGER)
	private String component;
	
	@Column(name = "SOURCE")
	@Basic(fetch = FetchType.EAGER)
	private String source;
	
	@Column(name = "TARGET")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private String target;
	
	@Column(name = "MESSAGE_ID")
	@Basic(fetch = FetchType.EAGER)
	private String messageId;
	
	@Column(name = "MESSAGE_VERSION")
	@Basic(fetch = FetchType.EAGER)
	private Integer messageVersion;
	
	@Column(name = "CORRELATION_ID")
	@Basic(fetch = FetchType.EAGER)
	private String correlationId;
	
	@Column(name = "CORRELATION_VERSION")
	@Basic(fetch = FetchType.EAGER)
	private Integer correlationVersion;
	
	@Column(name = "EVENT_XML")
	@Basic(fetch = FetchType.EAGER)
	private java.sql.Clob eventXml;

	public Integer getNgpubPk() {
		return ngpubPk;
	}

	public void setNgpubPk(Integer ngpubPk) {
		this.ngpubPk = ngpubPk;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Integer getMessageVersion() {
		return messageVersion;
	}

	public void setMessageVersion(Integer messageVersion) {
		this.messageVersion = messageVersion;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public Integer getCorrelationVersion() {
		return correlationVersion;
	}

	public void setCorrelationVersion(Integer correlationVersion) {
		this.correlationVersion = correlationVersion;
	}

	public java.sql.Clob getEventXml() {
		return eventXml;
	}

	public void setEventXml(java.sql.Clob eventXml) {
		this.eventXml = eventXml;
	}
}
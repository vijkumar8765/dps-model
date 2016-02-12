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
@Table(schema = "DEOWNERBS1", name = "SKIP_MESSAGES")
@EntityListeners(BaseTableListener.class)
public class SkipMessagesDBO implements Serializable {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MESSAGE_VERSION")
	private Integer messageVersion;
	
	@Column(name = "TIME_STAMP")
	@Basic(fetch = FetchType.EAGER)
	private String timeStamp;
	
	@Column(name = "SOURCE")
	@Basic(fetch = FetchType.EAGER)
	private String source;
	
	@Column(name = "TARGET")
	@Basic(fetch = FetchType.EAGER)
	private String target;
	
	@Column(name = "MESSAGE_TYPE")
	@Basic(fetch = FetchType.EAGER)
	private String messageType;
	
	@Column(name = "JMSTIMESTAMP")
	@Basic(fetch = FetchType.EAGER)
	private String JmsTimestamp;
	
	@Column(name = "ILMESSAGEID")
	@Basic(fetch = FetchType.EAGER)
	private String ilMessageId;
	
	@Column(name = "MESSAGE_GROUP")
	@Basic(fetch = FetchType.EAGER)
	private String messageGroup;
	
	@Column(name = "MESSAGE_ID")
	@Basic(fetch = FetchType.EAGER)
	private String messageId;
	
	@Column(name = "NGPUB_PK")
	@Basic(fetch = FetchType.EAGER)
	private Integer ngpubPk;
	
	@Column(name = "SKIP_USER")
	@Basic(fetch = FetchType.EAGER)
	private String skipUser;
	
	@Column(name = "SKIP_TIME")
	@Basic(fetch = FetchType.EAGER)
	private String skipTime;
	
	@Column(name = "JMS_MESSAGE_ID")
	@Basic(fetch = FetchType.EAGER)
	private String jmsMessageId;
	
	@Column(name = "EVENT_XML")
	@Basic(fetch = FetchType.EAGER)
	private java.sql.Clob eventXml;

	public Integer getMessageVersion() {
		return messageVersion;
	}

	public void setMessageVersion(Integer messageVersion) {
		this.messageVersion = messageVersion;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
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

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getJmsTimestamp() {
		return JmsTimestamp;
	}

	public void setJmsTimestamp(String jmsTimestamp) {
		JmsTimestamp = jmsTimestamp;
	}

	public String getIlMessageId() {
		return ilMessageId;
	}

	public void setIlMessageId(String ilMessageId) {
		this.ilMessageId = ilMessageId;
	}

	public String getMessageGroup() {
		return messageGroup;
	}

	public void setMessageGroup(String messageGroup) {
		this.messageGroup = messageGroup;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Integer getNgpubPk() {
		return ngpubPk;
	}

	public void setNgpubPk(Integer ngpubPk) {
		this.ngpubPk = ngpubPk;
	}

	public String getSkipUser() {
		return skipUser;
	}

	public void setSkipUser(String skipUser) {
		this.skipUser = skipUser;
	}

	public String getSkipTime() {
		return skipTime;
	}

	public void setSkipTime(String skipTime) {
		this.skipTime = skipTime;
	}

	public String getJmsMessageId() {
		return jmsMessageId;
	}

	public void setJmsMessageId(String jmsMessageId) {
		this.jmsMessageId = jmsMessageId;
	}

	public java.sql.Clob getEventXml() {
		return eventXml;
	}

	public void setEventXml(java.sql.Clob eventXml) {
		this.eventXml = eventXml;
	}
}
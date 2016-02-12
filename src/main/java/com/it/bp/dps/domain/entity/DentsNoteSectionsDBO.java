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
 * A table for creating Deal Notes Sections.
 */
@Entity
@Table(schema = "DEOWNERBS1", name = "DENTS_NOTE_SECTIONS")
@EntityListeners(BaseTableListener.class)
public class DentsNoteSectionsDBO implements Serializable, BaseTableAware {

	/**
	 * generated serialVersion UID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull	
	@Basic(fetch = FetchType.EAGER)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DENTS_PK")
	private Integer dentsPk;

	@Column(name = "DEAL_DEDEL_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer dealdedelFk;
	
	@Column(name = "NOTES_TEXT")
	@Basic(fetch = FetchType.EAGER)
	private String notesText;
	
	@Column(name = "AUTHOR_SCUSR_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer authorScusrFk;
	
	@Column(name = "DATE_TIME_ADDED")
	@Basic(fetch = FetchType.EAGER)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date dateTimeAdded;
	
	@Column(name = "NOTE_TYPE_RDCOD_FK")
	@Basic(fetch = FetchType.EAGER)
	@NotNull
	private Integer noteTypeRdcodFk;
	
	@Embedded
	private BaseTable baseTable;
	
	public BaseTable getBaseTable() {
		if (baseTable == null) {
			baseTable = new BaseTable();
		}
		return baseTable;
	}

	public Integer getDentsPk() {
		return dentsPk;
	}

	public void setDentsPk(Integer dentsPk) {
		this.dentsPk = dentsPk;
	}

	public Integer getDealdedelFk() {
		return dealdedelFk;
	}

	public void setDealdedelFk(Integer dealdedelFk) {
		this.dealdedelFk = dealdedelFk;
	}

	public String getNotesText() {
		return notesText;
	}

	public void setNotesText(String notesText) {
		this.notesText = notesText;
	}

	public Integer getAuthorScusrFk() {
		return authorScusrFk;
	}

	public void setAuthorScusrFk(Integer authorScusrFk) {
		this.authorScusrFk = authorScusrFk;
	}

	public Date getDateTimeAdded() {
		return dateTimeAdded;
	}

	public void setDateTimeAdded(Date dateTimeAdded) {
		this.dateTimeAdded = dateTimeAdded;
	}

	public Integer getNoteTypeRdcodFk() {
		return noteTypeRdcodFk;
	}

	public void setNoteTypeRdcodFk(Integer noteTypeRdcodFk) {
		this.noteTypeRdcodFk = noteTypeRdcodFk;
	}

	public void setBaseTable(BaseTable baseTable) {
		this.baseTable = baseTable;
	}
}
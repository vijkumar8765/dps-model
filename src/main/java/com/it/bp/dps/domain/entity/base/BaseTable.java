/*
 * Project : TWB
 * Copyright (C) 2013 BP Oil Uk Ltd.
 * BP PROPRIETARY/CONFIDENTIAL
 */
package com.it.bp.dps.domain.entity.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Embeddable
public class BaseTable implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "LAST_UPDATE_USER")
	@NotNull
    private Long lastUpdateUser;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATE_TIME")
    @NotNull
    private Date lastUpdateTime;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DELETED_ROW")
    private Date deletedRow;

    public void updateForWrite() {
        /*FuturesContextHeader contextHeader = FuturesContext.get();

        Long userId = contextHeader.getUserPK();

        if (userId != null) {
            lastUpdatedBy = userId;
        }

        lastUpdatedDate = new Date();*/
    }

	public Long getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(Long lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
	public Date getDeletedRow() {
		return deletedRow;
	}

	public void setDeletedRow(Date deletedRow) {
		this.deletedRow = deletedRow;
	}

    public String toString() {
		return "BaseTable(" + super.toString() + ") [lastUpdateUser=" + lastUpdateUser + ", lastUpdateTime="
				+ lastUpdateTime + ", deletedRow=" + deletedRow;
    }
}

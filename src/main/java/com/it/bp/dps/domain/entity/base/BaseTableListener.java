/*
 * Project : TWB
 * Copyright (C) 2016 BP Oil UK Ltd.
 * BP PROPRIETARY/CONFIDENTIAL
 */
package com.it.bp.dps.domain.entity.base;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * BaseTableListener implements a listener on {@link BaseTableAware}s, in order to ensure that the last updated
 * timestamp and user id are updated on every write.
 *
 * <pre><p/><table id="crc"><caption>CRC Card</caption>
 * <tr><th> Responsibilities </th><th> Collaborations </th></tr>
 * <tr><td> Ensure last updated timestamp and user id are updated on every write. </td></tr>
 * </table></pre>
 */
public class BaseTableListener {
    @PrePersist
    @PreUpdate
    public void updateAuditInfo(BaseTableAware baseTableAware) {
        baseTableAware.getBaseTable().updateForWrite();
    }
}

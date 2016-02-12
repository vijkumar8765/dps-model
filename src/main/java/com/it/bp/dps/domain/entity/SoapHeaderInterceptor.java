/*
 * Project : AFRC Futures
 * Copyright (C) 2013 Scottish Government AFRC Programme
 * AFRC PROPRIETARY/CONFIDENTIAL
 
package com.it.bp.dps.domain.entity;	//NOPMD

import java.util.List;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import uk.gov.scotland.afrc.security.integration.util.HeaderUtil;
import uk.gov.scotland.afrc.service.futurescontextheader.schema._0._1.FuturesContextHeader;

*//**
 * SoapHeaderInterceptor is an interceptor for webservice calls, that extracts the {@link FuturesContextHeader} from
 * the SOAP header, and associates with the current thread.
 *
 * <pre><p/><table id="crc"><caption>CRC Card</caption>
 * <tr><th> Responsibilities </th><th> Collaborations </th></tr>
 * <tr><td> Associate the futures context header with the current thread.</td>
 *     <td> {@link FuturesContext} </td></tr>
 * </table></pre>
 *//*
public class SoapHeaderInterceptor extends AbstractPhaseInterceptor<Message> {
    public SoapHeaderInterceptor() {
        super(Phase.PRE_INVOKE);
    }

    *//**
     * Extract the FuturesContextHeader from the message.
     * 
     * @param t The message to extract the header from.
     *//*
    public void handleMessage(Message t) {
        List<SoapHeader> soapHeaders = CastUtils.cast((List<?>) t.get(Header.HEADER_LIST));

        FuturesContextHeader contextHeader = HeaderUtil.getFuturesContextHeader(soapHeaders);
        if (contextHeader == null || contextHeader.getUserPK() == null) {
            throw new IllegalStateException("Unable to get user data from soap header");
        }
        FuturesContext.set(contextHeader);
    }
}
*/
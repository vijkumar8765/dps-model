/*
 * Project : AFRC Futures
 * Copyright (C) 2013 Scottish Government AFRC Programme
 * AFRC PROPRIETARY/CONFIDENTIAL
 
package com.it.bp.dps.domain.entity;	//NOPMD

import uk.gov.scotland.afrc.service.futurescontextheader.schema._0._1.FuturesContextHeader;

*//**
 * FuturesContext associates the {@link FuturesContextHeader} with a thread. This allows interceptors on the receiving
 * side of webservice calls to pick up this header, and associate it with the current thread for the remainder of that
 * threads execution within the invoked service.
 *
 * <p/>
 * The FuturesContextHeader can be recovered whenever needed through the {@link #get()} method.
 *
 * <p/>
 * Note: An alternative to placing the FuturesContextHeader here, would be to set it up on the JAAS security principal.
 *
 * <pre><p/><table id="crc"><caption>CRC Card</caption>
 * <tr><th> Responsibilities </th><th> Collaborations </th></tr>
 * <tr><td> Associate the futures context header with the current thread.</td>
 *     <td> {@link FuturesContextHeader} </td></tr>
 * </table></pre>
 *//*
public final class FuturesContext {

	
    private FuturesContext() {
    }

    *//** Holds the context headers per thread. *//*
    private static ThreadLocal<FuturesContextHeader> perThread = new ThreadLocal<FuturesContextHeader>();

    *//**
     * Associates the FuturesContextHeader with the current thread.
     *
     * @param contextHeader The context header to associate.
     *//*
    public static void set(FuturesContextHeader contextHeader) {
        perThread.set(contextHeader);
    }

    *//**
     * Obtains the FuturesContextHeader previously associated with the current thread.
     *
     * @return The FuturesContextHeader previously associated with the current thread.
     *
     * @throws IllegalStateException Iff no context header is associate with the current thread.
     *//*
    public static FuturesContextHeader get() {
        FuturesContextHeader contextHeader = perThread.get();

        if (contextHeader == null || contextHeader.getUserPK() == null) {
            throw new IllegalStateException("Unable to get user data from context header");
        }

        return contextHeader;
    }
}
*/
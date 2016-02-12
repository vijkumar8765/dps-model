package com.it.bp.dps.domain.entity.base.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DealIdGenerator implements IdentifierGenerator {

	static final String REGION_ASIA = "A";
	static final String REGION_EUROPE = "E";
	static final String REGION_USA = "U";
	static final String STR_EMPTY = "";
	
	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		
		String region = "E";		// TODO to get user logged in region from session
		String result = null;
		switch (region) {
		case REGION_ASIA:	
			result = getSequenceNumber(session, REGION_ASIA);
			break;
		case REGION_EUROPE:
			result = getSequenceNumber(session, REGION_EUROPE);
			break;
		case REGION_USA:
			result = getSequenceNumber(session, REGION_USA);
			break;			
		default:
			break;
		}
	    return result;
	}
	
	private String getSequenceNumber(SessionImplementor session, String region){
		
		String result = null;
		if(region == null || region.isEmpty()){
			result = "E020166667";
		}else{
			if(region.equalsIgnoreCase(REGION_ASIA)){
				Connection connection = session.connection();
			    try {
			        PreparedStatement ps = connection
			                .prepareStatement("SELECT DEDEAL_REF_SIN_SEQ.NEXTVAL AS VAL FROM DUAL");
			        ResultSet rs = ps.executeQuery();
			        if (rs.next()) {
			        	result = region + getCurrentYear() + new Long(rs.getInt("VAL")).toString();
			            System.out.println("Generated deal Reference Number: " + result);
			        }
			    } catch (SQLException e) {       
			        e.printStackTrace();
			    }
			}else if(region.equalsIgnoreCase(REGION_EUROPE)){
				Connection connection = session.connection();
			    try {
			        PreparedStatement ps = connection
			                .prepareStatement("SELECT DEDEAL_REF_LON_SEQ.NEXTVAL AS VAL FROM DUAL");
			        ResultSet rs = ps.executeQuery();
			        if (rs.next()) {
			        	result = region + getCurrentYear() + new Long(rs.getInt("VAL")).toString();
			            System.out.println("Generated deal Reference Number: " + result);
			        }
			    } catch (SQLException e) {       
			        e.printStackTrace();
			    }
			}else if(region.equalsIgnoreCase(REGION_USA)){
				Connection connection = session.connection();
			    try {
			        PreparedStatement ps = connection
			                .prepareStatement("SELECT DEDEAL_REF_CHI_SEQ.NEXTVAL AS VAL FROM DUAL");
			        ResultSet rs = ps.executeQuery();
			        if (rs.next()) {
			            result = region + getCurrentYear() + new Long(rs.getInt("VAL")).toString();
			            System.out.println("Generated deal Reference Number: " + result);
			        }
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
			}
		}
		return result;
	}
	
	private int getCurrentYear(){
		return Calendar.getInstance().get(Calendar.YEAR);
	}
}

package com.it.bp.dps.domain.dao;

import java.io.Serializable;

/**
 * Generic data access interface to define common persistence operations.
 */
public interface GenericDao <E, PK extends Serializable> {
	
	E loadById(PK id);

    void persist(E entity);  
   
    // Not yet required by data model.
    // void remove(E entity);
    
    void flush();

	E merge(E entity);

	void clear();

	boolean contains(E entity);

}
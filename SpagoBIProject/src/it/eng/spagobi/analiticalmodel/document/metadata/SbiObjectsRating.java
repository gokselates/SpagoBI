/**

SpagoBI - The Business Intelligence Free Platform

Copyright (C) 2005-2008 Engineering Ingegneria Informatica S.p.A.

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

**/
package it.eng.spagobi.analiticalmodel.document.metadata;

import it.eng.spagobi.commons.metadata.SbiHibernateModel;
// Generated 23-apr-2008 15.08.55 by Hibernate Tools 3.1.0 beta3



/**
 * SbiObjectsRating generated by hbm2java
 */

public class SbiObjectsRating  extends SbiHibernateModel {


    // Fields    

     private SbiObjectsRatingId id;
     private SbiObjects sbiObjects;
     private Integer rating;


    // Constructors

    /**
     * default constructor.
     */
    public SbiObjectsRating() {
    }

    
    /**
     * full constructor.
     * 
     * @param id the id
     * @param sbiObjects the sbi objects
     * @param rating the rating
     */
    public SbiObjectsRating(SbiObjectsRatingId id, SbiObjects sbiObjects, Integer rating) {
        this.id = id;
        this.sbiObjects = sbiObjects;
        this.rating = rating;
    }
    

   
    // Property accessors

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public SbiObjectsRatingId getId() {
        return this.id;
    }
    
    /**
     * Sets the id.
     * 
     * @param id the new id
     */
    public void setId(SbiObjectsRatingId id) {
        this.id = id;
    }

    /**
     * Gets the sbi objects.
     * 
     * @return the sbi objects
     */
    public SbiObjects getSbiObjects() {
        return this.sbiObjects;
    }
    
    /**
     * Sets the sbi objects.
     * 
     * @param sbiObjects the new sbi objects
     */
    public void setSbiObjects(SbiObjects sbiObjects) {
        this.sbiObjects = sbiObjects;
    }

    /**
     * Gets the rating.
     * 
     * @return the rating
     */
    public Integer getRating() {
        return this.rating;
    }
    
    /**
     * Sets the rating.
     * 
     * @param rating the new rating
     */
    public void setRating(Integer rating) {
        this.rating = rating;
    }
   








}

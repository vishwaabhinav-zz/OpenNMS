/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.reporting;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * 24 hour clock time
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Time implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * hours
     */
    private int _hours;

    /**
     * keeps track of state for field: _hours
     */
    private boolean _has_hours;

    /**
     * minutes
     */
    private int _minutes;

    /**
     * keeps track of state for field: _minutes
     */
    private boolean _has_minutes;


      //----------------/
     //- Constructors -/
    //----------------/

    public Time() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteHours(
    ) {
        this._has_hours= false;
    }

    /**
     */
    public void deleteMinutes(
    ) {
        this._has_minutes= false;
    }

    /**
     * Overrides the java.lang.Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final java.lang.Object obj) {
        if ( this == obj )
            return true;
        
        if (obj instanceof Time) {
        
            Time temp = (Time)obj;
            if (this._hours != temp._hours)
                return false;
            if (this._has_hours != temp._has_hours)
                return false;
            if (this._minutes != temp._minutes)
                return false;
            if (this._has_minutes != temp._has_minutes)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'hours'. The field 'hours' has
     * the following description: hours
     * 
     * @return the value of field 'Hours'.
     */
    public int getHours(
    ) {
        return this._hours;
    }

    /**
     * Returns the value of field 'minutes'. The field 'minutes'
     * has the following description: minutes
     * 
     * @return the value of field 'Minutes'.
     */
    public int getMinutes(
    ) {
        return this._minutes;
    }

    /**
     * Method hasHours.
     * 
     * @return true if at least one Hours has been added
     */
    public boolean hasHours(
    ) {
        return this._has_hours;
    }

    /**
     * Method hasMinutes.
     * 
     * @return true if at least one Minutes has been added
     */
    public boolean hasMinutes(
    ) {
        return this._has_minutes;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = 17;
        
        long tmp;
        result = 37 * result + _hours;
        result = 37 * result + _minutes;
        
        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'hours'. The field 'hours' has the
     * following description: hours
     * 
     * @param hours the value of field 'hours'.
     */
    public void setHours(
            final int hours) {
        this._hours = hours;
        this._has_hours = true;
    }

    /**
     * Sets the value of field 'minutes'. The field 'minutes' has
     * the following description: minutes
     * 
     * @param minutes the value of field 'minutes'.
     */
    public void setMinutes(
            final int minutes) {
        this._minutes = minutes;
        this._has_minutes = true;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.opennms.netmgt.config.reporting.Time
     */
    public static org.opennms.netmgt.config.reporting.Time unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reporting.Time) Unmarshaller.unmarshal(org.opennms.netmgt.config.reporting.Time.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}

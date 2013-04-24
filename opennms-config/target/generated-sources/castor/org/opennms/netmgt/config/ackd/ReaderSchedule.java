/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.ackd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A very basic configuration for defining simple input to a
 * schedule (java.lang.concurrent)
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ReaderSchedule implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _interval.
     */
    private long _interval = 1;

    /**
     * keeps track of state for field: _interval
     */
    private boolean _has_interval;

    /**
     * Field _unit.
     */
    private java.lang.String _unit = "m";


      //----------------/
     //- Constructors -/
    //----------------/

    public ReaderSchedule() {
        super();
        setUnit("m");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteInterval(
    ) {
        this._has_interval= false;
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
        
        if (obj instanceof ReaderSchedule) {
        
            ReaderSchedule temp = (ReaderSchedule)obj;
            if (this._interval != temp._interval)
                return false;
            if (this._has_interval != temp._has_interval)
                return false;
            if (this._unit != null) {
                if (temp._unit == null) return false;
                else if (!(this._unit.equals(temp._unit))) 
                    return false;
            }
            else if (temp._unit != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'interval'.
     * 
     * @return the value of field 'Interval'.
     */
    public long getInterval(
    ) {
        return this._interval;
    }

    /**
     * Returns the value of field 'unit'.
     * 
     * @return the value of field 'Unit'.
     */
    public java.lang.String getUnit(
    ) {
        return this._unit;
    }

    /**
     * Method hasInterval.
     * 
     * @return true if at least one Interval has been added
     */
    public boolean hasInterval(
    ) {
        return this._has_interval;
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
        result = 37 * result + (int)(_interval^(_interval>>>32));
        if (_unit != null) {
           result = 37 * result + _unit.hashCode();
        }
        
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
     * Sets the value of field 'interval'.
     * 
     * @param interval the value of field 'interval'.
     */
    public void setInterval(
            final long interval) {
        this._interval = interval;
        this._has_interval = true;
    }

    /**
     * Sets the value of field 'unit'.
     * 
     * @param unit the value of field 'unit'.
     */
    public void setUnit(
            final java.lang.String unit) {
        this._unit = unit;
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
     * org.opennms.netmgt.config.ackd.ReaderSchedule
     */
    public static org.opennms.netmgt.config.ackd.ReaderSchedule unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.ackd.ReaderSchedule) Unmarshaller.unmarshal(org.opennms.netmgt.config.ackd.ReaderSchedule.class, reader);
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

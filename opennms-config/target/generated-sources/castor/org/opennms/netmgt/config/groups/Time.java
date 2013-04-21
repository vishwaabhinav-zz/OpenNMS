/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.groups;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * defines start/end time for the outage
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Time implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * an identifier for this event used for reference in the web
     * gui. If this
     *  identifer is not assigned it will be assigned an identifer
     * by web gui.
     *  
     */
    private java.lang.String _id;

    /**
     * Field _day.
     */
    private java.lang.String _day;

    /**
     * when the outage starts
     */
    private java.lang.String _begins;

    /**
     * when the outage ends
     */
    private java.lang.String _ends;


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
            if (this._id != null) {
                if (temp._id == null) return false;
                else if (!(this._id.equals(temp._id))) 
                    return false;
            }
            else if (temp._id != null)
                return false;
            if (this._day != null) {
                if (temp._day == null) return false;
                else if (!(this._day.equals(temp._day))) 
                    return false;
            }
            else if (temp._day != null)
                return false;
            if (this._begins != null) {
                if (temp._begins == null) return false;
                else if (!(this._begins.equals(temp._begins))) 
                    return false;
            }
            else if (temp._begins != null)
                return false;
            if (this._ends != null) {
                if (temp._ends == null) return false;
                else if (!(this._ends.equals(temp._ends))) 
                    return false;
            }
            else if (temp._ends != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'begins'. The field 'begins' has
     * the following description: when the outage starts
     * 
     * @return the value of field 'Begins'.
     */
    public java.lang.String getBegins(
    ) {
        return this._begins;
    }

    /**
     * Returns the value of field 'day'.
     * 
     * @return the value of field 'Day'.
     */
    public java.lang.String getDay(
    ) {
        return this._day;
    }

    /**
     * Returns the value of field 'ends'. The field 'ends' has the
     * following description: when the outage ends
     * 
     * @return the value of field 'Ends'.
     */
    public java.lang.String getEnds(
    ) {
        return this._ends;
    }

    /**
     * Returns the value of field 'id'. The field 'id' has the
     * following description: an identifier for this event used for
     * reference in the web gui. If this
     *  identifer is not assigned it will be assigned an identifer
     * by web gui.
     *  
     * 
     * @return the value of field 'Id'.
     */
    public java.lang.String getId(
    ) {
        return this._id;
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
        if (_id != null) {
           result = 37 * result + _id.hashCode();
        }
        if (_day != null) {
           result = 37 * result + _day.hashCode();
        }
        if (_begins != null) {
           result = 37 * result + _begins.hashCode();
        }
        if (_ends != null) {
           result = 37 * result + _ends.hashCode();
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
     * Sets the value of field 'begins'. The field 'begins' has the
     * following description: when the outage starts
     * 
     * @param begins the value of field 'begins'.
     */
    public void setBegins(
            final java.lang.String begins) {
        this._begins = begins;
    }

    /**
     * Sets the value of field 'day'.
     * 
     * @param day the value of field 'day'.
     */
    public void setDay(
            final java.lang.String day) {
        this._day = day;
    }

    /**
     * Sets the value of field 'ends'. The field 'ends' has the
     * following description: when the outage ends
     * 
     * @param ends the value of field 'ends'.
     */
    public void setEnds(
            final java.lang.String ends) {
        this._ends = ends;
    }

    /**
     * Sets the value of field 'id'. The field 'id' has the
     * following description: an identifier for this event used for
     * reference in the web gui. If this
     *  identifer is not assigned it will be assigned an identifer
     * by web gui.
     *  
     * 
     * @param id the value of field 'id'.
     */
    public void setId(
            final java.lang.String id) {
        this._id = id;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.groups.Time
     */
    public static org.opennms.netmgt.config.groups.Time unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.groups.Time) Unmarshaller.unmarshal(org.opennms.netmgt.config.groups.Time.class, reader);
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

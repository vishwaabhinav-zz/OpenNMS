/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rancid.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A map from sysoids masks and rancid device type.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Mapping implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * sysoid to match.
     */
    private java.lang.String _sysoidMask;

    /**
     * The rancid device type 
     *  for the specified sysoid mask.
     */
    private java.lang.String _type;


      //----------------/
     //- Constructors -/
    //----------------/

    public Mapping() {
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
        
        if (obj instanceof Mapping) {
        
            Mapping temp = (Mapping)obj;
            if (this._sysoidMask != null) {
                if (temp._sysoidMask == null) return false;
                else if (!(this._sysoidMask.equals(temp._sysoidMask))) 
                    return false;
            }
            else if (temp._sysoidMask != null)
                return false;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type))) 
                    return false;
            }
            else if (temp._type != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'sysoidMask'. The field
     * 'sysoidMask' has the following description: sysoid to match.
     * 
     * @return the value of field 'SysoidMask'.
     */
    public java.lang.String getSysoidMask(
    ) {
        return this._sysoidMask;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: The rancid device type 
     *  for the specified sysoid mask.
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
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
        if (_sysoidMask != null) {
           result = 37 * result + _sysoidMask.hashCode();
        }
        if (_type != null) {
           result = 37 * result + _type.hashCode();
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
     * Sets the value of field 'sysoidMask'. The field 'sysoidMask'
     * has the following description: sysoid to match.
     * 
     * @param sysoidMask the value of field 'sysoidMask'.
     */
    public void setSysoidMask(
            final java.lang.String sysoidMask) {
        this._sysoidMask = sysoidMask;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: The rancid device type 
     *  for the specified sysoid mask.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
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
     * org.opennms.netmgt.config.rancid.adapter.Mapping
     */
    public static org.opennms.netmgt.config.rancid.adapter.Mapping unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rancid.adapter.Mapping) Unmarshaller.unmarshal(org.opennms.netmgt.config.rancid.adapter.Mapping.class, reader);
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

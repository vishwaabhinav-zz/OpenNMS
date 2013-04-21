/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.vulnscand;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Settings that apply to all managed
 *  interfaces
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ManagedInterfaces implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _scanLevel.
     */
    private int _scanLevel;

    /**
     * keeps track of state for field: _scanLevel
     */
    private boolean _has_scanLevel;

    /**
     * Field _status.
     */
    private boolean _status;

    /**
     * keeps track of state for field: _status
     */
    private boolean _has_status;


      //----------------/
     //- Constructors -/
    //----------------/

    public ManagedInterfaces() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteScanLevel(
    ) {
        this._has_scanLevel= false;
    }

    /**
     */
    public void deleteStatus(
    ) {
        this._has_status= false;
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
        
        if (obj instanceof ManagedInterfaces) {
        
            ManagedInterfaces temp = (ManagedInterfaces)obj;
            if (this._scanLevel != temp._scanLevel)
                return false;
            if (this._has_scanLevel != temp._has_scanLevel)
                return false;
            if (this._status != temp._status)
                return false;
            if (this._has_status != temp._has_status)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'scanLevel'.
     * 
     * @return the value of field 'ScanLevel'.
     */
    public int getScanLevel(
    ) {
        return this._scanLevel;
    }

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'Status'.
     */
    public boolean getStatus(
    ) {
        return this._status;
    }

    /**
     * Method hasScanLevel.
     * 
     * @return true if at least one ScanLevel has been added
     */
    public boolean hasScanLevel(
    ) {
        return this._has_scanLevel;
    }

    /**
     * Method hasStatus.
     * 
     * @return true if at least one Status has been added
     */
    public boolean hasStatus(
    ) {
        return this._has_status;
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
        result = 37 * result + _scanLevel;
        result = 37 * result + (_status?0:1);
        
        return result;
    }

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'Status'.
     */
    public boolean isStatus(
    ) {
        return this._status;
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
     * Sets the value of field 'scanLevel'.
     * 
     * @param scanLevel the value of field 'scanLevel'.
     */
    public void setScanLevel(
            final int scanLevel) {
        this._scanLevel = scanLevel;
        this._has_scanLevel = true;
    }

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final boolean status) {
        this._status = status;
        this._has_status = true;
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
     * org.opennms.netmgt.config.vulnscand.ManagedInterfaces
     */
    public static org.opennms.netmgt.config.vulnscand.ManagedInterfaces unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vulnscand.ManagedInterfaces) Unmarshaller.unmarshal(org.opennms.netmgt.config.vulnscand.ManagedInterfaces.class, reader);
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

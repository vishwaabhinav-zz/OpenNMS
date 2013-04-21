/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.snmpAsset.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class AssetField.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class AssetField implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _formatString.
     */
    private java.lang.String _formatString;

    /**
     * Field _mibObjs.
     */
    private org.opennms.netmgt.config.snmpAsset.adapter.MibObjs _mibObjs;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssetField() {
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
        
        if (obj instanceof AssetField) {
        
            AssetField temp = (AssetField)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._formatString != null) {
                if (temp._formatString == null) return false;
                else if (!(this._formatString.equals(temp._formatString))) 
                    return false;
            }
            else if (temp._formatString != null)
                return false;
            if (this._mibObjs != null) {
                if (temp._mibObjs == null) return false;
                else if (!(this._mibObjs.equals(temp._mibObjs))) 
                    return false;
            }
            else if (temp._mibObjs != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'formatString'.
     * 
     * @return the value of field 'FormatString'.
     */
    public java.lang.String getFormatString(
    ) {
        return this._formatString;
    }

    /**
     * Returns the value of field 'mibObjs'.
     * 
     * @return the value of field 'MibObjs'.
     */
    public org.opennms.netmgt.config.snmpAsset.adapter.MibObjs getMibObjs(
    ) {
        return this._mibObjs;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_formatString != null) {
           result = 37 * result + _formatString.hashCode();
        }
        if (_mibObjs != null) {
           result = 37 * result + _mibObjs.hashCode();
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
     * Sets the value of field 'formatString'.
     * 
     * @param formatString the value of field 'formatString'.
     */
    public void setFormatString(
            final java.lang.String formatString) {
        this._formatString = formatString;
    }

    /**
     * Sets the value of field 'mibObjs'.
     * 
     * @param mibObjs the value of field 'mibObjs'.
     */
    public void setMibObjs(
            final org.opennms.netmgt.config.snmpAsset.adapter.MibObjs mibObjs) {
        this._mibObjs = mibObjs;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
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
     * org.opennms.netmgt.config.snmpAsset.adapter.AssetField
     */
    public static org.opennms.netmgt.config.snmpAsset.adapter.AssetField unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.snmpAsset.adapter.AssetField) Unmarshaller.unmarshal(org.opennms.netmgt.config.snmpAsset.adapter.AssetField.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.javamail;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Read and Send configuration list
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class End2endMailConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _sendmailConfigName.
     */
    private java.lang.String _sendmailConfigName;

    /**
     * Field _readmailConfigName.
     */
    private java.lang.String _readmailConfigName;


      //----------------/
     //- Constructors -/
    //----------------/

    public End2endMailConfig() {
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
        
        if (obj instanceof End2endMailConfig) {
        
            End2endMailConfig temp = (End2endMailConfig)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._sendmailConfigName != null) {
                if (temp._sendmailConfigName == null) return false;
                else if (!(this._sendmailConfigName.equals(temp._sendmailConfigName))) 
                    return false;
            }
            else if (temp._sendmailConfigName != null)
                return false;
            if (this._readmailConfigName != null) {
                if (temp._readmailConfigName == null) return false;
                else if (!(this._readmailConfigName.equals(temp._readmailConfigName))) 
                    return false;
            }
            else if (temp._readmailConfigName != null)
                return false;
            return true;
        }
        return false;
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
     * Returns the value of field 'readmailConfigName'.
     * 
     * @return the value of field 'ReadmailConfigName'.
     */
    public java.lang.String getReadmailConfigName(
    ) {
        return this._readmailConfigName;
    }

    /**
     * Returns the value of field 'sendmailConfigName'.
     * 
     * @return the value of field 'SendmailConfigName'.
     */
    public java.lang.String getSendmailConfigName(
    ) {
        return this._sendmailConfigName;
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
        if (_sendmailConfigName != null) {
           result = 37 * result + _sendmailConfigName.hashCode();
        }
        if (_readmailConfigName != null) {
           result = 37 * result + _readmailConfigName.hashCode();
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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'readmailConfigName'.
     * 
     * @param readmailConfigName the value of field
     * 'readmailConfigName'.
     */
    public void setReadmailConfigName(
            final java.lang.String readmailConfigName) {
        this._readmailConfigName = readmailConfigName;
    }

    /**
     * Sets the value of field 'sendmailConfigName'.
     * 
     * @param sendmailConfigName the value of field
     * 'sendmailConfigName'.
     */
    public void setSendmailConfigName(
            final java.lang.String sendmailConfigName) {
        this._sendmailConfigName = sendmailConfigName;
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
     * org.opennms.netmgt.config.javamail.End2endMailConfig
     */
    public static org.opennms.netmgt.config.javamail.End2endMailConfig unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.javamail.End2endMailConfig) Unmarshaller.unmarshal(org.opennms.netmgt.config.javamail.End2endMailConfig.class, reader);
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

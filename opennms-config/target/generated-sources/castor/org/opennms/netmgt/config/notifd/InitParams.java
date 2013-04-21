/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.notifd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class InitParams.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class InitParams implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _paramName.
     */
    private java.lang.String _paramName;

    /**
     * Field _paramValue.
     */
    private java.lang.String _paramValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public InitParams() {
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
        
        if (obj instanceof InitParams) {
        
            InitParams temp = (InitParams)obj;
            if (this._paramName != null) {
                if (temp._paramName == null) return false;
                else if (!(this._paramName.equals(temp._paramName))) 
                    return false;
            }
            else if (temp._paramName != null)
                return false;
            if (this._paramValue != null) {
                if (temp._paramValue == null) return false;
                else if (!(this._paramValue.equals(temp._paramValue))) 
                    return false;
            }
            else if (temp._paramValue != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'paramName'.
     * 
     * @return the value of field 'ParamName'.
     */
    public java.lang.String getParamName(
    ) {
        return this._paramName;
    }

    /**
     * Returns the value of field 'paramValue'.
     * 
     * @return the value of field 'ParamValue'.
     */
    public java.lang.String getParamValue(
    ) {
        return this._paramValue;
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
        if (_paramName != null) {
           result = 37 * result + _paramName.hashCode();
        }
        if (_paramValue != null) {
           result = 37 * result + _paramValue.hashCode();
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
     * Sets the value of field 'paramName'.
     * 
     * @param paramName the value of field 'paramName'.
     */
    public void setParamName(
            final java.lang.String paramName) {
        this._paramName = paramName;
    }

    /**
     * Sets the value of field 'paramValue'.
     * 
     * @param paramValue the value of field 'paramValue'.
     */
    public void setParamValue(
            final java.lang.String paramValue) {
        this._paramValue = paramValue;
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
     * org.opennms.netmgt.config.notifd.InitParams
     */
    public static org.opennms.netmgt.config.notifd.InitParams unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifd.InitParams) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifd.InitParams.class, reader);
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

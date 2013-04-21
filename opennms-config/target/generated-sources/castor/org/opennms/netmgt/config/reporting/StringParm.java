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
 * A string parameter passed to the report engine
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class StringParm implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name of this parameter as passed to the report
     *  engine
     */
    private java.lang.String _name;

    /**
     * the name of this parameter as displayed in the
     *  webui
     */
    private java.lang.String _displayName;

    /**
     * the type of input field used. Allows the webUI to use
     * pre-filled 
     *  drop-down boxes (reportCategorySelector) or freeText
     */
    private java.lang.String _inputType;

    /**
     * value
     */
    private java.lang.String _default;


      //----------------/
     //- Constructors -/
    //----------------/

    public StringParm() {
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
        
        if (obj instanceof StringParm) {
        
            StringParm temp = (StringParm)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._displayName != null) {
                if (temp._displayName == null) return false;
                else if (!(this._displayName.equals(temp._displayName))) 
                    return false;
            }
            else if (temp._displayName != null)
                return false;
            if (this._inputType != null) {
                if (temp._inputType == null) return false;
                else if (!(this._inputType.equals(temp._inputType))) 
                    return false;
            }
            else if (temp._inputType != null)
                return false;
            if (this._default != null) {
                if (temp._default == null) return false;
                else if (!(this._default.equals(temp._default))) 
                    return false;
            }
            else if (temp._default != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'default'. The field 'default'
     * has the following description: value
     * 
     * @return the value of field 'Default'.
     */
    public java.lang.String getDefault(
    ) {
        return this._default;
    }

    /**
     * Returns the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this parameter as displayed in the
     *  webui
     * 
     * @return the value of field 'DisplayName'.
     */
    public java.lang.String getDisplayName(
    ) {
        return this._displayName;
    }

    /**
     * Returns the value of field 'inputType'. The field
     * 'inputType' has the following description: the type of input
     * field used. Allows the webUI to use pre-filled 
     *  drop-down boxes (reportCategorySelector) or freeText
     * 
     * @return the value of field 'InputType'.
     */
    public java.lang.String getInputType(
    ) {
        return this._inputType;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: the name of this parameter as passed
     * to the report
     *  engine
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
        if (_displayName != null) {
           result = 37 * result + _displayName.hashCode();
        }
        if (_inputType != null) {
           result = 37 * result + _inputType.hashCode();
        }
        if (_default != null) {
           result = 37 * result + _default.hashCode();
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
     * Sets the value of field 'default'. The field 'default' has
     * the following description: value
     * 
     * @param _default
     * @param default the value of field 'default'.
     */
    public void setDefault(
            final java.lang.String _default) {
        this._default = _default;
    }

    /**
     * Sets the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this parameter as displayed in the
     *  webui
     * 
     * @param displayName the value of field 'displayName'.
     */
    public void setDisplayName(
            final java.lang.String displayName) {
        this._displayName = displayName;
    }

    /**
     * Sets the value of field 'inputType'. The field 'inputType'
     * has the following description: the type of input field used.
     * Allows the webUI to use pre-filled 
     *  drop-down boxes (reportCategorySelector) or freeText
     * 
     * @param inputType the value of field 'inputType'.
     */
    public void setInputType(
            final java.lang.String inputType) {
        this._inputType = inputType;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: the name of this parameter as passed
     * to the report
     *  engine
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
     * org.opennms.netmgt.config.reporting.StringParm
     */
    public static org.opennms.netmgt.config.reporting.StringParm unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reporting.StringParm) Unmarshaller.unmarshal(org.opennms.netmgt.config.reporting.StringParm.class, reader);
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

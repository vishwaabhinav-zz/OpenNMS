/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.correlation.drools.config;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Global.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Global implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This is the name as it is defined in the rules file
     */
    private java.lang.String _name;

    /**
     * This is the type that is defined in the rules file. 
     *  If a value is given then a propertyEditor for this type 
     *  is used to convert the string value to a value of the type
     *  defined here and the result is set a the global in the
     * rules
     *  file. If a value is not given the the 'ref' must be
     * specified
     *  and the app context associated with this ruleSet is used to
     *  look up the bean using the ref attribute and it must be of
     * the
     *  type specified in type.
     *  
     */
    private java.lang.String _type;

    /**
     * Field _value.
     */
    private java.lang.String _value;

    /**
     * Field _ref.
     */
    private java.lang.String _ref;


      //----------------/
     //- Constructors -/
    //----------------/

    public Global() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: This is the name as it is defined in
     * the rules file
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'ref'.
     * 
     * @return the value of field 'Ref'.
     */
    public java.lang.String getRef(
    ) {
        return this._ref;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: This is the type that is defined in
     * the rules file. 
     *  If a value is given then a propertyEditor for this type 
     *  is used to convert the string value to a value of the type
     *  defined here and the result is set a the global in the
     * rules
     *  file. If a value is not given the the 'ref' must be
     * specified
     *  and the app context associated with this ruleSet is used to
     *  look up the bean using the ref attribute and it must be of
     * the
     *  type specified in type.
     *  
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Returns the value of field 'value'.
     * 
     * @return the value of field 'Value'.
     */
    public java.lang.String getValue(
    ) {
        return this._value;
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
     * Sets the value of field 'name'. The field 'name' has the
     * following description: This is the name as it is defined in
     * the rules file
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'ref'.
     * 
     * @param ref the value of field 'ref'.
     */
    public void setRef(
            final java.lang.String ref) {
        this._ref = ref;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: This is the type that is defined in
     * the rules file. 
     *  If a value is given then a propertyEditor for this type 
     *  is used to convert the string value to a value of the type
     *  defined here and the result is set a the global in the
     * rules
     *  file. If a value is not given the the 'ref' must be
     * specified
     *  and the app context associated with this ruleSet is used to
     *  look up the bean using the ref attribute and it must be of
     * the
     *  type specified in type.
     *  
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(
            final java.lang.String value) {
        this._value = value;
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
     * org.opennms.netmgt.correlation.drools.config.Global
     */
    public static org.opennms.netmgt.correlation.drools.config.Global unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.correlation.drools.config.Global) Unmarshaller.unmarshal(org.opennms.netmgt.correlation.drools.config.Global.class, reader);
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

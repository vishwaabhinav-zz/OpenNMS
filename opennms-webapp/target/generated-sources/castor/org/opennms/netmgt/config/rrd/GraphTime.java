/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rrd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class GraphTime.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class GraphTime implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _format.
     */
    private java.lang.String _format;

    /**
     * Field _pattern.
     */
    private java.lang.String _pattern;

    /**
     * Field _value.
     */
    private java.lang.String _value;


      //----------------/
     //- Constructors -/
    //----------------/

    public GraphTime() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'format'.
     * 
     * @return the value of field 'Format'.
     */
    public java.lang.String getFormat(
    ) {
        return this._format;
    }

    /**
     * Returns the value of field 'pattern'.
     * 
     * @return the value of field 'Pattern'.
     */
    public java.lang.String getPattern(
    ) {
        return this._pattern;
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
     * Sets the value of field 'format'.
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(
            final java.lang.String format) {
        this._format = format;
    }

    /**
     * Sets the value of field 'pattern'.
     * 
     * @param pattern the value of field 'pattern'.
     */
    public void setPattern(
            final java.lang.String pattern) {
        this._pattern = pattern;
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
     * org.opennms.netmgt.config.rrd.GraphTime
     */
    public static org.opennms.netmgt.config.rrd.GraphTime unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.GraphTime) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.GraphTime.class, reader);
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

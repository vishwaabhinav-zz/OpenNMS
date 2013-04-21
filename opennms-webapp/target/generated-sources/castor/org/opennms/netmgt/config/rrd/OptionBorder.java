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
 * Class OptionBorder.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class OptionBorder implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _color.
     */
    private java.lang.String _color;

    /**
     * Field _width.
     */
    private int _width;

    /**
     * keeps track of state for field: _width
     */
    private boolean _has_width;


      //----------------/
     //- Constructors -/
    //----------------/

    public OptionBorder() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteWidth(
    ) {
        this._has_width= false;
    }

    /**
     * Returns the value of field 'color'.
     * 
     * @return the value of field 'Color'.
     */
    public java.lang.String getColor(
    ) {
        return this._color;
    }

    /**
     * Returns the value of field 'width'.
     * 
     * @return the value of field 'Width'.
     */
    public int getWidth(
    ) {
        return this._width;
    }

    /**
     * Method hasWidth.
     * 
     * @return true if at least one Width has been added
     */
    public boolean hasWidth(
    ) {
        return this._has_width;
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
     * Sets the value of field 'color'.
     * 
     * @param color the value of field 'color'.
     */
    public void setColor(
            final java.lang.String color) {
        this._color = color;
    }

    /**
     * Sets the value of field 'width'.
     * 
     * @param width the value of field 'width'.
     */
    public void setWidth(
            final int width) {
        this._width = width;
        this._has_width = true;
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
     * org.opennms.netmgt.config.rrd.OptionBorder
     */
    public static org.opennms.netmgt.config.rrd.OptionBorder unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.OptionBorder) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.OptionBorder.class, reader);
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

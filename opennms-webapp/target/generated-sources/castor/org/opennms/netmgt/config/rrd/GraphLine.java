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
 * Class GraphLine.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class GraphLine implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _datasource.
     */
    private java.lang.String _datasource;

    /**
     * Field _time1.
     */
    private java.lang.String _time1;

    /**
     * Field _time2.
     */
    private java.lang.String _time2;

    /**
     * Field _value1.
     */
    private double _value1;

    /**
     * keeps track of state for field: _value1
     */
    private boolean _has_value1;

    /**
     * Field _value2.
     */
    private double _value2;

    /**
     * keeps track of state for field: _value2
     */
    private boolean _has_value2;

    /**
     * Field _color.
     */
    private java.lang.String _color;

    /**
     * Field _legend.
     */
    private java.lang.String _legend;

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

    public GraphLine() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteValue1(
    ) {
        this._has_value1= false;
    }

    /**
     */
    public void deleteValue2(
    ) {
        this._has_value2= false;
    }

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
     * Returns the value of field 'datasource'.
     * 
     * @return the value of field 'Datasource'.
     */
    public java.lang.String getDatasource(
    ) {
        return this._datasource;
    }

    /**
     * Returns the value of field 'legend'.
     * 
     * @return the value of field 'Legend'.
     */
    public java.lang.String getLegend(
    ) {
        return this._legend;
    }

    /**
     * Returns the value of field 'time1'.
     * 
     * @return the value of field 'Time1'.
     */
    public java.lang.String getTime1(
    ) {
        return this._time1;
    }

    /**
     * Returns the value of field 'time2'.
     * 
     * @return the value of field 'Time2'.
     */
    public java.lang.String getTime2(
    ) {
        return this._time2;
    }

    /**
     * Returns the value of field 'value1'.
     * 
     * @return the value of field 'Value1'.
     */
    public double getValue1(
    ) {
        return this._value1;
    }

    /**
     * Returns the value of field 'value2'.
     * 
     * @return the value of field 'Value2'.
     */
    public double getValue2(
    ) {
        return this._value2;
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
     * Method hasValue1.
     * 
     * @return true if at least one Value1 has been added
     */
    public boolean hasValue1(
    ) {
        return this._has_value1;
    }

    /**
     * Method hasValue2.
     * 
     * @return true if at least one Value2 has been added
     */
    public boolean hasValue2(
    ) {
        return this._has_value2;
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
     * Sets the value of field 'datasource'.
     * 
     * @param datasource the value of field 'datasource'.
     */
    public void setDatasource(
            final java.lang.String datasource) {
        this._datasource = datasource;
    }

    /**
     * Sets the value of field 'legend'.
     * 
     * @param legend the value of field 'legend'.
     */
    public void setLegend(
            final java.lang.String legend) {
        this._legend = legend;
    }

    /**
     * Sets the value of field 'time1'.
     * 
     * @param time1 the value of field 'time1'.
     */
    public void setTime1(
            final java.lang.String time1) {
        this._time1 = time1;
    }

    /**
     * Sets the value of field 'time2'.
     * 
     * @param time2 the value of field 'time2'.
     */
    public void setTime2(
            final java.lang.String time2) {
        this._time2 = time2;
    }

    /**
     * Sets the value of field 'value1'.
     * 
     * @param value1 the value of field 'value1'.
     */
    public void setValue1(
            final double value1) {
        this._value1 = value1;
        this._has_value1 = true;
    }

    /**
     * Sets the value of field 'value2'.
     * 
     * @param value2 the value of field 'value2'.
     */
    public void setValue2(
            final double value2) {
        this._value2 = value2;
        this._has_value2 = true;
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
     * org.opennms.netmgt.config.rrd.GraphLine
     */
    public static org.opennms.netmgt.config.rrd.GraphLine unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.GraphLine) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.GraphLine.class, reader);
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

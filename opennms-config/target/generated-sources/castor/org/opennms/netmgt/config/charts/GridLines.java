/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.charts;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class GridLines.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class GridLines implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _visible.
     */
    private boolean _visible;

    /**
     * keeps track of state for field: _visible
     */
    private boolean _has_visible;

    /**
     * Field _rgb.
     */
    private org.opennms.netmgt.config.charts.Rgb _rgb;


      //----------------/
     //- Constructors -/
    //----------------/

    public GridLines() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteVisible(
    ) {
        this._has_visible= false;
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
        
        if (obj instanceof GridLines) {
        
            GridLines temp = (GridLines)obj;
            if (this._visible != temp._visible)
                return false;
            if (this._has_visible != temp._has_visible)
                return false;
            if (this._rgb != null) {
                if (temp._rgb == null) return false;
                else if (!(this._rgb.equals(temp._rgb))) 
                    return false;
            }
            else if (temp._rgb != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'rgb'.
     * 
     * @return the value of field 'Rgb'.
     */
    public org.opennms.netmgt.config.charts.Rgb getRgb(
    ) {
        return this._rgb;
    }

    /**
     * Returns the value of field 'visible'.
     * 
     * @return the value of field 'Visible'.
     */
    public boolean getVisible(
    ) {
        return this._visible;
    }

    /**
     * Method hasVisible.
     * 
     * @return true if at least one Visible has been added
     */
    public boolean hasVisible(
    ) {
        return this._has_visible;
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
        result = 37 * result + (_visible?0:1);
        if (_rgb != null) {
           result = 37 * result + _rgb.hashCode();
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
     * Returns the value of field 'visible'.
     * 
     * @return the value of field 'Visible'.
     */
    public boolean isVisible(
    ) {
        return this._visible;
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
     * Sets the value of field 'rgb'.
     * 
     * @param rgb the value of field 'rgb'.
     */
    public void setRgb(
            final org.opennms.netmgt.config.charts.Rgb rgb) {
        this._rgb = rgb;
    }

    /**
     * Sets the value of field 'visible'.
     * 
     * @param visible the value of field 'visible'.
     */
    public void setVisible(
            final boolean visible) {
        this._visible = visible;
        this._has_visible = true;
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
     * org.opennms.netmgt.config.charts.GridLines
     */
    public static org.opennms.netmgt.config.charts.GridLines unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.GridLines) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.GridLines.class, reader);
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

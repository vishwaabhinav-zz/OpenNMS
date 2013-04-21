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
 * Class Title.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Title implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _value.
     */
    private java.lang.String _value;

    /**
     * Field _font.
     */
    private java.lang.String _font;

    /**
     * Field _pitch.
     */
    private int _pitch;

    /**
     * keeps track of state for field: _pitch
     */
    private boolean _has_pitch;

    /**
     * Field _style.
     */
    private java.lang.String _style;

    /**
     * Field _rgb.
     */
    private org.opennms.netmgt.config.charts.Rgb _rgb;


      //----------------/
     //- Constructors -/
    //----------------/

    public Title() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deletePitch(
    ) {
        this._has_pitch= false;
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
        
        if (obj instanceof Title) {
        
            Title temp = (Title)obj;
            if (this._value != null) {
                if (temp._value == null) return false;
                else if (!(this._value.equals(temp._value))) 
                    return false;
            }
            else if (temp._value != null)
                return false;
            if (this._font != null) {
                if (temp._font == null) return false;
                else if (!(this._font.equals(temp._font))) 
                    return false;
            }
            else if (temp._font != null)
                return false;
            if (this._pitch != temp._pitch)
                return false;
            if (this._has_pitch != temp._has_pitch)
                return false;
            if (this._style != null) {
                if (temp._style == null) return false;
                else if (!(this._style.equals(temp._style))) 
                    return false;
            }
            else if (temp._style != null)
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
     * Returns the value of field 'font'.
     * 
     * @return the value of field 'Font'.
     */
    public java.lang.String getFont(
    ) {
        return this._font;
    }

    /**
     * Returns the value of field 'pitch'.
     * 
     * @return the value of field 'Pitch'.
     */
    public int getPitch(
    ) {
        return this._pitch;
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
     * Returns the value of field 'style'.
     * 
     * @return the value of field 'Style'.
     */
    public java.lang.String getStyle(
    ) {
        return this._style;
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
     * Method hasPitch.
     * 
     * @return true if at least one Pitch has been added
     */
    public boolean hasPitch(
    ) {
        return this._has_pitch;
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
        if (_value != null) {
           result = 37 * result + _value.hashCode();
        }
        if (_font != null) {
           result = 37 * result + _font.hashCode();
        }
        result = 37 * result + _pitch;
        if (_style != null) {
           result = 37 * result + _style.hashCode();
        }
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
     * Sets the value of field 'font'.
     * 
     * @param font the value of field 'font'.
     */
    public void setFont(
            final java.lang.String font) {
        this._font = font;
    }

    /**
     * Sets the value of field 'pitch'.
     * 
     * @param pitch the value of field 'pitch'.
     */
    public void setPitch(
            final int pitch) {
        this._pitch = pitch;
        this._has_pitch = true;
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
     * Sets the value of field 'style'.
     * 
     * @param style the value of field 'style'.
     */
    public void setStyle(
            final java.lang.String style) {
        this._style = style;
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
     * @return the unmarshaled org.opennms.netmgt.config.charts.Titl
     */
    public static org.opennms.netmgt.config.charts.Title unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.Title) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.Title.class, reader);
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

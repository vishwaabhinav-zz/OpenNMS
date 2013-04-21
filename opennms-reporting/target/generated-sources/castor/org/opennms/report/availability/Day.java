/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Day.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Day implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _date.
     */
    private int _date;

    /**
     * keeps track of state for field: _date
     */
    private boolean _has_date;

    /**
     * Field _pctValue.
     */
    private double _pctValue;

    /**
     * keeps track of state for field: _pctValue
     */
    private boolean _has_pctValue;

    /**
     * Field _visible.
     */
    private boolean _visible;

    /**
     * keeps track of state for field: _visible
     */
    private boolean _has_visible;


      //----------------/
     //- Constructors -/
    //----------------/

    public Day() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDate(
    ) {
        this._has_date= false;
    }

    /**
     */
    public void deletePctValue(
    ) {
        this._has_pctValue= false;
    }

    /**
     */
    public void deleteVisible(
    ) {
        this._has_visible= false;
    }

    /**
     * Returns the value of field 'date'.
     * 
     * @return the value of field 'Date'.
     */
    public int getDate(
    ) {
        return this._date;
    }

    /**
     * Returns the value of field 'pctValue'.
     * 
     * @return the value of field 'PctValue'.
     */
    public double getPctValue(
    ) {
        return this._pctValue;
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
     * Method hasDate.
     * 
     * @return true if at least one Date has been added
     */
    public boolean hasDate(
    ) {
        return this._has_date;
    }

    /**
     * Method hasPctValue.
     * 
     * @return true if at least one PctValue has been added
     */
    public boolean hasPctValue(
    ) {
        return this._has_pctValue;
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
     * Sets the value of field 'date'.
     * 
     * @param date the value of field 'date'.
     */
    public void setDate(
            final int date) {
        this._date = date;
        this._has_date = true;
    }

    /**
     * Sets the value of field 'pctValue'.
     * 
     * @param pctValue the value of field 'pctValue'.
     */
    public void setPctValue(
            final double pctValue) {
        this._pctValue = pctValue;
        this._has_pctValue = true;
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
     * @return the unmarshaled org.opennms.report.availability.Day
     */
    public static org.opennms.report.availability.Day unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Day) Unmarshaller.unmarshal(org.opennms.report.availability.Day.class, reader);
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

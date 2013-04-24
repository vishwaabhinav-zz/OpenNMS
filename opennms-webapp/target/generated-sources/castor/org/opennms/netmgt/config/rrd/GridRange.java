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
 * Class GridRange.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class GridRange implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _lower.
     */
    private double _lower;

    /**
     * keeps track of state for field: _lower
     */
    private boolean _has_lower;

    /**
     * Field _upper.
     */
    private double _upper;

    /**
     * keeps track of state for field: _upper
     */
    private boolean _has_upper;

    /**
     * Field _rigid.
     */
    private boolean _rigid;

    /**
     * keeps track of state for field: _rigid
     */
    private boolean _has_rigid;


      //----------------/
     //- Constructors -/
    //----------------/

    public GridRange() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteLower(
    ) {
        this._has_lower= false;
    }

    /**
     */
    public void deleteRigid(
    ) {
        this._has_rigid= false;
    }

    /**
     */
    public void deleteUpper(
    ) {
        this._has_upper= false;
    }

    /**
     * Returns the value of field 'lower'.
     * 
     * @return the value of field 'Lower'.
     */
    public double getLower(
    ) {
        return this._lower;
    }

    /**
     * Returns the value of field 'rigid'.
     * 
     * @return the value of field 'Rigid'.
     */
    public boolean getRigid(
    ) {
        return this._rigid;
    }

    /**
     * Returns the value of field 'upper'.
     * 
     * @return the value of field 'Upper'.
     */
    public double getUpper(
    ) {
        return this._upper;
    }

    /**
     * Method hasLower.
     * 
     * @return true if at least one Lower has been added
     */
    public boolean hasLower(
    ) {
        return this._has_lower;
    }

    /**
     * Method hasRigid.
     * 
     * @return true if at least one Rigid has been added
     */
    public boolean hasRigid(
    ) {
        return this._has_rigid;
    }

    /**
     * Method hasUpper.
     * 
     * @return true if at least one Upper has been added
     */
    public boolean hasUpper(
    ) {
        return this._has_upper;
    }

    /**
     * Returns the value of field 'rigid'.
     * 
     * @return the value of field 'Rigid'.
     */
    public boolean isRigid(
    ) {
        return this._rigid;
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
     * Sets the value of field 'lower'.
     * 
     * @param lower the value of field 'lower'.
     */
    public void setLower(
            final double lower) {
        this._lower = lower;
        this._has_lower = true;
    }

    /**
     * Sets the value of field 'rigid'.
     * 
     * @param rigid the value of field 'rigid'.
     */
    public void setRigid(
            final boolean rigid) {
        this._rigid = rigid;
        this._has_rigid = true;
    }

    /**
     * Sets the value of field 'upper'.
     * 
     * @param upper the value of field 'upper'.
     */
    public void setUpper(
            final double upper) {
        this._upper = upper;
        this._has_upper = true;
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
     * org.opennms.netmgt.config.rrd.GridRange
     */
    public static org.opennms.netmgt.config.rrd.GridRange unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.GridRange) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.GridRange.class, reader);
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

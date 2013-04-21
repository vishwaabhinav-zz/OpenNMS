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
 * Class GraphGprint.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class GraphGprint implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _datasource.
     */
    private java.lang.String _datasource;

    /**
     * Field _cf.
     */
    private org.opennms.netmgt.config.rrd.types.Cf _cf;

    /**
     * Field _format.
     */
    private java.lang.String _format;

    /**
     * Field _base.
     */
    private int _base;

    /**
     * keeps track of state for field: _base
     */
    private boolean _has_base;


      //----------------/
     //- Constructors -/
    //----------------/

    public GraphGprint() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteBase(
    ) {
        this._has_base= false;
    }

    /**
     * Returns the value of field 'base'.
     * 
     * @return the value of field 'Base'.
     */
    public int getBase(
    ) {
        return this._base;
    }

    /**
     * Returns the value of field 'cf'.
     * 
     * @return the value of field 'Cf'.
     */
    public org.opennms.netmgt.config.rrd.types.Cf getCf(
    ) {
        return this._cf;
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
     * Returns the value of field 'format'.
     * 
     * @return the value of field 'Format'.
     */
    public java.lang.String getFormat(
    ) {
        return this._format;
    }

    /**
     * Method hasBase.
     * 
     * @return true if at least one Base has been added
     */
    public boolean hasBase(
    ) {
        return this._has_base;
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
     * Sets the value of field 'base'.
     * 
     * @param base the value of field 'base'.
     */
    public void setBase(
            final int base) {
        this._base = base;
        this._has_base = true;
    }

    /**
     * Sets the value of field 'cf'.
     * 
     * @param cf the value of field 'cf'.
     */
    public void setCf(
            final org.opennms.netmgt.config.rrd.types.Cf cf) {
        this._cf = cf;
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
     * Sets the value of field 'format'.
     * 
     * @param format the value of field 'format'.
     */
    public void setFormat(
            final java.lang.String format) {
        this._format = format;
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
     * org.opennms.netmgt.config.rrd.GraphGprint
     */
    public static org.opennms.netmgt.config.rrd.GraphGprint unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.GraphGprint) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.GraphGprint.class, reader);
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

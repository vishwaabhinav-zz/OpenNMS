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
 * Class ExportData.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ExportData implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _grid_step.
     */
    private int _grid_step;

    /**
     * keeps track of state for field: _grid_step
     */
    private boolean _has_grid_step;

    /**
     * Field _label_step.
     */
    private int _label_step;

    /**
     * keeps track of state for field: _label_step
     */
    private boolean _has_label_step;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExportData() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteGrid_step(
    ) {
        this._has_grid_step= false;
    }

    /**
     */
    public void deleteLabel_step(
    ) {
        this._has_label_step= false;
    }

    /**
     * Returns the value of field 'grid_step'.
     * 
     * @return the value of field 'Grid_step'.
     */
    public int getGrid_step(
    ) {
        return this._grid_step;
    }

    /**
     * Returns the value of field 'label_step'.
     * 
     * @return the value of field 'Label_step'.
     */
    public int getLabel_step(
    ) {
        return this._label_step;
    }

    /**
     * Method hasGrid_step.
     * 
     * @return true if at least one Grid_step has been added
     */
    public boolean hasGrid_step(
    ) {
        return this._has_grid_step;
    }

    /**
     * Method hasLabel_step.
     * 
     * @return true if at least one Label_step has been added
     */
    public boolean hasLabel_step(
    ) {
        return this._has_label_step;
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
     * Sets the value of field 'grid_step'.
     * 
     * @param grid_step the value of field 'grid_step'.
     */
    public void setGrid_step(
            final int grid_step) {
        this._grid_step = grid_step;
        this._has_grid_step = true;
    }

    /**
     * Sets the value of field 'label_step'.
     * 
     * @param label_step the value of field 'label_step'.
     */
    public void setLabel_step(
            final int label_step) {
        this._label_step = label_step;
        this._has_label_step = true;
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
     * org.opennms.netmgt.config.rrd.ExportData
     */
    public static org.opennms.netmgt.config.rrd.ExportData unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.ExportData) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.ExportData.class, reader);
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

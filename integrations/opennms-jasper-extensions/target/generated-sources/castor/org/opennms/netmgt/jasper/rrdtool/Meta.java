/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.jasper.rrdtool;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Meta.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Meta implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _start.
     */
    private org.opennms.netmgt.jasper.rrdtool.Start _start;

    /**
     * Field _step.
     */
    private org.opennms.netmgt.jasper.rrdtool.Step _step;

    /**
     * Field _end.
     */
    private org.opennms.netmgt.jasper.rrdtool.End _end;

    /**
     * Field _rows.
     */
    private org.opennms.netmgt.jasper.rrdtool.Rows _rows;

    /**
     * Field _columns.
     */
    private org.opennms.netmgt.jasper.rrdtool.Columns _columns;

    /**
     * Field _legend.
     */
    private org.opennms.netmgt.jasper.rrdtool.Legend _legend;


      //----------------/
     //- Constructors -/
    //----------------/

    public Meta() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
        
        if (obj instanceof Meta) {
        
            Meta temp = (Meta)obj;
            if (this._start != null) {
                if (temp._start == null) return false;
                else if (!(this._start.equals(temp._start))) 
                    return false;
            }
            else if (temp._start != null)
                return false;
            if (this._step != null) {
                if (temp._step == null) return false;
                else if (!(this._step.equals(temp._step))) 
                    return false;
            }
            else if (temp._step != null)
                return false;
            if (this._end != null) {
                if (temp._end == null) return false;
                else if (!(this._end.equals(temp._end))) 
                    return false;
            }
            else if (temp._end != null)
                return false;
            if (this._rows != null) {
                if (temp._rows == null) return false;
                else if (!(this._rows.equals(temp._rows))) 
                    return false;
            }
            else if (temp._rows != null)
                return false;
            if (this._columns != null) {
                if (temp._columns == null) return false;
                else if (!(this._columns.equals(temp._columns))) 
                    return false;
            }
            else if (temp._columns != null)
                return false;
            if (this._legend != null) {
                if (temp._legend == null) return false;
                else if (!(this._legend.equals(temp._legend))) 
                    return false;
            }
            else if (temp._legend != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'columns'.
     * 
     * @return the value of field 'Columns'.
     */
    public org.opennms.netmgt.jasper.rrdtool.Columns getColumns(
    ) {
        return this._columns;
    }

    /**
     * Returns the value of field 'end'.
     * 
     * @return the value of field 'End'.
     */
    public org.opennms.netmgt.jasper.rrdtool.End getEnd(
    ) {
        return this._end;
    }

    /**
     * Returns the value of field 'legend'.
     * 
     * @return the value of field 'Legend'.
     */
    public org.opennms.netmgt.jasper.rrdtool.Legend getLegend(
    ) {
        return this._legend;
    }

    /**
     * Returns the value of field 'rows'.
     * 
     * @return the value of field 'Rows'.
     */
    public org.opennms.netmgt.jasper.rrdtool.Rows getRows(
    ) {
        return this._rows;
    }

    /**
     * Returns the value of field 'start'.
     * 
     * @return the value of field 'Start'.
     */
    public org.opennms.netmgt.jasper.rrdtool.Start getStart(
    ) {
        return this._start;
    }

    /**
     * Returns the value of field 'step'.
     * 
     * @return the value of field 'Step'.
     */
    public org.opennms.netmgt.jasper.rrdtool.Step getStep(
    ) {
        return this._step;
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
        if (_start != null) {
           result = 37 * result + _start.hashCode();
        }
        if (_step != null) {
           result = 37 * result + _step.hashCode();
        }
        if (_end != null) {
           result = 37 * result + _end.hashCode();
        }
        if (_rows != null) {
           result = 37 * result + _rows.hashCode();
        }
        if (_columns != null) {
           result = 37 * result + _columns.hashCode();
        }
        if (_legend != null) {
           result = 37 * result + _legend.hashCode();
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
     * Sets the value of field 'columns'.
     * 
     * @param columns the value of field 'columns'.
     */
    public void setColumns(
            final org.opennms.netmgt.jasper.rrdtool.Columns columns) {
        this._columns = columns;
    }

    /**
     * Sets the value of field 'end'.
     * 
     * @param end the value of field 'end'.
     */
    public void setEnd(
            final org.opennms.netmgt.jasper.rrdtool.End end) {
        this._end = end;
    }

    /**
     * Sets the value of field 'legend'.
     * 
     * @param legend the value of field 'legend'.
     */
    public void setLegend(
            final org.opennms.netmgt.jasper.rrdtool.Legend legend) {
        this._legend = legend;
    }

    /**
     * Sets the value of field 'rows'.
     * 
     * @param rows the value of field 'rows'.
     */
    public void setRows(
            final org.opennms.netmgt.jasper.rrdtool.Rows rows) {
        this._rows = rows;
    }

    /**
     * Sets the value of field 'start'.
     * 
     * @param start the value of field 'start'.
     */
    public void setStart(
            final org.opennms.netmgt.jasper.rrdtool.Start start) {
        this._start = start;
    }

    /**
     * Sets the value of field 'step'.
     * 
     * @param step the value of field 'step'.
     */
    public void setStep(
            final org.opennms.netmgt.jasper.rrdtool.Step step) {
        this._step = step;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.jasper.rrdtool.Met
     */
    public static org.opennms.netmgt.jasper.rrdtool.Meta unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.jasper.rrdtool.Meta) Unmarshaller.unmarshal(org.opennms.netmgt.jasper.rrdtool.Meta.class, reader);
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

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
 * Top-level element for rrdtool xport output
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Xport implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _meta.
     */
    private org.opennms.netmgt.jasper.rrdtool.Meta _meta;

    /**
     * Field _data.
     */
    private org.opennms.netmgt.jasper.rrdtool.Data _data;


      //----------------/
     //- Constructors -/
    //----------------/

    public Xport() {
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
        
        if (obj instanceof Xport) {
        
            Xport temp = (Xport)obj;
            if (this._meta != null) {
                if (temp._meta == null) return false;
                else if (!(this._meta.equals(temp._meta))) 
                    return false;
            }
            else if (temp._meta != null)
                return false;
            if (this._data != null) {
                if (temp._data == null) return false;
                else if (!(this._data.equals(temp._data))) 
                    return false;
            }
            else if (temp._data != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'data'.
     * 
     * @return the value of field 'Data'.
     */
    public org.opennms.netmgt.jasper.rrdtool.Data getData(
    ) {
        return this._data;
    }

    /**
     * Returns the value of field 'meta'.
     * 
     * @return the value of field 'Meta'.
     */
    public org.opennms.netmgt.jasper.rrdtool.Meta getMeta(
    ) {
        return this._meta;
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
        if (_meta != null) {
           result = 37 * result + _meta.hashCode();
        }
        if (_data != null) {
           result = 37 * result + _data.hashCode();
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
     * Sets the value of field 'data'.
     * 
     * @param data the value of field 'data'.
     */
    public void setData(
            final org.opennms.netmgt.jasper.rrdtool.Data data) {
        this._data = data;
    }

    /**
     * Sets the value of field 'meta'.
     * 
     * @param meta the value of field 'meta'.
     */
    public void setMeta(
            final org.opennms.netmgt.jasper.rrdtool.Meta meta) {
        this._meta = meta;
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
     * org.opennms.netmgt.jasper.rrdtool.Xport
     */
    public static org.opennms.netmgt.jasper.rrdtool.Xport unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.jasper.rrdtool.Xport) Unmarshaller.unmarshal(org.opennms.netmgt.jasper.rrdtool.Xport.class, reader);
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

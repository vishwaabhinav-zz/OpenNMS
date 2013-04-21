/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.httpdatacollection;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class HttpCollection.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class HttpCollection implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name = "default";

    /**
     * RRD parms
     */
    private org.opennms.netmgt.config.httpdatacollection.Rrd _rrd;

    /**
     * Field _uris.
     */
    private org.opennms.netmgt.config.httpdatacollection.Uris _uris;


      //----------------/
     //- Constructors -/
    //----------------/

    public HttpCollection() {
        super();
        setName("default");
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
        
        if (obj instanceof HttpCollection) {
        
            HttpCollection temp = (HttpCollection)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._rrd != null) {
                if (temp._rrd == null) return false;
                else if (!(this._rrd.equals(temp._rrd))) 
                    return false;
            }
            else if (temp._rrd != null)
                return false;
            if (this._uris != null) {
                if (temp._uris == null) return false;
                else if (!(this._uris.equals(temp._uris))) 
                    return false;
            }
            else if (temp._uris != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'rrd'. The field 'rrd' has the
     * following description: RRD parms
     * 
     * @return the value of field 'Rrd'.
     */
    public org.opennms.netmgt.config.httpdatacollection.Rrd getRrd(
    ) {
        return this._rrd;
    }

    /**
     * Returns the value of field 'uris'.
     * 
     * @return the value of field 'Uris'.
     */
    public org.opennms.netmgt.config.httpdatacollection.Uris getUris(
    ) {
        return this._uris;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_rrd != null) {
           result = 37 * result + _rrd.hashCode();
        }
        if (_uris != null) {
           result = 37 * result + _uris.hashCode();
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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'rrd'. The field 'rrd' has the
     * following description: RRD parms
     * 
     * @param rrd the value of field 'rrd'.
     */
    public void setRrd(
            final org.opennms.netmgt.config.httpdatacollection.Rrd rrd) {
        this._rrd = rrd;
    }

    /**
     * Sets the value of field 'uris'.
     * 
     * @param uris the value of field 'uris'.
     */
    public void setUris(
            final org.opennms.netmgt.config.httpdatacollection.Uris uris) {
        this._uris = uris;
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
     * org.opennms.netmgt.config.httpdatacollection.HttpCollection
     */
    public static org.opennms.netmgt.config.httpdatacollection.HttpCollection unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.HttpCollection) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.HttpCollection.class, reader);
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

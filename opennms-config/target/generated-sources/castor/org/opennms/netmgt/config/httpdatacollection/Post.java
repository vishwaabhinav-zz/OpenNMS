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
 * Class Post.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Post implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _parm.
     */
    private java.lang.String _parm;

    /**
     * Field _value.
     */
    private java.lang.String _value;


      //----------------/
     //- Constructors -/
    //----------------/

    public Post() {
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
        
        if (obj instanceof Post) {
        
            Post temp = (Post)obj;
            if (this._parm != null) {
                if (temp._parm == null) return false;
                else if (!(this._parm.equals(temp._parm))) 
                    return false;
            }
            else if (temp._parm != null)
                return false;
            if (this._value != null) {
                if (temp._value == null) return false;
                else if (!(this._value.equals(temp._value))) 
                    return false;
            }
            else if (temp._value != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'parm'.
     * 
     * @return the value of field 'Parm'.
     */
    public java.lang.String getParm(
    ) {
        return this._parm;
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
        if (_parm != null) {
           result = 37 * result + _parm.hashCode();
        }
        if (_value != null) {
           result = 37 * result + _value.hashCode();
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
     * Sets the value of field 'parm'.
     * 
     * @param parm the value of field 'parm'.
     */
    public void setParm(
            final java.lang.String parm) {
        this._parm = parm;
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
     * @return the unmarshaled
     * org.opennms.netmgt.config.httpdatacollection.Post
     */
    public static org.opennms.netmgt.config.httpdatacollection.Post unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.Post) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.Post.class, reader);
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

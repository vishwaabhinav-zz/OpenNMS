/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.notifications;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * The varbind element
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Varbind implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The varbind element number
     */
    private java.lang.String _vbname;

    /**
     * The varbind element value
     */
    private java.lang.String _vbvalue;


      //----------------/
     //- Constructors -/
    //----------------/

    public Varbind() {
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
        
        if (obj instanceof Varbind) {
        
            Varbind temp = (Varbind)obj;
            if (this._vbname != null) {
                if (temp._vbname == null) return false;
                else if (!(this._vbname.equals(temp._vbname))) 
                    return false;
            }
            else if (temp._vbname != null)
                return false;
            if (this._vbvalue != null) {
                if (temp._vbvalue == null) return false;
                else if (!(this._vbvalue.equals(temp._vbvalue))) 
                    return false;
            }
            else if (temp._vbvalue != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'vbname'. The field 'vbname' has
     * the following description: The varbind element number
     * 
     * @return the value of field 'Vbname'.
     */
    public java.lang.String getVbname(
    ) {
        return this._vbname;
    }

    /**
     * Returns the value of field 'vbvalue'. The field 'vbvalue'
     * has the following description: The varbind element value
     * 
     * @return the value of field 'Vbvalue'.
     */
    public java.lang.String getVbvalue(
    ) {
        return this._vbvalue;
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
        if (_vbname != null) {
           result = 37 * result + _vbname.hashCode();
        }
        if (_vbvalue != null) {
           result = 37 * result + _vbvalue.hashCode();
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
     * Sets the value of field 'vbname'. The field 'vbname' has the
     * following description: The varbind element number
     * 
     * @param vbname the value of field 'vbname'.
     */
    public void setVbname(
            final java.lang.String vbname) {
        this._vbname = vbname;
    }

    /**
     * Sets the value of field 'vbvalue'. The field 'vbvalue' has
     * the following description: The varbind element value
     * 
     * @param vbvalue the value of field 'vbvalue'.
     */
    public void setVbvalue(
            final java.lang.String vbvalue) {
        this._vbvalue = vbvalue;
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
     * org.opennms.netmgt.config.notifications.Varbind
     */
    public static org.opennms.netmgt.config.notifications.Varbind unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifications.Varbind) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifications.Varbind.class, reader);
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

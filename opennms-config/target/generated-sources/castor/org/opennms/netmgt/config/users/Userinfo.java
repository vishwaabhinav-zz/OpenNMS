/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.users;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * The top-level element of the users.xml configuration
 *  file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Userinfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Header containing information about this configuration
     *  file.
     */
    private org.opennms.netmgt.config.users.Header _header;

    /**
     * Field _users.
     */
    private org.opennms.netmgt.config.users.Users _users;


      //----------------/
     //- Constructors -/
    //----------------/

    public Userinfo() {
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
        
        if (obj instanceof Userinfo) {
        
            Userinfo temp = (Userinfo)obj;
            if (this._header != null) {
                if (temp._header == null) return false;
                else if (!(this._header.equals(temp._header))) 
                    return false;
            }
            else if (temp._header != null)
                return false;
            if (this._users != null) {
                if (temp._users == null) return false;
                else if (!(this._users.equals(temp._users))) 
                    return false;
            }
            else if (temp._users != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'header'. The field 'header' has
     * the following description: Header containing information
     * about this configuration
     *  file.
     * 
     * @return the value of field 'Header'.
     */
    public org.opennms.netmgt.config.users.Header getHeader(
    ) {
        return this._header;
    }

    /**
     * Returns the value of field 'users'.
     * 
     * @return the value of field 'Users'.
     */
    public org.opennms.netmgt.config.users.Users getUsers(
    ) {
        return this._users;
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
        if (_header != null) {
           result = 37 * result + _header.hashCode();
        }
        if (_users != null) {
           result = 37 * result + _users.hashCode();
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
     * Sets the value of field 'header'. The field 'header' has the
     * following description: Header containing information about
     * this configuration
     *  file.
     * 
     * @param header the value of field 'header'.
     */
    public void setHeader(
            final org.opennms.netmgt.config.users.Header header) {
        this._header = header;
    }

    /**
     * Sets the value of field 'users'.
     * 
     * @param users the value of field 'users'.
     */
    public void setUsers(
            final org.opennms.netmgt.config.users.Users users) {
        this._users = users;
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
     * org.opennms.netmgt.config.users.Userinfo
     */
    public static org.opennms.netmgt.config.users.Userinfo unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.users.Userinfo) Unmarshaller.unmarshal(org.opennms.netmgt.config.users.Userinfo.class, reader);
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

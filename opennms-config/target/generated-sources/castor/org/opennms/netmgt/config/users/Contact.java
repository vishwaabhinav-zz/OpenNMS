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
 * Class Contact.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Contact implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type.
     */
    private java.lang.String _type;

    /**
     * Field _info.
     */
    private java.lang.String _info;

    /**
     * Field _serviceProvider.
     */
    private java.lang.String _serviceProvider;


      //----------------/
     //- Constructors -/
    //----------------/

    public Contact() {
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
        
        if (obj instanceof Contact) {
        
            Contact temp = (Contact)obj;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type))) 
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._info != null) {
                if (temp._info == null) return false;
                else if (!(this._info.equals(temp._info))) 
                    return false;
            }
            else if (temp._info != null)
                return false;
            if (this._serviceProvider != null) {
                if (temp._serviceProvider == null) return false;
                else if (!(this._serviceProvider.equals(temp._serviceProvider))) 
                    return false;
            }
            else if (temp._serviceProvider != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'info'.
     * 
     * @return the value of field 'Info'.
     */
    public java.lang.String getInfo(
    ) {
        return this._info;
    }

    /**
     * Returns the value of field 'serviceProvider'.
     * 
     * @return the value of field 'ServiceProvider'.
     */
    public java.lang.String getServiceProvider(
    ) {
        return this._serviceProvider;
    }

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
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
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_info != null) {
           result = 37 * result + _info.hashCode();
        }
        if (_serviceProvider != null) {
           result = 37 * result + _serviceProvider.hashCode();
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
     * Sets the value of field 'info'.
     * 
     * @param info the value of field 'info'.
     */
    public void setInfo(
            final java.lang.String info) {
        this._info = info;
    }

    /**
     * Sets the value of field 'serviceProvider'.
     * 
     * @param serviceProvider the value of field 'serviceProvider'.
     */
    public void setServiceProvider(
            final java.lang.String serviceProvider) {
        this._serviceProvider = serviceProvider;
    }

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
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
     * org.opennms.netmgt.config.users.Contact
     */
    public static org.opennms.netmgt.config.users.Contact unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.users.Contact) Unmarshaller.unmarshal(org.opennms.netmgt.config.users.Contact.class, reader);
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

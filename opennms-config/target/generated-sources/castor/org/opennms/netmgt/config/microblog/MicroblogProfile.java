/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.microblog;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * This entity defines the parameters for a microblog service.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class MicroblogProfile implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _serviceUrl.
     */
    private java.lang.String _serviceUrl;

    /**
     * Field _authenUsername.
     */
    private java.lang.String _authenUsername;

    /**
     * Field _authenPassword.
     */
    private java.lang.String _authenPassword;

    /**
     * Field _name.
     */
    private java.lang.String _name;


      //----------------/
     //- Constructors -/
    //----------------/

    public MicroblogProfile() {
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
        
        if (obj instanceof MicroblogProfile) {
        
            MicroblogProfile temp = (MicroblogProfile)obj;
            if (this._serviceUrl != null) {
                if (temp._serviceUrl == null) return false;
                else if (!(this._serviceUrl.equals(temp._serviceUrl))) 
                    return false;
            }
            else if (temp._serviceUrl != null)
                return false;
            if (this._authenUsername != null) {
                if (temp._authenUsername == null) return false;
                else if (!(this._authenUsername.equals(temp._authenUsername))) 
                    return false;
            }
            else if (temp._authenUsername != null)
                return false;
            if (this._authenPassword != null) {
                if (temp._authenPassword == null) return false;
                else if (!(this._authenPassword.equals(temp._authenPassword))) 
                    return false;
            }
            else if (temp._authenPassword != null)
                return false;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'authenPassword'.
     * 
     * @return the value of field 'AuthenPassword'.
     */
    public java.lang.String getAuthenPassword(
    ) {
        return this._authenPassword;
    }

    /**
     * Returns the value of field 'authenUsername'.
     * 
     * @return the value of field 'AuthenUsername'.
     */
    public java.lang.String getAuthenUsername(
    ) {
        return this._authenUsername;
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
     * Returns the value of field 'serviceUrl'.
     * 
     * @return the value of field 'ServiceUrl'.
     */
    public java.lang.String getServiceUrl(
    ) {
        return this._serviceUrl;
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
        if (_serviceUrl != null) {
           result = 37 * result + _serviceUrl.hashCode();
        }
        if (_authenUsername != null) {
           result = 37 * result + _authenUsername.hashCode();
        }
        if (_authenPassword != null) {
           result = 37 * result + _authenPassword.hashCode();
        }
        if (_name != null) {
           result = 37 * result + _name.hashCode();
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
     * Sets the value of field 'authenPassword'.
     * 
     * @param authenPassword the value of field 'authenPassword'.
     */
    public void setAuthenPassword(
            final java.lang.String authenPassword) {
        this._authenPassword = authenPassword;
    }

    /**
     * Sets the value of field 'authenUsername'.
     * 
     * @param authenUsername the value of field 'authenUsername'.
     */
    public void setAuthenUsername(
            final java.lang.String authenUsername) {
        this._authenUsername = authenUsername;
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
     * Sets the value of field 'serviceUrl'.
     * 
     * @param serviceUrl the value of field 'serviceUrl'.
     */
    public void setServiceUrl(
            final java.lang.String serviceUrl) {
        this._serviceUrl = serviceUrl;
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
     * org.opennms.netmgt.config.microblog.MicroblogProfile
     */
    public static org.opennms.netmgt.config.microblog.MicroblogProfile unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.microblog.MicroblogProfile) Unmarshaller.unmarshal(org.opennms.netmgt.config.microblog.MicroblogProfile.class, reader);
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

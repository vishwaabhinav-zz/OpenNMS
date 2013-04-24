/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.javamail;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Basically any attributes that help setup the javamailer's
 * confusing set of properties.
 *  
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ReadmailProtocol implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _transport.
     */
    private java.lang.String _transport = "pop3";

    /**
     * Field _sslEnable.
     */
    private boolean _sslEnable = false;

    /**
     * keeps track of state for field: _sslEnable
     */
    private boolean _has_sslEnable;

    /**
     * Field _startTls.
     */
    private boolean _startTls = false;

    /**
     * keeps track of state for field: _startTls
     */
    private boolean _has_startTls;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReadmailProtocol() {
        super();
        setTransport("pop3");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteSslEnable(
    ) {
        this._has_sslEnable= false;
    }

    /**
     */
    public void deleteStartTls(
    ) {
        this._has_startTls= false;
    }

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
        
        if (obj instanceof ReadmailProtocol) {
        
            ReadmailProtocol temp = (ReadmailProtocol)obj;
            if (this._transport != null) {
                if (temp._transport == null) return false;
                else if (!(this._transport.equals(temp._transport))) 
                    return false;
            }
            else if (temp._transport != null)
                return false;
            if (this._sslEnable != temp._sslEnable)
                return false;
            if (this._has_sslEnable != temp._has_sslEnable)
                return false;
            if (this._startTls != temp._startTls)
                return false;
            if (this._has_startTls != temp._has_startTls)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'sslEnable'.
     * 
     * @return the value of field 'SslEnable'.
     */
    public boolean getSslEnable(
    ) {
        return this._sslEnable;
    }

    /**
     * Returns the value of field 'startTls'.
     * 
     * @return the value of field 'StartTls'.
     */
    public boolean getStartTls(
    ) {
        return this._startTls;
    }

    /**
     * Returns the value of field 'transport'.
     * 
     * @return the value of field 'Transport'.
     */
    public java.lang.String getTransport(
    ) {
        return this._transport;
    }

    /**
     * Method hasSslEnable.
     * 
     * @return true if at least one SslEnable has been added
     */
    public boolean hasSslEnable(
    ) {
        return this._has_sslEnable;
    }

    /**
     * Method hasStartTls.
     * 
     * @return true if at least one StartTls has been added
     */
    public boolean hasStartTls(
    ) {
        return this._has_startTls;
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
        if (_transport != null) {
           result = 37 * result + _transport.hashCode();
        }
        result = 37 * result + (_sslEnable?0:1);
        result = 37 * result + (_startTls?0:1);
        
        return result;
    }

    /**
     * Returns the value of field 'sslEnable'.
     * 
     * @return the value of field 'SslEnable'.
     */
    public boolean isSslEnable(
    ) {
        return this._sslEnable;
    }

    /**
     * Returns the value of field 'startTls'.
     * 
     * @return the value of field 'StartTls'.
     */
    public boolean isStartTls(
    ) {
        return this._startTls;
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
     * Sets the value of field 'sslEnable'.
     * 
     * @param sslEnable the value of field 'sslEnable'.
     */
    public void setSslEnable(
            final boolean sslEnable) {
        this._sslEnable = sslEnable;
        this._has_sslEnable = true;
    }

    /**
     * Sets the value of field 'startTls'.
     * 
     * @param startTls the value of field 'startTls'.
     */
    public void setStartTls(
            final boolean startTls) {
        this._startTls = startTls;
        this._has_startTls = true;
    }

    /**
     * Sets the value of field 'transport'.
     * 
     * @param transport the value of field 'transport'.
     */
    public void setTransport(
            final java.lang.String transport) {
        this._transport = transport;
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
     * org.opennms.netmgt.config.javamail.ReadmailProtocol
     */
    public static org.opennms.netmgt.config.javamail.ReadmailProtocol unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.javamail.ReadmailProtocol) Unmarshaller.unmarshal(org.opennms.netmgt.config.javamail.ReadmailProtocol.class, reader);
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

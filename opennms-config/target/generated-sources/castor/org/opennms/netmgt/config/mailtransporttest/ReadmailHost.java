/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.mailtransporttest;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Define the host and port of the sendmail server. If you don't,
 * defaults will be used and
 *  ${ipaddr} is replaced with the IP address of the service.
 *  
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ReadmailHost implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _host.
     */
    private java.lang.String _host = "${ipaddr}";

    /**
     * Field _port.
     */
    private long _port = 110;

    /**
     * keeps track of state for field: _port
     */
    private boolean _has_port;

    /**
     * Basically attributes that help setup the javamailer's
     * confusion set of properties.
     *  
     *  
     */
    private org.opennms.netmgt.config.mailtransporttest.ReadmailProtocol _readmailProtocol;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReadmailHost() {
        super();
        setHost("${ipaddr}");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deletePort(
    ) {
        this._has_port= false;
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
        
        if (obj instanceof ReadmailHost) {
        
            ReadmailHost temp = (ReadmailHost)obj;
            if (this._host != null) {
                if (temp._host == null) return false;
                else if (!(this._host.equals(temp._host))) 
                    return false;
            }
            else if (temp._host != null)
                return false;
            if (this._port != temp._port)
                return false;
            if (this._has_port != temp._has_port)
                return false;
            if (this._readmailProtocol != null) {
                if (temp._readmailProtocol == null) return false;
                else if (!(this._readmailProtocol.equals(temp._readmailProtocol))) 
                    return false;
            }
            else if (temp._readmailProtocol != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'host'.
     * 
     * @return the value of field 'Host'.
     */
    public java.lang.String getHost(
    ) {
        return this._host;
    }

    /**
     * Returns the value of field 'port'.
     * 
     * @return the value of field 'Port'.
     */
    public long getPort(
    ) {
        return this._port;
    }

    /**
     * Returns the value of field 'readmailProtocol'. The field
     * 'readmailProtocol' has the following description: Basically
     * attributes that help setup the javamailer's confusion set of
     * properties.
     *  
     *  
     * 
     * @return the value of field 'ReadmailProtocol'.
     */
    public org.opennms.netmgt.config.mailtransporttest.ReadmailProtocol getReadmailProtocol(
    ) {
        return this._readmailProtocol;
    }

    /**
     * Method hasPort.
     * 
     * @return true if at least one Port has been added
     */
    public boolean hasPort(
    ) {
        return this._has_port;
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
        if (_host != null) {
           result = 37 * result + _host.hashCode();
        }
        result = 37 * result + (int)(_port^(_port>>>32));
        if (_readmailProtocol != null) {
           result = 37 * result + _readmailProtocol.hashCode();
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
     * Sets the value of field 'host'.
     * 
     * @param host the value of field 'host'.
     */
    public void setHost(
            final java.lang.String host) {
        this._host = host;
    }

    /**
     * Sets the value of field 'port'.
     * 
     * @param port the value of field 'port'.
     */
    public void setPort(
            final long port) {
        this._port = port;
        this._has_port = true;
    }

    /**
     * Sets the value of field 'readmailProtocol'. The field
     * 'readmailProtocol' has the following description: Basically
     * attributes that help setup the javamailer's confusion set of
     * properties.
     *  
     *  
     * 
     * @param readmailProtocol the value of field 'readmailProtocol'
     */
    public void setReadmailProtocol(
            final org.opennms.netmgt.config.mailtransporttest.ReadmailProtocol readmailProtocol) {
        this._readmailProtocol = readmailProtocol;
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
     * org.opennms.netmgt.config.mailtransporttest.ReadmailHost
     */
    public static org.opennms.netmgt.config.mailtransporttest.ReadmailHost unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.mailtransporttest.ReadmailHost) Unmarshaller.unmarshal(org.opennms.netmgt.config.mailtransporttest.ReadmailHost.class, reader);
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

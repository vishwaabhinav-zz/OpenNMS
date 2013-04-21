/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.tl1d;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Tl1Element.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Tl1Element implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _host.
     */
    private java.lang.String _host;

    /**
     * Field _port.
     */
    private int _port = 502;

    /**
     * keeps track of state for field: _port
     */
    private boolean _has_port;

    /**
     * Field _userid.
     */
    private java.lang.String _userid = "opennms";

    /**
     * Field _password.
     */
    private java.lang.String _password = "opennms";

    /**
     * Field _tl1ClientApi.
     */
    private java.lang.String _tl1ClientApi = "org.opennms.netmgt.tl1d.Tl1ClientImpl";

    /**
     * Field _tl1MessageParser.
     */
    private java.lang.String _tl1MessageParser = "org.opennms.netmgt.tl1d.Tl1AutonomousMessageProcessor";

    /**
     * Field _reconnectDelay.
     */
    private long _reconnectDelay = 30000;

    /**
     * keeps track of state for field: _reconnectDelay
     */
    private boolean _has_reconnectDelay;


      //----------------/
     //- Constructors -/
    //----------------/

    public Tl1Element() {
        super();
        setUserid("opennms");
        setPassword("opennms");
        setTl1ClientApi("org.opennms.netmgt.tl1d.Tl1ClientImpl");
        setTl1MessageParser("org.opennms.netmgt.tl1d.Tl1AutonomousMessageProcessor");
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
     */
    public void deleteReconnectDelay(
    ) {
        this._has_reconnectDelay= false;
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
        
        if (obj instanceof Tl1Element) {
        
            Tl1Element temp = (Tl1Element)obj;
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
            if (this._userid != null) {
                if (temp._userid == null) return false;
                else if (!(this._userid.equals(temp._userid))) 
                    return false;
            }
            else if (temp._userid != null)
                return false;
            if (this._password != null) {
                if (temp._password == null) return false;
                else if (!(this._password.equals(temp._password))) 
                    return false;
            }
            else if (temp._password != null)
                return false;
            if (this._tl1ClientApi != null) {
                if (temp._tl1ClientApi == null) return false;
                else if (!(this._tl1ClientApi.equals(temp._tl1ClientApi))) 
                    return false;
            }
            else if (temp._tl1ClientApi != null)
                return false;
            if (this._tl1MessageParser != null) {
                if (temp._tl1MessageParser == null) return false;
                else if (!(this._tl1MessageParser.equals(temp._tl1MessageParser))) 
                    return false;
            }
            else if (temp._tl1MessageParser != null)
                return false;
            if (this._reconnectDelay != temp._reconnectDelay)
                return false;
            if (this._has_reconnectDelay != temp._has_reconnectDelay)
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
     * Returns the value of field 'password'.
     * 
     * @return the value of field 'Password'.
     */
    public java.lang.String getPassword(
    ) {
        return this._password;
    }

    /**
     * Returns the value of field 'port'.
     * 
     * @return the value of field 'Port'.
     */
    public int getPort(
    ) {
        return this._port;
    }

    /**
     * Returns the value of field 'reconnectDelay'.
     * 
     * @return the value of field 'ReconnectDelay'.
     */
    public long getReconnectDelay(
    ) {
        return this._reconnectDelay;
    }

    /**
     * Returns the value of field 'tl1ClientApi'.
     * 
     * @return the value of field 'Tl1ClientApi'.
     */
    public java.lang.String getTl1ClientApi(
    ) {
        return this._tl1ClientApi;
    }

    /**
     * Returns the value of field 'tl1MessageParser'.
     * 
     * @return the value of field 'Tl1MessageParser'.
     */
    public java.lang.String getTl1MessageParser(
    ) {
        return this._tl1MessageParser;
    }

    /**
     * Returns the value of field 'userid'.
     * 
     * @return the value of field 'Userid'.
     */
    public java.lang.String getUserid(
    ) {
        return this._userid;
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
     * Method hasReconnectDelay.
     * 
     * @return true if at least one ReconnectDelay has been added
     */
    public boolean hasReconnectDelay(
    ) {
        return this._has_reconnectDelay;
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
        result = 37 * result + _port;
        if (_userid != null) {
           result = 37 * result + _userid.hashCode();
        }
        if (_password != null) {
           result = 37 * result + _password.hashCode();
        }
        if (_tl1ClientApi != null) {
           result = 37 * result + _tl1ClientApi.hashCode();
        }
        if (_tl1MessageParser != null) {
           result = 37 * result + _tl1MessageParser.hashCode();
        }
        result = 37 * result + (int)(_reconnectDelay^(_reconnectDelay>>>32));
        
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
     * Sets the value of field 'password'.
     * 
     * @param password the value of field 'password'.
     */
    public void setPassword(
            final java.lang.String password) {
        this._password = password;
    }

    /**
     * Sets the value of field 'port'.
     * 
     * @param port the value of field 'port'.
     */
    public void setPort(
            final int port) {
        this._port = port;
        this._has_port = true;
    }

    /**
     * Sets the value of field 'reconnectDelay'.
     * 
     * @param reconnectDelay the value of field 'reconnectDelay'.
     */
    public void setReconnectDelay(
            final long reconnectDelay) {
        this._reconnectDelay = reconnectDelay;
        this._has_reconnectDelay = true;
    }

    /**
     * Sets the value of field 'tl1ClientApi'.
     * 
     * @param tl1ClientApi the value of field 'tl1ClientApi'.
     */
    public void setTl1ClientApi(
            final java.lang.String tl1ClientApi) {
        this._tl1ClientApi = tl1ClientApi;
    }

    /**
     * Sets the value of field 'tl1MessageParser'.
     * 
     * @param tl1MessageParser the value of field 'tl1MessageParser'
     */
    public void setTl1MessageParser(
            final java.lang.String tl1MessageParser) {
        this._tl1MessageParser = tl1MessageParser;
    }

    /**
     * Sets the value of field 'userid'.
     * 
     * @param userid the value of field 'userid'.
     */
    public void setUserid(
            final java.lang.String userid) {
        this._userid = userid;
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
     * org.opennms.netmgt.config.tl1d.Tl1Element
     */
    public static org.opennms.netmgt.config.tl1d.Tl1Element unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.tl1d.Tl1Element) Unmarshaller.unmarshal(org.opennms.netmgt.config.tl1d.Tl1Element.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.server;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the opennms-server.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class LocalServer implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _serverName.
     */
    private java.lang.String _serverName = "localhost";

    /**
     * Field _defaultCriticalPathIp.
     */
    private java.lang.String _defaultCriticalPathIp = "";

    /**
     * Field _defaultCriticalPathService.
     */
    private java.lang.String _defaultCriticalPathService = "";

    /**
     * Field _defaultCriticalPathTimeout.
     */
    private int _defaultCriticalPathTimeout = 1500;

    /**
     * keeps track of state for field: _defaultCriticalPathTimeout
     */
    private boolean _has_defaultCriticalPathTimeout;

    /**
     * Field _defaultCriticalPathRetries.
     */
    private int _defaultCriticalPathRetries = 0;

    /**
     * keeps track of state for field: _defaultCriticalPathRetries
     */
    private boolean _has_defaultCriticalPathRetries;

    /**
     * A flag to indicate if poller has to identify the nms
     *  server to restrict services to poll.
     */
    private java.lang.String _verifyServer = "false";


      //----------------/
     //- Constructors -/
    //----------------/

    public LocalServer() {
        super();
        setServerName("localhost");
        setDefaultCriticalPathIp("");
        setDefaultCriticalPathService("");
        setVerifyServer("false");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDefaultCriticalPathRetries(
    ) {
        this._has_defaultCriticalPathRetries= false;
    }

    /**
     */
    public void deleteDefaultCriticalPathTimeout(
    ) {
        this._has_defaultCriticalPathTimeout= false;
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
        
        if (obj instanceof LocalServer) {
        
            LocalServer temp = (LocalServer)obj;
            if (this._serverName != null) {
                if (temp._serverName == null) return false;
                else if (!(this._serverName.equals(temp._serverName))) 
                    return false;
            }
            else if (temp._serverName != null)
                return false;
            if (this._defaultCriticalPathIp != null) {
                if (temp._defaultCriticalPathIp == null) return false;
                else if (!(this._defaultCriticalPathIp.equals(temp._defaultCriticalPathIp))) 
                    return false;
            }
            else if (temp._defaultCriticalPathIp != null)
                return false;
            if (this._defaultCriticalPathService != null) {
                if (temp._defaultCriticalPathService == null) return false;
                else if (!(this._defaultCriticalPathService.equals(temp._defaultCriticalPathService))) 
                    return false;
            }
            else if (temp._defaultCriticalPathService != null)
                return false;
            if (this._defaultCriticalPathTimeout != temp._defaultCriticalPathTimeout)
                return false;
            if (this._has_defaultCriticalPathTimeout != temp._has_defaultCriticalPathTimeout)
                return false;
            if (this._defaultCriticalPathRetries != temp._defaultCriticalPathRetries)
                return false;
            if (this._has_defaultCriticalPathRetries != temp._has_defaultCriticalPathRetries)
                return false;
            if (this._verifyServer != null) {
                if (temp._verifyServer == null) return false;
                else if (!(this._verifyServer.equals(temp._verifyServer))) 
                    return false;
            }
            else if (temp._verifyServer != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultCriticalPathIp'.
     * 
     * @return the value of field 'DefaultCriticalPathIp'.
     */
    public java.lang.String getDefaultCriticalPathIp(
    ) {
        return this._defaultCriticalPathIp;
    }

    /**
     * Returns the value of field 'defaultCriticalPathRetries'.
     * 
     * @return the value of field 'DefaultCriticalPathRetries'.
     */
    public int getDefaultCriticalPathRetries(
    ) {
        return this._defaultCriticalPathRetries;
    }

    /**
     * Returns the value of field 'defaultCriticalPathService'.
     * 
     * @return the value of field 'DefaultCriticalPathService'.
     */
    public java.lang.String getDefaultCriticalPathService(
    ) {
        return this._defaultCriticalPathService;
    }

    /**
     * Returns the value of field 'defaultCriticalPathTimeout'.
     * 
     * @return the value of field 'DefaultCriticalPathTimeout'.
     */
    public int getDefaultCriticalPathTimeout(
    ) {
        return this._defaultCriticalPathTimeout;
    }

    /**
     * Returns the value of field 'serverName'.
     * 
     * @return the value of field 'ServerName'.
     */
    public java.lang.String getServerName(
    ) {
        return this._serverName;
    }

    /**
     * Returns the value of field 'verifyServer'. The field
     * 'verifyServer' has the following description: A flag to
     * indicate if poller has to identify the nms
     *  server to restrict services to poll.
     * 
     * @return the value of field 'VerifyServer'.
     */
    public java.lang.String getVerifyServer(
    ) {
        return this._verifyServer;
    }

    /**
     * Method hasDefaultCriticalPathRetries.
     * 
     * @return true if at least one DefaultCriticalPathRetries has
     * been added
     */
    public boolean hasDefaultCriticalPathRetries(
    ) {
        return this._has_defaultCriticalPathRetries;
    }

    /**
     * Method hasDefaultCriticalPathTimeout.
     * 
     * @return true if at least one DefaultCriticalPathTimeout has
     * been added
     */
    public boolean hasDefaultCriticalPathTimeout(
    ) {
        return this._has_defaultCriticalPathTimeout;
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
        if (_serverName != null) {
           result = 37 * result + _serverName.hashCode();
        }
        if (_defaultCriticalPathIp != null) {
           result = 37 * result + _defaultCriticalPathIp.hashCode();
        }
        if (_defaultCriticalPathService != null) {
           result = 37 * result + _defaultCriticalPathService.hashCode();
        }
        result = 37 * result + _defaultCriticalPathTimeout;
        result = 37 * result + _defaultCriticalPathRetries;
        if (_verifyServer != null) {
           result = 37 * result + _verifyServer.hashCode();
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
     * Sets the value of field 'defaultCriticalPathIp'.
     * 
     * @param defaultCriticalPathIp the value of field
     * 'defaultCriticalPathIp'.
     */
    public void setDefaultCriticalPathIp(
            final java.lang.String defaultCriticalPathIp) {
        this._defaultCriticalPathIp = defaultCriticalPathIp;
    }

    /**
     * Sets the value of field 'defaultCriticalPathRetries'.
     * 
     * @param defaultCriticalPathRetries the value of field
     * 'defaultCriticalPathRetries'.
     */
    public void setDefaultCriticalPathRetries(
            final int defaultCriticalPathRetries) {
        this._defaultCriticalPathRetries = defaultCriticalPathRetries;
        this._has_defaultCriticalPathRetries = true;
    }

    /**
     * Sets the value of field 'defaultCriticalPathService'.
     * 
     * @param defaultCriticalPathService the value of field
     * 'defaultCriticalPathService'.
     */
    public void setDefaultCriticalPathService(
            final java.lang.String defaultCriticalPathService) {
        this._defaultCriticalPathService = defaultCriticalPathService;
    }

    /**
     * Sets the value of field 'defaultCriticalPathTimeout'.
     * 
     * @param defaultCriticalPathTimeout the value of field
     * 'defaultCriticalPathTimeout'.
     */
    public void setDefaultCriticalPathTimeout(
            final int defaultCriticalPathTimeout) {
        this._defaultCriticalPathTimeout = defaultCriticalPathTimeout;
        this._has_defaultCriticalPathTimeout = true;
    }

    /**
     * Sets the value of field 'serverName'.
     * 
     * @param serverName the value of field 'serverName'.
     */
    public void setServerName(
            final java.lang.String serverName) {
        this._serverName = serverName;
    }

    /**
     * Sets the value of field 'verifyServer'. The field
     * 'verifyServer' has the following description: A flag to
     * indicate if poller has to identify the nms
     *  server to restrict services to poll.
     * 
     * @param verifyServer the value of field 'verifyServer'.
     */
    public void setVerifyServer(
            final java.lang.String verifyServer) {
        this._verifyServer = verifyServer;
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
     * org.opennms.netmgt.config.server.LocalServer
     */
    public static org.opennms.netmgt.config.server.LocalServer unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.server.LocalServer) Unmarshaller.unmarshal(org.opennms.netmgt.config.server.LocalServer.class, reader);
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

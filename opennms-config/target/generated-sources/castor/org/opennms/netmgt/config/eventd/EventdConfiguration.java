/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.eventd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the eventd-configuration.xml
 *  configuration file. 
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class EventdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The IP address on which eventd listens for TCP connections.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     */
    private java.lang.String _TCPAddress = "127.0.0.1";

    /**
     * The port on which eventd listens for TCP connections.
     *  The default port is 5817.
     */
    private int _TCPPort;

    /**
     * keeps track of state for field: _TCPPort
     */
    private boolean _has_TCPPort;

    /**
     * The IP address on which eventd listens for UDP packets.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     */
    private java.lang.String _UDPAddress = "127.0.0.1";

    /**
     * The port on which eventd listens for UDP packets. The
     *  default port is 5817.
     */
    private int _UDPPort;

    /**
     * keeps track of state for field: _UDPPort
     */
    private boolean _has_UDPPort;

    /**
     * The maximum number of threads used for reading and
     *  processing of incoming events.
     */
    private int _receivers;

    /**
     * keeps track of state for field: _receivers
     */
    private boolean _has_receivers;

    /**
     * SQL query to get next value of the 'nodeNxtId'
     *  database sequence. This is used to make the access database
     *  independant.
     */
    private java.lang.String _getNextEventID;

    /**
     * Set the socket timeout value. In Linux, the close()
     *  system call is not preemptive. Setting this attribute to to
     * 'yes'
     *  causes the socketSoTimeoutPeriod attribute to be set on
     * sockets to
     *  mimic non-blocking socket I/O.
     */
    private java.lang.String _socketSoTimeoutRequired;

    /**
     * Socket timeout, in milliseconds. This is only set on
     *  eventd's sockets if socketSoTimeoutRequired is set to
     *  'yes'.
     */
    private int _socketSoTimeoutPeriod;

    /**
     * keeps track of state for field: _socketSoTimeoutPeriod
     */
    private boolean _has_socketSoTimeoutPeriod;


      //----------------/
     //- Constructors -/
    //----------------/

    public EventdConfiguration() {
        super();
        setTCPAddress("127.0.0.1");
        setUDPAddress("127.0.0.1");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteReceivers(
    ) {
        this._has_receivers= false;
    }

    /**
     */
    public void deleteSocketSoTimeoutPeriod(
    ) {
        this._has_socketSoTimeoutPeriod= false;
    }

    /**
     */
    public void deleteTCPPort(
    ) {
        this._has_TCPPort= false;
    }

    /**
     */
    public void deleteUDPPort(
    ) {
        this._has_UDPPort= false;
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
        
        if (obj instanceof EventdConfiguration) {
        
            EventdConfiguration temp = (EventdConfiguration)obj;
            if (this._TCPAddress != null) {
                if (temp._TCPAddress == null) return false;
                else if (!(this._TCPAddress.equals(temp._TCPAddress))) 
                    return false;
            }
            else if (temp._TCPAddress != null)
                return false;
            if (this._TCPPort != temp._TCPPort)
                return false;
            if (this._has_TCPPort != temp._has_TCPPort)
                return false;
            if (this._UDPAddress != null) {
                if (temp._UDPAddress == null) return false;
                else if (!(this._UDPAddress.equals(temp._UDPAddress))) 
                    return false;
            }
            else if (temp._UDPAddress != null)
                return false;
            if (this._UDPPort != temp._UDPPort)
                return false;
            if (this._has_UDPPort != temp._has_UDPPort)
                return false;
            if (this._receivers != temp._receivers)
                return false;
            if (this._has_receivers != temp._has_receivers)
                return false;
            if (this._getNextEventID != null) {
                if (temp._getNextEventID == null) return false;
                else if (!(this._getNextEventID.equals(temp._getNextEventID))) 
                    return false;
            }
            else if (temp._getNextEventID != null)
                return false;
            if (this._socketSoTimeoutRequired != null) {
                if (temp._socketSoTimeoutRequired == null) return false;
                else if (!(this._socketSoTimeoutRequired.equals(temp._socketSoTimeoutRequired))) 
                    return false;
            }
            else if (temp._socketSoTimeoutRequired != null)
                return false;
            if (this._socketSoTimeoutPeriod != temp._socketSoTimeoutPeriod)
                return false;
            if (this._has_socketSoTimeoutPeriod != temp._has_socketSoTimeoutPeriod)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'getNextEventID'. The field
     * 'getNextEventID' has the following description: SQL query to
     * get next value of the 'nodeNxtId'
     *  database sequence. This is used to make the access database
     *  independant.
     * 
     * @return the value of field 'GetNextEventID'.
     */
    public java.lang.String getGetNextEventID(
    ) {
        return this._getNextEventID;
    }

    /**
     * Returns the value of field 'receivers'. The field
     * 'receivers' has the following description: The maximum
     * number of threads used for reading and
     *  processing of incoming events.
     * 
     * @return the value of field 'Receivers'.
     */
    public int getReceivers(
    ) {
        return this._receivers;
    }

    /**
     * Returns the value of field 'socketSoTimeoutPeriod'. The
     * field 'socketSoTimeoutPeriod' has the following description:
     * Socket timeout, in milliseconds. This is only set on
     *  eventd's sockets if socketSoTimeoutRequired is set to
     *  'yes'.
     * 
     * @return the value of field 'SocketSoTimeoutPeriod'.
     */
    public int getSocketSoTimeoutPeriod(
    ) {
        return this._socketSoTimeoutPeriod;
    }

    /**
     * Returns the value of field 'socketSoTimeoutRequired'. The
     * field 'socketSoTimeoutRequired' has the following
     * description: Set the socket timeout value. In Linux, the
     * close()
     *  system call is not preemptive. Setting this attribute to to
     * 'yes'
     *  causes the socketSoTimeoutPeriod attribute to be set on
     * sockets to
     *  mimic non-blocking socket I/O.
     * 
     * @return the value of field 'SocketSoTimeoutRequired'.
     */
    public java.lang.String getSocketSoTimeoutRequired(
    ) {
        return this._socketSoTimeoutRequired;
    }

    /**
     * Returns the value of field 'TCPAddress'. The field
     * 'TCPAddress' has the following description: The IP address
     * on which eventd listens for TCP connections.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     * 
     * @return the value of field 'TCPAddress'.
     */
    public java.lang.String getTCPAddress(
    ) {
        return this._TCPAddress;
    }

    /**
     * Returns the value of field 'TCPPort'. The field 'TCPPort'
     * has the following description: The port on which eventd
     * listens for TCP connections.
     *  The default port is 5817.
     * 
     * @return the value of field 'TCPPort'.
     */
    public int getTCPPort(
    ) {
        return this._TCPPort;
    }

    /**
     * Returns the value of field 'UDPAddress'. The field
     * 'UDPAddress' has the following description: The IP address
     * on which eventd listens for UDP packets.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     * 
     * @return the value of field 'UDPAddress'.
     */
    public java.lang.String getUDPAddress(
    ) {
        return this._UDPAddress;
    }

    /**
     * Returns the value of field 'UDPPort'. The field 'UDPPort'
     * has the following description: The port on which eventd
     * listens for UDP packets. The
     *  default port is 5817.
     * 
     * @return the value of field 'UDPPort'.
     */
    public int getUDPPort(
    ) {
        return this._UDPPort;
    }

    /**
     * Method hasReceivers.
     * 
     * @return true if at least one Receivers has been added
     */
    public boolean hasReceivers(
    ) {
        return this._has_receivers;
    }

    /**
     * Method hasSocketSoTimeoutPeriod.
     * 
     * @return true if at least one SocketSoTimeoutPeriod has been
     * added
     */
    public boolean hasSocketSoTimeoutPeriod(
    ) {
        return this._has_socketSoTimeoutPeriod;
    }

    /**
     * Method hasTCPPort.
     * 
     * @return true if at least one TCPPort has been added
     */
    public boolean hasTCPPort(
    ) {
        return this._has_TCPPort;
    }

    /**
     * Method hasUDPPort.
     * 
     * @return true if at least one UDPPort has been added
     */
    public boolean hasUDPPort(
    ) {
        return this._has_UDPPort;
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
        if (_TCPAddress != null) {
           result = 37 * result + _TCPAddress.hashCode();
        }
        result = 37 * result + _TCPPort;
        if (_UDPAddress != null) {
           result = 37 * result + _UDPAddress.hashCode();
        }
        result = 37 * result + _UDPPort;
        result = 37 * result + _receivers;
        if (_getNextEventID != null) {
           result = 37 * result + _getNextEventID.hashCode();
        }
        if (_socketSoTimeoutRequired != null) {
           result = 37 * result + _socketSoTimeoutRequired.hashCode();
        }
        result = 37 * result + _socketSoTimeoutPeriod;
        
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
     * Sets the value of field 'getNextEventID'. The field
     * 'getNextEventID' has the following description: SQL query to
     * get next value of the 'nodeNxtId'
     *  database sequence. This is used to make the access database
     *  independant.
     * 
     * @param getNextEventID the value of field 'getNextEventID'.
     */
    public void setGetNextEventID(
            final java.lang.String getNextEventID) {
        this._getNextEventID = getNextEventID;
    }

    /**
     * Sets the value of field 'receivers'. The field 'receivers'
     * has the following description: The maximum number of threads
     * used for reading and
     *  processing of incoming events.
     * 
     * @param receivers the value of field 'receivers'.
     */
    public void setReceivers(
            final int receivers) {
        this._receivers = receivers;
        this._has_receivers = true;
    }

    /**
     * Sets the value of field 'socketSoTimeoutPeriod'. The field
     * 'socketSoTimeoutPeriod' has the following description:
     * Socket timeout, in milliseconds. This is only set on
     *  eventd's sockets if socketSoTimeoutRequired is set to
     *  'yes'.
     * 
     * @param socketSoTimeoutPeriod the value of field
     * 'socketSoTimeoutPeriod'.
     */
    public void setSocketSoTimeoutPeriod(
            final int socketSoTimeoutPeriod) {
        this._socketSoTimeoutPeriod = socketSoTimeoutPeriod;
        this._has_socketSoTimeoutPeriod = true;
    }

    /**
     * Sets the value of field 'socketSoTimeoutRequired'. The field
     * 'socketSoTimeoutRequired' has the following description: Set
     * the socket timeout value. In Linux, the close()
     *  system call is not preemptive. Setting this attribute to to
     * 'yes'
     *  causes the socketSoTimeoutPeriod attribute to be set on
     * sockets to
     *  mimic non-blocking socket I/O.
     * 
     * @param socketSoTimeoutRequired the value of field
     * 'socketSoTimeoutRequired'.
     */
    public void setSocketSoTimeoutRequired(
            final java.lang.String socketSoTimeoutRequired) {
        this._socketSoTimeoutRequired = socketSoTimeoutRequired;
    }

    /**
     * Sets the value of field 'TCPAddress'. The field 'TCPAddress'
     * has the following description: The IP address on which
     * eventd listens for TCP connections.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     * 
     * @param TCPAddress the value of field 'TCPAddress'.
     */
    public void setTCPAddress(
            final java.lang.String TCPAddress) {
        this._TCPAddress = TCPAddress;
    }

    /**
     * Sets the value of field 'TCPPort'. The field 'TCPPort' has
     * the following description: The port on which eventd listens
     * for TCP connections.
     *  The default port is 5817.
     * 
     * @param TCPPort the value of field 'TCPPort'.
     */
    public void setTCPPort(
            final int TCPPort) {
        this._TCPPort = TCPPort;
        this._has_TCPPort = true;
    }

    /**
     * Sets the value of field 'UDPAddress'. The field 'UDPAddress'
     * has the following description: The IP address on which
     * eventd listens for UDP packets.
     *  If "" is specified, eventd will bind to all addresses. The
     * default
     *  address is 127.0.0.1.
     * 
     * @param UDPAddress the value of field 'UDPAddress'.
     */
    public void setUDPAddress(
            final java.lang.String UDPAddress) {
        this._UDPAddress = UDPAddress;
    }

    /**
     * Sets the value of field 'UDPPort'. The field 'UDPPort' has
     * the following description: The port on which eventd listens
     * for UDP packets. The
     *  default port is 5817.
     * 
     * @param UDPPort the value of field 'UDPPort'.
     */
    public void setUDPPort(
            final int UDPPort) {
        this._UDPPort = UDPPort;
        this._has_UDPPort = true;
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
     * org.opennms.netmgt.config.eventd.EventdConfiguration
     */
    public static org.opennms.netmgt.config.eventd.EventdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.eventd.EventdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.eventd.EventdConfiguration.class, reader);
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

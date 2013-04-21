/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.syslogd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the syslogd-configuration.xml
 *  configuration file.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Configuration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The address on which Syslogd listens for SYSLOG Messages.
     * The
     *  default is to listen on all addresses.
     *  
     */
    private java.lang.String _listenAddress;

    /**
     * The port on which Syslogd listens for SYSLOG Messages. The
     *  standard port is 514.
     *  
     */
    private int _syslogPort;

    /**
     * keeps track of state for field: _syslogPort
     */
    private boolean _has_syslogPort;

    /**
     * Whether messages from devices unknown to OpenNMS should
     *  generate newSuspect events.
     *  
     */
    private boolean _newSuspectOnMessage = false;

    /**
     * keeps track of state for field: _newSuspectOnMessage
     */
    private boolean _has_newSuspectOnMessage;

    /**
     * The regular expression used to separate message and host.
     *  
     */
    private java.lang.String _forwardingRegexp;

    /**
     * The matching group for the host
     */
    private int _matchingGroupHost;

    /**
     * keeps track of state for field: _matchingGroupHost
     */
    private boolean _has_matchingGroupHost;

    /**
     * The matching group for the message
     */
    private int _matchingGroupMessage;

    /**
     * keeps track of state for field: _matchingGroupMessage
     */
    private boolean _has_matchingGroupMessage;

    /**
     * A string which defines the class to use when parsing syslog
     * messages.
     *  The default is the "CustomSyslogParser", which honors the
     * forwarding-regexp,
     *  matching-group-host, and matching-group-message attributes,
     * and can parse
     *  most BSD-style Syslog messages, including Syslog-NG's
     * default format.
     *  Other options include
     * "org.opennms.netmgt.syslogd.SyslogNGParser" which is a
     *  slightly more strict version of the CustomSyslogParser, and
     *  "org.opennms.netmgt.syslogd.Rfc5424SyslogParser" which can
     * handle the recent
     *  (2009) RFC for syslog messages.
     *  
     */
    private java.lang.String _parser = "org.opennms.netmgt.syslogd.CustomSyslogParser";

    /**
     * A string which, when used as the value of a "uei"
     *  element inside a "ueiMatch" element, results in all
     *  matching messages to be discarded without an event
     *  ever being created
     *  
     */
    private java.lang.String _discardUei = "DISCARD-MATCHING-MESSAGES";


      //----------------/
     //- Constructors -/
    //----------------/

    public Configuration() {
        super();
        setParser("org.opennms.netmgt.syslogd.CustomSyslogParser");
        setDiscardUei("DISCARD-MATCHING-MESSAGES");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMatchingGroupHost(
    ) {
        this._has_matchingGroupHost= false;
    }

    /**
     */
    public void deleteMatchingGroupMessage(
    ) {
        this._has_matchingGroupMessage= false;
    }

    /**
     */
    public void deleteNewSuspectOnMessage(
    ) {
        this._has_newSuspectOnMessage= false;
    }

    /**
     */
    public void deleteSyslogPort(
    ) {
        this._has_syslogPort= false;
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
        
        if (obj instanceof Configuration) {
        
            Configuration temp = (Configuration)obj;
            if (this._listenAddress != null) {
                if (temp._listenAddress == null) return false;
                else if (!(this._listenAddress.equals(temp._listenAddress))) 
                    return false;
            }
            else if (temp._listenAddress != null)
                return false;
            if (this._syslogPort != temp._syslogPort)
                return false;
            if (this._has_syslogPort != temp._has_syslogPort)
                return false;
            if (this._newSuspectOnMessage != temp._newSuspectOnMessage)
                return false;
            if (this._has_newSuspectOnMessage != temp._has_newSuspectOnMessage)
                return false;
            if (this._forwardingRegexp != null) {
                if (temp._forwardingRegexp == null) return false;
                else if (!(this._forwardingRegexp.equals(temp._forwardingRegexp))) 
                    return false;
            }
            else if (temp._forwardingRegexp != null)
                return false;
            if (this._matchingGroupHost != temp._matchingGroupHost)
                return false;
            if (this._has_matchingGroupHost != temp._has_matchingGroupHost)
                return false;
            if (this._matchingGroupMessage != temp._matchingGroupMessage)
                return false;
            if (this._has_matchingGroupMessage != temp._has_matchingGroupMessage)
                return false;
            if (this._parser != null) {
                if (temp._parser == null) return false;
                else if (!(this._parser.equals(temp._parser))) 
                    return false;
            }
            else if (temp._parser != null)
                return false;
            if (this._discardUei != null) {
                if (temp._discardUei == null) return false;
                else if (!(this._discardUei.equals(temp._discardUei))) 
                    return false;
            }
            else if (temp._discardUei != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'discardUei'. The field
     * 'discardUei' has the following description: A string which,
     * when used as the value of a "uei"
     *  element inside a "ueiMatch" element, results in all
     *  matching messages to be discarded without an event
     *  ever being created
     *  
     * 
     * @return the value of field 'DiscardUei'.
     */
    public java.lang.String getDiscardUei(
    ) {
        return this._discardUei;
    }

    /**
     * Returns the value of field 'forwardingRegexp'. The field
     * 'forwardingRegexp' has the following description: The
     * regular expression used to separate message and host.
     *  
     * 
     * @return the value of field 'ForwardingRegexp'.
     */
    public java.lang.String getForwardingRegexp(
    ) {
        return this._forwardingRegexp;
    }

    /**
     * Returns the value of field 'listenAddress'. The field
     * 'listenAddress' has the following description: The address
     * on which Syslogd listens for SYSLOG Messages. The
     *  default is to listen on all addresses.
     *  
     * 
     * @return the value of field 'ListenAddress'.
     */
    public java.lang.String getListenAddress(
    ) {
        return this._listenAddress;
    }

    /**
     * Returns the value of field 'matchingGroupHost'. The field
     * 'matchingGroupHost' has the following description: The
     * matching group for the host
     * 
     * @return the value of field 'MatchingGroupHost'.
     */
    public int getMatchingGroupHost(
    ) {
        return this._matchingGroupHost;
    }

    /**
     * Returns the value of field 'matchingGroupMessage'. The field
     * 'matchingGroupMessage' has the following description: The
     * matching group for the message
     * 
     * @return the value of field 'MatchingGroupMessage'.
     */
    public int getMatchingGroupMessage(
    ) {
        return this._matchingGroupMessage;
    }

    /**
     * Returns the value of field 'newSuspectOnMessage'. The field
     * 'newSuspectOnMessage' has the following description: Whether
     * messages from devices unknown to OpenNMS should
     *  generate newSuspect events.
     *  
     * 
     * @return the value of field 'NewSuspectOnMessage'.
     */
    public boolean getNewSuspectOnMessage(
    ) {
        return this._newSuspectOnMessage;
    }

    /**
     * Returns the value of field 'parser'. The field 'parser' has
     * the following description: A string which defines the class
     * to use when parsing syslog messages.
     *  The default is the "CustomSyslogParser", which honors the
     * forwarding-regexp,
     *  matching-group-host, and matching-group-message attributes,
     * and can parse
     *  most BSD-style Syslog messages, including Syslog-NG's
     * default format.
     *  Other options include
     * "org.opennms.netmgt.syslogd.SyslogNGParser" which is a
     *  slightly more strict version of the CustomSyslogParser, and
     *  "org.opennms.netmgt.syslogd.Rfc5424SyslogParser" which can
     * handle the recent
     *  (2009) RFC for syslog messages.
     *  
     * 
     * @return the value of field 'Parser'.
     */
    public java.lang.String getParser(
    ) {
        return this._parser;
    }

    /**
     * Returns the value of field 'syslogPort'. The field
     * 'syslogPort' has the following description: The port on
     * which Syslogd listens for SYSLOG Messages. The
     *  standard port is 514.
     *  
     * 
     * @return the value of field 'SyslogPort'.
     */
    public int getSyslogPort(
    ) {
        return this._syslogPort;
    }

    /**
     * Method hasMatchingGroupHost.
     * 
     * @return true if at least one MatchingGroupHost has been added
     */
    public boolean hasMatchingGroupHost(
    ) {
        return this._has_matchingGroupHost;
    }

    /**
     * Method hasMatchingGroupMessage.
     * 
     * @return true if at least one MatchingGroupMessage has been
     * added
     */
    public boolean hasMatchingGroupMessage(
    ) {
        return this._has_matchingGroupMessage;
    }

    /**
     * Method hasNewSuspectOnMessage.
     * 
     * @return true if at least one NewSuspectOnMessage has been
     * added
     */
    public boolean hasNewSuspectOnMessage(
    ) {
        return this._has_newSuspectOnMessage;
    }

    /**
     * Method hasSyslogPort.
     * 
     * @return true if at least one SyslogPort has been added
     */
    public boolean hasSyslogPort(
    ) {
        return this._has_syslogPort;
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
        if (_listenAddress != null) {
           result = 37 * result + _listenAddress.hashCode();
        }
        result = 37 * result + _syslogPort;
        result = 37 * result + (_newSuspectOnMessage?0:1);
        if (_forwardingRegexp != null) {
           result = 37 * result + _forwardingRegexp.hashCode();
        }
        result = 37 * result + _matchingGroupHost;
        result = 37 * result + _matchingGroupMessage;
        if (_parser != null) {
           result = 37 * result + _parser.hashCode();
        }
        if (_discardUei != null) {
           result = 37 * result + _discardUei.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'newSuspectOnMessage'. The field
     * 'newSuspectOnMessage' has the following description: Whether
     * messages from devices unknown to OpenNMS should
     *  generate newSuspect events.
     *  
     * 
     * @return the value of field 'NewSuspectOnMessage'.
     */
    public boolean isNewSuspectOnMessage(
    ) {
        return this._newSuspectOnMessage;
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
     * Sets the value of field 'discardUei'. The field 'discardUei'
     * has the following description: A string which, when used as
     * the value of a "uei"
     *  element inside a "ueiMatch" element, results in all
     *  matching messages to be discarded without an event
     *  ever being created
     *  
     * 
     * @param discardUei the value of field 'discardUei'.
     */
    public void setDiscardUei(
            final java.lang.String discardUei) {
        this._discardUei = discardUei;
    }

    /**
     * Sets the value of field 'forwardingRegexp'. The field
     * 'forwardingRegexp' has the following description: The
     * regular expression used to separate message and host.
     *  
     * 
     * @param forwardingRegexp the value of field 'forwardingRegexp'
     */
    public void setForwardingRegexp(
            final java.lang.String forwardingRegexp) {
        this._forwardingRegexp = forwardingRegexp;
    }

    /**
     * Sets the value of field 'listenAddress'. The field
     * 'listenAddress' has the following description: The address
     * on which Syslogd listens for SYSLOG Messages. The
     *  default is to listen on all addresses.
     *  
     * 
     * @param listenAddress the value of field 'listenAddress'.
     */
    public void setListenAddress(
            final java.lang.String listenAddress) {
        this._listenAddress = listenAddress;
    }

    /**
     * Sets the value of field 'matchingGroupHost'. The field
     * 'matchingGroupHost' has the following description: The
     * matching group for the host
     * 
     * @param matchingGroupHost the value of field
     * 'matchingGroupHost'.
     */
    public void setMatchingGroupHost(
            final int matchingGroupHost) {
        this._matchingGroupHost = matchingGroupHost;
        this._has_matchingGroupHost = true;
    }

    /**
     * Sets the value of field 'matchingGroupMessage'. The field
     * 'matchingGroupMessage' has the following description: The
     * matching group for the message
     * 
     * @param matchingGroupMessage the value of field
     * 'matchingGroupMessage'.
     */
    public void setMatchingGroupMessage(
            final int matchingGroupMessage) {
        this._matchingGroupMessage = matchingGroupMessage;
        this._has_matchingGroupMessage = true;
    }

    /**
     * Sets the value of field 'newSuspectOnMessage'. The field
     * 'newSuspectOnMessage' has the following description: Whether
     * messages from devices unknown to OpenNMS should
     *  generate newSuspect events.
     *  
     * 
     * @param newSuspectOnMessage the value of field
     * 'newSuspectOnMessage'.
     */
    public void setNewSuspectOnMessage(
            final boolean newSuspectOnMessage) {
        this._newSuspectOnMessage = newSuspectOnMessage;
        this._has_newSuspectOnMessage = true;
    }

    /**
     * Sets the value of field 'parser'. The field 'parser' has the
     * following description: A string which defines the class to
     * use when parsing syslog messages.
     *  The default is the "CustomSyslogParser", which honors the
     * forwarding-regexp,
     *  matching-group-host, and matching-group-message attributes,
     * and can parse
     *  most BSD-style Syslog messages, including Syslog-NG's
     * default format.
     *  Other options include
     * "org.opennms.netmgt.syslogd.SyslogNGParser" which is a
     *  slightly more strict version of the CustomSyslogParser, and
     *  "org.opennms.netmgt.syslogd.Rfc5424SyslogParser" which can
     * handle the recent
     *  (2009) RFC for syslog messages.
     *  
     * 
     * @param parser the value of field 'parser'.
     */
    public void setParser(
            final java.lang.String parser) {
        this._parser = parser;
    }

    /**
     * Sets the value of field 'syslogPort'. The field 'syslogPort'
     * has the following description: The port on which Syslogd
     * listens for SYSLOG Messages. The
     *  standard port is 514.
     *  
     * 
     * @param syslogPort the value of field 'syslogPort'.
     */
    public void setSyslogPort(
            final int syslogPort) {
        this._syslogPort = syslogPort;
        this._has_syslogPort = true;
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
     * org.opennms.netmgt.config.syslogd.Configuration
     */
    public static org.opennms.netmgt.config.syslogd.Configuration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.Configuration) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.Configuration.class, reader);
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

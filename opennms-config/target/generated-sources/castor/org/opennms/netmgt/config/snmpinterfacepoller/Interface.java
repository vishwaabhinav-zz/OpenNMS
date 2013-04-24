/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.snmpinterfacepoller;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Interfaces to be polled for addresses in this
 *  package.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Interface implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This represents the SQL criteria that is performed to select
     * interfaces to be polled
     *  example: (snmpifname like '%eth%' and snmpiftype=6)
     */
    private java.lang.String _criteria;

    /**
     * Interfaces group name
     */
    private java.lang.String _name;

    /**
     * Interval at which the interfaces are to be
     *  polled
     */
    private long _interval;

    /**
     * keeps track of state for field: _interval
     */
    private boolean _has_interval;

    /**
     * Specifies if the service is user defined. Used
     *  specifically for UI purposes.
     */
    private java.lang.String _userDefined = "false";

    /**
     * Status of the interfaces. The interfaces are polled only if
     *  this is set to 'on'.
     */
    private java.lang.String _status = "on";

    /**
     * If set, overrides UDP port 161 as the port where SNMP
     *  GET/GETNEXT/GETBULK requests are sent.
     */
    private int _port;

    /**
     * keeps track of state for field: _port
     */
    private boolean _has_port;

    /**
     * Default number of retries
     */
    private int _retry;

    /**
     * keeps track of state for field: _retry
     */
    private boolean _has_retry;

    /**
     * Default timeout (in milliseconds)
     */
    private int _timeout;

    /**
     * keeps track of state for field: _timeout
     */
    private boolean _has_timeout;

    /**
     * Number of variables to send per SNMP request.
     *  
     */
    private int _maxVarsPerPdu = 10;

    /**
     * keeps track of state for field: _maxVarsPerPdu
     */
    private boolean _has_maxVarsPerPdu;

    /**
     * Max Number of Interface per runnable. This is deprecated and
     * will be ignored in the code!
     *  
     */
    private int _maxInterfacePerPdu = 0;

    /**
     * keeps track of state for field: _maxInterfacePerPdu
     */
    private boolean _has_maxInterfacePerPdu;


      //----------------/
     //- Constructors -/
    //----------------/

    public Interface() {
        super();
        setUserDefined("false");
        setStatus("on");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteInterval(
    ) {
        this._has_interval= false;
    }

    /**
     */
    public void deleteMaxInterfacePerPdu(
    ) {
        this._has_maxInterfacePerPdu= false;
    }

    /**
     */
    public void deleteMaxVarsPerPdu(
    ) {
        this._has_maxVarsPerPdu= false;
    }

    /**
     */
    public void deletePort(
    ) {
        this._has_port= false;
    }

    /**
     */
    public void deleteRetry(
    ) {
        this._has_retry= false;
    }

    /**
     */
    public void deleteTimeout(
    ) {
        this._has_timeout= false;
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
        
        if (obj instanceof Interface) {
        
            Interface temp = (Interface)obj;
            if (this._criteria != null) {
                if (temp._criteria == null) return false;
                else if (!(this._criteria.equals(temp._criteria))) 
                    return false;
            }
            else if (temp._criteria != null)
                return false;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._interval != temp._interval)
                return false;
            if (this._has_interval != temp._has_interval)
                return false;
            if (this._userDefined != null) {
                if (temp._userDefined == null) return false;
                else if (!(this._userDefined.equals(temp._userDefined))) 
                    return false;
            }
            else if (temp._userDefined != null)
                return false;
            if (this._status != null) {
                if (temp._status == null) return false;
                else if (!(this._status.equals(temp._status))) 
                    return false;
            }
            else if (temp._status != null)
                return false;
            if (this._port != temp._port)
                return false;
            if (this._has_port != temp._has_port)
                return false;
            if (this._retry != temp._retry)
                return false;
            if (this._has_retry != temp._has_retry)
                return false;
            if (this._timeout != temp._timeout)
                return false;
            if (this._has_timeout != temp._has_timeout)
                return false;
            if (this._maxVarsPerPdu != temp._maxVarsPerPdu)
                return false;
            if (this._has_maxVarsPerPdu != temp._has_maxVarsPerPdu)
                return false;
            if (this._maxInterfacePerPdu != temp._maxInterfacePerPdu)
                return false;
            if (this._has_maxInterfacePerPdu != temp._has_maxInterfacePerPdu)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'criteria'. The field 'criteria'
     * has the following description: This represents the SQL
     * criteria that is performed to select interfaces to be polled
     *  example: (snmpifname like '%eth%' and snmpiftype=6)
     * 
     * @return the value of field 'Criteria'.
     */
    public java.lang.String getCriteria(
    ) {
        return this._criteria;
    }

    /**
     * Returns the value of field 'interval'. The field 'interval'
     * has the following description: Interval at which the
     * interfaces are to be
     *  polled
     * 
     * @return the value of field 'Interval'.
     */
    public long getInterval(
    ) {
        return this._interval;
    }

    /**
     * Returns the value of field 'maxInterfacePerPdu'. The field
     * 'maxInterfacePerPdu' has the following description: Max
     * Number of Interface per runnable. This is deprecated and
     * will be ignored in the code!
     *  
     * 
     * @return the value of field 'MaxInterfacePerPdu'.
     */
    public int getMaxInterfacePerPdu(
    ) {
        return this._maxInterfacePerPdu;
    }

    /**
     * Returns the value of field 'maxVarsPerPdu'. The field
     * 'maxVarsPerPdu' has the following description: Number of
     * variables to send per SNMP request.
     *  
     * 
     * @return the value of field 'MaxVarsPerPdu'.
     */
    public int getMaxVarsPerPdu(
    ) {
        return this._maxVarsPerPdu;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Interfaces group name
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'port'. The field 'port' has the
     * following description: If set, overrides UDP port 161 as the
     * port where SNMP
     *  GET/GETNEXT/GETBULK requests are sent.
     * 
     * @return the value of field 'Port'.
     */
    public int getPort(
    ) {
        return this._port;
    }

    /**
     * Returns the value of field 'retry'. The field 'retry' has
     * the following description: Default number of retries
     * 
     * @return the value of field 'Retry'.
     */
    public int getRetry(
    ) {
        return this._retry;
    }

    /**
     * Returns the value of field 'status'. The field 'status' has
     * the following description: Status of the interfaces. The
     * interfaces are polled only if
     *  this is set to 'on'.
     * 
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus(
    ) {
        return this._status;
    }

    /**
     * Returns the value of field 'timeout'. The field 'timeout'
     * has the following description: Default timeout (in
     * milliseconds)
     * 
     * @return the value of field 'Timeout'.
     */
    public int getTimeout(
    ) {
        return this._timeout;
    }

    /**
     * Returns the value of field 'userDefined'. The field
     * 'userDefined' has the following description: Specifies if
     * the service is user defined. Used
     *  specifically for UI purposes.
     * 
     * @return the value of field 'UserDefined'.
     */
    public java.lang.String getUserDefined(
    ) {
        return this._userDefined;
    }

    /**
     * Method hasInterval.
     * 
     * @return true if at least one Interval has been added
     */
    public boolean hasInterval(
    ) {
        return this._has_interval;
    }

    /**
     * Method hasMaxInterfacePerPdu.
     * 
     * @return true if at least one MaxInterfacePerPdu has been adde
     */
    public boolean hasMaxInterfacePerPdu(
    ) {
        return this._has_maxInterfacePerPdu;
    }

    /**
     * Method hasMaxVarsPerPdu.
     * 
     * @return true if at least one MaxVarsPerPdu has been added
     */
    public boolean hasMaxVarsPerPdu(
    ) {
        return this._has_maxVarsPerPdu;
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
     * Method hasRetry.
     * 
     * @return true if at least one Retry has been added
     */
    public boolean hasRetry(
    ) {
        return this._has_retry;
    }

    /**
     * Method hasTimeout.
     * 
     * @return true if at least one Timeout has been added
     */
    public boolean hasTimeout(
    ) {
        return this._has_timeout;
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
        if (_criteria != null) {
           result = 37 * result + _criteria.hashCode();
        }
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        result = 37 * result + (int)(_interval^(_interval>>>32));
        if (_userDefined != null) {
           result = 37 * result + _userDefined.hashCode();
        }
        if (_status != null) {
           result = 37 * result + _status.hashCode();
        }
        result = 37 * result + _port;
        result = 37 * result + _retry;
        result = 37 * result + _timeout;
        result = 37 * result + _maxVarsPerPdu;
        result = 37 * result + _maxInterfacePerPdu;
        
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
     * Sets the value of field 'criteria'. The field 'criteria' has
     * the following description: This represents the SQL criteria
     * that is performed to select interfaces to be polled
     *  example: (snmpifname like '%eth%' and snmpiftype=6)
     * 
     * @param criteria the value of field 'criteria'.
     */
    public void setCriteria(
            final java.lang.String criteria) {
        this._criteria = criteria;
    }

    /**
     * Sets the value of field 'interval'. The field 'interval' has
     * the following description: Interval at which the interfaces
     * are to be
     *  polled
     * 
     * @param interval the value of field 'interval'.
     */
    public void setInterval(
            final long interval) {
        this._interval = interval;
        this._has_interval = true;
    }

    /**
     * Sets the value of field 'maxInterfacePerPdu'. The field
     * 'maxInterfacePerPdu' has the following description: Max
     * Number of Interface per runnable. This is deprecated and
     * will be ignored in the code!
     *  
     * 
     * @param maxInterfacePerPdu the value of field
     * 'maxInterfacePerPdu'.
     */
    public void setMaxInterfacePerPdu(
            final int maxInterfacePerPdu) {
        this._maxInterfacePerPdu = maxInterfacePerPdu;
        this._has_maxInterfacePerPdu = true;
    }

    /**
     * Sets the value of field 'maxVarsPerPdu'. The field
     * 'maxVarsPerPdu' has the following description: Number of
     * variables to send per SNMP request.
     *  
     * 
     * @param maxVarsPerPdu the value of field 'maxVarsPerPdu'.
     */
    public void setMaxVarsPerPdu(
            final int maxVarsPerPdu) {
        this._maxVarsPerPdu = maxVarsPerPdu;
        this._has_maxVarsPerPdu = true;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Interfaces group name
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'port'. The field 'port' has the
     * following description: If set, overrides UDP port 161 as the
     * port where SNMP
     *  GET/GETNEXT/GETBULK requests are sent.
     * 
     * @param port the value of field 'port'.
     */
    public void setPort(
            final int port) {
        this._port = port;
        this._has_port = true;
    }

    /**
     * Sets the value of field 'retry'. The field 'retry' has the
     * following description: Default number of retries
     * 
     * @param retry the value of field 'retry'.
     */
    public void setRetry(
            final int retry) {
        this._retry = retry;
        this._has_retry = true;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: Status of the interfaces. The
     * interfaces are polled only if
     *  this is set to 'on'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
    }

    /**
     * Sets the value of field 'timeout'. The field 'timeout' has
     * the following description: Default timeout (in milliseconds)
     * 
     * @param timeout the value of field 'timeout'.
     */
    public void setTimeout(
            final int timeout) {
        this._timeout = timeout;
        this._has_timeout = true;
    }

    /**
     * Sets the value of field 'userDefined'. The field
     * 'userDefined' has the following description: Specifies if
     * the service is user defined. Used
     *  specifically for UI purposes.
     * 
     * @param userDefined the value of field 'userDefined'.
     */
    public void setUserDefined(
            final java.lang.String userDefined) {
        this._userDefined = userDefined;
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
     * org.opennms.netmgt.config.snmpinterfacepoller.Interface
     */
    public static org.opennms.netmgt.config.snmpinterfacepoller.Interface unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.snmpinterfacepoller.Interface) Unmarshaller.unmarshal(org.opennms.netmgt.config.snmpinterfacepoller.Interface.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rtc;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the rtc-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class RTCConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Maximum number of threads reading the events and
     *  updating the RTC data.
     */
    private int _updaters;

    /**
     * keeps track of state for field: _updaters
     */
    private boolean _has_updaters;

    /**
     * Maximum number of threads sending data to the
     *  UI.
     */
    private int _senders;

    /**
     * keeps track of state for field: _senders
     */
    private boolean _has_senders;

    /**
     * The rolling window over which availability is
     *  calculated. It can be specified as a combination of
     *  hours/minutes/seconds. E.g.: 10h20m5s
     */
    private java.lang.String _rollingWindow;

    /**
     * The number of received events that prompts an
     *  immediate send of RTC data to the UI. This causes data to
     * be sent
     *  immediately instead of waiting for a timer to go
     *  off.
     */
    private int _maxEventsBeforeResend;

    /**
     * keeps track of state for field: _maxEventsBeforeResend
     */
    private boolean _has_maxEventsBeforeResend;

    /**
     * Low threshold timer interval.
     */
    private java.lang.String _lowThresholdInterval;

    /**
     * High threshold timer interval.
     */
    private java.lang.String _highThresholdInterval;

    /**
     * User threshold timer interval. Used to send RTC data
     *  to the UI when no events are coming in.
     */
    private java.lang.String _userRefreshInterval;

    /**
     * Number of times a URL post is tried with errors
     *  before automatically unsubscribing the URL. A negative
     * value means
     *  the URL is not unsubscribed until an 'unsubscribe' event is
     *  received.
     */
    private int _errorsBeforeUrlUnsubscribe;

    /**
     * keeps track of state for field: _errorsBeforeUrlUnsubscribe
     */
    private boolean _has_errorsBeforeUrlUnsubscribe;


      //----------------/
     //- Constructors -/
    //----------------/

    public RTCConfiguration() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteErrorsBeforeUrlUnsubscribe(
    ) {
        this._has_errorsBeforeUrlUnsubscribe= false;
    }

    /**
     */
    public void deleteMaxEventsBeforeResend(
    ) {
        this._has_maxEventsBeforeResend= false;
    }

    /**
     */
    public void deleteSenders(
    ) {
        this._has_senders= false;
    }

    /**
     */
    public void deleteUpdaters(
    ) {
        this._has_updaters= false;
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
        
        if (obj instanceof RTCConfiguration) {
        
            RTCConfiguration temp = (RTCConfiguration)obj;
            if (this._updaters != temp._updaters)
                return false;
            if (this._has_updaters != temp._has_updaters)
                return false;
            if (this._senders != temp._senders)
                return false;
            if (this._has_senders != temp._has_senders)
                return false;
            if (this._rollingWindow != null) {
                if (temp._rollingWindow == null) return false;
                else if (!(this._rollingWindow.equals(temp._rollingWindow))) 
                    return false;
            }
            else if (temp._rollingWindow != null)
                return false;
            if (this._maxEventsBeforeResend != temp._maxEventsBeforeResend)
                return false;
            if (this._has_maxEventsBeforeResend != temp._has_maxEventsBeforeResend)
                return false;
            if (this._lowThresholdInterval != null) {
                if (temp._lowThresholdInterval == null) return false;
                else if (!(this._lowThresholdInterval.equals(temp._lowThresholdInterval))) 
                    return false;
            }
            else if (temp._lowThresholdInterval != null)
                return false;
            if (this._highThresholdInterval != null) {
                if (temp._highThresholdInterval == null) return false;
                else if (!(this._highThresholdInterval.equals(temp._highThresholdInterval))) 
                    return false;
            }
            else if (temp._highThresholdInterval != null)
                return false;
            if (this._userRefreshInterval != null) {
                if (temp._userRefreshInterval == null) return false;
                else if (!(this._userRefreshInterval.equals(temp._userRefreshInterval))) 
                    return false;
            }
            else if (temp._userRefreshInterval != null)
                return false;
            if (this._errorsBeforeUrlUnsubscribe != temp._errorsBeforeUrlUnsubscribe)
                return false;
            if (this._has_errorsBeforeUrlUnsubscribe != temp._has_errorsBeforeUrlUnsubscribe)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'errorsBeforeUrlUnsubscribe'. The
     * field 'errorsBeforeUrlUnsubscribe' has the following
     * description: Number of times a URL post is tried with errors
     *  before automatically unsubscribing the URL. A negative
     * value means
     *  the URL is not unsubscribed until an 'unsubscribe' event is
     *  received.
     * 
     * @return the value of field 'ErrorsBeforeUrlUnsubscribe'.
     */
    public int getErrorsBeforeUrlUnsubscribe(
    ) {
        return this._errorsBeforeUrlUnsubscribe;
    }

    /**
     * Returns the value of field 'highThresholdInterval'. The
     * field 'highThresholdInterval' has the following description:
     * High threshold timer interval.
     * 
     * @return the value of field 'HighThresholdInterval'.
     */
    public java.lang.String getHighThresholdInterval(
    ) {
        return this._highThresholdInterval;
    }

    /**
     * Returns the value of field 'lowThresholdInterval'. The field
     * 'lowThresholdInterval' has the following description: Low
     * threshold timer interval.
     * 
     * @return the value of field 'LowThresholdInterval'.
     */
    public java.lang.String getLowThresholdInterval(
    ) {
        return this._lowThresholdInterval;
    }

    /**
     * Returns the value of field 'maxEventsBeforeResend'. The
     * field 'maxEventsBeforeResend' has the following description:
     * The number of received events that prompts an
     *  immediate send of RTC data to the UI. This causes data to
     * be sent
     *  immediately instead of waiting for a timer to go
     *  off.
     * 
     * @return the value of field 'MaxEventsBeforeResend'.
     */
    public int getMaxEventsBeforeResend(
    ) {
        return this._maxEventsBeforeResend;
    }

    /**
     * Returns the value of field 'rollingWindow'. The field
     * 'rollingWindow' has the following description: The rolling
     * window over which availability is
     *  calculated. It can be specified as a combination of
     *  hours/minutes/seconds. E.g.: 10h20m5s
     * 
     * @return the value of field 'RollingWindow'.
     */
    public java.lang.String getRollingWindow(
    ) {
        return this._rollingWindow;
    }

    /**
     * Returns the value of field 'senders'. The field 'senders'
     * has the following description: Maximum number of threads
     * sending data to the
     *  UI.
     * 
     * @return the value of field 'Senders'.
     */
    public int getSenders(
    ) {
        return this._senders;
    }

    /**
     * Returns the value of field 'updaters'. The field 'updaters'
     * has the following description: Maximum number of threads
     * reading the events and
     *  updating the RTC data.
     * 
     * @return the value of field 'Updaters'.
     */
    public int getUpdaters(
    ) {
        return this._updaters;
    }

    /**
     * Returns the value of field 'userRefreshInterval'. The field
     * 'userRefreshInterval' has the following description: User
     * threshold timer interval. Used to send RTC data
     *  to the UI when no events are coming in.
     * 
     * @return the value of field 'UserRefreshInterval'.
     */
    public java.lang.String getUserRefreshInterval(
    ) {
        return this._userRefreshInterval;
    }

    /**
     * Method hasErrorsBeforeUrlUnsubscribe.
     * 
     * @return true if at least one ErrorsBeforeUrlUnsubscribe has
     * been added
     */
    public boolean hasErrorsBeforeUrlUnsubscribe(
    ) {
        return this._has_errorsBeforeUrlUnsubscribe;
    }

    /**
     * Method hasMaxEventsBeforeResend.
     * 
     * @return true if at least one MaxEventsBeforeResend has been
     * added
     */
    public boolean hasMaxEventsBeforeResend(
    ) {
        return this._has_maxEventsBeforeResend;
    }

    /**
     * Method hasSenders.
     * 
     * @return true if at least one Senders has been added
     */
    public boolean hasSenders(
    ) {
        return this._has_senders;
    }

    /**
     * Method hasUpdaters.
     * 
     * @return true if at least one Updaters has been added
     */
    public boolean hasUpdaters(
    ) {
        return this._has_updaters;
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
        result = 37 * result + _updaters;
        result = 37 * result + _senders;
        if (_rollingWindow != null) {
           result = 37 * result + _rollingWindow.hashCode();
        }
        result = 37 * result + _maxEventsBeforeResend;
        if (_lowThresholdInterval != null) {
           result = 37 * result + _lowThresholdInterval.hashCode();
        }
        if (_highThresholdInterval != null) {
           result = 37 * result + _highThresholdInterval.hashCode();
        }
        if (_userRefreshInterval != null) {
           result = 37 * result + _userRefreshInterval.hashCode();
        }
        result = 37 * result + _errorsBeforeUrlUnsubscribe;
        
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
     * Sets the value of field 'errorsBeforeUrlUnsubscribe'. The
     * field 'errorsBeforeUrlUnsubscribe' has the following
     * description: Number of times a URL post is tried with errors
     *  before automatically unsubscribing the URL. A negative
     * value means
     *  the URL is not unsubscribed until an 'unsubscribe' event is
     *  received.
     * 
     * @param errorsBeforeUrlUnsubscribe the value of field
     * 'errorsBeforeUrlUnsubscribe'.
     */
    public void setErrorsBeforeUrlUnsubscribe(
            final int errorsBeforeUrlUnsubscribe) {
        this._errorsBeforeUrlUnsubscribe = errorsBeforeUrlUnsubscribe;
        this._has_errorsBeforeUrlUnsubscribe = true;
    }

    /**
     * Sets the value of field 'highThresholdInterval'. The field
     * 'highThresholdInterval' has the following description: High
     * threshold timer interval.
     * 
     * @param highThresholdInterval the value of field
     * 'highThresholdInterval'.
     */
    public void setHighThresholdInterval(
            final java.lang.String highThresholdInterval) {
        this._highThresholdInterval = highThresholdInterval;
    }

    /**
     * Sets the value of field 'lowThresholdInterval'. The field
     * 'lowThresholdInterval' has the following description: Low
     * threshold timer interval.
     * 
     * @param lowThresholdInterval the value of field
     * 'lowThresholdInterval'.
     */
    public void setLowThresholdInterval(
            final java.lang.String lowThresholdInterval) {
        this._lowThresholdInterval = lowThresholdInterval;
    }

    /**
     * Sets the value of field 'maxEventsBeforeResend'. The field
     * 'maxEventsBeforeResend' has the following description: The
     * number of received events that prompts an
     *  immediate send of RTC data to the UI. This causes data to
     * be sent
     *  immediately instead of waiting for a timer to go
     *  off.
     * 
     * @param maxEventsBeforeResend the value of field
     * 'maxEventsBeforeResend'.
     */
    public void setMaxEventsBeforeResend(
            final int maxEventsBeforeResend) {
        this._maxEventsBeforeResend = maxEventsBeforeResend;
        this._has_maxEventsBeforeResend = true;
    }

    /**
     * Sets the value of field 'rollingWindow'. The field
     * 'rollingWindow' has the following description: The rolling
     * window over which availability is
     *  calculated. It can be specified as a combination of
     *  hours/minutes/seconds. E.g.: 10h20m5s
     * 
     * @param rollingWindow the value of field 'rollingWindow'.
     */
    public void setRollingWindow(
            final java.lang.String rollingWindow) {
        this._rollingWindow = rollingWindow;
    }

    /**
     * Sets the value of field 'senders'. The field 'senders' has
     * the following description: Maximum number of threads sending
     * data to the
     *  UI.
     * 
     * @param senders the value of field 'senders'.
     */
    public void setSenders(
            final int senders) {
        this._senders = senders;
        this._has_senders = true;
    }

    /**
     * Sets the value of field 'updaters'. The field 'updaters' has
     * the following description: Maximum number of threads reading
     * the events and
     *  updating the RTC data.
     * 
     * @param updaters the value of field 'updaters'.
     */
    public void setUpdaters(
            final int updaters) {
        this._updaters = updaters;
        this._has_updaters = true;
    }

    /**
     * Sets the value of field 'userRefreshInterval'. The field
     * 'userRefreshInterval' has the following description: User
     * threshold timer interval. Used to send RTC data
     *  to the UI when no events are coming in.
     * 
     * @param userRefreshInterval the value of field
     * 'userRefreshInterval'.
     */
    public void setUserRefreshInterval(
            final java.lang.String userRefreshInterval) {
        this._userRefreshInterval = userRefreshInterval;
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
     * org.opennms.netmgt.config.rtc.RTCConfiguration
     */
    public static org.opennms.netmgt.config.rtc.RTCConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rtc.RTCConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.rtc.RTCConfiguration.class, reader);
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

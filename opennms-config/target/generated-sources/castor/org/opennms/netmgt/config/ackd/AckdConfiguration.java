/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.ackd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Behavior configuration for the Acknowledgment Daemon
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class AckdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _alarmSync.
     */
    private boolean _alarmSync = true;

    /**
     * keeps track of state for field: _alarmSync
     */
    private boolean _has_alarmSync;

    /**
     * Field _ackExpression.
     */
    private java.lang.String _ackExpression = "~^ack$";

    /**
     * Field _unackExpression.
     */
    private java.lang.String _unackExpression = "~^unack$";

    /**
     * Field _escalateExpression.
     */
    private java.lang.String _escalateExpression = "~^esc$";

    /**
     * Field _clearExpression.
     */
    private java.lang.String _clearExpression = "~^(resolve|clear)$";

    /**
     * Field _notifyidMatchExpression.
     */
    private java.lang.String _notifyidMatchExpression = "~.*Re:.*Notice #([0-9]+).*";

    /**
     * Field _alarmidMatchExpression.
     */
    private java.lang.String _alarmidMatchExpression = "~.*Re:.*Alarm #([0-9]+).*";

    /**
     * Location for user to define readers and they're schedules.
     *  
     */
    private org.opennms.netmgt.config.ackd.Readers _readers;


      //----------------/
     //- Constructors -/
    //----------------/

    public AckdConfiguration() {
        super();
        setAckExpression("~^ack$");
        setUnackExpression("~^unack$");
        setEscalateExpression("~^esc$");
        setClearExpression("~^(resolve|clear)$");
        setNotifyidMatchExpression("~.*Re:.*Notice #([0-9]+).*");
        setAlarmidMatchExpression("~.*Re:.*Alarm #([0-9]+).*");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteAlarmSync(
    ) {
        this._has_alarmSync= false;
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
        
        if (obj instanceof AckdConfiguration) {
        
            AckdConfiguration temp = (AckdConfiguration)obj;
            if (this._alarmSync != temp._alarmSync)
                return false;
            if (this._has_alarmSync != temp._has_alarmSync)
                return false;
            if (this._ackExpression != null) {
                if (temp._ackExpression == null) return false;
                else if (!(this._ackExpression.equals(temp._ackExpression))) 
                    return false;
            }
            else if (temp._ackExpression != null)
                return false;
            if (this._unackExpression != null) {
                if (temp._unackExpression == null) return false;
                else if (!(this._unackExpression.equals(temp._unackExpression))) 
                    return false;
            }
            else if (temp._unackExpression != null)
                return false;
            if (this._escalateExpression != null) {
                if (temp._escalateExpression == null) return false;
                else if (!(this._escalateExpression.equals(temp._escalateExpression))) 
                    return false;
            }
            else if (temp._escalateExpression != null)
                return false;
            if (this._clearExpression != null) {
                if (temp._clearExpression == null) return false;
                else if (!(this._clearExpression.equals(temp._clearExpression))) 
                    return false;
            }
            else if (temp._clearExpression != null)
                return false;
            if (this._notifyidMatchExpression != null) {
                if (temp._notifyidMatchExpression == null) return false;
                else if (!(this._notifyidMatchExpression.equals(temp._notifyidMatchExpression))) 
                    return false;
            }
            else if (temp._notifyidMatchExpression != null)
                return false;
            if (this._alarmidMatchExpression != null) {
                if (temp._alarmidMatchExpression == null) return false;
                else if (!(this._alarmidMatchExpression.equals(temp._alarmidMatchExpression))) 
                    return false;
            }
            else if (temp._alarmidMatchExpression != null)
                return false;
            if (this._readers != null) {
                if (temp._readers == null) return false;
                else if (!(this._readers.equals(temp._readers))) 
                    return false;
            }
            else if (temp._readers != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'ackExpression'.
     * 
     * @return the value of field 'AckExpression'.
     */
    public java.lang.String getAckExpression(
    ) {
        return this._ackExpression;
    }

    /**
     * Returns the value of field 'alarmSync'.
     * 
     * @return the value of field 'AlarmSync'.
     */
    public boolean getAlarmSync(
    ) {
        return this._alarmSync;
    }

    /**
     * Returns the value of field 'alarmidMatchExpression'.
     * 
     * @return the value of field 'AlarmidMatchExpression'.
     */
    public java.lang.String getAlarmidMatchExpression(
    ) {
        return this._alarmidMatchExpression;
    }

    /**
     * Returns the value of field 'clearExpression'.
     * 
     * @return the value of field 'ClearExpression'.
     */
    public java.lang.String getClearExpression(
    ) {
        return this._clearExpression;
    }

    /**
     * Returns the value of field 'escalateExpression'.
     * 
     * @return the value of field 'EscalateExpression'.
     */
    public java.lang.String getEscalateExpression(
    ) {
        return this._escalateExpression;
    }

    /**
     * Returns the value of field 'notifyidMatchExpression'.
     * 
     * @return the value of field 'NotifyidMatchExpression'.
     */
    public java.lang.String getNotifyidMatchExpression(
    ) {
        return this._notifyidMatchExpression;
    }

    /**
     * Returns the value of field 'readers'. The field 'readers'
     * has the following description: Location for user to define
     * readers and they're schedules.
     *  
     * 
     * @return the value of field 'Readers'.
     */
    public org.opennms.netmgt.config.ackd.Readers getReaders(
    ) {
        return this._readers;
    }

    /**
     * Returns the value of field 'unackExpression'.
     * 
     * @return the value of field 'UnackExpression'.
     */
    public java.lang.String getUnackExpression(
    ) {
        return this._unackExpression;
    }

    /**
     * Method hasAlarmSync.
     * 
     * @return true if at least one AlarmSync has been added
     */
    public boolean hasAlarmSync(
    ) {
        return this._has_alarmSync;
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
        result = 37 * result + (_alarmSync?0:1);
        if (_ackExpression != null) {
           result = 37 * result + _ackExpression.hashCode();
        }
        if (_unackExpression != null) {
           result = 37 * result + _unackExpression.hashCode();
        }
        if (_escalateExpression != null) {
           result = 37 * result + _escalateExpression.hashCode();
        }
        if (_clearExpression != null) {
           result = 37 * result + _clearExpression.hashCode();
        }
        if (_notifyidMatchExpression != null) {
           result = 37 * result + _notifyidMatchExpression.hashCode();
        }
        if (_alarmidMatchExpression != null) {
           result = 37 * result + _alarmidMatchExpression.hashCode();
        }
        if (_readers != null) {
           result = 37 * result + _readers.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'alarmSync'.
     * 
     * @return the value of field 'AlarmSync'.
     */
    public boolean isAlarmSync(
    ) {
        return this._alarmSync;
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
     * Sets the value of field 'ackExpression'.
     * 
     * @param ackExpression the value of field 'ackExpression'.
     */
    public void setAckExpression(
            final java.lang.String ackExpression) {
        this._ackExpression = ackExpression;
    }

    /**
     * Sets the value of field 'alarmSync'.
     * 
     * @param alarmSync the value of field 'alarmSync'.
     */
    public void setAlarmSync(
            final boolean alarmSync) {
        this._alarmSync = alarmSync;
        this._has_alarmSync = true;
    }

    /**
     * Sets the value of field 'alarmidMatchExpression'.
     * 
     * @param alarmidMatchExpression the value of field
     * 'alarmidMatchExpression'.
     */
    public void setAlarmidMatchExpression(
            final java.lang.String alarmidMatchExpression) {
        this._alarmidMatchExpression = alarmidMatchExpression;
    }

    /**
     * Sets the value of field 'clearExpression'.
     * 
     * @param clearExpression the value of field 'clearExpression'.
     */
    public void setClearExpression(
            final java.lang.String clearExpression) {
        this._clearExpression = clearExpression;
    }

    /**
     * Sets the value of field 'escalateExpression'.
     * 
     * @param escalateExpression the value of field
     * 'escalateExpression'.
     */
    public void setEscalateExpression(
            final java.lang.String escalateExpression) {
        this._escalateExpression = escalateExpression;
    }

    /**
     * Sets the value of field 'notifyidMatchExpression'.
     * 
     * @param notifyidMatchExpression the value of field
     * 'notifyidMatchExpression'.
     */
    public void setNotifyidMatchExpression(
            final java.lang.String notifyidMatchExpression) {
        this._notifyidMatchExpression = notifyidMatchExpression;
    }

    /**
     * Sets the value of field 'readers'. The field 'readers' has
     * the following description: Location for user to define
     * readers and they're schedules.
     *  
     * 
     * @param readers the value of field 'readers'.
     */
    public void setReaders(
            final org.opennms.netmgt.config.ackd.Readers readers) {
        this._readers = readers;
    }

    /**
     * Sets the value of field 'unackExpression'.
     * 
     * @param unackExpression the value of field 'unackExpression'.
     */
    public void setUnackExpression(
            final java.lang.String unackExpression) {
        this._unackExpression = unackExpression;
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
     * org.opennms.netmgt.config.ackd.AckdConfiguration
     */
    public static org.opennms.netmgt.config.ackd.AckdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.ackd.AckdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.ackd.AckdConfiguration.class, reader);
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

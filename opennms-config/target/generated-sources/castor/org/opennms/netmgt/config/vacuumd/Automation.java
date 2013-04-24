/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.vacuumd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Triggers and Actions hooked up and run by the Vacuumd
 *  schedule using interval for frequency
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Automation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of this automation
     */
    private java.lang.String _name;

    /**
     * How ofter should this autmation run
     */
    private int _interval;

    /**
     * keeps track of state for field: _interval
     */
    private boolean _has_interval;

    /**
     * reference a trigger from the collection of
     *  triggers
     */
    private java.lang.String _triggerName;

    /**
     * reference an action from the collection of
     *  actions
     */
    private java.lang.String _actionName;

    /**
     * specify an event UEI to send
     */
    private java.lang.String _autoEventName;

    /**
     * Create an Event from Result of Trigger
     */
    private java.lang.String _actionEvent;

    /**
     * enable/disable this automation
     */
    private boolean _active;

    /**
     * keeps track of state for field: _active
     */
    private boolean _has_active;


      //----------------/
     //- Constructors -/
    //----------------/

    public Automation() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteActive(
    ) {
        this._has_active= false;
    }

    /**
     */
    public void deleteInterval(
    ) {
        this._has_interval= false;
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
        
        if (obj instanceof Automation) {
        
            Automation temp = (Automation)obj;
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
            if (this._triggerName != null) {
                if (temp._triggerName == null) return false;
                else if (!(this._triggerName.equals(temp._triggerName))) 
                    return false;
            }
            else if (temp._triggerName != null)
                return false;
            if (this._actionName != null) {
                if (temp._actionName == null) return false;
                else if (!(this._actionName.equals(temp._actionName))) 
                    return false;
            }
            else if (temp._actionName != null)
                return false;
            if (this._autoEventName != null) {
                if (temp._autoEventName == null) return false;
                else if (!(this._autoEventName.equals(temp._autoEventName))) 
                    return false;
            }
            else if (temp._autoEventName != null)
                return false;
            if (this._actionEvent != null) {
                if (temp._actionEvent == null) return false;
                else if (!(this._actionEvent.equals(temp._actionEvent))) 
                    return false;
            }
            else if (temp._actionEvent != null)
                return false;
            if (this._active != temp._active)
                return false;
            if (this._has_active != temp._has_active)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'actionEvent'. The field
     * 'actionEvent' has the following description: Create an Event
     * from Result of Trigger
     * 
     * @return the value of field 'ActionEvent'.
     */
    public java.lang.String getActionEvent(
    ) {
        return this._actionEvent;
    }

    /**
     * Returns the value of field 'actionName'. The field
     * 'actionName' has the following description: reference an
     * action from the collection of
     *  actions
     * 
     * @return the value of field 'ActionName'.
     */
    public java.lang.String getActionName(
    ) {
        return this._actionName;
    }

    /**
     * Returns the value of field 'active'. The field 'active' has
     * the following description: enable/disable this automation
     * 
     * @return the value of field 'Active'.
     */
    public boolean getActive(
    ) {
        return this._active;
    }

    /**
     * Returns the value of field 'autoEventName'. The field
     * 'autoEventName' has the following description: specify an
     * event UEI to send
     * 
     * @return the value of field 'AutoEventName'.
     */
    public java.lang.String getAutoEventName(
    ) {
        return this._autoEventName;
    }

    /**
     * Returns the value of field 'interval'. The field 'interval'
     * has the following description: How ofter should this
     * autmation run
     * 
     * @return the value of field 'Interval'.
     */
    public int getInterval(
    ) {
        return this._interval;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The name of this automation
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'triggerName'. The field
     * 'triggerName' has the following description: reference a
     * trigger from the collection of
     *  triggers
     * 
     * @return the value of field 'TriggerName'.
     */
    public java.lang.String getTriggerName(
    ) {
        return this._triggerName;
    }

    /**
     * Method hasActive.
     * 
     * @return true if at least one Active has been added
     */
    public boolean hasActive(
    ) {
        return this._has_active;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        result = 37 * result + _interval;
        if (_triggerName != null) {
           result = 37 * result + _triggerName.hashCode();
        }
        if (_actionName != null) {
           result = 37 * result + _actionName.hashCode();
        }
        if (_autoEventName != null) {
           result = 37 * result + _autoEventName.hashCode();
        }
        if (_actionEvent != null) {
           result = 37 * result + _actionEvent.hashCode();
        }
        result = 37 * result + (_active?0:1);
        
        return result;
    }

    /**
     * Returns the value of field 'active'. The field 'active' has
     * the following description: enable/disable this automation
     * 
     * @return the value of field 'Active'.
     */
    public boolean isActive(
    ) {
        return this._active;
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
     * Sets the value of field 'actionEvent'. The field
     * 'actionEvent' has the following description: Create an Event
     * from Result of Trigger
     * 
     * @param actionEvent the value of field 'actionEvent'.
     */
    public void setActionEvent(
            final java.lang.String actionEvent) {
        this._actionEvent = actionEvent;
    }

    /**
     * Sets the value of field 'actionName'. The field 'actionName'
     * has the following description: reference an action from the
     * collection of
     *  actions
     * 
     * @param actionName the value of field 'actionName'.
     */
    public void setActionName(
            final java.lang.String actionName) {
        this._actionName = actionName;
    }

    /**
     * Sets the value of field 'active'. The field 'active' has the
     * following description: enable/disable this automation
     * 
     * @param active the value of field 'active'.
     */
    public void setActive(
            final boolean active) {
        this._active = active;
        this._has_active = true;
    }

    /**
     * Sets the value of field 'autoEventName'. The field
     * 'autoEventName' has the following description: specify an
     * event UEI to send
     * 
     * @param autoEventName the value of field 'autoEventName'.
     */
    public void setAutoEventName(
            final java.lang.String autoEventName) {
        this._autoEventName = autoEventName;
    }

    /**
     * Sets the value of field 'interval'. The field 'interval' has
     * the following description: How ofter should this autmation
     * run
     * 
     * @param interval the value of field 'interval'.
     */
    public void setInterval(
            final int interval) {
        this._interval = interval;
        this._has_interval = true;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The name of this automation
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'triggerName'. The field
     * 'triggerName' has the following description: reference a
     * trigger from the collection of
     *  triggers
     * 
     * @param triggerName the value of field 'triggerName'.
     */
    public void setTriggerName(
            final java.lang.String triggerName) {
        this._triggerName = triggerName;
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
     * org.opennms.netmgt.config.vacuumd.Automation
     */
    public static org.opennms.netmgt.config.vacuumd.Automation unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vacuumd.Automation) Unmarshaller.unmarshal(org.opennms.netmgt.config.vacuumd.Automation.class, reader);
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

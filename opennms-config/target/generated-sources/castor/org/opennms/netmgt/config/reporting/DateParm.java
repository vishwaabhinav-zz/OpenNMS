/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.reporting;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * An offset period used as a base to determine a real
 *  date when running the report
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class DateParm implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name of this parameter as passed to the report
     *  engine
     */
    private java.lang.String _name;

    /**
     * the name of this parameter as displayed in the
     *  webui
     */
    private java.lang.String _displayName;

    /**
     * flag to use absolute date if possible
     */
    private boolean _useAbsoluteDate;

    /**
     * keeps track of state for field: _useAbsoluteDate
     */
    private boolean _has_useAbsoluteDate;

    /**
     * Field _defaultInterval.
     */
    private java.lang.String _defaultInterval;

    /**
     * Field _defaultCount.
     */
    private int _defaultCount;

    /**
     * keeps track of state for field: _defaultCount
     */
    private boolean _has_defaultCount;

    /**
     * Field _defaultTime.
     */
    private org.opennms.netmgt.config.reporting.DefaultTime _defaultTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public DateParm() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDefaultCount(
    ) {
        this._has_defaultCount= false;
    }

    /**
     */
    public void deleteUseAbsoluteDate(
    ) {
        this._has_useAbsoluteDate= false;
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
        
        if (obj instanceof DateParm) {
        
            DateParm temp = (DateParm)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._displayName != null) {
                if (temp._displayName == null) return false;
                else if (!(this._displayName.equals(temp._displayName))) 
                    return false;
            }
            else if (temp._displayName != null)
                return false;
            if (this._useAbsoluteDate != temp._useAbsoluteDate)
                return false;
            if (this._has_useAbsoluteDate != temp._has_useAbsoluteDate)
                return false;
            if (this._defaultInterval != null) {
                if (temp._defaultInterval == null) return false;
                else if (!(this._defaultInterval.equals(temp._defaultInterval))) 
                    return false;
            }
            else if (temp._defaultInterval != null)
                return false;
            if (this._defaultCount != temp._defaultCount)
                return false;
            if (this._has_defaultCount != temp._has_defaultCount)
                return false;
            if (this._defaultTime != null) {
                if (temp._defaultTime == null) return false;
                else if (!(this._defaultTime.equals(temp._defaultTime))) 
                    return false;
            }
            else if (temp._defaultTime != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultCount'.
     * 
     * @return the value of field 'DefaultCount'.
     */
    public int getDefaultCount(
    ) {
        return this._defaultCount;
    }

    /**
     * Returns the value of field 'defaultInterval'.
     * 
     * @return the value of field 'DefaultInterval'.
     */
    public java.lang.String getDefaultInterval(
    ) {
        return this._defaultInterval;
    }

    /**
     * Returns the value of field 'defaultTime'.
     * 
     * @return the value of field 'DefaultTime'.
     */
    public org.opennms.netmgt.config.reporting.DefaultTime getDefaultTime(
    ) {
        return this._defaultTime;
    }

    /**
     * Returns the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this parameter as displayed in the
     *  webui
     * 
     * @return the value of field 'DisplayName'.
     */
    public java.lang.String getDisplayName(
    ) {
        return this._displayName;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: the name of this parameter as passed
     * to the report
     *  engine
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'useAbsoluteDate'. The field
     * 'useAbsoluteDate' has the following description: flag to use
     * absolute date if possible
     * 
     * @return the value of field 'UseAbsoluteDate'.
     */
    public boolean getUseAbsoluteDate(
    ) {
        return this._useAbsoluteDate;
    }

    /**
     * Method hasDefaultCount.
     * 
     * @return true if at least one DefaultCount has been added
     */
    public boolean hasDefaultCount(
    ) {
        return this._has_defaultCount;
    }

    /**
     * Method hasUseAbsoluteDate.
     * 
     * @return true if at least one UseAbsoluteDate has been added
     */
    public boolean hasUseAbsoluteDate(
    ) {
        return this._has_useAbsoluteDate;
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
        if (_displayName != null) {
           result = 37 * result + _displayName.hashCode();
        }
        result = 37 * result + (_useAbsoluteDate?0:1);
        if (_defaultInterval != null) {
           result = 37 * result + _defaultInterval.hashCode();
        }
        result = 37 * result + _defaultCount;
        if (_defaultTime != null) {
           result = 37 * result + _defaultTime.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'useAbsoluteDate'. The field
     * 'useAbsoluteDate' has the following description: flag to use
     * absolute date if possible
     * 
     * @return the value of field 'UseAbsoluteDate'.
     */
    public boolean isUseAbsoluteDate(
    ) {
        return this._useAbsoluteDate;
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
     * Sets the value of field 'defaultCount'.
     * 
     * @param defaultCount the value of field 'defaultCount'.
     */
    public void setDefaultCount(
            final int defaultCount) {
        this._defaultCount = defaultCount;
        this._has_defaultCount = true;
    }

    /**
     * Sets the value of field 'defaultInterval'.
     * 
     * @param defaultInterval the value of field 'defaultInterval'.
     */
    public void setDefaultInterval(
            final java.lang.String defaultInterval) {
        this._defaultInterval = defaultInterval;
    }

    /**
     * Sets the value of field 'defaultTime'.
     * 
     * @param defaultTime the value of field 'defaultTime'.
     */
    public void setDefaultTime(
            final org.opennms.netmgt.config.reporting.DefaultTime defaultTime) {
        this._defaultTime = defaultTime;
    }

    /**
     * Sets the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this parameter as displayed in the
     *  webui
     * 
     * @param displayName the value of field 'displayName'.
     */
    public void setDisplayName(
            final java.lang.String displayName) {
        this._displayName = displayName;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: the name of this parameter as passed
     * to the report
     *  engine
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'useAbsoluteDate'. The field
     * 'useAbsoluteDate' has the following description: flag to use
     * absolute date if possible
     * 
     * @param useAbsoluteDate the value of field 'useAbsoluteDate'.
     */
    public void setUseAbsoluteDate(
            final boolean useAbsoluteDate) {
        this._useAbsoluteDate = useAbsoluteDate;
        this._has_useAbsoluteDate = true;
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
     * org.opennms.netmgt.config.reporting.DateParm
     */
    public static org.opennms.netmgt.config.reporting.DateParm unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reporting.DateParm) Unmarshaller.unmarshal(org.opennms.netmgt.config.reporting.DateParm.class, reader);
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

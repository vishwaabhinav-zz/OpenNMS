/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.actiond;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the actiond-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ActiondConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The maximum number of simultaneous processes launched
     *  by actiond. If the number of launched processes currently
     * runnning
     *  reaches this number, actiond waits for a process to
     * complete or get
     *  terminated before it launches the next process.
     */
    private int _maxOutstandingActions;

    /**
     * keeps track of state for field: _maxOutstandingActions
     */
    private boolean _has_maxOutstandingActions;

    /**
     * The maximum time that a launched process can take to
     *  complete. If execution time exceeds this time, the launched
     * process
     *  is terminated.
     */
    private long _maxProcessTime;

    /**
     * keeps track of state for field: _maxProcessTime
     */
    private boolean _has_maxProcessTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActiondConfiguration() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMaxOutstandingActions(
    ) {
        this._has_maxOutstandingActions= false;
    }

    /**
     */
    public void deleteMaxProcessTime(
    ) {
        this._has_maxProcessTime= false;
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
        
        if (obj instanceof ActiondConfiguration) {
        
            ActiondConfiguration temp = (ActiondConfiguration)obj;
            if (this._maxOutstandingActions != temp._maxOutstandingActions)
                return false;
            if (this._has_maxOutstandingActions != temp._has_maxOutstandingActions)
                return false;
            if (this._maxProcessTime != temp._maxProcessTime)
                return false;
            if (this._has_maxProcessTime != temp._has_maxProcessTime)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'maxOutstandingActions'. The
     * field 'maxOutstandingActions' has the following description:
     * The maximum number of simultaneous processes launched
     *  by actiond. If the number of launched processes currently
     * runnning
     *  reaches this number, actiond waits for a process to
     * complete or get
     *  terminated before it launches the next process.
     * 
     * @return the value of field 'MaxOutstandingActions'.
     */
    public int getMaxOutstandingActions(
    ) {
        return this._maxOutstandingActions;
    }

    /**
     * Returns the value of field 'maxProcessTime'. The field
     * 'maxProcessTime' has the following description: The maximum
     * time that a launched process can take to
     *  complete. If execution time exceeds this time, the launched
     * process
     *  is terminated.
     * 
     * @return the value of field 'MaxProcessTime'.
     */
    public long getMaxProcessTime(
    ) {
        return this._maxProcessTime;
    }

    /**
     * Method hasMaxOutstandingActions.
     * 
     * @return true if at least one MaxOutstandingActions has been
     * added
     */
    public boolean hasMaxOutstandingActions(
    ) {
        return this._has_maxOutstandingActions;
    }

    /**
     * Method hasMaxProcessTime.
     * 
     * @return true if at least one MaxProcessTime has been added
     */
    public boolean hasMaxProcessTime(
    ) {
        return this._has_maxProcessTime;
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
        result = 37 * result + _maxOutstandingActions;
        result = 37 * result + (int)(_maxProcessTime^(_maxProcessTime>>>32));
        
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
     * Sets the value of field 'maxOutstandingActions'. The field
     * 'maxOutstandingActions' has the following description: The
     * maximum number of simultaneous processes launched
     *  by actiond. If the number of launched processes currently
     * runnning
     *  reaches this number, actiond waits for a process to
     * complete or get
     *  terminated before it launches the next process.
     * 
     * @param maxOutstandingActions the value of field
     * 'maxOutstandingActions'.
     */
    public void setMaxOutstandingActions(
            final int maxOutstandingActions) {
        this._maxOutstandingActions = maxOutstandingActions;
        this._has_maxOutstandingActions = true;
    }

    /**
     * Sets the value of field 'maxProcessTime'. The field
     * 'maxProcessTime' has the following description: The maximum
     * time that a launched process can take to
     *  complete. If execution time exceeds this time, the launched
     * process
     *  is terminated.
     * 
     * @param maxProcessTime the value of field 'maxProcessTime'.
     */
    public void setMaxProcessTime(
            final long maxProcessTime) {
        this._maxProcessTime = maxProcessTime;
        this._has_maxProcessTime = true;
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
     * org.opennms.netmgt.config.actiond.ActiondConfiguration
     */
    public static org.opennms.netmgt.config.actiond.ActiondConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.actiond.ActiondConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.actiond.ActiondConfiguration.class, reader);
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

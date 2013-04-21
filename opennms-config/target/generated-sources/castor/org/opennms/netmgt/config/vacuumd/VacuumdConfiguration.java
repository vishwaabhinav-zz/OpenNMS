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
 * Top-level element for the vacuumd-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class VacuumdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * how often to vacuum the database in
     *  seconds
     */
    private int _period;

    /**
     * keeps track of state for field: _period
     */
    private boolean _has_period;

    /**
     * This represents the SQL that is performed every
     *  <period> seconds
     */
    private java.util.List<org.opennms.netmgt.config.vacuumd.Statement> _statementList;

    /**
     * Field _automations.
     */
    private org.opennms.netmgt.config.vacuumd.Automations _automations;

    /**
     * A collection of triggers
     */
    private org.opennms.netmgt.config.vacuumd.Triggers _triggers;

    /**
     * A collection of actions
     */
    private org.opennms.netmgt.config.vacuumd.Actions _actions;

    /**
     * Field _autoEvents.
     */
    private org.opennms.netmgt.config.vacuumd.AutoEvents _autoEvents;

    /**
     * Field _actionEvents.
     */
    private org.opennms.netmgt.config.vacuumd.ActionEvents _actionEvents;


      //----------------/
     //- Constructors -/
    //----------------/

    public VacuumdConfiguration() {
        super();
        this._statementList = new java.util.ArrayList<org.opennms.netmgt.config.vacuumd.Statement>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vStatement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStatement(
            final org.opennms.netmgt.config.vacuumd.Statement vStatement)
    throws java.lang.IndexOutOfBoundsException {
        this._statementList.add(vStatement);
    }

    /**
     * 
     * 
     * @param index
     * @param vStatement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStatement(
            final int index,
            final org.opennms.netmgt.config.vacuumd.Statement vStatement)
    throws java.lang.IndexOutOfBoundsException {
        this._statementList.add(index, vStatement);
    }

    /**
     */
    public void deletePeriod(
    ) {
        this._has_period= false;
    }

    /**
     * Method enumerateStatement.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.vacuumd.Statement> enumerateStatement(
    ) {
        return java.util.Collections.enumeration(this._statementList);
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
        
        if (obj instanceof VacuumdConfiguration) {
        
            VacuumdConfiguration temp = (VacuumdConfiguration)obj;
            if (this._period != temp._period)
                return false;
            if (this._has_period != temp._has_period)
                return false;
            if (this._statementList != null) {
                if (temp._statementList == null) return false;
                else if (!(this._statementList.equals(temp._statementList))) 
                    return false;
            }
            else if (temp._statementList != null)
                return false;
            if (this._automations != null) {
                if (temp._automations == null) return false;
                else if (!(this._automations.equals(temp._automations))) 
                    return false;
            }
            else if (temp._automations != null)
                return false;
            if (this._triggers != null) {
                if (temp._triggers == null) return false;
                else if (!(this._triggers.equals(temp._triggers))) 
                    return false;
            }
            else if (temp._triggers != null)
                return false;
            if (this._actions != null) {
                if (temp._actions == null) return false;
                else if (!(this._actions.equals(temp._actions))) 
                    return false;
            }
            else if (temp._actions != null)
                return false;
            if (this._autoEvents != null) {
                if (temp._autoEvents == null) return false;
                else if (!(this._autoEvents.equals(temp._autoEvents))) 
                    return false;
            }
            else if (temp._autoEvents != null)
                return false;
            if (this._actionEvents != null) {
                if (temp._actionEvents == null) return false;
                else if (!(this._actionEvents.equals(temp._actionEvents))) 
                    return false;
            }
            else if (temp._actionEvents != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'actionEvents'.
     * 
     * @return the value of field 'ActionEvents'.
     */
    public org.opennms.netmgt.config.vacuumd.ActionEvents getActionEvents(
    ) {
        return this._actionEvents;
    }

    /**
     * Returns the value of field 'actions'. The field 'actions'
     * has the following description: A collection of actions
     * 
     * @return the value of field 'Actions'.
     */
    public org.opennms.netmgt.config.vacuumd.Actions getActions(
    ) {
        return this._actions;
    }

    /**
     * Returns the value of field 'autoEvents'.
     * 
     * @return the value of field 'AutoEvents'.
     */
    public org.opennms.netmgt.config.vacuumd.AutoEvents getAutoEvents(
    ) {
        return this._autoEvents;
    }

    /**
     * Returns the value of field 'automations'.
     * 
     * @return the value of field 'Automations'.
     */
    public org.opennms.netmgt.config.vacuumd.Automations getAutomations(
    ) {
        return this._automations;
    }

    /**
     * Returns the value of field 'period'. The field 'period' has
     * the following description: how often to vacuum the database
     * in
     *  seconds
     * 
     * @return the value of field 'Period'.
     */
    public int getPeriod(
    ) {
        return this._period;
    }

    /**
     * Method getStatement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.vacuumd.Statement at the given inde
     */
    public org.opennms.netmgt.config.vacuumd.Statement getStatement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._statementList.size()) {
            throw new IndexOutOfBoundsException("getStatement: Index value '" + index + "' not in range [0.." + (this._statementList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.vacuumd.Statement) _statementList.get(index);
    }

    /**
     * Method getStatement.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.vacuumd.Statement[] getStatement(
    ) {
        org.opennms.netmgt.config.vacuumd.Statement[] array = new org.opennms.netmgt.config.vacuumd.Statement[0];
        return (org.opennms.netmgt.config.vacuumd.Statement[]) this._statementList.toArray(array);
    }

    /**
     * Method getStatementCollection.Returns a reference to
     * '_statementList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.vacuumd.Statement> getStatementCollection(
    ) {
        return this._statementList;
    }

    /**
     * Method getStatementCount.
     * 
     * @return the size of this collection
     */
    public int getStatementCount(
    ) {
        return this._statementList.size();
    }

    /**
     * Returns the value of field 'triggers'. The field 'triggers'
     * has the following description: A collection of triggers
     * 
     * @return the value of field 'Triggers'.
     */
    public org.opennms.netmgt.config.vacuumd.Triggers getTriggers(
    ) {
        return this._triggers;
    }

    /**
     * Method hasPeriod.
     * 
     * @return true if at least one Period has been added
     */
    public boolean hasPeriod(
    ) {
        return this._has_period;
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
        result = 37 * result + _period;
        if (_statementList != null) {
           result = 37 * result + _statementList.hashCode();
        }
        if (_automations != null) {
           result = 37 * result + _automations.hashCode();
        }
        if (_triggers != null) {
           result = 37 * result + _triggers.hashCode();
        }
        if (_actions != null) {
           result = 37 * result + _actions.hashCode();
        }
        if (_autoEvents != null) {
           result = 37 * result + _autoEvents.hashCode();
        }
        if (_actionEvents != null) {
           result = 37 * result + _actionEvents.hashCode();
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
     * Method iterateStatement.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.vacuumd.Statement> iterateStatement(
    ) {
        return this._statementList.iterator();
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
     */
    public void removeAllStatement(
    ) {
        this._statementList.clear();
    }

    /**
     * Method removeStatement.
     * 
     * @param vStatement
     * @return true if the object was removed from the collection.
     */
    public boolean removeStatement(
            final org.opennms.netmgt.config.vacuumd.Statement vStatement) {
        boolean removed = _statementList.remove(vStatement);
        return removed;
    }

    /**
     * Method removeStatementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.vacuumd.Statement removeStatementAt(
            final int index) {
        java.lang.Object obj = this._statementList.remove(index);
        return (org.opennms.netmgt.config.vacuumd.Statement) obj;
    }

    /**
     * Sets the value of field 'actionEvents'.
     * 
     * @param actionEvents the value of field 'actionEvents'.
     */
    public void setActionEvents(
            final org.opennms.netmgt.config.vacuumd.ActionEvents actionEvents) {
        this._actionEvents = actionEvents;
    }

    /**
     * Sets the value of field 'actions'. The field 'actions' has
     * the following description: A collection of actions
     * 
     * @param actions the value of field 'actions'.
     */
    public void setActions(
            final org.opennms.netmgt.config.vacuumd.Actions actions) {
        this._actions = actions;
    }

    /**
     * Sets the value of field 'autoEvents'.
     * 
     * @param autoEvents the value of field 'autoEvents'.
     */
    public void setAutoEvents(
            final org.opennms.netmgt.config.vacuumd.AutoEvents autoEvents) {
        this._autoEvents = autoEvents;
    }

    /**
     * Sets the value of field 'automations'.
     * 
     * @param automations the value of field 'automations'.
     */
    public void setAutomations(
            final org.opennms.netmgt.config.vacuumd.Automations automations) {
        this._automations = automations;
    }

    /**
     * Sets the value of field 'period'. The field 'period' has the
     * following description: how often to vacuum the database in
     *  seconds
     * 
     * @param period the value of field 'period'.
     */
    public void setPeriod(
            final int period) {
        this._period = period;
        this._has_period = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vStatement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStatement(
            final int index,
            final org.opennms.netmgt.config.vacuumd.Statement vStatement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._statementList.size()) {
            throw new IndexOutOfBoundsException("setStatement: Index value '" + index + "' not in range [0.." + (this._statementList.size() - 1) + "]");
        }
        
        this._statementList.set(index, vStatement);
    }

    /**
     * 
     * 
     * @param vStatementArray
     */
    public void setStatement(
            final org.opennms.netmgt.config.vacuumd.Statement[] vStatementArray) {
        //-- copy array
        _statementList.clear();
        
        for (int i = 0; i < vStatementArray.length; i++) {
                this._statementList.add(vStatementArray[i]);
        }
    }

    /**
     * Sets the value of '_statementList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vStatementList the Vector to copy.
     */
    public void setStatement(
            final java.util.List<org.opennms.netmgt.config.vacuumd.Statement> vStatementList) {
        // copy vector
        this._statementList.clear();
        
        this._statementList.addAll(vStatementList);
    }

    /**
     * Sets the value of '_statementList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param statementList the Vector to set.
     */
    public void setStatementCollection(
            final java.util.List<org.opennms.netmgt.config.vacuumd.Statement> statementList) {
        this._statementList = statementList;
    }

    /**
     * Sets the value of field 'triggers'. The field 'triggers' has
     * the following description: A collection of triggers
     * 
     * @param triggers the value of field 'triggers'.
     */
    public void setTriggers(
            final org.opennms.netmgt.config.vacuumd.Triggers triggers) {
        this._triggers = triggers;
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
     * org.opennms.netmgt.config.vacuumd.VacuumdConfiguration
     */
    public static org.opennms.netmgt.config.vacuumd.VacuumdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vacuumd.VacuumdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.vacuumd.VacuumdConfiguration.class, reader);
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

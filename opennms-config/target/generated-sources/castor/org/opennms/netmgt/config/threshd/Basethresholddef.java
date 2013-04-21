/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.threshd;

/**
 * Class Basethresholddef.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public abstract class Basethresholddef implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * An optional description for the threshold, to help identify
     * what is their purpose.
     *  
     */
    private java.lang.String _description;

    /**
     * Threshold type. "high" to trigger if the value exceeds the
     * threshold,
     *  "low" to trigger if the value drops below the threshold,
     *  "relativeChange" to trigger if the value changes more than
     * the proportion represented by the threshold, or
     *  "absoluteChange" to trigger if the value changes by more
     * than the threshold value
     *  
     */
    private java.lang.String _type;

    /**
     * RRD datasource type. "node" indicates a node level
     * datasource.
     *  "if" indicates an interface level datasource.
     *  
     */
    private java.lang.String _dsType;

    /**
     * Threshold value. If the datasource value rises above this
     *  value, in the case of a "high" threshold, or drops below
     * this
     *  value, in the case of a "low" threshold the threshold is
     *  considered to have been exceeded and the exceeded count
     * will
     *  be incremented. Any time that the datasource value drops
     * below
     *  this value, in the case of a "high" threshold, or rises
     * above
     *  this value, in the case of a "low" threshold the exceeded
     *  count is reset back to zero. Whenever the exceeded count
     *  reaches the trigger value then a threshold event is
     * generated.
     *  
     */
    private double _value;

    /**
     * keeps track of state for field: _value
     */
    private boolean _has_value;

    /**
     * Rearm value. Identifies the value that the datasource must
     *  fall below, in the case of a "high" threshold or rise
     * above,
     *  in the case of a "low" threshold, before the threshold will
     *  rearm, and once again be eligible to generate an event.
     *  
     */
    private double _rearm;

    /**
     * keeps track of state for field: _rearm
     */
    private boolean _has_rearm;

    /**
     * Trigger value. Identifies the number of consecutive polls
     * that
     *  the datasource value must exceed the defined threshold
     * value
     *  before a threshold event is generated.
     *  
     */
    private int _trigger;

    /**
     * keeps track of state for field: _trigger
     */
    private boolean _has_trigger;

    /**
     * Value to retrieve from strings.properties to label this
     *  datasource.
     *  
     */
    private java.lang.String _dsLabel;

    /**
     * The UEI to send when this threshold is triggered. If not
     *  specified, defaults to standard threshold UEIs
     *  
     */
    private java.lang.String _triggeredUEI;

    /**
     * The UEI to send when this threshold is re-armed. If not
     *  specified, defaults to standard threshold UEIs
     *  
     */
    private java.lang.String _rearmedUEI;

    /**
     * The operator to be used when applying filters. The
     *  default is "or". If you want to match all filters,
     *  you should specify "and";
     *  
     */
    private java.lang.String _filterOperator = "or";

    /**
     * The filter used to select the ds by a string
     */
    private java.util.List<org.opennms.netmgt.config.threshd.ResourceFilter> _resourceFilterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Basethresholddef() {
        super();
        setFilterOperator("or");
        this._resourceFilterList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.ResourceFilter>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResourceFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceFilter(
            final org.opennms.netmgt.config.threshd.ResourceFilter vResourceFilter)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceFilterList.add(vResourceFilter);
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResourceFilter(
            final int index,
            final org.opennms.netmgt.config.threshd.ResourceFilter vResourceFilter)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceFilterList.add(index, vResourceFilter);
    }

    /**
     */
    public void deleteRearm(
    ) {
        this._has_rearm= false;
    }

    /**
     */
    public void deleteTrigger(
    ) {
        this._has_trigger= false;
    }

    /**
     */
    public void deleteValue(
    ) {
        this._has_value= false;
    }

    /**
     * Method enumerateResourceFilter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.ResourceFilter> enumerateResourceFilter(
    ) {
        return java.util.Collections.enumeration(this._resourceFilterList);
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
        
        if (obj instanceof Basethresholddef) {
        
            Basethresholddef temp = (Basethresholddef)obj;
            if (this._description != null) {
                if (temp._description == null) return false;
                else if (!(this._description.equals(temp._description))) 
                    return false;
            }
            else if (temp._description != null)
                return false;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type))) 
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._dsType != null) {
                if (temp._dsType == null) return false;
                else if (!(this._dsType.equals(temp._dsType))) 
                    return false;
            }
            else if (temp._dsType != null)
                return false;
            if (this._value != temp._value)
                return false;
            if (this._has_value != temp._has_value)
                return false;
            if (this._rearm != temp._rearm)
                return false;
            if (this._has_rearm != temp._has_rearm)
                return false;
            if (this._trigger != temp._trigger)
                return false;
            if (this._has_trigger != temp._has_trigger)
                return false;
            if (this._dsLabel != null) {
                if (temp._dsLabel == null) return false;
                else if (!(this._dsLabel.equals(temp._dsLabel))) 
                    return false;
            }
            else if (temp._dsLabel != null)
                return false;
            if (this._triggeredUEI != null) {
                if (temp._triggeredUEI == null) return false;
                else if (!(this._triggeredUEI.equals(temp._triggeredUEI))) 
                    return false;
            }
            else if (temp._triggeredUEI != null)
                return false;
            if (this._rearmedUEI != null) {
                if (temp._rearmedUEI == null) return false;
                else if (!(this._rearmedUEI.equals(temp._rearmedUEI))) 
                    return false;
            }
            else if (temp._rearmedUEI != null)
                return false;
            if (this._filterOperator != null) {
                if (temp._filterOperator == null) return false;
                else if (!(this._filterOperator.equals(temp._filterOperator))) 
                    return false;
            }
            else if (temp._filterOperator != null)
                return false;
            if (this._resourceFilterList != null) {
                if (temp._resourceFilterList == null) return false;
                else if (!(this._resourceFilterList.equals(temp._resourceFilterList))) 
                    return false;
            }
            else if (temp._resourceFilterList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: An optional
     * description for the threshold, to help identify what is
     * their purpose.
     *  
     * 
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'dsLabel'. The field 'dsLabel'
     * has the following description: Value to retrieve from
     * strings.properties to label this
     *  datasource.
     *  
     * 
     * @return the value of field 'DsLabel'.
     */
    public java.lang.String getDsLabel(
    ) {
        return this._dsLabel;
    }

    /**
     * Returns the value of field 'dsType'. The field 'dsType' has
     * the following description: RRD datasource type. "node"
     * indicates a node level datasource.
     *  "if" indicates an interface level datasource.
     *  
     * 
     * @return the value of field 'DsType'.
     */
    public java.lang.String getDsType(
    ) {
        return this._dsType;
    }

    /**
     * Returns the value of field 'filterOperator'. The field
     * 'filterOperator' has the following description: The operator
     * to be used when applying filters. The
     *  default is "or". If you want to match all filters,
     *  you should specify "and";
     *  
     * 
     * @return the value of field 'FilterOperator'.
     */
    public java.lang.String getFilterOperator(
    ) {
        return this._filterOperator;
    }

    /**
     * Returns the value of field 'rearm'. The field 'rearm' has
     * the following description: Rearm value. Identifies the value
     * that the datasource must
     *  fall below, in the case of a "high" threshold or rise
     * above,
     *  in the case of a "low" threshold, before the threshold will
     *  rearm, and once again be eligible to generate an event.
     *  
     * 
     * @return the value of field 'Rearm'.
     */
    public double getRearm(
    ) {
        return this._rearm;
    }

    /**
     * Returns the value of field 'rearmedUEI'. The field
     * 'rearmedUEI' has the following description: The UEI to send
     * when this threshold is re-armed. If not
     *  specified, defaults to standard threshold UEIs
     *  
     * 
     * @return the value of field 'RearmedUEI'.
     */
    public java.lang.String getRearmedUEI(
    ) {
        return this._rearmedUEI;
    }

    /**
     * Method getResourceFilter.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.ResourceFilter at the
     * given index
     */
    public org.opennms.netmgt.config.threshd.ResourceFilter getResourceFilter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceFilterList.size()) {
            throw new IndexOutOfBoundsException("getResourceFilter: Index value '" + index + "' not in range [0.." + (this._resourceFilterList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.threshd.ResourceFilter) _resourceFilterList.get(index);
    }

    /**
     * Method getResourceFilter.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.threshd.ResourceFilter[] getResourceFilter(
    ) {
        org.opennms.netmgt.config.threshd.ResourceFilter[] array = new org.opennms.netmgt.config.threshd.ResourceFilter[0];
        return (org.opennms.netmgt.config.threshd.ResourceFilter[]) this._resourceFilterList.toArray(array);
    }

    /**
     * Method getResourceFilterCollection.Returns a reference to
     * '_resourceFilterList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.ResourceFilter> getResourceFilterCollection(
    ) {
        return this._resourceFilterList;
    }

    /**
     * Method getResourceFilterCount.
     * 
     * @return the size of this collection
     */
    public int getResourceFilterCount(
    ) {
        return this._resourceFilterList.size();
    }

    /**
     * Returns the value of field 'trigger'. The field 'trigger'
     * has the following description: Trigger value. Identifies the
     * number of consecutive polls that
     *  the datasource value must exceed the defined threshold
     * value
     *  before a threshold event is generated.
     *  
     * 
     * @return the value of field 'Trigger'.
     */
    public int getTrigger(
    ) {
        return this._trigger;
    }

    /**
     * Returns the value of field 'triggeredUEI'. The field
     * 'triggeredUEI' has the following description: The UEI to
     * send when this threshold is triggered. If not
     *  specified, defaults to standard threshold UEIs
     *  
     * 
     * @return the value of field 'TriggeredUEI'.
     */
    public java.lang.String getTriggeredUEI(
    ) {
        return this._triggeredUEI;
    }

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Threshold type. "high" to trigger if
     * the value exceeds the threshold,
     *  "low" to trigger if the value drops below the threshold,
     *  "relativeChange" to trigger if the value changes more than
     * the proportion represented by the threshold, or
     *  "absoluteChange" to trigger if the value changes by more
     * than the threshold value
     *  
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Returns the value of field 'value'. The field 'value' has
     * the following description: Threshold value. If the
     * datasource value rises above this
     *  value, in the case of a "high" threshold, or drops below
     * this
     *  value, in the case of a "low" threshold the threshold is
     *  considered to have been exceeded and the exceeded count
     * will
     *  be incremented. Any time that the datasource value drops
     * below
     *  this value, in the case of a "high" threshold, or rises
     * above
     *  this value, in the case of a "low" threshold the exceeded
     *  count is reset back to zero. Whenever the exceeded count
     *  reaches the trigger value then a threshold event is
     * generated.
     *  
     * 
     * @return the value of field 'Value'.
     */
    public double getValue(
    ) {
        return this._value;
    }

    /**
     * Method hasRearm.
     * 
     * @return true if at least one Rearm has been added
     */
    public boolean hasRearm(
    ) {
        return this._has_rearm;
    }

    /**
     * Method hasTrigger.
     * 
     * @return true if at least one Trigger has been added
     */
    public boolean hasTrigger(
    ) {
        return this._has_trigger;
    }

    /**
     * Method hasValue.
     * 
     * @return true if at least one Value has been added
     */
    public boolean hasValue(
    ) {
        return this._has_value;
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
        if (_description != null) {
           result = 37 * result + _description.hashCode();
        }
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_dsType != null) {
           result = 37 * result + _dsType.hashCode();
        }
        tmp = java.lang.Double.doubleToLongBits(_value);
        result = 37 * result + (int)(tmp^(tmp>>>32));
        tmp = java.lang.Double.doubleToLongBits(_rearm);
        result = 37 * result + (int)(tmp^(tmp>>>32));
        result = 37 * result + _trigger;
        if (_dsLabel != null) {
           result = 37 * result + _dsLabel.hashCode();
        }
        if (_triggeredUEI != null) {
           result = 37 * result + _triggeredUEI.hashCode();
        }
        if (_rearmedUEI != null) {
           result = 37 * result + _rearmedUEI.hashCode();
        }
        if (_filterOperator != null) {
           result = 37 * result + _filterOperator.hashCode();
        }
        if (_resourceFilterList != null) {
           result = 37 * result + _resourceFilterList.hashCode();
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
     * Method iterateResourceFilter.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.threshd.ResourceFilter> iterateResourceFilter(
    ) {
        return this._resourceFilterList.iterator();
    }

    /**
     */
    public void removeAllResourceFilter(
    ) {
        this._resourceFilterList.clear();
    }

    /**
     * Method removeResourceFilter.
     * 
     * @param vResourceFilter
     * @return true if the object was removed from the collection.
     */
    public boolean removeResourceFilter(
            final org.opennms.netmgt.config.threshd.ResourceFilter vResourceFilter) {
        boolean removed = _resourceFilterList.remove(vResourceFilter);
        return removed;
    }

    /**
     * Method removeResourceFilterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.ResourceFilter removeResourceFilterAt(
            final int index) {
        java.lang.Object obj = this._resourceFilterList.remove(index);
        return (org.opennms.netmgt.config.threshd.ResourceFilter) obj;
    }

    /**
     * Sets the value of field 'description'. The field
     * 'description' has the following description: An optional
     * description for the threshold, to help identify what is
     * their purpose.
     *  
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'dsLabel'. The field 'dsLabel' has
     * the following description: Value to retrieve from
     * strings.properties to label this
     *  datasource.
     *  
     * 
     * @param dsLabel the value of field 'dsLabel'.
     */
    public void setDsLabel(
            final java.lang.String dsLabel) {
        this._dsLabel = dsLabel;
    }

    /**
     * Sets the value of field 'dsType'. The field 'dsType' has the
     * following description: RRD datasource type. "node" indicates
     * a node level datasource.
     *  "if" indicates an interface level datasource.
     *  
     * 
     * @param dsType the value of field 'dsType'.
     */
    public void setDsType(
            final java.lang.String dsType) {
        this._dsType = dsType;
    }

    /**
     * Sets the value of field 'filterOperator'. The field
     * 'filterOperator' has the following description: The operator
     * to be used when applying filters. The
     *  default is "or". If you want to match all filters,
     *  you should specify "and";
     *  
     * 
     * @param filterOperator the value of field 'filterOperator'.
     */
    public void setFilterOperator(
            final java.lang.String filterOperator) {
        this._filterOperator = filterOperator;
    }

    /**
     * Sets the value of field 'rearm'. The field 'rearm' has the
     * following description: Rearm value. Identifies the value
     * that the datasource must
     *  fall below, in the case of a "high" threshold or rise
     * above,
     *  in the case of a "low" threshold, before the threshold will
     *  rearm, and once again be eligible to generate an event.
     *  
     * 
     * @param rearm the value of field 'rearm'.
     */
    public void setRearm(
            final double rearm) {
        this._rearm = rearm;
        this._has_rearm = true;
    }

    /**
     * Sets the value of field 'rearmedUEI'. The field 'rearmedUEI'
     * has the following description: The UEI to send when this
     * threshold is re-armed. If not
     *  specified, defaults to standard threshold UEIs
     *  
     * 
     * @param rearmedUEI the value of field 'rearmedUEI'.
     */
    public void setRearmedUEI(
            final java.lang.String rearmedUEI) {
        this._rearmedUEI = rearmedUEI;
    }

    /**
     * 
     * 
     * @param index
     * @param vResourceFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResourceFilter(
            final int index,
            final org.opennms.netmgt.config.threshd.ResourceFilter vResourceFilter)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceFilterList.size()) {
            throw new IndexOutOfBoundsException("setResourceFilter: Index value '" + index + "' not in range [0.." + (this._resourceFilterList.size() - 1) + "]");
        }
        
        this._resourceFilterList.set(index, vResourceFilter);
    }

    /**
     * 
     * 
     * @param vResourceFilterArray
     */
    public void setResourceFilter(
            final org.opennms.netmgt.config.threshd.ResourceFilter[] vResourceFilterArray) {
        //-- copy array
        _resourceFilterList.clear();
        
        for (int i = 0; i < vResourceFilterArray.length; i++) {
                this._resourceFilterList.add(vResourceFilterArray[i]);
        }
    }

    /**
     * Sets the value of '_resourceFilterList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vResourceFilterList the Vector to copy.
     */
    public void setResourceFilter(
            final java.util.List<org.opennms.netmgt.config.threshd.ResourceFilter> vResourceFilterList) {
        // copy vector
        this._resourceFilterList.clear();
        
        this._resourceFilterList.addAll(vResourceFilterList);
    }

    /**
     * Sets the value of '_resourceFilterList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param resourceFilterList the Vector to set.
     */
    public void setResourceFilterCollection(
            final java.util.List<org.opennms.netmgt.config.threshd.ResourceFilter> resourceFilterList) {
        this._resourceFilterList = resourceFilterList;
    }

    /**
     * Sets the value of field 'trigger'. The field 'trigger' has
     * the following description: Trigger value. Identifies the
     * number of consecutive polls that
     *  the datasource value must exceed the defined threshold
     * value
     *  before a threshold event is generated.
     *  
     * 
     * @param trigger the value of field 'trigger'.
     */
    public void setTrigger(
            final int trigger) {
        this._trigger = trigger;
        this._has_trigger = true;
    }

    /**
     * Sets the value of field 'triggeredUEI'. The field
     * 'triggeredUEI' has the following description: The UEI to
     * send when this threshold is triggered. If not
     *  specified, defaults to standard threshold UEIs
     *  
     * 
     * @param triggeredUEI the value of field 'triggeredUEI'.
     */
    public void setTriggeredUEI(
            final java.lang.String triggeredUEI) {
        this._triggeredUEI = triggeredUEI;
    }

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Threshold type. "high" to trigger if
     * the value exceeds the threshold,
     *  "low" to trigger if the value drops below the threshold,
     *  "relativeChange" to trigger if the value changes more than
     * the proportion represented by the threshold, or
     *  "absoluteChange" to trigger if the value changes by more
     * than the threshold value
     *  
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * Sets the value of field 'value'. The field 'value' has the
     * following description: Threshold value. If the datasource
     * value rises above this
     *  value, in the case of a "high" threshold, or drops below
     * this
     *  value, in the case of a "low" threshold the threshold is
     *  considered to have been exceeded and the exceeded count
     * will
     *  be incremented. Any time that the datasource value drops
     * below
     *  this value, in the case of a "high" threshold, or rises
     * above
     *  this value, in the case of a "low" threshold the exceeded
     *  count is reset back to zero. Whenever the exceeded count
     *  reaches the trigger value then a threshold event is
     * generated.
     *  
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(
            final double value) {
        this._value = value;
        this._has_value = true;
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

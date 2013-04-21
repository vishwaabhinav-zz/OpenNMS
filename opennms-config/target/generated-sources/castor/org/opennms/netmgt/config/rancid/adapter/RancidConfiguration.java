/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rancid.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the rancid-configuration.xml configuration
 * file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class RancidConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The time in sec to wait before trying
     *  to set the download flag to up in router.db.
     *  If schedule is there then it is verified if you are able
     *  to write to router.db in rancid.
     *  Otherwise you wait until schedule let you write on rancid.
     *  
     */
    private long _delay;

    /**
     * keeps track of state for field: _delay
     */
    private boolean _has_delay;

    /**
     * The maximum number of retry before
     *  sending a failure.
     */
    private int _retries;

    /**
     * keeps track of state for field: _retries
     */
    private boolean _has_retries;

    /**
     * If you want to use opennms categories
     *  to match rancid device type.
     */
    private boolean _useCategories = false;

    /**
     * keeps track of state for field: _useCategories
     */
    private boolean _has_useCategories;

    /**
     * The Default Rancid type, it is used when no device type
     *  for provisioned node is found.
     *  
     */
    private java.lang.String _defaultType = "cisco";

    /**
     * Configuration of Policy
     *  functionality
     */
    private org.opennms.netmgt.config.rancid.adapter.Policies _policies;

    /**
     * A map from sysoids masks and rancid device type.
     */
    private java.util.List<org.opennms.netmgt.config.rancid.adapter.Mapping> _mappingList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RancidConfiguration() {
        super();
        setDefaultType("cisco");
        this._mappingList = new java.util.ArrayList<org.opennms.netmgt.config.rancid.adapter.Mapping>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMapping(
            final org.opennms.netmgt.config.rancid.adapter.Mapping vMapping)
    throws java.lang.IndexOutOfBoundsException {
        this._mappingList.add(vMapping);
    }

    /**
     * 
     * 
     * @param index
     * @param vMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMapping(
            final int index,
            final org.opennms.netmgt.config.rancid.adapter.Mapping vMapping)
    throws java.lang.IndexOutOfBoundsException {
        this._mappingList.add(index, vMapping);
    }

    /**
     */
    public void deleteDelay(
    ) {
        this._has_delay= false;
    }

    /**
     */
    public void deleteRetries(
    ) {
        this._has_retries= false;
    }

    /**
     */
    public void deleteUseCategories(
    ) {
        this._has_useCategories= false;
    }

    /**
     * Method enumerateMapping.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.rancid.adapter.Mapping> enumerateMapping(
    ) {
        return java.util.Collections.enumeration(this._mappingList);
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
        
        if (obj instanceof RancidConfiguration) {
        
            RancidConfiguration temp = (RancidConfiguration)obj;
            if (this._delay != temp._delay)
                return false;
            if (this._has_delay != temp._has_delay)
                return false;
            if (this._retries != temp._retries)
                return false;
            if (this._has_retries != temp._has_retries)
                return false;
            if (this._useCategories != temp._useCategories)
                return false;
            if (this._has_useCategories != temp._has_useCategories)
                return false;
            if (this._defaultType != null) {
                if (temp._defaultType == null) return false;
                else if (!(this._defaultType.equals(temp._defaultType))) 
                    return false;
            }
            else if (temp._defaultType != null)
                return false;
            if (this._policies != null) {
                if (temp._policies == null) return false;
                else if (!(this._policies.equals(temp._policies))) 
                    return false;
            }
            else if (temp._policies != null)
                return false;
            if (this._mappingList != null) {
                if (temp._mappingList == null) return false;
                else if (!(this._mappingList.equals(temp._mappingList))) 
                    return false;
            }
            else if (temp._mappingList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultType'. The field
     * 'defaultType' has the following description: The Default
     * Rancid type, it is used when no device type
     *  for provisioned node is found.
     *  
     * 
     * @return the value of field 'DefaultType'.
     */
    public java.lang.String getDefaultType(
    ) {
        return this._defaultType;
    }

    /**
     * Returns the value of field 'delay'. The field 'delay' has
     * the following description: The time in sec to wait before
     * trying
     *  to set the download flag to up in router.db.
     *  If schedule is there then it is verified if you are able
     *  to write to router.db in rancid.
     *  Otherwise you wait until schedule let you write on rancid.
     *  
     * 
     * @return the value of field 'Delay'.
     */
    public long getDelay(
    ) {
        return this._delay;
    }

    /**
     * Method getMapping.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.rancid.adapter.Mapping at the
     * given index
     */
    public org.opennms.netmgt.config.rancid.adapter.Mapping getMapping(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mappingList.size()) {
            throw new IndexOutOfBoundsException("getMapping: Index value '" + index + "' not in range [0.." + (this._mappingList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.rancid.adapter.Mapping) _mappingList.get(index);
    }

    /**
     * Method getMapping.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.rancid.adapter.Mapping[] getMapping(
    ) {
        org.opennms.netmgt.config.rancid.adapter.Mapping[] array = new org.opennms.netmgt.config.rancid.adapter.Mapping[0];
        return (org.opennms.netmgt.config.rancid.adapter.Mapping[]) this._mappingList.toArray(array);
    }

    /**
     * Method getMappingCollection.Returns a reference to
     * '_mappingList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.rancid.adapter.Mapping> getMappingCollection(
    ) {
        return this._mappingList;
    }

    /**
     * Method getMappingCount.
     * 
     * @return the size of this collection
     */
    public int getMappingCount(
    ) {
        return this._mappingList.size();
    }

    /**
     * Returns the value of field 'policies'. The field 'policies'
     * has the following description: Configuration of Policy
     *  functionality
     * 
     * @return the value of field 'Policies'.
     */
    public org.opennms.netmgt.config.rancid.adapter.Policies getPolicies(
    ) {
        return this._policies;
    }

    /**
     * Returns the value of field 'retries'. The field 'retries'
     * has the following description: The maximum number of retry
     * before
     *  sending a failure.
     * 
     * @return the value of field 'Retries'.
     */
    public int getRetries(
    ) {
        return this._retries;
    }

    /**
     * Returns the value of field 'useCategories'. The field
     * 'useCategories' has the following description: If you want
     * to use opennms categories
     *  to match rancid device type.
     * 
     * @return the value of field 'UseCategories'.
     */
    public boolean getUseCategories(
    ) {
        return this._useCategories;
    }

    /**
     * Method hasDelay.
     * 
     * @return true if at least one Delay has been added
     */
    public boolean hasDelay(
    ) {
        return this._has_delay;
    }

    /**
     * Method hasRetries.
     * 
     * @return true if at least one Retries has been added
     */
    public boolean hasRetries(
    ) {
        return this._has_retries;
    }

    /**
     * Method hasUseCategories.
     * 
     * @return true if at least one UseCategories has been added
     */
    public boolean hasUseCategories(
    ) {
        return this._has_useCategories;
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
        result = 37 * result + (int)(_delay^(_delay>>>32));
        result = 37 * result + _retries;
        result = 37 * result + (_useCategories?0:1);
        if (_defaultType != null) {
           result = 37 * result + _defaultType.hashCode();
        }
        if (_policies != null) {
           result = 37 * result + _policies.hashCode();
        }
        if (_mappingList != null) {
           result = 37 * result + _mappingList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'useCategories'. The field
     * 'useCategories' has the following description: If you want
     * to use opennms categories
     *  to match rancid device type.
     * 
     * @return the value of field 'UseCategories'.
     */
    public boolean isUseCategories(
    ) {
        return this._useCategories;
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
     * Method iterateMapping.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.rancid.adapter.Mapping> iterateMapping(
    ) {
        return this._mappingList.iterator();
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
    public void removeAllMapping(
    ) {
        this._mappingList.clear();
    }

    /**
     * Method removeMapping.
     * 
     * @param vMapping
     * @return true if the object was removed from the collection.
     */
    public boolean removeMapping(
            final org.opennms.netmgt.config.rancid.adapter.Mapping vMapping) {
        boolean removed = _mappingList.remove(vMapping);
        return removed;
    }

    /**
     * Method removeMappingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.rancid.adapter.Mapping removeMappingAt(
            final int index) {
        java.lang.Object obj = this._mappingList.remove(index);
        return (org.opennms.netmgt.config.rancid.adapter.Mapping) obj;
    }

    /**
     * Sets the value of field 'defaultType'. The field
     * 'defaultType' has the following description: The Default
     * Rancid type, it is used when no device type
     *  for provisioned node is found.
     *  
     * 
     * @param defaultType the value of field 'defaultType'.
     */
    public void setDefaultType(
            final java.lang.String defaultType) {
        this._defaultType = defaultType;
    }

    /**
     * Sets the value of field 'delay'. The field 'delay' has the
     * following description: The time in sec to wait before trying
     *  to set the download flag to up in router.db.
     *  If schedule is there then it is verified if you are able
     *  to write to router.db in rancid.
     *  Otherwise you wait until schedule let you write on rancid.
     *  
     * 
     * @param delay the value of field 'delay'.
     */
    public void setDelay(
            final long delay) {
        this._delay = delay;
        this._has_delay = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMapping(
            final int index,
            final org.opennms.netmgt.config.rancid.adapter.Mapping vMapping)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mappingList.size()) {
            throw new IndexOutOfBoundsException("setMapping: Index value '" + index + "' not in range [0.." + (this._mappingList.size() - 1) + "]");
        }
        
        this._mappingList.set(index, vMapping);
    }

    /**
     * 
     * 
     * @param vMappingArray
     */
    public void setMapping(
            final org.opennms.netmgt.config.rancid.adapter.Mapping[] vMappingArray) {
        //-- copy array
        _mappingList.clear();
        
        for (int i = 0; i < vMappingArray.length; i++) {
                this._mappingList.add(vMappingArray[i]);
        }
    }

    /**
     * Sets the value of '_mappingList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vMappingList the Vector to copy.
     */
    public void setMapping(
            final java.util.List<org.opennms.netmgt.config.rancid.adapter.Mapping> vMappingList) {
        // copy vector
        this._mappingList.clear();
        
        this._mappingList.addAll(vMappingList);
    }

    /**
     * Sets the value of '_mappingList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param mappingList the Vector to set.
     */
    public void setMappingCollection(
            final java.util.List<org.opennms.netmgt.config.rancid.adapter.Mapping> mappingList) {
        this._mappingList = mappingList;
    }

    /**
     * Sets the value of field 'policies'. The field 'policies' has
     * the following description: Configuration of Policy
     *  functionality
     * 
     * @param policies the value of field 'policies'.
     */
    public void setPolicies(
            final org.opennms.netmgt.config.rancid.adapter.Policies policies) {
        this._policies = policies;
    }

    /**
     * Sets the value of field 'retries'. The field 'retries' has
     * the following description: The maximum number of retry
     * before
     *  sending a failure.
     * 
     * @param retries the value of field 'retries'.
     */
    public void setRetries(
            final int retries) {
        this._retries = retries;
        this._has_retries = true;
    }

    /**
     * Sets the value of field 'useCategories'. The field
     * 'useCategories' has the following description: If you want
     * to use opennms categories
     *  to match rancid device type.
     * 
     * @param useCategories the value of field 'useCategories'.
     */
    public void setUseCategories(
            final boolean useCategories) {
        this._useCategories = useCategories;
        this._has_useCategories = true;
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
     * org.opennms.netmgt.config.rancid.adapter.RancidConfiguration
     */
    public static org.opennms.netmgt.config.rancid.adapter.RancidConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rancid.adapter.RancidConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.rancid.adapter.RancidConfiguration.class, reader);
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

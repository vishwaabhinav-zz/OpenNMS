/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.importer.config;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A network interface.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Interface implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ipAddr.
     */
    private java.lang.String _ipAddr;

    /**
     * This will be used to set a description field. Currently a
     * calculation of (ifDescr | ifName | ifAlias)
     */
    private java.lang.Object _descr;

    /**
     * Set this optional value to 3 to indicate "testing". Any
     * other value is ignored.
     */
    private int _status = 1;

    /**
     * keeps track of state for field: _status
     */
    private boolean _has_status;

    /**
     * Field _managed.
     */
    private boolean _managed = true;

    /**
     * keeps track of state for field: _managed
     */
    private boolean _has_managed;

    /**
     * This attribute is used by OpenNMS to control SNMP data
     * collection. P - Primary interface. This is the "preferred
     * interface used in data collection.
     *  S - Secondary interface. This interface meets all the
     * qualifications to be a primary interface. N - Not a
     * collectable interface.
     *  This is a manual setting controlled by the user.
     * 
     *  If the snmpStorageFlag is set to "all", then all interfaces
     * not set to 'N' will be collected. If the snmpStorageFlag is
     * set to "select", then all
     *  interfaces with 'P|S' will be collected. If the
     * snmpStorageFlag is set to "primary", then only the
     * interfaces set to 'P' will be collected.
     *  
     */
    private org.opennms.netmgt.importer.config.types.InterfaceSnmpPrimaryType _snmpPrimary;

    /**
     * This element is defined outside of the interface element for
     * future use where it is expected that services on other
     * network entities will be able to be
     *  defined (i.e. networks, nodes and applications)
     *  
     */
    private java.util.List<org.opennms.netmgt.importer.config.MonitoredService> _monitoredServiceList;

    /**
     * This element is used to specify OpenNMS specific categories.
     * Note: currently, these categories are defined in a separate
     * configuration file and
     *  are related directly to monitored services. I have
     * separated out this element so that it can be referenced by
     * other entities (nodes, interfaces, etc.)
     *  however, they will be ignored until the domain model is
     * changed and the service layer is adapted for this behavior. 
     *  
     */
    private java.util.List<org.opennms.netmgt.importer.config.Category> _categoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Interface() {
        super();
        this._monitoredServiceList = new java.util.ArrayList<org.opennms.netmgt.importer.config.MonitoredService>();
        this._categoryList = new java.util.ArrayList<org.opennms.netmgt.importer.config.Category>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategory(
            final org.opennms.netmgt.importer.config.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryList.add(vCategory);
    }

    /**
     * 
     * 
     * @param index
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategory(
            final int index,
            final org.opennms.netmgt.importer.config.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryList.add(index, vCategory);
    }

    /**
     * 
     * 
     * @param vMonitoredService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMonitoredService(
            final org.opennms.netmgt.importer.config.MonitoredService vMonitoredService)
    throws java.lang.IndexOutOfBoundsException {
        this._monitoredServiceList.add(vMonitoredService);
    }

    /**
     * 
     * 
     * @param index
     * @param vMonitoredService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMonitoredService(
            final int index,
            final org.opennms.netmgt.importer.config.MonitoredService vMonitoredService)
    throws java.lang.IndexOutOfBoundsException {
        this._monitoredServiceList.add(index, vMonitoredService);
    }

    /**
     */
    public void deleteManaged(
    ) {
        this._has_managed= false;
    }

    /**
     */
    public void deleteStatus(
    ) {
        this._has_status= false;
    }

    /**
     * Method enumerateCategory.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.importer.config.Category> enumerateCategory(
    ) {
        return java.util.Collections.enumeration(this._categoryList);
    }

    /**
     * Method enumerateMonitoredService.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.importer.config.MonitoredService> enumerateMonitoredService(
    ) {
        return java.util.Collections.enumeration(this._monitoredServiceList);
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
            if (this._ipAddr != null) {
                if (temp._ipAddr == null) return false;
                else if (!(this._ipAddr.equals(temp._ipAddr))) 
                    return false;
            }
            else if (temp._ipAddr != null)
                return false;
            if (this._descr != null) {
                if (temp._descr == null) return false;
                else if (!(this._descr.equals(temp._descr))) 
                    return false;
            }
            else if (temp._descr != null)
                return false;
            if (this._status != temp._status)
                return false;
            if (this._has_status != temp._has_status)
                return false;
            if (this._managed != temp._managed)
                return false;
            if (this._has_managed != temp._has_managed)
                return false;
            if (this._snmpPrimary != null) {
                if (temp._snmpPrimary == null) return false;
                else if (!(this._snmpPrimary.equals(temp._snmpPrimary))) 
                    return false;
            }
            else if (temp._snmpPrimary != null)
                return false;
            if (this._monitoredServiceList != null) {
                if (temp._monitoredServiceList == null) return false;
                else if (!(this._monitoredServiceList.equals(temp._monitoredServiceList))) 
                    return false;
            }
            else if (temp._monitoredServiceList != null)
                return false;
            if (this._categoryList != null) {
                if (temp._categoryList == null) return false;
                else if (!(this._categoryList.equals(temp._categoryList))) 
                    return false;
            }
            else if (temp._categoryList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getCategory.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.importer.config.Category at the given inde
     */
    public org.opennms.netmgt.importer.config.Category getCategory(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryList.size()) {
            throw new IndexOutOfBoundsException("getCategory: Index value '" + index + "' not in range [0.." + (this._categoryList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.importer.config.Category) _categoryList.get(index);
    }

    /**
     * Method getCategory.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.importer.config.Category[] getCategory(
    ) {
        org.opennms.netmgt.importer.config.Category[] array = new org.opennms.netmgt.importer.config.Category[0];
        return (org.opennms.netmgt.importer.config.Category[]) this._categoryList.toArray(array);
    }

    /**
     * Method getCategoryCollection.Returns a reference to
     * '_categoryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.importer.config.Category> getCategoryCollection(
    ) {
        return this._categoryList;
    }

    /**
     * Method getCategoryCount.
     * 
     * @return the size of this collection
     */
    public int getCategoryCount(
    ) {
        return this._categoryList.size();
    }

    /**
     * Returns the value of field 'descr'. The field 'descr' has
     * the following description: This will be used to set a
     * description field. Currently a calculation of (ifDescr |
     * ifName | ifAlias)
     * 
     * @return the value of field 'Descr'.
     */
    public java.lang.Object getDescr(
    ) {
        return this._descr;
    }

    /**
     * Returns the value of field 'ipAddr'.
     * 
     * @return the value of field 'IpAddr'.
     */
    public java.lang.String getIpAddr(
    ) {
        return this._ipAddr;
    }

    /**
     * Returns the value of field 'managed'.
     * 
     * @return the value of field 'Managed'.
     */
    public boolean getManaged(
    ) {
        return this._managed;
    }

    /**
     * Method getMonitoredService.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.importer.config.MonitoredService at the
     * given index
     */
    public org.opennms.netmgt.importer.config.MonitoredService getMonitoredService(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._monitoredServiceList.size()) {
            throw new IndexOutOfBoundsException("getMonitoredService: Index value '" + index + "' not in range [0.." + (this._monitoredServiceList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.importer.config.MonitoredService) _monitoredServiceList.get(index);
    }

    /**
     * Method getMonitoredService.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.importer.config.MonitoredService[] getMonitoredService(
    ) {
        org.opennms.netmgt.importer.config.MonitoredService[] array = new org.opennms.netmgt.importer.config.MonitoredService[0];
        return (org.opennms.netmgt.importer.config.MonitoredService[]) this._monitoredServiceList.toArray(array);
    }

    /**
     * Method getMonitoredServiceCollection.Returns a reference to
     * '_monitoredServiceList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.importer.config.MonitoredService> getMonitoredServiceCollection(
    ) {
        return this._monitoredServiceList;
    }

    /**
     * Method getMonitoredServiceCount.
     * 
     * @return the size of this collection
     */
    public int getMonitoredServiceCount(
    ) {
        return this._monitoredServiceList.size();
    }

    /**
     * Returns the value of field 'snmpPrimary'. The field
     * 'snmpPrimary' has the following description: This attribute
     * is used by OpenNMS to control SNMP data collection. P -
     * Primary interface. This is the "preferred interface used in
     * data collection.
     *  S - Secondary interface. This interface meets all the
     * qualifications to be a primary interface. N - Not a
     * collectable interface.
     *  This is a manual setting controlled by the user.
     * 
     *  If the snmpStorageFlag is set to "all", then all interfaces
     * not set to 'N' will be collected. If the snmpStorageFlag is
     * set to "select", then all
     *  interfaces with 'P|S' will be collected. If the
     * snmpStorageFlag is set to "primary", then only the
     * interfaces set to 'P' will be collected.
     *  
     * 
     * @return the value of field 'SnmpPrimary'.
     */
    public org.opennms.netmgt.importer.config.types.InterfaceSnmpPrimaryType getSnmpPrimary(
    ) {
        return this._snmpPrimary;
    }

    /**
     * Returns the value of field 'status'. The field 'status' has
     * the following description: Set this optional value to 3 to
     * indicate "testing". Any other value is ignored.
     * 
     * @return the value of field 'Status'.
     */
    public int getStatus(
    ) {
        return this._status;
    }

    /**
     * Method hasManaged.
     * 
     * @return true if at least one Managed has been added
     */
    public boolean hasManaged(
    ) {
        return this._has_managed;
    }

    /**
     * Method hasStatus.
     * 
     * @return true if at least one Status has been added
     */
    public boolean hasStatus(
    ) {
        return this._has_status;
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
        if (_ipAddr != null) {
           result = 37 * result + _ipAddr.hashCode();
        }
        if (_descr != null) {
           result = 37 * result + _descr.hashCode();
        }
        result = 37 * result + _status;
        result = 37 * result + (_managed?0:1);
        if (_snmpPrimary != null) {
           result = 37 * result + _snmpPrimary.hashCode();
        }
        if (_monitoredServiceList != null) {
           result = 37 * result + _monitoredServiceList.hashCode();
        }
        if (_categoryList != null) {
           result = 37 * result + _categoryList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'managed'.
     * 
     * @return the value of field 'Managed'.
     */
    public boolean isManaged(
    ) {
        return this._managed;
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
     * Method iterateCategory.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.importer.config.Category> iterateCategory(
    ) {
        return this._categoryList.iterator();
    }

    /**
     * Method iterateMonitoredService.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.importer.config.MonitoredService> iterateMonitoredService(
    ) {
        return this._monitoredServiceList.iterator();
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
    public void removeAllCategory(
    ) {
        this._categoryList.clear();
    }

    /**
     */
    public void removeAllMonitoredService(
    ) {
        this._monitoredServiceList.clear();
    }

    /**
     * Method removeCategory.
     * 
     * @param vCategory
     * @return true if the object was removed from the collection.
     */
    public boolean removeCategory(
            final org.opennms.netmgt.importer.config.Category vCategory) {
        boolean removed = _categoryList.remove(vCategory);
        return removed;
    }

    /**
     * Method removeCategoryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.importer.config.Category removeCategoryAt(
            final int index) {
        java.lang.Object obj = this._categoryList.remove(index);
        return (org.opennms.netmgt.importer.config.Category) obj;
    }

    /**
     * Method removeMonitoredService.
     * 
     * @param vMonitoredService
     * @return true if the object was removed from the collection.
     */
    public boolean removeMonitoredService(
            final org.opennms.netmgt.importer.config.MonitoredService vMonitoredService) {
        boolean removed = _monitoredServiceList.remove(vMonitoredService);
        return removed;
    }

    /**
     * Method removeMonitoredServiceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.importer.config.MonitoredService removeMonitoredServiceAt(
            final int index) {
        java.lang.Object obj = this._monitoredServiceList.remove(index);
        return (org.opennms.netmgt.importer.config.MonitoredService) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCategory(
            final int index,
            final org.opennms.netmgt.importer.config.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryList.size()) {
            throw new IndexOutOfBoundsException("setCategory: Index value '" + index + "' not in range [0.." + (this._categoryList.size() - 1) + "]");
        }
        
        this._categoryList.set(index, vCategory);
    }

    /**
     * 
     * 
     * @param vCategoryArray
     */
    public void setCategory(
            final org.opennms.netmgt.importer.config.Category[] vCategoryArray) {
        //-- copy array
        _categoryList.clear();
        
        for (int i = 0; i < vCategoryArray.length; i++) {
                this._categoryList.add(vCategoryArray[i]);
        }
    }

    /**
     * Sets the value of '_categoryList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCategoryList the Vector to copy.
     */
    public void setCategory(
            final java.util.List<org.opennms.netmgt.importer.config.Category> vCategoryList) {
        // copy vector
        this._categoryList.clear();
        
        this._categoryList.addAll(vCategoryList);
    }

    /**
     * Sets the value of '_categoryList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param categoryList the Vector to set.
     */
    public void setCategoryCollection(
            final java.util.List<org.opennms.netmgt.importer.config.Category> categoryList) {
        this._categoryList = categoryList;
    }

    /**
     * Sets the value of field 'descr'. The field 'descr' has the
     * following description: This will be used to set a
     * description field. Currently a calculation of (ifDescr |
     * ifName | ifAlias)
     * 
     * @param descr the value of field 'descr'.
     */
    public void setDescr(
            final java.lang.Object descr) {
        this._descr = descr;
    }

    /**
     * Sets the value of field 'ipAddr'.
     * 
     * @param ipAddr the value of field 'ipAddr'.
     */
    public void setIpAddr(
            final java.lang.String ipAddr) {
        this._ipAddr = ipAddr;
    }

    /**
     * Sets the value of field 'managed'.
     * 
     * @param managed the value of field 'managed'.
     */
    public void setManaged(
            final boolean managed) {
        this._managed = managed;
        this._has_managed = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vMonitoredService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMonitoredService(
            final int index,
            final org.opennms.netmgt.importer.config.MonitoredService vMonitoredService)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._monitoredServiceList.size()) {
            throw new IndexOutOfBoundsException("setMonitoredService: Index value '" + index + "' not in range [0.." + (this._monitoredServiceList.size() - 1) + "]");
        }
        
        this._monitoredServiceList.set(index, vMonitoredService);
    }

    /**
     * 
     * 
     * @param vMonitoredServiceArray
     */
    public void setMonitoredService(
            final org.opennms.netmgt.importer.config.MonitoredService[] vMonitoredServiceArray) {
        //-- copy array
        _monitoredServiceList.clear();
        
        for (int i = 0; i < vMonitoredServiceArray.length; i++) {
                this._monitoredServiceList.add(vMonitoredServiceArray[i]);
        }
    }

    /**
     * Sets the value of '_monitoredServiceList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vMonitoredServiceList the Vector to copy.
     */
    public void setMonitoredService(
            final java.util.List<org.opennms.netmgt.importer.config.MonitoredService> vMonitoredServiceList) {
        // copy vector
        this._monitoredServiceList.clear();
        
        this._monitoredServiceList.addAll(vMonitoredServiceList);
    }

    /**
     * Sets the value of '_monitoredServiceList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param monitoredServiceList the Vector to set.
     */
    public void setMonitoredServiceCollection(
            final java.util.List<org.opennms.netmgt.importer.config.MonitoredService> monitoredServiceList) {
        this._monitoredServiceList = monitoredServiceList;
    }

    /**
     * Sets the value of field 'snmpPrimary'. The field
     * 'snmpPrimary' has the following description: This attribute
     * is used by OpenNMS to control SNMP data collection. P -
     * Primary interface. This is the "preferred interface used in
     * data collection.
     *  S - Secondary interface. This interface meets all the
     * qualifications to be a primary interface. N - Not a
     * collectable interface.
     *  This is a manual setting controlled by the user.
     * 
     *  If the snmpStorageFlag is set to "all", then all interfaces
     * not set to 'N' will be collected. If the snmpStorageFlag is
     * set to "select", then all
     *  interfaces with 'P|S' will be collected. If the
     * snmpStorageFlag is set to "primary", then only the
     * interfaces set to 'P' will be collected.
     *  
     * 
     * @param snmpPrimary the value of field 'snmpPrimary'.
     */
    public void setSnmpPrimary(
            final org.opennms.netmgt.importer.config.types.InterfaceSnmpPrimaryType snmpPrimary) {
        this._snmpPrimary = snmpPrimary;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: Set this optional value to 3 to
     * indicate "testing". Any other value is ignored.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final int status) {
        this._status = status;
        this._has_status = true;
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
     * org.opennms.netmgt.importer.config.Interface
     */
    public static org.opennms.netmgt.importer.config.Interface unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.importer.config.Interface) Unmarshaller.unmarshal(org.opennms.netmgt.importer.config.Interface.class, reader);
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

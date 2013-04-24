/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.linkd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Package encapsulating addresses to performs the Discovery
 *  of Links among them.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Package implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Name or identifier for this package.
     *  
     */
    private java.lang.String _name;

    /**
     * OverWrite link-configuration corresponding attribute 
     *  
     */
    private long _snmp_poll_interval;

    /**
     * keeps track of state for field: _snmp_poll_interval
     */
    private boolean _has_snmp_poll_interval;

    /**
     * OverWrite link-configuration corresponding attribute 
     *  
     */
    private long _discovery_link_interval;

    /**
     * keeps track of state for field: _discovery_link_interval
     */
    private boolean _has_discovery_link_interval;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _autoDiscovery;

    /**
     * keeps track of state for field: _autoDiscovery
     */
    private boolean _has_autoDiscovery;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _enableDiscoveryDownload;

    /**
     * keeps track of state for field: _enableDiscoveryDownload
     */
    private boolean _has_enableDiscoveryDownload;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _enableVlanDiscovery;

    /**
     * keeps track of state for field: _enableVlanDiscovery
     */
    private boolean _has_enableVlanDiscovery;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _useCdpDiscovery;

    /**
     * keeps track of state for field: _useCdpDiscovery
     */
    private boolean _has_useCdpDiscovery;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _useIpRouteDiscovery;

    /**
     * keeps track of state for field: _useIpRouteDiscovery
     */
    private boolean _has_useIpRouteDiscovery;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _useBridgeDiscovery;

    /**
     * keeps track of state for field: _useBridgeDiscovery
     */
    private boolean _has_useBridgeDiscovery;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _saveRouteTable;

    /**
     * keeps track of state for field: _saveRouteTable
     */
    private boolean _has_saveRouteTable;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _saveStpNodeTable;

    /**
     * keeps track of state for field: _saveStpNodeTable
     */
    private boolean _has_saveStpNodeTable;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _saveStpInterfaceTable;

    /**
     * keeps track of state for field: _saveStpInterfaceTable
     */
    private boolean _has_saveStpInterfaceTable;

    /**
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     */
    private boolean _forceIpRouteDiscoveryOnEthernet = false;

    /**
     * keeps track of state for field:
     * _forceIpRouteDiscoveryOnEthernet
     */
    private boolean _has_forceIpRouteDiscoveryOnEthernet;

    /**
     * A rule which adresses belonging to this
     *  package must pass. This package is applied
     *  only to addresses that pass this filter.
     *  
     */
    private org.opennms.netmgt.config.linkd.Filter _filter;

    /**
     * Adresses in this package
     *  
     */
    private java.util.List<java.lang.String> _specificList;

    /**
     * Range of adresses in this package.
     *  
     */
    private java.util.List<org.opennms.netmgt.config.linkd.IncludeRange> _includeRangeList;

    /**
     * Range of adresses to be excluded from this
     *  package.
     *  
     */
    private java.util.List<org.opennms.netmgt.config.linkd.ExcludeRange> _excludeRangeList;

    /**
     * A file URL holding specific addresses to be
     *  polled. Each line in the URL file can be one
     *  of: <IP><space>#<comments>
     *  or <IP> or #<comments>. Lines
     *  starting with a '#' are ignored and so are
     *  characters after a '<space>#' in a
     *  line.
     *  
     */
    private java.util.List<java.lang.String> _includeUrlList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Package() {
        super();
        this._specificList = new java.util.ArrayList<java.lang.String>();
        this._includeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.linkd.IncludeRange>();
        this._excludeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.linkd.ExcludeRange>();
        this._includeUrlList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExcludeRange(
            final org.opennms.netmgt.config.linkd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._excludeRangeList.add(vExcludeRange);
    }

    /**
     * 
     * 
     * @param index
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExcludeRange(
            final int index,
            final org.opennms.netmgt.config.linkd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._excludeRangeList.add(index, vExcludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRange(
            final org.opennms.netmgt.config.linkd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRangeList.add(vIncludeRange);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRange(
            final int index,
            final org.opennms.netmgt.config.linkd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRangeList.add(index, vIncludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeUrl(
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        this._includeUrlList.add(vIncludeUrl);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeUrl(
            final int index,
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        this._includeUrlList.add(index, vIncludeUrl);
    }

    /**
     * 
     * 
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSpecific(
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        this._specificList.add(vSpecific);
    }

    /**
     * 
     * 
     * @param index
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSpecific(
            final int index,
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        this._specificList.add(index, vSpecific);
    }

    /**
     */
    public void deleteAutoDiscovery(
    ) {
        this._has_autoDiscovery= false;
    }

    /**
     */
    public void deleteDiscovery_link_interval(
    ) {
        this._has_discovery_link_interval= false;
    }

    /**
     */
    public void deleteEnableDiscoveryDownload(
    ) {
        this._has_enableDiscoveryDownload= false;
    }

    /**
     */
    public void deleteEnableVlanDiscovery(
    ) {
        this._has_enableVlanDiscovery= false;
    }

    /**
     */
    public void deleteForceIpRouteDiscoveryOnEthernet(
    ) {
        this._has_forceIpRouteDiscoveryOnEthernet= false;
    }

    /**
     */
    public void deleteSaveRouteTable(
    ) {
        this._has_saveRouteTable= false;
    }

    /**
     */
    public void deleteSaveStpInterfaceTable(
    ) {
        this._has_saveStpInterfaceTable= false;
    }

    /**
     */
    public void deleteSaveStpNodeTable(
    ) {
        this._has_saveStpNodeTable= false;
    }

    /**
     */
    public void deleteSnmp_poll_interval(
    ) {
        this._has_snmp_poll_interval= false;
    }

    /**
     */
    public void deleteUseBridgeDiscovery(
    ) {
        this._has_useBridgeDiscovery= false;
    }

    /**
     */
    public void deleteUseCdpDiscovery(
    ) {
        this._has_useCdpDiscovery= false;
    }

    /**
     */
    public void deleteUseIpRouteDiscovery(
    ) {
        this._has_useIpRouteDiscovery= false;
    }

    /**
     * Method enumerateExcludeRange.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.linkd.ExcludeRange> enumerateExcludeRange(
    ) {
        return java.util.Collections.enumeration(this._excludeRangeList);
    }

    /**
     * Method enumerateIncludeRange.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.linkd.IncludeRange> enumerateIncludeRange(
    ) {
        return java.util.Collections.enumeration(this._includeRangeList);
    }

    /**
     * Method enumerateIncludeUrl.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateIncludeUrl(
    ) {
        return java.util.Collections.enumeration(this._includeUrlList);
    }

    /**
     * Method enumerateSpecific.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateSpecific(
    ) {
        return java.util.Collections.enumeration(this._specificList);
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
        
        if (obj instanceof Package) {
        
            Package temp = (Package)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._snmp_poll_interval != temp._snmp_poll_interval)
                return false;
            if (this._has_snmp_poll_interval != temp._has_snmp_poll_interval)
                return false;
            if (this._discovery_link_interval != temp._discovery_link_interval)
                return false;
            if (this._has_discovery_link_interval != temp._has_discovery_link_interval)
                return false;
            if (this._autoDiscovery != temp._autoDiscovery)
                return false;
            if (this._has_autoDiscovery != temp._has_autoDiscovery)
                return false;
            if (this._enableDiscoveryDownload != temp._enableDiscoveryDownload)
                return false;
            if (this._has_enableDiscoveryDownload != temp._has_enableDiscoveryDownload)
                return false;
            if (this._enableVlanDiscovery != temp._enableVlanDiscovery)
                return false;
            if (this._has_enableVlanDiscovery != temp._has_enableVlanDiscovery)
                return false;
            if (this._useCdpDiscovery != temp._useCdpDiscovery)
                return false;
            if (this._has_useCdpDiscovery != temp._has_useCdpDiscovery)
                return false;
            if (this._useIpRouteDiscovery != temp._useIpRouteDiscovery)
                return false;
            if (this._has_useIpRouteDiscovery != temp._has_useIpRouteDiscovery)
                return false;
            if (this._useBridgeDiscovery != temp._useBridgeDiscovery)
                return false;
            if (this._has_useBridgeDiscovery != temp._has_useBridgeDiscovery)
                return false;
            if (this._saveRouteTable != temp._saveRouteTable)
                return false;
            if (this._has_saveRouteTable != temp._has_saveRouteTable)
                return false;
            if (this._saveStpNodeTable != temp._saveStpNodeTable)
                return false;
            if (this._has_saveStpNodeTable != temp._has_saveStpNodeTable)
                return false;
            if (this._saveStpInterfaceTable != temp._saveStpInterfaceTable)
                return false;
            if (this._has_saveStpInterfaceTable != temp._has_saveStpInterfaceTable)
                return false;
            if (this._forceIpRouteDiscoveryOnEthernet != temp._forceIpRouteDiscoveryOnEthernet)
                return false;
            if (this._has_forceIpRouteDiscoveryOnEthernet != temp._has_forceIpRouteDiscoveryOnEthernet)
                return false;
            if (this._filter != null) {
                if (temp._filter == null) return false;
                else if (!(this._filter.equals(temp._filter))) 
                    return false;
            }
            else if (temp._filter != null)
                return false;
            if (this._specificList != null) {
                if (temp._specificList == null) return false;
                else if (!(this._specificList.equals(temp._specificList))) 
                    return false;
            }
            else if (temp._specificList != null)
                return false;
            if (this._includeRangeList != null) {
                if (temp._includeRangeList == null) return false;
                else if (!(this._includeRangeList.equals(temp._includeRangeList))) 
                    return false;
            }
            else if (temp._includeRangeList != null)
                return false;
            if (this._excludeRangeList != null) {
                if (temp._excludeRangeList == null) return false;
                else if (!(this._excludeRangeList.equals(temp._excludeRangeList))) 
                    return false;
            }
            else if (temp._excludeRangeList != null)
                return false;
            if (this._includeUrlList != null) {
                if (temp._includeUrlList == null) return false;
                else if (!(this._includeUrlList.equals(temp._includeUrlList))) 
                    return false;
            }
            else if (temp._includeUrlList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'autoDiscovery'. The field
     * 'autoDiscovery' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'AutoDiscovery'.
     */
    public boolean getAutoDiscovery(
    ) {
        return this._autoDiscovery;
    }

    /**
     * Returns the value of field 'discovery_link_interval'. The
     * field 'discovery_link_interval' has the following
     * description: OverWrite link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'Discovery_link_interval'.
     */
    public long getDiscovery_link_interval(
    ) {
        return this._discovery_link_interval;
    }

    /**
     * Returns the value of field 'enableDiscoveryDownload'. The
     * field 'enableDiscoveryDownload' has the following
     * description: OverWrite default value of link-configuration
     * corresponding attribute 
     *  
     * 
     * @return the value of field 'EnableDiscoveryDownload'.
     */
    public boolean getEnableDiscoveryDownload(
    ) {
        return this._enableDiscoveryDownload;
    }

    /**
     * Returns the value of field 'enableVlanDiscovery'. The field
     * 'enableVlanDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'EnableVlanDiscovery'.
     */
    public boolean getEnableVlanDiscovery(
    ) {
        return this._enableVlanDiscovery;
    }

    /**
     * Method getExcludeRange.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.linkd.ExcludeRange at the given
     * index
     */
    public org.opennms.netmgt.config.linkd.ExcludeRange getExcludeRange(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("getExcludeRange: Index value '" + index + "' not in range [0.." + (this._excludeRangeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.linkd.ExcludeRange) _excludeRangeList.get(index);
    }

    /**
     * Method getExcludeRange.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.linkd.ExcludeRange[] getExcludeRange(
    ) {
        org.opennms.netmgt.config.linkd.ExcludeRange[] array = new org.opennms.netmgt.config.linkd.ExcludeRange[0];
        return (org.opennms.netmgt.config.linkd.ExcludeRange[]) this._excludeRangeList.toArray(array);
    }

    /**
     * Method getExcludeRangeCollection.Returns a reference to
     * '_excludeRangeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.linkd.ExcludeRange> getExcludeRangeCollection(
    ) {
        return this._excludeRangeList;
    }

    /**
     * Method getExcludeRangeCount.
     * 
     * @return the size of this collection
     */
    public int getExcludeRangeCount(
    ) {
        return this._excludeRangeList.size();
    }

    /**
     * Returns the value of field 'filter'. The field 'filter' has
     * the following description: A rule which adresses belonging
     * to this
     *  package must pass. This package is applied
     *  only to addresses that pass this filter.
     *  
     * 
     * @return the value of field 'Filter'.
     */
    public org.opennms.netmgt.config.linkd.Filter getFilter(
    ) {
        return this._filter;
    }

    /**
     * Returns the value of field
     * 'forceIpRouteDiscoveryOnEthernet'. The field
     * 'forceIpRouteDiscoveryOnEthernet' has the following
     * description: OverWrite default value of link-configuration
     * corresponding attribute 
     *  
     * 
     * @return the value of field 'ForceIpRouteDiscoveryOnEthernet'.
     */
    public boolean getForceIpRouteDiscoveryOnEthernet(
    ) {
        return this._forceIpRouteDiscoveryOnEthernet;
    }

    /**
     * Method getIncludeRange.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.linkd.IncludeRange at the given
     * index
     */
    public org.opennms.netmgt.config.linkd.IncludeRange getIncludeRange(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRangeList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRange: Index value '" + index + "' not in range [0.." + (this._includeRangeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.linkd.IncludeRange) _includeRangeList.get(index);
    }

    /**
     * Method getIncludeRange.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.linkd.IncludeRange[] getIncludeRange(
    ) {
        org.opennms.netmgt.config.linkd.IncludeRange[] array = new org.opennms.netmgt.config.linkd.IncludeRange[0];
        return (org.opennms.netmgt.config.linkd.IncludeRange[]) this._includeRangeList.toArray(array);
    }

    /**
     * Method getIncludeRangeCollection.Returns a reference to
     * '_includeRangeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.linkd.IncludeRange> getIncludeRangeCollection(
    ) {
        return this._includeRangeList;
    }

    /**
     * Method getIncludeRangeCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeRangeCount(
    ) {
        return this._includeRangeList.size();
    }

    /**
     * Method getIncludeUrl.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getIncludeUrl(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeUrlList.size()) {
            throw new IndexOutOfBoundsException("getIncludeUrl: Index value '" + index + "' not in range [0.." + (this._includeUrlList.size() - 1) + "]");
        }
        
        return (java.lang.String) _includeUrlList.get(index);
    }

    /**
     * Method getIncludeUrl.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getIncludeUrl(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._includeUrlList.toArray(array);
    }

    /**
     * Method getIncludeUrlCollection.Returns a reference to
     * '_includeUrlList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getIncludeUrlCollection(
    ) {
        return this._includeUrlList;
    }

    /**
     * Method getIncludeUrlCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeUrlCount(
    ) {
        return this._includeUrlList.size();
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Name or identifier for this package.
     *  
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'saveRouteTable'. The field
     * 'saveRouteTable' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'SaveRouteTable'.
     */
    public boolean getSaveRouteTable(
    ) {
        return this._saveRouteTable;
    }

    /**
     * Returns the value of field 'saveStpInterfaceTable'. The
     * field 'saveStpInterfaceTable' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'SaveStpInterfaceTable'.
     */
    public boolean getSaveStpInterfaceTable(
    ) {
        return this._saveStpInterfaceTable;
    }

    /**
     * Returns the value of field 'saveStpNodeTable'. The field
     * 'saveStpNodeTable' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'SaveStpNodeTable'.
     */
    public boolean getSaveStpNodeTable(
    ) {
        return this._saveStpNodeTable;
    }

    /**
     * Returns the value of field 'snmp_poll_interval'. The field
     * 'snmp_poll_interval' has the following description:
     * OverWrite link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'Snmp_poll_interval'.
     */
    public long getSnmp_poll_interval(
    ) {
        return this._snmp_poll_interval;
    }

    /**
     * Method getSpecific.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getSpecific(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._specificList.size()) {
            throw new IndexOutOfBoundsException("getSpecific: Index value '" + index + "' not in range [0.." + (this._specificList.size() - 1) + "]");
        }
        
        return (java.lang.String) _specificList.get(index);
    }

    /**
     * Method getSpecific.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getSpecific(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._specificList.toArray(array);
    }

    /**
     * Method getSpecificCollection.Returns a reference to
     * '_specificList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getSpecificCollection(
    ) {
        return this._specificList;
    }

    /**
     * Method getSpecificCount.
     * 
     * @return the size of this collection
     */
    public int getSpecificCount(
    ) {
        return this._specificList.size();
    }

    /**
     * Returns the value of field 'useBridgeDiscovery'. The field
     * 'useBridgeDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'UseBridgeDiscovery'.
     */
    public boolean getUseBridgeDiscovery(
    ) {
        return this._useBridgeDiscovery;
    }

    /**
     * Returns the value of field 'useCdpDiscovery'. The field
     * 'useCdpDiscovery' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'UseCdpDiscovery'.
     */
    public boolean getUseCdpDiscovery(
    ) {
        return this._useCdpDiscovery;
    }

    /**
     * Returns the value of field 'useIpRouteDiscovery'. The field
     * 'useIpRouteDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'UseIpRouteDiscovery'.
     */
    public boolean getUseIpRouteDiscovery(
    ) {
        return this._useIpRouteDiscovery;
    }

    /**
     * Method hasAutoDiscovery.
     * 
     * @return true if at least one AutoDiscovery has been added
     */
    public boolean hasAutoDiscovery(
    ) {
        return this._has_autoDiscovery;
    }

    /**
     * Method hasDiscovery_link_interval.
     * 
     * @return true if at least one Discovery_link_interval has
     * been added
     */
    public boolean hasDiscovery_link_interval(
    ) {
        return this._has_discovery_link_interval;
    }

    /**
     * Method hasEnableDiscoveryDownload.
     * 
     * @return true if at least one EnableDiscoveryDownload has
     * been added
     */
    public boolean hasEnableDiscoveryDownload(
    ) {
        return this._has_enableDiscoveryDownload;
    }

    /**
     * Method hasEnableVlanDiscovery.
     * 
     * @return true if at least one EnableVlanDiscovery has been
     * added
     */
    public boolean hasEnableVlanDiscovery(
    ) {
        return this._has_enableVlanDiscovery;
    }

    /**
     * Method hasForceIpRouteDiscoveryOnEthernet.
     * 
     * @return true if at least one ForceIpRouteDiscoveryOnEthernet
     * has been added
     */
    public boolean hasForceIpRouteDiscoveryOnEthernet(
    ) {
        return this._has_forceIpRouteDiscoveryOnEthernet;
    }

    /**
     * Method hasSaveRouteTable.
     * 
     * @return true if at least one SaveRouteTable has been added
     */
    public boolean hasSaveRouteTable(
    ) {
        return this._has_saveRouteTable;
    }

    /**
     * Method hasSaveStpInterfaceTable.
     * 
     * @return true if at least one SaveStpInterfaceTable has been
     * added
     */
    public boolean hasSaveStpInterfaceTable(
    ) {
        return this._has_saveStpInterfaceTable;
    }

    /**
     * Method hasSaveStpNodeTable.
     * 
     * @return true if at least one SaveStpNodeTable has been added
     */
    public boolean hasSaveStpNodeTable(
    ) {
        return this._has_saveStpNodeTable;
    }

    /**
     * Method hasSnmp_poll_interval.
     * 
     * @return true if at least one Snmp_poll_interval has been adde
     */
    public boolean hasSnmp_poll_interval(
    ) {
        return this._has_snmp_poll_interval;
    }

    /**
     * Method hasUseBridgeDiscovery.
     * 
     * @return true if at least one UseBridgeDiscovery has been adde
     */
    public boolean hasUseBridgeDiscovery(
    ) {
        return this._has_useBridgeDiscovery;
    }

    /**
     * Method hasUseCdpDiscovery.
     * 
     * @return true if at least one UseCdpDiscovery has been added
     */
    public boolean hasUseCdpDiscovery(
    ) {
        return this._has_useCdpDiscovery;
    }

    /**
     * Method hasUseIpRouteDiscovery.
     * 
     * @return true if at least one UseIpRouteDiscovery has been
     * added
     */
    public boolean hasUseIpRouteDiscovery(
    ) {
        return this._has_useIpRouteDiscovery;
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
        result = 37 * result + (int)(_snmp_poll_interval^(_snmp_poll_interval>>>32));
        result = 37 * result + (int)(_discovery_link_interval^(_discovery_link_interval>>>32));
        result = 37 * result + (_autoDiscovery?0:1);
        result = 37 * result + (_enableDiscoveryDownload?0:1);
        result = 37 * result + (_enableVlanDiscovery?0:1);
        result = 37 * result + (_useCdpDiscovery?0:1);
        result = 37 * result + (_useIpRouteDiscovery?0:1);
        result = 37 * result + (_useBridgeDiscovery?0:1);
        result = 37 * result + (_saveRouteTable?0:1);
        result = 37 * result + (_saveStpNodeTable?0:1);
        result = 37 * result + (_saveStpInterfaceTable?0:1);
        result = 37 * result + (_forceIpRouteDiscoveryOnEthernet?0:1);
        if (_filter != null) {
           result = 37 * result + _filter.hashCode();
        }
        if (_specificList != null) {
           result = 37 * result + _specificList.hashCode();
        }
        if (_includeRangeList != null) {
           result = 37 * result + _includeRangeList.hashCode();
        }
        if (_excludeRangeList != null) {
           result = 37 * result + _excludeRangeList.hashCode();
        }
        if (_includeUrlList != null) {
           result = 37 * result + _includeUrlList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'autoDiscovery'. The field
     * 'autoDiscovery' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'AutoDiscovery'.
     */
    public boolean isAutoDiscovery(
    ) {
        return this._autoDiscovery;
    }

    /**
     * Returns the value of field 'enableDiscoveryDownload'. The
     * field 'enableDiscoveryDownload' has the following
     * description: OverWrite default value of link-configuration
     * corresponding attribute 
     *  
     * 
     * @return the value of field 'EnableDiscoveryDownload'.
     */
    public boolean isEnableDiscoveryDownload(
    ) {
        return this._enableDiscoveryDownload;
    }

    /**
     * Returns the value of field 'enableVlanDiscovery'. The field
     * 'enableVlanDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'EnableVlanDiscovery'.
     */
    public boolean isEnableVlanDiscovery(
    ) {
        return this._enableVlanDiscovery;
    }

    /**
     * Returns the value of field
     * 'forceIpRouteDiscoveryOnEthernet'. The field
     * 'forceIpRouteDiscoveryOnEthernet' has the following
     * description: OverWrite default value of link-configuration
     * corresponding attribute 
     *  
     * 
     * @return the value of field 'ForceIpRouteDiscoveryOnEthernet'.
     */
    public boolean isForceIpRouteDiscoveryOnEthernet(
    ) {
        return this._forceIpRouteDiscoveryOnEthernet;
    }

    /**
     * Returns the value of field 'saveRouteTable'. The field
     * 'saveRouteTable' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'SaveRouteTable'.
     */
    public boolean isSaveRouteTable(
    ) {
        return this._saveRouteTable;
    }

    /**
     * Returns the value of field 'saveStpInterfaceTable'. The
     * field 'saveStpInterfaceTable' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'SaveStpInterfaceTable'.
     */
    public boolean isSaveStpInterfaceTable(
    ) {
        return this._saveStpInterfaceTable;
    }

    /**
     * Returns the value of field 'saveStpNodeTable'. The field
     * 'saveStpNodeTable' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'SaveStpNodeTable'.
     */
    public boolean isSaveStpNodeTable(
    ) {
        return this._saveStpNodeTable;
    }

    /**
     * Returns the value of field 'useBridgeDiscovery'. The field
     * 'useBridgeDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'UseBridgeDiscovery'.
     */
    public boolean isUseBridgeDiscovery(
    ) {
        return this._useBridgeDiscovery;
    }

    /**
     * Returns the value of field 'useCdpDiscovery'. The field
     * 'useCdpDiscovery' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @return the value of field 'UseCdpDiscovery'.
     */
    public boolean isUseCdpDiscovery(
    ) {
        return this._useCdpDiscovery;
    }

    /**
     * Returns the value of field 'useIpRouteDiscovery'. The field
     * 'useIpRouteDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @return the value of field 'UseIpRouteDiscovery'.
     */
    public boolean isUseIpRouteDiscovery(
    ) {
        return this._useIpRouteDiscovery;
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
     * Method iterateExcludeRange.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.linkd.ExcludeRange> iterateExcludeRange(
    ) {
        return this._excludeRangeList.iterator();
    }

    /**
     * Method iterateIncludeRange.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.linkd.IncludeRange> iterateIncludeRange(
    ) {
        return this._includeRangeList.iterator();
    }

    /**
     * Method iterateIncludeUrl.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateIncludeUrl(
    ) {
        return this._includeUrlList.iterator();
    }

    /**
     * Method iterateSpecific.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateSpecific(
    ) {
        return this._specificList.iterator();
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
    public void removeAllExcludeRange(
    ) {
        this._excludeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeRange(
    ) {
        this._includeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeUrl(
    ) {
        this._includeUrlList.clear();
    }

    /**
     */
    public void removeAllSpecific(
    ) {
        this._specificList.clear();
    }

    /**
     * Method removeExcludeRange.
     * 
     * @param vExcludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeExcludeRange(
            final org.opennms.netmgt.config.linkd.ExcludeRange vExcludeRange) {
        boolean removed = _excludeRangeList.remove(vExcludeRange);
        return removed;
    }

    /**
     * Method removeExcludeRangeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.linkd.ExcludeRange removeExcludeRangeAt(
            final int index) {
        java.lang.Object obj = this._excludeRangeList.remove(index);
        return (org.opennms.netmgt.config.linkd.ExcludeRange) obj;
    }

    /**
     * Method removeIncludeRange.
     * 
     * @param vIncludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRange(
            final org.opennms.netmgt.config.linkd.IncludeRange vIncludeRange) {
        boolean removed = _includeRangeList.remove(vIncludeRange);
        return removed;
    }

    /**
     * Method removeIncludeRangeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.linkd.IncludeRange removeIncludeRangeAt(
            final int index) {
        java.lang.Object obj = this._includeRangeList.remove(index);
        return (org.opennms.netmgt.config.linkd.IncludeRange) obj;
    }

    /**
     * Method removeIncludeUrl.
     * 
     * @param vIncludeUrl
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeUrl(
            final java.lang.String vIncludeUrl) {
        boolean removed = _includeUrlList.remove(vIncludeUrl);
        return removed;
    }

    /**
     * Method removeIncludeUrlAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeIncludeUrlAt(
            final int index) {
        java.lang.Object obj = this._includeUrlList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeSpecific.
     * 
     * @param vSpecific
     * @return true if the object was removed from the collection.
     */
    public boolean removeSpecific(
            final java.lang.String vSpecific) {
        boolean removed = _specificList.remove(vSpecific);
        return removed;
    }

    /**
     * Method removeSpecificAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeSpecificAt(
            final int index) {
        java.lang.Object obj = this._specificList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'autoDiscovery'. The field
     * 'autoDiscovery' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @param autoDiscovery the value of field 'autoDiscovery'.
     */
    public void setAutoDiscovery(
            final boolean autoDiscovery) {
        this._autoDiscovery = autoDiscovery;
        this._has_autoDiscovery = true;
    }

    /**
     * Sets the value of field 'discovery_link_interval'. The field
     * 'discovery_link_interval' has the following description:
     * OverWrite link-configuration corresponding attribute 
     *  
     * 
     * @param discovery_link_interval the value of field
     * 'discovery_link_interval'.
     */
    public void setDiscovery_link_interval(
            final long discovery_link_interval) {
        this._discovery_link_interval = discovery_link_interval;
        this._has_discovery_link_interval = true;
    }

    /**
     * Sets the value of field 'enableDiscoveryDownload'. The field
     * 'enableDiscoveryDownload' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @param enableDiscoveryDownload the value of field
     * 'enableDiscoveryDownload'.
     */
    public void setEnableDiscoveryDownload(
            final boolean enableDiscoveryDownload) {
        this._enableDiscoveryDownload = enableDiscoveryDownload;
        this._has_enableDiscoveryDownload = true;
    }

    /**
     * Sets the value of field 'enableVlanDiscovery'. The field
     * 'enableVlanDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @param enableVlanDiscovery the value of field
     * 'enableVlanDiscovery'.
     */
    public void setEnableVlanDiscovery(
            final boolean enableVlanDiscovery) {
        this._enableVlanDiscovery = enableVlanDiscovery;
        this._has_enableVlanDiscovery = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExcludeRange(
            final int index,
            final org.opennms.netmgt.config.linkd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("setExcludeRange: Index value '" + index + "' not in range [0.." + (this._excludeRangeList.size() - 1) + "]");
        }
        
        this._excludeRangeList.set(index, vExcludeRange);
    }

    /**
     * 
     * 
     * @param vExcludeRangeArray
     */
    public void setExcludeRange(
            final org.opennms.netmgt.config.linkd.ExcludeRange[] vExcludeRangeArray) {
        //-- copy array
        _excludeRangeList.clear();
        
        for (int i = 0; i < vExcludeRangeArray.length; i++) {
                this._excludeRangeList.add(vExcludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_excludeRangeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vExcludeRangeList the Vector to copy.
     */
    public void setExcludeRange(
            final java.util.List<org.opennms.netmgt.config.linkd.ExcludeRange> vExcludeRangeList) {
        // copy vector
        this._excludeRangeList.clear();
        
        this._excludeRangeList.addAll(vExcludeRangeList);
    }

    /**
     * Sets the value of '_excludeRangeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param excludeRangeList the Vector to set.
     */
    public void setExcludeRangeCollection(
            final java.util.List<org.opennms.netmgt.config.linkd.ExcludeRange> excludeRangeList) {
        this._excludeRangeList = excludeRangeList;
    }

    /**
     * Sets the value of field 'filter'. The field 'filter' has the
     * following description: A rule which adresses belonging to
     * this
     *  package must pass. This package is applied
     *  only to addresses that pass this filter.
     *  
     * 
     * @param filter the value of field 'filter'.
     */
    public void setFilter(
            final org.opennms.netmgt.config.linkd.Filter filter) {
        this._filter = filter;
    }

    /**
     * Sets the value of field 'forceIpRouteDiscoveryOnEthernet'.
     * The field 'forceIpRouteDiscoveryOnEthernet' has the
     * following description: OverWrite default value of
     * link-configuration corresponding attribute 
     *  
     * 
     * @param forceIpRouteDiscoveryOnEthernet the value of field
     * 'forceIpRouteDiscoveryOnEthernet'.
     */
    public void setForceIpRouteDiscoveryOnEthernet(
            final boolean forceIpRouteDiscoveryOnEthernet) {
        this._forceIpRouteDiscoveryOnEthernet = forceIpRouteDiscoveryOnEthernet;
        this._has_forceIpRouteDiscoveryOnEthernet = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeRange(
            final int index,
            final org.opennms.netmgt.config.linkd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRangeList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRange: Index value '" + index + "' not in range [0.." + (this._includeRangeList.size() - 1) + "]");
        }
        
        this._includeRangeList.set(index, vIncludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeRangeArray
     */
    public void setIncludeRange(
            final org.opennms.netmgt.config.linkd.IncludeRange[] vIncludeRangeArray) {
        //-- copy array
        _includeRangeList.clear();
        
        for (int i = 0; i < vIncludeRangeArray.length; i++) {
                this._includeRangeList.add(vIncludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_includeRangeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vIncludeRangeList the Vector to copy.
     */
    public void setIncludeRange(
            final java.util.List<org.opennms.netmgt.config.linkd.IncludeRange> vIncludeRangeList) {
        // copy vector
        this._includeRangeList.clear();
        
        this._includeRangeList.addAll(vIncludeRangeList);
    }

    /**
     * Sets the value of '_includeRangeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param includeRangeList the Vector to set.
     */
    public void setIncludeRangeCollection(
            final java.util.List<org.opennms.netmgt.config.linkd.IncludeRange> includeRangeList) {
        this._includeRangeList = includeRangeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeUrl(
            final int index,
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeUrlList.size()) {
            throw new IndexOutOfBoundsException("setIncludeUrl: Index value '" + index + "' not in range [0.." + (this._includeUrlList.size() - 1) + "]");
        }
        
        this._includeUrlList.set(index, vIncludeUrl);
    }

    /**
     * 
     * 
     * @param vIncludeUrlArray
     */
    public void setIncludeUrl(
            final java.lang.String[] vIncludeUrlArray) {
        //-- copy array
        _includeUrlList.clear();
        
        for (int i = 0; i < vIncludeUrlArray.length; i++) {
                this._includeUrlList.add(vIncludeUrlArray[i]);
        }
    }

    /**
     * Sets the value of '_includeUrlList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vIncludeUrlList the Vector to copy.
     */
    public void setIncludeUrl(
            final java.util.List<java.lang.String> vIncludeUrlList) {
        // copy vector
        this._includeUrlList.clear();
        
        this._includeUrlList.addAll(vIncludeUrlList);
    }

    /**
     * Sets the value of '_includeUrlList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param includeUrlList the Vector to set.
     */
    public void setIncludeUrlCollection(
            final java.util.List<java.lang.String> includeUrlList) {
        this._includeUrlList = includeUrlList;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Name or identifier for this package.
     *  
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'saveRouteTable'. The field
     * 'saveRouteTable' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @param saveRouteTable the value of field 'saveRouteTable'.
     */
    public void setSaveRouteTable(
            final boolean saveRouteTable) {
        this._saveRouteTable = saveRouteTable;
        this._has_saveRouteTable = true;
    }

    /**
     * Sets the value of field 'saveStpInterfaceTable'. The field
     * 'saveStpInterfaceTable' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @param saveStpInterfaceTable the value of field
     * 'saveStpInterfaceTable'.
     */
    public void setSaveStpInterfaceTable(
            final boolean saveStpInterfaceTable) {
        this._saveStpInterfaceTable = saveStpInterfaceTable;
        this._has_saveStpInterfaceTable = true;
    }

    /**
     * Sets the value of field 'saveStpNodeTable'. The field
     * 'saveStpNodeTable' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @param saveStpNodeTable the value of field 'saveStpNodeTable'
     */
    public void setSaveStpNodeTable(
            final boolean saveStpNodeTable) {
        this._saveStpNodeTable = saveStpNodeTable;
        this._has_saveStpNodeTable = true;
    }

    /**
     * Sets the value of field 'snmp_poll_interval'. The field
     * 'snmp_poll_interval' has the following description:
     * OverWrite link-configuration corresponding attribute 
     *  
     * 
     * @param snmp_poll_interval the value of field
     * 'snmp_poll_interval'.
     */
    public void setSnmp_poll_interval(
            final long snmp_poll_interval) {
        this._snmp_poll_interval = snmp_poll_interval;
        this._has_snmp_poll_interval = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSpecific(
            final int index,
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._specificList.size()) {
            throw new IndexOutOfBoundsException("setSpecific: Index value '" + index + "' not in range [0.." + (this._specificList.size() - 1) + "]");
        }
        
        this._specificList.set(index, vSpecific);
    }

    /**
     * 
     * 
     * @param vSpecificArray
     */
    public void setSpecific(
            final java.lang.String[] vSpecificArray) {
        //-- copy array
        _specificList.clear();
        
        for (int i = 0; i < vSpecificArray.length; i++) {
                this._specificList.add(vSpecificArray[i]);
        }
    }

    /**
     * Sets the value of '_specificList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSpecificList the Vector to copy.
     */
    public void setSpecific(
            final java.util.List<java.lang.String> vSpecificList) {
        // copy vector
        this._specificList.clear();
        
        this._specificList.addAll(vSpecificList);
    }

    /**
     * Sets the value of '_specificList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param specificList the Vector to set.
     */
    public void setSpecificCollection(
            final java.util.List<java.lang.String> specificList) {
        this._specificList = specificList;
    }

    /**
     * Sets the value of field 'useBridgeDiscovery'. The field
     * 'useBridgeDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @param useBridgeDiscovery the value of field
     * 'useBridgeDiscovery'.
     */
    public void setUseBridgeDiscovery(
            final boolean useBridgeDiscovery) {
        this._useBridgeDiscovery = useBridgeDiscovery;
        this._has_useBridgeDiscovery = true;
    }

    /**
     * Sets the value of field 'useCdpDiscovery'. The field
     * 'useCdpDiscovery' has the following description: OverWrite
     * default value of link-configuration corresponding attribute 
     *  
     * 
     * @param useCdpDiscovery the value of field 'useCdpDiscovery'.
     */
    public void setUseCdpDiscovery(
            final boolean useCdpDiscovery) {
        this._useCdpDiscovery = useCdpDiscovery;
        this._has_useCdpDiscovery = true;
    }

    /**
     * Sets the value of field 'useIpRouteDiscovery'. The field
     * 'useIpRouteDiscovery' has the following description:
     * OverWrite default value of link-configuration corresponding
     * attribute 
     *  
     * 
     * @param useIpRouteDiscovery the value of field
     * 'useIpRouteDiscovery'.
     */
    public void setUseIpRouteDiscovery(
            final boolean useIpRouteDiscovery) {
        this._useIpRouteDiscovery = useIpRouteDiscovery;
        this._has_useIpRouteDiscovery = true;
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
     * org.opennms.netmgt.config.linkd.Package
     */
    public static org.opennms.netmgt.config.linkd.Package unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.linkd.Package) Unmarshaller.unmarshal(org.opennms.netmgt.config.linkd.Package.class, reader);
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

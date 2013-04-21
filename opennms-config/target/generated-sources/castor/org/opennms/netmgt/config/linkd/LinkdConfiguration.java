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
 * Top-level element for the linkd-configuration.xml
 *  configuration file.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class LinkdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The max number of threads used for polling snmp
     *  devices and discovery links.
     *  
     */
    private int _threads;

    /**
     * keeps track of state for field: _threads
     */
    private boolean _has_threads;

    /**
     * The initial sleep time in mill seconds before starting
     *  Snmp Collection.
     *  
     */
    private long _initial_sleep_time;

    /**
     * keeps track of state for field: _initial_sleep_time
     */
    private boolean _has_initial_sleep_time;

    /**
     * Snmp Poll Time interval in mill seconds.
     *  
     */
    private long _snmp_poll_interval;

    /**
     * keeps track of state for field: _snmp_poll_interval
     */
    private boolean _has_snmp_poll_interval;

    /**
     * Time interval in mill seconds from last snmp collection
     *  and link discovery.
     *  
     */
    private long _discovery_link_interval;

    /**
     * keeps track of state for field: _discovery_link_interval
     */
    private boolean _has_discovery_link_interval;

    /**
     * Whether Linkd should generate newSuspect events
     *  for ip addresses unknown to OpenNMS found on nodes snmp
     * tables.
     *  
     */
    private boolean _autoDiscovery = false;

    /**
     * keeps track of state for field: _autoDiscovery
     */
    private boolean _has_autoDiscovery;

    /**
     * Whether Discovery Link should try to get 
     *  specific snmp bridge info probably lost in snmp data
     * collection.
     *  Should be enabled only in very complex network
     *  where snmpCollection often fails.
     *  Enabling this flags slows the discovery process a lot. 
     *  
     */
    private boolean _enableDiscoveryDownload = false;

    /**
     * keeps track of state for field: _enableDiscoveryDownload
     */
    private boolean _has_enableDiscoveryDownload;

    /**
     * Whether SnmpCollection has to collect snmp Vlan tables on
     * devices.
     *  The Vlan data collection is made using the classes defined
     * in vlans elements. 
     *  
     */
    private boolean _enableVlanDiscovery = true;

    /**
     * keeps track of state for field: _enableVlanDiscovery
     */
    private boolean _has_enableVlanDiscovery;

    /**
     * Whether links discovery process should use 
     *  cisco discovery protocol snmp tables.
     *  
     */
    private boolean _useCdpDiscovery = true;

    /**
     * keeps track of state for field: _useCdpDiscovery
     */
    private boolean _has_useCdpDiscovery;

    /**
     * Whether links discovery process should use
     *  ip route tables.
     *  
     */
    private boolean _useIpRouteDiscovery = true;

    /**
     * keeps track of state for field: _useIpRouteDiscovery
     */
    private boolean _has_useIpRouteDiscovery;

    /**
     * Whether links discovery process should use
     *  snmp bridge and spanning tree tables.
     *  
     */
    private boolean _useBridgeDiscovery = true;

    /**
     * keeps track of state for field: _useBridgeDiscovery
     */
    private boolean _has_useBridgeDiscovery;

    /**
     * Whether Linkd has to save snmp ip route tables to database
     *  
     */
    private boolean _saveRouteTable = true;

    /**
     * keeps track of state for field: _saveRouteTable
     */
    private boolean _has_saveRouteTable;

    /**
     * Whether Linkd has save bridge base informations to database.
     *  
     */
    private boolean _saveStpNodeTable = true;

    /**
     * keeps track of state for field: _saveStpNodeTable
     */
    private boolean _has_saveStpNodeTable;

    /**
     * Whether Linkd has to save to database bridge interfaces
     * informations to database.
     *  
     */
    private boolean _saveStpInterfaceTable = true;

    /**
     * keeps track of state for field: _saveStpInterfaceTable
     */
    private boolean _has_saveStpInterfaceTable;

    /**
     * Whether Linkd has to find links using ip route tables
     *  on ethernet interfaces.
     *  
     */
    private boolean _forceIpRouteDiscoveryOnEthernet = false;

    /**
     * keeps track of state for field:
     * _forceIpRouteDiscoveryOnEthernet
     */
    private boolean _has_forceIpRouteDiscoveryOnEthernet;

    /**
     * A section to get specific Vendors ipRoute
     *  informations that are used to get ipRoute tables on nodes.
     *  
     */
    private org.opennms.netmgt.config.linkd.Iproutes _iproutes;

    /**
     * A section to get specific Vendors Vlan
     *  informations that are used to get vlan tables on nodes.
     *  
     */
    private org.opennms.netmgt.config.linkd.Vlans _vlans;

    /**
     * Package encapsulating addresses, data to be
     *  collected for these addresses, etc..
     *  
     */
    private java.util.List<org.opennms.netmgt.config.linkd.Package> _packageList;


      //----------------/
     //- Constructors -/
    //----------------/

    public LinkdConfiguration() {
        super();
        this._packageList = new java.util.ArrayList<org.opennms.netmgt.config.linkd.Package>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(
            final org.opennms.netmgt.config.linkd.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.add(vPackage);
    }

    /**
     * 
     * 
     * @param index
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(
            final int index,
            final org.opennms.netmgt.config.linkd.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.add(index, vPackage);
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
    public void deleteInitial_sleep_time(
    ) {
        this._has_initial_sleep_time= false;
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
    public void deleteThreads(
    ) {
        this._has_threads= false;
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
     * Method enumeratePackage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.linkd.Package> enumeratePackage(
    ) {
        return java.util.Collections.enumeration(this._packageList);
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
        
        if (obj instanceof LinkdConfiguration) {
        
            LinkdConfiguration temp = (LinkdConfiguration)obj;
            if (this._threads != temp._threads)
                return false;
            if (this._has_threads != temp._has_threads)
                return false;
            if (this._initial_sleep_time != temp._initial_sleep_time)
                return false;
            if (this._has_initial_sleep_time != temp._has_initial_sleep_time)
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
            if (this._iproutes != null) {
                if (temp._iproutes == null) return false;
                else if (!(this._iproutes.equals(temp._iproutes))) 
                    return false;
            }
            else if (temp._iproutes != null)
                return false;
            if (this._vlans != null) {
                if (temp._vlans == null) return false;
                else if (!(this._vlans.equals(temp._vlans))) 
                    return false;
            }
            else if (temp._vlans != null)
                return false;
            if (this._packageList != null) {
                if (temp._packageList == null) return false;
                else if (!(this._packageList.equals(temp._packageList))) 
                    return false;
            }
            else if (temp._packageList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'autoDiscovery'. The field
     * 'autoDiscovery' has the following description: Whether Linkd
     * should generate newSuspect events
     *  for ip addresses unknown to OpenNMS found on nodes snmp
     * tables.
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
     * description: Time interval in mill seconds from last snmp
     * collection
     *  and link discovery.
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
     * description: Whether Discovery Link should try to get 
     *  specific snmp bridge info probably lost in snmp data
     * collection.
     *  Should be enabled only in very complex network
     *  where snmpCollection often fails.
     *  Enabling this flags slows the discovery process a lot. 
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
     * 'enableVlanDiscovery' has the following description: Whether
     * SnmpCollection has to collect snmp Vlan tables on devices.
     *  The Vlan data collection is made using the classes defined
     * in vlans elements. 
     *  
     * 
     * @return the value of field 'EnableVlanDiscovery'.
     */
    public boolean getEnableVlanDiscovery(
    ) {
        return this._enableVlanDiscovery;
    }

    /**
     * Returns the value of field
     * 'forceIpRouteDiscoveryOnEthernet'. The field
     * 'forceIpRouteDiscoveryOnEthernet' has the following
     * description: Whether Linkd has to find links using ip route
     * tables
     *  on ethernet interfaces.
     *  
     * 
     * @return the value of field 'ForceIpRouteDiscoveryOnEthernet'.
     */
    public boolean getForceIpRouteDiscoveryOnEthernet(
    ) {
        return this._forceIpRouteDiscoveryOnEthernet;
    }

    /**
     * Returns the value of field 'initial_sleep_time'. The field
     * 'initial_sleep_time' has the following description: The
     * initial sleep time in mill seconds before starting
     *  Snmp Collection.
     *  
     * 
     * @return the value of field 'Initial_sleep_time'.
     */
    public long getInitial_sleep_time(
    ) {
        return this._initial_sleep_time;
    }

    /**
     * Returns the value of field 'iproutes'. The field 'iproutes'
     * has the following description: A section to get specific
     * Vendors ipRoute
     *  informations that are used to get ipRoute tables on nodes.
     *  
     * 
     * @return the value of field 'Iproutes'.
     */
    public org.opennms.netmgt.config.linkd.Iproutes getIproutes(
    ) {
        return this._iproutes;
    }

    /**
     * Method getPackage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.linkd.Package at the given index
     */
    public org.opennms.netmgt.config.linkd.Package getPackage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("getPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.linkd.Package) _packageList.get(index);
    }

    /**
     * Method getPackage.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.linkd.Package[] getPackage(
    ) {
        org.opennms.netmgt.config.linkd.Package[] array = new org.opennms.netmgt.config.linkd.Package[0];
        return (org.opennms.netmgt.config.linkd.Package[]) this._packageList.toArray(array);
    }

    /**
     * Method getPackageCollection.Returns a reference to
     * '_packageList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.linkd.Package> getPackageCollection(
    ) {
        return this._packageList;
    }

    /**
     * Method getPackageCount.
     * 
     * @return the size of this collection
     */
    public int getPackageCount(
    ) {
        return this._packageList.size();
    }

    /**
     * Returns the value of field 'saveRouteTable'. The field
     * 'saveRouteTable' has the following description: Whether
     * Linkd has to save snmp ip route tables to database
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
     * Whether Linkd has to save to database bridge interfaces
     * informations to database.
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
     * 'saveStpNodeTable' has the following description: Whether
     * Linkd has save bridge base informations to database.
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
     * 'snmp_poll_interval' has the following description: Snmp
     * Poll Time interval in mill seconds.
     *  
     * 
     * @return the value of field 'Snmp_poll_interval'.
     */
    public long getSnmp_poll_interval(
    ) {
        return this._snmp_poll_interval;
    }

    /**
     * Returns the value of field 'threads'. The field 'threads'
     * has the following description: The max number of threads
     * used for polling snmp
     *  devices and discovery links.
     *  
     * 
     * @return the value of field 'Threads'.
     */
    public int getThreads(
    ) {
        return this._threads;
    }

    /**
     * Returns the value of field 'useBridgeDiscovery'. The field
     * 'useBridgeDiscovery' has the following description: Whether
     * links discovery process should use
     *  snmp bridge and spanning tree tables.
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
     * 'useCdpDiscovery' has the following description: Whether
     * links discovery process should use 
     *  cisco discovery protocol snmp tables.
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
     * 'useIpRouteDiscovery' has the following description: Whether
     * links discovery process should use
     *  ip route tables.
     *  
     * 
     * @return the value of field 'UseIpRouteDiscovery'.
     */
    public boolean getUseIpRouteDiscovery(
    ) {
        return this._useIpRouteDiscovery;
    }

    /**
     * Returns the value of field 'vlans'. The field 'vlans' has
     * the following description: A section to get specific Vendors
     * Vlan
     *  informations that are used to get vlan tables on nodes.
     *  
     * 
     * @return the value of field 'Vlans'.
     */
    public org.opennms.netmgt.config.linkd.Vlans getVlans(
    ) {
        return this._vlans;
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
     * Method hasInitial_sleep_time.
     * 
     * @return true if at least one Initial_sleep_time has been adde
     */
    public boolean hasInitial_sleep_time(
    ) {
        return this._has_initial_sleep_time;
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
     * Method hasThreads.
     * 
     * @return true if at least one Threads has been added
     */
    public boolean hasThreads(
    ) {
        return this._has_threads;
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
        result = 37 * result + _threads;
        result = 37 * result + (int)(_initial_sleep_time^(_initial_sleep_time>>>32));
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
        if (_iproutes != null) {
           result = 37 * result + _iproutes.hashCode();
        }
        if (_vlans != null) {
           result = 37 * result + _vlans.hashCode();
        }
        if (_packageList != null) {
           result = 37 * result + _packageList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'autoDiscovery'. The field
     * 'autoDiscovery' has the following description: Whether Linkd
     * should generate newSuspect events
     *  for ip addresses unknown to OpenNMS found on nodes snmp
     * tables.
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
     * description: Whether Discovery Link should try to get 
     *  specific snmp bridge info probably lost in snmp data
     * collection.
     *  Should be enabled only in very complex network
     *  where snmpCollection often fails.
     *  Enabling this flags slows the discovery process a lot. 
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
     * 'enableVlanDiscovery' has the following description: Whether
     * SnmpCollection has to collect snmp Vlan tables on devices.
     *  The Vlan data collection is made using the classes defined
     * in vlans elements. 
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
     * description: Whether Linkd has to find links using ip route
     * tables
     *  on ethernet interfaces.
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
     * 'saveRouteTable' has the following description: Whether
     * Linkd has to save snmp ip route tables to database
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
     * Whether Linkd has to save to database bridge interfaces
     * informations to database.
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
     * 'saveStpNodeTable' has the following description: Whether
     * Linkd has save bridge base informations to database.
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
     * 'useBridgeDiscovery' has the following description: Whether
     * links discovery process should use
     *  snmp bridge and spanning tree tables.
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
     * 'useCdpDiscovery' has the following description: Whether
     * links discovery process should use 
     *  cisco discovery protocol snmp tables.
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
     * 'useIpRouteDiscovery' has the following description: Whether
     * links discovery process should use
     *  ip route tables.
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
     * Method iteratePackage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.linkd.Package> iteratePackage(
    ) {
        return this._packageList.iterator();
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
    public void removeAllPackage(
    ) {
        this._packageList.clear();
    }

    /**
     * Method removePackage.
     * 
     * @param vPackage
     * @return true if the object was removed from the collection.
     */
    public boolean removePackage(
            final org.opennms.netmgt.config.linkd.Package vPackage) {
        boolean removed = _packageList.remove(vPackage);
        return removed;
    }

    /**
     * Method removePackageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.linkd.Package removePackageAt(
            final int index) {
        java.lang.Object obj = this._packageList.remove(index);
        return (org.opennms.netmgt.config.linkd.Package) obj;
    }

    /**
     * Sets the value of field 'autoDiscovery'. The field
     * 'autoDiscovery' has the following description: Whether Linkd
     * should generate newSuspect events
     *  for ip addresses unknown to OpenNMS found on nodes snmp
     * tables.
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
     * Time interval in mill seconds from last snmp collection
     *  and link discovery.
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
     * Whether Discovery Link should try to get 
     *  specific snmp bridge info probably lost in snmp data
     * collection.
     *  Should be enabled only in very complex network
     *  where snmpCollection often fails.
     *  Enabling this flags slows the discovery process a lot. 
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
     * 'enableVlanDiscovery' has the following description: Whether
     * SnmpCollection has to collect snmp Vlan tables on devices.
     *  The Vlan data collection is made using the classes defined
     * in vlans elements. 
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
     * Sets the value of field 'forceIpRouteDiscoveryOnEthernet'.
     * The field 'forceIpRouteDiscoveryOnEthernet' has the
     * following description: Whether Linkd has to find links using
     * ip route tables
     *  on ethernet interfaces.
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
     * Sets the value of field 'initial_sleep_time'. The field
     * 'initial_sleep_time' has the following description: The
     * initial sleep time in mill seconds before starting
     *  Snmp Collection.
     *  
     * 
     * @param initial_sleep_time the value of field
     * 'initial_sleep_time'.
     */
    public void setInitial_sleep_time(
            final long initial_sleep_time) {
        this._initial_sleep_time = initial_sleep_time;
        this._has_initial_sleep_time = true;
    }

    /**
     * Sets the value of field 'iproutes'. The field 'iproutes' has
     * the following description: A section to get specific Vendors
     * ipRoute
     *  informations that are used to get ipRoute tables on nodes.
     *  
     * 
     * @param iproutes the value of field 'iproutes'.
     */
    public void setIproutes(
            final org.opennms.netmgt.config.linkd.Iproutes iproutes) {
        this._iproutes = iproutes;
    }

    /**
     * 
     * 
     * @param index
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPackage(
            final int index,
            final org.opennms.netmgt.config.linkd.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("setPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }
        
        this._packageList.set(index, vPackage);
    }

    /**
     * 
     * 
     * @param vPackageArray
     */
    public void setPackage(
            final org.opennms.netmgt.config.linkd.Package[] vPackageArray) {
        //-- copy array
        _packageList.clear();
        
        for (int i = 0; i < vPackageArray.length; i++) {
                this._packageList.add(vPackageArray[i]);
        }
    }

    /**
     * Sets the value of '_packageList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPackageList the Vector to copy.
     */
    public void setPackage(
            final java.util.List<org.opennms.netmgt.config.linkd.Package> vPackageList) {
        // copy vector
        this._packageList.clear();
        
        this._packageList.addAll(vPackageList);
    }

    /**
     * Sets the value of '_packageList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param _packageList the Vector to set.
     */
    public void setPackageCollection(
            final java.util.List<org.opennms.netmgt.config.linkd.Package> _packageList) {
        this._packageList = _packageList;
    }

    /**
     * Sets the value of field 'saveRouteTable'. The field
     * 'saveRouteTable' has the following description: Whether
     * Linkd has to save snmp ip route tables to database
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
     * Whether Linkd has to save to database bridge interfaces
     * informations to database.
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
     * 'saveStpNodeTable' has the following description: Whether
     * Linkd has save bridge base informations to database.
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
     * 'snmp_poll_interval' has the following description: Snmp
     * Poll Time interval in mill seconds.
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
     * Sets the value of field 'threads'. The field 'threads' has
     * the following description: The max number of threads used
     * for polling snmp
     *  devices and discovery links.
     *  
     * 
     * @param threads the value of field 'threads'.
     */
    public void setThreads(
            final int threads) {
        this._threads = threads;
        this._has_threads = true;
    }

    /**
     * Sets the value of field 'useBridgeDiscovery'. The field
     * 'useBridgeDiscovery' has the following description: Whether
     * links discovery process should use
     *  snmp bridge and spanning tree tables.
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
     * 'useCdpDiscovery' has the following description: Whether
     * links discovery process should use 
     *  cisco discovery protocol snmp tables.
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
     * 'useIpRouteDiscovery' has the following description: Whether
     * links discovery process should use
     *  ip route tables.
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
     * Sets the value of field 'vlans'. The field 'vlans' has the
     * following description: A section to get specific Vendors
     * Vlan
     *  informations that are used to get vlan tables on nodes.
     *  
     * 
     * @param vlans the value of field 'vlans'.
     */
    public void setVlans(
            final org.opennms.netmgt.config.linkd.Vlans vlans) {
        this._vlans = vlans;
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
     * org.opennms.netmgt.config.linkd.LinkdConfiguration
     */
    public static org.opennms.netmgt.config.linkd.LinkdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.linkd.LinkdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.linkd.LinkdConfiguration.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.capsd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the capsd-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class CapsdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Interval (in milliseconds) between IP address
     *  re-scans.
     */
    private long _rescanFrequency = 0;

    /**
     * keeps track of state for field: _rescanFrequency
     */
    private boolean _has_rescanFrequency;

    /**
     * Interval (in milliseconds) between Capsd startup and
     *  the start of rescan processing.
     */
    private long _initialSleepTime = 0;

    /**
     * keeps track of state for field: _initialSleepTime
     */
    private boolean _has_initialSleepTime;

    /**
     * Maximum number of threads available for processing
     *  'newSuspect' events from discovery.
     */
    private int _maxSuspectThreadPoolSize;

    /**
     * keeps track of state for field: _maxSuspectThreadPoolSize
     */
    private boolean _has_maxSuspectThreadPoolSize;

    /**
     * Maximum number of threads available for rescanning
     *  managed interfaces.
     */
    private int _maxRescanThreadPoolSize;

    /**
     * keeps track of state for field: _maxRescanThreadPoolSize
     */
    private boolean _has_maxRescanThreadPoolSize;

    /**
     * Default management policy.
     */
    private java.lang.String _managementPolicy = "managed";

    /**
     * Flag which determines Capsd's behavior in the event
     *  that a NoRouteToHost exception is generated during a
     * protocol plugin
     *  scan of an interface. If true, Capsd will abort the
     * protocol
     *  scanning process for the interface.
     */
    private java.lang.String _abortProtocolScansIfNoRoute = "false";

    /**
     * Determine if deleting an service propagates to
     *  deleting the interface if the service is the only one
     * remaining on
     *  the interface. Likewise for the only interface on a
     *  node.
     */
    private java.lang.String _deletePropagationEnabled = "true";

    /**
     * Flag which indicates if an external XMLRPC server has
     *  to be notified with any event process errors.
     */
    private java.lang.String _xmlrpc = "false";

    /**
     * A protocol/service plugin.
     */
    private java.util.List<org.opennms.netmgt.config.capsd.ProtocolPlugin> _protocolPluginList;

    /**
     * SMB protocol configuration (primarily for SMB
     *  authentication).
     */
    private org.opennms.netmgt.config.capsd.SmbConfig _smbConfig;

    /**
     * Managed/unmanaged IP addresses and address
     *  ranges.
     */
    private java.util.List<org.opennms.netmgt.config.capsd.IpManagement> _ipManagementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CapsdConfiguration() {
        super();
        setManagementPolicy("managed");
        setAbortProtocolScansIfNoRoute("false");
        setDeletePropagationEnabled("true");
        setXmlrpc("false");
        this._protocolPluginList = new java.util.ArrayList<org.opennms.netmgt.config.capsd.ProtocolPlugin>();
        this._ipManagementList = new java.util.ArrayList<org.opennms.netmgt.config.capsd.IpManagement>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIpManagement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIpManagement(
            final org.opennms.netmgt.config.capsd.IpManagement vIpManagement)
    throws java.lang.IndexOutOfBoundsException {
        this._ipManagementList.add(vIpManagement);
    }

    /**
     * 
     * 
     * @param index
     * @param vIpManagement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIpManagement(
            final int index,
            final org.opennms.netmgt.config.capsd.IpManagement vIpManagement)
    throws java.lang.IndexOutOfBoundsException {
        this._ipManagementList.add(index, vIpManagement);
    }

    /**
     * 
     * 
     * @param vProtocolPlugin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProtocolPlugin(
            final org.opennms.netmgt.config.capsd.ProtocolPlugin vProtocolPlugin)
    throws java.lang.IndexOutOfBoundsException {
        this._protocolPluginList.add(vProtocolPlugin);
    }

    /**
     * 
     * 
     * @param index
     * @param vProtocolPlugin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProtocolPlugin(
            final int index,
            final org.opennms.netmgt.config.capsd.ProtocolPlugin vProtocolPlugin)
    throws java.lang.IndexOutOfBoundsException {
        this._protocolPluginList.add(index, vProtocolPlugin);
    }

    /**
     */
    public void deleteInitialSleepTime(
    ) {
        this._has_initialSleepTime= false;
    }

    /**
     */
    public void deleteMaxRescanThreadPoolSize(
    ) {
        this._has_maxRescanThreadPoolSize= false;
    }

    /**
     */
    public void deleteMaxSuspectThreadPoolSize(
    ) {
        this._has_maxSuspectThreadPoolSize= false;
    }

    /**
     */
    public void deleteRescanFrequency(
    ) {
        this._has_rescanFrequency= false;
    }

    /**
     * Method enumerateIpManagement.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.capsd.IpManagement> enumerateIpManagement(
    ) {
        return java.util.Collections.enumeration(this._ipManagementList);
    }

    /**
     * Method enumerateProtocolPlugin.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.capsd.ProtocolPlugin> enumerateProtocolPlugin(
    ) {
        return java.util.Collections.enumeration(this._protocolPluginList);
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
        
        if (obj instanceof CapsdConfiguration) {
        
            CapsdConfiguration temp = (CapsdConfiguration)obj;
            if (this._rescanFrequency != temp._rescanFrequency)
                return false;
            if (this._has_rescanFrequency != temp._has_rescanFrequency)
                return false;
            if (this._initialSleepTime != temp._initialSleepTime)
                return false;
            if (this._has_initialSleepTime != temp._has_initialSleepTime)
                return false;
            if (this._maxSuspectThreadPoolSize != temp._maxSuspectThreadPoolSize)
                return false;
            if (this._has_maxSuspectThreadPoolSize != temp._has_maxSuspectThreadPoolSize)
                return false;
            if (this._maxRescanThreadPoolSize != temp._maxRescanThreadPoolSize)
                return false;
            if (this._has_maxRescanThreadPoolSize != temp._has_maxRescanThreadPoolSize)
                return false;
            if (this._managementPolicy != null) {
                if (temp._managementPolicy == null) return false;
                else if (!(this._managementPolicy.equals(temp._managementPolicy))) 
                    return false;
            }
            else if (temp._managementPolicy != null)
                return false;
            if (this._abortProtocolScansIfNoRoute != null) {
                if (temp._abortProtocolScansIfNoRoute == null) return false;
                else if (!(this._abortProtocolScansIfNoRoute.equals(temp._abortProtocolScansIfNoRoute))) 
                    return false;
            }
            else if (temp._abortProtocolScansIfNoRoute != null)
                return false;
            if (this._deletePropagationEnabled != null) {
                if (temp._deletePropagationEnabled == null) return false;
                else if (!(this._deletePropagationEnabled.equals(temp._deletePropagationEnabled))) 
                    return false;
            }
            else if (temp._deletePropagationEnabled != null)
                return false;
            if (this._xmlrpc != null) {
                if (temp._xmlrpc == null) return false;
                else if (!(this._xmlrpc.equals(temp._xmlrpc))) 
                    return false;
            }
            else if (temp._xmlrpc != null)
                return false;
            if (this._protocolPluginList != null) {
                if (temp._protocolPluginList == null) return false;
                else if (!(this._protocolPluginList.equals(temp._protocolPluginList))) 
                    return false;
            }
            else if (temp._protocolPluginList != null)
                return false;
            if (this._smbConfig != null) {
                if (temp._smbConfig == null) return false;
                else if (!(this._smbConfig.equals(temp._smbConfig))) 
                    return false;
            }
            else if (temp._smbConfig != null)
                return false;
            if (this._ipManagementList != null) {
                if (temp._ipManagementList == null) return false;
                else if (!(this._ipManagementList.equals(temp._ipManagementList))) 
                    return false;
            }
            else if (temp._ipManagementList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'abortProtocolScansIfNoRoute'.
     * The field 'abortProtocolScansIfNoRoute' has the following
     * description: Flag which determines Capsd's behavior in the
     * event
     *  that a NoRouteToHost exception is generated during a
     * protocol plugin
     *  scan of an interface. If true, Capsd will abort the
     * protocol
     *  scanning process for the interface.
     * 
     * @return the value of field 'AbortProtocolScansIfNoRoute'.
     */
    public java.lang.String getAbortProtocolScansIfNoRoute(
    ) {
        return this._abortProtocolScansIfNoRoute;
    }

    /**
     * Returns the value of field 'deletePropagationEnabled'. The
     * field 'deletePropagationEnabled' has the following
     * description: Determine if deleting an service propagates to
     *  deleting the interface if the service is the only one
     * remaining on
     *  the interface. Likewise for the only interface on a
     *  node.
     * 
     * @return the value of field 'DeletePropagationEnabled'.
     */
    public java.lang.String getDeletePropagationEnabled(
    ) {
        return this._deletePropagationEnabled;
    }

    /**
     * Returns the value of field 'initialSleepTime'. The field
     * 'initialSleepTime' has the following description: Interval
     * (in milliseconds) between Capsd startup and
     *  the start of rescan processing.
     * 
     * @return the value of field 'InitialSleepTime'.
     */
    public long getInitialSleepTime(
    ) {
        return this._initialSleepTime;
    }

    /**
     * Method getIpManagement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.capsd.IpManagement at the given
     * index
     */
    public org.opennms.netmgt.config.capsd.IpManagement getIpManagement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ipManagementList.size()) {
            throw new IndexOutOfBoundsException("getIpManagement: Index value '" + index + "' not in range [0.." + (this._ipManagementList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.capsd.IpManagement) _ipManagementList.get(index);
    }

    /**
     * Method getIpManagement.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.capsd.IpManagement[] getIpManagement(
    ) {
        org.opennms.netmgt.config.capsd.IpManagement[] array = new org.opennms.netmgt.config.capsd.IpManagement[0];
        return (org.opennms.netmgt.config.capsd.IpManagement[]) this._ipManagementList.toArray(array);
    }

    /**
     * Method getIpManagementCollection.Returns a reference to
     * '_ipManagementList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.capsd.IpManagement> getIpManagementCollection(
    ) {
        return this._ipManagementList;
    }

    /**
     * Method getIpManagementCount.
     * 
     * @return the size of this collection
     */
    public int getIpManagementCount(
    ) {
        return this._ipManagementList.size();
    }

    /**
     * Returns the value of field 'managementPolicy'. The field
     * 'managementPolicy' has the following description: Default
     * management policy.
     * 
     * @return the value of field 'ManagementPolicy'.
     */
    public java.lang.String getManagementPolicy(
    ) {
        return this._managementPolicy;
    }

    /**
     * Returns the value of field 'maxRescanThreadPoolSize'. The
     * field 'maxRescanThreadPoolSize' has the following
     * description: Maximum number of threads available for
     * rescanning
     *  managed interfaces.
     * 
     * @return the value of field 'MaxRescanThreadPoolSize'.
     */
    public int getMaxRescanThreadPoolSize(
    ) {
        return this._maxRescanThreadPoolSize;
    }

    /**
     * Returns the value of field 'maxSuspectThreadPoolSize'. The
     * field 'maxSuspectThreadPoolSize' has the following
     * description: Maximum number of threads available for
     * processing
     *  'newSuspect' events from discovery.
     * 
     * @return the value of field 'MaxSuspectThreadPoolSize'.
     */
    public int getMaxSuspectThreadPoolSize(
    ) {
        return this._maxSuspectThreadPoolSize;
    }

    /**
     * Method getProtocolPlugin.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.capsd.ProtocolPlugin at the given
     * index
     */
    public org.opennms.netmgt.config.capsd.ProtocolPlugin getProtocolPlugin(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._protocolPluginList.size()) {
            throw new IndexOutOfBoundsException("getProtocolPlugin: Index value '" + index + "' not in range [0.." + (this._protocolPluginList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.capsd.ProtocolPlugin) _protocolPluginList.get(index);
    }

    /**
     * Method getProtocolPlugin.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.capsd.ProtocolPlugin[] getProtocolPlugin(
    ) {
        org.opennms.netmgt.config.capsd.ProtocolPlugin[] array = new org.opennms.netmgt.config.capsd.ProtocolPlugin[0];
        return (org.opennms.netmgt.config.capsd.ProtocolPlugin[]) this._protocolPluginList.toArray(array);
    }

    /**
     * Method getProtocolPluginCollection.Returns a reference to
     * '_protocolPluginList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.capsd.ProtocolPlugin> getProtocolPluginCollection(
    ) {
        return this._protocolPluginList;
    }

    /**
     * Method getProtocolPluginCount.
     * 
     * @return the size of this collection
     */
    public int getProtocolPluginCount(
    ) {
        return this._protocolPluginList.size();
    }

    /**
     * Returns the value of field 'rescanFrequency'. The field
     * 'rescanFrequency' has the following description: Interval
     * (in milliseconds) between IP address
     *  re-scans.
     * 
     * @return the value of field 'RescanFrequency'.
     */
    public long getRescanFrequency(
    ) {
        return this._rescanFrequency;
    }

    /**
     * Returns the value of field 'smbConfig'. The field
     * 'smbConfig' has the following description: SMB protocol
     * configuration (primarily for SMB
     *  authentication).
     * 
     * @return the value of field 'SmbConfig'.
     */
    public org.opennms.netmgt.config.capsd.SmbConfig getSmbConfig(
    ) {
        return this._smbConfig;
    }

    /**
     * Returns the value of field 'xmlrpc'. The field 'xmlrpc' has
     * the following description: Flag which indicates if an
     * external XMLRPC server has
     *  to be notified with any event process errors.
     * 
     * @return the value of field 'Xmlrpc'.
     */
    public java.lang.String getXmlrpc(
    ) {
        return this._xmlrpc;
    }

    /**
     * Method hasInitialSleepTime.
     * 
     * @return true if at least one InitialSleepTime has been added
     */
    public boolean hasInitialSleepTime(
    ) {
        return this._has_initialSleepTime;
    }

    /**
     * Method hasMaxRescanThreadPoolSize.
     * 
     * @return true if at least one MaxRescanThreadPoolSize has
     * been added
     */
    public boolean hasMaxRescanThreadPoolSize(
    ) {
        return this._has_maxRescanThreadPoolSize;
    }

    /**
     * Method hasMaxSuspectThreadPoolSize.
     * 
     * @return true if at least one MaxSuspectThreadPoolSize has
     * been added
     */
    public boolean hasMaxSuspectThreadPoolSize(
    ) {
        return this._has_maxSuspectThreadPoolSize;
    }

    /**
     * Method hasRescanFrequency.
     * 
     * @return true if at least one RescanFrequency has been added
     */
    public boolean hasRescanFrequency(
    ) {
        return this._has_rescanFrequency;
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
        result = 37 * result + (int)(_rescanFrequency^(_rescanFrequency>>>32));
        result = 37 * result + (int)(_initialSleepTime^(_initialSleepTime>>>32));
        result = 37 * result + _maxSuspectThreadPoolSize;
        result = 37 * result + _maxRescanThreadPoolSize;
        if (_managementPolicy != null) {
           result = 37 * result + _managementPolicy.hashCode();
        }
        if (_abortProtocolScansIfNoRoute != null) {
           result = 37 * result + _abortProtocolScansIfNoRoute.hashCode();
        }
        if (_deletePropagationEnabled != null) {
           result = 37 * result + _deletePropagationEnabled.hashCode();
        }
        if (_xmlrpc != null) {
           result = 37 * result + _xmlrpc.hashCode();
        }
        if (_protocolPluginList != null) {
           result = 37 * result + _protocolPluginList.hashCode();
        }
        if (_smbConfig != null) {
           result = 37 * result + _smbConfig.hashCode();
        }
        if (_ipManagementList != null) {
           result = 37 * result + _ipManagementList.hashCode();
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
     * Method iterateIpManagement.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.capsd.IpManagement> iterateIpManagement(
    ) {
        return this._ipManagementList.iterator();
    }

    /**
     * Method iterateProtocolPlugin.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.capsd.ProtocolPlugin> iterateProtocolPlugin(
    ) {
        return this._protocolPluginList.iterator();
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
    public void removeAllIpManagement(
    ) {
        this._ipManagementList.clear();
    }

    /**
     */
    public void removeAllProtocolPlugin(
    ) {
        this._protocolPluginList.clear();
    }

    /**
     * Method removeIpManagement.
     * 
     * @param vIpManagement
     * @return true if the object was removed from the collection.
     */
    public boolean removeIpManagement(
            final org.opennms.netmgt.config.capsd.IpManagement vIpManagement) {
        boolean removed = _ipManagementList.remove(vIpManagement);
        return removed;
    }

    /**
     * Method removeIpManagementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.capsd.IpManagement removeIpManagementAt(
            final int index) {
        java.lang.Object obj = this._ipManagementList.remove(index);
        return (org.opennms.netmgt.config.capsd.IpManagement) obj;
    }

    /**
     * Method removeProtocolPlugin.
     * 
     * @param vProtocolPlugin
     * @return true if the object was removed from the collection.
     */
    public boolean removeProtocolPlugin(
            final org.opennms.netmgt.config.capsd.ProtocolPlugin vProtocolPlugin) {
        boolean removed = _protocolPluginList.remove(vProtocolPlugin);
        return removed;
    }

    /**
     * Method removeProtocolPluginAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.capsd.ProtocolPlugin removeProtocolPluginAt(
            final int index) {
        java.lang.Object obj = this._protocolPluginList.remove(index);
        return (org.opennms.netmgt.config.capsd.ProtocolPlugin) obj;
    }

    /**
     * Sets the value of field 'abortProtocolScansIfNoRoute'. The
     * field 'abortProtocolScansIfNoRoute' has the following
     * description: Flag which determines Capsd's behavior in the
     * event
     *  that a NoRouteToHost exception is generated during a
     * protocol plugin
     *  scan of an interface. If true, Capsd will abort the
     * protocol
     *  scanning process for the interface.
     * 
     * @param abortProtocolScansIfNoRoute the value of field
     * 'abortProtocolScansIfNoRoute'.
     */
    public void setAbortProtocolScansIfNoRoute(
            final java.lang.String abortProtocolScansIfNoRoute) {
        this._abortProtocolScansIfNoRoute = abortProtocolScansIfNoRoute;
    }

    /**
     * Sets the value of field 'deletePropagationEnabled'. The
     * field 'deletePropagationEnabled' has the following
     * description: Determine if deleting an service propagates to
     *  deleting the interface if the service is the only one
     * remaining on
     *  the interface. Likewise for the only interface on a
     *  node.
     * 
     * @param deletePropagationEnabled the value of field
     * 'deletePropagationEnabled'.
     */
    public void setDeletePropagationEnabled(
            final java.lang.String deletePropagationEnabled) {
        this._deletePropagationEnabled = deletePropagationEnabled;
    }

    /**
     * Sets the value of field 'initialSleepTime'. The field
     * 'initialSleepTime' has the following description: Interval
     * (in milliseconds) between Capsd startup and
     *  the start of rescan processing.
     * 
     * @param initialSleepTime the value of field 'initialSleepTime'
     */
    public void setInitialSleepTime(
            final long initialSleepTime) {
        this._initialSleepTime = initialSleepTime;
        this._has_initialSleepTime = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vIpManagement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIpManagement(
            final int index,
            final org.opennms.netmgt.config.capsd.IpManagement vIpManagement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ipManagementList.size()) {
            throw new IndexOutOfBoundsException("setIpManagement: Index value '" + index + "' not in range [0.." + (this._ipManagementList.size() - 1) + "]");
        }
        
        this._ipManagementList.set(index, vIpManagement);
    }

    /**
     * 
     * 
     * @param vIpManagementArray
     */
    public void setIpManagement(
            final org.opennms.netmgt.config.capsd.IpManagement[] vIpManagementArray) {
        //-- copy array
        _ipManagementList.clear();
        
        for (int i = 0; i < vIpManagementArray.length; i++) {
                this._ipManagementList.add(vIpManagementArray[i]);
        }
    }

    /**
     * Sets the value of '_ipManagementList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vIpManagementList the Vector to copy.
     */
    public void setIpManagement(
            final java.util.List<org.opennms.netmgt.config.capsd.IpManagement> vIpManagementList) {
        // copy vector
        this._ipManagementList.clear();
        
        this._ipManagementList.addAll(vIpManagementList);
    }

    /**
     * Sets the value of '_ipManagementList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param ipManagementList the Vector to set.
     */
    public void setIpManagementCollection(
            final java.util.List<org.opennms.netmgt.config.capsd.IpManagement> ipManagementList) {
        this._ipManagementList = ipManagementList;
    }

    /**
     * Sets the value of field 'managementPolicy'. The field
     * 'managementPolicy' has the following description: Default
     * management policy.
     * 
     * @param managementPolicy the value of field 'managementPolicy'
     */
    public void setManagementPolicy(
            final java.lang.String managementPolicy) {
        this._managementPolicy = managementPolicy;
    }

    /**
     * Sets the value of field 'maxRescanThreadPoolSize'. The field
     * 'maxRescanThreadPoolSize' has the following description:
     * Maximum number of threads available for rescanning
     *  managed interfaces.
     * 
     * @param maxRescanThreadPoolSize the value of field
     * 'maxRescanThreadPoolSize'.
     */
    public void setMaxRescanThreadPoolSize(
            final int maxRescanThreadPoolSize) {
        this._maxRescanThreadPoolSize = maxRescanThreadPoolSize;
        this._has_maxRescanThreadPoolSize = true;
    }

    /**
     * Sets the value of field 'maxSuspectThreadPoolSize'. The
     * field 'maxSuspectThreadPoolSize' has the following
     * description: Maximum number of threads available for
     * processing
     *  'newSuspect' events from discovery.
     * 
     * @param maxSuspectThreadPoolSize the value of field
     * 'maxSuspectThreadPoolSize'.
     */
    public void setMaxSuspectThreadPoolSize(
            final int maxSuspectThreadPoolSize) {
        this._maxSuspectThreadPoolSize = maxSuspectThreadPoolSize;
        this._has_maxSuspectThreadPoolSize = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vProtocolPlugin
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProtocolPlugin(
            final int index,
            final org.opennms.netmgt.config.capsd.ProtocolPlugin vProtocolPlugin)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._protocolPluginList.size()) {
            throw new IndexOutOfBoundsException("setProtocolPlugin: Index value '" + index + "' not in range [0.." + (this._protocolPluginList.size() - 1) + "]");
        }
        
        this._protocolPluginList.set(index, vProtocolPlugin);
    }

    /**
     * 
     * 
     * @param vProtocolPluginArray
     */
    public void setProtocolPlugin(
            final org.opennms.netmgt.config.capsd.ProtocolPlugin[] vProtocolPluginArray) {
        //-- copy array
        _protocolPluginList.clear();
        
        for (int i = 0; i < vProtocolPluginArray.length; i++) {
                this._protocolPluginList.add(vProtocolPluginArray[i]);
        }
    }

    /**
     * Sets the value of '_protocolPluginList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vProtocolPluginList the Vector to copy.
     */
    public void setProtocolPlugin(
            final java.util.List<org.opennms.netmgt.config.capsd.ProtocolPlugin> vProtocolPluginList) {
        // copy vector
        this._protocolPluginList.clear();
        
        this._protocolPluginList.addAll(vProtocolPluginList);
    }

    /**
     * Sets the value of '_protocolPluginList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param protocolPluginList the Vector to set.
     */
    public void setProtocolPluginCollection(
            final java.util.List<org.opennms.netmgt.config.capsd.ProtocolPlugin> protocolPluginList) {
        this._protocolPluginList = protocolPluginList;
    }

    /**
     * Sets the value of field 'rescanFrequency'. The field
     * 'rescanFrequency' has the following description: Interval
     * (in milliseconds) between IP address
     *  re-scans.
     * 
     * @param rescanFrequency the value of field 'rescanFrequency'.
     */
    public void setRescanFrequency(
            final long rescanFrequency) {
        this._rescanFrequency = rescanFrequency;
        this._has_rescanFrequency = true;
    }

    /**
     * Sets the value of field 'smbConfig'. The field 'smbConfig'
     * has the following description: SMB protocol configuration
     * (primarily for SMB
     *  authentication).
     * 
     * @param smbConfig the value of field 'smbConfig'.
     */
    public void setSmbConfig(
            final org.opennms.netmgt.config.capsd.SmbConfig smbConfig) {
        this._smbConfig = smbConfig;
    }

    /**
     * Sets the value of field 'xmlrpc'. The field 'xmlrpc' has the
     * following description: Flag which indicates if an external
     * XMLRPC server has
     *  to be notified with any event process errors.
     * 
     * @param xmlrpc the value of field 'xmlrpc'.
     */
    public void setXmlrpc(
            final java.lang.String xmlrpc) {
        this._xmlrpc = xmlrpc;
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
     * org.opennms.netmgt.config.capsd.CapsdConfiguration
     */
    public static org.opennms.netmgt.config.capsd.CapsdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.capsd.CapsdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.capsd.CapsdConfiguration.class, reader);
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

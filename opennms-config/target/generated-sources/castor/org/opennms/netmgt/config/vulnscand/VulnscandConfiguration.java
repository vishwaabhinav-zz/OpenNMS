/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.vulnscand;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the vulscand-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class VulnscandConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _rescanFrequency.
     */
    private long _rescanFrequency;

    /**
     * keeps track of state for field: _rescanFrequency
     */
    private boolean _has_rescanFrequency;

    /**
     * Field _initialSleepTime.
     */
    private long _initialSleepTime;

    /**
     * keeps track of state for field: _initialSleepTime
     */
    private boolean _has_initialSleepTime;

    /**
     * Field _maxSuspectThreadPoolSize.
     */
    private int _maxSuspectThreadPoolSize;

    /**
     * keeps track of state for field: _maxSuspectThreadPoolSize
     */
    private boolean _has_maxSuspectThreadPoolSize;

    /**
     * Field _maxRescanThreadPoolSize.
     */
    private int _maxRescanThreadPoolSize;

    /**
     * keeps track of state for field: _maxRescanThreadPoolSize
     */
    private boolean _has_maxRescanThreadPoolSize;

    /**
     * Field _serverAddress.
     */
    private java.lang.String _serverAddress;

    /**
     * Field _serverPort.
     */
    private int _serverPort;

    /**
     * keeps track of state for field: _serverPort
     */
    private boolean _has_serverPort;

    /**
     * Field _serverUsername.
     */
    private java.lang.String _serverUsername;

    /**
     * Field _serverPassword.
     */
    private java.lang.String _serverPassword;

    /**
     * Field _status.
     */
    private boolean _status;

    /**
     * keeps track of state for field: _status
     */
    private boolean _has_status;

    /**
     * Settings that apply to all managed
     *  interfaces
     */
    private org.opennms.netmgt.config.vulnscand.ManagedInterfaces _managedInterfaces;

    /**
     * Field _scanLevelList.
     */
    private java.util.List<org.opennms.netmgt.config.vulnscand.ScanLevel> _scanLevelList;

    /**
     * Excludes that override all includes (managed interfaces
     *  or scan levels)
     */
    private org.opennms.netmgt.config.vulnscand.Excludes _excludes;


      //----------------/
     //- Constructors -/
    //----------------/

    public VulnscandConfiguration() {
        super();
        this._scanLevelList = new java.util.ArrayList<org.opennms.netmgt.config.vulnscand.ScanLevel>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vScanLevel
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addScanLevel(
            final org.opennms.netmgt.config.vulnscand.ScanLevel vScanLevel)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._scanLevelList.size() >= 4) {
            throw new IndexOutOfBoundsException("addScanLevel has a maximum of 4");
        }
        
        this._scanLevelList.add(vScanLevel);
    }

    /**
     * 
     * 
     * @param index
     * @param vScanLevel
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addScanLevel(
            final int index,
            final org.opennms.netmgt.config.vulnscand.ScanLevel vScanLevel)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._scanLevelList.size() >= 4) {
            throw new IndexOutOfBoundsException("addScanLevel has a maximum of 4");
        }
        
        this._scanLevelList.add(index, vScanLevel);
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
     */
    public void deleteServerPort(
    ) {
        this._has_serverPort= false;
    }

    /**
     */
    public void deleteStatus(
    ) {
        this._has_status= false;
    }

    /**
     * Method enumerateScanLevel.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.vulnscand.ScanLevel> enumerateScanLevel(
    ) {
        return java.util.Collections.enumeration(this._scanLevelList);
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
        
        if (obj instanceof VulnscandConfiguration) {
        
            VulnscandConfiguration temp = (VulnscandConfiguration)obj;
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
            if (this._serverAddress != null) {
                if (temp._serverAddress == null) return false;
                else if (!(this._serverAddress.equals(temp._serverAddress))) 
                    return false;
            }
            else if (temp._serverAddress != null)
                return false;
            if (this._serverPort != temp._serverPort)
                return false;
            if (this._has_serverPort != temp._has_serverPort)
                return false;
            if (this._serverUsername != null) {
                if (temp._serverUsername == null) return false;
                else if (!(this._serverUsername.equals(temp._serverUsername))) 
                    return false;
            }
            else if (temp._serverUsername != null)
                return false;
            if (this._serverPassword != null) {
                if (temp._serverPassword == null) return false;
                else if (!(this._serverPassword.equals(temp._serverPassword))) 
                    return false;
            }
            else if (temp._serverPassword != null)
                return false;
            if (this._status != temp._status)
                return false;
            if (this._has_status != temp._has_status)
                return false;
            if (this._managedInterfaces != null) {
                if (temp._managedInterfaces == null) return false;
                else if (!(this._managedInterfaces.equals(temp._managedInterfaces))) 
                    return false;
            }
            else if (temp._managedInterfaces != null)
                return false;
            if (this._scanLevelList != null) {
                if (temp._scanLevelList == null) return false;
                else if (!(this._scanLevelList.equals(temp._scanLevelList))) 
                    return false;
            }
            else if (temp._scanLevelList != null)
                return false;
            if (this._excludes != null) {
                if (temp._excludes == null) return false;
                else if (!(this._excludes.equals(temp._excludes))) 
                    return false;
            }
            else if (temp._excludes != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'excludes'. The field 'excludes'
     * has the following description: Excludes that override all
     * includes (managed interfaces
     *  or scan levels)
     * 
     * @return the value of field 'Excludes'.
     */
    public org.opennms.netmgt.config.vulnscand.Excludes getExcludes(
    ) {
        return this._excludes;
    }

    /**
     * Returns the value of field 'initialSleepTime'.
     * 
     * @return the value of field 'InitialSleepTime'.
     */
    public long getInitialSleepTime(
    ) {
        return this._initialSleepTime;
    }

    /**
     * Returns the value of field 'managedInterfaces'. The field
     * 'managedInterfaces' has the following description: Settings
     * that apply to all managed
     *  interfaces
     * 
     * @return the value of field 'ManagedInterfaces'.
     */
    public org.opennms.netmgt.config.vulnscand.ManagedInterfaces getManagedInterfaces(
    ) {
        return this._managedInterfaces;
    }

    /**
     * Returns the value of field 'maxRescanThreadPoolSize'.
     * 
     * @return the value of field 'MaxRescanThreadPoolSize'.
     */
    public int getMaxRescanThreadPoolSize(
    ) {
        return this._maxRescanThreadPoolSize;
    }

    /**
     * Returns the value of field 'maxSuspectThreadPoolSize'.
     * 
     * @return the value of field 'MaxSuspectThreadPoolSize'.
     */
    public int getMaxSuspectThreadPoolSize(
    ) {
        return this._maxSuspectThreadPoolSize;
    }

    /**
     * Returns the value of field 'rescanFrequency'.
     * 
     * @return the value of field 'RescanFrequency'.
     */
    public long getRescanFrequency(
    ) {
        return this._rescanFrequency;
    }

    /**
     * Method getScanLevel.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.vulnscand.ScanLevel at the given
     * index
     */
    public org.opennms.netmgt.config.vulnscand.ScanLevel getScanLevel(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._scanLevelList.size()) {
            throw new IndexOutOfBoundsException("getScanLevel: Index value '" + index + "' not in range [0.." + (this._scanLevelList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.vulnscand.ScanLevel) _scanLevelList.get(index);
    }

    /**
     * Method getScanLevel.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.vulnscand.ScanLevel[] getScanLevel(
    ) {
        org.opennms.netmgt.config.vulnscand.ScanLevel[] array = new org.opennms.netmgt.config.vulnscand.ScanLevel[0];
        return (org.opennms.netmgt.config.vulnscand.ScanLevel[]) this._scanLevelList.toArray(array);
    }

    /**
     * Method getScanLevelCollection.Returns a reference to
     * '_scanLevelList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.vulnscand.ScanLevel> getScanLevelCollection(
    ) {
        return this._scanLevelList;
    }

    /**
     * Method getScanLevelCount.
     * 
     * @return the size of this collection
     */
    public int getScanLevelCount(
    ) {
        return this._scanLevelList.size();
    }

    /**
     * Returns the value of field 'serverAddress'.
     * 
     * @return the value of field 'ServerAddress'.
     */
    public java.lang.String getServerAddress(
    ) {
        return this._serverAddress;
    }

    /**
     * Returns the value of field 'serverPassword'.
     * 
     * @return the value of field 'ServerPassword'.
     */
    public java.lang.String getServerPassword(
    ) {
        return this._serverPassword;
    }

    /**
     * Returns the value of field 'serverPort'.
     * 
     * @return the value of field 'ServerPort'.
     */
    public int getServerPort(
    ) {
        return this._serverPort;
    }

    /**
     * Returns the value of field 'serverUsername'.
     * 
     * @return the value of field 'ServerUsername'.
     */
    public java.lang.String getServerUsername(
    ) {
        return this._serverUsername;
    }

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'Status'.
     */
    public boolean getStatus(
    ) {
        return this._status;
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
     * Method hasServerPort.
     * 
     * @return true if at least one ServerPort has been added
     */
    public boolean hasServerPort(
    ) {
        return this._has_serverPort;
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
        result = 37 * result + (int)(_rescanFrequency^(_rescanFrequency>>>32));
        result = 37 * result + (int)(_initialSleepTime^(_initialSleepTime>>>32));
        result = 37 * result + _maxSuspectThreadPoolSize;
        result = 37 * result + _maxRescanThreadPoolSize;
        if (_serverAddress != null) {
           result = 37 * result + _serverAddress.hashCode();
        }
        result = 37 * result + _serverPort;
        if (_serverUsername != null) {
           result = 37 * result + _serverUsername.hashCode();
        }
        if (_serverPassword != null) {
           result = 37 * result + _serverPassword.hashCode();
        }
        result = 37 * result + (_status?0:1);
        if (_managedInterfaces != null) {
           result = 37 * result + _managedInterfaces.hashCode();
        }
        if (_scanLevelList != null) {
           result = 37 * result + _scanLevelList.hashCode();
        }
        if (_excludes != null) {
           result = 37 * result + _excludes.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'Status'.
     */
    public boolean isStatus(
    ) {
        return this._status;
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
     * Method iterateScanLevel.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.vulnscand.ScanLevel> iterateScanLevel(
    ) {
        return this._scanLevelList.iterator();
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
    public void removeAllScanLevel(
    ) {
        this._scanLevelList.clear();
    }

    /**
     * Method removeScanLevel.
     * 
     * @param vScanLevel
     * @return true if the object was removed from the collection.
     */
    public boolean removeScanLevel(
            final org.opennms.netmgt.config.vulnscand.ScanLevel vScanLevel) {
        boolean removed = _scanLevelList.remove(vScanLevel);
        return removed;
    }

    /**
     * Method removeScanLevelAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.vulnscand.ScanLevel removeScanLevelAt(
            final int index) {
        java.lang.Object obj = this._scanLevelList.remove(index);
        return (org.opennms.netmgt.config.vulnscand.ScanLevel) obj;
    }

    /**
     * Sets the value of field 'excludes'. The field 'excludes' has
     * the following description: Excludes that override all
     * includes (managed interfaces
     *  or scan levels)
     * 
     * @param excludes the value of field 'excludes'.
     */
    public void setExcludes(
            final org.opennms.netmgt.config.vulnscand.Excludes excludes) {
        this._excludes = excludes;
    }

    /**
     * Sets the value of field 'initialSleepTime'.
     * 
     * @param initialSleepTime the value of field 'initialSleepTime'
     */
    public void setInitialSleepTime(
            final long initialSleepTime) {
        this._initialSleepTime = initialSleepTime;
        this._has_initialSleepTime = true;
    }

    /**
     * Sets the value of field 'managedInterfaces'. The field
     * 'managedInterfaces' has the following description: Settings
     * that apply to all managed
     *  interfaces
     * 
     * @param managedInterfaces the value of field
     * 'managedInterfaces'.
     */
    public void setManagedInterfaces(
            final org.opennms.netmgt.config.vulnscand.ManagedInterfaces managedInterfaces) {
        this._managedInterfaces = managedInterfaces;
    }

    /**
     * Sets the value of field 'maxRescanThreadPoolSize'.
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
     * Sets the value of field 'maxSuspectThreadPoolSize'.
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
     * Sets the value of field 'rescanFrequency'.
     * 
     * @param rescanFrequency the value of field 'rescanFrequency'.
     */
    public void setRescanFrequency(
            final long rescanFrequency) {
        this._rescanFrequency = rescanFrequency;
        this._has_rescanFrequency = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vScanLevel
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setScanLevel(
            final int index,
            final org.opennms.netmgt.config.vulnscand.ScanLevel vScanLevel)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._scanLevelList.size()) {
            throw new IndexOutOfBoundsException("setScanLevel: Index value '" + index + "' not in range [0.." + (this._scanLevelList.size() - 1) + "]");
        }
        
        this._scanLevelList.set(index, vScanLevel);
    }

    /**
     * 
     * 
     * @param vScanLevelArray
     */
    public void setScanLevel(
            final org.opennms.netmgt.config.vulnscand.ScanLevel[] vScanLevelArray) {
        //-- copy array
        _scanLevelList.clear();
        
        for (int i = 0; i < vScanLevelArray.length; i++) {
                this._scanLevelList.add(vScanLevelArray[i]);
        }
    }

    /**
     * Sets the value of '_scanLevelList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vScanLevelList the Vector to copy.
     */
    public void setScanLevel(
            final java.util.List<org.opennms.netmgt.config.vulnscand.ScanLevel> vScanLevelList) {
        // copy vector
        this._scanLevelList.clear();
        
        this._scanLevelList.addAll(vScanLevelList);
    }

    /**
     * Sets the value of '_scanLevelList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param scanLevelList the Vector to set.
     */
    public void setScanLevelCollection(
            final java.util.List<org.opennms.netmgt.config.vulnscand.ScanLevel> scanLevelList) {
        this._scanLevelList = scanLevelList;
    }

    /**
     * Sets the value of field 'serverAddress'.
     * 
     * @param serverAddress the value of field 'serverAddress'.
     */
    public void setServerAddress(
            final java.lang.String serverAddress) {
        this._serverAddress = serverAddress;
    }

    /**
     * Sets the value of field 'serverPassword'.
     * 
     * @param serverPassword the value of field 'serverPassword'.
     */
    public void setServerPassword(
            final java.lang.String serverPassword) {
        this._serverPassword = serverPassword;
    }

    /**
     * Sets the value of field 'serverPort'.
     * 
     * @param serverPort the value of field 'serverPort'.
     */
    public void setServerPort(
            final int serverPort) {
        this._serverPort = serverPort;
        this._has_serverPort = true;
    }

    /**
     * Sets the value of field 'serverUsername'.
     * 
     * @param serverUsername the value of field 'serverUsername'.
     */
    public void setServerUsername(
            final java.lang.String serverUsername) {
        this._serverUsername = serverUsername;
    }

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final boolean status) {
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
     * org.opennms.netmgt.config.vulnscand.VulnscandConfiguration
     */
    public static org.opennms.netmgt.config.vulnscand.VulnscandConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vulnscand.VulnscandConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.vulnscand.VulnscandConfiguration.class, reader);
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

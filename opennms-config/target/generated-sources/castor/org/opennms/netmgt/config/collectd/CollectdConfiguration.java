/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.collectd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the collectd-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class CollectdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The maximum number of threads used for data
     *  collection.
     */
    private int _threads;

    /**
     * keeps track of state for field: _threads
     */
    private boolean _has_threads;

    /**
     * Package encapsulating addresses eligible to have
     *  SNMP data collected from them.
     */
    private java.util.List<org.opennms.netmgt.config.collectd.Package> _packageList;

    /**
     * Service collectors
     */
    private java.util.List<org.opennms.netmgt.config.collectd.Collector> _collectorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CollectdConfiguration() {
        super();
        this._packageList = new java.util.ArrayList<org.opennms.netmgt.config.collectd.Package>();
        this._collectorList = new java.util.ArrayList<org.opennms.netmgt.config.collectd.Collector>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCollector
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCollector(
            final org.opennms.netmgt.config.collectd.Collector vCollector)
    throws java.lang.IndexOutOfBoundsException {
        this._collectorList.add(vCollector);
    }

    /**
     * 
     * 
     * @param index
     * @param vCollector
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCollector(
            final int index,
            final org.opennms.netmgt.config.collectd.Collector vCollector)
    throws java.lang.IndexOutOfBoundsException {
        this._collectorList.add(index, vCollector);
    }

    /**
     * 
     * 
     * @param vPackage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPackage(
            final org.opennms.netmgt.config.collectd.Package vPackage)
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
            final org.opennms.netmgt.config.collectd.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.add(index, vPackage);
    }

    /**
     */
    public void deleteThreads(
    ) {
        this._has_threads= false;
    }

    /**
     * Method enumerateCollector.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.collectd.Collector> enumerateCollector(
    ) {
        return java.util.Collections.enumeration(this._collectorList);
    }

    /**
     * Method enumeratePackage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.collectd.Package> enumeratePackage(
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
        
        if (obj instanceof CollectdConfiguration) {
        
            CollectdConfiguration temp = (CollectdConfiguration)obj;
            if (this._threads != temp._threads)
                return false;
            if (this._has_threads != temp._has_threads)
                return false;
            if (this._packageList != null) {
                if (temp._packageList == null) return false;
                else if (!(this._packageList.equals(temp._packageList))) 
                    return false;
            }
            else if (temp._packageList != null)
                return false;
            if (this._collectorList != null) {
                if (temp._collectorList == null) return false;
                else if (!(this._collectorList.equals(temp._collectorList))) 
                    return false;
            }
            else if (temp._collectorList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getCollector.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.collectd.Collector at the given
     * index
     */
    public org.opennms.netmgt.config.collectd.Collector getCollector(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._collectorList.size()) {
            throw new IndexOutOfBoundsException("getCollector: Index value '" + index + "' not in range [0.." + (this._collectorList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.collectd.Collector) _collectorList.get(index);
    }

    /**
     * Method getCollector.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.collectd.Collector[] getCollector(
    ) {
        org.opennms.netmgt.config.collectd.Collector[] array = new org.opennms.netmgt.config.collectd.Collector[0];
        return (org.opennms.netmgt.config.collectd.Collector[]) this._collectorList.toArray(array);
    }

    /**
     * Method getCollectorCollection.Returns a reference to
     * '_collectorList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.collectd.Collector> getCollectorCollection(
    ) {
        return this._collectorList;
    }

    /**
     * Method getCollectorCount.
     * 
     * @return the size of this collection
     */
    public int getCollectorCount(
    ) {
        return this._collectorList.size();
    }

    /**
     * Method getPackage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.collectd.Package at the given index
     */
    public org.opennms.netmgt.config.collectd.Package getPackage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("getPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.collectd.Package) _packageList.get(index);
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
    public org.opennms.netmgt.config.collectd.Package[] getPackage(
    ) {
        org.opennms.netmgt.config.collectd.Package[] array = new org.opennms.netmgt.config.collectd.Package[0];
        return (org.opennms.netmgt.config.collectd.Package[]) this._packageList.toArray(array);
    }

    /**
     * Method getPackageCollection.Returns a reference to
     * '_packageList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.collectd.Package> getPackageCollection(
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
     * Returns the value of field 'threads'. The field 'threads'
     * has the following description: The maximum number of threads
     * used for data
     *  collection.
     * 
     * @return the value of field 'Threads'.
     */
    public int getThreads(
    ) {
        return this._threads;
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
        if (_packageList != null) {
           result = 37 * result + _packageList.hashCode();
        }
        if (_collectorList != null) {
           result = 37 * result + _collectorList.hashCode();
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
     * Method iterateCollector.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.collectd.Collector> iterateCollector(
    ) {
        return this._collectorList.iterator();
    }

    /**
     * Method iteratePackage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.collectd.Package> iteratePackage(
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
    public void removeAllCollector(
    ) {
        this._collectorList.clear();
    }

    /**
     */
    public void removeAllPackage(
    ) {
        this._packageList.clear();
    }

    /**
     * Method removeCollector.
     * 
     * @param vCollector
     * @return true if the object was removed from the collection.
     */
    public boolean removeCollector(
            final org.opennms.netmgt.config.collectd.Collector vCollector) {
        boolean removed = _collectorList.remove(vCollector);
        return removed;
    }

    /**
     * Method removeCollectorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.collectd.Collector removeCollectorAt(
            final int index) {
        java.lang.Object obj = this._collectorList.remove(index);
        return (org.opennms.netmgt.config.collectd.Collector) obj;
    }

    /**
     * Method removePackage.
     * 
     * @param vPackage
     * @return true if the object was removed from the collection.
     */
    public boolean removePackage(
            final org.opennms.netmgt.config.collectd.Package vPackage) {
        boolean removed = _packageList.remove(vPackage);
        return removed;
    }

    /**
     * Method removePackageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.collectd.Package removePackageAt(
            final int index) {
        java.lang.Object obj = this._packageList.remove(index);
        return (org.opennms.netmgt.config.collectd.Package) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCollector
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCollector(
            final int index,
            final org.opennms.netmgt.config.collectd.Collector vCollector)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._collectorList.size()) {
            throw new IndexOutOfBoundsException("setCollector: Index value '" + index + "' not in range [0.." + (this._collectorList.size() - 1) + "]");
        }
        
        this._collectorList.set(index, vCollector);
    }

    /**
     * 
     * 
     * @param vCollectorArray
     */
    public void setCollector(
            final org.opennms.netmgt.config.collectd.Collector[] vCollectorArray) {
        //-- copy array
        _collectorList.clear();
        
        for (int i = 0; i < vCollectorArray.length; i++) {
                this._collectorList.add(vCollectorArray[i]);
        }
    }

    /**
     * Sets the value of '_collectorList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCollectorList the Vector to copy.
     */
    public void setCollector(
            final java.util.List<org.opennms.netmgt.config.collectd.Collector> vCollectorList) {
        // copy vector
        this._collectorList.clear();
        
        this._collectorList.addAll(vCollectorList);
    }

    /**
     * Sets the value of '_collectorList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param collectorList the Vector to set.
     */
    public void setCollectorCollection(
            final java.util.List<org.opennms.netmgt.config.collectd.Collector> collectorList) {
        this._collectorList = collectorList;
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
            final org.opennms.netmgt.config.collectd.Package vPackage)
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
            final org.opennms.netmgt.config.collectd.Package[] vPackageArray) {
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
            final java.util.List<org.opennms.netmgt.config.collectd.Package> vPackageList) {
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
            final java.util.List<org.opennms.netmgt.config.collectd.Package> _packageList) {
        this._packageList = _packageList;
    }

    /**
     * Sets the value of field 'threads'. The field 'threads' has
     * the following description: The maximum number of threads
     * used for data
     *  collection.
     * 
     * @param threads the value of field 'threads'.
     */
    public void setThreads(
            final int threads) {
        this._threads = threads;
        this._has_threads = true;
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
     * org.opennms.netmgt.config.collectd.CollectdConfiguration
     */
    public static org.opennms.netmgt.config.collectd.CollectdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.collectd.CollectdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.collectd.CollectdConfiguration.class, reader);
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

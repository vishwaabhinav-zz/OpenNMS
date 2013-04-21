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
 * Class Vendor.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Vendor implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Vendor identifier.
     */
    private java.lang.String _vendor_name;

    /**
     * Vendor sysoid root identifier.
     *  
     */
    private java.lang.String _sysoidRootMask;

    /**
     * Java Class Name to get Vlans Info on matching
     *  Sysoids.
     *  
     */
    private java.lang.String _className;

    /**
     * Specific sysoid submask node to be polled to
     *  get vlan.
     *  
     */
    private java.util.List<java.lang.String> _specificList;

    /**
     * Range of sysoids submask nodes to be polled
     *  to get vlan
     *  
     */
    private java.util.List<org.opennms.netmgt.config.linkd.IncludeRange> _includeRangeList;

    /**
     * Range of sysoid submask nodes to be excluded
     *  from the polling to get vlan
     *  
     */
    private java.util.List<org.opennms.netmgt.config.linkd.ExcludeRange> _excludeRangeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Vendor() {
        super();
        this._specificList = new java.util.ArrayList<java.lang.String>();
        this._includeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.linkd.IncludeRange>();
        this._excludeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.linkd.ExcludeRange>();
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
        
        if (obj instanceof Vendor) {
        
            Vendor temp = (Vendor)obj;
            if (this._vendor_name != null) {
                if (temp._vendor_name == null) return false;
                else if (!(this._vendor_name.equals(temp._vendor_name))) 
                    return false;
            }
            else if (temp._vendor_name != null)
                return false;
            if (this._sysoidRootMask != null) {
                if (temp._sysoidRootMask == null) return false;
                else if (!(this._sysoidRootMask.equals(temp._sysoidRootMask))) 
                    return false;
            }
            else if (temp._sysoidRootMask != null)
                return false;
            if (this._className != null) {
                if (temp._className == null) return false;
                else if (!(this._className.equals(temp._className))) 
                    return false;
            }
            else if (temp._className != null)
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
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'className'. The field
     * 'className' has the following description: Java Class Name
     * to get Vlans Info on matching
     *  Sysoids.
     *  
     * 
     * @return the value of field 'ClassName'.
     */
    public java.lang.String getClassName(
    ) {
        return this._className;
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
     * Returns the value of field 'sysoidRootMask'. The field
     * 'sysoidRootMask' has the following description: Vendor
     * sysoid root identifier.
     *  
     * 
     * @return the value of field 'SysoidRootMask'.
     */
    public java.lang.String getSysoidRootMask(
    ) {
        return this._sysoidRootMask;
    }

    /**
     * Returns the value of field 'vendor_name'. The field
     * 'vendor_name' has the following description: Vendor
     * identifier.
     * 
     * @return the value of field 'Vendor_name'.
     */
    public java.lang.String getVendor_name(
    ) {
        return this._vendor_name;
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
        if (_vendor_name != null) {
           result = 37 * result + _vendor_name.hashCode();
        }
        if (_sysoidRootMask != null) {
           result = 37 * result + _sysoidRootMask.hashCode();
        }
        if (_className != null) {
           result = 37 * result + _className.hashCode();
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
     * Sets the value of field 'className'. The field 'className'
     * has the following description: Java Class Name to get Vlans
     * Info on matching
     *  Sysoids.
     *  
     * 
     * @param className the value of field 'className'.
     */
    public void setClassName(
            final java.lang.String className) {
        this._className = className;
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
     * Sets the value of field 'sysoidRootMask'. The field
     * 'sysoidRootMask' has the following description: Vendor
     * sysoid root identifier.
     *  
     * 
     * @param sysoidRootMask the value of field 'sysoidRootMask'.
     */
    public void setSysoidRootMask(
            final java.lang.String sysoidRootMask) {
        this._sysoidRootMask = sysoidRootMask;
    }

    /**
     * Sets the value of field 'vendor_name'. The field
     * 'vendor_name' has the following description: Vendor
     * identifier.
     * 
     * @param vendor_name the value of field 'vendor_name'.
     */
    public void setVendor_name(
            final java.lang.String vendor_name) {
        this._vendor_name = vendor_name;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.linkd.Vendo
     */
    public static org.opennms.netmgt.config.linkd.Vendor unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.linkd.Vendor) Unmarshaller.unmarshal(org.opennms.netmgt.config.linkd.Vendor.class, reader);
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

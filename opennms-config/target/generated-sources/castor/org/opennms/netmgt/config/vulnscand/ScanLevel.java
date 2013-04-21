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
 * Class ScanLevel.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ScanLevel implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _level.
     */
    private int _level;

    /**
     * keeps track of state for field: _level
     */
    private boolean _has_level;

    /**
     * Field _safeChecks.
     */
    private boolean _safeChecks;

    /**
     * keeps track of state for field: _safeChecks
     */
    private boolean _has_safeChecks;

    /**
     * Field _pluginList.
     */
    private java.lang.String _pluginList;

    /**
     * Field _specificList.
     */
    private java.util.List<java.lang.String> _specificList;

    /**
     * Field _rangeList.
     */
    private java.util.List<org.opennms.netmgt.config.vulnscand.Range> _rangeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ScanLevel() {
        super();
        this._specificList = new java.util.ArrayList<java.lang.String>();
        this._rangeList = new java.util.ArrayList<org.opennms.netmgt.config.vulnscand.Range>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRange(
            final org.opennms.netmgt.config.vulnscand.Range vRange)
    throws java.lang.IndexOutOfBoundsException {
        this._rangeList.add(vRange);
    }

    /**
     * 
     * 
     * @param index
     * @param vRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRange(
            final int index,
            final org.opennms.netmgt.config.vulnscand.Range vRange)
    throws java.lang.IndexOutOfBoundsException {
        this._rangeList.add(index, vRange);
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
    public void deleteLevel(
    ) {
        this._has_level= false;
    }

    /**
     */
    public void deleteSafeChecks(
    ) {
        this._has_safeChecks= false;
    }

    /**
     * Method enumerateRange.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.vulnscand.Range> enumerateRange(
    ) {
        return java.util.Collections.enumeration(this._rangeList);
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
        
        if (obj instanceof ScanLevel) {
        
            ScanLevel temp = (ScanLevel)obj;
            if (this._level != temp._level)
                return false;
            if (this._has_level != temp._has_level)
                return false;
            if (this._safeChecks != temp._safeChecks)
                return false;
            if (this._has_safeChecks != temp._has_safeChecks)
                return false;
            if (this._pluginList != null) {
                if (temp._pluginList == null) return false;
                else if (!(this._pluginList.equals(temp._pluginList))) 
                    return false;
            }
            else if (temp._pluginList != null)
                return false;
            if (this._specificList != null) {
                if (temp._specificList == null) return false;
                else if (!(this._specificList.equals(temp._specificList))) 
                    return false;
            }
            else if (temp._specificList != null)
                return false;
            if (this._rangeList != null) {
                if (temp._rangeList == null) return false;
                else if (!(this._rangeList.equals(temp._rangeList))) 
                    return false;
            }
            else if (temp._rangeList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'level'.
     * 
     * @return the value of field 'Level'.
     */
    public int getLevel(
    ) {
        return this._level;
    }

    /**
     * Returns the value of field 'pluginList'.
     * 
     * @return the value of field 'PluginList'.
     */
    public java.lang.String getPluginList(
    ) {
        return this._pluginList;
    }

    /**
     * Method getRange.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.vulnscand.Range at the given index
     */
    public org.opennms.netmgt.config.vulnscand.Range getRange(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rangeList.size()) {
            throw new IndexOutOfBoundsException("getRange: Index value '" + index + "' not in range [0.." + (this._rangeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.vulnscand.Range) _rangeList.get(index);
    }

    /**
     * Method getRange.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.vulnscand.Range[] getRange(
    ) {
        org.opennms.netmgt.config.vulnscand.Range[] array = new org.opennms.netmgt.config.vulnscand.Range[0];
        return (org.opennms.netmgt.config.vulnscand.Range[]) this._rangeList.toArray(array);
    }

    /**
     * Method getRangeCollection.Returns a reference to
     * '_rangeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.vulnscand.Range> getRangeCollection(
    ) {
        return this._rangeList;
    }

    /**
     * Method getRangeCount.
     * 
     * @return the size of this collection
     */
    public int getRangeCount(
    ) {
        return this._rangeList.size();
    }

    /**
     * Returns the value of field 'safeChecks'.
     * 
     * @return the value of field 'SafeChecks'.
     */
    public boolean getSafeChecks(
    ) {
        return this._safeChecks;
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
     * Method hasLevel.
     * 
     * @return true if at least one Level has been added
     */
    public boolean hasLevel(
    ) {
        return this._has_level;
    }

    /**
     * Method hasSafeChecks.
     * 
     * @return true if at least one SafeChecks has been added
     */
    public boolean hasSafeChecks(
    ) {
        return this._has_safeChecks;
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
        result = 37 * result + _level;
        result = 37 * result + (_safeChecks?0:1);
        if (_pluginList != null) {
           result = 37 * result + _pluginList.hashCode();
        }
        if (_specificList != null) {
           result = 37 * result + _specificList.hashCode();
        }
        if (_rangeList != null) {
           result = 37 * result + _rangeList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'safeChecks'.
     * 
     * @return the value of field 'SafeChecks'.
     */
    public boolean isSafeChecks(
    ) {
        return this._safeChecks;
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
     * Method iterateRange.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.vulnscand.Range> iterateRange(
    ) {
        return this._rangeList.iterator();
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
    public void removeAllRange(
    ) {
        this._rangeList.clear();
    }

    /**
     */
    public void removeAllSpecific(
    ) {
        this._specificList.clear();
    }

    /**
     * Method removeRange.
     * 
     * @param vRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeRange(
            final org.opennms.netmgt.config.vulnscand.Range vRange) {
        boolean removed = _rangeList.remove(vRange);
        return removed;
    }

    /**
     * Method removeRangeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.vulnscand.Range removeRangeAt(
            final int index) {
        java.lang.Object obj = this._rangeList.remove(index);
        return (org.opennms.netmgt.config.vulnscand.Range) obj;
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
     * Sets the value of field 'level'.
     * 
     * @param level the value of field 'level'.
     */
    public void setLevel(
            final int level) {
        this._level = level;
        this._has_level = true;
    }

    /**
     * Sets the value of field 'pluginList'.
     * 
     * @param pluginList the value of field 'pluginList'.
     */
    public void setPluginList(
            final java.lang.String pluginList) {
        this._pluginList = pluginList;
    }

    /**
     * 
     * 
     * @param index
     * @param vRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRange(
            final int index,
            final org.opennms.netmgt.config.vulnscand.Range vRange)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rangeList.size()) {
            throw new IndexOutOfBoundsException("setRange: Index value '" + index + "' not in range [0.." + (this._rangeList.size() - 1) + "]");
        }
        
        this._rangeList.set(index, vRange);
    }

    /**
     * 
     * 
     * @param vRangeArray
     */
    public void setRange(
            final org.opennms.netmgt.config.vulnscand.Range[] vRangeArray) {
        //-- copy array
        _rangeList.clear();
        
        for (int i = 0; i < vRangeArray.length; i++) {
                this._rangeList.add(vRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_rangeList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vRangeList the Vector to copy.
     */
    public void setRange(
            final java.util.List<org.opennms.netmgt.config.vulnscand.Range> vRangeList) {
        // copy vector
        this._rangeList.clear();
        
        this._rangeList.addAll(vRangeList);
    }

    /**
     * Sets the value of '_rangeList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param rangeList the Vector to set.
     */
    public void setRangeCollection(
            final java.util.List<org.opennms.netmgt.config.vulnscand.Range> rangeList) {
        this._rangeList = rangeList;
    }

    /**
     * Sets the value of field 'safeChecks'.
     * 
     * @param safeChecks the value of field 'safeChecks'.
     */
    public void setSafeChecks(
            final boolean safeChecks) {
        this._safeChecks = safeChecks;
        this._has_safeChecks = true;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.opennms.netmgt.config.vulnscand.ScanLevel
     */
    public static org.opennms.netmgt.config.vulnscand.ScanLevel unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vulnscand.ScanLevel) Unmarshaller.unmarshal(org.opennms.netmgt.config.vulnscand.ScanLevel.class, reader);
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

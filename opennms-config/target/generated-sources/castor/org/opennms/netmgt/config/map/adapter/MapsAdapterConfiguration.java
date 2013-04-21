/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.map.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the mapsadapter-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class MapsAdapterConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Element dimension in pixel.
     */
    private int _elementDimension;

    /**
     * keeps track of state for field: _elementDimension
     */
    private boolean _has_elementDimension;

    /**
     * Package encapsulating addresses, services to be
     *  polled for these addresses, etc..
     */
    private java.util.List<org.opennms.netmgt.config.map.adapter.Package> _packageList;

    /**
     * Configuration of maps
     *  functionality
     */
    private org.opennms.netmgt.config.map.adapter.Cmaps _cmaps;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapsAdapterConfiguration() {
        super();
        this._packageList = new java.util.ArrayList<org.opennms.netmgt.config.map.adapter.Package>();
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
            final org.opennms.netmgt.config.map.adapter.Package vPackage)
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
            final org.opennms.netmgt.config.map.adapter.Package vPackage)
    throws java.lang.IndexOutOfBoundsException {
        this._packageList.add(index, vPackage);
    }

    /**
     */
    public void deleteElementDimension(
    ) {
        this._has_elementDimension= false;
    }

    /**
     * Method enumeratePackage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.map.adapter.Package> enumeratePackage(
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
        
        if (obj instanceof MapsAdapterConfiguration) {
        
            MapsAdapterConfiguration temp = (MapsAdapterConfiguration)obj;
            if (this._elementDimension != temp._elementDimension)
                return false;
            if (this._has_elementDimension != temp._has_elementDimension)
                return false;
            if (this._packageList != null) {
                if (temp._packageList == null) return false;
                else if (!(this._packageList.equals(temp._packageList))) 
                    return false;
            }
            else if (temp._packageList != null)
                return false;
            if (this._cmaps != null) {
                if (temp._cmaps == null) return false;
                else if (!(this._cmaps.equals(temp._cmaps))) 
                    return false;
            }
            else if (temp._cmaps != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'cmaps'. The field 'cmaps' has
     * the following description: Configuration of maps
     *  functionality
     * 
     * @return the value of field 'Cmaps'.
     */
    public org.opennms.netmgt.config.map.adapter.Cmaps getCmaps(
    ) {
        return this._cmaps;
    }

    /**
     * Returns the value of field 'elementDimension'. The field
     * 'elementDimension' has the following description: The
     * Element dimension in pixel.
     * 
     * @return the value of field 'ElementDimension'.
     */
    public int getElementDimension(
    ) {
        return this._elementDimension;
    }

    /**
     * Method getPackage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.map.adapter.Package at the given
     * index
     */
    public org.opennms.netmgt.config.map.adapter.Package getPackage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._packageList.size()) {
            throw new IndexOutOfBoundsException("getPackage: Index value '" + index + "' not in range [0.." + (this._packageList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.map.adapter.Package) _packageList.get(index);
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
    public org.opennms.netmgt.config.map.adapter.Package[] getPackage(
    ) {
        org.opennms.netmgt.config.map.adapter.Package[] array = new org.opennms.netmgt.config.map.adapter.Package[0];
        return (org.opennms.netmgt.config.map.adapter.Package[]) this._packageList.toArray(array);
    }

    /**
     * Method getPackageCollection.Returns a reference to
     * '_packageList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.map.adapter.Package> getPackageCollection(
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
     * Method hasElementDimension.
     * 
     * @return true if at least one ElementDimension has been added
     */
    public boolean hasElementDimension(
    ) {
        return this._has_elementDimension;
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
        result = 37 * result + _elementDimension;
        if (_packageList != null) {
           result = 37 * result + _packageList.hashCode();
        }
        if (_cmaps != null) {
           result = 37 * result + _cmaps.hashCode();
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
     * Method iteratePackage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.map.adapter.Package> iteratePackage(
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
            final org.opennms.netmgt.config.map.adapter.Package vPackage) {
        boolean removed = _packageList.remove(vPackage);
        return removed;
    }

    /**
     * Method removePackageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.map.adapter.Package removePackageAt(
            final int index) {
        java.lang.Object obj = this._packageList.remove(index);
        return (org.opennms.netmgt.config.map.adapter.Package) obj;
    }

    /**
     * Sets the value of field 'cmaps'. The field 'cmaps' has the
     * following description: Configuration of maps
     *  functionality
     * 
     * @param cmaps the value of field 'cmaps'.
     */
    public void setCmaps(
            final org.opennms.netmgt.config.map.adapter.Cmaps cmaps) {
        this._cmaps = cmaps;
    }

    /**
     * Sets the value of field 'elementDimension'. The field
     * 'elementDimension' has the following description: The
     * Element dimension in pixel.
     * 
     * @param elementDimension the value of field 'elementDimension'
     */
    public void setElementDimension(
            final int elementDimension) {
        this._elementDimension = elementDimension;
        this._has_elementDimension = true;
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
            final org.opennms.netmgt.config.map.adapter.Package vPackage)
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
            final org.opennms.netmgt.config.map.adapter.Package[] vPackageArray) {
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
            final java.util.List<org.opennms.netmgt.config.map.adapter.Package> vPackageList) {
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
            final java.util.List<org.opennms.netmgt.config.map.adapter.Package> _packageList) {
        this._packageList = _packageList;
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
     * org.opennms.netmgt.config.map.adapter.MapsAdapterConfiguratio
     */
    public static org.opennms.netmgt.config.map.adapter.MapsAdapterConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.map.adapter.MapsAdapterConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.map.adapter.MapsAdapterConfiguration.class, reader);
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

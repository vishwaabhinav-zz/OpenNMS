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
 * Class Iproutes.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Iproutes implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Identifies the classes to get ipRouute from
     *  specific vendor devices sysoids.
     *  
     */
    private java.util.List<org.opennms.netmgt.config.linkd.Vendor> _vendorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Iproutes() {
        super();
        this._vendorList = new java.util.ArrayList<org.opennms.netmgt.config.linkd.Vendor>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vVendor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVendor(
            final org.opennms.netmgt.config.linkd.Vendor vVendor)
    throws java.lang.IndexOutOfBoundsException {
        this._vendorList.add(vVendor);
    }

    /**
     * 
     * 
     * @param index
     * @param vVendor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addVendor(
            final int index,
            final org.opennms.netmgt.config.linkd.Vendor vVendor)
    throws java.lang.IndexOutOfBoundsException {
        this._vendorList.add(index, vVendor);
    }

    /**
     * Method enumerateVendor.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.linkd.Vendor> enumerateVendor(
    ) {
        return java.util.Collections.enumeration(this._vendorList);
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
        
        if (obj instanceof Iproutes) {
        
            Iproutes temp = (Iproutes)obj;
            if (this._vendorList != null) {
                if (temp._vendorList == null) return false;
                else if (!(this._vendorList.equals(temp._vendorList))) 
                    return false;
            }
            else if (temp._vendorList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getVendor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.linkd.Vendor at the given index
     */
    public org.opennms.netmgt.config.linkd.Vendor getVendor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._vendorList.size()) {
            throw new IndexOutOfBoundsException("getVendor: Index value '" + index + "' not in range [0.." + (this._vendorList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.linkd.Vendor) _vendorList.get(index);
    }

    /**
     * Method getVendor.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.linkd.Vendor[] getVendor(
    ) {
        org.opennms.netmgt.config.linkd.Vendor[] array = new org.opennms.netmgt.config.linkd.Vendor[0];
        return (org.opennms.netmgt.config.linkd.Vendor[]) this._vendorList.toArray(array);
    }

    /**
     * Method getVendorCollection.Returns a reference to
     * '_vendorList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.linkd.Vendor> getVendorCollection(
    ) {
        return this._vendorList;
    }

    /**
     * Method getVendorCount.
     * 
     * @return the size of this collection
     */
    public int getVendorCount(
    ) {
        return this._vendorList.size();
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
        if (_vendorList != null) {
           result = 37 * result + _vendorList.hashCode();
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
     * Method iterateVendor.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.linkd.Vendor> iterateVendor(
    ) {
        return this._vendorList.iterator();
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
    public void removeAllVendor(
    ) {
        this._vendorList.clear();
    }

    /**
     * Method removeVendor.
     * 
     * @param vVendor
     * @return true if the object was removed from the collection.
     */
    public boolean removeVendor(
            final org.opennms.netmgt.config.linkd.Vendor vVendor) {
        boolean removed = _vendorList.remove(vVendor);
        return removed;
    }

    /**
     * Method removeVendorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.linkd.Vendor removeVendorAt(
            final int index) {
        java.lang.Object obj = this._vendorList.remove(index);
        return (org.opennms.netmgt.config.linkd.Vendor) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vVendor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setVendor(
            final int index,
            final org.opennms.netmgt.config.linkd.Vendor vVendor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._vendorList.size()) {
            throw new IndexOutOfBoundsException("setVendor: Index value '" + index + "' not in range [0.." + (this._vendorList.size() - 1) + "]");
        }
        
        this._vendorList.set(index, vVendor);
    }

    /**
     * 
     * 
     * @param vVendorArray
     */
    public void setVendor(
            final org.opennms.netmgt.config.linkd.Vendor[] vVendorArray) {
        //-- copy array
        _vendorList.clear();
        
        for (int i = 0; i < vVendorArray.length; i++) {
                this._vendorList.add(vVendorArray[i]);
        }
    }

    /**
     * Sets the value of '_vendorList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vVendorList the Vector to copy.
     */
    public void setVendor(
            final java.util.List<org.opennms.netmgt.config.linkd.Vendor> vVendorList) {
        // copy vector
        this._vendorList.clear();
        
        this._vendorList.addAll(vVendorList);
    }

    /**
     * Sets the value of '_vendorList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param vendorList the Vector to set.
     */
    public void setVendorCollection(
            final java.util.List<org.opennms.netmgt.config.linkd.Vendor> vendorList) {
        this._vendorList = vendorList;
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
     * org.opennms.netmgt.config.linkd.Iproutes
     */
    public static org.opennms.netmgt.config.linkd.Iproutes unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.linkd.Iproutes) Unmarshaller.unmarshal(org.opennms.netmgt.config.linkd.Iproutes.class, reader);
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

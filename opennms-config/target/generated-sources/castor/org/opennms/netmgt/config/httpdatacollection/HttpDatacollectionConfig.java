/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.httpdatacollection;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the datacollection-config.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class HttpDatacollectionConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * full path to the RRD repository for collected SNMP data
     */
    private java.lang.String _rrdRepository;

    /**
     * Field _httpCollectionList.
     */
    private java.util.List<org.opennms.netmgt.config.httpdatacollection.HttpCollection> _httpCollectionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public HttpDatacollectionConfig() {
        super();
        this._httpCollectionList = new java.util.ArrayList<org.opennms.netmgt.config.httpdatacollection.HttpCollection>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vHttpCollection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addHttpCollection(
            final org.opennms.netmgt.config.httpdatacollection.HttpCollection vHttpCollection)
    throws java.lang.IndexOutOfBoundsException {
        this._httpCollectionList.add(vHttpCollection);
    }

    /**
     * 
     * 
     * @param index
     * @param vHttpCollection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addHttpCollection(
            final int index,
            final org.opennms.netmgt.config.httpdatacollection.HttpCollection vHttpCollection)
    throws java.lang.IndexOutOfBoundsException {
        this._httpCollectionList.add(index, vHttpCollection);
    }

    /**
     * Method enumerateHttpCollection.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.httpdatacollection.HttpCollection> enumerateHttpCollection(
    ) {
        return java.util.Collections.enumeration(this._httpCollectionList);
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
        
        if (obj instanceof HttpDatacollectionConfig) {
        
            HttpDatacollectionConfig temp = (HttpDatacollectionConfig)obj;
            if (this._rrdRepository != null) {
                if (temp._rrdRepository == null) return false;
                else if (!(this._rrdRepository.equals(temp._rrdRepository))) 
                    return false;
            }
            else if (temp._rrdRepository != null)
                return false;
            if (this._httpCollectionList != null) {
                if (temp._httpCollectionList == null) return false;
                else if (!(this._httpCollectionList.equals(temp._httpCollectionList))) 
                    return false;
            }
            else if (temp._httpCollectionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getHttpCollection.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.httpdatacollection.HttpCollection
     * at the given index
     */
    public org.opennms.netmgt.config.httpdatacollection.HttpCollection getHttpCollection(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._httpCollectionList.size()) {
            throw new IndexOutOfBoundsException("getHttpCollection: Index value '" + index + "' not in range [0.." + (this._httpCollectionList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.httpdatacollection.HttpCollection) _httpCollectionList.get(index);
    }

    /**
     * Method getHttpCollection.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.httpdatacollection.HttpCollection[] getHttpCollection(
    ) {
        org.opennms.netmgt.config.httpdatacollection.HttpCollection[] array = new org.opennms.netmgt.config.httpdatacollection.HttpCollection[0];
        return (org.opennms.netmgt.config.httpdatacollection.HttpCollection[]) this._httpCollectionList.toArray(array);
    }

    /**
     * Method getHttpCollectionCollection.Returns a reference to
     * '_httpCollectionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.httpdatacollection.HttpCollection> getHttpCollectionCollection(
    ) {
        return this._httpCollectionList;
    }

    /**
     * Method getHttpCollectionCount.
     * 
     * @return the size of this collection
     */
    public int getHttpCollectionCount(
    ) {
        return this._httpCollectionList.size();
    }

    /**
     * Returns the value of field 'rrdRepository'. The field
     * 'rrdRepository' has the following description: full path to
     * the RRD repository for collected SNMP data
     * 
     * @return the value of field 'RrdRepository'.
     */
    public java.lang.String getRrdRepository(
    ) {
        return this._rrdRepository;
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
        if (_rrdRepository != null) {
           result = 37 * result + _rrdRepository.hashCode();
        }
        if (_httpCollectionList != null) {
           result = 37 * result + _httpCollectionList.hashCode();
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
     * Method iterateHttpCollection.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.httpdatacollection.HttpCollection> iterateHttpCollection(
    ) {
        return this._httpCollectionList.iterator();
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
    public void removeAllHttpCollection(
    ) {
        this._httpCollectionList.clear();
    }

    /**
     * Method removeHttpCollection.
     * 
     * @param vHttpCollection
     * @return true if the object was removed from the collection.
     */
    public boolean removeHttpCollection(
            final org.opennms.netmgt.config.httpdatacollection.HttpCollection vHttpCollection) {
        boolean removed = _httpCollectionList.remove(vHttpCollection);
        return removed;
    }

    /**
     * Method removeHttpCollectionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.httpdatacollection.HttpCollection removeHttpCollectionAt(
            final int index) {
        java.lang.Object obj = this._httpCollectionList.remove(index);
        return (org.opennms.netmgt.config.httpdatacollection.HttpCollection) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vHttpCollection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setHttpCollection(
            final int index,
            final org.opennms.netmgt.config.httpdatacollection.HttpCollection vHttpCollection)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._httpCollectionList.size()) {
            throw new IndexOutOfBoundsException("setHttpCollection: Index value '" + index + "' not in range [0.." + (this._httpCollectionList.size() - 1) + "]");
        }
        
        this._httpCollectionList.set(index, vHttpCollection);
    }

    /**
     * 
     * 
     * @param vHttpCollectionArray
     */
    public void setHttpCollection(
            final org.opennms.netmgt.config.httpdatacollection.HttpCollection[] vHttpCollectionArray) {
        //-- copy array
        _httpCollectionList.clear();
        
        for (int i = 0; i < vHttpCollectionArray.length; i++) {
                this._httpCollectionList.add(vHttpCollectionArray[i]);
        }
    }

    /**
     * Sets the value of '_httpCollectionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vHttpCollectionList the Vector to copy.
     */
    public void setHttpCollection(
            final java.util.List<org.opennms.netmgt.config.httpdatacollection.HttpCollection> vHttpCollectionList) {
        // copy vector
        this._httpCollectionList.clear();
        
        this._httpCollectionList.addAll(vHttpCollectionList);
    }

    /**
     * Sets the value of '_httpCollectionList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param httpCollectionList the Vector to set.
     */
    public void setHttpCollectionCollection(
            final java.util.List<org.opennms.netmgt.config.httpdatacollection.HttpCollection> httpCollectionList) {
        this._httpCollectionList = httpCollectionList;
    }

    /**
     * Sets the value of field 'rrdRepository'. The field
     * 'rrdRepository' has the following description: full path to
     * the RRD repository for collected SNMP data
     * 
     * @param rrdRepository the value of field 'rrdRepository'.
     */
    public void setRrdRepository(
            final java.lang.String rrdRepository) {
        this._rrdRepository = rrdRepository;
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
     * org.opennms.netmgt.config.httpdatacollection.HttpDatacollectionConfig
     */
    public static org.opennms.netmgt.config.httpdatacollection.HttpDatacollectionConfig unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.HttpDatacollectionConfig) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.HttpDatacollectionConfig.class, reader);
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

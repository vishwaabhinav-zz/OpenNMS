/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.translator;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * The list of event mappings for this event. The first
 *  mapping that matches the event is used to translate the
 *  event into a new event.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Mappings implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A mapping for a given event. This translation is only
     *  applied if it is the first that matches
     *  
     */
    private java.util.List<org.opennms.netmgt.config.translator.Mapping> _mappingList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Mappings() {
        super();
        this._mappingList = new java.util.ArrayList<org.opennms.netmgt.config.translator.Mapping>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMapping(
            final org.opennms.netmgt.config.translator.Mapping vMapping)
    throws java.lang.IndexOutOfBoundsException {
        this._mappingList.add(vMapping);
    }

    /**
     * 
     * 
     * @param index
     * @param vMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMapping(
            final int index,
            final org.opennms.netmgt.config.translator.Mapping vMapping)
    throws java.lang.IndexOutOfBoundsException {
        this._mappingList.add(index, vMapping);
    }

    /**
     * Method enumerateMapping.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.translator.Mapping> enumerateMapping(
    ) {
        return java.util.Collections.enumeration(this._mappingList);
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
        
        if (obj instanceof Mappings) {
        
            Mappings temp = (Mappings)obj;
            if (this._mappingList != null) {
                if (temp._mappingList == null) return false;
                else if (!(this._mappingList.equals(temp._mappingList))) 
                    return false;
            }
            else if (temp._mappingList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getMapping.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.translator.Mapping at the given
     * index
     */
    public org.opennms.netmgt.config.translator.Mapping getMapping(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mappingList.size()) {
            throw new IndexOutOfBoundsException("getMapping: Index value '" + index + "' not in range [0.." + (this._mappingList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.translator.Mapping) _mappingList.get(index);
    }

    /**
     * Method getMapping.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.translator.Mapping[] getMapping(
    ) {
        org.opennms.netmgt.config.translator.Mapping[] array = new org.opennms.netmgt.config.translator.Mapping[0];
        return (org.opennms.netmgt.config.translator.Mapping[]) this._mappingList.toArray(array);
    }

    /**
     * Method getMappingCollection.Returns a reference to
     * '_mappingList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.translator.Mapping> getMappingCollection(
    ) {
        return this._mappingList;
    }

    /**
     * Method getMappingCount.
     * 
     * @return the size of this collection
     */
    public int getMappingCount(
    ) {
        return this._mappingList.size();
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
        if (_mappingList != null) {
           result = 37 * result + _mappingList.hashCode();
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
     * Method iterateMapping.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.translator.Mapping> iterateMapping(
    ) {
        return this._mappingList.iterator();
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
    public void removeAllMapping(
    ) {
        this._mappingList.clear();
    }

    /**
     * Method removeMapping.
     * 
     * @param vMapping
     * @return true if the object was removed from the collection.
     */
    public boolean removeMapping(
            final org.opennms.netmgt.config.translator.Mapping vMapping) {
        boolean removed = _mappingList.remove(vMapping);
        return removed;
    }

    /**
     * Method removeMappingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.translator.Mapping removeMappingAt(
            final int index) {
        java.lang.Object obj = this._mappingList.remove(index);
        return (org.opennms.netmgt.config.translator.Mapping) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vMapping
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMapping(
            final int index,
            final org.opennms.netmgt.config.translator.Mapping vMapping)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._mappingList.size()) {
            throw new IndexOutOfBoundsException("setMapping: Index value '" + index + "' not in range [0.." + (this._mappingList.size() - 1) + "]");
        }
        
        this._mappingList.set(index, vMapping);
    }

    /**
     * 
     * 
     * @param vMappingArray
     */
    public void setMapping(
            final org.opennms.netmgt.config.translator.Mapping[] vMappingArray) {
        //-- copy array
        _mappingList.clear();
        
        for (int i = 0; i < vMappingArray.length; i++) {
                this._mappingList.add(vMappingArray[i]);
        }
    }

    /**
     * Sets the value of '_mappingList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vMappingList the Vector to copy.
     */
    public void setMapping(
            final java.util.List<org.opennms.netmgt.config.translator.Mapping> vMappingList) {
        // copy vector
        this._mappingList.clear();
        
        this._mappingList.addAll(vMappingList);
    }

    /**
     * Sets the value of '_mappingList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param mappingList the Vector to set.
     */
    public void setMappingCollection(
            final java.util.List<org.opennms.netmgt.config.translator.Mapping> mappingList) {
        this._mappingList = mappingList;
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
     * org.opennms.netmgt.config.translator.Mappings
     */
    public static org.opennms.netmgt.config.translator.Mappings unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.translator.Mappings) Unmarshaller.unmarshal(org.opennms.netmgt.config.translator.Mappings.class, reader);
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

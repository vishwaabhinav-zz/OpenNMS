/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.attrsummary;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Summary.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Summary implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resourceList.
     */
    private java.util.List<org.opennms.netmgt.config.attrsummary.Resource> _resourceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Summary() {
        super();
        this._resourceList = new java.util.ArrayList<org.opennms.netmgt.config.attrsummary.Resource>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResource(
            final org.opennms.netmgt.config.attrsummary.Resource vResource)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceList.add(vResource);
    }

    /**
     * 
     * 
     * @param index
     * @param vResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addResource(
            final int index,
            final org.opennms.netmgt.config.attrsummary.Resource vResource)
    throws java.lang.IndexOutOfBoundsException {
        this._resourceList.add(index, vResource);
    }

    /**
     * Method enumerateResource.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.attrsummary.Resource> enumerateResource(
    ) {
        return java.util.Collections.enumeration(this._resourceList);
    }

    /**
     * Method getResource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.attrsummary.Resource at the given
     * index
     */
    public org.opennms.netmgt.config.attrsummary.Resource getResource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceList.size()) {
            throw new IndexOutOfBoundsException("getResource: Index value '" + index + "' not in range [0.." + (this._resourceList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.attrsummary.Resource) _resourceList.get(index);
    }

    /**
     * Method getResource.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.attrsummary.Resource[] getResource(
    ) {
        org.opennms.netmgt.config.attrsummary.Resource[] array = new org.opennms.netmgt.config.attrsummary.Resource[0];
        return (org.opennms.netmgt.config.attrsummary.Resource[]) this._resourceList.toArray(array);
    }

    /**
     * Method getResourceCollection.Returns a reference to
     * '_resourceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.attrsummary.Resource> getResourceCollection(
    ) {
        return this._resourceList;
    }

    /**
     * Method getResourceCount.
     * 
     * @return the size of this collection
     */
    public int getResourceCount(
    ) {
        return this._resourceList.size();
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
     * Method iterateResource.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.attrsummary.Resource> iterateResource(
    ) {
        return this._resourceList.iterator();
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
    public void removeAllResource(
    ) {
        this._resourceList.clear();
    }

    /**
     * Method removeResource.
     * 
     * @param vResource
     * @return true if the object was removed from the collection.
     */
    public boolean removeResource(
            final org.opennms.netmgt.config.attrsummary.Resource vResource) {
        boolean removed = _resourceList.remove(vResource);
        return removed;
    }

    /**
     * Method removeResourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.attrsummary.Resource removeResourceAt(
            final int index) {
        java.lang.Object obj = this._resourceList.remove(index);
        return (org.opennms.netmgt.config.attrsummary.Resource) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vResource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setResource(
            final int index,
            final org.opennms.netmgt.config.attrsummary.Resource vResource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._resourceList.size()) {
            throw new IndexOutOfBoundsException("setResource: Index value '" + index + "' not in range [0.." + (this._resourceList.size() - 1) + "]");
        }
        
        this._resourceList.set(index, vResource);
    }

    /**
     * 
     * 
     * @param vResourceArray
     */
    public void setResource(
            final org.opennms.netmgt.config.attrsummary.Resource[] vResourceArray) {
        //-- copy array
        _resourceList.clear();
        
        for (int i = 0; i < vResourceArray.length; i++) {
                this._resourceList.add(vResourceArray[i]);
        }
    }

    /**
     * Sets the value of '_resourceList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vResourceList the Vector to copy.
     */
    public void setResource(
            final java.util.List<org.opennms.netmgt.config.attrsummary.Resource> vResourceList) {
        // copy vector
        this._resourceList.clear();
        
        this._resourceList.addAll(vResourceList);
    }

    /**
     * Sets the value of '_resourceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param resourceList the Vector to set.
     */
    public void setResourceCollection(
            final java.util.List<org.opennms.netmgt.config.attrsummary.Resource> resourceList) {
        this._resourceList = resourceList;
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
     * org.opennms.netmgt.config.attrsummary.Summary
     */
    public static org.opennms.netmgt.config.attrsummary.Summary unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.attrsummary.Summary) Unmarshaller.unmarshal(org.opennms.netmgt.config.attrsummary.Summary.class, reader);
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

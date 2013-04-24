/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.service;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the service-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ServiceConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Service to be launched by the manager.
     */
    private java.util.List<org.opennms.netmgt.config.service.Service> _serviceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ServiceConfiguration() {
        super();
        this._serviceList = new java.util.ArrayList<org.opennms.netmgt.config.service.Service>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final org.opennms.netmgt.config.service.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(vService);
    }

    /**
     * 
     * 
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final int index,
            final org.opennms.netmgt.config.service.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(index, vService);
    }

    /**
     * Method enumerateService.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.service.Service> enumerateService(
    ) {
        return java.util.Collections.enumeration(this._serviceList);
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
        
        if (obj instanceof ServiceConfiguration) {
        
            ServiceConfiguration temp = (ServiceConfiguration)obj;
            if (this._serviceList != null) {
                if (temp._serviceList == null) return false;
                else if (!(this._serviceList.equals(temp._serviceList))) 
                    return false;
            }
            else if (temp._serviceList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getService.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.service.Service at the given index
     */
    public org.opennms.netmgt.config.service.Service getService(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("getService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.service.Service) _serviceList.get(index);
    }

    /**
     * Method getService.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.service.Service[] getService(
    ) {
        org.opennms.netmgt.config.service.Service[] array = new org.opennms.netmgt.config.service.Service[0];
        return (org.opennms.netmgt.config.service.Service[]) this._serviceList.toArray(array);
    }

    /**
     * Method getServiceCollection.Returns a reference to
     * '_serviceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.service.Service> getServiceCollection(
    ) {
        return this._serviceList;
    }

    /**
     * Method getServiceCount.
     * 
     * @return the size of this collection
     */
    public int getServiceCount(
    ) {
        return this._serviceList.size();
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
        if (_serviceList != null) {
           result = 37 * result + _serviceList.hashCode();
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
     * Method iterateService.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.service.Service> iterateService(
    ) {
        return this._serviceList.iterator();
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
    public void removeAllService(
    ) {
        this._serviceList.clear();
    }

    /**
     * Method removeService.
     * 
     * @param vService
     * @return true if the object was removed from the collection.
     */
    public boolean removeService(
            final org.opennms.netmgt.config.service.Service vService) {
        boolean removed = _serviceList.remove(vService);
        return removed;
    }

    /**
     * Method removeServiceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.service.Service removeServiceAt(
            final int index) {
        java.lang.Object obj = this._serviceList.remove(index);
        return (org.opennms.netmgt.config.service.Service) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setService(
            final int index,
            final org.opennms.netmgt.config.service.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("setService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }
        
        this._serviceList.set(index, vService);
    }

    /**
     * 
     * 
     * @param vServiceArray
     */
    public void setService(
            final org.opennms.netmgt.config.service.Service[] vServiceArray) {
        //-- copy array
        _serviceList.clear();
        
        for (int i = 0; i < vServiceArray.length; i++) {
                this._serviceList.add(vServiceArray[i]);
        }
    }

    /**
     * Sets the value of '_serviceList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vServiceList the Vector to copy.
     */
    public void setService(
            final java.util.List<org.opennms.netmgt.config.service.Service> vServiceList) {
        // copy vector
        this._serviceList.clear();
        
        this._serviceList.addAll(vServiceList);
    }

    /**
     * Sets the value of '_serviceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param serviceList the Vector to set.
     */
    public void setServiceCollection(
            final java.util.List<org.opennms.netmgt.config.service.Service> serviceList) {
        this._serviceList = serviceList;
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
     * org.opennms.netmgt.config.service.ServiceConfiguration
     */
    public static org.opennms.netmgt.config.service.ServiceConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.service.ServiceConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.service.ServiceConfiguration.class, reader);
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

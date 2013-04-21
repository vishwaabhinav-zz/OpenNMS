/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.snmpinterfacepoller;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Configuration of node-outage
 *  functionality
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class NodeOutage implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Critical service. Defining a critical service greatly
     *  reduces the traffic generated by the snmp poller when a
     * service is DOWN.
     *  The snmp poller stop polling if one of the critical service
     * is down on the 
     *  SNMP primary node interface.
     */
    private java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.CriticalService> _criticalServiceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public NodeOutage() {
        super();
        this._criticalServiceList = new java.util.ArrayList<org.opennms.netmgt.config.snmpinterfacepoller.CriticalService>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCriticalService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCriticalService(
            final org.opennms.netmgt.config.snmpinterfacepoller.CriticalService vCriticalService)
    throws java.lang.IndexOutOfBoundsException {
        this._criticalServiceList.add(vCriticalService);
    }

    /**
     * 
     * 
     * @param index
     * @param vCriticalService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCriticalService(
            final int index,
            final org.opennms.netmgt.config.snmpinterfacepoller.CriticalService vCriticalService)
    throws java.lang.IndexOutOfBoundsException {
        this._criticalServiceList.add(index, vCriticalService);
    }

    /**
     * Method enumerateCriticalService.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.snmpinterfacepoller.CriticalService> enumerateCriticalService(
    ) {
        return java.util.Collections.enumeration(this._criticalServiceList);
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
        
        if (obj instanceof NodeOutage) {
        
            NodeOutage temp = (NodeOutage)obj;
            if (this._criticalServiceList != null) {
                if (temp._criticalServiceList == null) return false;
                else if (!(this._criticalServiceList.equals(temp._criticalServiceList))) 
                    return false;
            }
            else if (temp._criticalServiceList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getCriticalService.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.snmpinterfacepoller.CriticalService
     * at the given index
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.CriticalService getCriticalService(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._criticalServiceList.size()) {
            throw new IndexOutOfBoundsException("getCriticalService: Index value '" + index + "' not in range [0.." + (this._criticalServiceList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.snmpinterfacepoller.CriticalService) _criticalServiceList.get(index);
    }

    /**
     * Method getCriticalService.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.CriticalService[] getCriticalService(
    ) {
        org.opennms.netmgt.config.snmpinterfacepoller.CriticalService[] array = new org.opennms.netmgt.config.snmpinterfacepoller.CriticalService[0];
        return (org.opennms.netmgt.config.snmpinterfacepoller.CriticalService[]) this._criticalServiceList.toArray(array);
    }

    /**
     * Method getCriticalServiceCollection.Returns a reference to
     * '_criticalServiceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.CriticalService> getCriticalServiceCollection(
    ) {
        return this._criticalServiceList;
    }

    /**
     * Method getCriticalServiceCount.
     * 
     * @return the size of this collection
     */
    public int getCriticalServiceCount(
    ) {
        return this._criticalServiceList.size();
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
        if (_criticalServiceList != null) {
           result = 37 * result + _criticalServiceList.hashCode();
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
     * Method iterateCriticalService.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.snmpinterfacepoller.CriticalService> iterateCriticalService(
    ) {
        return this._criticalServiceList.iterator();
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
    public void removeAllCriticalService(
    ) {
        this._criticalServiceList.clear();
    }

    /**
     * Method removeCriticalService.
     * 
     * @param vCriticalService
     * @return true if the object was removed from the collection.
     */
    public boolean removeCriticalService(
            final org.opennms.netmgt.config.snmpinterfacepoller.CriticalService vCriticalService) {
        boolean removed = _criticalServiceList.remove(vCriticalService);
        return removed;
    }

    /**
     * Method removeCriticalServiceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.CriticalService removeCriticalServiceAt(
            final int index) {
        java.lang.Object obj = this._criticalServiceList.remove(index);
        return (org.opennms.netmgt.config.snmpinterfacepoller.CriticalService) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCriticalService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCriticalService(
            final int index,
            final org.opennms.netmgt.config.snmpinterfacepoller.CriticalService vCriticalService)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._criticalServiceList.size()) {
            throw new IndexOutOfBoundsException("setCriticalService: Index value '" + index + "' not in range [0.." + (this._criticalServiceList.size() - 1) + "]");
        }
        
        this._criticalServiceList.set(index, vCriticalService);
    }

    /**
     * 
     * 
     * @param vCriticalServiceArray
     */
    public void setCriticalService(
            final org.opennms.netmgt.config.snmpinterfacepoller.CriticalService[] vCriticalServiceArray) {
        //-- copy array
        _criticalServiceList.clear();
        
        for (int i = 0; i < vCriticalServiceArray.length; i++) {
                this._criticalServiceList.add(vCriticalServiceArray[i]);
        }
    }

    /**
     * Sets the value of '_criticalServiceList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vCriticalServiceList the Vector to copy.
     */
    public void setCriticalService(
            final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.CriticalService> vCriticalServiceList) {
        // copy vector
        this._criticalServiceList.clear();
        
        this._criticalServiceList.addAll(vCriticalServiceList);
    }

    /**
     * Sets the value of '_criticalServiceList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param criticalServiceList the Vector to set.
     */
    public void setCriticalServiceCollection(
            final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.CriticalService> criticalServiceList) {
        this._criticalServiceList = criticalServiceList;
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
     * org.opennms.netmgt.config.snmpinterfacepoller.NodeOutage
     */
    public static org.opennms.netmgt.config.snmpinterfacepoller.NodeOutage unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.snmpinterfacepoller.NodeOutage) Unmarshaller.unmarshal(org.opennms.netmgt.config.snmpinterfacepoller.NodeOutage.class, reader);
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

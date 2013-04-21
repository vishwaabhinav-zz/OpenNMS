/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.xmlrpcd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Subscription defines a set of events that an external
 *  XMLRPC server interested, and need OpenNMS to give notification
 * via
 *  XMLRPC protocol
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Subscription implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Name of subscription
     */
    private java.lang.String _name;

    /**
     * Events subscribed by the external XMLRPC
     *  servers
     */
    private java.util.List<org.opennms.netmgt.config.xmlrpcd.SubscribedEvent> _subscribedEventList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Subscription() {
        super();
        this._subscribedEventList = new java.util.ArrayList<org.opennms.netmgt.config.xmlrpcd.SubscribedEvent>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSubscribedEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubscribedEvent(
            final org.opennms.netmgt.config.xmlrpcd.SubscribedEvent vSubscribedEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._subscribedEventList.add(vSubscribedEvent);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubscribedEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubscribedEvent(
            final int index,
            final org.opennms.netmgt.config.xmlrpcd.SubscribedEvent vSubscribedEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._subscribedEventList.add(index, vSubscribedEvent);
    }

    /**
     * Method enumerateSubscribedEvent.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.xmlrpcd.SubscribedEvent> enumerateSubscribedEvent(
    ) {
        return java.util.Collections.enumeration(this._subscribedEventList);
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
        
        if (obj instanceof Subscription) {
        
            Subscription temp = (Subscription)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._subscribedEventList != null) {
                if (temp._subscribedEventList == null) return false;
                else if (!(this._subscribedEventList.equals(temp._subscribedEventList))) 
                    return false;
            }
            else if (temp._subscribedEventList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Name of subscription
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getSubscribedEvent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.xmlrpcd.SubscribedEvent at the
     * given index
     */
    public org.opennms.netmgt.config.xmlrpcd.SubscribedEvent getSubscribedEvent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subscribedEventList.size()) {
            throw new IndexOutOfBoundsException("getSubscribedEvent: Index value '" + index + "' not in range [0.." + (this._subscribedEventList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.xmlrpcd.SubscribedEvent) _subscribedEventList.get(index);
    }

    /**
     * Method getSubscribedEvent.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.xmlrpcd.SubscribedEvent[] getSubscribedEvent(
    ) {
        org.opennms.netmgt.config.xmlrpcd.SubscribedEvent[] array = new org.opennms.netmgt.config.xmlrpcd.SubscribedEvent[0];
        return (org.opennms.netmgt.config.xmlrpcd.SubscribedEvent[]) this._subscribedEventList.toArray(array);
    }

    /**
     * Method getSubscribedEventCollection.Returns a reference to
     * '_subscribedEventList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.xmlrpcd.SubscribedEvent> getSubscribedEventCollection(
    ) {
        return this._subscribedEventList;
    }

    /**
     * Method getSubscribedEventCount.
     * 
     * @return the size of this collection
     */
    public int getSubscribedEventCount(
    ) {
        return this._subscribedEventList.size();
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_subscribedEventList != null) {
           result = 37 * result + _subscribedEventList.hashCode();
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
     * Method iterateSubscribedEvent.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.xmlrpcd.SubscribedEvent> iterateSubscribedEvent(
    ) {
        return this._subscribedEventList.iterator();
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
    public void removeAllSubscribedEvent(
    ) {
        this._subscribedEventList.clear();
    }

    /**
     * Method removeSubscribedEvent.
     * 
     * @param vSubscribedEvent
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubscribedEvent(
            final org.opennms.netmgt.config.xmlrpcd.SubscribedEvent vSubscribedEvent) {
        boolean removed = _subscribedEventList.remove(vSubscribedEvent);
        return removed;
    }

    /**
     * Method removeSubscribedEventAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.xmlrpcd.SubscribedEvent removeSubscribedEventAt(
            final int index) {
        java.lang.Object obj = this._subscribedEventList.remove(index);
        return (org.opennms.netmgt.config.xmlrpcd.SubscribedEvent) obj;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Name of subscription
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * 
     * 
     * @param index
     * @param vSubscribedEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubscribedEvent(
            final int index,
            final org.opennms.netmgt.config.xmlrpcd.SubscribedEvent vSubscribedEvent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subscribedEventList.size()) {
            throw new IndexOutOfBoundsException("setSubscribedEvent: Index value '" + index + "' not in range [0.." + (this._subscribedEventList.size() - 1) + "]");
        }
        
        this._subscribedEventList.set(index, vSubscribedEvent);
    }

    /**
     * 
     * 
     * @param vSubscribedEventArray
     */
    public void setSubscribedEvent(
            final org.opennms.netmgt.config.xmlrpcd.SubscribedEvent[] vSubscribedEventArray) {
        //-- copy array
        _subscribedEventList.clear();
        
        for (int i = 0; i < vSubscribedEventArray.length; i++) {
                this._subscribedEventList.add(vSubscribedEventArray[i]);
        }
    }

    /**
     * Sets the value of '_subscribedEventList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSubscribedEventList the Vector to copy.
     */
    public void setSubscribedEvent(
            final java.util.List<org.opennms.netmgt.config.xmlrpcd.SubscribedEvent> vSubscribedEventList) {
        // copy vector
        this._subscribedEventList.clear();
        
        this._subscribedEventList.addAll(vSubscribedEventList);
    }

    /**
     * Sets the value of '_subscribedEventList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param subscribedEventList the Vector to set.
     */
    public void setSubscribedEventCollection(
            final java.util.List<org.opennms.netmgt.config.xmlrpcd.SubscribedEvent> subscribedEventList) {
        this._subscribedEventList = subscribedEventList;
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
     * org.opennms.netmgt.config.xmlrpcd.Subscription
     */
    public static org.opennms.netmgt.config.xmlrpcd.Subscription unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.xmlrpcd.Subscription) Unmarshaller.unmarshal(org.opennms.netmgt.config.xmlrpcd.Subscription.class, reader);
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

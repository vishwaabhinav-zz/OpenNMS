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
 * Defines a primary XMLRPC server (and optional 
 *  backup servers) and the sets of events to which it subscribes 
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ExternalServers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Retries to set up communication with an XMLRPC
     *  server
     */
    private int _retries;

    /**
     * keeps track of state for field: _retries
     */
    private boolean _has_retries;

    /**
     * Elapsed time between retries
     */
    private int _elapseTime;

    /**
     * keeps track of state for field: _elapseTime
     */
    private boolean _has_elapseTime;

    /**
     * Configuration of xmlrpc servers - these servers are
     *  serially redundant - ie. OpenNMS will connect to one, and
     * if it 
     *  goes down will connect to another
     */
    private java.util.List<org.opennms.netmgt.config.xmlrpcd.XmlrpcServer> _xmlrpcServerList;

    /**
     * Name of a subscription for this server
     *  
     */
    private java.util.List<java.lang.String> _serverSubscriptionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExternalServers() {
        super();
        this._xmlrpcServerList = new java.util.ArrayList<org.opennms.netmgt.config.xmlrpcd.XmlrpcServer>();
        this._serverSubscriptionList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vServerSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addServerSubscription(
            final java.lang.String vServerSubscription)
    throws java.lang.IndexOutOfBoundsException {
        this._serverSubscriptionList.add(vServerSubscription);
    }

    /**
     * 
     * 
     * @param index
     * @param vServerSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addServerSubscription(
            final int index,
            final java.lang.String vServerSubscription)
    throws java.lang.IndexOutOfBoundsException {
        this._serverSubscriptionList.add(index, vServerSubscription);
    }

    /**
     * 
     * 
     * @param vXmlrpcServer
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addXmlrpcServer(
            final org.opennms.netmgt.config.xmlrpcd.XmlrpcServer vXmlrpcServer)
    throws java.lang.IndexOutOfBoundsException {
        this._xmlrpcServerList.add(vXmlrpcServer);
    }

    /**
     * 
     * 
     * @param index
     * @param vXmlrpcServer
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addXmlrpcServer(
            final int index,
            final org.opennms.netmgt.config.xmlrpcd.XmlrpcServer vXmlrpcServer)
    throws java.lang.IndexOutOfBoundsException {
        this._xmlrpcServerList.add(index, vXmlrpcServer);
    }

    /**
     */
    public void deleteElapseTime(
    ) {
        this._has_elapseTime= false;
    }

    /**
     */
    public void deleteRetries(
    ) {
        this._has_retries= false;
    }

    /**
     * Method enumerateServerSubscription.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateServerSubscription(
    ) {
        return java.util.Collections.enumeration(this._serverSubscriptionList);
    }

    /**
     * Method enumerateXmlrpcServer.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.xmlrpcd.XmlrpcServer> enumerateXmlrpcServer(
    ) {
        return java.util.Collections.enumeration(this._xmlrpcServerList);
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
        
        if (obj instanceof ExternalServers) {
        
            ExternalServers temp = (ExternalServers)obj;
            if (this._retries != temp._retries)
                return false;
            if (this._has_retries != temp._has_retries)
                return false;
            if (this._elapseTime != temp._elapseTime)
                return false;
            if (this._has_elapseTime != temp._has_elapseTime)
                return false;
            if (this._xmlrpcServerList != null) {
                if (temp._xmlrpcServerList == null) return false;
                else if (!(this._xmlrpcServerList.equals(temp._xmlrpcServerList))) 
                    return false;
            }
            else if (temp._xmlrpcServerList != null)
                return false;
            if (this._serverSubscriptionList != null) {
                if (temp._serverSubscriptionList == null) return false;
                else if (!(this._serverSubscriptionList.equals(temp._serverSubscriptionList))) 
                    return false;
            }
            else if (temp._serverSubscriptionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'elapseTime'. The field
     * 'elapseTime' has the following description: Elapsed time
     * between retries
     * 
     * @return the value of field 'ElapseTime'.
     */
    public int getElapseTime(
    ) {
        return this._elapseTime;
    }

    /**
     * Returns the value of field 'retries'. The field 'retries'
     * has the following description: Retries to set up
     * communication with an XMLRPC
     *  server
     * 
     * @return the value of field 'Retries'.
     */
    public int getRetries(
    ) {
        return this._retries;
    }

    /**
     * Method getServerSubscription.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getServerSubscription(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serverSubscriptionList.size()) {
            throw new IndexOutOfBoundsException("getServerSubscription: Index value '" + index + "' not in range [0.." + (this._serverSubscriptionList.size() - 1) + "]");
        }
        
        return (java.lang.String) _serverSubscriptionList.get(index);
    }

    /**
     * Method getServerSubscription.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getServerSubscription(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._serverSubscriptionList.toArray(array);
    }

    /**
     * Method getServerSubscriptionCollection.Returns a reference
     * to '_serverSubscriptionList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getServerSubscriptionCollection(
    ) {
        return this._serverSubscriptionList;
    }

    /**
     * Method getServerSubscriptionCount.
     * 
     * @return the size of this collection
     */
    public int getServerSubscriptionCount(
    ) {
        return this._serverSubscriptionList.size();
    }

    /**
     * Method getXmlrpcServer.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.xmlrpcd.XmlrpcServer at the given
     * index
     */
    public org.opennms.netmgt.config.xmlrpcd.XmlrpcServer getXmlrpcServer(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._xmlrpcServerList.size()) {
            throw new IndexOutOfBoundsException("getXmlrpcServer: Index value '" + index + "' not in range [0.." + (this._xmlrpcServerList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.xmlrpcd.XmlrpcServer) _xmlrpcServerList.get(index);
    }

    /**
     * Method getXmlrpcServer.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.xmlrpcd.XmlrpcServer[] getXmlrpcServer(
    ) {
        org.opennms.netmgt.config.xmlrpcd.XmlrpcServer[] array = new org.opennms.netmgt.config.xmlrpcd.XmlrpcServer[0];
        return (org.opennms.netmgt.config.xmlrpcd.XmlrpcServer[]) this._xmlrpcServerList.toArray(array);
    }

    /**
     * Method getXmlrpcServerCollection.Returns a reference to
     * '_xmlrpcServerList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.xmlrpcd.XmlrpcServer> getXmlrpcServerCollection(
    ) {
        return this._xmlrpcServerList;
    }

    /**
     * Method getXmlrpcServerCount.
     * 
     * @return the size of this collection
     */
    public int getXmlrpcServerCount(
    ) {
        return this._xmlrpcServerList.size();
    }

    /**
     * Method hasElapseTime.
     * 
     * @return true if at least one ElapseTime has been added
     */
    public boolean hasElapseTime(
    ) {
        return this._has_elapseTime;
    }

    /**
     * Method hasRetries.
     * 
     * @return true if at least one Retries has been added
     */
    public boolean hasRetries(
    ) {
        return this._has_retries;
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
        result = 37 * result + _retries;
        result = 37 * result + _elapseTime;
        if (_xmlrpcServerList != null) {
           result = 37 * result + _xmlrpcServerList.hashCode();
        }
        if (_serverSubscriptionList != null) {
           result = 37 * result + _serverSubscriptionList.hashCode();
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
     * Method iterateServerSubscription.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateServerSubscription(
    ) {
        return this._serverSubscriptionList.iterator();
    }

    /**
     * Method iterateXmlrpcServer.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.xmlrpcd.XmlrpcServer> iterateXmlrpcServer(
    ) {
        return this._xmlrpcServerList.iterator();
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
    public void removeAllServerSubscription(
    ) {
        this._serverSubscriptionList.clear();
    }

    /**
     */
    public void removeAllXmlrpcServer(
    ) {
        this._xmlrpcServerList.clear();
    }

    /**
     * Method removeServerSubscription.
     * 
     * @param vServerSubscription
     * @return true if the object was removed from the collection.
     */
    public boolean removeServerSubscription(
            final java.lang.String vServerSubscription) {
        boolean removed = _serverSubscriptionList.remove(vServerSubscription);
        return removed;
    }

    /**
     * Method removeServerSubscriptionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeServerSubscriptionAt(
            final int index) {
        java.lang.Object obj = this._serverSubscriptionList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeXmlrpcServer.
     * 
     * @param vXmlrpcServer
     * @return true if the object was removed from the collection.
     */
    public boolean removeXmlrpcServer(
            final org.opennms.netmgt.config.xmlrpcd.XmlrpcServer vXmlrpcServer) {
        boolean removed = _xmlrpcServerList.remove(vXmlrpcServer);
        return removed;
    }

    /**
     * Method removeXmlrpcServerAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.xmlrpcd.XmlrpcServer removeXmlrpcServerAt(
            final int index) {
        java.lang.Object obj = this._xmlrpcServerList.remove(index);
        return (org.opennms.netmgt.config.xmlrpcd.XmlrpcServer) obj;
    }

    /**
     * Sets the value of field 'elapseTime'. The field 'elapseTime'
     * has the following description: Elapsed time between retries
     * 
     * @param elapseTime the value of field 'elapseTime'.
     */
    public void setElapseTime(
            final int elapseTime) {
        this._elapseTime = elapseTime;
        this._has_elapseTime = true;
    }

    /**
     * Sets the value of field 'retries'. The field 'retries' has
     * the following description: Retries to set up communication
     * with an XMLRPC
     *  server
     * 
     * @param retries the value of field 'retries'.
     */
    public void setRetries(
            final int retries) {
        this._retries = retries;
        this._has_retries = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vServerSubscription
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setServerSubscription(
            final int index,
            final java.lang.String vServerSubscription)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serverSubscriptionList.size()) {
            throw new IndexOutOfBoundsException("setServerSubscription: Index value '" + index + "' not in range [0.." + (this._serverSubscriptionList.size() - 1) + "]");
        }
        
        this._serverSubscriptionList.set(index, vServerSubscription);
    }

    /**
     * 
     * 
     * @param vServerSubscriptionArray
     */
    public void setServerSubscription(
            final java.lang.String[] vServerSubscriptionArray) {
        //-- copy array
        _serverSubscriptionList.clear();
        
        for (int i = 0; i < vServerSubscriptionArray.length; i++) {
                this._serverSubscriptionList.add(vServerSubscriptionArray[i]);
        }
    }

    /**
     * Sets the value of '_serverSubscriptionList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vServerSubscriptionList the Vector to copy.
     */
    public void setServerSubscription(
            final java.util.List<java.lang.String> vServerSubscriptionList) {
        // copy vector
        this._serverSubscriptionList.clear();
        
        this._serverSubscriptionList.addAll(vServerSubscriptionList);
    }

    /**
     * Sets the value of '_serverSubscriptionList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param serverSubscriptionList the Vector to set.
     */
    public void setServerSubscriptionCollection(
            final java.util.List<java.lang.String> serverSubscriptionList) {
        this._serverSubscriptionList = serverSubscriptionList;
    }

    /**
     * 
     * 
     * @param index
     * @param vXmlrpcServer
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setXmlrpcServer(
            final int index,
            final org.opennms.netmgt.config.xmlrpcd.XmlrpcServer vXmlrpcServer)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._xmlrpcServerList.size()) {
            throw new IndexOutOfBoundsException("setXmlrpcServer: Index value '" + index + "' not in range [0.." + (this._xmlrpcServerList.size() - 1) + "]");
        }
        
        this._xmlrpcServerList.set(index, vXmlrpcServer);
    }

    /**
     * 
     * 
     * @param vXmlrpcServerArray
     */
    public void setXmlrpcServer(
            final org.opennms.netmgt.config.xmlrpcd.XmlrpcServer[] vXmlrpcServerArray) {
        //-- copy array
        _xmlrpcServerList.clear();
        
        for (int i = 0; i < vXmlrpcServerArray.length; i++) {
                this._xmlrpcServerList.add(vXmlrpcServerArray[i]);
        }
    }

    /**
     * Sets the value of '_xmlrpcServerList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vXmlrpcServerList the Vector to copy.
     */
    public void setXmlrpcServer(
            final java.util.List<org.opennms.netmgt.config.xmlrpcd.XmlrpcServer> vXmlrpcServerList) {
        // copy vector
        this._xmlrpcServerList.clear();
        
        this._xmlrpcServerList.addAll(vXmlrpcServerList);
    }

    /**
     * Sets the value of '_xmlrpcServerList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param xmlrpcServerList the Vector to set.
     */
    public void setXmlrpcServerCollection(
            final java.util.List<org.opennms.netmgt.config.xmlrpcd.XmlrpcServer> xmlrpcServerList) {
        this._xmlrpcServerList = xmlrpcServerList;
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
     * org.opennms.netmgt.config.xmlrpcd.ExternalServers
     */
    public static org.opennms.netmgt.config.xmlrpcd.ExternalServers unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.xmlrpcd.ExternalServers) Unmarshaller.unmarshal(org.opennms.netmgt.config.xmlrpcd.ExternalServers.class, reader);
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

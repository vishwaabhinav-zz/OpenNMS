/**
 * TicketServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class TicketServiceLocator extends org.apache.axis.client.Service implements org.opennms.integration.otrs.ticketservice.TicketService {

    public TicketServiceLocator() {
    }


    public TicketServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TicketServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TicketServicePort
    private java.lang.String TicketServicePort_address = "http://localhost/otrs/opennms.pl";

    public java.lang.String getTicketServicePortAddress() {
        return TicketServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TicketServicePortWSDDServiceName = "TicketServicePort";

    public java.lang.String getTicketServicePortWSDDServiceName() {
        return TicketServicePortWSDDServiceName;
    }

    public void setTicketServicePortWSDDServiceName(java.lang.String name) {
        TicketServicePortWSDDServiceName = name;
    }

    public org.opennms.integration.otrs.ticketservice.TicketServicePort_PortType getTicketServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TicketServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTicketServicePort(endpoint);
    }

    public org.opennms.integration.otrs.ticketservice.TicketServicePort_PortType getTicketServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.opennms.integration.otrs.ticketservice.TicketServiceSoapBindingStub _stub = new org.opennms.integration.otrs.ticketservice.TicketServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTicketServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTicketServicePortEndpointAddress(java.lang.String address) {
        TicketServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.opennms.integration.otrs.ticketservice.TicketServicePort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.opennms.integration.otrs.ticketservice.TicketServiceSoapBindingStub _stub = new org.opennms.integration.otrs.ticketservice.TicketServiceSoapBindingStub(new java.net.URL(TicketServicePort_address), this);
                _stub.setPortName(getTicketServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TicketServicePort".equals(inputPortName)) {
            return getTicketServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TicketServicePort".equals(portName)) {
            setTicketServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

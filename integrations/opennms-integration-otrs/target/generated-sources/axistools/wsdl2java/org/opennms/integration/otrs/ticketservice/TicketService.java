/**
 * TicketService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public interface TicketService extends javax.xml.rpc.Service {
    public java.lang.String getTicketServicePortAddress();

    public org.opennms.integration.otrs.ticketservice.TicketServicePort_PortType getTicketServicePort() throws javax.xml.rpc.ServiceException;

    public org.opennms.integration.otrs.ticketservice.TicketServicePort_PortType getTicketServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

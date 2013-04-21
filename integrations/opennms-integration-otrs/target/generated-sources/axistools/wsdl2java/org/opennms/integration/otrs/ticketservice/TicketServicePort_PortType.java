/**
 * TicketServicePort_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public interface TicketServicePort_PortType extends java.rmi.Remote {
    public org.opennms.integration.otrs.ticketservice.Ticket ticketGetByID(int ticketID, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public org.opennms.integration.otrs.ticketservice.Ticket ticketGetByNumber(long ticketNumber, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public org.opennms.integration.otrs.ticketservice.TicketWithArticles getById(long ticketNumber, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public org.opennms.integration.otrs.ticketservice.TicketWithArticles getByNumber(long ticketNumber, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public org.opennms.integration.otrs.ticketservice.TicketIDAndNumber ticketCreate(org.opennms.integration.otrs.ticketservice.TicketCore ticket, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public void ticketStateUpdate(org.opennms.integration.otrs.ticketservice.TicketStateUpdate ticketStateUpdate, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public int articleCreate(org.opennms.integration.otrs.ticketservice.ArticleCore article, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public org.opennms.integration.otrs.ticketservice.Article articleGetByID(int articleID, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public org.opennms.integration.otrs.ticketservice.Article[] articleGetAllByTicketID(int ticketID, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
    public org.opennms.integration.otrs.ticketservice.Article[] articleGetAllByTicketNumber(long ticketNumber, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException;
}

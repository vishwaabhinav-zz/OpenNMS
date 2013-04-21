/**
 * TicketWithArticles.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class TicketWithArticles  implements java.io.Serializable {
    private org.opennms.integration.otrs.ticketservice.Ticket ticket;

    private org.opennms.integration.otrs.ticketservice.Article[] articles;

    public TicketWithArticles() {
    }

    public TicketWithArticles(
           org.opennms.integration.otrs.ticketservice.Ticket ticket,
           org.opennms.integration.otrs.ticketservice.Article[] articles) {
           this.ticket = ticket;
           this.articles = articles;
    }


    /**
     * Gets the ticket value for this TicketWithArticles.
     * 
     * @return ticket
     */
    public org.opennms.integration.otrs.ticketservice.Ticket getTicket() {
        return ticket;
    }


    /**
     * Sets the ticket value for this TicketWithArticles.
     * 
     * @param ticket
     */
    public void setTicket(org.opennms.integration.otrs.ticketservice.Ticket ticket) {
        this.ticket = ticket;
    }


    /**
     * Gets the articles value for this TicketWithArticles.
     * 
     * @return articles
     */
    public org.opennms.integration.otrs.ticketservice.Article[] getArticles() {
        return articles;
    }


    /**
     * Sets the articles value for this TicketWithArticles.
     * 
     * @param articles
     */
    public void setArticles(org.opennms.integration.otrs.ticketservice.Article[] articles) {
        this.articles = articles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketWithArticles)) return false;
        TicketWithArticles other = (TicketWithArticles) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ticket==null && other.getTicket()==null) || 
             (this.ticket!=null &&
              this.ticket.equals(other.getTicket()))) &&
            ((this.articles==null && other.getArticles()==null) || 
             (this.articles!=null &&
              java.util.Arrays.equals(this.articles, other.getArticles())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTicket() != null) {
            _hashCode += getTicket().hashCode();
        }
        if (getArticles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArticles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArticles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketWithArticles.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketWithArticles"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Ticket"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Articles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Article"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

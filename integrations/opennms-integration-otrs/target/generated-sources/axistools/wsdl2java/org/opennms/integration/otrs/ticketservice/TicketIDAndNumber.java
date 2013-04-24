/**
 * TicketIDAndNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class TicketIDAndNumber  implements java.io.Serializable {
    private int ticketID;

    private long ticketNumber;

    public TicketIDAndNumber() {
    }

    public TicketIDAndNumber(
           int ticketID,
           long ticketNumber) {
           this.ticketID = ticketID;
           this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the ticketID value for this TicketIDAndNumber.
     * 
     * @return ticketID
     */
    public int getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this TicketIDAndNumber.
     * 
     * @param ticketID
     */
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the ticketNumber value for this TicketIDAndNumber.
     * 
     * @return ticketNumber
     */
    public long getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this TicketIDAndNumber.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketIDAndNumber)) return false;
        TicketIDAndNumber other = (TicketIDAndNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ticketID == other.getTicketID() &&
            this.ticketNumber == other.getTicketNumber();
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
        _hashCode += getTicketID();
        _hashCode += new Long(getTicketNumber()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketIDAndNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketIDAndNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

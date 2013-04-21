/**
 * TicketStateUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class TicketStateUpdate  implements java.io.Serializable {
    private java.lang.String user;

    private java.lang.Integer userID;

    private java.lang.Integer ticketID;

    private java.lang.Long ticketNumber;

    private java.lang.String state;

    private java.lang.Integer stateID;

    public TicketStateUpdate() {
    }

    public TicketStateUpdate(
           java.lang.String user,
           java.lang.Integer userID,
           java.lang.Integer ticketID,
           java.lang.Long ticketNumber,
           java.lang.String state,
           java.lang.Integer stateID) {
           this.user = user;
           this.userID = userID;
           this.ticketID = ticketID;
           this.ticketNumber = ticketNumber;
           this.state = state;
           this.stateID = stateID;
    }


    /**
     * Gets the user value for this TicketStateUpdate.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this TicketStateUpdate.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the userID value for this TicketStateUpdate.
     * 
     * @return userID
     */
    public java.lang.Integer getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this TicketStateUpdate.
     * 
     * @param userID
     */
    public void setUserID(java.lang.Integer userID) {
        this.userID = userID;
    }


    /**
     * Gets the ticketID value for this TicketStateUpdate.
     * 
     * @return ticketID
     */
    public java.lang.Integer getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this TicketStateUpdate.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Integer ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the ticketNumber value for this TicketStateUpdate.
     * 
     * @return ticketNumber
     */
    public java.lang.Long getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this TicketStateUpdate.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.Long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the state value for this TicketStateUpdate.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TicketStateUpdate.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the stateID value for this TicketStateUpdate.
     * 
     * @return stateID
     */
    public java.lang.Integer getStateID() {
        return stateID;
    }


    /**
     * Sets the stateID value for this TicketStateUpdate.
     * 
     * @param stateID
     */
    public void setStateID(java.lang.Integer stateID) {
        this.stateID = stateID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketStateUpdate)) return false;
        TicketStateUpdate other = (TicketStateUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateID==null && other.getStateID()==null) || 
             (this.stateID!=null &&
              this.stateID.equals(other.getStateID())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateID() != null) {
            _hashCode += getStateID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketStateUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketStateUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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

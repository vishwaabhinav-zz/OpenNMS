/**
 * TicketCore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class TicketCore  implements java.io.Serializable {
    private java.lang.String title;

    private java.lang.String user;

    private java.lang.Integer userID;

    private java.lang.String state;

    private java.lang.Integer stateID;

    private java.lang.String priority;

    private java.lang.Integer priorityID;

    private java.lang.String lock;

    private java.lang.Integer lockID;

    private java.lang.String queue;

    private java.lang.Integer queueID;

    private int ownerID;

    public TicketCore() {
    }

    public TicketCore(
           java.lang.String title,
           java.lang.String user,
           java.lang.Integer userID,
           java.lang.String state,
           java.lang.Integer stateID,
           java.lang.String priority,
           java.lang.Integer priorityID,
           java.lang.String lock,
           java.lang.Integer lockID,
           java.lang.String queue,
           java.lang.Integer queueID,
           int ownerID) {
           this.title = title;
           this.user = user;
           this.userID = userID;
           this.state = state;
           this.stateID = stateID;
           this.priority = priority;
           this.priorityID = priorityID;
           this.lock = lock;
           this.lockID = lockID;
           this.queue = queue;
           this.queueID = queueID;
           this.ownerID = ownerID;
    }


    /**
     * Gets the title value for this TicketCore.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TicketCore.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the user value for this TicketCore.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this TicketCore.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the userID value for this TicketCore.
     * 
     * @return userID
     */
    public java.lang.Integer getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this TicketCore.
     * 
     * @param userID
     */
    public void setUserID(java.lang.Integer userID) {
        this.userID = userID;
    }


    /**
     * Gets the state value for this TicketCore.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TicketCore.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the stateID value for this TicketCore.
     * 
     * @return stateID
     */
    public java.lang.Integer getStateID() {
        return stateID;
    }


    /**
     * Sets the stateID value for this TicketCore.
     * 
     * @param stateID
     */
    public void setStateID(java.lang.Integer stateID) {
        this.stateID = stateID;
    }


    /**
     * Gets the priority value for this TicketCore.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this TicketCore.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the priorityID value for this TicketCore.
     * 
     * @return priorityID
     */
    public java.lang.Integer getPriorityID() {
        return priorityID;
    }


    /**
     * Sets the priorityID value for this TicketCore.
     * 
     * @param priorityID
     */
    public void setPriorityID(java.lang.Integer priorityID) {
        this.priorityID = priorityID;
    }


    /**
     * Gets the lock value for this TicketCore.
     * 
     * @return lock
     */
    public java.lang.String getLock() {
        return lock;
    }


    /**
     * Sets the lock value for this TicketCore.
     * 
     * @param lock
     */
    public void setLock(java.lang.String lock) {
        this.lock = lock;
    }


    /**
     * Gets the lockID value for this TicketCore.
     * 
     * @return lockID
     */
    public java.lang.Integer getLockID() {
        return lockID;
    }


    /**
     * Sets the lockID value for this TicketCore.
     * 
     * @param lockID
     */
    public void setLockID(java.lang.Integer lockID) {
        this.lockID = lockID;
    }


    /**
     * Gets the queue value for this TicketCore.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this TicketCore.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the queueID value for this TicketCore.
     * 
     * @return queueID
     */
    public java.lang.Integer getQueueID() {
        return queueID;
    }


    /**
     * Sets the queueID value for this TicketCore.
     * 
     * @param queueID
     */
    public void setQueueID(java.lang.Integer queueID) {
        this.queueID = queueID;
    }


    /**
     * Gets the ownerID value for this TicketCore.
     * 
     * @return ownerID
     */
    public int getOwnerID() {
        return ownerID;
    }


    /**
     * Sets the ownerID value for this TicketCore.
     * 
     * @param ownerID
     */
    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketCore)) return false;
        TicketCore other = (TicketCore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateID==null && other.getStateID()==null) || 
             (this.stateID!=null &&
              this.stateID.equals(other.getStateID()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.priorityID==null && other.getPriorityID()==null) || 
             (this.priorityID!=null &&
              this.priorityID.equals(other.getPriorityID()))) &&
            ((this.lock==null && other.getLock()==null) || 
             (this.lock!=null &&
              this.lock.equals(other.getLock()))) &&
            ((this.lockID==null && other.getLockID()==null) || 
             (this.lockID!=null &&
              this.lockID.equals(other.getLockID()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.queueID==null && other.getQueueID()==null) || 
             (this.queueID!=null &&
              this.queueID.equals(other.getQueueID()))) &&
            this.ownerID == other.getOwnerID();
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateID() != null) {
            _hashCode += getStateID().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getPriorityID() != null) {
            _hashCode += getPriorityID().hashCode();
        }
        if (getLock() != null) {
            _hashCode += getLock().hashCode();
        }
        if (getLockID() != null) {
            _hashCode += getLockID().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getQueueID() != null) {
            _hashCode += getQueueID().hashCode();
        }
        _hashCode += getOwnerID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketCore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketCore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriorityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Lock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LockID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OwnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

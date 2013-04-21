/**
 * Ticket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class Ticket  implements java.io.Serializable {
    private java.lang.Integer ticketID;

    private java.lang.Long ticketNumber;

    private java.lang.String title;

    private java.lang.Integer age;

    private java.lang.String state;

    private java.lang.Integer stateID;

    private java.lang.String stateType;

    private java.lang.String priority;

    private java.lang.Integer priorityID;

    private java.lang.String lock;

    private java.lang.Integer lockID;

    private java.lang.Integer unlockTimeout;

    private java.lang.String queue;

    private java.lang.Integer queueID;

    private java.lang.Integer groupID;

    private java.lang.String customerID;

    private java.lang.String customerUserID;

    private java.lang.String owner;

    private java.lang.Integer ownerID;

    private java.lang.String responsible;

    private java.lang.Integer responsibleID;

    private java.lang.String type;

    private java.lang.Integer typeID;

    private java.lang.Integer SLAID;

    private java.lang.Integer serviceID;

    private java.util.Calendar created;

    private java.lang.Long createTimeUnix;

    private java.lang.Long untilTime;

    private java.lang.Long escalationStartTime;

    private java.lang.Long escalationResponseTime;

    private java.lang.Long escalationSolutionTime;

    public Ticket() {
    }

    public Ticket(
           java.lang.Integer ticketID,
           java.lang.Long ticketNumber,
           java.lang.String title,
           java.lang.Integer age,
           java.lang.String state,
           java.lang.Integer stateID,
           java.lang.String stateType,
           java.lang.String priority,
           java.lang.Integer priorityID,
           java.lang.String lock,
           java.lang.Integer lockID,
           java.lang.Integer unlockTimeout,
           java.lang.String queue,
           java.lang.Integer queueID,
           java.lang.Integer groupID,
           java.lang.String customerID,
           java.lang.String customerUserID,
           java.lang.String owner,
           java.lang.Integer ownerID,
           java.lang.String responsible,
           java.lang.Integer responsibleID,
           java.lang.String type,
           java.lang.Integer typeID,
           java.lang.Integer SLAID,
           java.lang.Integer serviceID,
           java.util.Calendar created,
           java.lang.Long createTimeUnix,
           java.lang.Long untilTime,
           java.lang.Long escalationStartTime,
           java.lang.Long escalationResponseTime,
           java.lang.Long escalationSolutionTime) {
           this.ticketID = ticketID;
           this.ticketNumber = ticketNumber;
           this.title = title;
           this.age = age;
           this.state = state;
           this.stateID = stateID;
           this.stateType = stateType;
           this.priority = priority;
           this.priorityID = priorityID;
           this.lock = lock;
           this.lockID = lockID;
           this.unlockTimeout = unlockTimeout;
           this.queue = queue;
           this.queueID = queueID;
           this.groupID = groupID;
           this.customerID = customerID;
           this.customerUserID = customerUserID;
           this.owner = owner;
           this.ownerID = ownerID;
           this.responsible = responsible;
           this.responsibleID = responsibleID;
           this.type = type;
           this.typeID = typeID;
           this.SLAID = SLAID;
           this.serviceID = serviceID;
           this.created = created;
           this.createTimeUnix = createTimeUnix;
           this.untilTime = untilTime;
           this.escalationStartTime = escalationStartTime;
           this.escalationResponseTime = escalationResponseTime;
           this.escalationSolutionTime = escalationSolutionTime;
    }


    /**
     * Gets the ticketID value for this Ticket.
     * 
     * @return ticketID
     */
    public java.lang.Integer getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this Ticket.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Integer ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the ticketNumber value for this Ticket.
     * 
     * @return ticketNumber
     */
    public java.lang.Long getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this Ticket.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.Long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the title value for this Ticket.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Ticket.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the age value for this Ticket.
     * 
     * @return age
     */
    public java.lang.Integer getAge() {
        return age;
    }


    /**
     * Sets the age value for this Ticket.
     * 
     * @param age
     */
    public void setAge(java.lang.Integer age) {
        this.age = age;
    }


    /**
     * Gets the state value for this Ticket.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Ticket.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the stateID value for this Ticket.
     * 
     * @return stateID
     */
    public java.lang.Integer getStateID() {
        return stateID;
    }


    /**
     * Sets the stateID value for this Ticket.
     * 
     * @param stateID
     */
    public void setStateID(java.lang.Integer stateID) {
        this.stateID = stateID;
    }


    /**
     * Gets the stateType value for this Ticket.
     * 
     * @return stateType
     */
    public java.lang.String getStateType() {
        return stateType;
    }


    /**
     * Sets the stateType value for this Ticket.
     * 
     * @param stateType
     */
    public void setStateType(java.lang.String stateType) {
        this.stateType = stateType;
    }


    /**
     * Gets the priority value for this Ticket.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Ticket.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the priorityID value for this Ticket.
     * 
     * @return priorityID
     */
    public java.lang.Integer getPriorityID() {
        return priorityID;
    }


    /**
     * Sets the priorityID value for this Ticket.
     * 
     * @param priorityID
     */
    public void setPriorityID(java.lang.Integer priorityID) {
        this.priorityID = priorityID;
    }


    /**
     * Gets the lock value for this Ticket.
     * 
     * @return lock
     */
    public java.lang.String getLock() {
        return lock;
    }


    /**
     * Sets the lock value for this Ticket.
     * 
     * @param lock
     */
    public void setLock(java.lang.String lock) {
        this.lock = lock;
    }


    /**
     * Gets the lockID value for this Ticket.
     * 
     * @return lockID
     */
    public java.lang.Integer getLockID() {
        return lockID;
    }


    /**
     * Sets the lockID value for this Ticket.
     * 
     * @param lockID
     */
    public void setLockID(java.lang.Integer lockID) {
        this.lockID = lockID;
    }


    /**
     * Gets the unlockTimeout value for this Ticket.
     * 
     * @return unlockTimeout
     */
    public java.lang.Integer getUnlockTimeout() {
        return unlockTimeout;
    }


    /**
     * Sets the unlockTimeout value for this Ticket.
     * 
     * @param unlockTimeout
     */
    public void setUnlockTimeout(java.lang.Integer unlockTimeout) {
        this.unlockTimeout = unlockTimeout;
    }


    /**
     * Gets the queue value for this Ticket.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this Ticket.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the queueID value for this Ticket.
     * 
     * @return queueID
     */
    public java.lang.Integer getQueueID() {
        return queueID;
    }


    /**
     * Sets the queueID value for this Ticket.
     * 
     * @param queueID
     */
    public void setQueueID(java.lang.Integer queueID) {
        this.queueID = queueID;
    }


    /**
     * Gets the groupID value for this Ticket.
     * 
     * @return groupID
     */
    public java.lang.Integer getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this Ticket.
     * 
     * @param groupID
     */
    public void setGroupID(java.lang.Integer groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the customerID value for this Ticket.
     * 
     * @return customerID
     */
    public java.lang.String getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this Ticket.
     * 
     * @param customerID
     */
    public void setCustomerID(java.lang.String customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the customerUserID value for this Ticket.
     * 
     * @return customerUserID
     */
    public java.lang.String getCustomerUserID() {
        return customerUserID;
    }


    /**
     * Sets the customerUserID value for this Ticket.
     * 
     * @param customerUserID
     */
    public void setCustomerUserID(java.lang.String customerUserID) {
        this.customerUserID = customerUserID;
    }


    /**
     * Gets the owner value for this Ticket.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Ticket.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerID value for this Ticket.
     * 
     * @return ownerID
     */
    public java.lang.Integer getOwnerID() {
        return ownerID;
    }


    /**
     * Sets the ownerID value for this Ticket.
     * 
     * @param ownerID
     */
    public void setOwnerID(java.lang.Integer ownerID) {
        this.ownerID = ownerID;
    }


    /**
     * Gets the responsible value for this Ticket.
     * 
     * @return responsible
     */
    public java.lang.String getResponsible() {
        return responsible;
    }


    /**
     * Sets the responsible value for this Ticket.
     * 
     * @param responsible
     */
    public void setResponsible(java.lang.String responsible) {
        this.responsible = responsible;
    }


    /**
     * Gets the responsibleID value for this Ticket.
     * 
     * @return responsibleID
     */
    public java.lang.Integer getResponsibleID() {
        return responsibleID;
    }


    /**
     * Sets the responsibleID value for this Ticket.
     * 
     * @param responsibleID
     */
    public void setResponsibleID(java.lang.Integer responsibleID) {
        this.responsibleID = responsibleID;
    }


    /**
     * Gets the type value for this Ticket.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Ticket.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the typeID value for this Ticket.
     * 
     * @return typeID
     */
    public java.lang.Integer getTypeID() {
        return typeID;
    }


    /**
     * Sets the typeID value for this Ticket.
     * 
     * @param typeID
     */
    public void setTypeID(java.lang.Integer typeID) {
        this.typeID = typeID;
    }


    /**
     * Gets the SLAID value for this Ticket.
     * 
     * @return SLAID
     */
    public java.lang.Integer getSLAID() {
        return SLAID;
    }


    /**
     * Sets the SLAID value for this Ticket.
     * 
     * @param SLAID
     */
    public void setSLAID(java.lang.Integer SLAID) {
        this.SLAID = SLAID;
    }


    /**
     * Gets the serviceID value for this Ticket.
     * 
     * @return serviceID
     */
    public java.lang.Integer getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this Ticket.
     * 
     * @param serviceID
     */
    public void setServiceID(java.lang.Integer serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the created value for this Ticket.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this Ticket.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the createTimeUnix value for this Ticket.
     * 
     * @return createTimeUnix
     */
    public java.lang.Long getCreateTimeUnix() {
        return createTimeUnix;
    }


    /**
     * Sets the createTimeUnix value for this Ticket.
     * 
     * @param createTimeUnix
     */
    public void setCreateTimeUnix(java.lang.Long createTimeUnix) {
        this.createTimeUnix = createTimeUnix;
    }


    /**
     * Gets the untilTime value for this Ticket.
     * 
     * @return untilTime
     */
    public java.lang.Long getUntilTime() {
        return untilTime;
    }


    /**
     * Sets the untilTime value for this Ticket.
     * 
     * @param untilTime
     */
    public void setUntilTime(java.lang.Long untilTime) {
        this.untilTime = untilTime;
    }


    /**
     * Gets the escalationStartTime value for this Ticket.
     * 
     * @return escalationStartTime
     */
    public java.lang.Long getEscalationStartTime() {
        return escalationStartTime;
    }


    /**
     * Sets the escalationStartTime value for this Ticket.
     * 
     * @param escalationStartTime
     */
    public void setEscalationStartTime(java.lang.Long escalationStartTime) {
        this.escalationStartTime = escalationStartTime;
    }


    /**
     * Gets the escalationResponseTime value for this Ticket.
     * 
     * @return escalationResponseTime
     */
    public java.lang.Long getEscalationResponseTime() {
        return escalationResponseTime;
    }


    /**
     * Sets the escalationResponseTime value for this Ticket.
     * 
     * @param escalationResponseTime
     */
    public void setEscalationResponseTime(java.lang.Long escalationResponseTime) {
        this.escalationResponseTime = escalationResponseTime;
    }


    /**
     * Gets the escalationSolutionTime value for this Ticket.
     * 
     * @return escalationSolutionTime
     */
    public java.lang.Long getEscalationSolutionTime() {
        return escalationSolutionTime;
    }


    /**
     * Sets the escalationSolutionTime value for this Ticket.
     * 
     * @param escalationSolutionTime
     */
    public void setEscalationSolutionTime(java.lang.Long escalationSolutionTime) {
        this.escalationSolutionTime = escalationSolutionTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ticket)) return false;
        Ticket other = (Ticket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateID==null && other.getStateID()==null) || 
             (this.stateID!=null &&
              this.stateID.equals(other.getStateID()))) &&
            ((this.stateType==null && other.getStateType()==null) || 
             (this.stateType!=null &&
              this.stateType.equals(other.getStateType()))) &&
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
            ((this.unlockTimeout==null && other.getUnlockTimeout()==null) || 
             (this.unlockTimeout!=null &&
              this.unlockTimeout.equals(other.getUnlockTimeout()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.queueID==null && other.getQueueID()==null) || 
             (this.queueID!=null &&
              this.queueID.equals(other.getQueueID()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.customerID==null && other.getCustomerID()==null) || 
             (this.customerID!=null &&
              this.customerID.equals(other.getCustomerID()))) &&
            ((this.customerUserID==null && other.getCustomerUserID()==null) || 
             (this.customerUserID!=null &&
              this.customerUserID.equals(other.getCustomerUserID()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerID==null && other.getOwnerID()==null) || 
             (this.ownerID!=null &&
              this.ownerID.equals(other.getOwnerID()))) &&
            ((this.responsible==null && other.getResponsible()==null) || 
             (this.responsible!=null &&
              this.responsible.equals(other.getResponsible()))) &&
            ((this.responsibleID==null && other.getResponsibleID()==null) || 
             (this.responsibleID!=null &&
              this.responsibleID.equals(other.getResponsibleID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.typeID==null && other.getTypeID()==null) || 
             (this.typeID!=null &&
              this.typeID.equals(other.getTypeID()))) &&
            ((this.SLAID==null && other.getSLAID()==null) || 
             (this.SLAID!=null &&
              this.SLAID.equals(other.getSLAID()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.createTimeUnix==null && other.getCreateTimeUnix()==null) || 
             (this.createTimeUnix!=null &&
              this.createTimeUnix.equals(other.getCreateTimeUnix()))) &&
            ((this.untilTime==null && other.getUntilTime()==null) || 
             (this.untilTime!=null &&
              this.untilTime.equals(other.getUntilTime()))) &&
            ((this.escalationStartTime==null && other.getEscalationStartTime()==null) || 
             (this.escalationStartTime!=null &&
              this.escalationStartTime.equals(other.getEscalationStartTime()))) &&
            ((this.escalationResponseTime==null && other.getEscalationResponseTime()==null) || 
             (this.escalationResponseTime!=null &&
              this.escalationResponseTime.equals(other.getEscalationResponseTime()))) &&
            ((this.escalationSolutionTime==null && other.getEscalationSolutionTime()==null) || 
             (this.escalationSolutionTime!=null &&
              this.escalationSolutionTime.equals(other.getEscalationSolutionTime())));
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
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateID() != null) {
            _hashCode += getStateID().hashCode();
        }
        if (getStateType() != null) {
            _hashCode += getStateType().hashCode();
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
        if (getUnlockTimeout() != null) {
            _hashCode += getUnlockTimeout().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getQueueID() != null) {
            _hashCode += getQueueID().hashCode();
        }
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getCustomerID() != null) {
            _hashCode += getCustomerID().hashCode();
        }
        if (getCustomerUserID() != null) {
            _hashCode += getCustomerUserID().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerID() != null) {
            _hashCode += getOwnerID().hashCode();
        }
        if (getResponsible() != null) {
            _hashCode += getResponsible().hashCode();
        }
        if (getResponsibleID() != null) {
            _hashCode += getResponsibleID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTypeID() != null) {
            _hashCode += getTypeID().hashCode();
        }
        if (getSLAID() != null) {
            _hashCode += getSLAID().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreateTimeUnix() != null) {
            _hashCode += getCreateTimeUnix().hashCode();
        }
        if (getUntilTime() != null) {
            _hashCode += getUntilTime().hashCode();
        }
        if (getEscalationStartTime() != null) {
            _hashCode += getEscalationStartTime().hashCode();
        }
        if (getEscalationResponseTime() != null) {
            _hashCode += getEscalationResponseTime().hashCode();
        }
        if (getEscalationSolutionTime() != null) {
            _hashCode += getEscalationSolutionTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ticket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Ticket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Age"));
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
        elemField.setFieldName("stateType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("unlockTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnlockTimeout"));
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
        elemField.setFieldName("groupID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OwnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Responsible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponsibleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLAID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLAID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTimeUnix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreateTimeUnix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("untilTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UntilTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscalationStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationResponseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscalationResponseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalationSolutionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EscalationSolutionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

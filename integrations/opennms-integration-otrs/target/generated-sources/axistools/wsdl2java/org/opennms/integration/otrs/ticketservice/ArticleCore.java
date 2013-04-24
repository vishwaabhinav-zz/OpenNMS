/**
 * ArticleCore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class ArticleCore  implements java.io.Serializable {
    private java.lang.Integer ticketID;

    private java.lang.Long ticketNumber;

    private java.lang.Integer articleTypeID;

    private java.lang.String articleType;

    private java.lang.Integer senderTypeID;

    private java.lang.String senderType;

    private java.lang.String from;

    private java.lang.String subject;

    private java.lang.String contentType;

    private java.lang.String historyType;

    private java.lang.String historyComment;

    private java.lang.String body;

    private java.lang.Integer userID;

    private java.lang.String user;

    public ArticleCore() {
    }

    public ArticleCore(
           java.lang.Integer ticketID,
           java.lang.Long ticketNumber,
           java.lang.Integer articleTypeID,
           java.lang.String articleType,
           java.lang.Integer senderTypeID,
           java.lang.String senderType,
           java.lang.String from,
           java.lang.String subject,
           java.lang.String contentType,
           java.lang.String historyType,
           java.lang.String historyComment,
           java.lang.String body,
           java.lang.Integer userID,
           java.lang.String user) {
           this.ticketID = ticketID;
           this.ticketNumber = ticketNumber;
           this.articleTypeID = articleTypeID;
           this.articleType = articleType;
           this.senderTypeID = senderTypeID;
           this.senderType = senderType;
           this.from = from;
           this.subject = subject;
           this.contentType = contentType;
           this.historyType = historyType;
           this.historyComment = historyComment;
           this.body = body;
           this.userID = userID;
           this.user = user;
    }


    /**
     * Gets the ticketID value for this ArticleCore.
     * 
     * @return ticketID
     */
    public java.lang.Integer getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this ArticleCore.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Integer ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the ticketNumber value for this ArticleCore.
     * 
     * @return ticketNumber
     */
    public java.lang.Long getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this ArticleCore.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.Long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the articleTypeID value for this ArticleCore.
     * 
     * @return articleTypeID
     */
    public java.lang.Integer getArticleTypeID() {
        return articleTypeID;
    }


    /**
     * Sets the articleTypeID value for this ArticleCore.
     * 
     * @param articleTypeID
     */
    public void setArticleTypeID(java.lang.Integer articleTypeID) {
        this.articleTypeID = articleTypeID;
    }


    /**
     * Gets the articleType value for this ArticleCore.
     * 
     * @return articleType
     */
    public java.lang.String getArticleType() {
        return articleType;
    }


    /**
     * Sets the articleType value for this ArticleCore.
     * 
     * @param articleType
     */
    public void setArticleType(java.lang.String articleType) {
        this.articleType = articleType;
    }


    /**
     * Gets the senderTypeID value for this ArticleCore.
     * 
     * @return senderTypeID
     */
    public java.lang.Integer getSenderTypeID() {
        return senderTypeID;
    }


    /**
     * Sets the senderTypeID value for this ArticleCore.
     * 
     * @param senderTypeID
     */
    public void setSenderTypeID(java.lang.Integer senderTypeID) {
        this.senderTypeID = senderTypeID;
    }


    /**
     * Gets the senderType value for this ArticleCore.
     * 
     * @return senderType
     */
    public java.lang.String getSenderType() {
        return senderType;
    }


    /**
     * Sets the senderType value for this ArticleCore.
     * 
     * @param senderType
     */
    public void setSenderType(java.lang.String senderType) {
        this.senderType = senderType;
    }


    /**
     * Gets the from value for this ArticleCore.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this ArticleCore.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the subject value for this ArticleCore.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ArticleCore.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the contentType value for this ArticleCore.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this ArticleCore.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the historyType value for this ArticleCore.
     * 
     * @return historyType
     */
    public java.lang.String getHistoryType() {
        return historyType;
    }


    /**
     * Sets the historyType value for this ArticleCore.
     * 
     * @param historyType
     */
    public void setHistoryType(java.lang.String historyType) {
        this.historyType = historyType;
    }


    /**
     * Gets the historyComment value for this ArticleCore.
     * 
     * @return historyComment
     */
    public java.lang.String getHistoryComment() {
        return historyComment;
    }


    /**
     * Sets the historyComment value for this ArticleCore.
     * 
     * @param historyComment
     */
    public void setHistoryComment(java.lang.String historyComment) {
        this.historyComment = historyComment;
    }


    /**
     * Gets the body value for this ArticleCore.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this ArticleCore.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the userID value for this ArticleCore.
     * 
     * @return userID
     */
    public java.lang.Integer getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this ArticleCore.
     * 
     * @param userID
     */
    public void setUserID(java.lang.Integer userID) {
        this.userID = userID;
    }


    /**
     * Gets the user value for this ArticleCore.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this ArticleCore.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleCore)) return false;
        ArticleCore other = (ArticleCore) obj;
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
            ((this.articleTypeID==null && other.getArticleTypeID()==null) || 
             (this.articleTypeID!=null &&
              this.articleTypeID.equals(other.getArticleTypeID()))) &&
            ((this.articleType==null && other.getArticleType()==null) || 
             (this.articleType!=null &&
              this.articleType.equals(other.getArticleType()))) &&
            ((this.senderTypeID==null && other.getSenderTypeID()==null) || 
             (this.senderTypeID!=null &&
              this.senderTypeID.equals(other.getSenderTypeID()))) &&
            ((this.senderType==null && other.getSenderType()==null) || 
             (this.senderType!=null &&
              this.senderType.equals(other.getSenderType()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.historyType==null && other.getHistoryType()==null) || 
             (this.historyType!=null &&
              this.historyType.equals(other.getHistoryType()))) &&
            ((this.historyComment==null && other.getHistoryComment()==null) || 
             (this.historyComment!=null &&
              this.historyComment.equals(other.getHistoryComment()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        if (getArticleTypeID() != null) {
            _hashCode += getArticleTypeID().hashCode();
        }
        if (getArticleType() != null) {
            _hashCode += getArticleType().hashCode();
        }
        if (getSenderTypeID() != null) {
            _hashCode += getSenderTypeID().hashCode();
        }
        if (getSenderType() != null) {
            _hashCode += getSenderType().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getHistoryType() != null) {
            _hashCode += getHistoryType().hashCode();
        }
        if (getHistoryComment() != null) {
            _hashCode += getHistoryComment().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleCore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArticleCore"));
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
        elemField.setFieldName("articleTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArticleTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArticleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SenderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HistoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HistoryComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

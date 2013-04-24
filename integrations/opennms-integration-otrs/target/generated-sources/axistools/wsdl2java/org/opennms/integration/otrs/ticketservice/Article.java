/**
 * Article.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class Article  implements java.io.Serializable {
    private java.lang.Integer articleID;

    private java.lang.Integer ticketID;

    private java.lang.Integer articleTypeID;

    private java.lang.String articleType;

    private java.lang.Integer senderTypeID;

    private java.lang.String senderType;

    private java.lang.String from;

    private java.lang.String to;

    private java.lang.String CC;

    private java.lang.String subject;

    private java.lang.String contentType;

    private java.lang.String messageID;

    private java.lang.Long incomingTime;

    private java.lang.String contentPath;

    private java.lang.Integer validID;

    private java.lang.String body;

    public Article() {
    }

    public Article(
           java.lang.Integer articleID,
           java.lang.Integer ticketID,
           java.lang.Integer articleTypeID,
           java.lang.String articleType,
           java.lang.Integer senderTypeID,
           java.lang.String senderType,
           java.lang.String from,
           java.lang.String to,
           java.lang.String CC,
           java.lang.String subject,
           java.lang.String contentType,
           java.lang.String messageID,
           java.lang.Long incomingTime,
           java.lang.String contentPath,
           java.lang.Integer validID,
           java.lang.String body) {
           this.articleID = articleID;
           this.ticketID = ticketID;
           this.articleTypeID = articleTypeID;
           this.articleType = articleType;
           this.senderTypeID = senderTypeID;
           this.senderType = senderType;
           this.from = from;
           this.to = to;
           this.CC = CC;
           this.subject = subject;
           this.contentType = contentType;
           this.messageID = messageID;
           this.incomingTime = incomingTime;
           this.contentPath = contentPath;
           this.validID = validID;
           this.body = body;
    }


    /**
     * Gets the articleID value for this Article.
     * 
     * @return articleID
     */
    public java.lang.Integer getArticleID() {
        return articleID;
    }


    /**
     * Sets the articleID value for this Article.
     * 
     * @param articleID
     */
    public void setArticleID(java.lang.Integer articleID) {
        this.articleID = articleID;
    }


    /**
     * Gets the ticketID value for this Article.
     * 
     * @return ticketID
     */
    public java.lang.Integer getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this Article.
     * 
     * @param ticketID
     */
    public void setTicketID(java.lang.Integer ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the articleTypeID value for this Article.
     * 
     * @return articleTypeID
     */
    public java.lang.Integer getArticleTypeID() {
        return articleTypeID;
    }


    /**
     * Sets the articleTypeID value for this Article.
     * 
     * @param articleTypeID
     */
    public void setArticleTypeID(java.lang.Integer articleTypeID) {
        this.articleTypeID = articleTypeID;
    }


    /**
     * Gets the articleType value for this Article.
     * 
     * @return articleType
     */
    public java.lang.String getArticleType() {
        return articleType;
    }


    /**
     * Sets the articleType value for this Article.
     * 
     * @param articleType
     */
    public void setArticleType(java.lang.String articleType) {
        this.articleType = articleType;
    }


    /**
     * Gets the senderTypeID value for this Article.
     * 
     * @return senderTypeID
     */
    public java.lang.Integer getSenderTypeID() {
        return senderTypeID;
    }


    /**
     * Sets the senderTypeID value for this Article.
     * 
     * @param senderTypeID
     */
    public void setSenderTypeID(java.lang.Integer senderTypeID) {
        this.senderTypeID = senderTypeID;
    }


    /**
     * Gets the senderType value for this Article.
     * 
     * @return senderType
     */
    public java.lang.String getSenderType() {
        return senderType;
    }


    /**
     * Sets the senderType value for this Article.
     * 
     * @param senderType
     */
    public void setSenderType(java.lang.String senderType) {
        this.senderType = senderType;
    }


    /**
     * Gets the from value for this Article.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this Article.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this Article.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this Article.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the CC value for this Article.
     * 
     * @return CC
     */
    public java.lang.String getCC() {
        return CC;
    }


    /**
     * Sets the CC value for this Article.
     * 
     * @param CC
     */
    public void setCC(java.lang.String CC) {
        this.CC = CC;
    }


    /**
     * Gets the subject value for this Article.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Article.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the contentType value for this Article.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this Article.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the messageID value for this Article.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this Article.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the incomingTime value for this Article.
     * 
     * @return incomingTime
     */
    public java.lang.Long getIncomingTime() {
        return incomingTime;
    }


    /**
     * Sets the incomingTime value for this Article.
     * 
     * @param incomingTime
     */
    public void setIncomingTime(java.lang.Long incomingTime) {
        this.incomingTime = incomingTime;
    }


    /**
     * Gets the contentPath value for this Article.
     * 
     * @return contentPath
     */
    public java.lang.String getContentPath() {
        return contentPath;
    }


    /**
     * Sets the contentPath value for this Article.
     * 
     * @param contentPath
     */
    public void setContentPath(java.lang.String contentPath) {
        this.contentPath = contentPath;
    }


    /**
     * Gets the validID value for this Article.
     * 
     * @return validID
     */
    public java.lang.Integer getValidID() {
        return validID;
    }


    /**
     * Sets the validID value for this Article.
     * 
     * @param validID
     */
    public void setValidID(java.lang.Integer validID) {
        this.validID = validID;
    }


    /**
     * Gets the body value for this Article.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this Article.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Article)) return false;
        Article other = (Article) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.articleID==null && other.getArticleID()==null) || 
             (this.articleID!=null &&
              this.articleID.equals(other.getArticleID()))) &&
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
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
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.CC==null && other.getCC()==null) || 
             (this.CC!=null &&
              this.CC.equals(other.getCC()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.incomingTime==null && other.getIncomingTime()==null) || 
             (this.incomingTime!=null &&
              this.incomingTime.equals(other.getIncomingTime()))) &&
            ((this.contentPath==null && other.getContentPath()==null) || 
             (this.contentPath!=null &&
              this.contentPath.equals(other.getContentPath()))) &&
            ((this.validID==null && other.getValidID()==null) || 
             (this.validID!=null &&
              this.validID.equals(other.getValidID()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody())));
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
        if (getArticleID() != null) {
            _hashCode += getArticleID().hashCode();
        }
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
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
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getCC() != null) {
            _hashCode += getCC().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getIncomingTime() != null) {
            _hashCode += getIncomingTime().hashCode();
        }
        if (getContentPath() != null) {
            _hashCode += getContentPath().hashCode();
        }
        if (getValidID() != null) {
            _hashCode += getValidID().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Article.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Article"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArticleID"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "To"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncomingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContentPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Body"));
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

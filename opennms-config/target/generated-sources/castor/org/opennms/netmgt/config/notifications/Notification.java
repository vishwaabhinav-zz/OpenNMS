/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.notifications;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Notification.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Notification implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _status.
     */
    private java.lang.String _status;

    /**
     * Field _writeable.
     */
    private java.lang.String _writeable = "yes";

    /**
     * Field _uei.
     */
    private java.lang.String _uei;

    /**
     * Field _description.
     */
    private java.lang.String _description;

    /**
     * Field _rule.
     */
    private java.lang.String _rule;

    /**
     * Field _noticeQueue.
     */
    private java.lang.String _noticeQueue;

    /**
     * Field _destinationPath.
     */
    private java.lang.String _destinationPath;

    /**
     * Field _textMessage.
     */
    private java.lang.String _textMessage;

    /**
     * Field _subject.
     */
    private java.lang.String _subject;

    /**
     * Field _numericMessage.
     */
    private java.lang.String _numericMessage;

    /**
     * Field _eventSeverity.
     */
    private java.lang.String _eventSeverity;

    /**
     * Field _parameterList.
     */
    private java.util.List<org.opennms.netmgt.config.notifications.Parameter> _parameterList;

    /**
     * The varbind element
     */
    private org.opennms.netmgt.config.notifications.Varbind _varbind;


      //----------------/
     //- Constructors -/
    //----------------/

    public Notification() {
        super();
        setWriteable("yes");
        this._parameterList = new java.util.ArrayList<org.opennms.netmgt.config.notifications.Parameter>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final org.opennms.netmgt.config.notifications.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(vParameter);
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final int index,
            final org.opennms.netmgt.config.notifications.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     * Method enumerateParameter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.notifications.Parameter> enumerateParameter(
    ) {
        return java.util.Collections.enumeration(this._parameterList);
    }

    /**
     * Overrides the java.lang.Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final java.lang.Object obj) {
        if ( this == obj )
            return true;
        
        if (obj instanceof Notification) {
        
            Notification temp = (Notification)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._status != null) {
                if (temp._status == null) return false;
                else if (!(this._status.equals(temp._status))) 
                    return false;
            }
            else if (temp._status != null)
                return false;
            if (this._writeable != null) {
                if (temp._writeable == null) return false;
                else if (!(this._writeable.equals(temp._writeable))) 
                    return false;
            }
            else if (temp._writeable != null)
                return false;
            if (this._uei != null) {
                if (temp._uei == null) return false;
                else if (!(this._uei.equals(temp._uei))) 
                    return false;
            }
            else if (temp._uei != null)
                return false;
            if (this._description != null) {
                if (temp._description == null) return false;
                else if (!(this._description.equals(temp._description))) 
                    return false;
            }
            else if (temp._description != null)
                return false;
            if (this._rule != null) {
                if (temp._rule == null) return false;
                else if (!(this._rule.equals(temp._rule))) 
                    return false;
            }
            else if (temp._rule != null)
                return false;
            if (this._noticeQueue != null) {
                if (temp._noticeQueue == null) return false;
                else if (!(this._noticeQueue.equals(temp._noticeQueue))) 
                    return false;
            }
            else if (temp._noticeQueue != null)
                return false;
            if (this._destinationPath != null) {
                if (temp._destinationPath == null) return false;
                else if (!(this._destinationPath.equals(temp._destinationPath))) 
                    return false;
            }
            else if (temp._destinationPath != null)
                return false;
            if (this._textMessage != null) {
                if (temp._textMessage == null) return false;
                else if (!(this._textMessage.equals(temp._textMessage))) 
                    return false;
            }
            else if (temp._textMessage != null)
                return false;
            if (this._subject != null) {
                if (temp._subject == null) return false;
                else if (!(this._subject.equals(temp._subject))) 
                    return false;
            }
            else if (temp._subject != null)
                return false;
            if (this._numericMessage != null) {
                if (temp._numericMessage == null) return false;
                else if (!(this._numericMessage.equals(temp._numericMessage))) 
                    return false;
            }
            else if (temp._numericMessage != null)
                return false;
            if (this._eventSeverity != null) {
                if (temp._eventSeverity == null) return false;
                else if (!(this._eventSeverity.equals(temp._eventSeverity))) 
                    return false;
            }
            else if (temp._eventSeverity != null)
                return false;
            if (this._parameterList != null) {
                if (temp._parameterList == null) return false;
                else if (!(this._parameterList.equals(temp._parameterList))) 
                    return false;
            }
            else if (temp._parameterList != null)
                return false;
            if (this._varbind != null) {
                if (temp._varbind == null) return false;
                else if (!(this._varbind.equals(temp._varbind))) 
                    return false;
            }
            else if (temp._varbind != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'destinationPath'.
     * 
     * @return the value of field 'DestinationPath'.
     */
    public java.lang.String getDestinationPath(
    ) {
        return this._destinationPath;
    }

    /**
     * Returns the value of field 'eventSeverity'.
     * 
     * @return the value of field 'EventSeverity'.
     */
    public java.lang.String getEventSeverity(
    ) {
        return this._eventSeverity;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'noticeQueue'.
     * 
     * @return the value of field 'NoticeQueue'.
     */
    public java.lang.String getNoticeQueue(
    ) {
        return this._noticeQueue;
    }

    /**
     * Returns the value of field 'numericMessage'.
     * 
     * @return the value of field 'NumericMessage'.
     */
    public java.lang.String getNumericMessage(
    ) {
        return this._numericMessage;
    }

    /**
     * Method getParameter.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.notifications.Parameter at the
     * given index
     */
    public org.opennms.netmgt.config.notifications.Parameter getParameter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.notifications.Parameter) _parameterList.get(index);
    }

    /**
     * Method getParameter.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.notifications.Parameter[] getParameter(
    ) {
        org.opennms.netmgt.config.notifications.Parameter[] array = new org.opennms.netmgt.config.notifications.Parameter[0];
        return (org.opennms.netmgt.config.notifications.Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCollection.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.notifications.Parameter> getParameterCollection(
    ) {
        return this._parameterList;
    }

    /**
     * Method getParameterCount.
     * 
     * @return the size of this collection
     */
    public int getParameterCount(
    ) {
        return this._parameterList.size();
    }

    /**
     * Returns the value of field 'rule'.
     * 
     * @return the value of field 'Rule'.
     */
    public java.lang.String getRule(
    ) {
        return this._rule;
    }

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus(
    ) {
        return this._status;
    }

    /**
     * Returns the value of field 'subject'.
     * 
     * @return the value of field 'Subject'.
     */
    public java.lang.String getSubject(
    ) {
        return this._subject;
    }

    /**
     * Returns the value of field 'textMessage'.
     * 
     * @return the value of field 'TextMessage'.
     */
    public java.lang.String getTextMessage(
    ) {
        return this._textMessage;
    }

    /**
     * Returns the value of field 'uei'.
     * 
     * @return the value of field 'Uei'.
     */
    public java.lang.String getUei(
    ) {
        return this._uei;
    }

    /**
     * Returns the value of field 'varbind'. The field 'varbind'
     * has the following description: The varbind element
     * 
     * @return the value of field 'Varbind'.
     */
    public org.opennms.netmgt.config.notifications.Varbind getVarbind(
    ) {
        return this._varbind;
    }

    /**
     * Returns the value of field 'writeable'.
     * 
     * @return the value of field 'Writeable'.
     */
    public java.lang.String getWriteable(
    ) {
        return this._writeable;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = 17;
        
        long tmp;
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_status != null) {
           result = 37 * result + _status.hashCode();
        }
        if (_writeable != null) {
           result = 37 * result + _writeable.hashCode();
        }
        if (_uei != null) {
           result = 37 * result + _uei.hashCode();
        }
        if (_description != null) {
           result = 37 * result + _description.hashCode();
        }
        if (_rule != null) {
           result = 37 * result + _rule.hashCode();
        }
        if (_noticeQueue != null) {
           result = 37 * result + _noticeQueue.hashCode();
        }
        if (_destinationPath != null) {
           result = 37 * result + _destinationPath.hashCode();
        }
        if (_textMessage != null) {
           result = 37 * result + _textMessage.hashCode();
        }
        if (_subject != null) {
           result = 37 * result + _subject.hashCode();
        }
        if (_numericMessage != null) {
           result = 37 * result + _numericMessage.hashCode();
        }
        if (_eventSeverity != null) {
           result = 37 * result + _eventSeverity.hashCode();
        }
        if (_parameterList != null) {
           result = 37 * result + _parameterList.hashCode();
        }
        if (_varbind != null) {
           result = 37 * result + _varbind.hashCode();
        }
        
        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateParameter.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.notifications.Parameter> iterateParameter(
    ) {
        return this._parameterList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllParameter(
    ) {
        this._parameterList.clear();
    }

    /**
     * Method removeParameter.
     * 
     * @param vParameter
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameter(
            final org.opennms.netmgt.config.notifications.Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.notifications.Parameter removeParameterAt(
            final int index) {
        java.lang.Object obj = this._parameterList.remove(index);
        return (org.opennms.netmgt.config.notifications.Parameter) obj;
    }

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'destinationPath'.
     * 
     * @param destinationPath the value of field 'destinationPath'.
     */
    public void setDestinationPath(
            final java.lang.String destinationPath) {
        this._destinationPath = destinationPath;
    }

    /**
     * Sets the value of field 'eventSeverity'.
     * 
     * @param eventSeverity the value of field 'eventSeverity'.
     */
    public void setEventSeverity(
            final java.lang.String eventSeverity) {
        this._eventSeverity = eventSeverity;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'noticeQueue'.
     * 
     * @param noticeQueue the value of field 'noticeQueue'.
     */
    public void setNoticeQueue(
            final java.lang.String noticeQueue) {
        this._noticeQueue = noticeQueue;
    }

    /**
     * Sets the value of field 'numericMessage'.
     * 
     * @param numericMessage the value of field 'numericMessage'.
     */
    public void setNumericMessage(
            final java.lang.String numericMessage) {
        this._numericMessage = numericMessage;
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParameter(
            final int index,
            final org.opennms.netmgt.config.notifications.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("setParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        this._parameterList.set(index, vParameter);
    }

    /**
     * 
     * 
     * @param vParameterArray
     */
    public void setParameter(
            final org.opennms.netmgt.config.notifications.Parameter[] vParameterArray) {
        //-- copy array
        _parameterList.clear();
        
        for (int i = 0; i < vParameterArray.length; i++) {
                this._parameterList.add(vParameterArray[i]);
        }
    }

    /**
     * Sets the value of '_parameterList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vParameterList the Vector to copy.
     */
    public void setParameter(
            final java.util.List<org.opennms.netmgt.config.notifications.Parameter> vParameterList) {
        // copy vector
        this._parameterList.clear();
        
        this._parameterList.addAll(vParameterList);
    }

    /**
     * Sets the value of '_parameterList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param parameterList the Vector to set.
     */
    public void setParameterCollection(
            final java.util.List<org.opennms.netmgt.config.notifications.Parameter> parameterList) {
        this._parameterList = parameterList;
    }

    /**
     * Sets the value of field 'rule'.
     * 
     * @param rule the value of field 'rule'.
     */
    public void setRule(
            final java.lang.String rule) {
        this._rule = rule;
    }

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
    }

    /**
     * Sets the value of field 'subject'.
     * 
     * @param subject the value of field 'subject'.
     */
    public void setSubject(
            final java.lang.String subject) {
        this._subject = subject;
    }

    /**
     * Sets the value of field 'textMessage'.
     * 
     * @param textMessage the value of field 'textMessage'.
     */
    public void setTextMessage(
            final java.lang.String textMessage) {
        this._textMessage = textMessage;
    }

    /**
     * Sets the value of field 'uei'.
     * 
     * @param uei the value of field 'uei'.
     */
    public void setUei(
            final java.lang.String uei) {
        this._uei = uei;
    }

    /**
     * Sets the value of field 'varbind'. The field 'varbind' has
     * the following description: The varbind element
     * 
     * @param varbind the value of field 'varbind'.
     */
    public void setVarbind(
            final org.opennms.netmgt.config.notifications.Varbind varbind) {
        this._varbind = varbind;
    }

    /**
     * Sets the value of field 'writeable'.
     * 
     * @param writeable the value of field 'writeable'.
     */
    public void setWriteable(
            final java.lang.String writeable) {
        this._writeable = writeable;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.opennms.netmgt.config.notifications.Notification
     */
    public static org.opennms.netmgt.config.notifications.Notification unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifications.Notification) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifications.Notification.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}

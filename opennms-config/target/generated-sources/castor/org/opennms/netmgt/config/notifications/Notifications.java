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
 * Top-level element for the notifications.xml configuration
 *  file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Notifications implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Header containing information about this configuration
     *  file.
     */
    private org.opennms.netmgt.config.notifications.Header _header;

    /**
     * Field _notificationList.
     */
    private java.util.List<org.opennms.netmgt.config.notifications.Notification> _notificationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Notifications() {
        super();
        this._notificationList = new java.util.ArrayList<org.opennms.netmgt.config.notifications.Notification>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vNotification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNotification(
            final org.opennms.netmgt.config.notifications.Notification vNotification)
    throws java.lang.IndexOutOfBoundsException {
        this._notificationList.add(vNotification);
    }

    /**
     * 
     * 
     * @param index
     * @param vNotification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNotification(
            final int index,
            final org.opennms.netmgt.config.notifications.Notification vNotification)
    throws java.lang.IndexOutOfBoundsException {
        this._notificationList.add(index, vNotification);
    }

    /**
     * Method enumerateNotification.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.notifications.Notification> enumerateNotification(
    ) {
        return java.util.Collections.enumeration(this._notificationList);
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
        
        if (obj instanceof Notifications) {
        
            Notifications temp = (Notifications)obj;
            if (this._header != null) {
                if (temp._header == null) return false;
                else if (!(this._header.equals(temp._header))) 
                    return false;
            }
            else if (temp._header != null)
                return false;
            if (this._notificationList != null) {
                if (temp._notificationList == null) return false;
                else if (!(this._notificationList.equals(temp._notificationList))) 
                    return false;
            }
            else if (temp._notificationList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'header'. The field 'header' has
     * the following description: Header containing information
     * about this configuration
     *  file.
     * 
     * @return the value of field 'Header'.
     */
    public org.opennms.netmgt.config.notifications.Header getHeader(
    ) {
        return this._header;
    }

    /**
     * Method getNotification.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.notifications.Notification at the
     * given index
     */
    public org.opennms.netmgt.config.notifications.Notification getNotification(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._notificationList.size()) {
            throw new IndexOutOfBoundsException("getNotification: Index value '" + index + "' not in range [0.." + (this._notificationList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.notifications.Notification) _notificationList.get(index);
    }

    /**
     * Method getNotification.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.notifications.Notification[] getNotification(
    ) {
        org.opennms.netmgt.config.notifications.Notification[] array = new org.opennms.netmgt.config.notifications.Notification[0];
        return (org.opennms.netmgt.config.notifications.Notification[]) this._notificationList.toArray(array);
    }

    /**
     * Method getNotificationCollection.Returns a reference to
     * '_notificationList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.notifications.Notification> getNotificationCollection(
    ) {
        return this._notificationList;
    }

    /**
     * Method getNotificationCount.
     * 
     * @return the size of this collection
     */
    public int getNotificationCount(
    ) {
        return this._notificationList.size();
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
        if (_header != null) {
           result = 37 * result + _header.hashCode();
        }
        if (_notificationList != null) {
           result = 37 * result + _notificationList.hashCode();
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
     * Method iterateNotification.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.notifications.Notification> iterateNotification(
    ) {
        return this._notificationList.iterator();
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
    public void removeAllNotification(
    ) {
        this._notificationList.clear();
    }

    /**
     * Method removeNotification.
     * 
     * @param vNotification
     * @return true if the object was removed from the collection.
     */
    public boolean removeNotification(
            final org.opennms.netmgt.config.notifications.Notification vNotification) {
        boolean removed = _notificationList.remove(vNotification);
        return removed;
    }

    /**
     * Method removeNotificationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.notifications.Notification removeNotificationAt(
            final int index) {
        java.lang.Object obj = this._notificationList.remove(index);
        return (org.opennms.netmgt.config.notifications.Notification) obj;
    }

    /**
     * Sets the value of field 'header'. The field 'header' has the
     * following description: Header containing information about
     * this configuration
     *  file.
     * 
     * @param header the value of field 'header'.
     */
    public void setHeader(
            final org.opennms.netmgt.config.notifications.Header header) {
        this._header = header;
    }

    /**
     * 
     * 
     * @param index
     * @param vNotification
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNotification(
            final int index,
            final org.opennms.netmgt.config.notifications.Notification vNotification)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._notificationList.size()) {
            throw new IndexOutOfBoundsException("setNotification: Index value '" + index + "' not in range [0.." + (this._notificationList.size() - 1) + "]");
        }
        
        this._notificationList.set(index, vNotification);
    }

    /**
     * 
     * 
     * @param vNotificationArray
     */
    public void setNotification(
            final org.opennms.netmgt.config.notifications.Notification[] vNotificationArray) {
        //-- copy array
        _notificationList.clear();
        
        for (int i = 0; i < vNotificationArray.length; i++) {
                this._notificationList.add(vNotificationArray[i]);
        }
    }

    /**
     * Sets the value of '_notificationList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vNotificationList the Vector to copy.
     */
    public void setNotification(
            final java.util.List<org.opennms.netmgt.config.notifications.Notification> vNotificationList) {
        // copy vector
        this._notificationList.clear();
        
        this._notificationList.addAll(vNotificationList);
    }

    /**
     * Sets the value of '_notificationList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param notificationList the Vector to set.
     */
    public void setNotificationCollection(
            final java.util.List<org.opennms.netmgt.config.notifications.Notification> notificationList) {
        this._notificationList = notificationList;
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
     * org.opennms.netmgt.config.notifications.Notifications
     */
    public static org.opennms.netmgt.config.notifications.Notifications unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifications.Notifications) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifications.Notifications.class, reader);
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

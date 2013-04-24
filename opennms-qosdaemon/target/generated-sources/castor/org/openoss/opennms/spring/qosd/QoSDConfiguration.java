/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.openoss.opennms.spring.qosd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class QoSDConfiguration.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class QoSDConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _settingList.
     */
    private java.util.List<org.openoss.opennms.spring.qosd.Setting> _settingList;

    /**
     * Field _eventlist.
     */
    private org.openoss.opennms.spring.qosd.Eventlist _eventlist;


      //----------------/
     //- Constructors -/
    //----------------/

    public QoSDConfiguration() {
        super();
        this._settingList = new java.util.ArrayList<org.openoss.opennms.spring.qosd.Setting>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSetting
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSetting(
            final org.openoss.opennms.spring.qosd.Setting vSetting)
    throws java.lang.IndexOutOfBoundsException {
        this._settingList.add(vSetting);
    }

    /**
     * 
     * 
     * @param index
     * @param vSetting
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSetting(
            final int index,
            final org.openoss.opennms.spring.qosd.Setting vSetting)
    throws java.lang.IndexOutOfBoundsException {
        this._settingList.add(index, vSetting);
    }

    /**
     * Method enumerateSetting.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.openoss.opennms.spring.qosd.Setting> enumerateSetting(
    ) {
        return java.util.Collections.enumeration(this._settingList);
    }

    /**
     * Returns the value of field 'eventlist'.
     * 
     * @return the value of field 'Eventlist'.
     */
    public org.openoss.opennms.spring.qosd.Eventlist getEventlist(
    ) {
        return this._eventlist;
    }

    /**
     * Method getSetting.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.openoss.opennms.spring.qosd.Setting at the given index
     */
    public org.openoss.opennms.spring.qosd.Setting getSetting(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._settingList.size()) {
            throw new IndexOutOfBoundsException("getSetting: Index value '" + index + "' not in range [0.." + (this._settingList.size() - 1) + "]");
        }
        
        return (org.openoss.opennms.spring.qosd.Setting) _settingList.get(index);
    }

    /**
     * Method getSetting.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.openoss.opennms.spring.qosd.Setting[] getSetting(
    ) {
        org.openoss.opennms.spring.qosd.Setting[] array = new org.openoss.opennms.spring.qosd.Setting[0];
        return (org.openoss.opennms.spring.qosd.Setting[]) this._settingList.toArray(array);
    }

    /**
     * Method getSettingCollection.Returns a reference to
     * '_settingList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.openoss.opennms.spring.qosd.Setting> getSettingCollection(
    ) {
        return this._settingList;
    }

    /**
     * Method getSettingCount.
     * 
     * @return the size of this collection
     */
    public int getSettingCount(
    ) {
        return this._settingList.size();
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
     * Method iterateSetting.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.openoss.opennms.spring.qosd.Setting> iterateSetting(
    ) {
        return this._settingList.iterator();
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
    public void removeAllSetting(
    ) {
        this._settingList.clear();
    }

    /**
     * Method removeSetting.
     * 
     * @param vSetting
     * @return true if the object was removed from the collection.
     */
    public boolean removeSetting(
            final org.openoss.opennms.spring.qosd.Setting vSetting) {
        boolean removed = _settingList.remove(vSetting);
        return removed;
    }

    /**
     * Method removeSettingAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.openoss.opennms.spring.qosd.Setting removeSettingAt(
            final int index) {
        java.lang.Object obj = this._settingList.remove(index);
        return (org.openoss.opennms.spring.qosd.Setting) obj;
    }

    /**
     * Sets the value of field 'eventlist'.
     * 
     * @param eventlist the value of field 'eventlist'.
     */
    public void setEventlist(
            final org.openoss.opennms.spring.qosd.Eventlist eventlist) {
        this._eventlist = eventlist;
    }

    /**
     * 
     * 
     * @param index
     * @param vSetting
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSetting(
            final int index,
            final org.openoss.opennms.spring.qosd.Setting vSetting)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._settingList.size()) {
            throw new IndexOutOfBoundsException("setSetting: Index value '" + index + "' not in range [0.." + (this._settingList.size() - 1) + "]");
        }
        
        this._settingList.set(index, vSetting);
    }

    /**
     * 
     * 
     * @param vSettingArray
     */
    public void setSetting(
            final org.openoss.opennms.spring.qosd.Setting[] vSettingArray) {
        //-- copy array
        _settingList.clear();
        
        for (int i = 0; i < vSettingArray.length; i++) {
                this._settingList.add(vSettingArray[i]);
        }
    }

    /**
     * Sets the value of '_settingList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSettingList the Vector to copy.
     */
    public void setSetting(
            final java.util.List<org.openoss.opennms.spring.qosd.Setting> vSettingList) {
        // copy vector
        this._settingList.clear();
        
        this._settingList.addAll(vSettingList);
    }

    /**
     * Sets the value of '_settingList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param settingList the Vector to set.
     */
    public void setSettingCollection(
            final java.util.List<org.openoss.opennms.spring.qosd.Setting> settingList) {
        this._settingList = settingList;
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
     * org.openoss.opennms.spring.qosd.QoSDConfiguration
     */
    public static org.openoss.opennms.spring.qosd.QoSDConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.openoss.opennms.spring.qosd.QoSDConfiguration) Unmarshaller.unmarshal(org.openoss.opennms.spring.qosd.QoSDConfiguration.class, reader);
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

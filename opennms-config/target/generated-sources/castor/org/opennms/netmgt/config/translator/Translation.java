/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.translator;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * List of OpenNMS events for which the Event Translator 
 *  will subscribe for translation.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Translation implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This defines the allowable translations for a given
     *  event uei
     *  
     */
    private java.util.List<org.opennms.netmgt.config.translator.EventTranslationSpec> _eventTranslationSpecList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Translation() {
        super();
        this._eventTranslationSpecList = new java.util.ArrayList<org.opennms.netmgt.config.translator.EventTranslationSpec>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEventTranslationSpec
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventTranslationSpec(
            final org.opennms.netmgt.config.translator.EventTranslationSpec vEventTranslationSpec)
    throws java.lang.IndexOutOfBoundsException {
        this._eventTranslationSpecList.add(vEventTranslationSpec);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventTranslationSpec
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventTranslationSpec(
            final int index,
            final org.opennms.netmgt.config.translator.EventTranslationSpec vEventTranslationSpec)
    throws java.lang.IndexOutOfBoundsException {
        this._eventTranslationSpecList.add(index, vEventTranslationSpec);
    }

    /**
     * Method enumerateEventTranslationSpec.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.translator.EventTranslationSpec> enumerateEventTranslationSpec(
    ) {
        return java.util.Collections.enumeration(this._eventTranslationSpecList);
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
        
        if (obj instanceof Translation) {
        
            Translation temp = (Translation)obj;
            if (this._eventTranslationSpecList != null) {
                if (temp._eventTranslationSpecList == null) return false;
                else if (!(this._eventTranslationSpecList.equals(temp._eventTranslationSpecList))) 
                    return false;
            }
            else if (temp._eventTranslationSpecList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getEventTranslationSpec.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.translator.EventTranslationSpec at
     * the given index
     */
    public org.opennms.netmgt.config.translator.EventTranslationSpec getEventTranslationSpec(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventTranslationSpecList.size()) {
            throw new IndexOutOfBoundsException("getEventTranslationSpec: Index value '" + index + "' not in range [0.." + (this._eventTranslationSpecList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.translator.EventTranslationSpec) _eventTranslationSpecList.get(index);
    }

    /**
     * Method getEventTranslationSpec.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.translator.EventTranslationSpec[] getEventTranslationSpec(
    ) {
        org.opennms.netmgt.config.translator.EventTranslationSpec[] array = new org.opennms.netmgt.config.translator.EventTranslationSpec[0];
        return (org.opennms.netmgt.config.translator.EventTranslationSpec[]) this._eventTranslationSpecList.toArray(array);
    }

    /**
     * Method getEventTranslationSpecCollection.Returns a reference
     * to '_eventTranslationSpecList'. No type checking is
     * performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.translator.EventTranslationSpec> getEventTranslationSpecCollection(
    ) {
        return this._eventTranslationSpecList;
    }

    /**
     * Method getEventTranslationSpecCount.
     * 
     * @return the size of this collection
     */
    public int getEventTranslationSpecCount(
    ) {
        return this._eventTranslationSpecList.size();
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
        if (_eventTranslationSpecList != null) {
           result = 37 * result + _eventTranslationSpecList.hashCode();
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
     * Method iterateEventTranslationSpec.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.translator.EventTranslationSpec> iterateEventTranslationSpec(
    ) {
        return this._eventTranslationSpecList.iterator();
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
    public void removeAllEventTranslationSpec(
    ) {
        this._eventTranslationSpecList.clear();
    }

    /**
     * Method removeEventTranslationSpec.
     * 
     * @param vEventTranslationSpec
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventTranslationSpec(
            final org.opennms.netmgt.config.translator.EventTranslationSpec vEventTranslationSpec) {
        boolean removed = _eventTranslationSpecList.remove(vEventTranslationSpec);
        return removed;
    }

    /**
     * Method removeEventTranslationSpecAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.translator.EventTranslationSpec removeEventTranslationSpecAt(
            final int index) {
        java.lang.Object obj = this._eventTranslationSpecList.remove(index);
        return (org.opennms.netmgt.config.translator.EventTranslationSpec) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEventTranslationSpec
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventTranslationSpec(
            final int index,
            final org.opennms.netmgt.config.translator.EventTranslationSpec vEventTranslationSpec)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventTranslationSpecList.size()) {
            throw new IndexOutOfBoundsException("setEventTranslationSpec: Index value '" + index + "' not in range [0.." + (this._eventTranslationSpecList.size() - 1) + "]");
        }
        
        this._eventTranslationSpecList.set(index, vEventTranslationSpec);
    }

    /**
     * 
     * 
     * @param vEventTranslationSpecArray
     */
    public void setEventTranslationSpec(
            final org.opennms.netmgt.config.translator.EventTranslationSpec[] vEventTranslationSpecArray) {
        //-- copy array
        _eventTranslationSpecList.clear();
        
        for (int i = 0; i < vEventTranslationSpecArray.length; i++) {
                this._eventTranslationSpecList.add(vEventTranslationSpecArray[i]);
        }
    }

    /**
     * Sets the value of '_eventTranslationSpecList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vEventTranslationSpecList the Vector to copy.
     */
    public void setEventTranslationSpec(
            final java.util.List<org.opennms.netmgt.config.translator.EventTranslationSpec> vEventTranslationSpecList) {
        // copy vector
        this._eventTranslationSpecList.clear();
        
        this._eventTranslationSpecList.addAll(vEventTranslationSpecList);
    }

    /**
     * Sets the value of '_eventTranslationSpecList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param eventTranslationSpecList the Vector to set.
     */
    public void setEventTranslationSpecCollection(
            final java.util.List<org.opennms.netmgt.config.translator.EventTranslationSpec> eventTranslationSpecList) {
        this._eventTranslationSpecList = eventTranslationSpecList;
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
     * org.opennms.netmgt.config.translator.Translation
     */
    public static org.opennms.netmgt.config.translator.Translation unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.translator.Translation) Unmarshaller.unmarshal(org.opennms.netmgt.config.translator.Translation.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.vacuumd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class AutoEvents.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class AutoEvents implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * (THIS IS BEING DEPRECATED) actions modify the database based
     * on results of a
     *  trigger
     */
    private java.util.List<org.opennms.netmgt.config.vacuumd.AutoEvent> _autoEventList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AutoEvents() {
        super();
        this._autoEventList = new java.util.ArrayList<org.opennms.netmgt.config.vacuumd.AutoEvent>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAutoEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAutoEvent(
            final org.opennms.netmgt.config.vacuumd.AutoEvent vAutoEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._autoEventList.add(vAutoEvent);
    }

    /**
     * 
     * 
     * @param index
     * @param vAutoEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAutoEvent(
            final int index,
            final org.opennms.netmgt.config.vacuumd.AutoEvent vAutoEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._autoEventList.add(index, vAutoEvent);
    }

    /**
     * Method enumerateAutoEvent.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.vacuumd.AutoEvent> enumerateAutoEvent(
    ) {
        return java.util.Collections.enumeration(this._autoEventList);
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
        
        if (obj instanceof AutoEvents) {
        
            AutoEvents temp = (AutoEvents)obj;
            if (this._autoEventList != null) {
                if (temp._autoEventList == null) return false;
                else if (!(this._autoEventList.equals(temp._autoEventList))) 
                    return false;
            }
            else if (temp._autoEventList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAutoEvent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.vacuumd.AutoEvent at the given inde
     */
    public org.opennms.netmgt.config.vacuumd.AutoEvent getAutoEvent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._autoEventList.size()) {
            throw new IndexOutOfBoundsException("getAutoEvent: Index value '" + index + "' not in range [0.." + (this._autoEventList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.vacuumd.AutoEvent) _autoEventList.get(index);
    }

    /**
     * Method getAutoEvent.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.vacuumd.AutoEvent[] getAutoEvent(
    ) {
        org.opennms.netmgt.config.vacuumd.AutoEvent[] array = new org.opennms.netmgt.config.vacuumd.AutoEvent[0];
        return (org.opennms.netmgt.config.vacuumd.AutoEvent[]) this._autoEventList.toArray(array);
    }

    /**
     * Method getAutoEventCollection.Returns a reference to
     * '_autoEventList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.vacuumd.AutoEvent> getAutoEventCollection(
    ) {
        return this._autoEventList;
    }

    /**
     * Method getAutoEventCount.
     * 
     * @return the size of this collection
     */
    public int getAutoEventCount(
    ) {
        return this._autoEventList.size();
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
        if (_autoEventList != null) {
           result = 37 * result + _autoEventList.hashCode();
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
     * Method iterateAutoEvent.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.vacuumd.AutoEvent> iterateAutoEvent(
    ) {
        return this._autoEventList.iterator();
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
    public void removeAllAutoEvent(
    ) {
        this._autoEventList.clear();
    }

    /**
     * Method removeAutoEvent.
     * 
     * @param vAutoEvent
     * @return true if the object was removed from the collection.
     */
    public boolean removeAutoEvent(
            final org.opennms.netmgt.config.vacuumd.AutoEvent vAutoEvent) {
        boolean removed = _autoEventList.remove(vAutoEvent);
        return removed;
    }

    /**
     * Method removeAutoEventAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.vacuumd.AutoEvent removeAutoEventAt(
            final int index) {
        java.lang.Object obj = this._autoEventList.remove(index);
        return (org.opennms.netmgt.config.vacuumd.AutoEvent) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAutoEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAutoEvent(
            final int index,
            final org.opennms.netmgt.config.vacuumd.AutoEvent vAutoEvent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._autoEventList.size()) {
            throw new IndexOutOfBoundsException("setAutoEvent: Index value '" + index + "' not in range [0.." + (this._autoEventList.size() - 1) + "]");
        }
        
        this._autoEventList.set(index, vAutoEvent);
    }

    /**
     * 
     * 
     * @param vAutoEventArray
     */
    public void setAutoEvent(
            final org.opennms.netmgt.config.vacuumd.AutoEvent[] vAutoEventArray) {
        //-- copy array
        _autoEventList.clear();
        
        for (int i = 0; i < vAutoEventArray.length; i++) {
                this._autoEventList.add(vAutoEventArray[i]);
        }
    }

    /**
     * Sets the value of '_autoEventList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vAutoEventList the Vector to copy.
     */
    public void setAutoEvent(
            final java.util.List<org.opennms.netmgt.config.vacuumd.AutoEvent> vAutoEventList) {
        // copy vector
        this._autoEventList.clear();
        
        this._autoEventList.addAll(vAutoEventList);
    }

    /**
     * Sets the value of '_autoEventList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param autoEventList the Vector to set.
     */
    public void setAutoEventCollection(
            final java.util.List<org.opennms.netmgt.config.vacuumd.AutoEvent> autoEventList) {
        this._autoEventList = autoEventList;
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
     * org.opennms.netmgt.config.vacuumd.AutoEvents
     */
    public static org.opennms.netmgt.config.vacuumd.AutoEvents unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vacuumd.AutoEvents) Unmarshaller.unmarshal(org.opennms.netmgt.config.vacuumd.AutoEvents.class, reader);
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

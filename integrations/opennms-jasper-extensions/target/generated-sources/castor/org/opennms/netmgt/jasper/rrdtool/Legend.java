/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.jasper.rrdtool;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Legend.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Legend implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _entryList.
     */
    private java.util.List<org.opennms.netmgt.jasper.rrdtool.Entry> _entryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Legend() {
        super();
        this._entryList = new java.util.ArrayList<org.opennms.netmgt.jasper.rrdtool.Entry>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final org.opennms.netmgt.jasper.rrdtool.Entry vEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._entryList.add(vEntry);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final int index,
            final org.opennms.netmgt.jasper.rrdtool.Entry vEntry)
    throws java.lang.IndexOutOfBoundsException {
        this._entryList.add(index, vEntry);
    }

    /**
     * Method enumerateEntry.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.jasper.rrdtool.Entry> enumerateEntry(
    ) {
        return java.util.Collections.enumeration(this._entryList);
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
        
        if (obj instanceof Legend) {
        
            Legend temp = (Legend)obj;
            if (this._entryList != null) {
                if (temp._entryList == null) return false;
                else if (!(this._entryList.equals(temp._entryList))) 
                    return false;
            }
            else if (temp._entryList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getEntry.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.jasper.rrdtool.Entry at the given index
     */
    public org.opennms.netmgt.jasper.rrdtool.Entry getEntry(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("getEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.jasper.rrdtool.Entry) _entryList.get(index);
    }

    /**
     * Method getEntry.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.jasper.rrdtool.Entry[] getEntry(
    ) {
        org.opennms.netmgt.jasper.rrdtool.Entry[] array = new org.opennms.netmgt.jasper.rrdtool.Entry[0];
        return (org.opennms.netmgt.jasper.rrdtool.Entry[]) this._entryList.toArray(array);
    }

    /**
     * Method getEntryCollection.Returns a reference to
     * '_entryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.jasper.rrdtool.Entry> getEntryCollection(
    ) {
        return this._entryList;
    }

    /**
     * Method getEntryCount.
     * 
     * @return the size of this collection
     */
    public int getEntryCount(
    ) {
        return this._entryList.size();
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
        if (_entryList != null) {
           result = 37 * result + _entryList.hashCode();
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
     * Method iterateEntry.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.jasper.rrdtool.Entry> iterateEntry(
    ) {
        return this._entryList.iterator();
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
    public void removeAllEntry(
    ) {
        this._entryList.clear();
    }

    /**
     * Method removeEntry.
     * 
     * @param vEntry
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntry(
            final org.opennms.netmgt.jasper.rrdtool.Entry vEntry) {
        boolean removed = _entryList.remove(vEntry);
        return removed;
    }

    /**
     * Method removeEntryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.jasper.rrdtool.Entry removeEntryAt(
            final int index) {
        java.lang.Object obj = this._entryList.remove(index);
        return (org.opennms.netmgt.jasper.rrdtool.Entry) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntry(
            final int index,
            final org.opennms.netmgt.jasper.rrdtool.Entry vEntry)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("setEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }
        
        this._entryList.set(index, vEntry);
    }

    /**
     * 
     * 
     * @param vEntryArray
     */
    public void setEntry(
            final org.opennms.netmgt.jasper.rrdtool.Entry[] vEntryArray) {
        //-- copy array
        _entryList.clear();
        
        for (int i = 0; i < vEntryArray.length; i++) {
                this._entryList.add(vEntryArray[i]);
        }
    }

    /**
     * Sets the value of '_entryList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vEntryList the Vector to copy.
     */
    public void setEntry(
            final java.util.List<org.opennms.netmgt.jasper.rrdtool.Entry> vEntryList) {
        // copy vector
        this._entryList.clear();
        
        this._entryList.addAll(vEntryList);
    }

    /**
     * Sets the value of '_entryList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param entryList the Vector to set.
     */
    public void setEntryCollection(
            final java.util.List<org.opennms.netmgt.jasper.rrdtool.Entry> entryList) {
        this._entryList = entryList;
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
     * org.opennms.netmgt.jasper.rrdtool.Legend
     */
    public static org.opennms.netmgt.jasper.rrdtool.Legend unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.jasper.rrdtool.Legend) Unmarshaller.unmarshal(org.opennms.netmgt.jasper.rrdtool.Legend.class, reader);
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

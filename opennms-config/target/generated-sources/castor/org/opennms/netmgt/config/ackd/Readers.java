/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.ackd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Location for user to define readers and they're schedules.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Readers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _readerList.
     */
    private java.util.List<org.opennms.netmgt.config.ackd.Reader> _readerList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Readers() {
        super();
        this._readerList = new java.util.ArrayList<org.opennms.netmgt.config.ackd.Reader>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vReader
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReader(
            final org.opennms.netmgt.config.ackd.Reader vReader)
    throws java.lang.IndexOutOfBoundsException {
        this._readerList.add(vReader);
    }

    /**
     * 
     * 
     * @param index
     * @param vReader
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReader(
            final int index,
            final org.opennms.netmgt.config.ackd.Reader vReader)
    throws java.lang.IndexOutOfBoundsException {
        this._readerList.add(index, vReader);
    }

    /**
     * Method enumerateReader.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.ackd.Reader> enumerateReader(
    ) {
        return java.util.Collections.enumeration(this._readerList);
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
        
        if (obj instanceof Readers) {
        
            Readers temp = (Readers)obj;
            if (this._readerList != null) {
                if (temp._readerList == null) return false;
                else if (!(this._readerList.equals(temp._readerList))) 
                    return false;
            }
            else if (temp._readerList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getReader.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.ackd.Reader at the given index
     */
    public org.opennms.netmgt.config.ackd.Reader getReader(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._readerList.size()) {
            throw new IndexOutOfBoundsException("getReader: Index value '" + index + "' not in range [0.." + (this._readerList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.ackd.Reader) _readerList.get(index);
    }

    /**
     * Method getReader.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.ackd.Reader[] getReader(
    ) {
        org.opennms.netmgt.config.ackd.Reader[] array = new org.opennms.netmgt.config.ackd.Reader[0];
        return (org.opennms.netmgt.config.ackd.Reader[]) this._readerList.toArray(array);
    }

    /**
     * Method getReaderCollection.Returns a reference to
     * '_readerList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.ackd.Reader> getReaderCollection(
    ) {
        return this._readerList;
    }

    /**
     * Method getReaderCount.
     * 
     * @return the size of this collection
     */
    public int getReaderCount(
    ) {
        return this._readerList.size();
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
        if (_readerList != null) {
           result = 37 * result + _readerList.hashCode();
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
     * Method iterateReader.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.ackd.Reader> iterateReader(
    ) {
        return this._readerList.iterator();
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
    public void removeAllReader(
    ) {
        this._readerList.clear();
    }

    /**
     * Method removeReader.
     * 
     * @param vReader
     * @return true if the object was removed from the collection.
     */
    public boolean removeReader(
            final org.opennms.netmgt.config.ackd.Reader vReader) {
        boolean removed = _readerList.remove(vReader);
        return removed;
    }

    /**
     * Method removeReaderAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.ackd.Reader removeReaderAt(
            final int index) {
        java.lang.Object obj = this._readerList.remove(index);
        return (org.opennms.netmgt.config.ackd.Reader) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vReader
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setReader(
            final int index,
            final org.opennms.netmgt.config.ackd.Reader vReader)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._readerList.size()) {
            throw new IndexOutOfBoundsException("setReader: Index value '" + index + "' not in range [0.." + (this._readerList.size() - 1) + "]");
        }
        
        this._readerList.set(index, vReader);
    }

    /**
     * 
     * 
     * @param vReaderArray
     */
    public void setReader(
            final org.opennms.netmgt.config.ackd.Reader[] vReaderArray) {
        //-- copy array
        _readerList.clear();
        
        for (int i = 0; i < vReaderArray.length; i++) {
                this._readerList.add(vReaderArray[i]);
        }
    }

    /**
     * Sets the value of '_readerList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vReaderList the Vector to copy.
     */
    public void setReader(
            final java.util.List<org.opennms.netmgt.config.ackd.Reader> vReaderList) {
        // copy vector
        this._readerList.clear();
        
        this._readerList.addAll(vReaderList);
    }

    /**
     * Sets the value of '_readerList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param readerList the Vector to set.
     */
    public void setReaderCollection(
            final java.util.List<org.opennms.netmgt.config.ackd.Reader> readerList) {
        this._readerList = readerList;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.ackd.Reader
     */
    public static org.opennms.netmgt.config.ackd.Readers unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.ackd.Readers) Unmarshaller.unmarshal(org.opennms.netmgt.config.ackd.Readers.class, reader);
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

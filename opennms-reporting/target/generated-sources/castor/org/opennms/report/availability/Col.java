/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Col.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Col implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _colTitleList.
     */
    private java.util.List<java.lang.String> _colTitleList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Col() {
        super();
        this._colTitleList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vColTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColTitle(
            final java.lang.String vColTitle)
    throws java.lang.IndexOutOfBoundsException {
        this._colTitleList.add(vColTitle);
    }

    /**
     * 
     * 
     * @param index
     * @param vColTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColTitle(
            final int index,
            final java.lang.String vColTitle)
    throws java.lang.IndexOutOfBoundsException {
        this._colTitleList.add(index, vColTitle);
    }

    /**
     * Method enumerateColTitle.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateColTitle(
    ) {
        return java.util.Collections.enumeration(this._colTitleList);
    }

    /**
     * Method getColTitle.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getColTitle(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._colTitleList.size()) {
            throw new IndexOutOfBoundsException("getColTitle: Index value '" + index + "' not in range [0.." + (this._colTitleList.size() - 1) + "]");
        }
        
        return (java.lang.String) _colTitleList.get(index);
    }

    /**
     * Method getColTitle.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getColTitle(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._colTitleList.toArray(array);
    }

    /**
     * Method getColTitleCollection.Returns a reference to
     * '_colTitleList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getColTitleCollection(
    ) {
        return this._colTitleList;
    }

    /**
     * Method getColTitleCount.
     * 
     * @return the size of this collection
     */
    public int getColTitleCount(
    ) {
        return this._colTitleList.size();
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
     * Method iterateColTitle.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateColTitle(
    ) {
        return this._colTitleList.iterator();
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
    public void removeAllColTitle(
    ) {
        this._colTitleList.clear();
    }

    /**
     * Method removeColTitle.
     * 
     * @param vColTitle
     * @return true if the object was removed from the collection.
     */
    public boolean removeColTitle(
            final java.lang.String vColTitle) {
        boolean removed = _colTitleList.remove(vColTitle);
        return removed;
    }

    /**
     * Method removeColTitleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeColTitleAt(
            final int index) {
        java.lang.Object obj = this._colTitleList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vColTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setColTitle(
            final int index,
            final java.lang.String vColTitle)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._colTitleList.size()) {
            throw new IndexOutOfBoundsException("setColTitle: Index value '" + index + "' not in range [0.." + (this._colTitleList.size() - 1) + "]");
        }
        
        this._colTitleList.set(index, vColTitle);
    }

    /**
     * 
     * 
     * @param vColTitleArray
     */
    public void setColTitle(
            final java.lang.String[] vColTitleArray) {
        //-- copy array
        _colTitleList.clear();
        
        for (int i = 0; i < vColTitleArray.length; i++) {
                this._colTitleList.add(vColTitleArray[i]);
        }
    }

    /**
     * Sets the value of '_colTitleList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vColTitleList the Vector to copy.
     */
    public void setColTitle(
            final java.util.List<java.lang.String> vColTitleList) {
        // copy vector
        this._colTitleList.clear();
        
        this._colTitleList.addAll(vColTitleList);
    }

    /**
     * Sets the value of '_colTitleList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param colTitleList the Vector to set.
     */
    public void setColTitleCollection(
            final java.util.List<java.lang.String> colTitleList) {
        this._colTitleList = colTitleList;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.report.availability.Col
     */
    public static org.opennms.report.availability.Col unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Col) Unmarshaller.unmarshal(org.opennms.report.availability.Col.class, reader);
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

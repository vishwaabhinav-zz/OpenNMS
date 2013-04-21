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
 * Class Categories.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Categories implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _categoryList.
     */
    private java.util.List<org.opennms.report.availability.Category> _categoryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Categories() {
        super();
        this._categoryList = new java.util.ArrayList<org.opennms.report.availability.Category>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategory(
            final org.opennms.report.availability.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryList.add(vCategory);
    }

    /**
     * 
     * 
     * @param index
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategory(
            final int index,
            final org.opennms.report.availability.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryList.add(index, vCategory);
    }

    /**
     * Method enumerateCategory.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.availability.Category> enumerateCategory(
    ) {
        return java.util.Collections.enumeration(this._categoryList);
    }

    /**
     * Method getCategory.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.availability.Category at the given index
     */
    public org.opennms.report.availability.Category getCategory(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryList.size()) {
            throw new IndexOutOfBoundsException("getCategory: Index value '" + index + "' not in range [0.." + (this._categoryList.size() - 1) + "]");
        }
        
        return (org.opennms.report.availability.Category) _categoryList.get(index);
    }

    /**
     * Method getCategory.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.report.availability.Category[] getCategory(
    ) {
        org.opennms.report.availability.Category[] array = new org.opennms.report.availability.Category[0];
        return (org.opennms.report.availability.Category[]) this._categoryList.toArray(array);
    }

    /**
     * Method getCategoryCollection.Returns a reference to
     * '_categoryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.availability.Category> getCategoryCollection(
    ) {
        return this._categoryList;
    }

    /**
     * Method getCategoryCount.
     * 
     * @return the size of this collection
     */
    public int getCategoryCount(
    ) {
        return this._categoryList.size();
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
     * Method iterateCategory.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.availability.Category> iterateCategory(
    ) {
        return this._categoryList.iterator();
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
    public void removeAllCategory(
    ) {
        this._categoryList.clear();
    }

    /**
     * Method removeCategory.
     * 
     * @param vCategory
     * @return true if the object was removed from the collection.
     */
    public boolean removeCategory(
            final org.opennms.report.availability.Category vCategory) {
        boolean removed = _categoryList.remove(vCategory);
        return removed;
    }

    /**
     * Method removeCategoryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.availability.Category removeCategoryAt(
            final int index) {
        java.lang.Object obj = this._categoryList.remove(index);
        return (org.opennms.report.availability.Category) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCategory(
            final int index,
            final org.opennms.report.availability.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryList.size()) {
            throw new IndexOutOfBoundsException("setCategory: Index value '" + index + "' not in range [0.." + (this._categoryList.size() - 1) + "]");
        }
        
        this._categoryList.set(index, vCategory);
    }

    /**
     * 
     * 
     * @param vCategoryArray
     */
    public void setCategory(
            final org.opennms.report.availability.Category[] vCategoryArray) {
        //-- copy array
        _categoryList.clear();
        
        for (int i = 0; i < vCategoryArray.length; i++) {
                this._categoryList.add(vCategoryArray[i]);
        }
    }

    /**
     * Sets the value of '_categoryList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCategoryList the Vector to copy.
     */
    public void setCategory(
            final java.util.List<org.opennms.report.availability.Category> vCategoryList) {
        // copy vector
        this._categoryList.clear();
        
        this._categoryList.addAll(vCategoryList);
    }

    /**
     * Sets the value of '_categoryList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param categoryList the Vector to set.
     */
    public void setCategoryCollection(
            final java.util.List<org.opennms.report.availability.Category> categoryList) {
        this._categoryList = categoryList;
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
     * org.opennms.report.availability.Categories
     */
    public static org.opennms.report.availability.Categories unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Categories) Unmarshaller.unmarshal(org.opennms.report.availability.Categories.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.viewsdisplay;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class View.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class View implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _viewName.
     */
    private java.lang.String _viewName;

    /**
     * Field _sectionList.
     */
    private java.util.List<org.opennms.netmgt.config.viewsdisplay.Section> _sectionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public View() {
        super();
        this._sectionList = new java.util.ArrayList<org.opennms.netmgt.config.viewsdisplay.Section>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSection(
            final org.opennms.netmgt.config.viewsdisplay.Section vSection)
    throws java.lang.IndexOutOfBoundsException {
        this._sectionList.add(vSection);
    }

    /**
     * 
     * 
     * @param index
     * @param vSection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSection(
            final int index,
            final org.opennms.netmgt.config.viewsdisplay.Section vSection)
    throws java.lang.IndexOutOfBoundsException {
        this._sectionList.add(index, vSection);
    }

    /**
     * Method enumerateSection.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.viewsdisplay.Section> enumerateSection(
    ) {
        return java.util.Collections.enumeration(this._sectionList);
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
        
        if (obj instanceof View) {
        
            View temp = (View)obj;
            if (this._viewName != null) {
                if (temp._viewName == null) return false;
                else if (!(this._viewName.equals(temp._viewName))) 
                    return false;
            }
            else if (temp._viewName != null)
                return false;
            if (this._sectionList != null) {
                if (temp._sectionList == null) return false;
                else if (!(this._sectionList.equals(temp._sectionList))) 
                    return false;
            }
            else if (temp._sectionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getSection.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.viewsdisplay.Section at the given
     * index
     */
    public org.opennms.netmgt.config.viewsdisplay.Section getSection(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sectionList.size()) {
            throw new IndexOutOfBoundsException("getSection: Index value '" + index + "' not in range [0.." + (this._sectionList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.viewsdisplay.Section) _sectionList.get(index);
    }

    /**
     * Method getSection.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.viewsdisplay.Section[] getSection(
    ) {
        org.opennms.netmgt.config.viewsdisplay.Section[] array = new org.opennms.netmgt.config.viewsdisplay.Section[0];
        return (org.opennms.netmgt.config.viewsdisplay.Section[]) this._sectionList.toArray(array);
    }

    /**
     * Method getSectionCollection.Returns a reference to
     * '_sectionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.viewsdisplay.Section> getSectionCollection(
    ) {
        return this._sectionList;
    }

    /**
     * Method getSectionCount.
     * 
     * @return the size of this collection
     */
    public int getSectionCount(
    ) {
        return this._sectionList.size();
    }

    /**
     * Returns the value of field 'viewName'.
     * 
     * @return the value of field 'ViewName'.
     */
    public java.lang.String getViewName(
    ) {
        return this._viewName;
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
        if (_viewName != null) {
           result = 37 * result + _viewName.hashCode();
        }
        if (_sectionList != null) {
           result = 37 * result + _sectionList.hashCode();
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
     * Method iterateSection.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.viewsdisplay.Section> iterateSection(
    ) {
        return this._sectionList.iterator();
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
    public void removeAllSection(
    ) {
        this._sectionList.clear();
    }

    /**
     * Method removeSection.
     * 
     * @param vSection
     * @return true if the object was removed from the collection.
     */
    public boolean removeSection(
            final org.opennms.netmgt.config.viewsdisplay.Section vSection) {
        boolean removed = _sectionList.remove(vSection);
        return removed;
    }

    /**
     * Method removeSectionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.viewsdisplay.Section removeSectionAt(
            final int index) {
        java.lang.Object obj = this._sectionList.remove(index);
        return (org.opennms.netmgt.config.viewsdisplay.Section) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSection
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSection(
            final int index,
            final org.opennms.netmgt.config.viewsdisplay.Section vSection)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sectionList.size()) {
            throw new IndexOutOfBoundsException("setSection: Index value '" + index + "' not in range [0.." + (this._sectionList.size() - 1) + "]");
        }
        
        this._sectionList.set(index, vSection);
    }

    /**
     * 
     * 
     * @param vSectionArray
     */
    public void setSection(
            final org.opennms.netmgt.config.viewsdisplay.Section[] vSectionArray) {
        //-- copy array
        _sectionList.clear();
        
        for (int i = 0; i < vSectionArray.length; i++) {
                this._sectionList.add(vSectionArray[i]);
        }
    }

    /**
     * Sets the value of '_sectionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSectionList the Vector to copy.
     */
    public void setSection(
            final java.util.List<org.opennms.netmgt.config.viewsdisplay.Section> vSectionList) {
        // copy vector
        this._sectionList.clear();
        
        this._sectionList.addAll(vSectionList);
    }

    /**
     * Sets the value of '_sectionList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param sectionList the Vector to set.
     */
    public void setSectionCollection(
            final java.util.List<org.opennms.netmgt.config.viewsdisplay.Section> sectionList) {
        this._sectionList = sectionList;
    }

    /**
     * Sets the value of field 'viewName'.
     * 
     * @param viewName the value of field 'viewName'.
     */
    public void setViewName(
            final java.lang.String viewName) {
        this._viewName = viewName;
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
     * org.opennms.netmgt.config.viewsdisplay.View
     */
    public static org.opennms.netmgt.config.viewsdisplay.View unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.viewsdisplay.View) Unmarshaller.unmarshal(org.opennms.netmgt.config.viewsdisplay.View.class, reader);
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

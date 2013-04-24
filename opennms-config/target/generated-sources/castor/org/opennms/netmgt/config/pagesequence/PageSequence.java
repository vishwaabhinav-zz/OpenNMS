/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.pagesequence;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Use this container to list the page in the order they are to be
 * accessed for monitoring
 *  or (soon) datacollection.
 *  
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class PageSequence implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This element specifies all the possible attributes in as
     * fine grained detail as possible. All that
     *  is really required (as you can see below) is the "path"
     * attribute. From that one attribute,
     *  the IP address passed in through the ServiceMonitor and
     * ServiceCollector interface, the URL will be
     *  fully generated using the supplied defaults in this config.
     * Configure attributes these attributes to
     *  the level of detail you need to fully control the behavior.
     *  
     *  A little bit of indirection is possible here with the host
     * attribute. If the host attribute is anything
     *  other than the default, that value will be used instead of
     * the IP address passed in through the API (Interface).
     *  
     *  
     */
    private java.util.List<org.opennms.netmgt.config.pagesequence.Page> _pageList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PageSequence() {
        super();
        this._pageList = new java.util.ArrayList<org.opennms.netmgt.config.pagesequence.Page>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPage(
            final org.opennms.netmgt.config.pagesequence.Page vPage)
    throws java.lang.IndexOutOfBoundsException {
        this._pageList.add(vPage);
    }

    /**
     * 
     * 
     * @param index
     * @param vPage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPage(
            final int index,
            final org.opennms.netmgt.config.pagesequence.Page vPage)
    throws java.lang.IndexOutOfBoundsException {
        this._pageList.add(index, vPage);
    }

    /**
     * Method enumeratePage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.pagesequence.Page> enumeratePage(
    ) {
        return java.util.Collections.enumeration(this._pageList);
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
        
        if (obj instanceof PageSequence) {
        
            PageSequence temp = (PageSequence)obj;
            if (this._pageList != null) {
                if (temp._pageList == null) return false;
                else if (!(this._pageList.equals(temp._pageList))) 
                    return false;
            }
            else if (temp._pageList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getPage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.pagesequence.Page at the given inde
     */
    public org.opennms.netmgt.config.pagesequence.Page getPage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pageList.size()) {
            throw new IndexOutOfBoundsException("getPage: Index value '" + index + "' not in range [0.." + (this._pageList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.pagesequence.Page) _pageList.get(index);
    }

    /**
     * Method getPage.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.pagesequence.Page[] getPage(
    ) {
        org.opennms.netmgt.config.pagesequence.Page[] array = new org.opennms.netmgt.config.pagesequence.Page[0];
        return (org.opennms.netmgt.config.pagesequence.Page[]) this._pageList.toArray(array);
    }

    /**
     * Method getPageCollection.Returns a reference to '_pageList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.pagesequence.Page> getPageCollection(
    ) {
        return this._pageList;
    }

    /**
     * Method getPageCount.
     * 
     * @return the size of this collection
     */
    public int getPageCount(
    ) {
        return this._pageList.size();
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
        if (_pageList != null) {
           result = 37 * result + _pageList.hashCode();
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
     * Method iteratePage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.pagesequence.Page> iteratePage(
    ) {
        return this._pageList.iterator();
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
    public void removeAllPage(
    ) {
        this._pageList.clear();
    }

    /**
     * Method removePage.
     * 
     * @param vPage
     * @return true if the object was removed from the collection.
     */
    public boolean removePage(
            final org.opennms.netmgt.config.pagesequence.Page vPage) {
        boolean removed = _pageList.remove(vPage);
        return removed;
    }

    /**
     * Method removePageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.pagesequence.Page removePageAt(
            final int index) {
        java.lang.Object obj = this._pageList.remove(index);
        return (org.opennms.netmgt.config.pagesequence.Page) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vPage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPage(
            final int index,
            final org.opennms.netmgt.config.pagesequence.Page vPage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pageList.size()) {
            throw new IndexOutOfBoundsException("setPage: Index value '" + index + "' not in range [0.." + (this._pageList.size() - 1) + "]");
        }
        
        this._pageList.set(index, vPage);
    }

    /**
     * 
     * 
     * @param vPageArray
     */
    public void setPage(
            final org.opennms.netmgt.config.pagesequence.Page[] vPageArray) {
        //-- copy array
        _pageList.clear();
        
        for (int i = 0; i < vPageArray.length; i++) {
                this._pageList.add(vPageArray[i]);
        }
    }

    /**
     * Sets the value of '_pageList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vPageList the Vector to copy.
     */
    public void setPage(
            final java.util.List<org.opennms.netmgt.config.pagesequence.Page> vPageList) {
        // copy vector
        this._pageList.clear();
        
        this._pageList.addAll(vPageList);
    }

    /**
     * Sets the value of '_pageList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param pageList the Vector to set.
     */
    public void setPageCollection(
            final java.util.List<org.opennms.netmgt.config.pagesequence.Page> pageList) {
        this._pageList = pageList;
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
     * org.opennms.netmgt.config.pagesequence.PageSequence
     */
    public static org.opennms.netmgt.config.pagesequence.PageSequence unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.pagesequence.PageSequence) Unmarshaller.unmarshal(org.opennms.netmgt.config.pagesequence.PageSequence.class, reader);
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

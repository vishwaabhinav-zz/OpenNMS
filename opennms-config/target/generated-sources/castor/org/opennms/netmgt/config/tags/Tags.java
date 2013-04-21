/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.tags;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * An collection of tags.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Tags implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * An arbitrary metadata "tag" that can be associated with
     * other configs.
     */
    private java.util.List<org.opennms.netmgt.config.tags.Tag> _tagList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Tags() {
        super();
        this._tagList = new java.util.ArrayList<org.opennms.netmgt.config.tags.Tag>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTag
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTag(
            final org.opennms.netmgt.config.tags.Tag vTag)
    throws java.lang.IndexOutOfBoundsException {
        this._tagList.add(vTag);
    }

    /**
     * 
     * 
     * @param index
     * @param vTag
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTag(
            final int index,
            final org.opennms.netmgt.config.tags.Tag vTag)
    throws java.lang.IndexOutOfBoundsException {
        this._tagList.add(index, vTag);
    }

    /**
     * Method enumerateTag.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.tags.Tag> enumerateTag(
    ) {
        return java.util.Collections.enumeration(this._tagList);
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
        
        if (obj instanceof Tags) {
        
            Tags temp = (Tags)obj;
            if (this._tagList != null) {
                if (temp._tagList == null) return false;
                else if (!(this._tagList.equals(temp._tagList))) 
                    return false;
            }
            else if (temp._tagList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getTag.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.opennms.netmgt.config.tags.Tag
     * at the given index
     */
    public org.opennms.netmgt.config.tags.Tag getTag(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tagList.size()) {
            throw new IndexOutOfBoundsException("getTag: Index value '" + index + "' not in range [0.." + (this._tagList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.tags.Tag) _tagList.get(index);
    }

    /**
     * Method getTag.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.tags.Tag[] getTag(
    ) {
        org.opennms.netmgt.config.tags.Tag[] array = new org.opennms.netmgt.config.tags.Tag[0];
        return (org.opennms.netmgt.config.tags.Tag[]) this._tagList.toArray(array);
    }

    /**
     * Method getTagCollection.Returns a reference to '_tagList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.tags.Tag> getTagCollection(
    ) {
        return this._tagList;
    }

    /**
     * Method getTagCount.
     * 
     * @return the size of this collection
     */
    public int getTagCount(
    ) {
        return this._tagList.size();
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
        if (_tagList != null) {
           result = 37 * result + _tagList.hashCode();
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
     * Method iterateTag.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.tags.Tag> iterateTag(
    ) {
        return this._tagList.iterator();
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
    public void removeAllTag(
    ) {
        this._tagList.clear();
    }

    /**
     * Method removeTag.
     * 
     * @param vTag
     * @return true if the object was removed from the collection.
     */
    public boolean removeTag(
            final org.opennms.netmgt.config.tags.Tag vTag) {
        boolean removed = _tagList.remove(vTag);
        return removed;
    }

    /**
     * Method removeTagAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.tags.Tag removeTagAt(
            final int index) {
        java.lang.Object obj = this._tagList.remove(index);
        return (org.opennms.netmgt.config.tags.Tag) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTag
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTag(
            final int index,
            final org.opennms.netmgt.config.tags.Tag vTag)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._tagList.size()) {
            throw new IndexOutOfBoundsException("setTag: Index value '" + index + "' not in range [0.." + (this._tagList.size() - 1) + "]");
        }
        
        this._tagList.set(index, vTag);
    }

    /**
     * 
     * 
     * @param vTagArray
     */
    public void setTag(
            final org.opennms.netmgt.config.tags.Tag[] vTagArray) {
        //-- copy array
        _tagList.clear();
        
        for (int i = 0; i < vTagArray.length; i++) {
                this._tagList.add(vTagArray[i]);
        }
    }

    /**
     * Sets the value of '_tagList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vTagList the Vector to copy.
     */
    public void setTag(
            final java.util.List<org.opennms.netmgt.config.tags.Tag> vTagList) {
        // copy vector
        this._tagList.clear();
        
        this._tagList.addAll(vTagList);
    }

    /**
     * Sets the value of '_tagList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param tagList the Vector to set.
     */
    public void setTagCollection(
            final java.util.List<org.opennms.netmgt.config.tags.Tag> tagList) {
        this._tagList = tagList;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.tags.Tags
     */
    public static org.opennms.netmgt.config.tags.Tags unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.tags.Tags) Unmarshaller.unmarshal(org.opennms.netmgt.config.tags.Tags.class, reader);
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

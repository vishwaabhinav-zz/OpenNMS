/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.map.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Configuration of maps
 *  functionality
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Cmaps implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This represents a map in the opennms system.
     */
    private java.util.List<org.opennms.netmgt.config.map.adapter.Cmap> _cmapList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Cmaps() {
        super();
        this._cmapList = new java.util.ArrayList<org.opennms.netmgt.config.map.adapter.Cmap>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCmap
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCmap(
            final org.opennms.netmgt.config.map.adapter.Cmap vCmap)
    throws java.lang.IndexOutOfBoundsException {
        this._cmapList.add(vCmap);
    }

    /**
     * 
     * 
     * @param index
     * @param vCmap
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCmap(
            final int index,
            final org.opennms.netmgt.config.map.adapter.Cmap vCmap)
    throws java.lang.IndexOutOfBoundsException {
        this._cmapList.add(index, vCmap);
    }

    /**
     * Method enumerateCmap.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.map.adapter.Cmap> enumerateCmap(
    ) {
        return java.util.Collections.enumeration(this._cmapList);
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
        
        if (obj instanceof Cmaps) {
        
            Cmaps temp = (Cmaps)obj;
            if (this._cmapList != null) {
                if (temp._cmapList == null) return false;
                else if (!(this._cmapList.equals(temp._cmapList))) 
                    return false;
            }
            else if (temp._cmapList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getCmap.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.map.adapter.Cmap at the given index
     */
    public org.opennms.netmgt.config.map.adapter.Cmap getCmap(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._cmapList.size()) {
            throw new IndexOutOfBoundsException("getCmap: Index value '" + index + "' not in range [0.." + (this._cmapList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.map.adapter.Cmap) _cmapList.get(index);
    }

    /**
     * Method getCmap.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.map.adapter.Cmap[] getCmap(
    ) {
        org.opennms.netmgt.config.map.adapter.Cmap[] array = new org.opennms.netmgt.config.map.adapter.Cmap[0];
        return (org.opennms.netmgt.config.map.adapter.Cmap[]) this._cmapList.toArray(array);
    }

    /**
     * Method getCmapCollection.Returns a reference to '_cmapList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.map.adapter.Cmap> getCmapCollection(
    ) {
        return this._cmapList;
    }

    /**
     * Method getCmapCount.
     * 
     * @return the size of this collection
     */
    public int getCmapCount(
    ) {
        return this._cmapList.size();
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
        if (_cmapList != null) {
           result = 37 * result + _cmapList.hashCode();
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
     * Method iterateCmap.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.map.adapter.Cmap> iterateCmap(
    ) {
        return this._cmapList.iterator();
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
    public void removeAllCmap(
    ) {
        this._cmapList.clear();
    }

    /**
     * Method removeCmap.
     * 
     * @param vCmap
     * @return true if the object was removed from the collection.
     */
    public boolean removeCmap(
            final org.opennms.netmgt.config.map.adapter.Cmap vCmap) {
        boolean removed = _cmapList.remove(vCmap);
        return removed;
    }

    /**
     * Method removeCmapAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.map.adapter.Cmap removeCmapAt(
            final int index) {
        java.lang.Object obj = this._cmapList.remove(index);
        return (org.opennms.netmgt.config.map.adapter.Cmap) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCmap
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCmap(
            final int index,
            final org.opennms.netmgt.config.map.adapter.Cmap vCmap)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._cmapList.size()) {
            throw new IndexOutOfBoundsException("setCmap: Index value '" + index + "' not in range [0.." + (this._cmapList.size() - 1) + "]");
        }
        
        this._cmapList.set(index, vCmap);
    }

    /**
     * 
     * 
     * @param vCmapArray
     */
    public void setCmap(
            final org.opennms.netmgt.config.map.adapter.Cmap[] vCmapArray) {
        //-- copy array
        _cmapList.clear();
        
        for (int i = 0; i < vCmapArray.length; i++) {
                this._cmapList.add(vCmapArray[i]);
        }
    }

    /**
     * Sets the value of '_cmapList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vCmapList the Vector to copy.
     */
    public void setCmap(
            final java.util.List<org.opennms.netmgt.config.map.adapter.Cmap> vCmapList) {
        // copy vector
        this._cmapList.clear();
        
        this._cmapList.addAll(vCmapList);
    }

    /**
     * Sets the value of '_cmapList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param cmapList the Vector to set.
     */
    public void setCmapCollection(
            final java.util.List<org.opennms.netmgt.config.map.adapter.Cmap> cmapList) {
        this._cmapList = cmapList;
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
     * org.opennms.netmgt.config.map.adapter.Cmaps
     */
    public static org.opennms.netmgt.config.map.adapter.Cmaps unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.map.adapter.Cmaps) Unmarshaller.unmarshal(org.opennms.netmgt.config.map.adapter.Cmaps.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.destinationPaths;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the destinationPaths.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class DestinationPaths implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Header containing information about this configuration
     *  file.
     */
    private org.opennms.netmgt.config.destinationPaths.Header _header;

    /**
     * Field _pathList.
     */
    private java.util.List<org.opennms.netmgt.config.destinationPaths.Path> _pathList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DestinationPaths() {
        super();
        this._pathList = new java.util.ArrayList<org.opennms.netmgt.config.destinationPaths.Path>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPath
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPath(
            final org.opennms.netmgt.config.destinationPaths.Path vPath)
    throws java.lang.IndexOutOfBoundsException {
        this._pathList.add(vPath);
    }

    /**
     * 
     * 
     * @param index
     * @param vPath
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPath(
            final int index,
            final org.opennms.netmgt.config.destinationPaths.Path vPath)
    throws java.lang.IndexOutOfBoundsException {
        this._pathList.add(index, vPath);
    }

    /**
     * Method enumeratePath.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.destinationPaths.Path> enumeratePath(
    ) {
        return java.util.Collections.enumeration(this._pathList);
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
        
        if (obj instanceof DestinationPaths) {
        
            DestinationPaths temp = (DestinationPaths)obj;
            if (this._header != null) {
                if (temp._header == null) return false;
                else if (!(this._header.equals(temp._header))) 
                    return false;
            }
            else if (temp._header != null)
                return false;
            if (this._pathList != null) {
                if (temp._pathList == null) return false;
                else if (!(this._pathList.equals(temp._pathList))) 
                    return false;
            }
            else if (temp._pathList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'header'. The field 'header' has
     * the following description: Header containing information
     * about this configuration
     *  file.
     * 
     * @return the value of field 'Header'.
     */
    public org.opennms.netmgt.config.destinationPaths.Header getHeader(
    ) {
        return this._header;
    }

    /**
     * Method getPath.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.destinationPaths.Path at the given
     * index
     */
    public org.opennms.netmgt.config.destinationPaths.Path getPath(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pathList.size()) {
            throw new IndexOutOfBoundsException("getPath: Index value '" + index + "' not in range [0.." + (this._pathList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.destinationPaths.Path) _pathList.get(index);
    }

    /**
     * Method getPath.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.destinationPaths.Path[] getPath(
    ) {
        org.opennms.netmgt.config.destinationPaths.Path[] array = new org.opennms.netmgt.config.destinationPaths.Path[0];
        return (org.opennms.netmgt.config.destinationPaths.Path[]) this._pathList.toArray(array);
    }

    /**
     * Method getPathCollection.Returns a reference to '_pathList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.destinationPaths.Path> getPathCollection(
    ) {
        return this._pathList;
    }

    /**
     * Method getPathCount.
     * 
     * @return the size of this collection
     */
    public int getPathCount(
    ) {
        return this._pathList.size();
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
        if (_header != null) {
           result = 37 * result + _header.hashCode();
        }
        if (_pathList != null) {
           result = 37 * result + _pathList.hashCode();
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
     * Method iteratePath.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.destinationPaths.Path> iteratePath(
    ) {
        return this._pathList.iterator();
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
    public void removeAllPath(
    ) {
        this._pathList.clear();
    }

    /**
     * Method removePath.
     * 
     * @param vPath
     * @return true if the object was removed from the collection.
     */
    public boolean removePath(
            final org.opennms.netmgt.config.destinationPaths.Path vPath) {
        boolean removed = _pathList.remove(vPath);
        return removed;
    }

    /**
     * Method removePathAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.destinationPaths.Path removePathAt(
            final int index) {
        java.lang.Object obj = this._pathList.remove(index);
        return (org.opennms.netmgt.config.destinationPaths.Path) obj;
    }

    /**
     * Sets the value of field 'header'. The field 'header' has the
     * following description: Header containing information about
     * this configuration
     *  file.
     * 
     * @param header the value of field 'header'.
     */
    public void setHeader(
            final org.opennms.netmgt.config.destinationPaths.Header header) {
        this._header = header;
    }

    /**
     * 
     * 
     * @param index
     * @param vPath
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPath(
            final int index,
            final org.opennms.netmgt.config.destinationPaths.Path vPath)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._pathList.size()) {
            throw new IndexOutOfBoundsException("setPath: Index value '" + index + "' not in range [0.." + (this._pathList.size() - 1) + "]");
        }
        
        this._pathList.set(index, vPath);
    }

    /**
     * 
     * 
     * @param vPathArray
     */
    public void setPath(
            final org.opennms.netmgt.config.destinationPaths.Path[] vPathArray) {
        //-- copy array
        _pathList.clear();
        
        for (int i = 0; i < vPathArray.length; i++) {
                this._pathList.add(vPathArray[i]);
        }
    }

    /**
     * Sets the value of '_pathList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vPathList the Vector to copy.
     */
    public void setPath(
            final java.util.List<org.opennms.netmgt.config.destinationPaths.Path> vPathList) {
        // copy vector
        this._pathList.clear();
        
        this._pathList.addAll(vPathList);
    }

    /**
     * Sets the value of '_pathList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param pathList the Vector to set.
     */
    public void setPathCollection(
            final java.util.List<org.opennms.netmgt.config.destinationPaths.Path> pathList) {
        this._pathList = pathList;
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
     * org.opennms.netmgt.config.destinationPaths.DestinationPaths
     */
    public static org.opennms.netmgt.config.destinationPaths.DestinationPaths unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.destinationPaths.DestinationPaths) Unmarshaller.unmarshal(org.opennms.netmgt.config.destinationPaths.DestinationPaths.class, reader);
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

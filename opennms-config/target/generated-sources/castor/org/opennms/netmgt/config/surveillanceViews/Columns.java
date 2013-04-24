/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.surveillanceViews;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Columns.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Columns implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _columnDefList.
     */
    private java.util.List<org.opennms.netmgt.config.surveillanceViews.ColumnDef> _columnDefList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Columns() {
        super();
        this._columnDefList = new java.util.ArrayList<org.opennms.netmgt.config.surveillanceViews.ColumnDef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vColumnDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColumnDef(
            final org.opennms.netmgt.config.surveillanceViews.ColumnDef vColumnDef)
    throws java.lang.IndexOutOfBoundsException {
        this._columnDefList.add(vColumnDef);
    }

    /**
     * 
     * 
     * @param index
     * @param vColumnDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addColumnDef(
            final int index,
            final org.opennms.netmgt.config.surveillanceViews.ColumnDef vColumnDef)
    throws java.lang.IndexOutOfBoundsException {
        this._columnDefList.add(index, vColumnDef);
    }

    /**
     * Method enumerateColumnDef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.surveillanceViews.ColumnDef> enumerateColumnDef(
    ) {
        return java.util.Collections.enumeration(this._columnDefList);
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
        
        if (obj instanceof Columns) {
        
            Columns temp = (Columns)obj;
            if (this._columnDefList != null) {
                if (temp._columnDefList == null) return false;
                else if (!(this._columnDefList.equals(temp._columnDefList))) 
                    return false;
            }
            else if (temp._columnDefList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getColumnDef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.surveillanceViews.ColumnDef at the
     * given index
     */
    public org.opennms.netmgt.config.surveillanceViews.ColumnDef getColumnDef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._columnDefList.size()) {
            throw new IndexOutOfBoundsException("getColumnDef: Index value '" + index + "' not in range [0.." + (this._columnDefList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.surveillanceViews.ColumnDef) _columnDefList.get(index);
    }

    /**
     * Method getColumnDef.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.surveillanceViews.ColumnDef[] getColumnDef(
    ) {
        org.opennms.netmgt.config.surveillanceViews.ColumnDef[] array = new org.opennms.netmgt.config.surveillanceViews.ColumnDef[0];
        return (org.opennms.netmgt.config.surveillanceViews.ColumnDef[]) this._columnDefList.toArray(array);
    }

    /**
     * Method getColumnDefCollection.Returns a reference to
     * '_columnDefList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.surveillanceViews.ColumnDef> getColumnDefCollection(
    ) {
        return this._columnDefList;
    }

    /**
     * Method getColumnDefCount.
     * 
     * @return the size of this collection
     */
    public int getColumnDefCount(
    ) {
        return this._columnDefList.size();
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
        if (_columnDefList != null) {
           result = 37 * result + _columnDefList.hashCode();
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
     * Method iterateColumnDef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.surveillanceViews.ColumnDef> iterateColumnDef(
    ) {
        return this._columnDefList.iterator();
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
    public void removeAllColumnDef(
    ) {
        this._columnDefList.clear();
    }

    /**
     * Method removeColumnDef.
     * 
     * @param vColumnDef
     * @return true if the object was removed from the collection.
     */
    public boolean removeColumnDef(
            final org.opennms.netmgt.config.surveillanceViews.ColumnDef vColumnDef) {
        boolean removed = _columnDefList.remove(vColumnDef);
        return removed;
    }

    /**
     * Method removeColumnDefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.surveillanceViews.ColumnDef removeColumnDefAt(
            final int index) {
        java.lang.Object obj = this._columnDefList.remove(index);
        return (org.opennms.netmgt.config.surveillanceViews.ColumnDef) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vColumnDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setColumnDef(
            final int index,
            final org.opennms.netmgt.config.surveillanceViews.ColumnDef vColumnDef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._columnDefList.size()) {
            throw new IndexOutOfBoundsException("setColumnDef: Index value '" + index + "' not in range [0.." + (this._columnDefList.size() - 1) + "]");
        }
        
        this._columnDefList.set(index, vColumnDef);
    }

    /**
     * 
     * 
     * @param vColumnDefArray
     */
    public void setColumnDef(
            final org.opennms.netmgt.config.surveillanceViews.ColumnDef[] vColumnDefArray) {
        //-- copy array
        _columnDefList.clear();
        
        for (int i = 0; i < vColumnDefArray.length; i++) {
                this._columnDefList.add(vColumnDefArray[i]);
        }
    }

    /**
     * Sets the value of '_columnDefList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vColumnDefList the Vector to copy.
     */
    public void setColumnDef(
            final java.util.List<org.opennms.netmgt.config.surveillanceViews.ColumnDef> vColumnDefList) {
        // copy vector
        this._columnDefList.clear();
        
        this._columnDefList.addAll(vColumnDefList);
    }

    /**
     * Sets the value of '_columnDefList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param columnDefList the Vector to set.
     */
    public void setColumnDefCollection(
            final java.util.List<org.opennms.netmgt.config.surveillanceViews.ColumnDef> columnDefList) {
        this._columnDefList = columnDefList;
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
     * org.opennms.netmgt.config.surveillanceViews.Columns
     */
    public static org.opennms.netmgt.config.surveillanceViews.Columns unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.surveillanceViews.Columns) Unmarshaller.unmarshal(org.opennms.netmgt.config.surveillanceViews.Columns.class, reader);
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

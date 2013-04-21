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
 * Class Rows.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Rows implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _rowList.
     */
    private java.util.List<org.opennms.report.availability.Row> _rowList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Rows() {
        super();
        this._rowList = new java.util.ArrayList<org.opennms.report.availability.Row>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRow
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRow(
            final org.opennms.report.availability.Row vRow)
    throws java.lang.IndexOutOfBoundsException {
        this._rowList.add(vRow);
    }

    /**
     * 
     * 
     * @param index
     * @param vRow
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRow(
            final int index,
            final org.opennms.report.availability.Row vRow)
    throws java.lang.IndexOutOfBoundsException {
        this._rowList.add(index, vRow);
    }

    /**
     * Method enumerateRow.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.availability.Row> enumerateRow(
    ) {
        return java.util.Collections.enumeration(this._rowList);
    }

    /**
     * Method getRow.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.opennms.report.availability.Row
     * at the given index
     */
    public org.opennms.report.availability.Row getRow(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rowList.size()) {
            throw new IndexOutOfBoundsException("getRow: Index value '" + index + "' not in range [0.." + (this._rowList.size() - 1) + "]");
        }
        
        return (org.opennms.report.availability.Row) _rowList.get(index);
    }

    /**
     * Method getRow.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.report.availability.Row[] getRow(
    ) {
        org.opennms.report.availability.Row[] array = new org.opennms.report.availability.Row[0];
        return (org.opennms.report.availability.Row[]) this._rowList.toArray(array);
    }

    /**
     * Method getRowCollection.Returns a reference to '_rowList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.availability.Row> getRowCollection(
    ) {
        return this._rowList;
    }

    /**
     * Method getRowCount.
     * 
     * @return the size of this collection
     */
    public int getRowCount(
    ) {
        return this._rowList.size();
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
     * Method iterateRow.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.availability.Row> iterateRow(
    ) {
        return this._rowList.iterator();
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
    public void removeAllRow(
    ) {
        this._rowList.clear();
    }

    /**
     * Method removeRow.
     * 
     * @param vRow
     * @return true if the object was removed from the collection.
     */
    public boolean removeRow(
            final org.opennms.report.availability.Row vRow) {
        boolean removed = _rowList.remove(vRow);
        return removed;
    }

    /**
     * Method removeRowAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.availability.Row removeRowAt(
            final int index) {
        java.lang.Object obj = this._rowList.remove(index);
        return (org.opennms.report.availability.Row) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRow
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRow(
            final int index,
            final org.opennms.report.availability.Row vRow)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._rowList.size()) {
            throw new IndexOutOfBoundsException("setRow: Index value '" + index + "' not in range [0.." + (this._rowList.size() - 1) + "]");
        }
        
        this._rowList.set(index, vRow);
    }

    /**
     * 
     * 
     * @param vRowArray
     */
    public void setRow(
            final org.opennms.report.availability.Row[] vRowArray) {
        //-- copy array
        _rowList.clear();
        
        for (int i = 0; i < vRowArray.length; i++) {
                this._rowList.add(vRowArray[i]);
        }
    }

    /**
     * Sets the value of '_rowList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vRowList the Vector to copy.
     */
    public void setRow(
            final java.util.List<org.opennms.report.availability.Row> vRowList) {
        // copy vector
        this._rowList.clear();
        
        this._rowList.addAll(vRowList);
    }

    /**
     * Sets the value of '_rowList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param rowList the Vector to set.
     */
    public void setRowCollection(
            final java.util.List<org.opennms.report.availability.Row> rowList) {
        this._rowList = rowList;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.report.availability.Rows
     */
    public static org.opennms.report.availability.Rows unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Rows) Unmarshaller.unmarshal(org.opennms.report.availability.Rows.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rrd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Datasources.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Datasources implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defList.
     */
    private java.util.List<org.opennms.netmgt.config.rrd.Def> _defList;

    /**
     * Field _export_dataList.
     */
    private java.util.List<org.opennms.netmgt.config.rrd.Export_data> _export_dataList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Datasources() {
        super();
        this._defList = new java.util.ArrayList<org.opennms.netmgt.config.rrd.Def>();
        this._export_dataList = new java.util.ArrayList<org.opennms.netmgt.config.rrd.Export_data>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDef(
            final org.opennms.netmgt.config.rrd.Def vDef)
    throws java.lang.IndexOutOfBoundsException {
        this._defList.add(vDef);
    }

    /**
     * 
     * 
     * @param index
     * @param vDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDef(
            final int index,
            final org.opennms.netmgt.config.rrd.Def vDef)
    throws java.lang.IndexOutOfBoundsException {
        this._defList.add(index, vDef);
    }

    /**
     * 
     * 
     * @param vExport_data
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExport_data(
            final org.opennms.netmgt.config.rrd.Export_data vExport_data)
    throws java.lang.IndexOutOfBoundsException {
        this._export_dataList.add(vExport_data);
    }

    /**
     * 
     * 
     * @param index
     * @param vExport_data
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExport_data(
            final int index,
            final org.opennms.netmgt.config.rrd.Export_data vExport_data)
    throws java.lang.IndexOutOfBoundsException {
        this._export_dataList.add(index, vExport_data);
    }

    /**
     * Method enumerateDef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.rrd.Def> enumerateDef(
    ) {
        return java.util.Collections.enumeration(this._defList);
    }

    /**
     * Method enumerateExport_data.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.rrd.Export_data> enumerateExport_data(
    ) {
        return java.util.Collections.enumeration(this._export_dataList);
    }

    /**
     * Method getDef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.opennms.netmgt.config.rrd.Def
     * at the given index
     */
    public org.opennms.netmgt.config.rrd.Def getDef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._defList.size()) {
            throw new IndexOutOfBoundsException("getDef: Index value '" + index + "' not in range [0.." + (this._defList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.rrd.Def) _defList.get(index);
    }

    /**
     * Method getDef.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.rrd.Def[] getDef(
    ) {
        org.opennms.netmgt.config.rrd.Def[] array = new org.opennms.netmgt.config.rrd.Def[0];
        return (org.opennms.netmgt.config.rrd.Def[]) this._defList.toArray(array);
    }

    /**
     * Method getDefCollection.Returns a reference to '_defList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.rrd.Def> getDefCollection(
    ) {
        return this._defList;
    }

    /**
     * Method getDefCount.
     * 
     * @return the size of this collection
     */
    public int getDefCount(
    ) {
        return this._defList.size();
    }

    /**
     * Method getExport_data.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.rrd.Export_data at the given index
     */
    public org.opennms.netmgt.config.rrd.Export_data getExport_data(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._export_dataList.size()) {
            throw new IndexOutOfBoundsException("getExport_data: Index value '" + index + "' not in range [0.." + (this._export_dataList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.rrd.Export_data) _export_dataList.get(index);
    }

    /**
     * Method getExport_data.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.rrd.Export_data[] getExport_data(
    ) {
        org.opennms.netmgt.config.rrd.Export_data[] array = new org.opennms.netmgt.config.rrd.Export_data[0];
        return (org.opennms.netmgt.config.rrd.Export_data[]) this._export_dataList.toArray(array);
    }

    /**
     * Method getExport_dataCollection.Returns a reference to
     * '_export_dataList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.rrd.Export_data> getExport_dataCollection(
    ) {
        return this._export_dataList;
    }

    /**
     * Method getExport_dataCount.
     * 
     * @return the size of this collection
     */
    public int getExport_dataCount(
    ) {
        return this._export_dataList.size();
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
     * Method iterateDef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.rrd.Def> iterateDef(
    ) {
        return this._defList.iterator();
    }

    /**
     * Method iterateExport_data.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.rrd.Export_data> iterateExport_data(
    ) {
        return this._export_dataList.iterator();
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
    public void removeAllDef(
    ) {
        this._defList.clear();
    }

    /**
     */
    public void removeAllExport_data(
    ) {
        this._export_dataList.clear();
    }

    /**
     * Method removeDef.
     * 
     * @param vDef
     * @return true if the object was removed from the collection.
     */
    public boolean removeDef(
            final org.opennms.netmgt.config.rrd.Def vDef) {
        boolean removed = _defList.remove(vDef);
        return removed;
    }

    /**
     * Method removeDefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.rrd.Def removeDefAt(
            final int index) {
        java.lang.Object obj = this._defList.remove(index);
        return (org.opennms.netmgt.config.rrd.Def) obj;
    }

    /**
     * Method removeExport_data.
     * 
     * @param vExport_data
     * @return true if the object was removed from the collection.
     */
    public boolean removeExport_data(
            final org.opennms.netmgt.config.rrd.Export_data vExport_data) {
        boolean removed = _export_dataList.remove(vExport_data);
        return removed;
    }

    /**
     * Method removeExport_dataAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.rrd.Export_data removeExport_dataAt(
            final int index) {
        java.lang.Object obj = this._export_dataList.remove(index);
        return (org.opennms.netmgt.config.rrd.Export_data) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDef(
            final int index,
            final org.opennms.netmgt.config.rrd.Def vDef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._defList.size()) {
            throw new IndexOutOfBoundsException("setDef: Index value '" + index + "' not in range [0.." + (this._defList.size() - 1) + "]");
        }
        
        this._defList.set(index, vDef);
    }

    /**
     * 
     * 
     * @param vDefArray
     */
    public void setDef(
            final org.opennms.netmgt.config.rrd.Def[] vDefArray) {
        //-- copy array
        _defList.clear();
        
        for (int i = 0; i < vDefArray.length; i++) {
                this._defList.add(vDefArray[i]);
        }
    }

    /**
     * Sets the value of '_defList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vDefList the Vector to copy.
     */
    public void setDef(
            final java.util.List<org.opennms.netmgt.config.rrd.Def> vDefList) {
        // copy vector
        this._defList.clear();
        
        this._defList.addAll(vDefList);
    }

    /**
     * Sets the value of '_defList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param defList the Vector to set.
     */
    public void setDefCollection(
            final java.util.List<org.opennms.netmgt.config.rrd.Def> defList) {
        this._defList = defList;
    }

    /**
     * 
     * 
     * @param index
     * @param vExport_data
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExport_data(
            final int index,
            final org.opennms.netmgt.config.rrd.Export_data vExport_data)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._export_dataList.size()) {
            throw new IndexOutOfBoundsException("setExport_data: Index value '" + index + "' not in range [0.." + (this._export_dataList.size() - 1) + "]");
        }
        
        this._export_dataList.set(index, vExport_data);
    }

    /**
     * 
     * 
     * @param vExport_dataArray
     */
    public void setExport_data(
            final org.opennms.netmgt.config.rrd.Export_data[] vExport_dataArray) {
        //-- copy array
        _export_dataList.clear();
        
        for (int i = 0; i < vExport_dataArray.length; i++) {
                this._export_dataList.add(vExport_dataArray[i]);
        }
    }

    /**
     * Sets the value of '_export_dataList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vExport_dataList the Vector to copy.
     */
    public void setExport_data(
            final java.util.List<org.opennms.netmgt.config.rrd.Export_data> vExport_dataList) {
        // copy vector
        this._export_dataList.clear();
        
        this._export_dataList.addAll(vExport_dataList);
    }

    /**
     * Sets the value of '_export_dataList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param export_dataList the Vector to set.
     */
    public void setExport_dataCollection(
            final java.util.List<org.opennms.netmgt.config.rrd.Export_data> export_dataList) {
        this._export_dataList = export_dataList;
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
     * org.opennms.netmgt.config.rrd.Datasources
     */
    public static org.opennms.netmgt.config.rrd.Datasources unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.Datasources) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.Datasources.class, reader);
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

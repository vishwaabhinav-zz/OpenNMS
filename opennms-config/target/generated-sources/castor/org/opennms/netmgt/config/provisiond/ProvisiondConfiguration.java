/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.provisiond;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Behavior configuration for the Provisioner Daemon
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ProvisiondConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _importThreads.
     */
    private long _importThreads = 8;

    /**
     * keeps track of state for field: _importThreads
     */
    private boolean _has_importThreads;

    /**
     * Field _scanThreads.
     */
    private long _scanThreads = 10;

    /**
     * keeps track of state for field: _scanThreads
     */
    private boolean _has_scanThreads;

    /**
     * Field _rescanThreads.
     */
    private long _rescanThreads = 10;

    /**
     * keeps track of state for field: _rescanThreads
     */
    private boolean _has_rescanThreads;

    /**
     * Field _writeThreads.
     */
    private long _writeThreads = 8;

    /**
     * keeps track of state for field: _writeThreads
     */
    private boolean _has_writeThreads;

    /**
     * Field _requistionDir.
     */
    private java.lang.String _requistionDir = "$install.dir}/etc/imports";

    /**
     * Field _foreignSourceDir.
     */
    private java.lang.String _foreignSourceDir = "${install.dir}/etc/foreign-sources";

    /**
     * Defines an import job with a cron expression
     *  
     *  http://quartz.sourceforge.net/javadoc/org/quartz/CronTrigger.html
     *  Field Name Allowed Values Allowed Special Characters
     *  Seconds 0-59 , - /
     *  Minutes 0-59 , - /
     *  Hours 0-23 , - /
     *  Day-of-month 1-31 , - ? / L W C
     *  Month 1-12 or JAN-DEC , - /
     *  Day-of-Week 1-7 or SUN-SAT , - ? / L C #
     *  Year (Opt) empty, 1970-2099 , - /
     *  
     */
    private java.util.List<org.opennms.netmgt.config.provisiond.RequisitionDef> _requisitionDefList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProvisiondConfiguration() {
        super();
        setRequistionDir("$install.dir}/etc/imports");
        setForeignSourceDir("${install.dir}/etc/foreign-sources");
        this._requisitionDefList = new java.util.ArrayList<org.opennms.netmgt.config.provisiond.RequisitionDef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRequisitionDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRequisitionDef(
            final org.opennms.netmgt.config.provisiond.RequisitionDef vRequisitionDef)
    throws java.lang.IndexOutOfBoundsException {
        this._requisitionDefList.add(vRequisitionDef);
    }

    /**
     * 
     * 
     * @param index
     * @param vRequisitionDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRequisitionDef(
            final int index,
            final org.opennms.netmgt.config.provisiond.RequisitionDef vRequisitionDef)
    throws java.lang.IndexOutOfBoundsException {
        this._requisitionDefList.add(index, vRequisitionDef);
    }

    /**
     */
    public void deleteImportThreads(
    ) {
        this._has_importThreads= false;
    }

    /**
     */
    public void deleteRescanThreads(
    ) {
        this._has_rescanThreads= false;
    }

    /**
     */
    public void deleteScanThreads(
    ) {
        this._has_scanThreads= false;
    }

    /**
     */
    public void deleteWriteThreads(
    ) {
        this._has_writeThreads= false;
    }

    /**
     * Method enumerateRequisitionDef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.provisiond.RequisitionDef> enumerateRequisitionDef(
    ) {
        return java.util.Collections.enumeration(this._requisitionDefList);
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
        
        if (obj instanceof ProvisiondConfiguration) {
        
            ProvisiondConfiguration temp = (ProvisiondConfiguration)obj;
            if (this._importThreads != temp._importThreads)
                return false;
            if (this._has_importThreads != temp._has_importThreads)
                return false;
            if (this._scanThreads != temp._scanThreads)
                return false;
            if (this._has_scanThreads != temp._has_scanThreads)
                return false;
            if (this._rescanThreads != temp._rescanThreads)
                return false;
            if (this._has_rescanThreads != temp._has_rescanThreads)
                return false;
            if (this._writeThreads != temp._writeThreads)
                return false;
            if (this._has_writeThreads != temp._has_writeThreads)
                return false;
            if (this._requistionDir != null) {
                if (temp._requistionDir == null) return false;
                else if (!(this._requistionDir.equals(temp._requistionDir))) 
                    return false;
            }
            else if (temp._requistionDir != null)
                return false;
            if (this._foreignSourceDir != null) {
                if (temp._foreignSourceDir == null) return false;
                else if (!(this._foreignSourceDir.equals(temp._foreignSourceDir))) 
                    return false;
            }
            else if (temp._foreignSourceDir != null)
                return false;
            if (this._requisitionDefList != null) {
                if (temp._requisitionDefList == null) return false;
                else if (!(this._requisitionDefList.equals(temp._requisitionDefList))) 
                    return false;
            }
            else if (temp._requisitionDefList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'foreignSourceDir'.
     * 
     * @return the value of field 'ForeignSourceDir'.
     */
    public java.lang.String getForeignSourceDir(
    ) {
        return this._foreignSourceDir;
    }

    /**
     * Returns the value of field 'importThreads'.
     * 
     * @return the value of field 'ImportThreads'.
     */
    public long getImportThreads(
    ) {
        return this._importThreads;
    }

    /**
     * Method getRequisitionDef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.provisiond.RequisitionDef at the
     * given index
     */
    public org.opennms.netmgt.config.provisiond.RequisitionDef getRequisitionDef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._requisitionDefList.size()) {
            throw new IndexOutOfBoundsException("getRequisitionDef: Index value '" + index + "' not in range [0.." + (this._requisitionDefList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.provisiond.RequisitionDef) _requisitionDefList.get(index);
    }

    /**
     * Method getRequisitionDef.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.provisiond.RequisitionDef[] getRequisitionDef(
    ) {
        org.opennms.netmgt.config.provisiond.RequisitionDef[] array = new org.opennms.netmgt.config.provisiond.RequisitionDef[0];
        return (org.opennms.netmgt.config.provisiond.RequisitionDef[]) this._requisitionDefList.toArray(array);
    }

    /**
     * Method getRequisitionDefCollection.Returns a reference to
     * '_requisitionDefList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.provisiond.RequisitionDef> getRequisitionDefCollection(
    ) {
        return this._requisitionDefList;
    }

    /**
     * Method getRequisitionDefCount.
     * 
     * @return the size of this collection
     */
    public int getRequisitionDefCount(
    ) {
        return this._requisitionDefList.size();
    }

    /**
     * Returns the value of field 'requistionDir'.
     * 
     * @return the value of field 'RequistionDir'.
     */
    public java.lang.String getRequistionDir(
    ) {
        return this._requistionDir;
    }

    /**
     * Returns the value of field 'rescanThreads'.
     * 
     * @return the value of field 'RescanThreads'.
     */
    public long getRescanThreads(
    ) {
        return this._rescanThreads;
    }

    /**
     * Returns the value of field 'scanThreads'.
     * 
     * @return the value of field 'ScanThreads'.
     */
    public long getScanThreads(
    ) {
        return this._scanThreads;
    }

    /**
     * Returns the value of field 'writeThreads'.
     * 
     * @return the value of field 'WriteThreads'.
     */
    public long getWriteThreads(
    ) {
        return this._writeThreads;
    }

    /**
     * Method hasImportThreads.
     * 
     * @return true if at least one ImportThreads has been added
     */
    public boolean hasImportThreads(
    ) {
        return this._has_importThreads;
    }

    /**
     * Method hasRescanThreads.
     * 
     * @return true if at least one RescanThreads has been added
     */
    public boolean hasRescanThreads(
    ) {
        return this._has_rescanThreads;
    }

    /**
     * Method hasScanThreads.
     * 
     * @return true if at least one ScanThreads has been added
     */
    public boolean hasScanThreads(
    ) {
        return this._has_scanThreads;
    }

    /**
     * Method hasWriteThreads.
     * 
     * @return true if at least one WriteThreads has been added
     */
    public boolean hasWriteThreads(
    ) {
        return this._has_writeThreads;
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
        result = 37 * result + (int)(_importThreads^(_importThreads>>>32));
        result = 37 * result + (int)(_scanThreads^(_scanThreads>>>32));
        result = 37 * result + (int)(_rescanThreads^(_rescanThreads>>>32));
        result = 37 * result + (int)(_writeThreads^(_writeThreads>>>32));
        if (_requistionDir != null) {
           result = 37 * result + _requistionDir.hashCode();
        }
        if (_foreignSourceDir != null) {
           result = 37 * result + _foreignSourceDir.hashCode();
        }
        if (_requisitionDefList != null) {
           result = 37 * result + _requisitionDefList.hashCode();
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
     * Method iterateRequisitionDef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.provisiond.RequisitionDef> iterateRequisitionDef(
    ) {
        return this._requisitionDefList.iterator();
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
    public void removeAllRequisitionDef(
    ) {
        this._requisitionDefList.clear();
    }

    /**
     * Method removeRequisitionDef.
     * 
     * @param vRequisitionDef
     * @return true if the object was removed from the collection.
     */
    public boolean removeRequisitionDef(
            final org.opennms.netmgt.config.provisiond.RequisitionDef vRequisitionDef) {
        boolean removed = _requisitionDefList.remove(vRequisitionDef);
        return removed;
    }

    /**
     * Method removeRequisitionDefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.provisiond.RequisitionDef removeRequisitionDefAt(
            final int index) {
        java.lang.Object obj = this._requisitionDefList.remove(index);
        return (org.opennms.netmgt.config.provisiond.RequisitionDef) obj;
    }

    /**
     * Sets the value of field 'foreignSourceDir'.
     * 
     * @param foreignSourceDir the value of field 'foreignSourceDir'
     */
    public void setForeignSourceDir(
            final java.lang.String foreignSourceDir) {
        this._foreignSourceDir = foreignSourceDir;
    }

    /**
     * Sets the value of field 'importThreads'.
     * 
     * @param importThreads the value of field 'importThreads'.
     */
    public void setImportThreads(
            final long importThreads) {
        this._importThreads = importThreads;
        this._has_importThreads = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vRequisitionDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRequisitionDef(
            final int index,
            final org.opennms.netmgt.config.provisiond.RequisitionDef vRequisitionDef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._requisitionDefList.size()) {
            throw new IndexOutOfBoundsException("setRequisitionDef: Index value '" + index + "' not in range [0.." + (this._requisitionDefList.size() - 1) + "]");
        }
        
        this._requisitionDefList.set(index, vRequisitionDef);
    }

    /**
     * 
     * 
     * @param vRequisitionDefArray
     */
    public void setRequisitionDef(
            final org.opennms.netmgt.config.provisiond.RequisitionDef[] vRequisitionDefArray) {
        //-- copy array
        _requisitionDefList.clear();
        
        for (int i = 0; i < vRequisitionDefArray.length; i++) {
                this._requisitionDefList.add(vRequisitionDefArray[i]);
        }
    }

    /**
     * Sets the value of '_requisitionDefList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vRequisitionDefList the Vector to copy.
     */
    public void setRequisitionDef(
            final java.util.List<org.opennms.netmgt.config.provisiond.RequisitionDef> vRequisitionDefList) {
        // copy vector
        this._requisitionDefList.clear();
        
        this._requisitionDefList.addAll(vRequisitionDefList);
    }

    /**
     * Sets the value of '_requisitionDefList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param requisitionDefList the Vector to set.
     */
    public void setRequisitionDefCollection(
            final java.util.List<org.opennms.netmgt.config.provisiond.RequisitionDef> requisitionDefList) {
        this._requisitionDefList = requisitionDefList;
    }

    /**
     * Sets the value of field 'requistionDir'.
     * 
     * @param requistionDir the value of field 'requistionDir'.
     */
    public void setRequistionDir(
            final java.lang.String requistionDir) {
        this._requistionDir = requistionDir;
    }

    /**
     * Sets the value of field 'rescanThreads'.
     * 
     * @param rescanThreads the value of field 'rescanThreads'.
     */
    public void setRescanThreads(
            final long rescanThreads) {
        this._rescanThreads = rescanThreads;
        this._has_rescanThreads = true;
    }

    /**
     * Sets the value of field 'scanThreads'.
     * 
     * @param scanThreads the value of field 'scanThreads'.
     */
    public void setScanThreads(
            final long scanThreads) {
        this._scanThreads = scanThreads;
        this._has_scanThreads = true;
    }

    /**
     * Sets the value of field 'writeThreads'.
     * 
     * @param writeThreads the value of field 'writeThreads'.
     */
    public void setWriteThreads(
            final long writeThreads) {
        this._writeThreads = writeThreads;
        this._has_writeThreads = true;
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
     * org.opennms.netmgt.config.provisiond.ProvisiondConfiguration
     */
    public static org.opennms.netmgt.config.provisiond.ProvisiondConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.provisiond.ProvisiondConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.provisiond.ProvisiondConfiguration.class, reader);
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

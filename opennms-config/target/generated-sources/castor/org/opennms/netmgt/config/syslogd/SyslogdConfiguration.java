/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.syslogd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class SyslogdConfiguration.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class SyslogdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Top-level element for the syslogd-configuration.xml
     *  configuration file.
     *  
     */
    private org.opennms.netmgt.config.syslogd.Configuration _configuration;

    /**
     * Field _ueiList.
     */
    private org.opennms.netmgt.config.syslogd.UeiList _ueiList;

    /**
     * Field _hideMessage.
     */
    private org.opennms.netmgt.config.syslogd.HideMessage _hideMessage;

    /**
     * Field _importFileList.
     */
    private java.util.List<java.lang.String> _importFileList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SyslogdConfiguration() {
        super();
        this._importFileList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vImportFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImportFile(
            final java.lang.String vImportFile)
    throws java.lang.IndexOutOfBoundsException {
        this._importFileList.add(vImportFile);
    }

    /**
     * 
     * 
     * @param index
     * @param vImportFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addImportFile(
            final int index,
            final java.lang.String vImportFile)
    throws java.lang.IndexOutOfBoundsException {
        this._importFileList.add(index, vImportFile);
    }

    /**
     * Method enumerateImportFile.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateImportFile(
    ) {
        return java.util.Collections.enumeration(this._importFileList);
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
        
        if (obj instanceof SyslogdConfiguration) {
        
            SyslogdConfiguration temp = (SyslogdConfiguration)obj;
            if (this._configuration != null) {
                if (temp._configuration == null) return false;
                else if (!(this._configuration.equals(temp._configuration))) 
                    return false;
            }
            else if (temp._configuration != null)
                return false;
            if (this._ueiList != null) {
                if (temp._ueiList == null) return false;
                else if (!(this._ueiList.equals(temp._ueiList))) 
                    return false;
            }
            else if (temp._ueiList != null)
                return false;
            if (this._hideMessage != null) {
                if (temp._hideMessage == null) return false;
                else if (!(this._hideMessage.equals(temp._hideMessage))) 
                    return false;
            }
            else if (temp._hideMessage != null)
                return false;
            if (this._importFileList != null) {
                if (temp._importFileList == null) return false;
                else if (!(this._importFileList.equals(temp._importFileList))) 
                    return false;
            }
            else if (temp._importFileList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'configuration'. The field
     * 'configuration' has the following description: Top-level
     * element for the syslogd-configuration.xml
     *  configuration file.
     *  
     * 
     * @return the value of field 'Configuration'.
     */
    public org.opennms.netmgt.config.syslogd.Configuration getConfiguration(
    ) {
        return this._configuration;
    }

    /**
     * Returns the value of field 'hideMessage'.
     * 
     * @return the value of field 'HideMessage'.
     */
    public org.opennms.netmgt.config.syslogd.HideMessage getHideMessage(
    ) {
        return this._hideMessage;
    }

    /**
     * Method getImportFile.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getImportFile(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._importFileList.size()) {
            throw new IndexOutOfBoundsException("getImportFile: Index value '" + index + "' not in range [0.." + (this._importFileList.size() - 1) + "]");
        }
        
        return (java.lang.String) _importFileList.get(index);
    }

    /**
     * Method getImportFile.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getImportFile(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._importFileList.toArray(array);
    }

    /**
     * Method getImportFileCollection.Returns a reference to
     * '_importFileList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getImportFileCollection(
    ) {
        return this._importFileList;
    }

    /**
     * Method getImportFileCount.
     * 
     * @return the size of this collection
     */
    public int getImportFileCount(
    ) {
        return this._importFileList.size();
    }

    /**
     * Returns the value of field 'ueiList'.
     * 
     * @return the value of field 'UeiList'.
     */
    public org.opennms.netmgt.config.syslogd.UeiList getUeiList(
    ) {
        return this._ueiList;
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
        if (_configuration != null) {
           result = 37 * result + _configuration.hashCode();
        }
        if (_ueiList != null) {
           result = 37 * result + _ueiList.hashCode();
        }
        if (_hideMessage != null) {
           result = 37 * result + _hideMessage.hashCode();
        }
        if (_importFileList != null) {
           result = 37 * result + _importFileList.hashCode();
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
     * Method iterateImportFile.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateImportFile(
    ) {
        return this._importFileList.iterator();
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
    public void removeAllImportFile(
    ) {
        this._importFileList.clear();
    }

    /**
     * Method removeImportFile.
     * 
     * @param vImportFile
     * @return true if the object was removed from the collection.
     */
    public boolean removeImportFile(
            final java.lang.String vImportFile) {
        boolean removed = _importFileList.remove(vImportFile);
        return removed;
    }

    /**
     * Method removeImportFileAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeImportFileAt(
            final int index) {
        java.lang.Object obj = this._importFileList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'configuration'. The field
     * 'configuration' has the following description: Top-level
     * element for the syslogd-configuration.xml
     *  configuration file.
     *  
     * 
     * @param configuration the value of field 'configuration'.
     */
    public void setConfiguration(
            final org.opennms.netmgt.config.syslogd.Configuration configuration) {
        this._configuration = configuration;
    }

    /**
     * Sets the value of field 'hideMessage'.
     * 
     * @param hideMessage the value of field 'hideMessage'.
     */
    public void setHideMessage(
            final org.opennms.netmgt.config.syslogd.HideMessage hideMessage) {
        this._hideMessage = hideMessage;
    }

    /**
     * 
     * 
     * @param index
     * @param vImportFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setImportFile(
            final int index,
            final java.lang.String vImportFile)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._importFileList.size()) {
            throw new IndexOutOfBoundsException("setImportFile: Index value '" + index + "' not in range [0.." + (this._importFileList.size() - 1) + "]");
        }
        
        this._importFileList.set(index, vImportFile);
    }

    /**
     * 
     * 
     * @param vImportFileArray
     */
    public void setImportFile(
            final java.lang.String[] vImportFileArray) {
        //-- copy array
        _importFileList.clear();
        
        for (int i = 0; i < vImportFileArray.length; i++) {
                this._importFileList.add(vImportFileArray[i]);
        }
    }

    /**
     * Sets the value of '_importFileList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vImportFileList the Vector to copy.
     */
    public void setImportFile(
            final java.util.List<java.lang.String> vImportFileList) {
        // copy vector
        this._importFileList.clear();
        
        this._importFileList.addAll(vImportFileList);
    }

    /**
     * Sets the value of '_importFileList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param importFileList the Vector to set.
     */
    public void setImportFileCollection(
            final java.util.List<java.lang.String> importFileList) {
        this._importFileList = importFileList;
    }

    /**
     * Sets the value of field 'ueiList'.
     * 
     * @param ueiList the value of field 'ueiList'.
     */
    public void setUeiList(
            final org.opennms.netmgt.config.syslogd.UeiList ueiList) {
        this._ueiList = ueiList;
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
     * org.opennms.netmgt.config.syslogd.SyslogdConfiguration
     */
    public static org.opennms.netmgt.config.syslogd.SyslogdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.SyslogdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.SyslogdConfiguration.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.javamail;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Read and Send configuration groups
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class JavamailConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defaultSendConfigName.
     */
    private java.lang.String _defaultSendConfigName;

    /**
     * Field _defaultReadConfigName.
     */
    private java.lang.String _defaultReadConfigName;

    /**
     * This entity defines the test for sending mail. Attributes
     * are used to
     *  derive values of java mail properties, or, they can be
     * specified directly
     *  as key value pairs. Attributes will are easier to read but
     * there isn't 
     *  an attribute for every javamail property possible (some are
     * fairly obscure).
     *  
     *  
     */
    private java.util.List<org.opennms.netmgt.config.javamail.SendmailConfig> _sendmailConfigList;

    /**
     * Configuration container for configuration all settings for
     * reading email
     *  
     *  
     */
    private java.util.List<org.opennms.netmgt.config.javamail.ReadmailConfig> _readmailConfigList;

    /**
     * Read and Send configuration list
     *  
     */
    private java.util.List<org.opennms.netmgt.config.javamail.End2endMailConfig> _end2endMailConfigList;


      //----------------/
     //- Constructors -/
    //----------------/

    public JavamailConfiguration() {
        super();
        this._sendmailConfigList = new java.util.ArrayList<org.opennms.netmgt.config.javamail.SendmailConfig>();
        this._readmailConfigList = new java.util.ArrayList<org.opennms.netmgt.config.javamail.ReadmailConfig>();
        this._end2endMailConfigList = new java.util.ArrayList<org.opennms.netmgt.config.javamail.End2endMailConfig>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEnd2endMailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnd2endMailConfig(
            final org.opennms.netmgt.config.javamail.End2endMailConfig vEnd2endMailConfig)
    throws java.lang.IndexOutOfBoundsException {
        this._end2endMailConfigList.add(vEnd2endMailConfig);
    }

    /**
     * 
     * 
     * @param index
     * @param vEnd2endMailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEnd2endMailConfig(
            final int index,
            final org.opennms.netmgt.config.javamail.End2endMailConfig vEnd2endMailConfig)
    throws java.lang.IndexOutOfBoundsException {
        this._end2endMailConfigList.add(index, vEnd2endMailConfig);
    }

    /**
     * 
     * 
     * @param vReadmailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReadmailConfig(
            final org.opennms.netmgt.config.javamail.ReadmailConfig vReadmailConfig)
    throws java.lang.IndexOutOfBoundsException {
        this._readmailConfigList.add(vReadmailConfig);
    }

    /**
     * 
     * 
     * @param index
     * @param vReadmailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReadmailConfig(
            final int index,
            final org.opennms.netmgt.config.javamail.ReadmailConfig vReadmailConfig)
    throws java.lang.IndexOutOfBoundsException {
        this._readmailConfigList.add(index, vReadmailConfig);
    }

    /**
     * 
     * 
     * @param vSendmailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSendmailConfig(
            final org.opennms.netmgt.config.javamail.SendmailConfig vSendmailConfig)
    throws java.lang.IndexOutOfBoundsException {
        this._sendmailConfigList.add(vSendmailConfig);
    }

    /**
     * 
     * 
     * @param index
     * @param vSendmailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSendmailConfig(
            final int index,
            final org.opennms.netmgt.config.javamail.SendmailConfig vSendmailConfig)
    throws java.lang.IndexOutOfBoundsException {
        this._sendmailConfigList.add(index, vSendmailConfig);
    }

    /**
     * Method enumerateEnd2endMailConfig.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.javamail.End2endMailConfig> enumerateEnd2endMailConfig(
    ) {
        return java.util.Collections.enumeration(this._end2endMailConfigList);
    }

    /**
     * Method enumerateReadmailConfig.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.javamail.ReadmailConfig> enumerateReadmailConfig(
    ) {
        return java.util.Collections.enumeration(this._readmailConfigList);
    }

    /**
     * Method enumerateSendmailConfig.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.javamail.SendmailConfig> enumerateSendmailConfig(
    ) {
        return java.util.Collections.enumeration(this._sendmailConfigList);
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
        
        if (obj instanceof JavamailConfiguration) {
        
            JavamailConfiguration temp = (JavamailConfiguration)obj;
            if (this._defaultSendConfigName != null) {
                if (temp._defaultSendConfigName == null) return false;
                else if (!(this._defaultSendConfigName.equals(temp._defaultSendConfigName))) 
                    return false;
            }
            else if (temp._defaultSendConfigName != null)
                return false;
            if (this._defaultReadConfigName != null) {
                if (temp._defaultReadConfigName == null) return false;
                else if (!(this._defaultReadConfigName.equals(temp._defaultReadConfigName))) 
                    return false;
            }
            else if (temp._defaultReadConfigName != null)
                return false;
            if (this._sendmailConfigList != null) {
                if (temp._sendmailConfigList == null) return false;
                else if (!(this._sendmailConfigList.equals(temp._sendmailConfigList))) 
                    return false;
            }
            else if (temp._sendmailConfigList != null)
                return false;
            if (this._readmailConfigList != null) {
                if (temp._readmailConfigList == null) return false;
                else if (!(this._readmailConfigList.equals(temp._readmailConfigList))) 
                    return false;
            }
            else if (temp._readmailConfigList != null)
                return false;
            if (this._end2endMailConfigList != null) {
                if (temp._end2endMailConfigList == null) return false;
                else if (!(this._end2endMailConfigList.equals(temp._end2endMailConfigList))) 
                    return false;
            }
            else if (temp._end2endMailConfigList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultReadConfigName'.
     * 
     * @return the value of field 'DefaultReadConfigName'.
     */
    public java.lang.String getDefaultReadConfigName(
    ) {
        return this._defaultReadConfigName;
    }

    /**
     * Returns the value of field 'defaultSendConfigName'.
     * 
     * @return the value of field 'DefaultSendConfigName'.
     */
    public java.lang.String getDefaultSendConfigName(
    ) {
        return this._defaultSendConfigName;
    }

    /**
     * Method getEnd2endMailConfig.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.javamail.End2endMailConfig at the
     * given index
     */
    public org.opennms.netmgt.config.javamail.End2endMailConfig getEnd2endMailConfig(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._end2endMailConfigList.size()) {
            throw new IndexOutOfBoundsException("getEnd2endMailConfig: Index value '" + index + "' not in range [0.." + (this._end2endMailConfigList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.javamail.End2endMailConfig) _end2endMailConfigList.get(index);
    }

    /**
     * Method getEnd2endMailConfig.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.javamail.End2endMailConfig[] getEnd2endMailConfig(
    ) {
        org.opennms.netmgt.config.javamail.End2endMailConfig[] array = new org.opennms.netmgt.config.javamail.End2endMailConfig[0];
        return (org.opennms.netmgt.config.javamail.End2endMailConfig[]) this._end2endMailConfigList.toArray(array);
    }

    /**
     * Method getEnd2endMailConfigCollection.Returns a reference to
     * '_end2endMailConfigList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.javamail.End2endMailConfig> getEnd2endMailConfigCollection(
    ) {
        return this._end2endMailConfigList;
    }

    /**
     * Method getEnd2endMailConfigCount.
     * 
     * @return the size of this collection
     */
    public int getEnd2endMailConfigCount(
    ) {
        return this._end2endMailConfigList.size();
    }

    /**
     * Method getReadmailConfig.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.javamail.ReadmailConfig at the
     * given index
     */
    public org.opennms.netmgt.config.javamail.ReadmailConfig getReadmailConfig(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._readmailConfigList.size()) {
            throw new IndexOutOfBoundsException("getReadmailConfig: Index value '" + index + "' not in range [0.." + (this._readmailConfigList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.javamail.ReadmailConfig) _readmailConfigList.get(index);
    }

    /**
     * Method getReadmailConfig.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.javamail.ReadmailConfig[] getReadmailConfig(
    ) {
        org.opennms.netmgt.config.javamail.ReadmailConfig[] array = new org.opennms.netmgt.config.javamail.ReadmailConfig[0];
        return (org.opennms.netmgt.config.javamail.ReadmailConfig[]) this._readmailConfigList.toArray(array);
    }

    /**
     * Method getReadmailConfigCollection.Returns a reference to
     * '_readmailConfigList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.javamail.ReadmailConfig> getReadmailConfigCollection(
    ) {
        return this._readmailConfigList;
    }

    /**
     * Method getReadmailConfigCount.
     * 
     * @return the size of this collection
     */
    public int getReadmailConfigCount(
    ) {
        return this._readmailConfigList.size();
    }

    /**
     * Method getSendmailConfig.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.javamail.SendmailConfig at the
     * given index
     */
    public org.opennms.netmgt.config.javamail.SendmailConfig getSendmailConfig(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sendmailConfigList.size()) {
            throw new IndexOutOfBoundsException("getSendmailConfig: Index value '" + index + "' not in range [0.." + (this._sendmailConfigList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.javamail.SendmailConfig) _sendmailConfigList.get(index);
    }

    /**
     * Method getSendmailConfig.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.javamail.SendmailConfig[] getSendmailConfig(
    ) {
        org.opennms.netmgt.config.javamail.SendmailConfig[] array = new org.opennms.netmgt.config.javamail.SendmailConfig[0];
        return (org.opennms.netmgt.config.javamail.SendmailConfig[]) this._sendmailConfigList.toArray(array);
    }

    /**
     * Method getSendmailConfigCollection.Returns a reference to
     * '_sendmailConfigList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.javamail.SendmailConfig> getSendmailConfigCollection(
    ) {
        return this._sendmailConfigList;
    }

    /**
     * Method getSendmailConfigCount.
     * 
     * @return the size of this collection
     */
    public int getSendmailConfigCount(
    ) {
        return this._sendmailConfigList.size();
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
        if (_defaultSendConfigName != null) {
           result = 37 * result + _defaultSendConfigName.hashCode();
        }
        if (_defaultReadConfigName != null) {
           result = 37 * result + _defaultReadConfigName.hashCode();
        }
        if (_sendmailConfigList != null) {
           result = 37 * result + _sendmailConfigList.hashCode();
        }
        if (_readmailConfigList != null) {
           result = 37 * result + _readmailConfigList.hashCode();
        }
        if (_end2endMailConfigList != null) {
           result = 37 * result + _end2endMailConfigList.hashCode();
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
     * Method iterateEnd2endMailConfig.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.javamail.End2endMailConfig> iterateEnd2endMailConfig(
    ) {
        return this._end2endMailConfigList.iterator();
    }

    /**
     * Method iterateReadmailConfig.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.javamail.ReadmailConfig> iterateReadmailConfig(
    ) {
        return this._readmailConfigList.iterator();
    }

    /**
     * Method iterateSendmailConfig.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.javamail.SendmailConfig> iterateSendmailConfig(
    ) {
        return this._sendmailConfigList.iterator();
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
    public void removeAllEnd2endMailConfig(
    ) {
        this._end2endMailConfigList.clear();
    }

    /**
     */
    public void removeAllReadmailConfig(
    ) {
        this._readmailConfigList.clear();
    }

    /**
     */
    public void removeAllSendmailConfig(
    ) {
        this._sendmailConfigList.clear();
    }

    /**
     * Method removeEnd2endMailConfig.
     * 
     * @param vEnd2endMailConfig
     * @return true if the object was removed from the collection.
     */
    public boolean removeEnd2endMailConfig(
            final org.opennms.netmgt.config.javamail.End2endMailConfig vEnd2endMailConfig) {
        boolean removed = _end2endMailConfigList.remove(vEnd2endMailConfig);
        return removed;
    }

    /**
     * Method removeEnd2endMailConfigAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.javamail.End2endMailConfig removeEnd2endMailConfigAt(
            final int index) {
        java.lang.Object obj = this._end2endMailConfigList.remove(index);
        return (org.opennms.netmgt.config.javamail.End2endMailConfig) obj;
    }

    /**
     * Method removeReadmailConfig.
     * 
     * @param vReadmailConfig
     * @return true if the object was removed from the collection.
     */
    public boolean removeReadmailConfig(
            final org.opennms.netmgt.config.javamail.ReadmailConfig vReadmailConfig) {
        boolean removed = _readmailConfigList.remove(vReadmailConfig);
        return removed;
    }

    /**
     * Method removeReadmailConfigAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.javamail.ReadmailConfig removeReadmailConfigAt(
            final int index) {
        java.lang.Object obj = this._readmailConfigList.remove(index);
        return (org.opennms.netmgt.config.javamail.ReadmailConfig) obj;
    }

    /**
     * Method removeSendmailConfig.
     * 
     * @param vSendmailConfig
     * @return true if the object was removed from the collection.
     */
    public boolean removeSendmailConfig(
            final org.opennms.netmgt.config.javamail.SendmailConfig vSendmailConfig) {
        boolean removed = _sendmailConfigList.remove(vSendmailConfig);
        return removed;
    }

    /**
     * Method removeSendmailConfigAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.javamail.SendmailConfig removeSendmailConfigAt(
            final int index) {
        java.lang.Object obj = this._sendmailConfigList.remove(index);
        return (org.opennms.netmgt.config.javamail.SendmailConfig) obj;
    }

    /**
     * Sets the value of field 'defaultReadConfigName'.
     * 
     * @param defaultReadConfigName the value of field
     * 'defaultReadConfigName'.
     */
    public void setDefaultReadConfigName(
            final java.lang.String defaultReadConfigName) {
        this._defaultReadConfigName = defaultReadConfigName;
    }

    /**
     * Sets the value of field 'defaultSendConfigName'.
     * 
     * @param defaultSendConfigName the value of field
     * 'defaultSendConfigName'.
     */
    public void setDefaultSendConfigName(
            final java.lang.String defaultSendConfigName) {
        this._defaultSendConfigName = defaultSendConfigName;
    }

    /**
     * 
     * 
     * @param index
     * @param vEnd2endMailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEnd2endMailConfig(
            final int index,
            final org.opennms.netmgt.config.javamail.End2endMailConfig vEnd2endMailConfig)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._end2endMailConfigList.size()) {
            throw new IndexOutOfBoundsException("setEnd2endMailConfig: Index value '" + index + "' not in range [0.." + (this._end2endMailConfigList.size() - 1) + "]");
        }
        
        this._end2endMailConfigList.set(index, vEnd2endMailConfig);
    }

    /**
     * 
     * 
     * @param vEnd2endMailConfigArray
     */
    public void setEnd2endMailConfig(
            final org.opennms.netmgt.config.javamail.End2endMailConfig[] vEnd2endMailConfigArray) {
        //-- copy array
        _end2endMailConfigList.clear();
        
        for (int i = 0; i < vEnd2endMailConfigArray.length; i++) {
                this._end2endMailConfigList.add(vEnd2endMailConfigArray[i]);
        }
    }

    /**
     * Sets the value of '_end2endMailConfigList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vEnd2endMailConfigList the Vector to copy.
     */
    public void setEnd2endMailConfig(
            final java.util.List<org.opennms.netmgt.config.javamail.End2endMailConfig> vEnd2endMailConfigList) {
        // copy vector
        this._end2endMailConfigList.clear();
        
        this._end2endMailConfigList.addAll(vEnd2endMailConfigList);
    }

    /**
     * Sets the value of '_end2endMailConfigList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param end2endMailConfigList the Vector to set.
     */
    public void setEnd2endMailConfigCollection(
            final java.util.List<org.opennms.netmgt.config.javamail.End2endMailConfig> end2endMailConfigList) {
        this._end2endMailConfigList = end2endMailConfigList;
    }

    /**
     * 
     * 
     * @param index
     * @param vReadmailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setReadmailConfig(
            final int index,
            final org.opennms.netmgt.config.javamail.ReadmailConfig vReadmailConfig)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._readmailConfigList.size()) {
            throw new IndexOutOfBoundsException("setReadmailConfig: Index value '" + index + "' not in range [0.." + (this._readmailConfigList.size() - 1) + "]");
        }
        
        this._readmailConfigList.set(index, vReadmailConfig);
    }

    /**
     * 
     * 
     * @param vReadmailConfigArray
     */
    public void setReadmailConfig(
            final org.opennms.netmgt.config.javamail.ReadmailConfig[] vReadmailConfigArray) {
        //-- copy array
        _readmailConfigList.clear();
        
        for (int i = 0; i < vReadmailConfigArray.length; i++) {
                this._readmailConfigList.add(vReadmailConfigArray[i]);
        }
    }

    /**
     * Sets the value of '_readmailConfigList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vReadmailConfigList the Vector to copy.
     */
    public void setReadmailConfig(
            final java.util.List<org.opennms.netmgt.config.javamail.ReadmailConfig> vReadmailConfigList) {
        // copy vector
        this._readmailConfigList.clear();
        
        this._readmailConfigList.addAll(vReadmailConfigList);
    }

    /**
     * Sets the value of '_readmailConfigList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param readmailConfigList the Vector to set.
     */
    public void setReadmailConfigCollection(
            final java.util.List<org.opennms.netmgt.config.javamail.ReadmailConfig> readmailConfigList) {
        this._readmailConfigList = readmailConfigList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSendmailConfig
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSendmailConfig(
            final int index,
            final org.opennms.netmgt.config.javamail.SendmailConfig vSendmailConfig)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sendmailConfigList.size()) {
            throw new IndexOutOfBoundsException("setSendmailConfig: Index value '" + index + "' not in range [0.." + (this._sendmailConfigList.size() - 1) + "]");
        }
        
        this._sendmailConfigList.set(index, vSendmailConfig);
    }

    /**
     * 
     * 
     * @param vSendmailConfigArray
     */
    public void setSendmailConfig(
            final org.opennms.netmgt.config.javamail.SendmailConfig[] vSendmailConfigArray) {
        //-- copy array
        _sendmailConfigList.clear();
        
        for (int i = 0; i < vSendmailConfigArray.length; i++) {
                this._sendmailConfigList.add(vSendmailConfigArray[i]);
        }
    }

    /**
     * Sets the value of '_sendmailConfigList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSendmailConfigList the Vector to copy.
     */
    public void setSendmailConfig(
            final java.util.List<org.opennms.netmgt.config.javamail.SendmailConfig> vSendmailConfigList) {
        // copy vector
        this._sendmailConfigList.clear();
        
        this._sendmailConfigList.addAll(vSendmailConfigList);
    }

    /**
     * Sets the value of '_sendmailConfigList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param sendmailConfigList the Vector to set.
     */
    public void setSendmailConfigCollection(
            final java.util.List<org.opennms.netmgt.config.javamail.SendmailConfig> sendmailConfigList) {
        this._sendmailConfigList = sendmailConfigList;
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
     * org.opennms.netmgt.config.javamail.JavamailConfiguration
     */
    public static org.opennms.netmgt.config.javamail.JavamailConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.javamail.JavamailConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.javamail.JavamailConfiguration.class, reader);
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

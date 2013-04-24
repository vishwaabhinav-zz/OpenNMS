/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.correlation.drools.config;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class RuleSet.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class RuleSet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _ruleFileList.
     */
    private java.util.List<java.lang.String> _ruleFileList;

    /**
     * Field _eventList.
     */
    private java.util.List<java.lang.String> _eventList;

    /**
     * Field _appContext.
     */
    private java.lang.String _appContext;

    /**
     * Field _globalList.
     */
    private java.util.List<org.opennms.netmgt.correlation.drools.config.Global> _globalList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RuleSet() {
        super();
        this._ruleFileList = new java.util.ArrayList<java.lang.String>();
        this._eventList = new java.util.ArrayList<java.lang.String>();
        this._globalList = new java.util.ArrayList<org.opennms.netmgt.correlation.drools.config.Global>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEvent(
            final java.lang.String vEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._eventList.add(vEvent);
    }

    /**
     * 
     * 
     * @param index
     * @param vEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEvent(
            final int index,
            final java.lang.String vEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._eventList.add(index, vEvent);
    }

    /**
     * 
     * 
     * @param vGlobal
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGlobal(
            final org.opennms.netmgt.correlation.drools.config.Global vGlobal)
    throws java.lang.IndexOutOfBoundsException {
        this._globalList.add(vGlobal);
    }

    /**
     * 
     * 
     * @param index
     * @param vGlobal
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGlobal(
            final int index,
            final org.opennms.netmgt.correlation.drools.config.Global vGlobal)
    throws java.lang.IndexOutOfBoundsException {
        this._globalList.add(index, vGlobal);
    }

    /**
     * 
     * 
     * @param vRuleFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRuleFile(
            final java.lang.String vRuleFile)
    throws java.lang.IndexOutOfBoundsException {
        this._ruleFileList.add(vRuleFile);
    }

    /**
     * 
     * 
     * @param index
     * @param vRuleFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRuleFile(
            final int index,
            final java.lang.String vRuleFile)
    throws java.lang.IndexOutOfBoundsException {
        this._ruleFileList.add(index, vRuleFile);
    }

    /**
     * Method enumerateEvent.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateEvent(
    ) {
        return java.util.Collections.enumeration(this._eventList);
    }

    /**
     * Method enumerateGlobal.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.correlation.drools.config.Global> enumerateGlobal(
    ) {
        return java.util.Collections.enumeration(this._globalList);
    }

    /**
     * Method enumerateRuleFile.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateRuleFile(
    ) {
        return java.util.Collections.enumeration(this._ruleFileList);
    }

    /**
     * Returns the value of field 'appContext'.
     * 
     * @return the value of field 'AppContext'.
     */
    public java.lang.String getAppContext(
    ) {
        return this._appContext;
    }

    /**
     * Method getEvent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getEvent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventList.size()) {
            throw new IndexOutOfBoundsException("getEvent: Index value '" + index + "' not in range [0.." + (this._eventList.size() - 1) + "]");
        }
        
        return (java.lang.String) _eventList.get(index);
    }

    /**
     * Method getEvent.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getEvent(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._eventList.toArray(array);
    }

    /**
     * Method getEventCollection.Returns a reference to
     * '_eventList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getEventCollection(
    ) {
        return this._eventList;
    }

    /**
     * Method getEventCount.
     * 
     * @return the size of this collection
     */
    public int getEventCount(
    ) {
        return this._eventList.size();
    }

    /**
     * Method getGlobal.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.correlation.drools.config.Global at the
     * given index
     */
    public org.opennms.netmgt.correlation.drools.config.Global getGlobal(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._globalList.size()) {
            throw new IndexOutOfBoundsException("getGlobal: Index value '" + index + "' not in range [0.." + (this._globalList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.correlation.drools.config.Global) _globalList.get(index);
    }

    /**
     * Method getGlobal.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.correlation.drools.config.Global[] getGlobal(
    ) {
        org.opennms.netmgt.correlation.drools.config.Global[] array = new org.opennms.netmgt.correlation.drools.config.Global[0];
        return (org.opennms.netmgt.correlation.drools.config.Global[]) this._globalList.toArray(array);
    }

    /**
     * Method getGlobalCollection.Returns a reference to
     * '_globalList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.correlation.drools.config.Global> getGlobalCollection(
    ) {
        return this._globalList;
    }

    /**
     * Method getGlobalCount.
     * 
     * @return the size of this collection
     */
    public int getGlobalCount(
    ) {
        return this._globalList.size();
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getRuleFile.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getRuleFile(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ruleFileList.size()) {
            throw new IndexOutOfBoundsException("getRuleFile: Index value '" + index + "' not in range [0.." + (this._ruleFileList.size() - 1) + "]");
        }
        
        return (java.lang.String) _ruleFileList.get(index);
    }

    /**
     * Method getRuleFile.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getRuleFile(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._ruleFileList.toArray(array);
    }

    /**
     * Method getRuleFileCollection.Returns a reference to
     * '_ruleFileList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getRuleFileCollection(
    ) {
        return this._ruleFileList;
    }

    /**
     * Method getRuleFileCount.
     * 
     * @return the size of this collection
     */
    public int getRuleFileCount(
    ) {
        return this._ruleFileList.size();
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
     * Method iterateEvent.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateEvent(
    ) {
        return this._eventList.iterator();
    }

    /**
     * Method iterateGlobal.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.correlation.drools.config.Global> iterateGlobal(
    ) {
        return this._globalList.iterator();
    }

    /**
     * Method iterateRuleFile.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateRuleFile(
    ) {
        return this._ruleFileList.iterator();
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
    public void removeAllEvent(
    ) {
        this._eventList.clear();
    }

    /**
     */
    public void removeAllGlobal(
    ) {
        this._globalList.clear();
    }

    /**
     */
    public void removeAllRuleFile(
    ) {
        this._ruleFileList.clear();
    }

    /**
     * Method removeEvent.
     * 
     * @param vEvent
     * @return true if the object was removed from the collection.
     */
    public boolean removeEvent(
            final java.lang.String vEvent) {
        boolean removed = _eventList.remove(vEvent);
        return removed;
    }

    /**
     * Method removeEventAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeEventAt(
            final int index) {
        java.lang.Object obj = this._eventList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeGlobal.
     * 
     * @param vGlobal
     * @return true if the object was removed from the collection.
     */
    public boolean removeGlobal(
            final org.opennms.netmgt.correlation.drools.config.Global vGlobal) {
        boolean removed = _globalList.remove(vGlobal);
        return removed;
    }

    /**
     * Method removeGlobalAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.correlation.drools.config.Global removeGlobalAt(
            final int index) {
        java.lang.Object obj = this._globalList.remove(index);
        return (org.opennms.netmgt.correlation.drools.config.Global) obj;
    }

    /**
     * Method removeRuleFile.
     * 
     * @param vRuleFile
     * @return true if the object was removed from the collection.
     */
    public boolean removeRuleFile(
            final java.lang.String vRuleFile) {
        boolean removed = _ruleFileList.remove(vRuleFile);
        return removed;
    }

    /**
     * Method removeRuleFileAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeRuleFileAt(
            final int index) {
        java.lang.Object obj = this._ruleFileList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'appContext'.
     * 
     * @param appContext the value of field 'appContext'.
     */
    public void setAppContext(
            final java.lang.String appContext) {
        this._appContext = appContext;
    }

    /**
     * 
     * 
     * @param index
     * @param vEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEvent(
            final int index,
            final java.lang.String vEvent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventList.size()) {
            throw new IndexOutOfBoundsException("setEvent: Index value '" + index + "' not in range [0.." + (this._eventList.size() - 1) + "]");
        }
        
        this._eventList.set(index, vEvent);
    }

    /**
     * 
     * 
     * @param vEventArray
     */
    public void setEvent(
            final java.lang.String[] vEventArray) {
        //-- copy array
        _eventList.clear();
        
        for (int i = 0; i < vEventArray.length; i++) {
                this._eventList.add(vEventArray[i]);
        }
    }

    /**
     * Sets the value of '_eventList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vEventList the Vector to copy.
     */
    public void setEvent(
            final java.util.List<java.lang.String> vEventList) {
        // copy vector
        this._eventList.clear();
        
        this._eventList.addAll(vEventList);
    }

    /**
     * Sets the value of '_eventList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param eventList the Vector to set.
     */
    public void setEventCollection(
            final java.util.List<java.lang.String> eventList) {
        this._eventList = eventList;
    }

    /**
     * 
     * 
     * @param index
     * @param vGlobal
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGlobal(
            final int index,
            final org.opennms.netmgt.correlation.drools.config.Global vGlobal)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._globalList.size()) {
            throw new IndexOutOfBoundsException("setGlobal: Index value '" + index + "' not in range [0.." + (this._globalList.size() - 1) + "]");
        }
        
        this._globalList.set(index, vGlobal);
    }

    /**
     * 
     * 
     * @param vGlobalArray
     */
    public void setGlobal(
            final org.opennms.netmgt.correlation.drools.config.Global[] vGlobalArray) {
        //-- copy array
        _globalList.clear();
        
        for (int i = 0; i < vGlobalArray.length; i++) {
                this._globalList.add(vGlobalArray[i]);
        }
    }

    /**
     * Sets the value of '_globalList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vGlobalList the Vector to copy.
     */
    public void setGlobal(
            final java.util.List<org.opennms.netmgt.correlation.drools.config.Global> vGlobalList) {
        // copy vector
        this._globalList.clear();
        
        this._globalList.addAll(vGlobalList);
    }

    /**
     * Sets the value of '_globalList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param globalList the Vector to set.
     */
    public void setGlobalCollection(
            final java.util.List<org.opennms.netmgt.correlation.drools.config.Global> globalList) {
        this._globalList = globalList;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * 
     * 
     * @param index
     * @param vRuleFile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRuleFile(
            final int index,
            final java.lang.String vRuleFile)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ruleFileList.size()) {
            throw new IndexOutOfBoundsException("setRuleFile: Index value '" + index + "' not in range [0.." + (this._ruleFileList.size() - 1) + "]");
        }
        
        this._ruleFileList.set(index, vRuleFile);
    }

    /**
     * 
     * 
     * @param vRuleFileArray
     */
    public void setRuleFile(
            final java.lang.String[] vRuleFileArray) {
        //-- copy array
        _ruleFileList.clear();
        
        for (int i = 0; i < vRuleFileArray.length; i++) {
                this._ruleFileList.add(vRuleFileArray[i]);
        }
    }

    /**
     * Sets the value of '_ruleFileList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vRuleFileList the Vector to copy.
     */
    public void setRuleFile(
            final java.util.List<java.lang.String> vRuleFileList) {
        // copy vector
        this._ruleFileList.clear();
        
        this._ruleFileList.addAll(vRuleFileList);
    }

    /**
     * Sets the value of '_ruleFileList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param ruleFileList the Vector to set.
     */
    public void setRuleFileCollection(
            final java.util.List<java.lang.String> ruleFileList) {
        this._ruleFileList = ruleFileList;
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
     * org.opennms.netmgt.correlation.drools.config.RuleSet
     */
    public static org.opennms.netmgt.correlation.drools.config.RuleSet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.correlation.drools.config.RuleSet) Unmarshaller.unmarshal(org.opennms.netmgt.correlation.drools.config.RuleSet.class, reader);
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

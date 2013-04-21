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
 * The top-level element of the drools-engine.xml configuration
 *  file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class EngineConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ruleSetList.
     */
    private java.util.List<org.opennms.netmgt.correlation.drools.config.RuleSet> _ruleSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EngineConfiguration() {
        super();
        this._ruleSetList = new java.util.ArrayList<org.opennms.netmgt.correlation.drools.config.RuleSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRuleSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRuleSet(
            final org.opennms.netmgt.correlation.drools.config.RuleSet vRuleSet)
    throws java.lang.IndexOutOfBoundsException {
        this._ruleSetList.add(vRuleSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vRuleSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRuleSet(
            final int index,
            final org.opennms.netmgt.correlation.drools.config.RuleSet vRuleSet)
    throws java.lang.IndexOutOfBoundsException {
        this._ruleSetList.add(index, vRuleSet);
    }

    /**
     * Method enumerateRuleSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.correlation.drools.config.RuleSet> enumerateRuleSet(
    ) {
        return java.util.Collections.enumeration(this._ruleSetList);
    }

    /**
     * Method getRuleSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.correlation.drools.config.RuleSet at the
     * given index
     */
    public org.opennms.netmgt.correlation.drools.config.RuleSet getRuleSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ruleSetList.size()) {
            throw new IndexOutOfBoundsException("getRuleSet: Index value '" + index + "' not in range [0.." + (this._ruleSetList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.correlation.drools.config.RuleSet) _ruleSetList.get(index);
    }

    /**
     * Method getRuleSet.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.correlation.drools.config.RuleSet[] getRuleSet(
    ) {
        org.opennms.netmgt.correlation.drools.config.RuleSet[] array = new org.opennms.netmgt.correlation.drools.config.RuleSet[0];
        return (org.opennms.netmgt.correlation.drools.config.RuleSet[]) this._ruleSetList.toArray(array);
    }

    /**
     * Method getRuleSetCollection.Returns a reference to
     * '_ruleSetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.correlation.drools.config.RuleSet> getRuleSetCollection(
    ) {
        return this._ruleSetList;
    }

    /**
     * Method getRuleSetCount.
     * 
     * @return the size of this collection
     */
    public int getRuleSetCount(
    ) {
        return this._ruleSetList.size();
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
     * Method iterateRuleSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.correlation.drools.config.RuleSet> iterateRuleSet(
    ) {
        return this._ruleSetList.iterator();
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
    public void removeAllRuleSet(
    ) {
        this._ruleSetList.clear();
    }

    /**
     * Method removeRuleSet.
     * 
     * @param vRuleSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeRuleSet(
            final org.opennms.netmgt.correlation.drools.config.RuleSet vRuleSet) {
        boolean removed = _ruleSetList.remove(vRuleSet);
        return removed;
    }

    /**
     * Method removeRuleSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.correlation.drools.config.RuleSet removeRuleSetAt(
            final int index) {
        java.lang.Object obj = this._ruleSetList.remove(index);
        return (org.opennms.netmgt.correlation.drools.config.RuleSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRuleSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRuleSet(
            final int index,
            final org.opennms.netmgt.correlation.drools.config.RuleSet vRuleSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._ruleSetList.size()) {
            throw new IndexOutOfBoundsException("setRuleSet: Index value '" + index + "' not in range [0.." + (this._ruleSetList.size() - 1) + "]");
        }
        
        this._ruleSetList.set(index, vRuleSet);
    }

    /**
     * 
     * 
     * @param vRuleSetArray
     */
    public void setRuleSet(
            final org.opennms.netmgt.correlation.drools.config.RuleSet[] vRuleSetArray) {
        //-- copy array
        _ruleSetList.clear();
        
        for (int i = 0; i < vRuleSetArray.length; i++) {
                this._ruleSetList.add(vRuleSetArray[i]);
        }
    }

    /**
     * Sets the value of '_ruleSetList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vRuleSetList the Vector to copy.
     */
    public void setRuleSet(
            final java.util.List<org.opennms.netmgt.correlation.drools.config.RuleSet> vRuleSetList) {
        // copy vector
        this._ruleSetList.clear();
        
        this._ruleSetList.addAll(vRuleSetList);
    }

    /**
     * Sets the value of '_ruleSetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param ruleSetList the Vector to set.
     */
    public void setRuleSetCollection(
            final java.util.List<org.opennms.netmgt.correlation.drools.config.RuleSet> ruleSetList) {
        this._ruleSetList = ruleSetList;
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
     * org.opennms.netmgt.correlation.drools.config.EngineConfiguration
     */
    public static org.opennms.netmgt.correlation.drools.config.EngineConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.correlation.drools.config.EngineConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.correlation.drools.config.EngineConfiguration.class, reader);
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

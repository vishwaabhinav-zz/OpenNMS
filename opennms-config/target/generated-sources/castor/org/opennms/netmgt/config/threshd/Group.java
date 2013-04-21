/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.threshd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Grouping of related threshold definitions
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Group implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Group name
     */
    private java.lang.String _name;

    /**
     * Full path to the RRD repository where the data is stored
     *  
     */
    private java.lang.String _rrdRepository;

    /**
     * Threshold definition
     */
    private java.util.List<org.opennms.netmgt.config.threshd.Threshold> _thresholdList;

    /**
     * Expression definition
     */
    private java.util.List<org.opennms.netmgt.config.threshd.Expression> _expressionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Group() {
        super();
        this._thresholdList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.Threshold>();
        this._expressionList = new java.util.ArrayList<org.opennms.netmgt.config.threshd.Expression>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExpression
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExpression(
            final org.opennms.netmgt.config.threshd.Expression vExpression)
    throws java.lang.IndexOutOfBoundsException {
        this._expressionList.add(vExpression);
    }

    /**
     * 
     * 
     * @param index
     * @param vExpression
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExpression(
            final int index,
            final org.opennms.netmgt.config.threshd.Expression vExpression)
    throws java.lang.IndexOutOfBoundsException {
        this._expressionList.add(index, vExpression);
    }

    /**
     * 
     * 
     * @param vThreshold
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addThreshold(
            final org.opennms.netmgt.config.threshd.Threshold vThreshold)
    throws java.lang.IndexOutOfBoundsException {
        this._thresholdList.add(vThreshold);
    }

    /**
     * 
     * 
     * @param index
     * @param vThreshold
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addThreshold(
            final int index,
            final org.opennms.netmgt.config.threshd.Threshold vThreshold)
    throws java.lang.IndexOutOfBoundsException {
        this._thresholdList.add(index, vThreshold);
    }

    /**
     * Method enumerateExpression.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.Expression> enumerateExpression(
    ) {
        return java.util.Collections.enumeration(this._expressionList);
    }

    /**
     * Method enumerateThreshold.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.threshd.Threshold> enumerateThreshold(
    ) {
        return java.util.Collections.enumeration(this._thresholdList);
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
        
        if (obj instanceof Group) {
        
            Group temp = (Group)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._rrdRepository != null) {
                if (temp._rrdRepository == null) return false;
                else if (!(this._rrdRepository.equals(temp._rrdRepository))) 
                    return false;
            }
            else if (temp._rrdRepository != null)
                return false;
            if (this._thresholdList != null) {
                if (temp._thresholdList == null) return false;
                else if (!(this._thresholdList.equals(temp._thresholdList))) 
                    return false;
            }
            else if (temp._thresholdList != null)
                return false;
            if (this._expressionList != null) {
                if (temp._expressionList == null) return false;
                else if (!(this._expressionList.equals(temp._expressionList))) 
                    return false;
            }
            else if (temp._expressionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getExpression.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.Expression at the given
     * index
     */
    public org.opennms.netmgt.config.threshd.Expression getExpression(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._expressionList.size()) {
            throw new IndexOutOfBoundsException("getExpression: Index value '" + index + "' not in range [0.." + (this._expressionList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.threshd.Expression) _expressionList.get(index);
    }

    /**
     * Method getExpression.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.threshd.Expression[] getExpression(
    ) {
        org.opennms.netmgt.config.threshd.Expression[] array = new org.opennms.netmgt.config.threshd.Expression[0];
        return (org.opennms.netmgt.config.threshd.Expression[]) this._expressionList.toArray(array);
    }

    /**
     * Method getExpressionCollection.Returns a reference to
     * '_expressionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.Expression> getExpressionCollection(
    ) {
        return this._expressionList;
    }

    /**
     * Method getExpressionCount.
     * 
     * @return the size of this collection
     */
    public int getExpressionCount(
    ) {
        return this._expressionList.size();
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Group name
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'rrdRepository'. The field
     * 'rrdRepository' has the following description: Full path to
     * the RRD repository where the data is stored
     *  
     * 
     * @return the value of field 'RrdRepository'.
     */
    public java.lang.String getRrdRepository(
    ) {
        return this._rrdRepository;
    }

    /**
     * Method getThreshold.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.threshd.Threshold at the given inde
     */
    public org.opennms.netmgt.config.threshd.Threshold getThreshold(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._thresholdList.size()) {
            throw new IndexOutOfBoundsException("getThreshold: Index value '" + index + "' not in range [0.." + (this._thresholdList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.threshd.Threshold) _thresholdList.get(index);
    }

    /**
     * Method getThreshold.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.threshd.Threshold[] getThreshold(
    ) {
        org.opennms.netmgt.config.threshd.Threshold[] array = new org.opennms.netmgt.config.threshd.Threshold[0];
        return (org.opennms.netmgt.config.threshd.Threshold[]) this._thresholdList.toArray(array);
    }

    /**
     * Method getThresholdCollection.Returns a reference to
     * '_thresholdList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.threshd.Threshold> getThresholdCollection(
    ) {
        return this._thresholdList;
    }

    /**
     * Method getThresholdCount.
     * 
     * @return the size of this collection
     */
    public int getThresholdCount(
    ) {
        return this._thresholdList.size();
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_rrdRepository != null) {
           result = 37 * result + _rrdRepository.hashCode();
        }
        if (_thresholdList != null) {
           result = 37 * result + _thresholdList.hashCode();
        }
        if (_expressionList != null) {
           result = 37 * result + _expressionList.hashCode();
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
     * Method iterateExpression.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.threshd.Expression> iterateExpression(
    ) {
        return this._expressionList.iterator();
    }

    /**
     * Method iterateThreshold.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.threshd.Threshold> iterateThreshold(
    ) {
        return this._thresholdList.iterator();
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
    public void removeAllExpression(
    ) {
        this._expressionList.clear();
    }

    /**
     */
    public void removeAllThreshold(
    ) {
        this._thresholdList.clear();
    }

    /**
     * Method removeExpression.
     * 
     * @param vExpression
     * @return true if the object was removed from the collection.
     */
    public boolean removeExpression(
            final org.opennms.netmgt.config.threshd.Expression vExpression) {
        boolean removed = _expressionList.remove(vExpression);
        return removed;
    }

    /**
     * Method removeExpressionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.Expression removeExpressionAt(
            final int index) {
        java.lang.Object obj = this._expressionList.remove(index);
        return (org.opennms.netmgt.config.threshd.Expression) obj;
    }

    /**
     * Method removeThreshold.
     * 
     * @param vThreshold
     * @return true if the object was removed from the collection.
     */
    public boolean removeThreshold(
            final org.opennms.netmgt.config.threshd.Threshold vThreshold) {
        boolean removed = _thresholdList.remove(vThreshold);
        return removed;
    }

    /**
     * Method removeThresholdAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.threshd.Threshold removeThresholdAt(
            final int index) {
        java.lang.Object obj = this._thresholdList.remove(index);
        return (org.opennms.netmgt.config.threshd.Threshold) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vExpression
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExpression(
            final int index,
            final org.opennms.netmgt.config.threshd.Expression vExpression)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._expressionList.size()) {
            throw new IndexOutOfBoundsException("setExpression: Index value '" + index + "' not in range [0.." + (this._expressionList.size() - 1) + "]");
        }
        
        this._expressionList.set(index, vExpression);
    }

    /**
     * 
     * 
     * @param vExpressionArray
     */
    public void setExpression(
            final org.opennms.netmgt.config.threshd.Expression[] vExpressionArray) {
        //-- copy array
        _expressionList.clear();
        
        for (int i = 0; i < vExpressionArray.length; i++) {
                this._expressionList.add(vExpressionArray[i]);
        }
    }

    /**
     * Sets the value of '_expressionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vExpressionList the Vector to copy.
     */
    public void setExpression(
            final java.util.List<org.opennms.netmgt.config.threshd.Expression> vExpressionList) {
        // copy vector
        this._expressionList.clear();
        
        this._expressionList.addAll(vExpressionList);
    }

    /**
     * Sets the value of '_expressionList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param expressionList the Vector to set.
     */
    public void setExpressionCollection(
            final java.util.List<org.opennms.netmgt.config.threshd.Expression> expressionList) {
        this._expressionList = expressionList;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Group name
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'rrdRepository'. The field
     * 'rrdRepository' has the following description: Full path to
     * the RRD repository where the data is stored
     *  
     * 
     * @param rrdRepository the value of field 'rrdRepository'.
     */
    public void setRrdRepository(
            final java.lang.String rrdRepository) {
        this._rrdRepository = rrdRepository;
    }

    /**
     * 
     * 
     * @param index
     * @param vThreshold
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setThreshold(
            final int index,
            final org.opennms.netmgt.config.threshd.Threshold vThreshold)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._thresholdList.size()) {
            throw new IndexOutOfBoundsException("setThreshold: Index value '" + index + "' not in range [0.." + (this._thresholdList.size() - 1) + "]");
        }
        
        this._thresholdList.set(index, vThreshold);
    }

    /**
     * 
     * 
     * @param vThresholdArray
     */
    public void setThreshold(
            final org.opennms.netmgt.config.threshd.Threshold[] vThresholdArray) {
        //-- copy array
        _thresholdList.clear();
        
        for (int i = 0; i < vThresholdArray.length; i++) {
                this._thresholdList.add(vThresholdArray[i]);
        }
    }

    /**
     * Sets the value of '_thresholdList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vThresholdList the Vector to copy.
     */
    public void setThreshold(
            final java.util.List<org.opennms.netmgt.config.threshd.Threshold> vThresholdList) {
        // copy vector
        this._thresholdList.clear();
        
        this._thresholdList.addAll(vThresholdList);
    }

    /**
     * Sets the value of '_thresholdList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param thresholdList the Vector to set.
     */
    public void setThresholdCollection(
            final java.util.List<org.opennms.netmgt.config.threshd.Threshold> thresholdList) {
        this._thresholdList = thresholdList;
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
     * org.opennms.netmgt.config.threshd.Group
     */
    public static org.opennms.netmgt.config.threshd.Group unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.threshd.Group) Unmarshaller.unmarshal(org.opennms.netmgt.config.threshd.Group.class, reader);
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

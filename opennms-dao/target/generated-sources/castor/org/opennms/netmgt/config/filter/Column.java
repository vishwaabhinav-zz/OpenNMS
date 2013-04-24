/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.filter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Column.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Column implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _sqlType.
     */
    private java.lang.String _sqlType;

    /**
     * Field _javaType.
     */
    private java.lang.String _javaType;

    /**
     * Field _visible.
     */
    private java.lang.String _visible = "true";

    /**
     * Field _aliasList.
     */
    private java.util.List<org.opennms.netmgt.config.filter.Alias> _aliasList;

    /**
     * Field _constraintList.
     */
    private java.util.List<org.opennms.netmgt.config.filter.Constraint> _constraintList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Column() {
        super();
        setVisible("true");
        this._aliasList = new java.util.ArrayList<org.opennms.netmgt.config.filter.Alias>();
        this._constraintList = new java.util.ArrayList<org.opennms.netmgt.config.filter.Constraint>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAlias
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlias(
            final org.opennms.netmgt.config.filter.Alias vAlias)
    throws java.lang.IndexOutOfBoundsException {
        this._aliasList.add(vAlias);
    }

    /**
     * 
     * 
     * @param index
     * @param vAlias
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAlias(
            final int index,
            final org.opennms.netmgt.config.filter.Alias vAlias)
    throws java.lang.IndexOutOfBoundsException {
        this._aliasList.add(index, vAlias);
    }

    /**
     * 
     * 
     * @param vConstraint
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConstraint(
            final org.opennms.netmgt.config.filter.Constraint vConstraint)
    throws java.lang.IndexOutOfBoundsException {
        this._constraintList.add(vConstraint);
    }

    /**
     * 
     * 
     * @param index
     * @param vConstraint
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConstraint(
            final int index,
            final org.opennms.netmgt.config.filter.Constraint vConstraint)
    throws java.lang.IndexOutOfBoundsException {
        this._constraintList.add(index, vConstraint);
    }

    /**
     * Method enumerateAlias.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.filter.Alias> enumerateAlias(
    ) {
        return java.util.Collections.enumeration(this._aliasList);
    }

    /**
     * Method enumerateConstraint.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.filter.Constraint> enumerateConstraint(
    ) {
        return java.util.Collections.enumeration(this._constraintList);
    }

    /**
     * Method getAlias.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.filter.Alias at the given index
     */
    public org.opennms.netmgt.config.filter.Alias getAlias(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._aliasList.size()) {
            throw new IndexOutOfBoundsException("getAlias: Index value '" + index + "' not in range [0.." + (this._aliasList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.filter.Alias) _aliasList.get(index);
    }

    /**
     * Method getAlias.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.filter.Alias[] getAlias(
    ) {
        org.opennms.netmgt.config.filter.Alias[] array = new org.opennms.netmgt.config.filter.Alias[0];
        return (org.opennms.netmgt.config.filter.Alias[]) this._aliasList.toArray(array);
    }

    /**
     * Method getAliasCollection.Returns a reference to
     * '_aliasList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.filter.Alias> getAliasCollection(
    ) {
        return this._aliasList;
    }

    /**
     * Method getAliasCount.
     * 
     * @return the size of this collection
     */
    public int getAliasCount(
    ) {
        return this._aliasList.size();
    }

    /**
     * Method getConstraint.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.filter.Constraint at the given inde
     */
    public org.opennms.netmgt.config.filter.Constraint getConstraint(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._constraintList.size()) {
            throw new IndexOutOfBoundsException("getConstraint: Index value '" + index + "' not in range [0.." + (this._constraintList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.filter.Constraint) _constraintList.get(index);
    }

    /**
     * Method getConstraint.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.filter.Constraint[] getConstraint(
    ) {
        org.opennms.netmgt.config.filter.Constraint[] array = new org.opennms.netmgt.config.filter.Constraint[0];
        return (org.opennms.netmgt.config.filter.Constraint[]) this._constraintList.toArray(array);
    }

    /**
     * Method getConstraintCollection.Returns a reference to
     * '_constraintList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.filter.Constraint> getConstraintCollection(
    ) {
        return this._constraintList;
    }

    /**
     * Method getConstraintCount.
     * 
     * @return the size of this collection
     */
    public int getConstraintCount(
    ) {
        return this._constraintList.size();
    }

    /**
     * Returns the value of field 'javaType'.
     * 
     * @return the value of field 'JavaType'.
     */
    public java.lang.String getJavaType(
    ) {
        return this._javaType;
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
     * Returns the value of field 'sqlType'.
     * 
     * @return the value of field 'SqlType'.
     */
    public java.lang.String getSqlType(
    ) {
        return this._sqlType;
    }

    /**
     * Returns the value of field 'visible'.
     * 
     * @return the value of field 'Visible'.
     */
    public java.lang.String getVisible(
    ) {
        return this._visible;
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
     * Method iterateAlias.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.filter.Alias> iterateAlias(
    ) {
        return this._aliasList.iterator();
    }

    /**
     * Method iterateConstraint.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.filter.Constraint> iterateConstraint(
    ) {
        return this._constraintList.iterator();
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
     * Method removeAlias.
     * 
     * @param vAlias
     * @return true if the object was removed from the collection.
     */
    public boolean removeAlias(
            final org.opennms.netmgt.config.filter.Alias vAlias) {
        boolean removed = _aliasList.remove(vAlias);
        return removed;
    }

    /**
     * Method removeAliasAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.filter.Alias removeAliasAt(
            final int index) {
        java.lang.Object obj = this._aliasList.remove(index);
        return (org.opennms.netmgt.config.filter.Alias) obj;
    }

    /**
     */
    public void removeAllAlias(
    ) {
        this._aliasList.clear();
    }

    /**
     */
    public void removeAllConstraint(
    ) {
        this._constraintList.clear();
    }

    /**
     * Method removeConstraint.
     * 
     * @param vConstraint
     * @return true if the object was removed from the collection.
     */
    public boolean removeConstraint(
            final org.opennms.netmgt.config.filter.Constraint vConstraint) {
        boolean removed = _constraintList.remove(vConstraint);
        return removed;
    }

    /**
     * Method removeConstraintAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.filter.Constraint removeConstraintAt(
            final int index) {
        java.lang.Object obj = this._constraintList.remove(index);
        return (org.opennms.netmgt.config.filter.Constraint) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAlias
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAlias(
            final int index,
            final org.opennms.netmgt.config.filter.Alias vAlias)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._aliasList.size()) {
            throw new IndexOutOfBoundsException("setAlias: Index value '" + index + "' not in range [0.." + (this._aliasList.size() - 1) + "]");
        }
        
        this._aliasList.set(index, vAlias);
    }

    /**
     * 
     * 
     * @param vAliasArray
     */
    public void setAlias(
            final org.opennms.netmgt.config.filter.Alias[] vAliasArray) {
        //-- copy array
        _aliasList.clear();
        
        for (int i = 0; i < vAliasArray.length; i++) {
                this._aliasList.add(vAliasArray[i]);
        }
    }

    /**
     * Sets the value of '_aliasList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vAliasList the Vector to copy.
     */
    public void setAlias(
            final java.util.List<org.opennms.netmgt.config.filter.Alias> vAliasList) {
        // copy vector
        this._aliasList.clear();
        
        this._aliasList.addAll(vAliasList);
    }

    /**
     * Sets the value of '_aliasList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param aliasList the Vector to set.
     */
    public void setAliasCollection(
            final java.util.List<org.opennms.netmgt.config.filter.Alias> aliasList) {
        this._aliasList = aliasList;
    }

    /**
     * 
     * 
     * @param index
     * @param vConstraint
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setConstraint(
            final int index,
            final org.opennms.netmgt.config.filter.Constraint vConstraint)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._constraintList.size()) {
            throw new IndexOutOfBoundsException("setConstraint: Index value '" + index + "' not in range [0.." + (this._constraintList.size() - 1) + "]");
        }
        
        this._constraintList.set(index, vConstraint);
    }

    /**
     * 
     * 
     * @param vConstraintArray
     */
    public void setConstraint(
            final org.opennms.netmgt.config.filter.Constraint[] vConstraintArray) {
        //-- copy array
        _constraintList.clear();
        
        for (int i = 0; i < vConstraintArray.length; i++) {
                this._constraintList.add(vConstraintArray[i]);
        }
    }

    /**
     * Sets the value of '_constraintList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vConstraintList the Vector to copy.
     */
    public void setConstraint(
            final java.util.List<org.opennms.netmgt.config.filter.Constraint> vConstraintList) {
        // copy vector
        this._constraintList.clear();
        
        this._constraintList.addAll(vConstraintList);
    }

    /**
     * Sets the value of '_constraintList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param constraintList the Vector to set.
     */
    public void setConstraintCollection(
            final java.util.List<org.opennms.netmgt.config.filter.Constraint> constraintList) {
        this._constraintList = constraintList;
    }

    /**
     * Sets the value of field 'javaType'.
     * 
     * @param javaType the value of field 'javaType'.
     */
    public void setJavaType(
            final java.lang.String javaType) {
        this._javaType = javaType;
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
     * Sets the value of field 'sqlType'.
     * 
     * @param sqlType the value of field 'sqlType'.
     */
    public void setSqlType(
            final java.lang.String sqlType) {
        this._sqlType = sqlType;
    }

    /**
     * Sets the value of field 'visible'.
     * 
     * @param visible the value of field 'visible'.
     */
    public void setVisible(
            final java.lang.String visible) {
        this._visible = visible;
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
     * org.opennms.netmgt.config.filter.Column
     */
    public static org.opennms.netmgt.config.filter.Column unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.filter.Column) Unmarshaller.unmarshal(org.opennms.netmgt.config.filter.Column.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.opennmsDataSources;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the opennms-database.xml configuration
 *  file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class JdbcDataSource implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _databaseName.
     */
    private java.lang.String _databaseName = "opennms";

    /**
     * Field _schemaName.
     */
    private java.lang.String _schemaName;

    /**
     * Field _url.
     */
    private java.lang.String _url;

    /**
     * Field _className.
     */
    private java.lang.String _className;

    /**
     * Field _userName.
     */
    private java.lang.String _userName;

    /**
     * Field _password.
     */
    private java.lang.String _password;

    /**
     * Field _paramList.
     */
    private java.util.List<org.opennms.netmgt.config.opennmsDataSources.Param> _paramList;


      //----------------/
     //- Constructors -/
    //----------------/

    public JdbcDataSource() {
        super();
        setDatabaseName("opennms");
        this._paramList = new java.util.ArrayList<org.opennms.netmgt.config.opennmsDataSources.Param>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParam
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParam(
            final org.opennms.netmgt.config.opennmsDataSources.Param vParam)
    throws java.lang.IndexOutOfBoundsException {
        this._paramList.add(vParam);
    }

    /**
     * 
     * 
     * @param index
     * @param vParam
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParam(
            final int index,
            final org.opennms.netmgt.config.opennmsDataSources.Param vParam)
    throws java.lang.IndexOutOfBoundsException {
        this._paramList.add(index, vParam);
    }

    /**
     * Method enumerateParam.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.opennmsDataSources.Param> enumerateParam(
    ) {
        return java.util.Collections.enumeration(this._paramList);
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
        
        if (obj instanceof JdbcDataSource) {
        
            JdbcDataSource temp = (JdbcDataSource)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._databaseName != null) {
                if (temp._databaseName == null) return false;
                else if (!(this._databaseName.equals(temp._databaseName))) 
                    return false;
            }
            else if (temp._databaseName != null)
                return false;
            if (this._schemaName != null) {
                if (temp._schemaName == null) return false;
                else if (!(this._schemaName.equals(temp._schemaName))) 
                    return false;
            }
            else if (temp._schemaName != null)
                return false;
            if (this._url != null) {
                if (temp._url == null) return false;
                else if (!(this._url.equals(temp._url))) 
                    return false;
            }
            else if (temp._url != null)
                return false;
            if (this._className != null) {
                if (temp._className == null) return false;
                else if (!(this._className.equals(temp._className))) 
                    return false;
            }
            else if (temp._className != null)
                return false;
            if (this._userName != null) {
                if (temp._userName == null) return false;
                else if (!(this._userName.equals(temp._userName))) 
                    return false;
            }
            else if (temp._userName != null)
                return false;
            if (this._password != null) {
                if (temp._password == null) return false;
                else if (!(this._password.equals(temp._password))) 
                    return false;
            }
            else if (temp._password != null)
                return false;
            if (this._paramList != null) {
                if (temp._paramList == null) return false;
                else if (!(this._paramList.equals(temp._paramList))) 
                    return false;
            }
            else if (temp._paramList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'className'.
     * 
     * @return the value of field 'ClassName'.
     */
    public java.lang.String getClassName(
    ) {
        return this._className;
    }

    /**
     * Returns the value of field 'databaseName'.
     * 
     * @return the value of field 'DatabaseName'.
     */
    public java.lang.String getDatabaseName(
    ) {
        return this._databaseName;
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
     * Method getParam.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.opennmsDataSources.Param at the
     * given index
     */
    public org.opennms.netmgt.config.opennmsDataSources.Param getParam(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._paramList.size()) {
            throw new IndexOutOfBoundsException("getParam: Index value '" + index + "' not in range [0.." + (this._paramList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.opennmsDataSources.Param) _paramList.get(index);
    }

    /**
     * Method getParam.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.opennmsDataSources.Param[] getParam(
    ) {
        org.opennms.netmgt.config.opennmsDataSources.Param[] array = new org.opennms.netmgt.config.opennmsDataSources.Param[0];
        return (org.opennms.netmgt.config.opennmsDataSources.Param[]) this._paramList.toArray(array);
    }

    /**
     * Method getParamCollection.Returns a reference to
     * '_paramList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.opennmsDataSources.Param> getParamCollection(
    ) {
        return this._paramList;
    }

    /**
     * Method getParamCount.
     * 
     * @return the size of this collection
     */
    public int getParamCount(
    ) {
        return this._paramList.size();
    }

    /**
     * Returns the value of field 'password'.
     * 
     * @return the value of field 'Password'.
     */
    public java.lang.String getPassword(
    ) {
        return this._password;
    }

    /**
     * Returns the value of field 'schemaName'.
     * 
     * @return the value of field 'SchemaName'.
     */
    public java.lang.String getSchemaName(
    ) {
        return this._schemaName;
    }

    /**
     * Returns the value of field 'url'.
     * 
     * @return the value of field 'Url'.
     */
    public java.lang.String getUrl(
    ) {
        return this._url;
    }

    /**
     * Returns the value of field 'userName'.
     * 
     * @return the value of field 'UserName'.
     */
    public java.lang.String getUserName(
    ) {
        return this._userName;
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
        if (_databaseName != null) {
           result = 37 * result + _databaseName.hashCode();
        }
        if (_schemaName != null) {
           result = 37 * result + _schemaName.hashCode();
        }
        if (_url != null) {
           result = 37 * result + _url.hashCode();
        }
        if (_className != null) {
           result = 37 * result + _className.hashCode();
        }
        if (_userName != null) {
           result = 37 * result + _userName.hashCode();
        }
        if (_password != null) {
           result = 37 * result + _password.hashCode();
        }
        if (_paramList != null) {
           result = 37 * result + _paramList.hashCode();
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
     * Method iterateParam.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.opennmsDataSources.Param> iterateParam(
    ) {
        return this._paramList.iterator();
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
    public void removeAllParam(
    ) {
        this._paramList.clear();
    }

    /**
     * Method removeParam.
     * 
     * @param vParam
     * @return true if the object was removed from the collection.
     */
    public boolean removeParam(
            final org.opennms.netmgt.config.opennmsDataSources.Param vParam) {
        boolean removed = _paramList.remove(vParam);
        return removed;
    }

    /**
     * Method removeParamAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.opennmsDataSources.Param removeParamAt(
            final int index) {
        java.lang.Object obj = this._paramList.remove(index);
        return (org.opennms.netmgt.config.opennmsDataSources.Param) obj;
    }

    /**
     * Sets the value of field 'className'.
     * 
     * @param className the value of field 'className'.
     */
    public void setClassName(
            final java.lang.String className) {
        this._className = className;
    }

    /**
     * Sets the value of field 'databaseName'.
     * 
     * @param databaseName the value of field 'databaseName'.
     */
    public void setDatabaseName(
            final java.lang.String databaseName) {
        this._databaseName = databaseName;
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
     * @param vParam
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParam(
            final int index,
            final org.opennms.netmgt.config.opennmsDataSources.Param vParam)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._paramList.size()) {
            throw new IndexOutOfBoundsException("setParam: Index value '" + index + "' not in range [0.." + (this._paramList.size() - 1) + "]");
        }
        
        this._paramList.set(index, vParam);
    }

    /**
     * 
     * 
     * @param vParamArray
     */
    public void setParam(
            final org.opennms.netmgt.config.opennmsDataSources.Param[] vParamArray) {
        //-- copy array
        _paramList.clear();
        
        for (int i = 0; i < vParamArray.length; i++) {
                this._paramList.add(vParamArray[i]);
        }
    }

    /**
     * Sets the value of '_paramList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vParamList the Vector to copy.
     */
    public void setParam(
            final java.util.List<org.opennms.netmgt.config.opennmsDataSources.Param> vParamList) {
        // copy vector
        this._paramList.clear();
        
        this._paramList.addAll(vParamList);
    }

    /**
     * Sets the value of '_paramList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param paramList the Vector to set.
     */
    public void setParamCollection(
            final java.util.List<org.opennms.netmgt.config.opennmsDataSources.Param> paramList) {
        this._paramList = paramList;
    }

    /**
     * Sets the value of field 'password'.
     * 
     * @param password the value of field 'password'.
     */
    public void setPassword(
            final java.lang.String password) {
        this._password = password;
    }

    /**
     * Sets the value of field 'schemaName'.
     * 
     * @param schemaName the value of field 'schemaName'.
     */
    public void setSchemaName(
            final java.lang.String schemaName) {
        this._schemaName = schemaName;
    }

    /**
     * Sets the value of field 'url'.
     * 
     * @param url the value of field 'url'.
     */
    public void setUrl(
            final java.lang.String url) {
        this._url = url;
    }

    /**
     * Sets the value of field 'userName'.
     * 
     * @param userName the value of field 'userName'.
     */
    public void setUserName(
            final java.lang.String userName) {
        this._userName = userName;
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
     * org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource
     */
    public static org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource) Unmarshaller.unmarshal(org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource.class, reader);
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

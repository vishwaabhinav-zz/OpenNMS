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
 * Top Level element for opennms-datasources.xml... a list of data
 * sources
 *  to be used within OpenNMS.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class DataSourceConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Database connection pool configuration.
     */
    private org.opennms.netmgt.config.opennmsDataSources.ConnectionPool _connectionPool;

    /**
     * Top-level element for the opennms-database.xml configuration
     *  file.
     */
    private java.util.List<org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource> _jdbcDataSourceList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataSourceConfiguration() {
        super();
        this._jdbcDataSourceList = new java.util.ArrayList<org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vJdbcDataSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJdbcDataSource(
            final org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource vJdbcDataSource)
    throws java.lang.IndexOutOfBoundsException {
        this._jdbcDataSourceList.add(vJdbcDataSource);
    }

    /**
     * 
     * 
     * @param index
     * @param vJdbcDataSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJdbcDataSource(
            final int index,
            final org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource vJdbcDataSource)
    throws java.lang.IndexOutOfBoundsException {
        this._jdbcDataSourceList.add(index, vJdbcDataSource);
    }

    /**
     * Method enumerateJdbcDataSource.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource> enumerateJdbcDataSource(
    ) {
        return java.util.Collections.enumeration(this._jdbcDataSourceList);
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
        
        if (obj instanceof DataSourceConfiguration) {
        
            DataSourceConfiguration temp = (DataSourceConfiguration)obj;
            if (this._connectionPool != null) {
                if (temp._connectionPool == null) return false;
                else if (!(this._connectionPool.equals(temp._connectionPool))) 
                    return false;
            }
            else if (temp._connectionPool != null)
                return false;
            if (this._jdbcDataSourceList != null) {
                if (temp._jdbcDataSourceList == null) return false;
                else if (!(this._jdbcDataSourceList.equals(temp._jdbcDataSourceList))) 
                    return false;
            }
            else if (temp._jdbcDataSourceList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'connectionPool'. The field
     * 'connectionPool' has the following description: Database
     * connection pool configuration.
     * 
     * @return the value of field 'ConnectionPool'.
     */
    public org.opennms.netmgt.config.opennmsDataSources.ConnectionPool getConnectionPool(
    ) {
        return this._connectionPool;
    }

    /**
     * Method getJdbcDataSource.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource
     * at the given index
     */
    public org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource getJdbcDataSource(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._jdbcDataSourceList.size()) {
            throw new IndexOutOfBoundsException("getJdbcDataSource: Index value '" + index + "' not in range [0.." + (this._jdbcDataSourceList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource) _jdbcDataSourceList.get(index);
    }

    /**
     * Method getJdbcDataSource.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource[] getJdbcDataSource(
    ) {
        org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource[] array = new org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource[0];
        return (org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource[]) this._jdbcDataSourceList.toArray(array);
    }

    /**
     * Method getJdbcDataSourceCollection.Returns a reference to
     * '_jdbcDataSourceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource> getJdbcDataSourceCollection(
    ) {
        return this._jdbcDataSourceList;
    }

    /**
     * Method getJdbcDataSourceCount.
     * 
     * @return the size of this collection
     */
    public int getJdbcDataSourceCount(
    ) {
        return this._jdbcDataSourceList.size();
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
        if (_connectionPool != null) {
           result = 37 * result + _connectionPool.hashCode();
        }
        if (_jdbcDataSourceList != null) {
           result = 37 * result + _jdbcDataSourceList.hashCode();
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
     * Method iterateJdbcDataSource.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource> iterateJdbcDataSource(
    ) {
        return this._jdbcDataSourceList.iterator();
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
    public void removeAllJdbcDataSource(
    ) {
        this._jdbcDataSourceList.clear();
    }

    /**
     * Method removeJdbcDataSource.
     * 
     * @param vJdbcDataSource
     * @return true if the object was removed from the collection.
     */
    public boolean removeJdbcDataSource(
            final org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource vJdbcDataSource) {
        boolean removed = _jdbcDataSourceList.remove(vJdbcDataSource);
        return removed;
    }

    /**
     * Method removeJdbcDataSourceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource removeJdbcDataSourceAt(
            final int index) {
        java.lang.Object obj = this._jdbcDataSourceList.remove(index);
        return (org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource) obj;
    }

    /**
     * Sets the value of field 'connectionPool'. The field
     * 'connectionPool' has the following description: Database
     * connection pool configuration.
     * 
     * @param connectionPool the value of field 'connectionPool'.
     */
    public void setConnectionPool(
            final org.opennms.netmgt.config.opennmsDataSources.ConnectionPool connectionPool) {
        this._connectionPool = connectionPool;
    }

    /**
     * 
     * 
     * @param index
     * @param vJdbcDataSource
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setJdbcDataSource(
            final int index,
            final org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource vJdbcDataSource)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._jdbcDataSourceList.size()) {
            throw new IndexOutOfBoundsException("setJdbcDataSource: Index value '" + index + "' not in range [0.." + (this._jdbcDataSourceList.size() - 1) + "]");
        }
        
        this._jdbcDataSourceList.set(index, vJdbcDataSource);
    }

    /**
     * 
     * 
     * @param vJdbcDataSourceArray
     */
    public void setJdbcDataSource(
            final org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource[] vJdbcDataSourceArray) {
        //-- copy array
        _jdbcDataSourceList.clear();
        
        for (int i = 0; i < vJdbcDataSourceArray.length; i++) {
                this._jdbcDataSourceList.add(vJdbcDataSourceArray[i]);
        }
    }

    /**
     * Sets the value of '_jdbcDataSourceList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vJdbcDataSourceList the Vector to copy.
     */
    public void setJdbcDataSource(
            final java.util.List<org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource> vJdbcDataSourceList) {
        // copy vector
        this._jdbcDataSourceList.clear();
        
        this._jdbcDataSourceList.addAll(vJdbcDataSourceList);
    }

    /**
     * Sets the value of '_jdbcDataSourceList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param jdbcDataSourceList the Vector to set.
     */
    public void setJdbcDataSourceCollection(
            final java.util.List<org.opennms.netmgt.config.opennmsDataSources.JdbcDataSource> jdbcDataSourceList) {
        this._jdbcDataSourceList = jdbcDataSourceList;
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
     * org.opennms.netmgt.config.opennmsDataSources.DataSourceConfiguration
     */
    public static org.opennms.netmgt.config.opennmsDataSources.DataSourceConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.opennmsDataSources.DataSourceConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.opennmsDataSources.DataSourceConfiguration.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.charts;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class JdbcDataSet.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class JdbcDataSet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dbName.
     */
    private java.lang.String _dbName;

    /**
     * Field _sql.
     */
    private java.lang.String _sql;


      //----------------/
     //- Constructors -/
    //----------------/

    public JdbcDataSet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
        
        if (obj instanceof JdbcDataSet) {
        
            JdbcDataSet temp = (JdbcDataSet)obj;
            if (this._dbName != null) {
                if (temp._dbName == null) return false;
                else if (!(this._dbName.equals(temp._dbName))) 
                    return false;
            }
            else if (temp._dbName != null)
                return false;
            if (this._sql != null) {
                if (temp._sql == null) return false;
                else if (!(this._sql.equals(temp._sql))) 
                    return false;
            }
            else if (temp._sql != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'dbName'.
     * 
     * @return the value of field 'DbName'.
     */
    public java.lang.String getDbName(
    ) {
        return this._dbName;
    }

    /**
     * Returns the value of field 'sql'.
     * 
     * @return the value of field 'Sql'.
     */
    public java.lang.String getSql(
    ) {
        return this._sql;
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
        if (_dbName != null) {
           result = 37 * result + _dbName.hashCode();
        }
        if (_sql != null) {
           result = 37 * result + _sql.hashCode();
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
     * Sets the value of field 'dbName'.
     * 
     * @param dbName the value of field 'dbName'.
     */
    public void setDbName(
            final java.lang.String dbName) {
        this._dbName = dbName;
    }

    /**
     * Sets the value of field 'sql'.
     * 
     * @param sql the value of field 'sql'.
     */
    public void setSql(
            final java.lang.String sql) {
        this._sql = sql;
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
     * org.opennms.netmgt.config.charts.JdbcDataSet
     */
    public static org.opennms.netmgt.config.charts.JdbcDataSet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.JdbcDataSet) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.JdbcDataSet.class, reader);
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

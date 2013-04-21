/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.vacuumd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A query to the database with a resultset used for
 *  actions
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Trigger implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _dataSource.
     */
    private java.lang.String _dataSource = "opennms";

    /**
     * only run the action if the row count evalutes with
     *  the operator (defaults to > 0)
     */
    private java.lang.String _operator;

    /**
     * Field _rowCount.
     */
    private int _rowCount;

    /**
     * keeps track of state for field: _rowCount
     */
    private boolean _has_rowCount;

    /**
     * Just a generic string used for SQL
     *  statements
     */
    private org.opennms.netmgt.config.vacuumd.Statement _statement;


      //----------------/
     //- Constructors -/
    //----------------/

    public Trigger() {
        super();
        setDataSource("opennms");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteRowCount(
    ) {
        this._has_rowCount= false;
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
        
        if (obj instanceof Trigger) {
        
            Trigger temp = (Trigger)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._dataSource != null) {
                if (temp._dataSource == null) return false;
                else if (!(this._dataSource.equals(temp._dataSource))) 
                    return false;
            }
            else if (temp._dataSource != null)
                return false;
            if (this._operator != null) {
                if (temp._operator == null) return false;
                else if (!(this._operator.equals(temp._operator))) 
                    return false;
            }
            else if (temp._operator != null)
                return false;
            if (this._rowCount != temp._rowCount)
                return false;
            if (this._has_rowCount != temp._has_rowCount)
                return false;
            if (this._statement != null) {
                if (temp._statement == null) return false;
                else if (!(this._statement.equals(temp._statement))) 
                    return false;
            }
            else if (temp._statement != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'dataSource'.
     * 
     * @return the value of field 'DataSource'.
     */
    public java.lang.String getDataSource(
    ) {
        return this._dataSource;
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
     * Returns the value of field 'operator'. The field 'operator'
     * has the following description: only run the action if the
     * row count evalutes with
     *  the operator (defaults to > 0)
     * 
     * @return the value of field 'Operator'.
     */
    public java.lang.String getOperator(
    ) {
        return this._operator;
    }

    /**
     * Returns the value of field 'rowCount'.
     * 
     * @return the value of field 'RowCount'.
     */
    public int getRowCount(
    ) {
        return this._rowCount;
    }

    /**
     * Returns the value of field 'statement'. The field
     * 'statement' has the following description: Just a generic
     * string used for SQL
     *  statements
     * 
     * @return the value of field 'Statement'.
     */
    public org.opennms.netmgt.config.vacuumd.Statement getStatement(
    ) {
        return this._statement;
    }

    /**
     * Method hasRowCount.
     * 
     * @return true if at least one RowCount has been added
     */
    public boolean hasRowCount(
    ) {
        return this._has_rowCount;
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
        if (_dataSource != null) {
           result = 37 * result + _dataSource.hashCode();
        }
        if (_operator != null) {
           result = 37 * result + _operator.hashCode();
        }
        result = 37 * result + _rowCount;
        if (_statement != null) {
           result = 37 * result + _statement.hashCode();
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
     * Sets the value of field 'dataSource'.
     * 
     * @param dataSource the value of field 'dataSource'.
     */
    public void setDataSource(
            final java.lang.String dataSource) {
        this._dataSource = dataSource;
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
     * Sets the value of field 'operator'. The field 'operator' has
     * the following description: only run the action if the row
     * count evalutes with
     *  the operator (defaults to > 0)
     * 
     * @param operator the value of field 'operator'.
     */
    public void setOperator(
            final java.lang.String operator) {
        this._operator = operator;
    }

    /**
     * Sets the value of field 'rowCount'.
     * 
     * @param rowCount the value of field 'rowCount'.
     */
    public void setRowCount(
            final int rowCount) {
        this._rowCount = rowCount;
        this._has_rowCount = true;
    }

    /**
     * Sets the value of field 'statement'. The field 'statement'
     * has the following description: Just a generic string used
     * for SQL
     *  statements
     * 
     * @param statement the value of field 'statement'.
     */
    public void setStatement(
            final org.opennms.netmgt.config.vacuumd.Statement statement) {
        this._statement = statement;
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
     * org.opennms.netmgt.config.vacuumd.Trigger
     */
    public static org.opennms.netmgt.config.vacuumd.Trigger unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vacuumd.Trigger) Unmarshaller.unmarshal(org.opennms.netmgt.config.vacuumd.Trigger.class, reader);
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

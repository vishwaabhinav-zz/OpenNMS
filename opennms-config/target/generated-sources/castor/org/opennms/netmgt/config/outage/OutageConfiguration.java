/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.outage;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the outage-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class OutageConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Maximum number of threads reading the events and
     *  updating the database.
     */
    private int _writers;

    /**
     * keeps track of state for field: _writers
     */
    private boolean _has_writers;

    /**
     * SQL query to get next value of the 'outageNxtId'
     *  database sequence to make the access database
     *  independant.
     */
    private java.lang.String _getNextOutageID;

    /**
     * Flag which indicates if a delete service event should
     *  propagate to a delete interface or delete node event, if
     *  approciate.
     */
    private java.lang.String _deletePropagation = "true";


      //----------------/
     //- Constructors -/
    //----------------/

    public OutageConfiguration() {
        super();
        setDeletePropagation("true");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteWriters(
    ) {
        this._has_writers= false;
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
        
        if (obj instanceof OutageConfiguration) {
        
            OutageConfiguration temp = (OutageConfiguration)obj;
            if (this._writers != temp._writers)
                return false;
            if (this._has_writers != temp._has_writers)
                return false;
            if (this._getNextOutageID != null) {
                if (temp._getNextOutageID == null) return false;
                else if (!(this._getNextOutageID.equals(temp._getNextOutageID))) 
                    return false;
            }
            else if (temp._getNextOutageID != null)
                return false;
            if (this._deletePropagation != null) {
                if (temp._deletePropagation == null) return false;
                else if (!(this._deletePropagation.equals(temp._deletePropagation))) 
                    return false;
            }
            else if (temp._deletePropagation != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'deletePropagation'. The field
     * 'deletePropagation' has the following description: Flag
     * which indicates if a delete service event should
     *  propagate to a delete interface or delete node event, if
     *  approciate.
     * 
     * @return the value of field 'DeletePropagation'.
     */
    public java.lang.String getDeletePropagation(
    ) {
        return this._deletePropagation;
    }

    /**
     * Returns the value of field 'getNextOutageID'. The field
     * 'getNextOutageID' has the following description: SQL query
     * to get next value of the 'outageNxtId'
     *  database sequence to make the access database
     *  independant.
     * 
     * @return the value of field 'GetNextOutageID'.
     */
    public java.lang.String getGetNextOutageID(
    ) {
        return this._getNextOutageID;
    }

    /**
     * Returns the value of field 'writers'. The field 'writers'
     * has the following description: Maximum number of threads
     * reading the events and
     *  updating the database.
     * 
     * @return the value of field 'Writers'.
     */
    public int getWriters(
    ) {
        return this._writers;
    }

    /**
     * Method hasWriters.
     * 
     * @return true if at least one Writers has been added
     */
    public boolean hasWriters(
    ) {
        return this._has_writers;
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
        result = 37 * result + _writers;
        if (_getNextOutageID != null) {
           result = 37 * result + _getNextOutageID.hashCode();
        }
        if (_deletePropagation != null) {
           result = 37 * result + _deletePropagation.hashCode();
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
     * Sets the value of field 'deletePropagation'. The field
     * 'deletePropagation' has the following description: Flag
     * which indicates if a delete service event should
     *  propagate to a delete interface or delete node event, if
     *  approciate.
     * 
     * @param deletePropagation the value of field
     * 'deletePropagation'.
     */
    public void setDeletePropagation(
            final java.lang.String deletePropagation) {
        this._deletePropagation = deletePropagation;
    }

    /**
     * Sets the value of field 'getNextOutageID'. The field
     * 'getNextOutageID' has the following description: SQL query
     * to get next value of the 'outageNxtId'
     *  database sequence to make the access database
     *  independant.
     * 
     * @param getNextOutageID the value of field 'getNextOutageID'.
     */
    public void setGetNextOutageID(
            final java.lang.String getNextOutageID) {
        this._getNextOutageID = getNextOutageID;
    }

    /**
     * Sets the value of field 'writers'. The field 'writers' has
     * the following description: Maximum number of threads reading
     * the events and
     *  updating the database.
     * 
     * @param writers the value of field 'writers'.
     */
    public void setWriters(
            final int writers) {
        this._writers = writers;
        this._has_writers = true;
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
     * org.opennms.netmgt.config.outage.OutageConfiguration
     */
    public static org.opennms.netmgt.config.outage.OutageConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.outage.OutageConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.outage.OutageConfiguration.class, reader);
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

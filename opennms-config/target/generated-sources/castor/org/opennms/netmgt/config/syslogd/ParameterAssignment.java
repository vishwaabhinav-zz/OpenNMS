/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.syslogd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * For regex matches, assign the value of a matching group
 *  to a named event parameter
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ParameterAssignment implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The number of the matching group from the regex
     *  whose value will be assigned. Group 0 always refers
     *  to the entire string matched by the expression. If
     *  the referenced group does not exist, the empty string
     *  will be assigned.
     *  
     */
    private int _matchingGroup;

    /**
     * keeps track of state for field: _matchingGroup
     */
    private boolean _has_matchingGroup;

    /**
     * The name of the event parameter to which the named
     *  matching group's value will be assigned
     *  
     */
    private java.lang.String _parameterName;


      //----------------/
     //- Constructors -/
    //----------------/

    public ParameterAssignment() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMatchingGroup(
    ) {
        this._has_matchingGroup= false;
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
        
        if (obj instanceof ParameterAssignment) {
        
            ParameterAssignment temp = (ParameterAssignment)obj;
            if (this._matchingGroup != temp._matchingGroup)
                return false;
            if (this._has_matchingGroup != temp._has_matchingGroup)
                return false;
            if (this._parameterName != null) {
                if (temp._parameterName == null) return false;
                else if (!(this._parameterName.equals(temp._parameterName))) 
                    return false;
            }
            else if (temp._parameterName != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'matchingGroup'. The field
     * 'matchingGroup' has the following description: The number of
     * the matching group from the regex
     *  whose value will be assigned. Group 0 always refers
     *  to the entire string matched by the expression. If
     *  the referenced group does not exist, the empty string
     *  will be assigned.
     *  
     * 
     * @return the value of field 'MatchingGroup'.
     */
    public int getMatchingGroup(
    ) {
        return this._matchingGroup;
    }

    /**
     * Returns the value of field 'parameterName'. The field
     * 'parameterName' has the following description: The name of
     * the event parameter to which the named
     *  matching group's value will be assigned
     *  
     * 
     * @return the value of field 'ParameterName'.
     */
    public java.lang.String getParameterName(
    ) {
        return this._parameterName;
    }

    /**
     * Method hasMatchingGroup.
     * 
     * @return true if at least one MatchingGroup has been added
     */
    public boolean hasMatchingGroup(
    ) {
        return this._has_matchingGroup;
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
        result = 37 * result + _matchingGroup;
        if (_parameterName != null) {
           result = 37 * result + _parameterName.hashCode();
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
     * Sets the value of field 'matchingGroup'. The field
     * 'matchingGroup' has the following description: The number of
     * the matching group from the regex
     *  whose value will be assigned. Group 0 always refers
     *  to the entire string matched by the expression. If
     *  the referenced group does not exist, the empty string
     *  will be assigned.
     *  
     * 
     * @param matchingGroup the value of field 'matchingGroup'.
     */
    public void setMatchingGroup(
            final int matchingGroup) {
        this._matchingGroup = matchingGroup;
        this._has_matchingGroup = true;
    }

    /**
     * Sets the value of field 'parameterName'. The field
     * 'parameterName' has the following description: The name of
     * the event parameter to which the named
     *  matching group's value will be assigned
     *  
     * 
     * @param parameterName the value of field 'parameterName'.
     */
    public void setParameterName(
            final java.lang.String parameterName) {
        this._parameterName = parameterName;
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
     * org.opennms.netmgt.config.syslogd.ParameterAssignment
     */
    public static org.opennms.netmgt.config.syslogd.ParameterAssignment unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.ParameterAssignment) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.ParameterAssignment.class, reader);
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

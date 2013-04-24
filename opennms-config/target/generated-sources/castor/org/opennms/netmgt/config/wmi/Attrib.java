/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.wmi;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * An Attribute Object
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Attrib implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _alias.
     */
    private java.lang.String _alias;

    /**
     * Field _wmiObject.
     */
    private java.lang.String _wmiObject;

    /**
     * Field _type.
     */
    private java.lang.String _type;

    /**
     * Field _maxval.
     */
    private java.lang.String _maxval;

    /**
     * Field _minval.
     */
    private java.lang.String _minval;


      //----------------/
     //- Constructors -/
    //----------------/

    public Attrib() {
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
        
        if (obj instanceof Attrib) {
        
            Attrib temp = (Attrib)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._alias != null) {
                if (temp._alias == null) return false;
                else if (!(this._alias.equals(temp._alias))) 
                    return false;
            }
            else if (temp._alias != null)
                return false;
            if (this._wmiObject != null) {
                if (temp._wmiObject == null) return false;
                else if (!(this._wmiObject.equals(temp._wmiObject))) 
                    return false;
            }
            else if (temp._wmiObject != null)
                return false;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type))) 
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._maxval != null) {
                if (temp._maxval == null) return false;
                else if (!(this._maxval.equals(temp._maxval))) 
                    return false;
            }
            else if (temp._maxval != null)
                return false;
            if (this._minval != null) {
                if (temp._minval == null) return false;
                else if (!(this._minval.equals(temp._minval))) 
                    return false;
            }
            else if (temp._minval != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'alias'.
     * 
     * @return the value of field 'Alias'.
     */
    public java.lang.String getAlias(
    ) {
        return this._alias;
    }

    /**
     * Returns the value of field 'maxval'.
     * 
     * @return the value of field 'Maxval'.
     */
    public java.lang.String getMaxval(
    ) {
        return this._maxval;
    }

    /**
     * Returns the value of field 'minval'.
     * 
     * @return the value of field 'Minval'.
     */
    public java.lang.String getMinval(
    ) {
        return this._minval;
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
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Returns the value of field 'wmiObject'.
     * 
     * @return the value of field 'WmiObject'.
     */
    public java.lang.String getWmiObject(
    ) {
        return this._wmiObject;
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
        if (_alias != null) {
           result = 37 * result + _alias.hashCode();
        }
        if (_wmiObject != null) {
           result = 37 * result + _wmiObject.hashCode();
        }
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_maxval != null) {
           result = 37 * result + _maxval.hashCode();
        }
        if (_minval != null) {
           result = 37 * result + _minval.hashCode();
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
     * Sets the value of field 'alias'.
     * 
     * @param alias the value of field 'alias'.
     */
    public void setAlias(
            final java.lang.String alias) {
        this._alias = alias;
    }

    /**
     * Sets the value of field 'maxval'.
     * 
     * @param maxval the value of field 'maxval'.
     */
    public void setMaxval(
            final java.lang.String maxval) {
        this._maxval = maxval;
    }

    /**
     * Sets the value of field 'minval'.
     * 
     * @param minval the value of field 'minval'.
     */
    public void setMinval(
            final java.lang.String minval) {
        this._minval = minval;
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
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * Sets the value of field 'wmiObject'.
     * 
     * @param wmiObject the value of field 'wmiObject'.
     */
    public void setWmiObject(
            final java.lang.String wmiObject) {
        this._wmiObject = wmiObject;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.wmi.Attrib
     */
    public static org.opennms.netmgt.config.wmi.Attrib unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.wmi.Attrib) Unmarshaller.unmarshal(org.opennms.netmgt.config.wmi.Attrib.class, reader);
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

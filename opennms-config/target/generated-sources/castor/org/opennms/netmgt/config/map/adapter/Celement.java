/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.map.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A Rule for adding elements to the map automatically
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Celement implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The icon of the element to add
     *  
     */
    private java.lang.String _icon = "unspecified";

    /**
     * The package used to get elements
     *  
     */
    private java.lang.String _package;


      //----------------/
     //- Constructors -/
    //----------------/

    public Celement() {
        super();
        setIcon("unspecified");
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
        
        if (obj instanceof Celement) {
        
            Celement temp = (Celement)obj;
            if (this._icon != null) {
                if (temp._icon == null) return false;
                else if (!(this._icon.equals(temp._icon))) 
                    return false;
            }
            else if (temp._icon != null)
                return false;
            if (this._package != null) {
                if (temp._package == null) return false;
                else if (!(this._package.equals(temp._package))) 
                    return false;
            }
            else if (temp._package != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'icon'. The field 'icon' has the
     * following description: The icon of the element to add
     *  
     * 
     * @return the value of field 'Icon'.
     */
    public java.lang.String getIcon(
    ) {
        return this._icon;
    }

    /**
     * Returns the value of field 'package'. The field 'package'
     * has the following description: The package used to get
     * elements
     *  
     * 
     * @return the value of field 'Package'.
     */
    public java.lang.String getPackage(
    ) {
        return this._package;
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
        if (_icon != null) {
           result = 37 * result + _icon.hashCode();
        }
        if (_package != null) {
           result = 37 * result + _package.hashCode();
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
     * Sets the value of field 'icon'. The field 'icon' has the
     * following description: The icon of the element to add
     *  
     * 
     * @param icon the value of field 'icon'.
     */
    public void setIcon(
            final java.lang.String icon) {
        this._icon = icon;
    }

    /**
     * Sets the value of field 'package'. The field 'package' has
     * the following description: The package used to get elements
     *  
     * 
     * @param _package
     * @param package the value of field 'package'.
     */
    public void setPackage(
            final java.lang.String _package) {
        this._package = _package;
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
     * org.opennms.netmgt.config.map.adapter.Celement
     */
    public static org.opennms.netmgt.config.map.adapter.Celement unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.map.adapter.Celement) Unmarshaller.unmarshal(org.opennms.netmgt.config.map.adapter.Celement.class, reader);
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

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
 * Class SubTitle.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class SubTitle implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _position.
     */
    private java.lang.String _position;

    /**
     * Field _horizontalAlignment.
     */
    private java.lang.String _horizontalAlignment;

    /**
     * Field _title.
     */
    private org.opennms.netmgt.config.charts.Title _title;


      //----------------/
     //- Constructors -/
    //----------------/

    public SubTitle() {
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
        
        if (obj instanceof SubTitle) {
        
            SubTitle temp = (SubTitle)obj;
            if (this._position != null) {
                if (temp._position == null) return false;
                else if (!(this._position.equals(temp._position))) 
                    return false;
            }
            else if (temp._position != null)
                return false;
            if (this._horizontalAlignment != null) {
                if (temp._horizontalAlignment == null) return false;
                else if (!(this._horizontalAlignment.equals(temp._horizontalAlignment))) 
                    return false;
            }
            else if (temp._horizontalAlignment != null)
                return false;
            if (this._title != null) {
                if (temp._title == null) return false;
                else if (!(this._title.equals(temp._title))) 
                    return false;
            }
            else if (temp._title != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'horizontalAlignment'.
     * 
     * @return the value of field 'HorizontalAlignment'.
     */
    public java.lang.String getHorizontalAlignment(
    ) {
        return this._horizontalAlignment;
    }

    /**
     * Returns the value of field 'position'.
     * 
     * @return the value of field 'Position'.
     */
    public java.lang.String getPosition(
    ) {
        return this._position;
    }

    /**
     * Returns the value of field 'title'.
     * 
     * @return the value of field 'Title'.
     */
    public org.opennms.netmgt.config.charts.Title getTitle(
    ) {
        return this._title;
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
        if (_position != null) {
           result = 37 * result + _position.hashCode();
        }
        if (_horizontalAlignment != null) {
           result = 37 * result + _horizontalAlignment.hashCode();
        }
        if (_title != null) {
           result = 37 * result + _title.hashCode();
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
     * Sets the value of field 'horizontalAlignment'.
     * 
     * @param horizontalAlignment the value of field
     * 'horizontalAlignment'.
     */
    public void setHorizontalAlignment(
            final java.lang.String horizontalAlignment) {
        this._horizontalAlignment = horizontalAlignment;
    }

    /**
     * Sets the value of field 'position'.
     * 
     * @param position the value of field 'position'.
     */
    public void setPosition(
            final java.lang.String position) {
        this._position = position;
    }

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(
            final org.opennms.netmgt.config.charts.Title title) {
        this._title = title;
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
     * org.opennms.netmgt.config.charts.SubTitle
     */
    public static org.opennms.netmgt.config.charts.SubTitle unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.SubTitle) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.SubTitle.class, reader);
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

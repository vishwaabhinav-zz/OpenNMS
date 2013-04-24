/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.views;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Header containing information about this configuration
 *  file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Header implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Revision of this file.
     */
    private java.lang.String _rev;

    /**
     * Creation time in the 'dow mon dd hh:mm:ss zzz yyyy'
     *  format.
     */
    private java.lang.String _created;

    /**
     * Monitoring station? This is seemingly
     *  unused.
     */
    private java.lang.String _mstation;


      //----------------/
     //- Constructors -/
    //----------------/

    public Header() {
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
        
        if (obj instanceof Header) {
        
            Header temp = (Header)obj;
            if (this._rev != null) {
                if (temp._rev == null) return false;
                else if (!(this._rev.equals(temp._rev))) 
                    return false;
            }
            else if (temp._rev != null)
                return false;
            if (this._created != null) {
                if (temp._created == null) return false;
                else if (!(this._created.equals(temp._created))) 
                    return false;
            }
            else if (temp._created != null)
                return false;
            if (this._mstation != null) {
                if (temp._mstation == null) return false;
                else if (!(this._mstation.equals(temp._mstation))) 
                    return false;
            }
            else if (temp._mstation != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'created'. The field 'created'
     * has the following description: Creation time in the 'dow mon
     * dd hh:mm:ss zzz yyyy'
     *  format.
     * 
     * @return the value of field 'Created'.
     */
    public java.lang.String getCreated(
    ) {
        return this._created;
    }

    /**
     * Returns the value of field 'mstation'. The field 'mstation'
     * has the following description: Monitoring station? This is
     * seemingly
     *  unused.
     * 
     * @return the value of field 'Mstation'.
     */
    public java.lang.String getMstation(
    ) {
        return this._mstation;
    }

    /**
     * Returns the value of field 'rev'. The field 'rev' has the
     * following description: Revision of this file.
     * 
     * @return the value of field 'Rev'.
     */
    public java.lang.String getRev(
    ) {
        return this._rev;
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
        if (_rev != null) {
           result = 37 * result + _rev.hashCode();
        }
        if (_created != null) {
           result = 37 * result + _created.hashCode();
        }
        if (_mstation != null) {
           result = 37 * result + _mstation.hashCode();
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
     * Sets the value of field 'created'. The field 'created' has
     * the following description: Creation time in the 'dow mon dd
     * hh:mm:ss zzz yyyy'
     *  format.
     * 
     * @param created the value of field 'created'.
     */
    public void setCreated(
            final java.lang.String created) {
        this._created = created;
    }

    /**
     * Sets the value of field 'mstation'. The field 'mstation' has
     * the following description: Monitoring station? This is
     * seemingly
     *  unused.
     * 
     * @param mstation the value of field 'mstation'.
     */
    public void setMstation(
            final java.lang.String mstation) {
        this._mstation = mstation;
    }

    /**
     * Sets the value of field 'rev'. The field 'rev' has the
     * following description: Revision of this file.
     * 
     * @param rev the value of field 'rev'.
     */
    public void setRev(
            final java.lang.String rev) {
        this._rev = rev;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.views.Heade
     */
    public static org.opennms.netmgt.config.views.Header unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.views.Header) Unmarshaller.unmarshal(org.opennms.netmgt.config.views.Header.class, reader);
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

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.snmpAsset.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * a MIB object
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class MibObj implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * object identifier
     */
    private java.lang.String _oid;

    /**
     * a human readable name for the object (such as
     *  "ifOctetsIn"). NOTE: This value is used as the RRD file
     * name and
     *  data source name. RRD only supports data source names up to
     * 19 chars
     *  in length. If the SNMP data collector encounters an alias
     * which
     *  exceeds 19 characters it will be truncated.
     */
    private java.lang.String _alias;


      //----------------/
     //- Constructors -/
    //----------------/

    public MibObj() {
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
        
        if (obj instanceof MibObj) {
        
            MibObj temp = (MibObj)obj;
            if (this._oid != null) {
                if (temp._oid == null) return false;
                else if (!(this._oid.equals(temp._oid))) 
                    return false;
            }
            else if (temp._oid != null)
                return false;
            if (this._alias != null) {
                if (temp._alias == null) return false;
                else if (!(this._alias.equals(temp._alias))) 
                    return false;
            }
            else if (temp._alias != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'alias'. The field 'alias' has
     * the following description: a human readable name for the
     * object (such as
     *  "ifOctetsIn"). NOTE: This value is used as the RRD file
     * name and
     *  data source name. RRD only supports data source names up to
     * 19 chars
     *  in length. If the SNMP data collector encounters an alias
     * which
     *  exceeds 19 characters it will be truncated.
     * 
     * @return the value of field 'Alias'.
     */
    public java.lang.String getAlias(
    ) {
        return this._alias;
    }

    /**
     * Returns the value of field 'oid'. The field 'oid' has the
     * following description: object identifier
     * 
     * @return the value of field 'Oid'.
     */
    public java.lang.String getOid(
    ) {
        return this._oid;
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
        if (_oid != null) {
           result = 37 * result + _oid.hashCode();
        }
        if (_alias != null) {
           result = 37 * result + _alias.hashCode();
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
     * Sets the value of field 'alias'. The field 'alias' has the
     * following description: a human readable name for the object
     * (such as
     *  "ifOctetsIn"). NOTE: This value is used as the RRD file
     * name and
     *  data source name. RRD only supports data source names up to
     * 19 chars
     *  in length. If the SNMP data collector encounters an alias
     * which
     *  exceeds 19 characters it will be truncated.
     * 
     * @param alias the value of field 'alias'.
     */
    public void setAlias(
            final java.lang.String alias) {
        this._alias = alias;
    }

    /**
     * Sets the value of field 'oid'. The field 'oid' has the
     * following description: object identifier
     * 
     * @param oid the value of field 'oid'.
     */
    public void setOid(
            final java.lang.String oid) {
        this._oid = oid;
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
     * org.opennms.netmgt.config.snmpAsset.adapter.MibObj
     */
    public static org.opennms.netmgt.config.snmpAsset.adapter.MibObj unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.snmpAsset.adapter.MibObj) Unmarshaller.unmarshal(org.opennms.netmgt.config.snmpAsset.adapter.MibObj.class, reader);
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

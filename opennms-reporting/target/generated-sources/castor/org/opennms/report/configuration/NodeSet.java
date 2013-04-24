/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.configuration;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class NodeSet.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class NodeSet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _devicename.
     */
    private java.lang.String _devicename;

    /**
     * Field _groupname.
     */
    private java.lang.String _groupname;

    /**
     * Field _configurationurl.
     */
    private java.lang.String _configurationurl;

    /**
     * Field _creationdate.
     */
    private java.lang.String _creationdate;

    /**
     * Field _status.
     */
    private java.lang.String _status;

    /**
     * Field _swconfigurationurl.
     */
    private java.lang.String _swconfigurationurl;

    /**
     * Field _version.
     */
    private java.lang.String _version;


      //----------------/
     //- Constructors -/
    //----------------/

    public NodeSet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'configurationurl'.
     * 
     * @return the value of field 'Configurationurl'.
     */
    public java.lang.String getConfigurationurl(
    ) {
        return this._configurationurl;
    }

    /**
     * Returns the value of field 'creationdate'.
     * 
     * @return the value of field 'Creationdate'.
     */
    public java.lang.String getCreationdate(
    ) {
        return this._creationdate;
    }

    /**
     * Returns the value of field 'devicename'.
     * 
     * @return the value of field 'Devicename'.
     */
    public java.lang.String getDevicename(
    ) {
        return this._devicename;
    }

    /**
     * Returns the value of field 'groupname'.
     * 
     * @return the value of field 'Groupname'.
     */
    public java.lang.String getGroupname(
    ) {
        return this._groupname;
    }

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus(
    ) {
        return this._status;
    }

    /**
     * Returns the value of field 'swconfigurationurl'.
     * 
     * @return the value of field 'Swconfigurationurl'.
     */
    public java.lang.String getSwconfigurationurl(
    ) {
        return this._swconfigurationurl;
    }

    /**
     * Returns the value of field 'version'.
     * 
     * @return the value of field 'Version'.
     */
    public java.lang.String getVersion(
    ) {
        return this._version;
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
     * Sets the value of field 'configurationurl'.
     * 
     * @param configurationurl the value of field 'configurationurl'
     */
    public void setConfigurationurl(
            final java.lang.String configurationurl) {
        this._configurationurl = configurationurl;
    }

    /**
     * Sets the value of field 'creationdate'.
     * 
     * @param creationdate the value of field 'creationdate'.
     */
    public void setCreationdate(
            final java.lang.String creationdate) {
        this._creationdate = creationdate;
    }

    /**
     * Sets the value of field 'devicename'.
     * 
     * @param devicename the value of field 'devicename'.
     */
    public void setDevicename(
            final java.lang.String devicename) {
        this._devicename = devicename;
    }

    /**
     * Sets the value of field 'groupname'.
     * 
     * @param groupname the value of field 'groupname'.
     */
    public void setGroupname(
            final java.lang.String groupname) {
        this._groupname = groupname;
    }

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
    }

    /**
     * Sets the value of field 'swconfigurationurl'.
     * 
     * @param swconfigurationurl the value of field
     * 'swconfigurationurl'.
     */
    public void setSwconfigurationurl(
            final java.lang.String swconfigurationurl) {
        this._swconfigurationurl = swconfigurationurl;
    }

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(
            final java.lang.String version) {
        this._version = version;
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
     * org.opennms.report.configuration.NodeSet
     */
    public static org.opennms.report.configuration.NodeSet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.configuration.NodeSet) Unmarshaller.unmarshal(org.opennms.report.configuration.NodeSet.class, reader);
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

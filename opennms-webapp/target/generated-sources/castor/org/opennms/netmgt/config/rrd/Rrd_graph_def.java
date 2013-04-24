/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rrd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Rrd_graph_def.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Rrd_graph_def implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _span.
     */
    private org.opennms.netmgt.config.rrd.Span _span;

    /**
     * Field _options.
     */
    private org.opennms.netmgt.config.rrd.Options _options;

    /**
     * Field _datasources.
     */
    private org.opennms.netmgt.config.rrd.Datasources _datasources;

    /**
     * Field _graph.
     */
    private org.opennms.netmgt.config.rrd.Graph _graph;


      //----------------/
     //- Constructors -/
    //----------------/

    public Rrd_graph_def() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'datasources'.
     * 
     * @return the value of field 'Datasources'.
     */
    public org.opennms.netmgt.config.rrd.Datasources getDatasources(
    ) {
        return this._datasources;
    }

    /**
     * Returns the value of field 'graph'.
     * 
     * @return the value of field 'Graph'.
     */
    public org.opennms.netmgt.config.rrd.Graph getGraph(
    ) {
        return this._graph;
    }

    /**
     * Returns the value of field 'options'.
     * 
     * @return the value of field 'Options'.
     */
    public org.opennms.netmgt.config.rrd.Options getOptions(
    ) {
        return this._options;
    }

    /**
     * Returns the value of field 'span'.
     * 
     * @return the value of field 'Span'.
     */
    public org.opennms.netmgt.config.rrd.Span getSpan(
    ) {
        return this._span;
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
     * Sets the value of field 'datasources'.
     * 
     * @param datasources the value of field 'datasources'.
     */
    public void setDatasources(
            final org.opennms.netmgt.config.rrd.Datasources datasources) {
        this._datasources = datasources;
    }

    /**
     * Sets the value of field 'graph'.
     * 
     * @param graph the value of field 'graph'.
     */
    public void setGraph(
            final org.opennms.netmgt.config.rrd.Graph graph) {
        this._graph = graph;
    }

    /**
     * Sets the value of field 'options'.
     * 
     * @param options the value of field 'options'.
     */
    public void setOptions(
            final org.opennms.netmgt.config.rrd.Options options) {
        this._options = options;
    }

    /**
     * Sets the value of field 'span'.
     * 
     * @param span the value of field 'span'.
     */
    public void setSpan(
            final org.opennms.netmgt.config.rrd.Span span) {
        this._span = span;
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
     * org.opennms.netmgt.config.rrd.Rrd_graph_def
     */
    public static org.opennms.netmgt.config.rrd.Rrd_graph_def unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.Rrd_graph_def) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.Rrd_graph_def.class, reader);
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

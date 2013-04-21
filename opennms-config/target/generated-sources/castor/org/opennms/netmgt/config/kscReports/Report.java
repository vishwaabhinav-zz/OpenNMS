/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.kscReports;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Report.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _id.
     */
    private int _id;

    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;

    /**
     * Field _title.
     */
    private java.lang.String _title;

    /**
     * Field _show_timespan_button.
     */
    private boolean _show_timespan_button;

    /**
     * keeps track of state for field: _show_timespan_button
     */
    private boolean _has_show_timespan_button;

    /**
     * Field _show_graphtype_button.
     */
    private boolean _show_graphtype_button;

    /**
     * keeps track of state for field: _show_graphtype_button
     */
    private boolean _has_show_graphtype_button;

    /**
     * Field _graphs_per_line.
     */
    private int _graphs_per_line;

    /**
     * keeps track of state for field: _graphs_per_line
     */
    private boolean _has_graphs_per_line;

    /**
     * Field _graphList.
     */
    private java.util.List<org.opennms.netmgt.config.kscReports.Graph> _graphList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Report() {
        super();
        this._graphList = new java.util.ArrayList<org.opennms.netmgt.config.kscReports.Graph>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vGraph
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGraph(
            final org.opennms.netmgt.config.kscReports.Graph vGraph)
    throws java.lang.IndexOutOfBoundsException {
        this._graphList.add(vGraph);
    }

    /**
     * 
     * 
     * @param index
     * @param vGraph
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGraph(
            final int index,
            final org.opennms.netmgt.config.kscReports.Graph vGraph)
    throws java.lang.IndexOutOfBoundsException {
        this._graphList.add(index, vGraph);
    }

    /**
     */
    public void deleteGraphs_per_line(
    ) {
        this._has_graphs_per_line= false;
    }

    /**
     */
    public void deleteId(
    ) {
        this._has_id= false;
    }

    /**
     */
    public void deleteShow_graphtype_button(
    ) {
        this._has_show_graphtype_button= false;
    }

    /**
     */
    public void deleteShow_timespan_button(
    ) {
        this._has_show_timespan_button= false;
    }

    /**
     * Method enumerateGraph.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.kscReports.Graph> enumerateGraph(
    ) {
        return java.util.Collections.enumeration(this._graphList);
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
        
        if (obj instanceof Report) {
        
            Report temp = (Report)obj;
            if (this._id != temp._id)
                return false;
            if (this._has_id != temp._has_id)
                return false;
            if (this._title != null) {
                if (temp._title == null) return false;
                else if (!(this._title.equals(temp._title))) 
                    return false;
            }
            else if (temp._title != null)
                return false;
            if (this._show_timespan_button != temp._show_timespan_button)
                return false;
            if (this._has_show_timespan_button != temp._has_show_timespan_button)
                return false;
            if (this._show_graphtype_button != temp._show_graphtype_button)
                return false;
            if (this._has_show_graphtype_button != temp._has_show_graphtype_button)
                return false;
            if (this._graphs_per_line != temp._graphs_per_line)
                return false;
            if (this._has_graphs_per_line != temp._has_graphs_per_line)
                return false;
            if (this._graphList != null) {
                if (temp._graphList == null) return false;
                else if (!(this._graphList.equals(temp._graphList))) 
                    return false;
            }
            else if (temp._graphList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getGraph.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.kscReports.Graph at the given index
     */
    public org.opennms.netmgt.config.kscReports.Graph getGraph(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._graphList.size()) {
            throw new IndexOutOfBoundsException("getGraph: Index value '" + index + "' not in range [0.." + (this._graphList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.kscReports.Graph) _graphList.get(index);
    }

    /**
     * Method getGraph.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.kscReports.Graph[] getGraph(
    ) {
        org.opennms.netmgt.config.kscReports.Graph[] array = new org.opennms.netmgt.config.kscReports.Graph[0];
        return (org.opennms.netmgt.config.kscReports.Graph[]) this._graphList.toArray(array);
    }

    /**
     * Method getGraphCollection.Returns a reference to
     * '_graphList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.kscReports.Graph> getGraphCollection(
    ) {
        return this._graphList;
    }

    /**
     * Method getGraphCount.
     * 
     * @return the size of this collection
     */
    public int getGraphCount(
    ) {
        return this._graphList.size();
    }

    /**
     * Returns the value of field 'graphs_per_line'.
     * 
     * @return the value of field 'Graphs_per_line'.
     */
    public int getGraphs_per_line(
    ) {
        return this._graphs_per_line;
    }

    /**
     * Returns the value of field 'id'.
     * 
     * @return the value of field 'Id'.
     */
    public int getId(
    ) {
        return this._id;
    }

    /**
     * Returns the value of field 'show_graphtype_button'.
     * 
     * @return the value of field 'Show_graphtype_button'.
     */
    public boolean getShow_graphtype_button(
    ) {
        return this._show_graphtype_button;
    }

    /**
     * Returns the value of field 'show_timespan_button'.
     * 
     * @return the value of field 'Show_timespan_button'.
     */
    public boolean getShow_timespan_button(
    ) {
        return this._show_timespan_button;
    }

    /**
     * Returns the value of field 'title'.
     * 
     * @return the value of field 'Title'.
     */
    public java.lang.String getTitle(
    ) {
        return this._title;
    }

    /**
     * Method hasGraphs_per_line.
     * 
     * @return true if at least one Graphs_per_line has been added
     */
    public boolean hasGraphs_per_line(
    ) {
        return this._has_graphs_per_line;
    }

    /**
     * Method hasId.
     * 
     * @return true if at least one Id has been added
     */
    public boolean hasId(
    ) {
        return this._has_id;
    }

    /**
     * Method hasShow_graphtype_button.
     * 
     * @return true if at least one Show_graphtype_button has been
     * added
     */
    public boolean hasShow_graphtype_button(
    ) {
        return this._has_show_graphtype_button;
    }

    /**
     * Method hasShow_timespan_button.
     * 
     * @return true if at least one Show_timespan_button has been
     * added
     */
    public boolean hasShow_timespan_button(
    ) {
        return this._has_show_timespan_button;
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
        result = 37 * result + _id;
        if (_title != null) {
           result = 37 * result + _title.hashCode();
        }
        result = 37 * result + (_show_timespan_button?0:1);
        result = 37 * result + (_show_graphtype_button?0:1);
        result = 37 * result + _graphs_per_line;
        if (_graphList != null) {
           result = 37 * result + _graphList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'show_graphtype_button'.
     * 
     * @return the value of field 'Show_graphtype_button'.
     */
    public boolean isShow_graphtype_button(
    ) {
        return this._show_graphtype_button;
    }

    /**
     * Returns the value of field 'show_timespan_button'.
     * 
     * @return the value of field 'Show_timespan_button'.
     */
    public boolean isShow_timespan_button(
    ) {
        return this._show_timespan_button;
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
     * Method iterateGraph.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.kscReports.Graph> iterateGraph(
    ) {
        return this._graphList.iterator();
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
     */
    public void removeAllGraph(
    ) {
        this._graphList.clear();
    }

    /**
     * Method removeGraph.
     * 
     * @param vGraph
     * @return true if the object was removed from the collection.
     */
    public boolean removeGraph(
            final org.opennms.netmgt.config.kscReports.Graph vGraph) {
        boolean removed = _graphList.remove(vGraph);
        return removed;
    }

    /**
     * Method removeGraphAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.kscReports.Graph removeGraphAt(
            final int index) {
        java.lang.Object obj = this._graphList.remove(index);
        return (org.opennms.netmgt.config.kscReports.Graph) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vGraph
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGraph(
            final int index,
            final org.opennms.netmgt.config.kscReports.Graph vGraph)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._graphList.size()) {
            throw new IndexOutOfBoundsException("setGraph: Index value '" + index + "' not in range [0.." + (this._graphList.size() - 1) + "]");
        }
        
        this._graphList.set(index, vGraph);
    }

    /**
     * 
     * 
     * @param vGraphArray
     */
    public void setGraph(
            final org.opennms.netmgt.config.kscReports.Graph[] vGraphArray) {
        //-- copy array
        _graphList.clear();
        
        for (int i = 0; i < vGraphArray.length; i++) {
                this._graphList.add(vGraphArray[i]);
        }
    }

    /**
     * Sets the value of '_graphList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vGraphList the Vector to copy.
     */
    public void setGraph(
            final java.util.List<org.opennms.netmgt.config.kscReports.Graph> vGraphList) {
        // copy vector
        this._graphList.clear();
        
        this._graphList.addAll(vGraphList);
    }

    /**
     * Sets the value of '_graphList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param graphList the Vector to set.
     */
    public void setGraphCollection(
            final java.util.List<org.opennms.netmgt.config.kscReports.Graph> graphList) {
        this._graphList = graphList;
    }

    /**
     * Sets the value of field 'graphs_per_line'.
     * 
     * @param graphs_per_line the value of field 'graphs_per_line'.
     */
    public void setGraphs_per_line(
            final int graphs_per_line) {
        this._graphs_per_line = graphs_per_line;
        this._has_graphs_per_line = true;
    }

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(
            final int id) {
        this._id = id;
        this._has_id = true;
    }

    /**
     * Sets the value of field 'show_graphtype_button'.
     * 
     * @param show_graphtype_button the value of field
     * 'show_graphtype_button'.
     */
    public void setShow_graphtype_button(
            final boolean show_graphtype_button) {
        this._show_graphtype_button = show_graphtype_button;
        this._has_show_graphtype_button = true;
    }

    /**
     * Sets the value of field 'show_timespan_button'.
     * 
     * @param show_timespan_button the value of field
     * 'show_timespan_button'.
     */
    public void setShow_timespan_button(
            final boolean show_timespan_button) {
        this._show_timespan_button = show_timespan_button;
        this._has_show_timespan_button = true;
    }

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(
            final java.lang.String title) {
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
     * org.opennms.netmgt.config.kscReports.Report
     */
    public static org.opennms.netmgt.config.kscReports.Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.kscReports.Report) Unmarshaller.unmarshal(org.opennms.netmgt.config.kscReports.Report.class, reader);
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

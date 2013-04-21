/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.ackd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Reader.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Reader implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The reader name is the value returned by the getName()
     * method required by the
     *  AckReader interface. Readers are currently wired in using
     * Spring.
     *  
     */
    private java.lang.String _readerName;

    /**
     * Field _enabled.
     */
    private boolean _enabled = true;

    /**
     * keeps track of state for field: _enabled
     */
    private boolean _has_enabled;

    /**
     * A very basic configuration for defining simple input to a
     * schedule (java.lang.concurrent)
     *  
     */
    private org.opennms.netmgt.config.ackd.ReaderSchedule _readerSchedule;

    /**
     * Parameters to be used for collecting this service.
     *  Parameters are specfic to the service monitor.
     */
    private java.util.List<org.opennms.netmgt.config.ackd.Parameter> _parameterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Reader() {
        super();
        this._parameterList = new java.util.ArrayList<org.opennms.netmgt.config.ackd.Parameter>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final org.opennms.netmgt.config.ackd.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(vParameter);
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final int index,
            final org.opennms.netmgt.config.ackd.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     */
    public void deleteEnabled(
    ) {
        this._has_enabled= false;
    }

    /**
     * Method enumerateParameter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.ackd.Parameter> enumerateParameter(
    ) {
        return java.util.Collections.enumeration(this._parameterList);
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
        
        if (obj instanceof Reader) {
        
            Reader temp = (Reader)obj;
            if (this._readerName != null) {
                if (temp._readerName == null) return false;
                else if (!(this._readerName.equals(temp._readerName))) 
                    return false;
            }
            else if (temp._readerName != null)
                return false;
            if (this._enabled != temp._enabled)
                return false;
            if (this._has_enabled != temp._has_enabled)
                return false;
            if (this._readerSchedule != null) {
                if (temp._readerSchedule == null) return false;
                else if (!(this._readerSchedule.equals(temp._readerSchedule))) 
                    return false;
            }
            else if (temp._readerSchedule != null)
                return false;
            if (this._parameterList != null) {
                if (temp._parameterList == null) return false;
                else if (!(this._parameterList.equals(temp._parameterList))) 
                    return false;
            }
            else if (temp._parameterList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'enabled'.
     * 
     * @return the value of field 'Enabled'.
     */
    public boolean getEnabled(
    ) {
        return this._enabled;
    }

    /**
     * Method getParameter.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.ackd.Parameter at the given index
     */
    public org.opennms.netmgt.config.ackd.Parameter getParameter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.ackd.Parameter) _parameterList.get(index);
    }

    /**
     * Method getParameter.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.ackd.Parameter[] getParameter(
    ) {
        org.opennms.netmgt.config.ackd.Parameter[] array = new org.opennms.netmgt.config.ackd.Parameter[0];
        return (org.opennms.netmgt.config.ackd.Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCollection.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.ackd.Parameter> getParameterCollection(
    ) {
        return this._parameterList;
    }

    /**
     * Method getParameterCount.
     * 
     * @return the size of this collection
     */
    public int getParameterCount(
    ) {
        return this._parameterList.size();
    }

    /**
     * Returns the value of field 'readerName'. The field
     * 'readerName' has the following description: The reader name
     * is the value returned by the getName() method required by
     * the
     *  AckReader interface. Readers are currently wired in using
     * Spring.
     *  
     * 
     * @return the value of field 'ReaderName'.
     */
    public java.lang.String getReaderName(
    ) {
        return this._readerName;
    }

    /**
     * Returns the value of field 'readerSchedule'. The field
     * 'readerSchedule' has the following description: A very basic
     * configuration for defining simple input to a schedule
     * (java.lang.concurrent)
     *  
     * 
     * @return the value of field 'ReaderSchedule'.
     */
    public org.opennms.netmgt.config.ackd.ReaderSchedule getReaderSchedule(
    ) {
        return this._readerSchedule;
    }

    /**
     * Method hasEnabled.
     * 
     * @return true if at least one Enabled has been added
     */
    public boolean hasEnabled(
    ) {
        return this._has_enabled;
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
        if (_readerName != null) {
           result = 37 * result + _readerName.hashCode();
        }
        result = 37 * result + (_enabled?0:1);
        if (_readerSchedule != null) {
           result = 37 * result + _readerSchedule.hashCode();
        }
        if (_parameterList != null) {
           result = 37 * result + _parameterList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'enabled'.
     * 
     * @return the value of field 'Enabled'.
     */
    public boolean isEnabled(
    ) {
        return this._enabled;
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
     * Method iterateParameter.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.ackd.Parameter> iterateParameter(
    ) {
        return this._parameterList.iterator();
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
    public void removeAllParameter(
    ) {
        this._parameterList.clear();
    }

    /**
     * Method removeParameter.
     * 
     * @param vParameter
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameter(
            final org.opennms.netmgt.config.ackd.Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.ackd.Parameter removeParameterAt(
            final int index) {
        java.lang.Object obj = this._parameterList.remove(index);
        return (org.opennms.netmgt.config.ackd.Parameter) obj;
    }

    /**
     * Sets the value of field 'enabled'.
     * 
     * @param enabled the value of field 'enabled'.
     */
    public void setEnabled(
            final boolean enabled) {
        this._enabled = enabled;
        this._has_enabled = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParameter(
            final int index,
            final org.opennms.netmgt.config.ackd.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("setParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        this._parameterList.set(index, vParameter);
    }

    /**
     * 
     * 
     * @param vParameterArray
     */
    public void setParameter(
            final org.opennms.netmgt.config.ackd.Parameter[] vParameterArray) {
        //-- copy array
        _parameterList.clear();
        
        for (int i = 0; i < vParameterArray.length; i++) {
                this._parameterList.add(vParameterArray[i]);
        }
    }

    /**
     * Sets the value of '_parameterList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vParameterList the Vector to copy.
     */
    public void setParameter(
            final java.util.List<org.opennms.netmgt.config.ackd.Parameter> vParameterList) {
        // copy vector
        this._parameterList.clear();
        
        this._parameterList.addAll(vParameterList);
    }

    /**
     * Sets the value of '_parameterList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param parameterList the Vector to set.
     */
    public void setParameterCollection(
            final java.util.List<org.opennms.netmgt.config.ackd.Parameter> parameterList) {
        this._parameterList = parameterList;
    }

    /**
     * Sets the value of field 'readerName'. The field 'readerName'
     * has the following description: The reader name is the value
     * returned by the getName() method required by the
     *  AckReader interface. Readers are currently wired in using
     * Spring.
     *  
     * 
     * @param readerName the value of field 'readerName'.
     */
    public void setReaderName(
            final java.lang.String readerName) {
        this._readerName = readerName;
    }

    /**
     * Sets the value of field 'readerSchedule'. The field
     * 'readerSchedule' has the following description: A very basic
     * configuration for defining simple input to a schedule
     * (java.lang.concurrent)
     *  
     * 
     * @param readerSchedule the value of field 'readerSchedule'.
     */
    public void setReaderSchedule(
            final org.opennms.netmgt.config.ackd.ReaderSchedule readerSchedule) {
        this._readerSchedule = readerSchedule;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.ackd.Reader
     */
    public static org.opennms.netmgt.config.ackd.Reader unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.ackd.Reader) Unmarshaller.unmarshal(org.opennms.netmgt.config.ackd.Reader.class, reader);
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

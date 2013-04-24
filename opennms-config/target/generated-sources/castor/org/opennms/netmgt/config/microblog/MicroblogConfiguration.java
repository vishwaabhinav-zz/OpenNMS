/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.microblog;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Microblog configuration groups
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class MicroblogConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defaultMicroblogProfileName.
     */
    private java.lang.String _defaultMicroblogProfileName;

    /**
     * This entity defines the parameters for a microblog service.
     *  
     */
    private java.util.List<org.opennms.netmgt.config.microblog.MicroblogProfile> _microblogProfileList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MicroblogConfiguration() {
        super();
        this._microblogProfileList = new java.util.ArrayList<org.opennms.netmgt.config.microblog.MicroblogProfile>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMicroblogProfile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMicroblogProfile(
            final org.opennms.netmgt.config.microblog.MicroblogProfile vMicroblogProfile)
    throws java.lang.IndexOutOfBoundsException {
        this._microblogProfileList.add(vMicroblogProfile);
    }

    /**
     * 
     * 
     * @param index
     * @param vMicroblogProfile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMicroblogProfile(
            final int index,
            final org.opennms.netmgt.config.microblog.MicroblogProfile vMicroblogProfile)
    throws java.lang.IndexOutOfBoundsException {
        this._microblogProfileList.add(index, vMicroblogProfile);
    }

    /**
     * Method enumerateMicroblogProfile.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.microblog.MicroblogProfile> enumerateMicroblogProfile(
    ) {
        return java.util.Collections.enumeration(this._microblogProfileList);
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
        
        if (obj instanceof MicroblogConfiguration) {
        
            MicroblogConfiguration temp = (MicroblogConfiguration)obj;
            if (this._defaultMicroblogProfileName != null) {
                if (temp._defaultMicroblogProfileName == null) return false;
                else if (!(this._defaultMicroblogProfileName.equals(temp._defaultMicroblogProfileName))) 
                    return false;
            }
            else if (temp._defaultMicroblogProfileName != null)
                return false;
            if (this._microblogProfileList != null) {
                if (temp._microblogProfileList == null) return false;
                else if (!(this._microblogProfileList.equals(temp._microblogProfileList))) 
                    return false;
            }
            else if (temp._microblogProfileList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultMicroblogProfileName'.
     * 
     * @return the value of field 'DefaultMicroblogProfileName'.
     */
    public java.lang.String getDefaultMicroblogProfileName(
    ) {
        return this._defaultMicroblogProfileName;
    }

    /**
     * Method getMicroblogProfile.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.microblog.MicroblogProfile at the
     * given index
     */
    public org.opennms.netmgt.config.microblog.MicroblogProfile getMicroblogProfile(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._microblogProfileList.size()) {
            throw new IndexOutOfBoundsException("getMicroblogProfile: Index value '" + index + "' not in range [0.." + (this._microblogProfileList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.microblog.MicroblogProfile) _microblogProfileList.get(index);
    }

    /**
     * Method getMicroblogProfile.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.microblog.MicroblogProfile[] getMicroblogProfile(
    ) {
        org.opennms.netmgt.config.microblog.MicroblogProfile[] array = new org.opennms.netmgt.config.microblog.MicroblogProfile[0];
        return (org.opennms.netmgt.config.microblog.MicroblogProfile[]) this._microblogProfileList.toArray(array);
    }

    /**
     * Method getMicroblogProfileCollection.Returns a reference to
     * '_microblogProfileList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.microblog.MicroblogProfile> getMicroblogProfileCollection(
    ) {
        return this._microblogProfileList;
    }

    /**
     * Method getMicroblogProfileCount.
     * 
     * @return the size of this collection
     */
    public int getMicroblogProfileCount(
    ) {
        return this._microblogProfileList.size();
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
        if (_defaultMicroblogProfileName != null) {
           result = 37 * result + _defaultMicroblogProfileName.hashCode();
        }
        if (_microblogProfileList != null) {
           result = 37 * result + _microblogProfileList.hashCode();
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
     * Method iterateMicroblogProfile.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.microblog.MicroblogProfile> iterateMicroblogProfile(
    ) {
        return this._microblogProfileList.iterator();
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
    public void removeAllMicroblogProfile(
    ) {
        this._microblogProfileList.clear();
    }

    /**
     * Method removeMicroblogProfile.
     * 
     * @param vMicroblogProfile
     * @return true if the object was removed from the collection.
     */
    public boolean removeMicroblogProfile(
            final org.opennms.netmgt.config.microblog.MicroblogProfile vMicroblogProfile) {
        boolean removed = _microblogProfileList.remove(vMicroblogProfile);
        return removed;
    }

    /**
     * Method removeMicroblogProfileAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.microblog.MicroblogProfile removeMicroblogProfileAt(
            final int index) {
        java.lang.Object obj = this._microblogProfileList.remove(index);
        return (org.opennms.netmgt.config.microblog.MicroblogProfile) obj;
    }

    /**
     * Sets the value of field 'defaultMicroblogProfileName'.
     * 
     * @param defaultMicroblogProfileName the value of field
     * 'defaultMicroblogProfileName'.
     */
    public void setDefaultMicroblogProfileName(
            final java.lang.String defaultMicroblogProfileName) {
        this._defaultMicroblogProfileName = defaultMicroblogProfileName;
    }

    /**
     * 
     * 
     * @param index
     * @param vMicroblogProfile
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMicroblogProfile(
            final int index,
            final org.opennms.netmgt.config.microblog.MicroblogProfile vMicroblogProfile)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._microblogProfileList.size()) {
            throw new IndexOutOfBoundsException("setMicroblogProfile: Index value '" + index + "' not in range [0.." + (this._microblogProfileList.size() - 1) + "]");
        }
        
        this._microblogProfileList.set(index, vMicroblogProfile);
    }

    /**
     * 
     * 
     * @param vMicroblogProfileArray
     */
    public void setMicroblogProfile(
            final org.opennms.netmgt.config.microblog.MicroblogProfile[] vMicroblogProfileArray) {
        //-- copy array
        _microblogProfileList.clear();
        
        for (int i = 0; i < vMicroblogProfileArray.length; i++) {
                this._microblogProfileList.add(vMicroblogProfileArray[i]);
        }
    }

    /**
     * Sets the value of '_microblogProfileList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vMicroblogProfileList the Vector to copy.
     */
    public void setMicroblogProfile(
            final java.util.List<org.opennms.netmgt.config.microblog.MicroblogProfile> vMicroblogProfileList) {
        // copy vector
        this._microblogProfileList.clear();
        
        this._microblogProfileList.addAll(vMicroblogProfileList);
    }

    /**
     * Sets the value of '_microblogProfileList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param microblogProfileList the Vector to set.
     */
    public void setMicroblogProfileCollection(
            final java.util.List<org.opennms.netmgt.config.microblog.MicroblogProfile> microblogProfileList) {
        this._microblogProfileList = microblogProfileList;
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
     * org.opennms.netmgt.config.microblog.MicroblogConfiguration
     */
    public static org.opennms.netmgt.config.microblog.MicroblogConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.microblog.MicroblogConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.microblog.MicroblogConfiguration.class, reader);
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

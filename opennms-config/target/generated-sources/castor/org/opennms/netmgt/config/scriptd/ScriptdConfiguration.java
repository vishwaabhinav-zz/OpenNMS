/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.scriptd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the scriptd-configuration.xml
 *  configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ScriptdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _engineList.
     */
    private java.util.List<org.opennms.netmgt.config.scriptd.Engine> _engineList;

    /**
     * Field _startScriptList.
     */
    private java.util.List<org.opennms.netmgt.config.scriptd.StartScript> _startScriptList;

    /**
     * Field _stopScriptList.
     */
    private java.util.List<org.opennms.netmgt.config.scriptd.StopScript> _stopScriptList;

    /**
     * Field _reloadScriptList.
     */
    private java.util.List<org.opennms.netmgt.config.scriptd.ReloadScript> _reloadScriptList;

    /**
     * Field _eventScriptList.
     */
    private java.util.List<org.opennms.netmgt.config.scriptd.EventScript> _eventScriptList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ScriptdConfiguration() {
        super();
        this._engineList = new java.util.ArrayList<org.opennms.netmgt.config.scriptd.Engine>();
        this._startScriptList = new java.util.ArrayList<org.opennms.netmgt.config.scriptd.StartScript>();
        this._stopScriptList = new java.util.ArrayList<org.opennms.netmgt.config.scriptd.StopScript>();
        this._reloadScriptList = new java.util.ArrayList<org.opennms.netmgt.config.scriptd.ReloadScript>();
        this._eventScriptList = new java.util.ArrayList<org.opennms.netmgt.config.scriptd.EventScript>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEngine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEngine(
            final org.opennms.netmgt.config.scriptd.Engine vEngine)
    throws java.lang.IndexOutOfBoundsException {
        this._engineList.add(vEngine);
    }

    /**
     * 
     * 
     * @param index
     * @param vEngine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEngine(
            final int index,
            final org.opennms.netmgt.config.scriptd.Engine vEngine)
    throws java.lang.IndexOutOfBoundsException {
        this._engineList.add(index, vEngine);
    }

    /**
     * 
     * 
     * @param vEventScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventScript(
            final org.opennms.netmgt.config.scriptd.EventScript vEventScript)
    throws java.lang.IndexOutOfBoundsException {
        this._eventScriptList.add(vEventScript);
    }

    /**
     * 
     * 
     * @param index
     * @param vEventScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEventScript(
            final int index,
            final org.opennms.netmgt.config.scriptd.EventScript vEventScript)
    throws java.lang.IndexOutOfBoundsException {
        this._eventScriptList.add(index, vEventScript);
    }

    /**
     * 
     * 
     * @param vReloadScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReloadScript(
            final org.opennms.netmgt.config.scriptd.ReloadScript vReloadScript)
    throws java.lang.IndexOutOfBoundsException {
        this._reloadScriptList.add(vReloadScript);
    }

    /**
     * 
     * 
     * @param index
     * @param vReloadScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReloadScript(
            final int index,
            final org.opennms.netmgt.config.scriptd.ReloadScript vReloadScript)
    throws java.lang.IndexOutOfBoundsException {
        this._reloadScriptList.add(index, vReloadScript);
    }

    /**
     * 
     * 
     * @param vStartScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStartScript(
            final org.opennms.netmgt.config.scriptd.StartScript vStartScript)
    throws java.lang.IndexOutOfBoundsException {
        this._startScriptList.add(vStartScript);
    }

    /**
     * 
     * 
     * @param index
     * @param vStartScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStartScript(
            final int index,
            final org.opennms.netmgt.config.scriptd.StartScript vStartScript)
    throws java.lang.IndexOutOfBoundsException {
        this._startScriptList.add(index, vStartScript);
    }

    /**
     * 
     * 
     * @param vStopScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStopScript(
            final org.opennms.netmgt.config.scriptd.StopScript vStopScript)
    throws java.lang.IndexOutOfBoundsException {
        this._stopScriptList.add(vStopScript);
    }

    /**
     * 
     * 
     * @param index
     * @param vStopScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStopScript(
            final int index,
            final org.opennms.netmgt.config.scriptd.StopScript vStopScript)
    throws java.lang.IndexOutOfBoundsException {
        this._stopScriptList.add(index, vStopScript);
    }

    /**
     * Method enumerateEngine.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.scriptd.Engine> enumerateEngine(
    ) {
        return java.util.Collections.enumeration(this._engineList);
    }

    /**
     * Method enumerateEventScript.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.scriptd.EventScript> enumerateEventScript(
    ) {
        return java.util.Collections.enumeration(this._eventScriptList);
    }

    /**
     * Method enumerateReloadScript.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.scriptd.ReloadScript> enumerateReloadScript(
    ) {
        return java.util.Collections.enumeration(this._reloadScriptList);
    }

    /**
     * Method enumerateStartScript.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.scriptd.StartScript> enumerateStartScript(
    ) {
        return java.util.Collections.enumeration(this._startScriptList);
    }

    /**
     * Method enumerateStopScript.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.scriptd.StopScript> enumerateStopScript(
    ) {
        return java.util.Collections.enumeration(this._stopScriptList);
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
        
        if (obj instanceof ScriptdConfiguration) {
        
            ScriptdConfiguration temp = (ScriptdConfiguration)obj;
            if (this._engineList != null) {
                if (temp._engineList == null) return false;
                else if (!(this._engineList.equals(temp._engineList))) 
                    return false;
            }
            else if (temp._engineList != null)
                return false;
            if (this._startScriptList != null) {
                if (temp._startScriptList == null) return false;
                else if (!(this._startScriptList.equals(temp._startScriptList))) 
                    return false;
            }
            else if (temp._startScriptList != null)
                return false;
            if (this._stopScriptList != null) {
                if (temp._stopScriptList == null) return false;
                else if (!(this._stopScriptList.equals(temp._stopScriptList))) 
                    return false;
            }
            else if (temp._stopScriptList != null)
                return false;
            if (this._reloadScriptList != null) {
                if (temp._reloadScriptList == null) return false;
                else if (!(this._reloadScriptList.equals(temp._reloadScriptList))) 
                    return false;
            }
            else if (temp._reloadScriptList != null)
                return false;
            if (this._eventScriptList != null) {
                if (temp._eventScriptList == null) return false;
                else if (!(this._eventScriptList.equals(temp._eventScriptList))) 
                    return false;
            }
            else if (temp._eventScriptList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getEngine.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.scriptd.Engine at the given index
     */
    public org.opennms.netmgt.config.scriptd.Engine getEngine(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._engineList.size()) {
            throw new IndexOutOfBoundsException("getEngine: Index value '" + index + "' not in range [0.." + (this._engineList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.scriptd.Engine) _engineList.get(index);
    }

    /**
     * Method getEngine.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.scriptd.Engine[] getEngine(
    ) {
        org.opennms.netmgt.config.scriptd.Engine[] array = new org.opennms.netmgt.config.scriptd.Engine[0];
        return (org.opennms.netmgt.config.scriptd.Engine[]) this._engineList.toArray(array);
    }

    /**
     * Method getEngineCollection.Returns a reference to
     * '_engineList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.scriptd.Engine> getEngineCollection(
    ) {
        return this._engineList;
    }

    /**
     * Method getEngineCount.
     * 
     * @return the size of this collection
     */
    public int getEngineCount(
    ) {
        return this._engineList.size();
    }

    /**
     * Method getEventScript.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.scriptd.EventScript at the given
     * index
     */
    public org.opennms.netmgt.config.scriptd.EventScript getEventScript(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventScriptList.size()) {
            throw new IndexOutOfBoundsException("getEventScript: Index value '" + index + "' not in range [0.." + (this._eventScriptList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.scriptd.EventScript) _eventScriptList.get(index);
    }

    /**
     * Method getEventScript.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.scriptd.EventScript[] getEventScript(
    ) {
        org.opennms.netmgt.config.scriptd.EventScript[] array = new org.opennms.netmgt.config.scriptd.EventScript[0];
        return (org.opennms.netmgt.config.scriptd.EventScript[]) this._eventScriptList.toArray(array);
    }

    /**
     * Method getEventScriptCollection.Returns a reference to
     * '_eventScriptList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.scriptd.EventScript> getEventScriptCollection(
    ) {
        return this._eventScriptList;
    }

    /**
     * Method getEventScriptCount.
     * 
     * @return the size of this collection
     */
    public int getEventScriptCount(
    ) {
        return this._eventScriptList.size();
    }

    /**
     * Method getReloadScript.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.scriptd.ReloadScript at the given
     * index
     */
    public org.opennms.netmgt.config.scriptd.ReloadScript getReloadScript(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._reloadScriptList.size()) {
            throw new IndexOutOfBoundsException("getReloadScript: Index value '" + index + "' not in range [0.." + (this._reloadScriptList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.scriptd.ReloadScript) _reloadScriptList.get(index);
    }

    /**
     * Method getReloadScript.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.scriptd.ReloadScript[] getReloadScript(
    ) {
        org.opennms.netmgt.config.scriptd.ReloadScript[] array = new org.opennms.netmgt.config.scriptd.ReloadScript[0];
        return (org.opennms.netmgt.config.scriptd.ReloadScript[]) this._reloadScriptList.toArray(array);
    }

    /**
     * Method getReloadScriptCollection.Returns a reference to
     * '_reloadScriptList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.scriptd.ReloadScript> getReloadScriptCollection(
    ) {
        return this._reloadScriptList;
    }

    /**
     * Method getReloadScriptCount.
     * 
     * @return the size of this collection
     */
    public int getReloadScriptCount(
    ) {
        return this._reloadScriptList.size();
    }

    /**
     * Method getStartScript.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.scriptd.StartScript at the given
     * index
     */
    public org.opennms.netmgt.config.scriptd.StartScript getStartScript(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._startScriptList.size()) {
            throw new IndexOutOfBoundsException("getStartScript: Index value '" + index + "' not in range [0.." + (this._startScriptList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.scriptd.StartScript) _startScriptList.get(index);
    }

    /**
     * Method getStartScript.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.scriptd.StartScript[] getStartScript(
    ) {
        org.opennms.netmgt.config.scriptd.StartScript[] array = new org.opennms.netmgt.config.scriptd.StartScript[0];
        return (org.opennms.netmgt.config.scriptd.StartScript[]) this._startScriptList.toArray(array);
    }

    /**
     * Method getStartScriptCollection.Returns a reference to
     * '_startScriptList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.scriptd.StartScript> getStartScriptCollection(
    ) {
        return this._startScriptList;
    }

    /**
     * Method getStartScriptCount.
     * 
     * @return the size of this collection
     */
    public int getStartScriptCount(
    ) {
        return this._startScriptList.size();
    }

    /**
     * Method getStopScript.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.scriptd.StopScript at the given
     * index
     */
    public org.opennms.netmgt.config.scriptd.StopScript getStopScript(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._stopScriptList.size()) {
            throw new IndexOutOfBoundsException("getStopScript: Index value '" + index + "' not in range [0.." + (this._stopScriptList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.scriptd.StopScript) _stopScriptList.get(index);
    }

    /**
     * Method getStopScript.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.scriptd.StopScript[] getStopScript(
    ) {
        org.opennms.netmgt.config.scriptd.StopScript[] array = new org.opennms.netmgt.config.scriptd.StopScript[0];
        return (org.opennms.netmgt.config.scriptd.StopScript[]) this._stopScriptList.toArray(array);
    }

    /**
     * Method getStopScriptCollection.Returns a reference to
     * '_stopScriptList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.scriptd.StopScript> getStopScriptCollection(
    ) {
        return this._stopScriptList;
    }

    /**
     * Method getStopScriptCount.
     * 
     * @return the size of this collection
     */
    public int getStopScriptCount(
    ) {
        return this._stopScriptList.size();
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
        if (_engineList != null) {
           result = 37 * result + _engineList.hashCode();
        }
        if (_startScriptList != null) {
           result = 37 * result + _startScriptList.hashCode();
        }
        if (_stopScriptList != null) {
           result = 37 * result + _stopScriptList.hashCode();
        }
        if (_reloadScriptList != null) {
           result = 37 * result + _reloadScriptList.hashCode();
        }
        if (_eventScriptList != null) {
           result = 37 * result + _eventScriptList.hashCode();
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
     * Method iterateEngine.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.scriptd.Engine> iterateEngine(
    ) {
        return this._engineList.iterator();
    }

    /**
     * Method iterateEventScript.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.scriptd.EventScript> iterateEventScript(
    ) {
        return this._eventScriptList.iterator();
    }

    /**
     * Method iterateReloadScript.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.scriptd.ReloadScript> iterateReloadScript(
    ) {
        return this._reloadScriptList.iterator();
    }

    /**
     * Method iterateStartScript.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.scriptd.StartScript> iterateStartScript(
    ) {
        return this._startScriptList.iterator();
    }

    /**
     * Method iterateStopScript.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.scriptd.StopScript> iterateStopScript(
    ) {
        return this._stopScriptList.iterator();
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
    public void removeAllEngine(
    ) {
        this._engineList.clear();
    }

    /**
     */
    public void removeAllEventScript(
    ) {
        this._eventScriptList.clear();
    }

    /**
     */
    public void removeAllReloadScript(
    ) {
        this._reloadScriptList.clear();
    }

    /**
     */
    public void removeAllStartScript(
    ) {
        this._startScriptList.clear();
    }

    /**
     */
    public void removeAllStopScript(
    ) {
        this._stopScriptList.clear();
    }

    /**
     * Method removeEngine.
     * 
     * @param vEngine
     * @return true if the object was removed from the collection.
     */
    public boolean removeEngine(
            final org.opennms.netmgt.config.scriptd.Engine vEngine) {
        boolean removed = _engineList.remove(vEngine);
        return removed;
    }

    /**
     * Method removeEngineAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.scriptd.Engine removeEngineAt(
            final int index) {
        java.lang.Object obj = this._engineList.remove(index);
        return (org.opennms.netmgt.config.scriptd.Engine) obj;
    }

    /**
     * Method removeEventScript.
     * 
     * @param vEventScript
     * @return true if the object was removed from the collection.
     */
    public boolean removeEventScript(
            final org.opennms.netmgt.config.scriptd.EventScript vEventScript) {
        boolean removed = _eventScriptList.remove(vEventScript);
        return removed;
    }

    /**
     * Method removeEventScriptAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.scriptd.EventScript removeEventScriptAt(
            final int index) {
        java.lang.Object obj = this._eventScriptList.remove(index);
        return (org.opennms.netmgt.config.scriptd.EventScript) obj;
    }

    /**
     * Method removeReloadScript.
     * 
     * @param vReloadScript
     * @return true if the object was removed from the collection.
     */
    public boolean removeReloadScript(
            final org.opennms.netmgt.config.scriptd.ReloadScript vReloadScript) {
        boolean removed = _reloadScriptList.remove(vReloadScript);
        return removed;
    }

    /**
     * Method removeReloadScriptAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.scriptd.ReloadScript removeReloadScriptAt(
            final int index) {
        java.lang.Object obj = this._reloadScriptList.remove(index);
        return (org.opennms.netmgt.config.scriptd.ReloadScript) obj;
    }

    /**
     * Method removeStartScript.
     * 
     * @param vStartScript
     * @return true if the object was removed from the collection.
     */
    public boolean removeStartScript(
            final org.opennms.netmgt.config.scriptd.StartScript vStartScript) {
        boolean removed = _startScriptList.remove(vStartScript);
        return removed;
    }

    /**
     * Method removeStartScriptAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.scriptd.StartScript removeStartScriptAt(
            final int index) {
        java.lang.Object obj = this._startScriptList.remove(index);
        return (org.opennms.netmgt.config.scriptd.StartScript) obj;
    }

    /**
     * Method removeStopScript.
     * 
     * @param vStopScript
     * @return true if the object was removed from the collection.
     */
    public boolean removeStopScript(
            final org.opennms.netmgt.config.scriptd.StopScript vStopScript) {
        boolean removed = _stopScriptList.remove(vStopScript);
        return removed;
    }

    /**
     * Method removeStopScriptAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.scriptd.StopScript removeStopScriptAt(
            final int index) {
        java.lang.Object obj = this._stopScriptList.remove(index);
        return (org.opennms.netmgt.config.scriptd.StopScript) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEngine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEngine(
            final int index,
            final org.opennms.netmgt.config.scriptd.Engine vEngine)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._engineList.size()) {
            throw new IndexOutOfBoundsException("setEngine: Index value '" + index + "' not in range [0.." + (this._engineList.size() - 1) + "]");
        }
        
        this._engineList.set(index, vEngine);
    }

    /**
     * 
     * 
     * @param vEngineArray
     */
    public void setEngine(
            final org.opennms.netmgt.config.scriptd.Engine[] vEngineArray) {
        //-- copy array
        _engineList.clear();
        
        for (int i = 0; i < vEngineArray.length; i++) {
                this._engineList.add(vEngineArray[i]);
        }
    }

    /**
     * Sets the value of '_engineList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vEngineList the Vector to copy.
     */
    public void setEngine(
            final java.util.List<org.opennms.netmgt.config.scriptd.Engine> vEngineList) {
        // copy vector
        this._engineList.clear();
        
        this._engineList.addAll(vEngineList);
    }

    /**
     * Sets the value of '_engineList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param engineList the Vector to set.
     */
    public void setEngineCollection(
            final java.util.List<org.opennms.netmgt.config.scriptd.Engine> engineList) {
        this._engineList = engineList;
    }

    /**
     * 
     * 
     * @param index
     * @param vEventScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEventScript(
            final int index,
            final org.opennms.netmgt.config.scriptd.EventScript vEventScript)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._eventScriptList.size()) {
            throw new IndexOutOfBoundsException("setEventScript: Index value '" + index + "' not in range [0.." + (this._eventScriptList.size() - 1) + "]");
        }
        
        this._eventScriptList.set(index, vEventScript);
    }

    /**
     * 
     * 
     * @param vEventScriptArray
     */
    public void setEventScript(
            final org.opennms.netmgt.config.scriptd.EventScript[] vEventScriptArray) {
        //-- copy array
        _eventScriptList.clear();
        
        for (int i = 0; i < vEventScriptArray.length; i++) {
                this._eventScriptList.add(vEventScriptArray[i]);
        }
    }

    /**
     * Sets the value of '_eventScriptList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vEventScriptList the Vector to copy.
     */
    public void setEventScript(
            final java.util.List<org.opennms.netmgt.config.scriptd.EventScript> vEventScriptList) {
        // copy vector
        this._eventScriptList.clear();
        
        this._eventScriptList.addAll(vEventScriptList);
    }

    /**
     * Sets the value of '_eventScriptList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param eventScriptList the Vector to set.
     */
    public void setEventScriptCollection(
            final java.util.List<org.opennms.netmgt.config.scriptd.EventScript> eventScriptList) {
        this._eventScriptList = eventScriptList;
    }

    /**
     * 
     * 
     * @param index
     * @param vReloadScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setReloadScript(
            final int index,
            final org.opennms.netmgt.config.scriptd.ReloadScript vReloadScript)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._reloadScriptList.size()) {
            throw new IndexOutOfBoundsException("setReloadScript: Index value '" + index + "' not in range [0.." + (this._reloadScriptList.size() - 1) + "]");
        }
        
        this._reloadScriptList.set(index, vReloadScript);
    }

    /**
     * 
     * 
     * @param vReloadScriptArray
     */
    public void setReloadScript(
            final org.opennms.netmgt.config.scriptd.ReloadScript[] vReloadScriptArray) {
        //-- copy array
        _reloadScriptList.clear();
        
        for (int i = 0; i < vReloadScriptArray.length; i++) {
                this._reloadScriptList.add(vReloadScriptArray[i]);
        }
    }

    /**
     * Sets the value of '_reloadScriptList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vReloadScriptList the Vector to copy.
     */
    public void setReloadScript(
            final java.util.List<org.opennms.netmgt.config.scriptd.ReloadScript> vReloadScriptList) {
        // copy vector
        this._reloadScriptList.clear();
        
        this._reloadScriptList.addAll(vReloadScriptList);
    }

    /**
     * Sets the value of '_reloadScriptList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param reloadScriptList the Vector to set.
     */
    public void setReloadScriptCollection(
            final java.util.List<org.opennms.netmgt.config.scriptd.ReloadScript> reloadScriptList) {
        this._reloadScriptList = reloadScriptList;
    }

    /**
     * 
     * 
     * @param index
     * @param vStartScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStartScript(
            final int index,
            final org.opennms.netmgt.config.scriptd.StartScript vStartScript)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._startScriptList.size()) {
            throw new IndexOutOfBoundsException("setStartScript: Index value '" + index + "' not in range [0.." + (this._startScriptList.size() - 1) + "]");
        }
        
        this._startScriptList.set(index, vStartScript);
    }

    /**
     * 
     * 
     * @param vStartScriptArray
     */
    public void setStartScript(
            final org.opennms.netmgt.config.scriptd.StartScript[] vStartScriptArray) {
        //-- copy array
        _startScriptList.clear();
        
        for (int i = 0; i < vStartScriptArray.length; i++) {
                this._startScriptList.add(vStartScriptArray[i]);
        }
    }

    /**
     * Sets the value of '_startScriptList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vStartScriptList the Vector to copy.
     */
    public void setStartScript(
            final java.util.List<org.opennms.netmgt.config.scriptd.StartScript> vStartScriptList) {
        // copy vector
        this._startScriptList.clear();
        
        this._startScriptList.addAll(vStartScriptList);
    }

    /**
     * Sets the value of '_startScriptList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param startScriptList the Vector to set.
     */
    public void setStartScriptCollection(
            final java.util.List<org.opennms.netmgt.config.scriptd.StartScript> startScriptList) {
        this._startScriptList = startScriptList;
    }

    /**
     * 
     * 
     * @param index
     * @param vStopScript
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStopScript(
            final int index,
            final org.opennms.netmgt.config.scriptd.StopScript vStopScript)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._stopScriptList.size()) {
            throw new IndexOutOfBoundsException("setStopScript: Index value '" + index + "' not in range [0.." + (this._stopScriptList.size() - 1) + "]");
        }
        
        this._stopScriptList.set(index, vStopScript);
    }

    /**
     * 
     * 
     * @param vStopScriptArray
     */
    public void setStopScript(
            final org.opennms.netmgt.config.scriptd.StopScript[] vStopScriptArray) {
        //-- copy array
        _stopScriptList.clear();
        
        for (int i = 0; i < vStopScriptArray.length; i++) {
                this._stopScriptList.add(vStopScriptArray[i]);
        }
    }

    /**
     * Sets the value of '_stopScriptList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vStopScriptList the Vector to copy.
     */
    public void setStopScript(
            final java.util.List<org.opennms.netmgt.config.scriptd.StopScript> vStopScriptList) {
        // copy vector
        this._stopScriptList.clear();
        
        this._stopScriptList.addAll(vStopScriptList);
    }

    /**
     * Sets the value of '_stopScriptList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param stopScriptList the Vector to set.
     */
    public void setStopScriptCollection(
            final java.util.List<org.opennms.netmgt.config.scriptd.StopScript> stopScriptList) {
        this._stopScriptList = stopScriptList;
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
     * org.opennms.netmgt.config.scriptd.ScriptdConfiguration
     */
    public static org.opennms.netmgt.config.scriptd.ScriptdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.scriptd.ScriptdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.scriptd.ScriptdConfiguration.class, reader);
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

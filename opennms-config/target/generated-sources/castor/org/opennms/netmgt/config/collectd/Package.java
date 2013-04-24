/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.collectd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Package encapsulating addresses eligible to have SNMP
 *  data collected from them.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Package implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name or identifier for this
     *  package
     */
    private java.lang.String _name;

    /**
     * A rule which adresses belonging to this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter.
     */
    private org.opennms.netmgt.config.collectd.Filter _filter;

    /**
     * Adresseses in this package
     */
    private java.util.List<java.lang.String> _specificList;

    /**
     * Range of adresses in this package
     */
    private java.util.List<org.opennms.netmgt.config.collectd.IncludeRange> _includeRangeList;

    /**
     * Range of adresses to be excluded from this
     *  package
     */
    private java.util.List<org.opennms.netmgt.config.collectd.ExcludeRange> _excludeRangeList;

    /**
     * A file URL holding specific addresses to be polled.
     *  Each line in the URL file can be one of:
     *  "<IP><space>#<comments>"; "<IP>";
     *  "#<comments>"; Lines starting with a '#' are ignored and so
     *  are characters after a '<space>#' in a line.
     */
    private java.util.List<java.lang.String> _includeUrlList;

    /**
     * Flag for storing collected data by domain/ifAlias.
     *  Defaults to false. Allowable values are true, false.
     *  
     */
    private java.lang.String _storeByIfAlias;

    /**
     * Flag for storing collected data by nodeid/interface name.
     *  Defaults to normal. Allowable values are true, false,
     * normal.
     *  
     */
    private java.lang.String _storeByNodeID;

    /**
     * The name of the domain covered by this collection
     *  package. Defaults to package name.
     *  
     */
    private java.lang.String _ifAliasDomain;

    /**
     * Flag for controlling how interfaces are selected for
     *  data collection by domain/ifAlias. If true, storage will
     * occur for
     *  any interface on the node found to have an valid ifAlias.
     * Otherwise
     *  data will be stored only if the interface is configured for
     * data
     *  collection. Defaults to false.
     *  
     */
    private java.lang.String _storFlagOverride;

    /**
     * A character or string for terminating ifAlias text.
     *  In effect, any text beginning with this character or string
     * becomes
     *  a comment and is not considered part of the ifAlias when
     * naming
     *  storage files and displaying data. Defaults to null.
     *  
     */
    private java.lang.String _ifAliasComment;

    /**
     * Services for which data is to be collected in this
     *  package
     */
    private java.util.List<org.opennms.netmgt.config.collectd.Service> _serviceList;

    /**
     * Scheduled outages - data collection is not
     *  performed during scheduled outages
     */
    private java.util.List<java.lang.String> _outageCalendarList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Package() {
        super();
        this._specificList = new java.util.ArrayList<java.lang.String>();
        this._includeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.collectd.IncludeRange>();
        this._excludeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.collectd.ExcludeRange>();
        this._includeUrlList = new java.util.ArrayList<java.lang.String>();
        this._serviceList = new java.util.ArrayList<org.opennms.netmgt.config.collectd.Service>();
        this._outageCalendarList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExcludeRange(
            final org.opennms.netmgt.config.collectd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._excludeRangeList.add(vExcludeRange);
    }

    /**
     * 
     * 
     * @param index
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addExcludeRange(
            final int index,
            final org.opennms.netmgt.config.collectd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._excludeRangeList.add(index, vExcludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRange(
            final org.opennms.netmgt.config.collectd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRangeList.add(vIncludeRange);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRange(
            final int index,
            final org.opennms.netmgt.config.collectd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRangeList.add(index, vIncludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeUrl(
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        this._includeUrlList.add(vIncludeUrl);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeUrl(
            final int index,
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        this._includeUrlList.add(index, vIncludeUrl);
    }

    /**
     * 
     * 
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOutageCalendar(
            final java.lang.String vOutageCalendar)
    throws java.lang.IndexOutOfBoundsException {
        this._outageCalendarList.add(vOutageCalendar);
    }

    /**
     * 
     * 
     * @param index
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addOutageCalendar(
            final int index,
            final java.lang.String vOutageCalendar)
    throws java.lang.IndexOutOfBoundsException {
        this._outageCalendarList.add(index, vOutageCalendar);
    }

    /**
     * 
     * 
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final org.opennms.netmgt.config.collectd.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(vService);
    }

    /**
     * 
     * 
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final int index,
            final org.opennms.netmgt.config.collectd.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(index, vService);
    }

    /**
     * 
     * 
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSpecific(
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        this._specificList.add(vSpecific);
    }

    /**
     * 
     * 
     * @param index
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSpecific(
            final int index,
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        this._specificList.add(index, vSpecific);
    }

    /**
     * Method enumerateExcludeRange.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.collectd.ExcludeRange> enumerateExcludeRange(
    ) {
        return java.util.Collections.enumeration(this._excludeRangeList);
    }

    /**
     * Method enumerateIncludeRange.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.collectd.IncludeRange> enumerateIncludeRange(
    ) {
        return java.util.Collections.enumeration(this._includeRangeList);
    }

    /**
     * Method enumerateIncludeUrl.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateIncludeUrl(
    ) {
        return java.util.Collections.enumeration(this._includeUrlList);
    }

    /**
     * Method enumerateOutageCalendar.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateOutageCalendar(
    ) {
        return java.util.Collections.enumeration(this._outageCalendarList);
    }

    /**
     * Method enumerateService.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.collectd.Service> enumerateService(
    ) {
        return java.util.Collections.enumeration(this._serviceList);
    }

    /**
     * Method enumerateSpecific.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateSpecific(
    ) {
        return java.util.Collections.enumeration(this._specificList);
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
        
        if (obj instanceof Package) {
        
            Package temp = (Package)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._filter != null) {
                if (temp._filter == null) return false;
                else if (!(this._filter.equals(temp._filter))) 
                    return false;
            }
            else if (temp._filter != null)
                return false;
            if (this._specificList != null) {
                if (temp._specificList == null) return false;
                else if (!(this._specificList.equals(temp._specificList))) 
                    return false;
            }
            else if (temp._specificList != null)
                return false;
            if (this._includeRangeList != null) {
                if (temp._includeRangeList == null) return false;
                else if (!(this._includeRangeList.equals(temp._includeRangeList))) 
                    return false;
            }
            else if (temp._includeRangeList != null)
                return false;
            if (this._excludeRangeList != null) {
                if (temp._excludeRangeList == null) return false;
                else if (!(this._excludeRangeList.equals(temp._excludeRangeList))) 
                    return false;
            }
            else if (temp._excludeRangeList != null)
                return false;
            if (this._includeUrlList != null) {
                if (temp._includeUrlList == null) return false;
                else if (!(this._includeUrlList.equals(temp._includeUrlList))) 
                    return false;
            }
            else if (temp._includeUrlList != null)
                return false;
            if (this._storeByIfAlias != null) {
                if (temp._storeByIfAlias == null) return false;
                else if (!(this._storeByIfAlias.equals(temp._storeByIfAlias))) 
                    return false;
            }
            else if (temp._storeByIfAlias != null)
                return false;
            if (this._storeByNodeID != null) {
                if (temp._storeByNodeID == null) return false;
                else if (!(this._storeByNodeID.equals(temp._storeByNodeID))) 
                    return false;
            }
            else if (temp._storeByNodeID != null)
                return false;
            if (this._ifAliasDomain != null) {
                if (temp._ifAliasDomain == null) return false;
                else if (!(this._ifAliasDomain.equals(temp._ifAliasDomain))) 
                    return false;
            }
            else if (temp._ifAliasDomain != null)
                return false;
            if (this._storFlagOverride != null) {
                if (temp._storFlagOverride == null) return false;
                else if (!(this._storFlagOverride.equals(temp._storFlagOverride))) 
                    return false;
            }
            else if (temp._storFlagOverride != null)
                return false;
            if (this._ifAliasComment != null) {
                if (temp._ifAliasComment == null) return false;
                else if (!(this._ifAliasComment.equals(temp._ifAliasComment))) 
                    return false;
            }
            else if (temp._ifAliasComment != null)
                return false;
            if (this._serviceList != null) {
                if (temp._serviceList == null) return false;
                else if (!(this._serviceList.equals(temp._serviceList))) 
                    return false;
            }
            else if (temp._serviceList != null)
                return false;
            if (this._outageCalendarList != null) {
                if (temp._outageCalendarList == null) return false;
                else if (!(this._outageCalendarList.equals(temp._outageCalendarList))) 
                    return false;
            }
            else if (temp._outageCalendarList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getExcludeRange.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.collectd.ExcludeRange at the given
     * index
     */
    public org.opennms.netmgt.config.collectd.ExcludeRange getExcludeRange(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("getExcludeRange: Index value '" + index + "' not in range [0.." + (this._excludeRangeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.collectd.ExcludeRange) _excludeRangeList.get(index);
    }

    /**
     * Method getExcludeRange.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.collectd.ExcludeRange[] getExcludeRange(
    ) {
        org.opennms.netmgt.config.collectd.ExcludeRange[] array = new org.opennms.netmgt.config.collectd.ExcludeRange[0];
        return (org.opennms.netmgt.config.collectd.ExcludeRange[]) this._excludeRangeList.toArray(array);
    }

    /**
     * Method getExcludeRangeCollection.Returns a reference to
     * '_excludeRangeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.collectd.ExcludeRange> getExcludeRangeCollection(
    ) {
        return this._excludeRangeList;
    }

    /**
     * Method getExcludeRangeCount.
     * 
     * @return the size of this collection
     */
    public int getExcludeRangeCount(
    ) {
        return this._excludeRangeList.size();
    }

    /**
     * Returns the value of field 'filter'. The field 'filter' has
     * the following description: A rule which adresses belonging
     * to this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter.
     * 
     * @return the value of field 'Filter'.
     */
    public org.opennms.netmgt.config.collectd.Filter getFilter(
    ) {
        return this._filter;
    }

    /**
     * Returns the value of field 'ifAliasComment'. The field
     * 'ifAliasComment' has the following description: A character
     * or string for terminating ifAlias text.
     *  In effect, any text beginning with this character or string
     * becomes
     *  a comment and is not considered part of the ifAlias when
     * naming
     *  storage files and displaying data. Defaults to null.
     *  
     * 
     * @return the value of field 'IfAliasComment'.
     */
    public java.lang.String getIfAliasComment(
    ) {
        return this._ifAliasComment;
    }

    /**
     * Returns the value of field 'ifAliasDomain'. The field
     * 'ifAliasDomain' has the following description: The name of
     * the domain covered by this collection
     *  package. Defaults to package name.
     *  
     * 
     * @return the value of field 'IfAliasDomain'.
     */
    public java.lang.String getIfAliasDomain(
    ) {
        return this._ifAliasDomain;
    }

    /**
     * Method getIncludeRange.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.collectd.IncludeRange at the given
     * index
     */
    public org.opennms.netmgt.config.collectd.IncludeRange getIncludeRange(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRangeList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRange: Index value '" + index + "' not in range [0.." + (this._includeRangeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.collectd.IncludeRange) _includeRangeList.get(index);
    }

    /**
     * Method getIncludeRange.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.collectd.IncludeRange[] getIncludeRange(
    ) {
        org.opennms.netmgt.config.collectd.IncludeRange[] array = new org.opennms.netmgt.config.collectd.IncludeRange[0];
        return (org.opennms.netmgt.config.collectd.IncludeRange[]) this._includeRangeList.toArray(array);
    }

    /**
     * Method getIncludeRangeCollection.Returns a reference to
     * '_includeRangeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.collectd.IncludeRange> getIncludeRangeCollection(
    ) {
        return this._includeRangeList;
    }

    /**
     * Method getIncludeRangeCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeRangeCount(
    ) {
        return this._includeRangeList.size();
    }

    /**
     * Method getIncludeUrl.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getIncludeUrl(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeUrlList.size()) {
            throw new IndexOutOfBoundsException("getIncludeUrl: Index value '" + index + "' not in range [0.." + (this._includeUrlList.size() - 1) + "]");
        }
        
        return (java.lang.String) _includeUrlList.get(index);
    }

    /**
     * Method getIncludeUrl.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getIncludeUrl(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._includeUrlList.toArray(array);
    }

    /**
     * Method getIncludeUrlCollection.Returns a reference to
     * '_includeUrlList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getIncludeUrlCollection(
    ) {
        return this._includeUrlList;
    }

    /**
     * Method getIncludeUrlCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeUrlCount(
    ) {
        return this._includeUrlList.size();
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The name or identifier for this
     *  package
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getOutageCalendar.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getOutageCalendar(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._outageCalendarList.size()) {
            throw new IndexOutOfBoundsException("getOutageCalendar: Index value '" + index + "' not in range [0.." + (this._outageCalendarList.size() - 1) + "]");
        }
        
        return (java.lang.String) _outageCalendarList.get(index);
    }

    /**
     * Method getOutageCalendar.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getOutageCalendar(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._outageCalendarList.toArray(array);
    }

    /**
     * Method getOutageCalendarCollection.Returns a reference to
     * '_outageCalendarList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getOutageCalendarCollection(
    ) {
        return this._outageCalendarList;
    }

    /**
     * Method getOutageCalendarCount.
     * 
     * @return the size of this collection
     */
    public int getOutageCalendarCount(
    ) {
        return this._outageCalendarList.size();
    }

    /**
     * Method getService.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.collectd.Service at the given index
     */
    public org.opennms.netmgt.config.collectd.Service getService(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("getService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.collectd.Service) _serviceList.get(index);
    }

    /**
     * Method getService.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.collectd.Service[] getService(
    ) {
        org.opennms.netmgt.config.collectd.Service[] array = new org.opennms.netmgt.config.collectd.Service[0];
        return (org.opennms.netmgt.config.collectd.Service[]) this._serviceList.toArray(array);
    }

    /**
     * Method getServiceCollection.Returns a reference to
     * '_serviceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.collectd.Service> getServiceCollection(
    ) {
        return this._serviceList;
    }

    /**
     * Method getServiceCount.
     * 
     * @return the size of this collection
     */
    public int getServiceCount(
    ) {
        return this._serviceList.size();
    }

    /**
     * Method getSpecific.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getSpecific(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._specificList.size()) {
            throw new IndexOutOfBoundsException("getSpecific: Index value '" + index + "' not in range [0.." + (this._specificList.size() - 1) + "]");
        }
        
        return (java.lang.String) _specificList.get(index);
    }

    /**
     * Method getSpecific.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getSpecific(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._specificList.toArray(array);
    }

    /**
     * Method getSpecificCollection.Returns a reference to
     * '_specificList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getSpecificCollection(
    ) {
        return this._specificList;
    }

    /**
     * Method getSpecificCount.
     * 
     * @return the size of this collection
     */
    public int getSpecificCount(
    ) {
        return this._specificList.size();
    }

    /**
     * Returns the value of field 'storFlagOverride'. The field
     * 'storFlagOverride' has the following description: Flag for
     * controlling how interfaces are selected for
     *  data collection by domain/ifAlias. If true, storage will
     * occur for
     *  any interface on the node found to have an valid ifAlias.
     * Otherwise
     *  data will be stored only if the interface is configured for
     * data
     *  collection. Defaults to false.
     *  
     * 
     * @return the value of field 'StorFlagOverride'.
     */
    public java.lang.String getStorFlagOverride(
    ) {
        return this._storFlagOverride;
    }

    /**
     * Returns the value of field 'storeByIfAlias'. The field
     * 'storeByIfAlias' has the following description: Flag for
     * storing collected data by domain/ifAlias.
     *  Defaults to false. Allowable values are true, false.
     *  
     * 
     * @return the value of field 'StoreByIfAlias'.
     */
    public java.lang.String getStoreByIfAlias(
    ) {
        return this._storeByIfAlias;
    }

    /**
     * Returns the value of field 'storeByNodeID'. The field
     * 'storeByNodeID' has the following description: Flag for
     * storing collected data by nodeid/interface name.
     *  Defaults to normal. Allowable values are true, false,
     * normal.
     *  
     * 
     * @return the value of field 'StoreByNodeID'.
     */
    public java.lang.String getStoreByNodeID(
    ) {
        return this._storeByNodeID;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_filter != null) {
           result = 37 * result + _filter.hashCode();
        }
        if (_specificList != null) {
           result = 37 * result + _specificList.hashCode();
        }
        if (_includeRangeList != null) {
           result = 37 * result + _includeRangeList.hashCode();
        }
        if (_excludeRangeList != null) {
           result = 37 * result + _excludeRangeList.hashCode();
        }
        if (_includeUrlList != null) {
           result = 37 * result + _includeUrlList.hashCode();
        }
        if (_storeByIfAlias != null) {
           result = 37 * result + _storeByIfAlias.hashCode();
        }
        if (_storeByNodeID != null) {
           result = 37 * result + _storeByNodeID.hashCode();
        }
        if (_ifAliasDomain != null) {
           result = 37 * result + _ifAliasDomain.hashCode();
        }
        if (_storFlagOverride != null) {
           result = 37 * result + _storFlagOverride.hashCode();
        }
        if (_ifAliasComment != null) {
           result = 37 * result + _ifAliasComment.hashCode();
        }
        if (_serviceList != null) {
           result = 37 * result + _serviceList.hashCode();
        }
        if (_outageCalendarList != null) {
           result = 37 * result + _outageCalendarList.hashCode();
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
     * Method iterateExcludeRange.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.collectd.ExcludeRange> iterateExcludeRange(
    ) {
        return this._excludeRangeList.iterator();
    }

    /**
     * Method iterateIncludeRange.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.collectd.IncludeRange> iterateIncludeRange(
    ) {
        return this._includeRangeList.iterator();
    }

    /**
     * Method iterateIncludeUrl.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateIncludeUrl(
    ) {
        return this._includeUrlList.iterator();
    }

    /**
     * Method iterateOutageCalendar.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateOutageCalendar(
    ) {
        return this._outageCalendarList.iterator();
    }

    /**
     * Method iterateService.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.collectd.Service> iterateService(
    ) {
        return this._serviceList.iterator();
    }

    /**
     * Method iterateSpecific.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateSpecific(
    ) {
        return this._specificList.iterator();
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
    public void removeAllExcludeRange(
    ) {
        this._excludeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeRange(
    ) {
        this._includeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeUrl(
    ) {
        this._includeUrlList.clear();
    }

    /**
     */
    public void removeAllOutageCalendar(
    ) {
        this._outageCalendarList.clear();
    }

    /**
     */
    public void removeAllService(
    ) {
        this._serviceList.clear();
    }

    /**
     */
    public void removeAllSpecific(
    ) {
        this._specificList.clear();
    }

    /**
     * Method removeExcludeRange.
     * 
     * @param vExcludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeExcludeRange(
            final org.opennms.netmgt.config.collectd.ExcludeRange vExcludeRange) {
        boolean removed = _excludeRangeList.remove(vExcludeRange);
        return removed;
    }

    /**
     * Method removeExcludeRangeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.collectd.ExcludeRange removeExcludeRangeAt(
            final int index) {
        java.lang.Object obj = this._excludeRangeList.remove(index);
        return (org.opennms.netmgt.config.collectd.ExcludeRange) obj;
    }

    /**
     * Method removeIncludeRange.
     * 
     * @param vIncludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRange(
            final org.opennms.netmgt.config.collectd.IncludeRange vIncludeRange) {
        boolean removed = _includeRangeList.remove(vIncludeRange);
        return removed;
    }

    /**
     * Method removeIncludeRangeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.collectd.IncludeRange removeIncludeRangeAt(
            final int index) {
        java.lang.Object obj = this._includeRangeList.remove(index);
        return (org.opennms.netmgt.config.collectd.IncludeRange) obj;
    }

    /**
     * Method removeIncludeUrl.
     * 
     * @param vIncludeUrl
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeUrl(
            final java.lang.String vIncludeUrl) {
        boolean removed = _includeUrlList.remove(vIncludeUrl);
        return removed;
    }

    /**
     * Method removeIncludeUrlAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeIncludeUrlAt(
            final int index) {
        java.lang.Object obj = this._includeUrlList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeOutageCalendar.
     * 
     * @param vOutageCalendar
     * @return true if the object was removed from the collection.
     */
    public boolean removeOutageCalendar(
            final java.lang.String vOutageCalendar) {
        boolean removed = _outageCalendarList.remove(vOutageCalendar);
        return removed;
    }

    /**
     * Method removeOutageCalendarAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeOutageCalendarAt(
            final int index) {
        java.lang.Object obj = this._outageCalendarList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeService.
     * 
     * @param vService
     * @return true if the object was removed from the collection.
     */
    public boolean removeService(
            final org.opennms.netmgt.config.collectd.Service vService) {
        boolean removed = _serviceList.remove(vService);
        return removed;
    }

    /**
     * Method removeServiceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.collectd.Service removeServiceAt(
            final int index) {
        java.lang.Object obj = this._serviceList.remove(index);
        return (org.opennms.netmgt.config.collectd.Service) obj;
    }

    /**
     * Method removeSpecific.
     * 
     * @param vSpecific
     * @return true if the object was removed from the collection.
     */
    public boolean removeSpecific(
            final java.lang.String vSpecific) {
        boolean removed = _specificList.remove(vSpecific);
        return removed;
    }

    /**
     * Method removeSpecificAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeSpecificAt(
            final int index) {
        java.lang.Object obj = this._specificList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vExcludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setExcludeRange(
            final int index,
            final org.opennms.netmgt.config.collectd.ExcludeRange vExcludeRange)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("setExcludeRange: Index value '" + index + "' not in range [0.." + (this._excludeRangeList.size() - 1) + "]");
        }
        
        this._excludeRangeList.set(index, vExcludeRange);
    }

    /**
     * 
     * 
     * @param vExcludeRangeArray
     */
    public void setExcludeRange(
            final org.opennms.netmgt.config.collectd.ExcludeRange[] vExcludeRangeArray) {
        //-- copy array
        _excludeRangeList.clear();
        
        for (int i = 0; i < vExcludeRangeArray.length; i++) {
                this._excludeRangeList.add(vExcludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_excludeRangeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vExcludeRangeList the Vector to copy.
     */
    public void setExcludeRange(
            final java.util.List<org.opennms.netmgt.config.collectd.ExcludeRange> vExcludeRangeList) {
        // copy vector
        this._excludeRangeList.clear();
        
        this._excludeRangeList.addAll(vExcludeRangeList);
    }

    /**
     * Sets the value of '_excludeRangeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param excludeRangeList the Vector to set.
     */
    public void setExcludeRangeCollection(
            final java.util.List<org.opennms.netmgt.config.collectd.ExcludeRange> excludeRangeList) {
        this._excludeRangeList = excludeRangeList;
    }

    /**
     * Sets the value of field 'filter'. The field 'filter' has the
     * following description: A rule which adresses belonging to
     * this package
     *  must pass. This package is applied only to addresses that
     * pass
     *  this filter.
     * 
     * @param filter the value of field 'filter'.
     */
    public void setFilter(
            final org.opennms.netmgt.config.collectd.Filter filter) {
        this._filter = filter;
    }

    /**
     * Sets the value of field 'ifAliasComment'. The field
     * 'ifAliasComment' has the following description: A character
     * or string for terminating ifAlias text.
     *  In effect, any text beginning with this character or string
     * becomes
     *  a comment and is not considered part of the ifAlias when
     * naming
     *  storage files and displaying data. Defaults to null.
     *  
     * 
     * @param ifAliasComment the value of field 'ifAliasComment'.
     */
    public void setIfAliasComment(
            final java.lang.String ifAliasComment) {
        this._ifAliasComment = ifAliasComment;
    }

    /**
     * Sets the value of field 'ifAliasDomain'. The field
     * 'ifAliasDomain' has the following description: The name of
     * the domain covered by this collection
     *  package. Defaults to package name.
     *  
     * 
     * @param ifAliasDomain the value of field 'ifAliasDomain'.
     */
    public void setIfAliasDomain(
            final java.lang.String ifAliasDomain) {
        this._ifAliasDomain = ifAliasDomain;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRange
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeRange(
            final int index,
            final org.opennms.netmgt.config.collectd.IncludeRange vIncludeRange)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRangeList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRange: Index value '" + index + "' not in range [0.." + (this._includeRangeList.size() - 1) + "]");
        }
        
        this._includeRangeList.set(index, vIncludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeRangeArray
     */
    public void setIncludeRange(
            final org.opennms.netmgt.config.collectd.IncludeRange[] vIncludeRangeArray) {
        //-- copy array
        _includeRangeList.clear();
        
        for (int i = 0; i < vIncludeRangeArray.length; i++) {
                this._includeRangeList.add(vIncludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of '_includeRangeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vIncludeRangeList the Vector to copy.
     */
    public void setIncludeRange(
            final java.util.List<org.opennms.netmgt.config.collectd.IncludeRange> vIncludeRangeList) {
        // copy vector
        this._includeRangeList.clear();
        
        this._includeRangeList.addAll(vIncludeRangeList);
    }

    /**
     * Sets the value of '_includeRangeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param includeRangeList the Vector to set.
     */
    public void setIncludeRangeCollection(
            final java.util.List<org.opennms.netmgt.config.collectd.IncludeRange> includeRangeList) {
        this._includeRangeList = includeRangeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeUrl(
            final int index,
            final java.lang.String vIncludeUrl)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeUrlList.size()) {
            throw new IndexOutOfBoundsException("setIncludeUrl: Index value '" + index + "' not in range [0.." + (this._includeUrlList.size() - 1) + "]");
        }
        
        this._includeUrlList.set(index, vIncludeUrl);
    }

    /**
     * 
     * 
     * @param vIncludeUrlArray
     */
    public void setIncludeUrl(
            final java.lang.String[] vIncludeUrlArray) {
        //-- copy array
        _includeUrlList.clear();
        
        for (int i = 0; i < vIncludeUrlArray.length; i++) {
                this._includeUrlList.add(vIncludeUrlArray[i]);
        }
    }

    /**
     * Sets the value of '_includeUrlList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vIncludeUrlList the Vector to copy.
     */
    public void setIncludeUrl(
            final java.util.List<java.lang.String> vIncludeUrlList) {
        // copy vector
        this._includeUrlList.clear();
        
        this._includeUrlList.addAll(vIncludeUrlList);
    }

    /**
     * Sets the value of '_includeUrlList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param includeUrlList the Vector to set.
     */
    public void setIncludeUrlCollection(
            final java.util.List<java.lang.String> includeUrlList) {
        this._includeUrlList = includeUrlList;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The name or identifier for this
     *  package
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * 
     * 
     * @param index
     * @param vOutageCalendar
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setOutageCalendar(
            final int index,
            final java.lang.String vOutageCalendar)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._outageCalendarList.size()) {
            throw new IndexOutOfBoundsException("setOutageCalendar: Index value '" + index + "' not in range [0.." + (this._outageCalendarList.size() - 1) + "]");
        }
        
        this._outageCalendarList.set(index, vOutageCalendar);
    }

    /**
     * 
     * 
     * @param vOutageCalendarArray
     */
    public void setOutageCalendar(
            final java.lang.String[] vOutageCalendarArray) {
        //-- copy array
        _outageCalendarList.clear();
        
        for (int i = 0; i < vOutageCalendarArray.length; i++) {
                this._outageCalendarList.add(vOutageCalendarArray[i]);
        }
    }

    /**
     * Sets the value of '_outageCalendarList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vOutageCalendarList the Vector to copy.
     */
    public void setOutageCalendar(
            final java.util.List<java.lang.String> vOutageCalendarList) {
        // copy vector
        this._outageCalendarList.clear();
        
        this._outageCalendarList.addAll(vOutageCalendarList);
    }

    /**
     * Sets the value of '_outageCalendarList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param outageCalendarList the Vector to set.
     */
    public void setOutageCalendarCollection(
            final java.util.List<java.lang.String> outageCalendarList) {
        this._outageCalendarList = outageCalendarList;
    }

    /**
     * 
     * 
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setService(
            final int index,
            final org.opennms.netmgt.config.collectd.Service vService)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("setService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }
        
        this._serviceList.set(index, vService);
    }

    /**
     * 
     * 
     * @param vServiceArray
     */
    public void setService(
            final org.opennms.netmgt.config.collectd.Service[] vServiceArray) {
        //-- copy array
        _serviceList.clear();
        
        for (int i = 0; i < vServiceArray.length; i++) {
                this._serviceList.add(vServiceArray[i]);
        }
    }

    /**
     * Sets the value of '_serviceList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vServiceList the Vector to copy.
     */
    public void setService(
            final java.util.List<org.opennms.netmgt.config.collectd.Service> vServiceList) {
        // copy vector
        this._serviceList.clear();
        
        this._serviceList.addAll(vServiceList);
    }

    /**
     * Sets the value of '_serviceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param serviceList the Vector to set.
     */
    public void setServiceCollection(
            final java.util.List<org.opennms.netmgt.config.collectd.Service> serviceList) {
        this._serviceList = serviceList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSpecific
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSpecific(
            final int index,
            final java.lang.String vSpecific)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._specificList.size()) {
            throw new IndexOutOfBoundsException("setSpecific: Index value '" + index + "' not in range [0.." + (this._specificList.size() - 1) + "]");
        }
        
        this._specificList.set(index, vSpecific);
    }

    /**
     * 
     * 
     * @param vSpecificArray
     */
    public void setSpecific(
            final java.lang.String[] vSpecificArray) {
        //-- copy array
        _specificList.clear();
        
        for (int i = 0; i < vSpecificArray.length; i++) {
                this._specificList.add(vSpecificArray[i]);
        }
    }

    /**
     * Sets the value of '_specificList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSpecificList the Vector to copy.
     */
    public void setSpecific(
            final java.util.List<java.lang.String> vSpecificList) {
        // copy vector
        this._specificList.clear();
        
        this._specificList.addAll(vSpecificList);
    }

    /**
     * Sets the value of '_specificList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param specificList the Vector to set.
     */
    public void setSpecificCollection(
            final java.util.List<java.lang.String> specificList) {
        this._specificList = specificList;
    }

    /**
     * Sets the value of field 'storFlagOverride'. The field
     * 'storFlagOverride' has the following description: Flag for
     * controlling how interfaces are selected for
     *  data collection by domain/ifAlias. If true, storage will
     * occur for
     *  any interface on the node found to have an valid ifAlias.
     * Otherwise
     *  data will be stored only if the interface is configured for
     * data
     *  collection. Defaults to false.
     *  
     * 
     * @param storFlagOverride the value of field 'storFlagOverride'
     */
    public void setStorFlagOverride(
            final java.lang.String storFlagOverride) {
        this._storFlagOverride = storFlagOverride;
    }

    /**
     * Sets the value of field 'storeByIfAlias'. The field
     * 'storeByIfAlias' has the following description: Flag for
     * storing collected data by domain/ifAlias.
     *  Defaults to false. Allowable values are true, false.
     *  
     * 
     * @param storeByIfAlias the value of field 'storeByIfAlias'.
     */
    public void setStoreByIfAlias(
            final java.lang.String storeByIfAlias) {
        this._storeByIfAlias = storeByIfAlias;
    }

    /**
     * Sets the value of field 'storeByNodeID'. The field
     * 'storeByNodeID' has the following description: Flag for
     * storing collected data by nodeid/interface name.
     *  Defaults to normal. Allowable values are true, false,
     * normal.
     *  
     * 
     * @param storeByNodeID the value of field 'storeByNodeID'.
     */
    public void setStoreByNodeID(
            final java.lang.String storeByNodeID) {
        this._storeByNodeID = storeByNodeID;
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
     * org.opennms.netmgt.config.collectd.Package
     */
    public static org.opennms.netmgt.config.collectd.Package unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.collectd.Package) Unmarshaller.unmarshal(org.opennms.netmgt.config.collectd.Package.class, reader);
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

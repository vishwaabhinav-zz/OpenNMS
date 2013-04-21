/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.statsd.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class PackageReportStatusType.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class PackageReportStatusType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The on type
     */
    public static final int ON_TYPE = 0;

    /**
     * The instance of the on type
     */
    public static final PackageReportStatusType ON = new PackageReportStatusType(ON_TYPE, "on");

    /**
     * The off type
     */
    public static final int OFF_TYPE = 1;

    /**
     * The instance of the off type
     */
    public static final PackageReportStatusType OFF = new PackageReportStatusType(OFF_TYPE, "off");

    /**
     * Field _memberTable.
     */
    private static java.util.Hashtable<Object,Object> _memberTable = init();

    /**
     * Field type.
     */
    private final int type;

    /**
     * Field stringValue.
     */
    private java.lang.String stringValue = null;


      //----------------/
     //- Constructors -/
    //----------------/

    private PackageReportStatusType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of PackageReportStatusType
     * 
     * @return an Enumeration over all possible instances of
     * PackageReportStatusType
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * PackageReportStatusType
     * 
     * @return the type of this PackageReportStatusType
     */
    public int getType(
    ) {
        return this.type;
    }

    /**
     * Method init.
     * 
     * @return the initialized Hashtable for the member table
     */
    private static java.util.Hashtable<Object,Object> init(
    ) {
        Hashtable<Object, Object> members = new Hashtable<Object, Object>();
        members.put("on", ON);
        members.put("off", OFF);
        return members;
    }

    /**
     * Method readResolve. will be called during deserialization to
     * replace the deserialized object with the correct constant
     * instance.
     * 
     * @return this deserialized object
     */
    private java.lang.Object readResolve(
    ) {
        return valueOf(this.stringValue);
    }

    /**
     * Method toString.Returns the String representation of this
     * PackageReportStatusType
     * 
     * @return the String representation of this
     * PackageReportStatusType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new PackageReportStatusType based
     * on the given String value.
     * 
     * @param string
     * @return the PackageReportStatusType value of parameter
     * 'string'
     */
    public static org.opennms.netmgt.config.statsd.types.PackageReportStatusType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid PackageReportStatusType";
            throw new IllegalArgumentException(err);
        }
        return (PackageReportStatusType) obj;
    }

}

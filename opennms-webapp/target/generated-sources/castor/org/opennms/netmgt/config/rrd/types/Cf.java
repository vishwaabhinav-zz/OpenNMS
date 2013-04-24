/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rrd.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class Cf.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Cf implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The AVERAGE type
     */
    public static final int AVERAGE_TYPE = 0;

    /**
     * The instance of the AVERAGE type
     */
    public static final Cf AVERAGE = new Cf(AVERAGE_TYPE, "AVERAGE");

    /**
     * The MAX type
     */
    public static final int MAX_TYPE = 1;

    /**
     * The instance of the MAX type
     */
    public static final Cf MAX = new Cf(MAX_TYPE, "MAX");

    /**
     * The MIN type
     */
    public static final int MIN_TYPE = 2;

    /**
     * The instance of the MIN type
     */
    public static final Cf MIN = new Cf(MIN_TYPE, "MIN");

    /**
     * The LAST type
     */
    public static final int LAST_TYPE = 3;

    /**
     * The instance of the LAST type
     */
    public static final Cf LAST = new Cf(LAST_TYPE, "LAST");

    /**
     * The TOTAL type
     */
    public static final int TOTAL_TYPE = 4;

    /**
     * The instance of the TOTAL type
     */
    public static final Cf TOTAL = new Cf(TOTAL_TYPE, "TOTAL");

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

    private Cf(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of Cf
     * 
     * @return an Enumeration over all possible instances of Cf
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this Cf
     * 
     * @return the type of this Cf
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
        members.put("AVERAGE", AVERAGE);
        members.put("MAX", MAX);
        members.put("MIN", MIN);
        members.put("LAST", LAST);
        members.put("TOTAL", TOTAL);
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
     * Method toString.Returns the String representation of this Cf
     * 
     * @return the String representation of this Cf
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new Cf based on the given String
     * value.
     * 
     * @param string
     * @return the Cf value of parameter 'string'
     */
    public static org.opennms.netmgt.config.rrd.types.Cf valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid Cf";
            throw new IllegalArgumentException(err);
        }
        return (Cf) obj;
    }

}

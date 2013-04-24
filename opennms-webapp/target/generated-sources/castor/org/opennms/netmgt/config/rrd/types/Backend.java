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
 * Class Backend.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Backend implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The FILE type
     */
    public static final int FILE_TYPE = 0;

    /**
     * The instance of the FILE type
     */
    public static final Backend FILE = new Backend(FILE_TYPE, "FILE");

    /**
     * The NIO type
     */
    public static final int NIO_TYPE = 1;

    /**
     * The instance of the NIO type
     */
    public static final Backend NIO = new Backend(NIO_TYPE, "NIO");

    /**
     * The MEMORY type
     */
    public static final int MEMORY_TYPE = 2;

    /**
     * The instance of the MEMORY type
     */
    public static final Backend MEMORY = new Backend(MEMORY_TYPE, "MEMORY");

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

    private Backend(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of Backend
     * 
     * @return an Enumeration over all possible instances of Backend
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this Backend
     * 
     * @return the type of this Backend
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
        members.put("FILE", FILE);
        members.put("NIO", NIO);
        members.put("MEMORY", MEMORY);
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
     * Backend
     * 
     * @return the String representation of this Backend
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new Backend based on the given
     * String value.
     * 
     * @param string
     * @return the Backend value of parameter 'string'
     */
    public static org.opennms.netmgt.config.rrd.types.Backend valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid Backend";
            throw new IllegalArgumentException(err);
        }
        return (Backend) obj;
    }

}

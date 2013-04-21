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
 * Class FontStyle.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class FontStyle implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The PLAIN type
     */
    public static final int PLAIN_TYPE = 0;

    /**
     * The instance of the PLAIN type
     */
    public static final FontStyle PLAIN = new FontStyle(PLAIN_TYPE, "PLAIN");

    /**
     * The BOLD type
     */
    public static final int BOLD_TYPE = 1;

    /**
     * The instance of the BOLD type
     */
    public static final FontStyle BOLD = new FontStyle(BOLD_TYPE, "BOLD");

    /**
     * The ITALIC type
     */
    public static final int ITALIC_TYPE = 2;

    /**
     * The instance of the ITALIC type
     */
    public static final FontStyle ITALIC = new FontStyle(ITALIC_TYPE, "ITALIC");

    /**
     * The BOLD ITALIC type
     */
    public static final int BOLD_ITALIC_TYPE = 3;

    /**
     * The instance of the BOLD ITALIC type
     */
    public static final FontStyle BOLD_ITALIC = new FontStyle(BOLD_ITALIC_TYPE, "BOLD ITALIC");

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

    private FontStyle(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of FontStyle
     * 
     * @return an Enumeration over all possible instances of
     * FontStyle
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this FontStyle
     * 
     * @return the type of this FontStyle
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
        members.put("PLAIN", PLAIN);
        members.put("BOLD", BOLD);
        members.put("ITALIC", ITALIC);
        members.put("BOLD ITALIC", BOLD_ITALIC);
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
     * FontStyle
     * 
     * @return the String representation of this FontStyle
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new FontStyle based on the given
     * String value.
     * 
     * @param string
     * @return the FontStyle value of parameter 'string'
     */
    public static org.opennms.netmgt.config.rrd.types.FontStyle valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid FontStyle";
            throw new IllegalArgumentException(err);
        }
        return (FontStyle) obj;
    }

}

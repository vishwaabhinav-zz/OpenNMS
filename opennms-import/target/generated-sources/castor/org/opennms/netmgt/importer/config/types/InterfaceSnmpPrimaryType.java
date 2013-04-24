/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.importer.config.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class InterfaceSnmpPrimaryType.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class InterfaceSnmpPrimaryType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The P type
     */
    public static final int P_TYPE = 0;

    /**
     * The instance of the P type
     */
    public static final InterfaceSnmpPrimaryType P = new InterfaceSnmpPrimaryType(P_TYPE, "P");

    /**
     * The S type
     */
    public static final int S_TYPE = 1;

    /**
     * The instance of the S type
     */
    public static final InterfaceSnmpPrimaryType S = new InterfaceSnmpPrimaryType(S_TYPE, "S");

    /**
     * The C type
     */
    public static final int C_TYPE = 2;

    /**
     * The instance of the C type
     */
    public static final InterfaceSnmpPrimaryType C = new InterfaceSnmpPrimaryType(C_TYPE, "C");

    /**
     * The N type
     */
    public static final int N_TYPE = 3;

    /**
     * The instance of the N type
     */
    public static final InterfaceSnmpPrimaryType N = new InterfaceSnmpPrimaryType(N_TYPE, "N");

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

    private InterfaceSnmpPrimaryType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of InterfaceSnmpPrimaryType
     * 
     * @return an Enumeration over all possible instances of
     * InterfaceSnmpPrimaryType
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this
     * InterfaceSnmpPrimaryType
     * 
     * @return the type of this InterfaceSnmpPrimaryType
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
        members.put("P", P);
        members.put("S", S);
        members.put("C", C);
        members.put("N", N);
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
     * InterfaceSnmpPrimaryType
     * 
     * @return the String representation of this
     * InterfaceSnmpPrimaryType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new InterfaceSnmpPrimaryType based
     * on the given String value.
     * 
     * @param string
     * @return the InterfaceSnmpPrimaryType value of parameter
     * 'string'
     */
    public static org.opennms.netmgt.importer.config.types.InterfaceSnmpPrimaryType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid InterfaceSnmpPrimaryType";
            throw new IllegalArgumentException(err);
        }
        return (InterfaceSnmpPrimaryType) obj;
    }

}

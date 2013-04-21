/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.service.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class InvokeAtType.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class InvokeAtType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The start type
     */
    public static final int START_TYPE = 0;

    /**
     * The instance of the start type
     */
    public static final InvokeAtType START = new InvokeAtType(START_TYPE, "start");

    /**
     * The stop type
     */
    public static final int STOP_TYPE = 1;

    /**
     * The instance of the stop type
     */
    public static final InvokeAtType STOP = new InvokeAtType(STOP_TYPE, "stop");

    /**
     * The status type
     */
    public static final int STATUS_TYPE = 2;

    /**
     * The instance of the status type
     */
    public static final InvokeAtType STATUS = new InvokeAtType(STATUS_TYPE, "status");

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

    private InvokeAtType(final int type, final java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerate.Returns an enumeration of all possible
     * instances of InvokeAtType
     * 
     * @return an Enumeration over all possible instances of
     * InvokeAtType
     */
    public static java.util.Enumeration<java.lang.Object> enumerate(
    ) {
        return _memberTable.elements();
    }

    /**
     * Method getType.Returns the type of this InvokeAtType
     * 
     * @return the type of this InvokeAtType
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
        members.put("start", START);
        members.put("stop", STOP);
        members.put("status", STATUS);
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
     * InvokeAtType
     * 
     * @return the String representation of this InvokeAtType
     */
    public java.lang.String toString(
    ) {
        return this.stringValue;
    }

    /**
     * Method valueOf.Returns a new InvokeAtType based on the given
     * String value.
     * 
     * @param string
     * @return the InvokeAtType value of parameter 'string'
     */
    public static org.opennms.netmgt.config.service.types.InvokeAtType valueOf(
            final java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) {
            obj = _memberTable.get(string);
        }
        if (obj == null) {
            String err = "" + string + " is not a valid InvokeAtType";
            throw new IllegalArgumentException(err);
        }
        return (InvokeAtType) obj;
    }

}

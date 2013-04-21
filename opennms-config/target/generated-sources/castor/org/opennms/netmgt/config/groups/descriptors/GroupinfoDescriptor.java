/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.groups.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.opennms.netmgt.config.groups.Groupinfo;

/**
 * Class GroupinfoDescriptor.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all") public class GroupinfoDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public GroupinfoDescriptor() {
        super();
        _nsURI = "http://xmlns.opennms.org/xsd/groups";
        _xmlName = "groupinfo";
        _elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _header
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.netmgt.config.groups.Header.class, "_header", "header", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Groupinfo target = (Groupinfo) object;
                return target.getHeader();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Groupinfo target = (Groupinfo) object;
                    target.setHeader( (org.opennms.netmgt.config.groups.Header) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.netmgt.config.groups.Header();
            }
        };
        desc.setSchemaType("org.opennms.netmgt.config.groups.Header");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/groups");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _header
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _groups
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.netmgt.config.groups.Groups.class, "_groups", "groups", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Groupinfo target = (Groupinfo) object;
                return target.getGroups();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Groupinfo target = (Groupinfo) object;
                    target.setGroups( (org.opennms.netmgt.config.groups.Groups) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.netmgt.config.groups.Groups();
            }
        };
        desc.setSchemaType("org.opennms.netmgt.config.groups.Groups");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/groups");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _groups
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _roles
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.netmgt.config.groups.Roles.class, "_roles", "roles", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Groupinfo target = (Groupinfo) object;
                return target.getRoles();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Groupinfo target = (Groupinfo) object;
                    target.setRoles( (org.opennms.netmgt.config.groups.Roles) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.netmgt.config.groups.Roles();
            }
        };
        desc.setSchemaType("org.opennms.netmgt.config.groups.Roles");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/groups");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _roles
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public java.lang.Class<?> getJavaClass(
    ) {
        return org.opennms.netmgt.config.groups.Groupinfo.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}

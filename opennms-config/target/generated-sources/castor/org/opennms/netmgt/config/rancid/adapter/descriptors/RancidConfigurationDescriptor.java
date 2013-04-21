/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rancid.adapter.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.opennms.netmgt.config.rancid.adapter.RancidConfiguration;

/**
 * Class RancidConfigurationDescriptor.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all") public class RancidConfigurationDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public RancidConfigurationDescriptor() {
        super();
        _nsURI = "http://xmlns.opennms.org/xsd/config/rancid/adapter";
        _xmlName = "rancid-configuration";
        _elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- _delay
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Long.TYPE, "_delay", "delay", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RancidConfiguration target = (RancidConfiguration) object;
                if (!target.hasDelay()) { return null; }
                return new java.lang.Long(target.getDelay());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RancidConfiguration target = (RancidConfiguration) object;
                    // ignore null values for non optional primitives
                    if (value == null) { return; }
                    
                    target.setDelay( ((java.lang.Long) value).longValue());
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("long");
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _delay
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            org.exolab.castor.xml.validators.LongValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.LongValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-9223372036854775808L);
            typeValidator.setMaxInclusive(9223372036854775807L);
        }
        desc.setValidator(fieldValidator);
        //-- _retries
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_retries", "retries", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RancidConfiguration target = (RancidConfiguration) object;
                if (!target.hasRetries()) { return null; }
                return new java.lang.Integer(target.getRetries());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RancidConfiguration target = (RancidConfiguration) object;
                    // ignore null values for non optional primitives
                    if (value == null) { return; }
                    
                    target.setRetries( ((java.lang.Integer) value).intValue());
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("int");
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _retries
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _useCategories
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Boolean.TYPE, "_useCategories", "useCategories", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RancidConfiguration target = (RancidConfiguration) object;
                if (!target.hasUseCategories()) { return null; }
                return (target.getUseCategories() ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE);
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RancidConfiguration target = (RancidConfiguration) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteUseCategories();
                        return;
                    }
                    target.setUseCategories( ((java.lang.Boolean) value).booleanValue());
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("boolean");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _useCategories
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.BooleanValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.BooleanValidator();
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- _defaultType
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_defaultType", "default-type", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RancidConfiguration target = (RancidConfiguration) object;
                return target.getDefaultType();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RancidConfiguration target = (RancidConfiguration) object;
                    target.setDefaultType( (java.lang.String) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("string");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _defaultType
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors
        
        //-- _policies
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.netmgt.config.rancid.adapter.Policies.class, "_policies", "policies", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RancidConfiguration target = (RancidConfiguration) object;
                return target.getPolicies();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RancidConfiguration target = (RancidConfiguration) object;
                    target.setPolicies( (org.opennms.netmgt.config.rancid.adapter.Policies) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.netmgt.config.rancid.adapter.Policies();
            }
        };
        desc.setSchemaType("org.opennms.netmgt.config.rancid.adapter.Policies");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/config/rancid/adapter");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _policies
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _mappingList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.netmgt.config.rancid.adapter.Mapping.class, "_mappingList", "mapping", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RancidConfiguration target = (RancidConfiguration) object;
                return target.getMapping();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RancidConfiguration target = (RancidConfiguration) object;
                    target.addMapping( (org.opennms.netmgt.config.rancid.adapter.Mapping) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    RancidConfiguration target = (RancidConfiguration) object;
                    target.removeAllMapping();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.netmgt.config.rancid.adapter.Mapping();
            }
        };
        desc.setSchemaType("org.opennms.netmgt.config.rancid.adapter.Mapping");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/config/rancid/adapter");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _mappingList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
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
        return org.opennms.netmgt.config.rancid.adapter.RancidConfiguration.class;
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

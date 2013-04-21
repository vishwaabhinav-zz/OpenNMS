/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.importer.config.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.opennms.netmgt.importer.config.Node;

/**
 * Class NodeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all") public class NodeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public NodeDescriptor() {
        super();
        _nsURI = "http://xmlns.opennms.org/xsd/config/model-import";
        _xmlName = "node";
        _elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- _nodeLabel
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_nodeLabel", "node-label", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getNodeLabel();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.setNodeLabel( (java.lang.String) value);
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
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _nodeLabel
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.addPattern(".*");
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _foreignId
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_foreignId", "foreign-id", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getForeignId();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.setForeignId( (java.lang.String) value);
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
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _foreignId
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _parentForeignId
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_parentForeignId", "parent-foreign-id", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getParentForeignId();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.setParentForeignId( (java.lang.String) value);
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
        
        //-- validation code for: _parentForeignId
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _parentNodeLabel
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_parentNodeLabel", "parent-node-label", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getParentNodeLabel();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.setParentNodeLabel( (java.lang.String) value);
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
        
        //-- validation code for: _parentNodeLabel
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _city
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_city", "city", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getCity();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.setCity( (java.lang.String) value);
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
        
        //-- validation code for: _city
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _building
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_building", "building", org.exolab.castor.xml.NodeType.Attribute);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getBuilding();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.setBuilding( (java.lang.String) value);
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
        
        //-- validation code for: _building
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors
        
        //-- _interfaceList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.netmgt.importer.config.Interface.class, "_interfaceList", "interface", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getInterface();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.addInterface( (org.opennms.netmgt.importer.config.Interface) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Node target = (Node) object;
                    target.removeAllInterface();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.netmgt.importer.config.Interface();
            }
        };
        desc.setSchemaType("org.opennms.netmgt.importer.config.Interface");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/config/model-import");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _interfaceList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _categoryList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.netmgt.importer.config.Category.class, "_categoryList", "category", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getCategory();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.addCategory( (org.opennms.netmgt.importer.config.Category) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Node target = (Node) object;
                    target.removeAllCategory();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.netmgt.importer.config.Category();
            }
        };
        desc.setSchemaType("org.opennms.netmgt.importer.config.Category");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/config/model-import");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _categoryList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(0);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _assetList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.netmgt.importer.config.Asset.class, "_assetList", "asset", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Node target = (Node) object;
                return target.getAsset();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Node target = (Node) object;
                    target.addAsset( (org.opennms.netmgt.importer.config.Asset) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    Node target = (Node) object;
                    target.removeAllAsset();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.netmgt.importer.config.Asset();
            }
        };
        desc.setSchemaType("org.opennms.netmgt.importer.config.Asset");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/config/model-import");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _assetList
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
        return org.opennms.netmgt.importer.config.Node.class;
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

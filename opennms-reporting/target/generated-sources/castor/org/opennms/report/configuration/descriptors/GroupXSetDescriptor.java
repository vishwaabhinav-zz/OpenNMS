/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.configuration.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.opennms.report.configuration.GroupXSet;

/**
 * Class GroupXSetDescriptor.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all") public class GroupXSetDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public GroupXSetDescriptor() {
        super();
        _nsURI = "http://xmlns.opennms.org/xsd/report/configuration";
        _xmlName = "groupXSet";
        _elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _groupXSetName
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_groupXSetName", "groupXSetName", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GroupXSet target = (GroupXSet) object;
                return target.getGroupXSetName();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GroupXSet target = (GroupXSet) object;
                    target.setGroupXSetName( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/configuration");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _groupXSetName
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _totalNodes
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_totalNodes", "totalNodes", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GroupXSet target = (GroupXSet) object;
                if (!target.hasTotalNodes()) { return null; }
                return new java.lang.Integer(target.getTotalNodes());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GroupXSet target = (GroupXSet) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteTotalNodes();
                        return;
                    }
                    target.setTotalNodes( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/configuration");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _totalNodes
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _nodesMatching
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_nodesMatching", "nodesMatching", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GroupXSet target = (GroupXSet) object;
                if (!target.hasNodesMatching()) { return null; }
                return new java.lang.Integer(target.getNodesMatching());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GroupXSet target = (GroupXSet) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteNodesMatching();
                        return;
                    }
                    target.setNodesMatching( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/configuration");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _nodesMatching
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _nodesWithoutconfigurationAtAll
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_nodesWithoutconfigurationAtAll", "nodesWithoutconfigurationAtAll", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GroupXSet target = (GroupXSet) object;
                if (!target.hasNodesWithoutconfigurationAtAll()) { return null; }
                return new java.lang.Integer(target.getNodesWithoutconfigurationAtAll());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GroupXSet target = (GroupXSet) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteNodesWithoutconfigurationAtAll();
                        return;
                    }
                    target.setNodesWithoutconfigurationAtAll( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/configuration");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _nodesWithoutconfigurationAtAll
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _nodesWithoutconfigurationAtReportDate
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_nodesWithoutconfigurationAtReportDate", "nodesWithoutconfigurationAtReportDate", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GroupXSet target = (GroupXSet) object;
                if (!target.hasNodesWithoutconfigurationAtReportDate()) { return null; }
                return new java.lang.Integer(target.getNodesWithoutconfigurationAtReportDate());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GroupXSet target = (GroupXSet) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteNodesWithoutconfigurationAtReportDate();
                        return;
                    }
                    target.setNodesWithoutconfigurationAtReportDate( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/configuration");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _nodesWithoutconfigurationAtReportDate
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _nodeSetList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.report.configuration.NodeSet.class, "_nodeSetList", "nodeSet", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                GroupXSet target = (GroupXSet) object;
                return target.getNodeSet();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    GroupXSet target = (GroupXSet) object;
                    target.addNodeSet( (org.opennms.report.configuration.NodeSet) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    GroupXSet target = (GroupXSet) object;
                    target.removeAllNodeSet();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.report.configuration.NodeSet();
            }
        };
        desc.setSchemaType("org.opennms.report.configuration.NodeSet");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/configuration");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _nodeSetList
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
        return org.opennms.report.configuration.GroupXSet.class;
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

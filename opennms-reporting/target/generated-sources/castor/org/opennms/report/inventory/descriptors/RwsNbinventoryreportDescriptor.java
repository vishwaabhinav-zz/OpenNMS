/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.inventory.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.opennms.report.inventory.RwsNbinventoryreport;

/**
 * Class RwsNbinventoryreportDescriptor.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("all") public class RwsNbinventoryreportDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public RwsNbinventoryreportDescriptor() {
        super();
        _nsURI = "http://xmlns.opennms.org/xsd/report/inventory";
        _xmlName = "rws-nbinventoryreport";
        _elementDefinition = true;
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _totalGroups
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_totalGroups", "totalGroups", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                if (!target.hasTotalGroups()) { return null; }
                return new java.lang.Integer(target.getTotalGroups());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteTotalGroups();
                        return;
                    }
                    target.setTotalGroups( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _totalGroups
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _groupsMatching
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_groupsMatching", "groupsMatching", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                if (!target.hasGroupsMatching()) { return null; }
                return new java.lang.Integer(target.getGroupsMatching());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteGroupsMatching();
                        return;
                    }
                    target.setGroupsMatching( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _groupsMatching
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _groupWithoutNodes
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_groupWithoutNodes", "groupWithoutNodes", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                if (!target.hasGroupWithoutNodes()) { return null; }
                return new java.lang.Integer(target.getGroupWithoutNodes());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteGroupWithoutNodes();
                        return;
                    }
                    target.setGroupWithoutNodes( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _groupWithoutNodes
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _groupsWithNodesWithoutinventoryAtAll
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_groupsWithNodesWithoutinventoryAtAll", "groupsWithNodesWithoutinventoryAtAll", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                if (!target.hasGroupsWithNodesWithoutinventoryAtAll()) { return null; }
                return new java.lang.Integer(target.getGroupsWithNodesWithoutinventoryAtAll());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteGroupsWithNodesWithoutinventoryAtAll();
                        return;
                    }
                    target.setGroupsWithNodesWithoutinventoryAtAll( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _groupsWithNodesWithoutinventoryAtAll
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _groupsWithNodesWithoutinventoryAtReportDate
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Integer.TYPE, "_groupsWithNodesWithoutinventoryAtReportDate", "groupsWithNodesWithoutinventoryAtReportDate", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                if (!target.hasGroupsWithNodesWithoutinventoryAtReportDate()) { return null; }
                return new java.lang.Integer(target.getGroupsWithNodesWithoutinventoryAtReportDate());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteGroupsWithNodesWithoutinventoryAtReportDate();
                        return;
                    }
                    target.setGroupsWithNodesWithoutinventoryAtReportDate( ((java.lang.Integer) value).intValue());
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _groupsWithNodesWithoutinventoryAtReportDate
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.IntValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.IntValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(-2147483648);
            typeValidator.setMaxInclusive(2147483647);
        }
        desc.setValidator(fieldValidator);
        //-- _user
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_user", "user", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                return target.getUser();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    target.setUser( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _user
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _theField
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_theField", "theField", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                return target.getTheField();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    target.setTheField( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _theField
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _reportDate
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_reportDate", "reportDate", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                return target.getReportDate();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    target.setReportDate( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _reportDate
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _reportRequestDate
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_reportRequestDate", "reportRequestDate", org.exolab.castor.xml.NodeType.Element);
        desc.setImmutable(true);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                return target.getReportRequestDate();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    target.setReportRequestDate( (java.lang.String) value);
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
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _reportRequestDate
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.StringValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.StringValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setWhiteSpace("preserve");
        }
        desc.setValidator(fieldValidator);
        //-- _groupSetList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.opennms.report.inventory.GroupSet.class, "_groupSetList", "groupSet", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                return target.getGroupSet();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    target.addGroupSet( (org.opennms.report.inventory.GroupSet) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public void resetValue(Object object) throws IllegalStateException, IllegalArgumentException {
                try {
                    RwsNbinventoryreport target = (RwsNbinventoryreport) object;
                    target.removeAllGroupSet();
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.opennms.report.inventory.GroupSet();
            }
        };
        desc.setSchemaType("org.opennms.report.inventory.GroupSet");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://xmlns.opennms.org/xsd/report/inventory");
        desc.setMultivalued(true);
        addFieldDescriptor(desc);
        addSequenceElement(desc);
        
        //-- validation code for: _groupSetList
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
        return org.opennms.report.inventory.RwsNbinventoryreport.class;
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

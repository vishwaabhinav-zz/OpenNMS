/**
 * TicketServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opennms.integration.otrs.ticketservice;

public class TicketServiceSoapBindingStub extends org.apache.axis.client.Stub implements org.opennms.integration.otrs.ticketservice.TicketServicePort_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketGetByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Ticket"));
        oper.setReturnClass(org.opennms.integration.otrs.ticketservice.Ticket.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketGetByNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Ticket"));
        oper.setReturnClass(org.opennms.integration.otrs.ticketservice.Ticket.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketWithArticles"));
        oper.setReturnClass(org.opennms.integration.otrs.ticketservice.TicketWithArticles.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ticketWitArticles"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketWithArticles"));
        oper.setReturnClass(org.opennms.integration.otrs.ticketservice.TicketWithArticles.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ticketWitArticles"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticket"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketCore"), org.opennms.integration.otrs.ticketservice.TicketCore.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketIDAndNumber"));
        oper.setReturnClass(org.opennms.integration.otrs.ticketservice.TicketIDAndNumber.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ticketIDAndNumber"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketStateUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketStateUpdate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketStateUpdate"), org.opennms.integration.otrs.ticketservice.TicketStateUpdate.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArticleCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "article"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArticleCore"), org.opennms.integration.otrs.ticketservice.ArticleCore.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "articleID"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArticleGetByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "articleID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Article"));
        oper.setReturnClass(org.opennms.integration.otrs.ticketservice.Article.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "article"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArticleGetAllByTicketID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArrayOfArticle"));
        oper.setReturnClass(org.opennms.integration.otrs.ticketservice.Article[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "articles"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArticleGetAllByTicketNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "request_header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials"), org.opennms.integration.otrs.ticketservice.Credentials.class, true, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArrayOfArticle"));
        oper.setReturnClass(org.opennms.integration.otrs.ticketservice.Article[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "articles"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    public TicketServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TicketServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TicketServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArrayOfArticle");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.Article[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Article");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Article");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.Article.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArticleCore");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.ArticleCore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Credentials");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.Credentials.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "Ticket");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.Ticket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketCore");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.TicketCore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketIDAndNumber");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.TicketIDAndNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketStateUpdate");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.TicketStateUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketWithArticles");
            cachedSerQNames.add(qName);
            cls = org.opennms.integration.otrs.ticketservice.TicketWithArticles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.opennms.integration.otrs.ticketservice.Ticket ticketGetByID(int ticketID, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#TicketGetByID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketGetByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(ticketID), request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.opennms.integration.otrs.ticketservice.Ticket) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opennms.integration.otrs.ticketservice.Ticket) org.apache.axis.utils.JavaUtils.convert(_resp, org.opennms.integration.otrs.ticketservice.Ticket.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.opennms.integration.otrs.ticketservice.Ticket ticketGetByNumber(long ticketNumber, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#TicketGetByNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketGetByNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(ticketNumber), request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.opennms.integration.otrs.ticketservice.Ticket) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opennms.integration.otrs.ticketservice.Ticket) org.apache.axis.utils.JavaUtils.convert(_resp, org.opennms.integration.otrs.ticketservice.Ticket.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.opennms.integration.otrs.ticketservice.TicketWithArticles getById(long ticketNumber, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#GetById");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "GetById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(ticketNumber), request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.opennms.integration.otrs.ticketservice.TicketWithArticles) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opennms.integration.otrs.ticketservice.TicketWithArticles) org.apache.axis.utils.JavaUtils.convert(_resp, org.opennms.integration.otrs.ticketservice.TicketWithArticles.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.opennms.integration.otrs.ticketservice.TicketWithArticles getByNumber(long ticketNumber, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#GetByNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "GetByNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(ticketNumber), request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.opennms.integration.otrs.ticketservice.TicketWithArticles) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opennms.integration.otrs.ticketservice.TicketWithArticles) org.apache.axis.utils.JavaUtils.convert(_resp, org.opennms.integration.otrs.ticketservice.TicketWithArticles.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.opennms.integration.otrs.ticketservice.TicketIDAndNumber ticketCreate(org.opennms.integration.otrs.ticketservice.TicketCore ticket, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#TicketCreate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ticket, request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.opennms.integration.otrs.ticketservice.TicketIDAndNumber) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opennms.integration.otrs.ticketservice.TicketIDAndNumber) org.apache.axis.utils.JavaUtils.convert(_resp, org.opennms.integration.otrs.ticketservice.TicketIDAndNumber.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void ticketStateUpdate(org.opennms.integration.otrs.ticketservice.TicketStateUpdate ticketStateUpdate, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#TicketStateUpdate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "TicketStateUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {ticketStateUpdate, request_header});

    }

    public int articleCreate(org.opennms.integration.otrs.ticketservice.ArticleCore article, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#ArticleCreate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArticleCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {article, request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.opennms.integration.otrs.ticketservice.Article articleGetByID(int articleID, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#ArticleGetByID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArticleGetByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(articleID), request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.opennms.integration.otrs.ticketservice.Article) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opennms.integration.otrs.ticketservice.Article) org.apache.axis.utils.JavaUtils.convert(_resp, org.opennms.integration.otrs.ticketservice.Article.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.opennms.integration.otrs.ticketservice.Article[] articleGetAllByTicketID(int ticketID, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#ArticleGetAllByTicketID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArticleGetAllByTicketID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(ticketID), request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.opennms.integration.otrs.ticketservice.Article[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opennms.integration.otrs.ticketservice.Article[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.opennms.integration.otrs.ticketservice.Article[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.opennms.integration.otrs.ticketservice.Article[] articleGetAllByTicketNumber(long ticketNumber, org.opennms.integration.otrs.ticketservice.Credentials request_header) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://opennms.org/integration/otrs/ticketservice#ArticleGetAllByTicketNumber");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://opennms.org/integration/otrs/ticketservice", "ArticleGetAllByTicketNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(ticketNumber), request_header});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.opennms.integration.otrs.ticketservice.Article[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.opennms.integration.otrs.ticketservice.Article[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.opennms.integration.otrs.ticketservice.Article[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

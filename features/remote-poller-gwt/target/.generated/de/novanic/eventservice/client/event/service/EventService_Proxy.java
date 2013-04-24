package de.novanic.eventservice.client.event.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class EventService_Proxy extends RemoteServiceProxy implements de.novanic.eventservice.client.event.service.EventServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "de.novanic.eventservice.client.event.service.EventService";
  private static final String SERIALIZATION_POLICY ="E75B4FCB00BB6BF9025A1ED865E6C66C";
  private static final de.novanic.eventservice.client.event.service.EventService_TypeSerializer SERIALIZER = new de.novanic.eventservice.client.event.service.EventService_TypeSerializer();
  
  public EventService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void addEvent(de.novanic.eventservice.client.event.domain.Domain aDomain, de.novanic.eventservice.client.event.Event anEvent, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.addEvent", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("addEvent");
      streamWriter.writeInt(2);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeString("de.novanic.eventservice.client.event.Event");
      streamWriter.writeObject(aDomain);
      streamWriter.writeObject(anEvent);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.addEvent",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.addEvent", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void addEventUserSpecific(de.novanic.eventservice.client.event.Event anEvent, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.addEventUserSpecific", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("addEventUserSpecific");
      streamWriter.writeInt(1);
      streamWriter.writeString("de.novanic.eventservice.client.event.Event");
      streamWriter.writeObject(anEvent);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.addEventUserSpecific",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.addEventUserSpecific", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void deregisterEventFilter(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.deregisterEventFilter", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("deregisterEventFilter");
      streamWriter.writeInt(1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.deregisterEventFilter",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.deregisterEventFilter", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getActiveListenDomains(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.getActiveListenDomains", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getActiveListenDomains");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.getActiveListenDomains",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "EventService_Proxy.getActiveListenDomains", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void getEventFilter(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.getEventFilter", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getEventFilter");
      streamWriter.writeInt(1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.getEventFilter",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "EventService_Proxy.getEventFilter", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void initEventService(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.initEventService", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("initEventService");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.initEventService",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.initEventService", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void isUserRegistered(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.isUserRegistered", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("isUserRegistered");
      streamWriter.writeInt(1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.isUserRegistered",  "requestSerialized"));
      doInvoke(ResponseReader.BOOLEAN, "EventService_Proxy.isUserRegistered", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void listen(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.listen", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("listen");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.listen",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "EventService_Proxy.listen", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void register(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.register", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("register");
      streamWriter.writeInt(1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.register",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.register", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void register(de.novanic.eventservice.client.event.domain.Domain aDomain, de.novanic.eventservice.client.event.filter.EventFilter anEventFilter, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.register", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("register");
      streamWriter.writeInt(2);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeString("de.novanic.eventservice.client.event.filter.EventFilter");
      streamWriter.writeObject(aDomain);
      streamWriter.writeObject(anEventFilter);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.register",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.register", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void register(java.util.Set aDomains, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.register", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("register");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.Set");
      streamWriter.writeObject(aDomains);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.register",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.register", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void register(java.util.Set aDomains, de.novanic.eventservice.client.event.filter.EventFilter anEventFilter, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.register", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("register");
      streamWriter.writeInt(2);
      streamWriter.writeString("java.util.Set");
      streamWriter.writeString("de.novanic.eventservice.client.event.filter.EventFilter");
      streamWriter.writeObject(aDomains);
      streamWriter.writeObject(anEventFilter);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.register",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.register", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void registerEventFilter(de.novanic.eventservice.client.event.domain.Domain aDomain, de.novanic.eventservice.client.event.filter.EventFilter anEventFilter, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.registerEventFilter", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("registerEventFilter");
      streamWriter.writeInt(2);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeString("de.novanic.eventservice.client.event.filter.EventFilter");
      streamWriter.writeObject(aDomain);
      streamWriter.writeObject(anEventFilter);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.registerEventFilter",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.registerEventFilter", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void registerUnlistenEvent(de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener.Scope anUnlistenScope, de.novanic.eventservice.client.event.listener.unlisten.UnlistenEvent anUnlistenEvent, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.registerUnlistenEvent", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("registerUnlistenEvent");
      streamWriter.writeInt(2);
      streamWriter.writeString("de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener$Scope/4054018674");
      streamWriter.writeString("de.novanic.eventservice.client.event.listener.unlisten.UnlistenEvent");
      streamWriter.writeObject(anUnlistenScope);
      streamWriter.writeObject(anUnlistenEvent);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.registerUnlistenEvent",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.registerUnlistenEvent", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void unlisten(com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.unlisten", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("unlisten");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.unlisten",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.unlisten", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void unlisten(de.novanic.eventservice.client.event.domain.Domain aDomain, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.unlisten", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("unlisten");
      streamWriter.writeInt(1);
      streamWriter.writeString("de.novanic.eventservice.client.event.domain.Domain");
      streamWriter.writeObject(aDomain);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.unlisten",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.unlisten", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  
  public void unlisten(java.util.Set aDomains, com.google.gwt.user.client.rpc.AsyncCallback async) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.unlisten", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("unlisten");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.util.Set");
      streamWriter.writeObject(aDomains);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("EventService_Proxy.unlisten",  "requestSerialized"));
      doInvoke(ResponseReader.VOID, "EventService_Proxy.unlisten", statsContext, payload, async);
    } catch (SerializationException ex) {
      async.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}

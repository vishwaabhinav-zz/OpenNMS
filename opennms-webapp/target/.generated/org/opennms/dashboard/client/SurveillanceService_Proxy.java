package org.opennms.dashboard.client;

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

public class SurveillanceService_Proxy extends RemoteServiceProxy implements org.opennms.dashboard.client.SurveillanceServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.opennms.dashboard.client.SurveillanceService";
  private static final String SERIALIZATION_POLICY ="923817AFE1B364A0C7C44D9EB8FDDE25";
  private static final org.opennms.dashboard.client.SurveillanceService_TypeSerializer SERIALIZER = new org.opennms.dashboard.client.SurveillanceService_TypeSerializer();
  
  public SurveillanceService_Proxy() {
    super(GWT.getModuleBaseURL(),
      null, 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getAlarmsForSet(org.opennms.dashboard.client.SurveillanceSet set, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getAlarmsForSet", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAlarmsForSet");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.opennms.dashboard.client.SurveillanceSet/3355889218");
      streamWriter.writeObject(set);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getAlarmsForSet",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SurveillanceService_Proxy.getAlarmsForSet", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getChildResources(java.lang.String resourceId, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getChildResources", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getChildResources");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(resourceId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getChildResources",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SurveillanceService_Proxy.getChildResources", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getNodeNames(org.opennms.dashboard.client.SurveillanceSet set, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getNodeNames", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNodeNames");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.opennms.dashboard.client.SurveillanceSet/3355889218");
      streamWriter.writeObject(set);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getNodeNames",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SurveillanceService_Proxy.getNodeNames", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getNotificationsForSet(org.opennms.dashboard.client.SurveillanceSet set, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getNotificationsForSet", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getNotificationsForSet");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.opennms.dashboard.client.SurveillanceSet/3355889218");
      streamWriter.writeObject(set);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getNotificationsForSet",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SurveillanceService_Proxy.getNotificationsForSet", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getPrefabGraphs(java.lang.String resourceId, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getPrefabGraphs", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getPrefabGraphs");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(resourceId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getPrefabGraphs",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SurveillanceService_Proxy.getPrefabGraphs", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getResources(org.opennms.dashboard.client.SurveillanceSet set, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getResources", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getResources");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.opennms.dashboard.client.SurveillanceSet/3355889218");
      streamWriter.writeObject(set);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getResources",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SurveillanceService_Proxy.getResources", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getRtcForSet(org.opennms.dashboard.client.SurveillanceSet set, com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getRtcForSet", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getRtcForSet");
      streamWriter.writeInt(1);
      streamWriter.writeString("org.opennms.dashboard.client.SurveillanceSet/3355889218");
      streamWriter.writeObject(set);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getRtcForSet",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SurveillanceService_Proxy.getRtcForSet", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
    }
  }
  
  public void getSurveillanceData(com.google.gwt.user.client.rpc.AsyncCallback cb) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getSurveillanceData", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getSurveillanceData");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("SurveillanceService_Proxy.getSurveillanceData",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "SurveillanceService_Proxy.getSurveillanceData", statsContext, payload, cb);
    } catch (SerializationException ex) {
      cb.onFailure(ex);
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

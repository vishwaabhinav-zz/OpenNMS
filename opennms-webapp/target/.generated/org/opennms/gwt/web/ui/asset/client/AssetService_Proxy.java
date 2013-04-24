package org.opennms.gwt.web.ui.asset.client;

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

public class AssetService_Proxy extends RemoteServiceProxy implements org.opennms.gwt.web.ui.asset.client.AssetServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "org.opennms.gwt.web.ui.asset.client.AssetService";
  private static final String SERIALIZATION_POLICY ="89089F835346D353E80176BB4AED5A35";
  private static final org.opennms.gwt.web.ui.asset.client.AssetService_TypeSerializer SERIALIZER = new org.opennms.gwt.web.ui.asset.client.AssetService_TypeSerializer();
  
  public AssetService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "asset", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getAssetByNodeId(int nodeId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AssetService_Proxy.getAssetByNodeId", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAssetByNodeId");
      streamWriter.writeInt(1);
      streamWriter.writeString("I");
      streamWriter.writeInt(nodeId);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AssetService_Proxy.getAssetByNodeId",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AssetService_Proxy.getAssetByNodeId", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getAssetSuggestions(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AssetService_Proxy.getAssetSuggestions", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getAssetSuggestions");
      streamWriter.writeInt(0);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AssetService_Proxy.getAssetSuggestions",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AssetService_Proxy.getAssetSuggestions", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void saveOrUpdateAssetByNodeId(int nodeId, org.opennms.gwt.web.ui.asset.shared.AssetCommand asset, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    RpcStatsContext statsContext = new RpcStatsContext();
    boolean toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AssetService_Proxy.saveOrUpdateAssetByNodeId", "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      if (getRpcToken() != null) {
        streamWriter.writeObject(getRpcToken());
      }
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("saveOrUpdateAssetByNodeId");
      streamWriter.writeInt(2);
      streamWriter.writeString("I");
      streamWriter.writeString("org.opennms.gwt.web.ui.asset.shared.AssetCommand/2836854699");
      streamWriter.writeInt(nodeId);
      streamWriter.writeObject(asset);
      String payload = streamWriter.toString();
      toss = statsContext.isStatsAvailable() && statsContext.stats(statsContext.timeStat("AssetService_Proxy.saveOrUpdateAssetByNodeId",  "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "AssetService_Proxy.saveOrUpdateAssetByNodeId", statsContext, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
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

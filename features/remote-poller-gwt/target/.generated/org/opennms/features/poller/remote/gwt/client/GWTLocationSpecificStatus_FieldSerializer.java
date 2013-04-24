package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTLocationSpecificStatus_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getM_id(org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus::m_id;
  }-*/;
  
  private static native void setM_id(org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance, java.lang.Integer value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus::m_id = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor getM_locationMonitor(org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus::m_locationMonitor;
  }-*/;
  
  private static native void setM_locationMonitor(org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance, org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus::m_locationMonitor = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.GWTMonitoredService getM_monitoredService(org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus::m_monitoredService;
  }-*/;
  
  private static native void setM_monitoredService(org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance, org.opennms.features.poller.remote.gwt.client.GWTMonitoredService value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus::m_monitoredService = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.GWTPollResult getM_pollResult(org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus::m_pollResult;
  }-*/;
  
  private static native void setM_pollResult(org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance, org.opennms.features.poller.remote.gwt.client.GWTPollResult value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus::m_pollResult = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance) throws SerializationException {
    setM_id(instance, (java.lang.Integer) streamReader.readObject());
    setM_locationMonitor(instance, (org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor) streamReader.readObject());
    setM_monitoredService(instance, (org.opennms.features.poller.remote.gwt.client.GWTMonitoredService) streamReader.readObject());
    setM_pollResult(instance, (org.opennms.features.poller.remote.gwt.client.GWTPollResult) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus instance) throws SerializationException {
    streamWriter.writeObject(getM_id(instance));
    streamWriter.writeObject(getM_locationMonitor(instance));
    streamWriter.writeObject(getM_monitoredService(instance));
    streamWriter.writeObject(getM_pollResult(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus)object);
  }
  
}

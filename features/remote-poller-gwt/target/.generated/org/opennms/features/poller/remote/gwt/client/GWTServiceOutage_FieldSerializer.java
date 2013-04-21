package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTServiceOutage_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Date getM_from(org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTServiceOutage::m_from;
  }-*/;
  
  private static native void setM_from(org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTServiceOutage::m_from = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor getM_monitor(org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTServiceOutage::m_monitor;
  }-*/;
  
  private static native void setM_monitor(org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance, org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTServiceOutage::m_monitor = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.GWTMonitoredService getM_service(org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTServiceOutage::m_service;
  }-*/;
  
  private static native void setM_service(org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance, org.opennms.features.poller.remote.gwt.client.GWTMonitoredService value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTServiceOutage::m_service = value;
  }-*/;
  
  private static native java.util.Date getM_to(org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTServiceOutage::m_to;
  }-*/;
  
  private static native void setM_to(org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTServiceOutage::m_to = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance) throws SerializationException {
    setM_from(instance, (java.util.Date) streamReader.readObject());
    setM_monitor(instance, (org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor) streamReader.readObject());
    setM_service(instance, (org.opennms.features.poller.remote.gwt.client.GWTMonitoredService) streamReader.readObject());
    setM_to(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.GWTServiceOutage();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.GWTServiceOutage instance) throws SerializationException {
    streamWriter.writeObject(getM_from(instance));
    streamWriter.writeObject(getM_monitor(instance));
    streamWriter.writeObject(getM_service(instance));
    streamWriter.writeObject(getM_to(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.GWTServiceOutage_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTServiceOutage_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.GWTServiceOutage)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTServiceOutage_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.GWTServiceOutage)object);
  }
  
}

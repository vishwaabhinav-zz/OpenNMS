package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTMonitoredService_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Set getM_applications(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_applications;
  }-*/;
  
  private static native void setM_applications(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_applications = value;
  }-*/;
  
  private static native java.lang.String getM_hostname(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_hostname;
  }-*/;
  
  private static native void setM_hostname(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_hostname = value;
  }-*/;
  
  private static native int getM_id(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_id;
  }-*/;
  
  private static native void setM_id(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance, int value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_id = value;
  }-*/;
  
  private static native int getM_ifIndex(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_ifIndex;
  }-*/;
  
  private static native void setM_ifIndex(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance, int value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_ifIndex = value;
  }-*/;
  
  private static native java.lang.String getM_ipAddress(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_ipAddress;
  }-*/;
  
  private static native void setM_ipAddress(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_ipAddress = value;
  }-*/;
  
  private static native int getM_ipInterfaceId(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_ipInterfaceId;
  }-*/;
  
  private static native void setM_ipInterfaceId(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance, int value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_ipInterfaceId = value;
  }-*/;
  
  private static native int getM_nodeId(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_nodeId;
  }-*/;
  
  private static native void setM_nodeId(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance, int value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_nodeId = value;
  }-*/;
  
  private static native java.lang.String getM_serviceName(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_serviceName;
  }-*/;
  
  private static native void setM_serviceName(org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::m_serviceName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) throws SerializationException {
    setM_applications(instance, (java.util.Set) streamReader.readObject());
    setM_hostname(instance, streamReader.readString());
    setM_id(instance, streamReader.readInt());
    setM_ifIndex(instance, streamReader.readInt());
    setM_ipAddress(instance, streamReader.readString());
    setM_ipInterfaceId(instance, streamReader.readInt());
    setM_nodeId(instance, streamReader.readInt());
    setM_serviceName(instance, streamReader.readString());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.GWTMonitoredService();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.GWTMonitoredService instance) throws SerializationException {
    streamWriter.writeObject(getM_applications(instance));
    streamWriter.writeString(getM_hostname(instance));
    streamWriter.writeInt(getM_id(instance));
    streamWriter.writeInt(getM_ifIndex(instance));
    streamWriter.writeString(getM_ipAddress(instance));
    streamWriter.writeInt(getM_ipInterfaceId(instance));
    streamWriter.writeInt(getM_nodeId(instance));
    streamWriter.writeString(getM_serviceName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.GWTMonitoredService_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTMonitoredService_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.GWTMonitoredService)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTMonitoredService_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.GWTMonitoredService)object);
  }
  
}

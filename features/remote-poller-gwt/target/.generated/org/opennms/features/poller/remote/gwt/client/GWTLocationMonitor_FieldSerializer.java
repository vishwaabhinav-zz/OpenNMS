package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTLocationMonitor_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getM_definitionName(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_definitionName;
  }-*/;
  
  private static native void setM_definitionName(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_definitionName = value;
  }-*/;
  
  private static native java.lang.Integer getM_id(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_id;
  }-*/;
  
  private static native void setM_id(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance, java.lang.Integer value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_id = value;
  }-*/;
  
  private static native java.util.Date getM_lastCheckInTime(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_lastCheckInTime;
  }-*/;
  
  private static native void setM_lastCheckInTime(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_lastCheckInTime = value;
  }-*/;
  
  private static native java.lang.String getM_name(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_name;
  }-*/;
  
  private static native void setM_name(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_name = value;
  }-*/;
  
  private static native java.lang.String getM_status(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_status;
  }-*/;
  
  private static native void setM_status(org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor::m_status = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance) throws SerializationException {
    setM_definitionName(instance, streamReader.readString());
    setM_id(instance, (java.lang.Integer) streamReader.readObject());
    setM_lastCheckInTime(instance, (java.util.Date) streamReader.readObject());
    setM_name(instance, streamReader.readString());
    setM_status(instance, streamReader.readString());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor instance) throws SerializationException {
    streamWriter.writeString(getM_definitionName(instance));
    streamWriter.writeObject(getM_id(instance));
    streamWriter.writeObject(getM_lastCheckInTime(instance));
    streamWriter.writeString(getM_name(instance));
    streamWriter.writeString(getM_status(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.GWTLocationMonitor)object);
  }
  
}

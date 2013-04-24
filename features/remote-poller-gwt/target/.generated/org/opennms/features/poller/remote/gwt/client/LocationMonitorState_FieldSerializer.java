package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LocationMonitorState_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Collection getM_locationStatuses(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_locationStatuses;
  }-*/;
  
  private static native void setM_locationStatuses(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance, java.util.Collection value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_locationStatuses = value;
  }-*/;
  
  private static native java.util.Set getM_monitorsDisconnected(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_monitorsDisconnected;
  }-*/;
  
  private static native void setM_monitorsDisconnected(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_monitorsDisconnected = value;
  }-*/;
  
  private static native java.util.Set getM_monitorsStarted(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_monitorsStarted;
  }-*/;
  
  private static native void setM_monitorsStarted(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_monitorsStarted = value;
  }-*/;
  
  private static native java.util.Set getM_monitorsStopped(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_monitorsStopped;
  }-*/;
  
  private static native void setM_monitorsStopped(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_monitorsStopped = value;
  }-*/;
  
  private static native java.util.Set getM_serviceIds(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_serviceIds;
  }-*/;
  
  private static native void setM_serviceIds(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_serviceIds = value;
  }-*/;
  
  private static native java.util.Set getM_serviceNames(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_serviceNames;
  }-*/;
  
  private static native void setM_serviceNames(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_serviceNames = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.StatusDetails getM_statusDetails(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_statusDetails;
  }-*/;
  
  private static native void setM_statusDetails(org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance, org.opennms.features.poller.remote.gwt.client.StatusDetails value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.LocationMonitorState::m_statusDetails = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) throws SerializationException {
    setM_locationStatuses(instance, (java.util.Collection) streamReader.readObject());
    setM_monitorsDisconnected(instance, (java.util.Set) streamReader.readObject());
    setM_monitorsStarted(instance, (java.util.Set) streamReader.readObject());
    setM_monitorsStopped(instance, (java.util.Set) streamReader.readObject());
    setM_serviceIds(instance, (java.util.Set) streamReader.readObject());
    setM_serviceNames(instance, (java.util.Set) streamReader.readObject());
    setM_statusDetails(instance, (org.opennms.features.poller.remote.gwt.client.StatusDetails) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.LocationMonitorState instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.LocationMonitorState();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.LocationMonitorState instance) throws SerializationException {
    streamWriter.writeObject(getM_locationStatuses(instance));
    streamWriter.writeObject(getM_monitorsDisconnected(instance));
    streamWriter.writeObject(getM_monitorsStarted(instance));
    streamWriter.writeObject(getM_monitorsStopped(instance));
    streamWriter.writeObject(getM_serviceIds(instance));
    streamWriter.writeObject(getM_serviceNames(instance));
    streamWriter.writeObject(getM_statusDetails(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.LocationMonitorState_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.LocationMonitorState_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.LocationMonitorState)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.LocationMonitorState_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.LocationMonitorState)object);
  }
  
}

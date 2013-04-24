package org.opennms.features.poller.remote.gwt.client.remoteevents;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ApplicationUpdatedRemoteEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.opennms.features.poller.remote.gwt.client.ApplicationInfo getM_applicationInfo(org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent::m_applicationInfo;
  }-*/;
  
  private static native void setM_applicationInfo(org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent instance, org.opennms.features.poller.remote.gwt.client.ApplicationInfo value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent::m_applicationInfo = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent instance) throws SerializationException {
    setM_applicationInfo(instance, (org.opennms.features.poller.remote.gwt.client.ApplicationInfo) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent instance) throws SerializationException {
    streamWriter.writeObject(getM_applicationInfo(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent)object);
  }
  
}

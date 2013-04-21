package org.opennms.features.poller.remote.gwt.client.remoteevents;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ApplicationRemovedRemoteEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getM_applicationName(org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent::m_applicationName;
  }-*/;
  
  private static native void setM_applicationName(org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent::m_applicationName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent instance) throws SerializationException {
    setM_applicationName(instance, streamReader.readString());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent instance) throws SerializationException {
    streamWriter.writeString(getM_applicationName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent)object);
  }
  
}

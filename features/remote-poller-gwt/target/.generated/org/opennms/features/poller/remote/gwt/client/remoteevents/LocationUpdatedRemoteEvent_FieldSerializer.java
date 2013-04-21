package org.opennms.features.poller.remote.gwt.client.remoteevents;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LocationUpdatedRemoteEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.opennms.features.poller.remote.gwt.client.location.LocationInfo getM_locationInfo(org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent::m_locationInfo;
  }-*/;
  
  private static native void setM_locationInfo(org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent instance, org.opennms.features.poller.remote.gwt.client.location.LocationInfo value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent::m_locationInfo = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent instance) throws SerializationException {
    setM_locationInfo(instance, (org.opennms.features.poller.remote.gwt.client.location.LocationInfo) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent instance) throws SerializationException {
    streamWriter.writeObject(getM_locationInfo(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent)object);
  }
  
}

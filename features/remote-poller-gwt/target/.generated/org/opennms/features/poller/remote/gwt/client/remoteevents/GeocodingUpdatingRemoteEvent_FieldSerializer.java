package org.opennms.features.poller.remote.gwt.client.remoteevents;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GeocodingUpdatingRemoteEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getM_count(org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent::m_count;
  }-*/;
  
  private static native void setM_count(org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent instance, int value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent::m_count = value;
  }-*/;
  
  private static native int getM_size(org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent::m_size;
  }-*/;
  
  private static native void setM_size(org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent instance, int value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent::m_size = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent instance) throws SerializationException {
    setM_count(instance, streamReader.readInt());
    setM_size(instance, streamReader.readInt());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent instance) throws SerializationException {
    streamWriter.writeInt(getM_count(instance));
    streamWriter.writeInt(getM_size(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent)object);
  }
  
}

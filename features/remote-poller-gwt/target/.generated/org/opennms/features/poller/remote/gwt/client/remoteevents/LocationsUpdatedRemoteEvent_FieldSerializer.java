package org.opennms.features.poller.remote.gwt.client.remoteevents;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LocationsUpdatedRemoteEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Collection getM_locations(org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent::m_locations;
  }-*/;
  
  private static native void setM_locations(org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent instance, java.util.Collection value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent::m_locations = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent instance) throws SerializationException {
    setM_locations(instance, (java.util.Collection) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent instance) throws SerializationException {
    streamWriter.writeObject(getM_locations(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent)object);
  }
  
}

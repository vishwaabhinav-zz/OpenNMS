package org.opennms.features.poller.remote.gwt.client.location;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LocationDetails_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.opennms.features.poller.remote.gwt.client.ApplicationState getM_applicationState(org.opennms.features.poller.remote.gwt.client.location.LocationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationDetails::m_applicationState;
  }-*/;
  
  private static native void setM_applicationState(org.opennms.features.poller.remote.gwt.client.location.LocationDetails instance, org.opennms.features.poller.remote.gwt.client.ApplicationState value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationDetails::m_applicationState = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.LocationMonitorState getM_locationMonitorState(org.opennms.features.poller.remote.gwt.client.location.LocationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationDetails::m_locationMonitorState;
  }-*/;
  
  private static native void setM_locationMonitorState(org.opennms.features.poller.remote.gwt.client.location.LocationDetails instance, org.opennms.features.poller.remote.gwt.client.LocationMonitorState value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationDetails::m_locationMonitorState = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.location.LocationDetails instance) throws SerializationException {
    setM_applicationState(instance, (org.opennms.features.poller.remote.gwt.client.ApplicationState) streamReader.readObject());
    setM_locationMonitorState(instance, (org.opennms.features.poller.remote.gwt.client.LocationMonitorState) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.location.LocationDetails instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.location.LocationDetails();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.location.LocationDetails instance) throws SerializationException {
    streamWriter.writeObject(getM_applicationState(instance));
    streamWriter.writeObject(getM_locationMonitorState(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.location.LocationDetails_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.location.LocationDetails_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.location.LocationDetails)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.location.LocationDetails_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.location.LocationDetails)object);
  }
  
}

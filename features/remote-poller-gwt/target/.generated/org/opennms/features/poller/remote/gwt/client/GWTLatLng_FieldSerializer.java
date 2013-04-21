package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTLatLng_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Double getM_latitude(org.opennms.features.poller.remote.gwt.client.GWTLatLng instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLatLng::m_latitude;
  }-*/;
  
  private static native void setM_latitude(org.opennms.features.poller.remote.gwt.client.GWTLatLng instance, java.lang.Double value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLatLng::m_latitude = value;
  }-*/;
  
  private static native java.lang.Double getM_longitude(org.opennms.features.poller.remote.gwt.client.GWTLatLng instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTLatLng::m_longitude;
  }-*/;
  
  private static native void setM_longitude(org.opennms.features.poller.remote.gwt.client.GWTLatLng instance, java.lang.Double value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTLatLng::m_longitude = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.GWTLatLng instance) throws SerializationException {
    setM_latitude(instance, (java.lang.Double) streamReader.readObject());
    setM_longitude(instance, (java.lang.Double) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.GWTLatLng instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.GWTLatLng();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.GWTLatLng instance) throws SerializationException {
    streamWriter.writeObject(getM_latitude(instance));
    streamWriter.writeObject(getM_longitude(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.GWTLatLng_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTLatLng_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.GWTLatLng)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTLatLng_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.GWTLatLng)object);
  }
  
}

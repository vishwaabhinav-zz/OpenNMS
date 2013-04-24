package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTMarkerState_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getM_dirty(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_dirty;
  }-*/;
  
  private static native void setM_dirty(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance, boolean value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_dirty = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.GWTLatLng getM_latLng(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_latLng;
  }-*/;
  
  private static native void setM_latLng(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance, org.opennms.features.poller.remote.gwt.client.GWTLatLng value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_latLng = value;
  }-*/;
  
  private static native java.lang.String getM_name(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_name;
  }-*/;
  
  private static native void setM_name(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_name = value;
  }-*/;
  
  private static native boolean getM_selected(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_selected;
  }-*/;
  
  private static native void setM_selected(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance, boolean value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_selected = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.Status getM_status(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_status;
  }-*/;
  
  private static native void setM_status(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance, org.opennms.features.poller.remote.gwt.client.Status value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_status = value;
  }-*/;
  
  private static native boolean getM_visible(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_visible;
  }-*/;
  
  private static native void setM_visible(org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance, boolean value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::m_visible = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance) throws SerializationException {
    setM_dirty(instance, streamReader.readBoolean());
    setM_latLng(instance, (org.opennms.features.poller.remote.gwt.client.GWTLatLng) streamReader.readObject());
    setM_name(instance, streamReader.readString());
    setM_selected(instance, streamReader.readBoolean());
    setM_status(instance, (org.opennms.features.poller.remote.gwt.client.Status) streamReader.readObject());
    setM_visible(instance, streamReader.readBoolean());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.GWTMarkerState instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.GWTMarkerState();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.GWTMarkerState instance) throws SerializationException {
    streamWriter.writeBoolean(getM_dirty(instance));
    streamWriter.writeObject(getM_latLng(instance));
    streamWriter.writeString(getM_name(instance));
    streamWriter.writeBoolean(getM_selected(instance));
    streamWriter.writeObject(getM_status(instance));
    streamWriter.writeBoolean(getM_visible(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.GWTMarkerState_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTMarkerState_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.GWTMarkerState)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTMarkerState_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.GWTMarkerState)object);
  }
  
}

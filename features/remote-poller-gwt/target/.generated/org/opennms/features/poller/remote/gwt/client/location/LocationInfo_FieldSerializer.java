package org.opennms.features.poller.remote.gwt.client.location;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class LocationInfo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getM_area(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_area;
  }-*/;
  
  private static native void setM_area(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_area = value;
  }-*/;
  
  private static native java.lang.String getM_coordinates(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_coordinates;
  }-*/;
  
  private static native void setM_coordinates(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_coordinates = value;
  }-*/;
  
  private static native java.lang.String getM_geolocation(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_geolocation;
  }-*/;
  
  private static native void setM_geolocation(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_geolocation = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.GWTMarkerState getM_markerState(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_markerState;
  }-*/;
  
  private static native void setM_markerState(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance, org.opennms.features.poller.remote.gwt.client.GWTMarkerState value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_markerState = value;
  }-*/;
  
  private static native java.lang.String getM_name(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_name;
  }-*/;
  
  private static native void setM_name(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_name = value;
  }-*/;
  
  private static native java.lang.Long getM_priority(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_priority;
  }-*/;
  
  private static native void setM_priority(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance, java.lang.Long value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_priority = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.StatusDetails getM_statusDetails(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_statusDetails;
  }-*/;
  
  private static native void setM_statusDetails(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance, org.opennms.features.poller.remote.gwt.client.StatusDetails value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_statusDetails = value;
  }-*/;
  
  private static native java.util.Set getM_tags(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_tags;
  }-*/;
  
  private static native void setM_tags(org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::m_tags = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) throws SerializationException {
    setM_area(instance, streamReader.readString());
    setM_coordinates(instance, streamReader.readString());
    setM_geolocation(instance, streamReader.readString());
    setM_markerState(instance, (org.opennms.features.poller.remote.gwt.client.GWTMarkerState) streamReader.readObject());
    setM_name(instance, streamReader.readString());
    setM_priority(instance, (java.lang.Long) streamReader.readObject());
    setM_statusDetails(instance, (org.opennms.features.poller.remote.gwt.client.StatusDetails) streamReader.readObject());
    setM_tags(instance, (java.util.Set) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.location.LocationInfo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.location.LocationInfo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.location.LocationInfo instance) throws SerializationException {
    streamWriter.writeString(getM_area(instance));
    streamWriter.writeString(getM_coordinates(instance));
    streamWriter.writeString(getM_geolocation(instance));
    streamWriter.writeObject(getM_markerState(instance));
    streamWriter.writeString(getM_name(instance));
    streamWriter.writeObject(getM_priority(instance));
    streamWriter.writeObject(getM_statusDetails(instance));
    streamWriter.writeObject(getM_tags(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.location.LocationInfo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.location.LocationInfo_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.location.LocationInfo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.location.LocationInfo_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.location.LocationInfo)object);
  }
  
}

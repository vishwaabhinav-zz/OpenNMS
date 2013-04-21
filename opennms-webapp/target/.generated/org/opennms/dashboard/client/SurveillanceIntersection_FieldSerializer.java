package org.opennms.dashboard.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SurveillanceIntersection_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.opennms.dashboard.client.SurveillanceGroup getM_columnGroup(org.opennms.dashboard.client.SurveillanceIntersection instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceIntersection::m_columnGroup;
  }-*/;
  
  private static native void setM_columnGroup(org.opennms.dashboard.client.SurveillanceIntersection instance, org.opennms.dashboard.client.SurveillanceGroup value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceIntersection::m_columnGroup = value;
  }-*/;
  
  private static native java.lang.String getM_data(org.opennms.dashboard.client.SurveillanceIntersection instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceIntersection::m_data;
  }-*/;
  
  private static native void setM_data(org.opennms.dashboard.client.SurveillanceIntersection instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceIntersection::m_data = value;
  }-*/;
  
  private static native org.opennms.dashboard.client.SurveillanceGroup getM_rowGroup(org.opennms.dashboard.client.SurveillanceIntersection instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceIntersection::m_rowGroup;
  }-*/;
  
  private static native void setM_rowGroup(org.opennms.dashboard.client.SurveillanceIntersection instance, org.opennms.dashboard.client.SurveillanceGroup value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceIntersection::m_rowGroup = value;
  }-*/;
  
  private static native java.lang.String getM_status(org.opennms.dashboard.client.SurveillanceIntersection instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceIntersection::m_status;
  }-*/;
  
  private static native void setM_status(org.opennms.dashboard.client.SurveillanceIntersection instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceIntersection::m_status = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.dashboard.client.SurveillanceIntersection instance) throws SerializationException {
    setM_columnGroup(instance, (org.opennms.dashboard.client.SurveillanceGroup) streamReader.readObject());
    setM_data(instance, streamReader.readString());
    setM_rowGroup(instance, (org.opennms.dashboard.client.SurveillanceGroup) streamReader.readObject());
    setM_status(instance, streamReader.readString());
    
    org.opennms.dashboard.client.SurveillanceSet_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.opennms.dashboard.client.SurveillanceIntersection instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.dashboard.client.SurveillanceIntersection();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.dashboard.client.SurveillanceIntersection instance) throws SerializationException {
    streamWriter.writeObject(getM_columnGroup(instance));
    streamWriter.writeString(getM_data(instance));
    streamWriter.writeObject(getM_rowGroup(instance));
    streamWriter.writeString(getM_status(instance));
    
    org.opennms.dashboard.client.SurveillanceSet_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.dashboard.client.SurveillanceIntersection_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceIntersection_FieldSerializer.deserialize(reader, (org.opennms.dashboard.client.SurveillanceIntersection)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceIntersection_FieldSerializer.serialize(writer, (org.opennms.dashboard.client.SurveillanceIntersection)object);
  }
  
}

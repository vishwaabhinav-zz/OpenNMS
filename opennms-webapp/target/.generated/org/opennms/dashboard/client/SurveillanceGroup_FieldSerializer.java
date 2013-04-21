package org.opennms.dashboard.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SurveillanceGroup_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getM_column(org.opennms.dashboard.client.SurveillanceGroup instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceGroup::m_column;
  }-*/;
  
  private static native void setM_column(org.opennms.dashboard.client.SurveillanceGroup instance, boolean value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceGroup::m_column = value;
  }-*/;
  
  private static native java.lang.String getM_id(org.opennms.dashboard.client.SurveillanceGroup instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceGroup::m_id;
  }-*/;
  
  private static native void setM_id(org.opennms.dashboard.client.SurveillanceGroup instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceGroup::m_id = value;
  }-*/;
  
  private static native java.lang.String getM_label(org.opennms.dashboard.client.SurveillanceGroup instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceGroup::m_label;
  }-*/;
  
  private static native void setM_label(org.opennms.dashboard.client.SurveillanceGroup instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceGroup::m_label = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.dashboard.client.SurveillanceGroup instance) throws SerializationException {
    setM_column(instance, streamReader.readBoolean());
    setM_id(instance, streamReader.readString());
    setM_label(instance, streamReader.readString());
    
    org.opennms.dashboard.client.SurveillanceSet_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.opennms.dashboard.client.SurveillanceGroup instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.dashboard.client.SurveillanceGroup();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.dashboard.client.SurveillanceGroup instance) throws SerializationException {
    streamWriter.writeBoolean(getM_column(instance));
    streamWriter.writeString(getM_id(instance));
    streamWriter.writeString(getM_label(instance));
    
    org.opennms.dashboard.client.SurveillanceSet_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.dashboard.client.SurveillanceGroup_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceGroup_FieldSerializer.deserialize(reader, (org.opennms.dashboard.client.SurveillanceGroup)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceGroup_FieldSerializer.serialize(writer, (org.opennms.dashboard.client.SurveillanceGroup)object);
  }
  
}

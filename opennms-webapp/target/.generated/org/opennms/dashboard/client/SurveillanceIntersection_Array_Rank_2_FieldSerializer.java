package org.opennms.dashboard.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SurveillanceIntersection_Array_Rank_2_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.dashboard.client.SurveillanceIntersection[][] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.opennms.dashboard.client.SurveillanceIntersection[][] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new org.opennms.dashboard.client.SurveillanceIntersection[size][];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.dashboard.client.SurveillanceIntersection[][] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.dashboard.client.SurveillanceIntersection_Array_Rank_2_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceIntersection_Array_Rank_2_FieldSerializer.deserialize(reader, (org.opennms.dashboard.client.SurveillanceIntersection[][])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceIntersection_Array_Rank_2_FieldSerializer.serialize(writer, (org.opennms.dashboard.client.SurveillanceIntersection[][])object);
  }
  
}

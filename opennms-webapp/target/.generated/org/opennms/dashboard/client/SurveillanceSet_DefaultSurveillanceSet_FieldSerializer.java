package org.opennms.dashboard.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SurveillanceSet_DefaultSurveillanceSet_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.dashboard.client.SurveillanceSet.DefaultSurveillanceSet instance) throws SerializationException {
    
    org.opennms.dashboard.client.SurveillanceSet_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.opennms.dashboard.client.SurveillanceSet.DefaultSurveillanceSet instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.dashboard.client.SurveillanceSet.DefaultSurveillanceSet();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.dashboard.client.SurveillanceSet.DefaultSurveillanceSet instance) throws SerializationException {
    
    org.opennms.dashboard.client.SurveillanceSet_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.dashboard.client.SurveillanceSet_DefaultSurveillanceSet_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceSet_DefaultSurveillanceSet_FieldSerializer.deserialize(reader, (org.opennms.dashboard.client.SurveillanceSet.DefaultSurveillanceSet)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceSet_DefaultSurveillanceSet_FieldSerializer.serialize(writer, (org.opennms.dashboard.client.SurveillanceSet.DefaultSurveillanceSet)object);
  }
  
}

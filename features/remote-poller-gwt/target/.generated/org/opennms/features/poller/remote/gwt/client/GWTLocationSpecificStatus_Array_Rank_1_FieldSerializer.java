package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTLocationSpecificStatus_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus_Array_Rank_1_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus_Array_Rank_1_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.GWTLocationSpecificStatus[])object);
  }
  
}

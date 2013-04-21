package de.novanic.eventservice.client.event.filter;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class EventFilter_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, de.novanic.eventservice.client.event.filter.EventFilter[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static de.novanic.eventservice.client.event.filter.EventFilter[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new de.novanic.eventservice.client.event.filter.EventFilter[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.novanic.eventservice.client.event.filter.EventFilter[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.novanic.eventservice.client.event.filter.EventFilter_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.novanic.eventservice.client.event.filter.EventFilter_Array_Rank_1_FieldSerializer.deserialize(reader, (de.novanic.eventservice.client.event.filter.EventFilter[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.novanic.eventservice.client.event.filter.EventFilter_Array_Rank_1_FieldSerializer.serialize(writer, (de.novanic.eventservice.client.event.filter.EventFilter[])object);
  }
  
}

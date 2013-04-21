package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Status_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.Status instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.opennms.features.poller.remote.gwt.client.Status instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.opennms.features.poller.remote.gwt.client.Status[] values = org.opennms.features.poller.remote.gwt.client.Status.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.Status instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.Status_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.Status_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.Status)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.Status_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.Status)object);
  }
  
}

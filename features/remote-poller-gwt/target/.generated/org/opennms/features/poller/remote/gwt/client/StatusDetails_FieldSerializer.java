package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class StatusDetails_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getM_reason(org.opennms.features.poller.remote.gwt.client.StatusDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.StatusDetails::m_reason;
  }-*/;
  
  private static native void setM_reason(org.opennms.features.poller.remote.gwt.client.StatusDetails instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.StatusDetails::m_reason = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.Status getM_status(org.opennms.features.poller.remote.gwt.client.StatusDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.StatusDetails::m_status;
  }-*/;
  
  private static native void setM_status(org.opennms.features.poller.remote.gwt.client.StatusDetails instance, org.opennms.features.poller.remote.gwt.client.Status value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.StatusDetails::m_status = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.StatusDetails instance) throws SerializationException {
    setM_reason(instance, streamReader.readString());
    setM_status(instance, (org.opennms.features.poller.remote.gwt.client.Status) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.StatusDetails instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.StatusDetails();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.StatusDetails instance) throws SerializationException {
    streamWriter.writeString(getM_reason(instance));
    streamWriter.writeObject(getM_status(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.StatusDetails_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.StatusDetails_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.StatusDetails)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.StatusDetails_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.StatusDetails)object);
  }
  
}

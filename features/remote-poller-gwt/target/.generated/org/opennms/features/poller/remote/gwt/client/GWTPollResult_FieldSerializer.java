package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GWTPollResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getM_reason(org.opennms.features.poller.remote.gwt.client.GWTPollResult instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTPollResult::m_reason;
  }-*/;
  
  private static native void setM_reason(org.opennms.features.poller.remote.gwt.client.GWTPollResult instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTPollResult::m_reason = value;
  }-*/;
  
  private static native java.lang.Double getM_responseTime(org.opennms.features.poller.remote.gwt.client.GWTPollResult instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTPollResult::m_responseTime;
  }-*/;
  
  private static native void setM_responseTime(org.opennms.features.poller.remote.gwt.client.GWTPollResult instance, java.lang.Double value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTPollResult::m_responseTime = value;
  }-*/;
  
  private static native java.lang.String getM_status(org.opennms.features.poller.remote.gwt.client.GWTPollResult instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTPollResult::m_status;
  }-*/;
  
  private static native void setM_status(org.opennms.features.poller.remote.gwt.client.GWTPollResult instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTPollResult::m_status = value;
  }-*/;
  
  private static native java.util.Date getM_timestamp(org.opennms.features.poller.remote.gwt.client.GWTPollResult instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.GWTPollResult::m_timestamp;
  }-*/;
  
  private static native void setM_timestamp(org.opennms.features.poller.remote.gwt.client.GWTPollResult instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.GWTPollResult::m_timestamp = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.GWTPollResult instance) throws SerializationException {
    setM_reason(instance, streamReader.readString());
    setM_responseTime(instance, (java.lang.Double) streamReader.readObject());
    setM_status(instance, streamReader.readString());
    setM_timestamp(instance, (java.util.Date) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.GWTPollResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.GWTPollResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.GWTPollResult instance) throws SerializationException {
    streamWriter.writeString(getM_reason(instance));
    streamWriter.writeObject(getM_responseTime(instance));
    streamWriter.writeString(getM_status(instance));
    streamWriter.writeObject(getM_timestamp(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.GWTPollResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTPollResult_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.GWTPollResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.GWTPollResult_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.GWTPollResult)object);
  }
  
}

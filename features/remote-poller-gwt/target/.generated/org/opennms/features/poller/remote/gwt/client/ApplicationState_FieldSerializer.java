package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ApplicationState_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.opennms.features.poller.remote.gwt.client.StatusDetails getM_statusDetails(org.opennms.features.poller.remote.gwt.client.ApplicationState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationState::m_statusDetails;
  }-*/;
  
  private static native void setM_statusDetails(org.opennms.features.poller.remote.gwt.client.ApplicationState instance, org.opennms.features.poller.remote.gwt.client.StatusDetails value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationState::m_statusDetails = value;
  }-*/;
  
  private static native java.util.Map getM_statuses(org.opennms.features.poller.remote.gwt.client.ApplicationState instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationState::m_statuses;
  }-*/;
  
  private static native void setM_statuses(org.opennms.features.poller.remote.gwt.client.ApplicationState instance, java.util.Map value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationState::m_statuses = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.ApplicationState instance) throws SerializationException {
    setM_statusDetails(instance, (org.opennms.features.poller.remote.gwt.client.StatusDetails) streamReader.readObject());
    setM_statuses(instance, (java.util.Map) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.ApplicationState instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.ApplicationState();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.ApplicationState instance) throws SerializationException {
    streamWriter.writeObject(getM_statusDetails(instance));
    streamWriter.writeObject(getM_statuses(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.ApplicationState_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.ApplicationState_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.ApplicationState)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.ApplicationState_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.ApplicationState)object);
  }
  
}

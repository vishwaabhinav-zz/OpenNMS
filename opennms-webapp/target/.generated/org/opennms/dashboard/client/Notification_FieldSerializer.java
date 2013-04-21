package org.opennms.dashboard.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Notification_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getM_isDashboardRole(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_isDashboardRole;
  }-*/;
  
  private static native void setM_isDashboardRole(org.opennms.dashboard.client.Notification instance, boolean value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_isDashboardRole = value;
  }-*/;
  
  private static native java.lang.String getM_nodeId(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_nodeId;
  }-*/;
  
  private static native void setM_nodeId(org.opennms.dashboard.client.Notification instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_nodeId = value;
  }-*/;
  
  private static native java.lang.String getM_nodeLabel(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_nodeLabel;
  }-*/;
  
  private static native void setM_nodeLabel(org.opennms.dashboard.client.Notification instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_nodeLabel = value;
  }-*/;
  
  private static native java.util.Date getM_respondTime(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_respondTime;
  }-*/;
  
  private static native void setM_respondTime(org.opennms.dashboard.client.Notification instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_respondTime = value;
  }-*/;
  
  private static native java.lang.String getM_responder(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_responder;
  }-*/;
  
  private static native void setM_responder(org.opennms.dashboard.client.Notification instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_responder = value;
  }-*/;
  
  private static native java.util.Date getM_sentTime(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_sentTime;
  }-*/;
  
  private static native void setM_sentTime(org.opennms.dashboard.client.Notification instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_sentTime = value;
  }-*/;
  
  private static native java.lang.String getM_serviceName(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_serviceName;
  }-*/;
  
  private static native void setM_serviceName(org.opennms.dashboard.client.Notification instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_serviceName = value;
  }-*/;
  
  private static native java.lang.String getM_severity(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_severity;
  }-*/;
  
  private static native void setM_severity(org.opennms.dashboard.client.Notification instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_severity = value;
  }-*/;
  
  private static native java.lang.String getM_textMessage(org.opennms.dashboard.client.Notification instance) /*-{
    return instance.@org.opennms.dashboard.client.Notification::m_textMessage;
  }-*/;
  
  private static native void setM_textMessage(org.opennms.dashboard.client.Notification instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Notification::m_textMessage = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.dashboard.client.Notification instance) throws SerializationException {
    setM_isDashboardRole(instance, streamReader.readBoolean());
    setM_nodeId(instance, streamReader.readString());
    setM_nodeLabel(instance, streamReader.readString());
    setM_respondTime(instance, (java.util.Date) streamReader.readObject());
    setM_responder(instance, streamReader.readString());
    setM_sentTime(instance, (java.util.Date) streamReader.readObject());
    setM_serviceName(instance, streamReader.readString());
    setM_severity(instance, streamReader.readString());
    setM_textMessage(instance, streamReader.readString());
    
  }
  
  public static org.opennms.dashboard.client.Notification instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.dashboard.client.Notification();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.dashboard.client.Notification instance) throws SerializationException {
    streamWriter.writeBoolean(getM_isDashboardRole(instance));
    streamWriter.writeString(getM_nodeId(instance));
    streamWriter.writeString(getM_nodeLabel(instance));
    streamWriter.writeObject(getM_respondTime(instance));
    streamWriter.writeString(getM_responder(instance));
    streamWriter.writeObject(getM_sentTime(instance));
    streamWriter.writeString(getM_serviceName(instance));
    streamWriter.writeString(getM_severity(instance));
    streamWriter.writeString(getM_textMessage(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.dashboard.client.Notification_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.dashboard.client.Notification_FieldSerializer.deserialize(reader, (org.opennms.dashboard.client.Notification)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.dashboard.client.Notification_FieldSerializer.serialize(writer, (org.opennms.dashboard.client.Notification)object);
  }
  
}

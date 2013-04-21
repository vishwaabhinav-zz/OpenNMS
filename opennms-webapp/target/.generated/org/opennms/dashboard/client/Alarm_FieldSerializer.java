package org.opennms.dashboard.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Alarm_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getM_count(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_count;
  }-*/;
  
  private static native void setM_count(org.opennms.dashboard.client.Alarm instance, int value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_count = value;
  }-*/;
  
  private static native java.lang.String getM_descrption(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_descrption;
  }-*/;
  
  private static native void setM_descrption(org.opennms.dashboard.client.Alarm instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_descrption = value;
  }-*/;
  
  private static native java.util.Date getM_firstEventTime(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_firstEventTime;
  }-*/;
  
  private static native void setM_firstEventTime(org.opennms.dashboard.client.Alarm instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_firstEventTime = value;
  }-*/;
  
  private static native java.lang.String getM_ipAddress(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_ipAddress;
  }-*/;
  
  private static native void setM_ipAddress(org.opennms.dashboard.client.Alarm instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_ipAddress = value;
  }-*/;
  
  private static native boolean getM_isDashboardRole(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_isDashboardRole;
  }-*/;
  
  private static native void setM_isDashboardRole(org.opennms.dashboard.client.Alarm instance, boolean value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_isDashboardRole = value;
  }-*/;
  
  private static native java.util.Date getM_lastEventTime(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_lastEventTime;
  }-*/;
  
  private static native void setM_lastEventTime(org.opennms.dashboard.client.Alarm instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_lastEventTime = value;
  }-*/;
  
  private static native java.lang.String getM_logMsg(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_logMsg;
  }-*/;
  
  private static native void setM_logMsg(org.opennms.dashboard.client.Alarm instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_logMsg = value;
  }-*/;
  
  private static native int getM_nodeId(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_nodeId;
  }-*/;
  
  private static native void setM_nodeId(org.opennms.dashboard.client.Alarm instance, int value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_nodeId = value;
  }-*/;
  
  private static native java.lang.String getM_nodeLabel(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_nodeLabel;
  }-*/;
  
  private static native void setM_nodeLabel(org.opennms.dashboard.client.Alarm instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_nodeLabel = value;
  }-*/;
  
  private static native java.lang.String getM_severity(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_severity;
  }-*/;
  
  private static native void setM_severity(org.opennms.dashboard.client.Alarm instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_severity = value;
  }-*/;
  
  private static native java.lang.String getM_svcName(org.opennms.dashboard.client.Alarm instance) /*-{
    return instance.@org.opennms.dashboard.client.Alarm::m_svcName;
  }-*/;
  
  private static native void setM_svcName(org.opennms.dashboard.client.Alarm instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.Alarm::m_svcName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.dashboard.client.Alarm instance) throws SerializationException {
    setM_count(instance, streamReader.readInt());
    setM_descrption(instance, streamReader.readString());
    setM_firstEventTime(instance, (java.util.Date) streamReader.readObject());
    setM_ipAddress(instance, streamReader.readString());
    setM_isDashboardRole(instance, streamReader.readBoolean());
    setM_lastEventTime(instance, (java.util.Date) streamReader.readObject());
    setM_logMsg(instance, streamReader.readString());
    setM_nodeId(instance, streamReader.readInt());
    setM_nodeLabel(instance, streamReader.readString());
    setM_severity(instance, streamReader.readString());
    setM_svcName(instance, streamReader.readString());
    
  }
  
  public static org.opennms.dashboard.client.Alarm instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.dashboard.client.Alarm();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.dashboard.client.Alarm instance) throws SerializationException {
    streamWriter.writeInt(getM_count(instance));
    streamWriter.writeString(getM_descrption(instance));
    streamWriter.writeObject(getM_firstEventTime(instance));
    streamWriter.writeString(getM_ipAddress(instance));
    streamWriter.writeBoolean(getM_isDashboardRole(instance));
    streamWriter.writeObject(getM_lastEventTime(instance));
    streamWriter.writeString(getM_logMsg(instance));
    streamWriter.writeInt(getM_nodeId(instance));
    streamWriter.writeString(getM_nodeLabel(instance));
    streamWriter.writeString(getM_severity(instance));
    streamWriter.writeString(getM_svcName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.dashboard.client.Alarm_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.dashboard.client.Alarm_FieldSerializer.deserialize(reader, (org.opennms.dashboard.client.Alarm)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.dashboard.client.Alarm_FieldSerializer.serialize(writer, (org.opennms.dashboard.client.Alarm)object);
  }
  
}

package org.opennms.dashboard.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class NodeRtc_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getM_availability(org.opennms.dashboard.client.NodeRtc instance) /*-{
    return instance.@org.opennms.dashboard.client.NodeRtc::m_availability;
  }-*/;
  
  private static native void setM_availability(org.opennms.dashboard.client.NodeRtc instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.NodeRtc::m_availability = value;
  }-*/;
  
  private static native java.lang.String getM_availabilityStyle(org.opennms.dashboard.client.NodeRtc instance) /*-{
    return instance.@org.opennms.dashboard.client.NodeRtc::m_availabilityStyle;
  }-*/;
  
  private static native void setM_availabilityStyle(org.opennms.dashboard.client.NodeRtc instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.NodeRtc::m_availabilityStyle = value;
  }-*/;
  
  private static native int getM_downServiceCount(org.opennms.dashboard.client.NodeRtc instance) /*-{
    return instance.@org.opennms.dashboard.client.NodeRtc::m_downServiceCount;
  }-*/;
  
  private static native void setM_downServiceCount(org.opennms.dashboard.client.NodeRtc instance, int value) 
  /*-{
    instance.@org.opennms.dashboard.client.NodeRtc::m_downServiceCount = value;
  }-*/;
  
  private static native boolean getM_isDashboardRole(org.opennms.dashboard.client.NodeRtc instance) /*-{
    return instance.@org.opennms.dashboard.client.NodeRtc::m_isDashboardRole;
  }-*/;
  
  private static native void setM_isDashboardRole(org.opennms.dashboard.client.NodeRtc instance, boolean value) 
  /*-{
    instance.@org.opennms.dashboard.client.NodeRtc::m_isDashboardRole = value;
  }-*/;
  
  private static native java.lang.String getM_nodeId(org.opennms.dashboard.client.NodeRtc instance) /*-{
    return instance.@org.opennms.dashboard.client.NodeRtc::m_nodeId;
  }-*/;
  
  private static native void setM_nodeId(org.opennms.dashboard.client.NodeRtc instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.NodeRtc::m_nodeId = value;
  }-*/;
  
  private static native java.lang.String getM_nodeLabel(org.opennms.dashboard.client.NodeRtc instance) /*-{
    return instance.@org.opennms.dashboard.client.NodeRtc::m_nodeLabel;
  }-*/;
  
  private static native void setM_nodeLabel(org.opennms.dashboard.client.NodeRtc instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.NodeRtc::m_nodeLabel = value;
  }-*/;
  
  private static native int getM_serviceCount(org.opennms.dashboard.client.NodeRtc instance) /*-{
    return instance.@org.opennms.dashboard.client.NodeRtc::m_serviceCount;
  }-*/;
  
  private static native void setM_serviceCount(org.opennms.dashboard.client.NodeRtc instance, int value) 
  /*-{
    instance.@org.opennms.dashboard.client.NodeRtc::m_serviceCount = value;
  }-*/;
  
  private static native java.lang.String getM_serviceStyle(org.opennms.dashboard.client.NodeRtc instance) /*-{
    return instance.@org.opennms.dashboard.client.NodeRtc::m_serviceStyle;
  }-*/;
  
  private static native void setM_serviceStyle(org.opennms.dashboard.client.NodeRtc instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.NodeRtc::m_serviceStyle = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.dashboard.client.NodeRtc instance) throws SerializationException {
    setM_availability(instance, streamReader.readString());
    setM_availabilityStyle(instance, streamReader.readString());
    setM_downServiceCount(instance, streamReader.readInt());
    setM_isDashboardRole(instance, streamReader.readBoolean());
    setM_nodeId(instance, streamReader.readString());
    setM_nodeLabel(instance, streamReader.readString());
    setM_serviceCount(instance, streamReader.readInt());
    setM_serviceStyle(instance, streamReader.readString());
    
  }
  
  public static org.opennms.dashboard.client.NodeRtc instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.dashboard.client.NodeRtc();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.dashboard.client.NodeRtc instance) throws SerializationException {
    streamWriter.writeString(getM_availability(instance));
    streamWriter.writeString(getM_availabilityStyle(instance));
    streamWriter.writeInt(getM_downServiceCount(instance));
    streamWriter.writeBoolean(getM_isDashboardRole(instance));
    streamWriter.writeString(getM_nodeId(instance));
    streamWriter.writeString(getM_nodeLabel(instance));
    streamWriter.writeInt(getM_serviceCount(instance));
    streamWriter.writeString(getM_serviceStyle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.dashboard.client.NodeRtc_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.dashboard.client.NodeRtc_FieldSerializer.deserialize(reader, (org.opennms.dashboard.client.NodeRtc)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.dashboard.client.NodeRtc_FieldSerializer.serialize(writer, (org.opennms.dashboard.client.NodeRtc)object);
  }
  
}

package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ApplicationInfo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getM_id(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_id;
  }-*/;
  
  private static native void setM_id(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance, java.lang.Integer value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_id = value;
  }-*/;
  
  private static native java.util.Set getM_locations(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_locations;
  }-*/;
  
  private static native void setM_locations(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_locations = value;
  }-*/;
  
  private static native java.lang.String getM_name(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_name;
  }-*/;
  
  private static native void setM_name(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_name = value;
  }-*/;
  
  private static native java.lang.Long getM_priority(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_priority;
  }-*/;
  
  private static native void setM_priority(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance, java.lang.Long value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_priority = value;
  }-*/;
  
  private static native java.util.Set getM_services(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_services;
  }-*/;
  
  private static native void setM_services(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_services = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.StatusDetails getM_statusDetails(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_statusDetails;
  }-*/;
  
  private static native void setM_statusDetails(org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance, org.opennms.features.poller.remote.gwt.client.StatusDetails value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::m_statusDetails = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance) throws SerializationException {
    setM_id(instance, (java.lang.Integer) streamReader.readObject());
    setM_locations(instance, (java.util.Set) streamReader.readObject());
    setM_name(instance, streamReader.readString());
    setM_priority(instance, (java.lang.Long) streamReader.readObject());
    setM_services(instance, (java.util.Set) streamReader.readObject());
    setM_statusDetails(instance, (org.opennms.features.poller.remote.gwt.client.StatusDetails) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.ApplicationInfo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.ApplicationInfo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.ApplicationInfo instance) throws SerializationException {
    streamWriter.writeObject(getM_id(instance));
    streamWriter.writeObject(getM_locations(instance));
    streamWriter.writeString(getM_name(instance));
    streamWriter.writeObject(getM_priority(instance));
    streamWriter.writeObject(getM_services(instance));
    streamWriter.writeObject(getM_statusDetails(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.ApplicationInfo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.ApplicationInfo_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.ApplicationInfo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.ApplicationInfo_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.ApplicationInfo)object);
  }
  
}

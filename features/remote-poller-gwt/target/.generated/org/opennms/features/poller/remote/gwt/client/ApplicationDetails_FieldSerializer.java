package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ApplicationDetails_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.opennms.features.poller.remote.gwt.client.ApplicationInfo getM_application(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_application;
  }-*/;
  
  private static native void setM_application(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, org.opennms.features.poller.remote.gwt.client.ApplicationInfo value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_application = value;
  }-*/;
  
  private static native java.util.Date getM_endTime(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_endTime;
  }-*/;
  
  private static native void setM_endTime(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_endTime = value;
  }-*/;
  
  private static native java.util.List getM_locationSpecificStatuses(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_locationSpecificStatuses;
  }-*/;
  
  private static native void setM_locationSpecificStatuses(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, java.util.List value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_locationSpecificStatuses = value;
  }-*/;
  
  private static native java.util.Map getM_monitors(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_monitors;
  }-*/;
  
  private static native void setM_monitors(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, java.util.Map value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_monitors = value;
  }-*/;
  
  private static native java.lang.String getM_name(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_name;
  }-*/;
  
  private static native void setM_name(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_name = value;
  }-*/;
  
  private static native java.util.Map getM_outages(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_outages;
  }-*/;
  
  private static native void setM_outages(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, java.util.Map value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_outages = value;
  }-*/;
  
  private static native java.util.Map getM_services(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_services;
  }-*/;
  
  private static native void setM_services(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, java.util.Map value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_services = value;
  }-*/;
  
  private static native java.util.Date getM_startTime(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_startTime;
  }-*/;
  
  private static native void setM_startTime(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_startTime = value;
  }-*/;
  
  private static native org.opennms.features.poller.remote.gwt.client.StatusDetails getM_statusDetails(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) /*-{
    return instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_statusDetails;
  }-*/;
  
  private static native void setM_statusDetails(org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance, org.opennms.features.poller.remote.gwt.client.StatusDetails value) 
  /*-{
    instance.@org.opennms.features.poller.remote.gwt.client.ApplicationDetails::m_statusDetails = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) throws SerializationException {
    setM_application(instance, (org.opennms.features.poller.remote.gwt.client.ApplicationInfo) streamReader.readObject());
    setM_endTime(instance, (java.util.Date) streamReader.readObject());
    setM_locationSpecificStatuses(instance, (java.util.List) streamReader.readObject());
    setM_monitors(instance, (java.util.Map) streamReader.readObject());
    setM_name(instance, streamReader.readString());
    setM_outages(instance, (java.util.Map) streamReader.readObject());
    setM_services(instance, (java.util.Map) streamReader.readObject());
    setM_startTime(instance, (java.util.Date) streamReader.readObject());
    setM_statusDetails(instance, (org.opennms.features.poller.remote.gwt.client.StatusDetails) streamReader.readObject());
    
  }
  
  public static org.opennms.features.poller.remote.gwt.client.ApplicationDetails instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.features.poller.remote.gwt.client.ApplicationDetails();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.features.poller.remote.gwt.client.ApplicationDetails instance) throws SerializationException {
    streamWriter.writeObject(getM_application(instance));
    streamWriter.writeObject(getM_endTime(instance));
    streamWriter.writeObject(getM_locationSpecificStatuses(instance));
    streamWriter.writeObject(getM_monitors(instance));
    streamWriter.writeString(getM_name(instance));
    streamWriter.writeObject(getM_outages(instance));
    streamWriter.writeObject(getM_services(instance));
    streamWriter.writeObject(getM_startTime(instance));
    streamWriter.writeObject(getM_statusDetails(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.features.poller.remote.gwt.client.ApplicationDetails_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.ApplicationDetails_FieldSerializer.deserialize(reader, (org.opennms.features.poller.remote.gwt.client.ApplicationDetails)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.features.poller.remote.gwt.client.ApplicationDetails_FieldSerializer.serialize(writer, (org.opennms.features.poller.remote.gwt.client.ApplicationDetails)object);
  }
  
}

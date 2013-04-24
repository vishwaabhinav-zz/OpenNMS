package org.opennms.dashboard.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SurveillanceData_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.opennms.dashboard.client.SurveillanceIntersection[][] getM_cells(org.opennms.dashboard.client.SurveillanceData instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceData::m_cells;
  }-*/;
  
  private static native void setM_cells(org.opennms.dashboard.client.SurveillanceData instance, org.opennms.dashboard.client.SurveillanceIntersection[][] value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceData::m_cells = value;
  }-*/;
  
  private static native org.opennms.dashboard.client.SurveillanceGroup[] getM_columnGroups(org.opennms.dashboard.client.SurveillanceData instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceData::m_columnGroups;
  }-*/;
  
  private static native void setM_columnGroups(org.opennms.dashboard.client.SurveillanceData instance, org.opennms.dashboard.client.SurveillanceGroup[] value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceData::m_columnGroups = value;
  }-*/;
  
  private static native boolean getM_complete(org.opennms.dashboard.client.SurveillanceData instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceData::m_complete;
  }-*/;
  
  private static native void setM_complete(org.opennms.dashboard.client.SurveillanceData instance, boolean value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceData::m_complete = value;
  }-*/;
  
  private static native java.lang.String getM_name(org.opennms.dashboard.client.SurveillanceData instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceData::m_name;
  }-*/;
  
  private static native void setM_name(org.opennms.dashboard.client.SurveillanceData instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceData::m_name = value;
  }-*/;
  
  private static native org.opennms.dashboard.client.SurveillanceGroup[] getM_rowGroups(org.opennms.dashboard.client.SurveillanceData instance) /*-{
    return instance.@org.opennms.dashboard.client.SurveillanceData::m_rowGroups;
  }-*/;
  
  private static native void setM_rowGroups(org.opennms.dashboard.client.SurveillanceData instance, org.opennms.dashboard.client.SurveillanceGroup[] value) 
  /*-{
    instance.@org.opennms.dashboard.client.SurveillanceData::m_rowGroups = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.dashboard.client.SurveillanceData instance) throws SerializationException {
    setM_cells(instance, (org.opennms.dashboard.client.SurveillanceIntersection[][]) streamReader.readObject());
    setM_columnGroups(instance, (org.opennms.dashboard.client.SurveillanceGroup[]) streamReader.readObject());
    setM_complete(instance, streamReader.readBoolean());
    setM_name(instance, streamReader.readString());
    setM_rowGroups(instance, (org.opennms.dashboard.client.SurveillanceGroup[]) streamReader.readObject());
    
  }
  
  public static org.opennms.dashboard.client.SurveillanceData instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.dashboard.client.SurveillanceData();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.dashboard.client.SurveillanceData instance) throws SerializationException {
    streamWriter.writeObject(getM_cells(instance));
    streamWriter.writeObject(getM_columnGroups(instance));
    streamWriter.writeBoolean(getM_complete(instance));
    streamWriter.writeString(getM_name(instance));
    streamWriter.writeObject(getM_rowGroups(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.dashboard.client.SurveillanceData_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceData_FieldSerializer.deserialize(reader, (org.opennms.dashboard.client.SurveillanceData)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.dashboard.client.SurveillanceData_FieldSerializer.serialize(writer, (org.opennms.dashboard.client.SurveillanceData)object);
  }
  
}

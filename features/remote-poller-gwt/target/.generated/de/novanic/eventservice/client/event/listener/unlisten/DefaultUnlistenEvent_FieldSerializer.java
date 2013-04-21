package de.novanic.eventservice.client.event.listener.unlisten;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DefaultUnlistenEvent_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getIsLocal(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) /*-{
    return instance.@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::isLocal;
  }-*/;
  
  private static native void setIsLocal(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance, boolean value) 
  /*-{
    instance.@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::isLocal = value;
  }-*/;
  
  private static native boolean getIsTimeout(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) /*-{
    return instance.@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::isTimeout;
  }-*/;
  
  private static native void setIsTimeout(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance, boolean value) 
  /*-{
    instance.@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::isTimeout = value;
  }-*/;
  
  private static native java.util.Set getMyDomains(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) /*-{
    return instance.@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::myDomains;
  }-*/;
  
  private static native void setMyDomains(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance, java.util.Set value) 
  /*-{
    instance.@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::myDomains = value;
  }-*/;
  
  private static native java.lang.String getMyUserId(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) /*-{
    return instance.@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::myUserId;
  }-*/;
  
  private static native void setMyUserId(de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance, java.lang.String value) 
  /*-{
    instance.@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::myUserId = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) throws SerializationException {
    setIsLocal(instance, streamReader.readBoolean());
    setIsTimeout(instance, streamReader.readBoolean());
    setMyDomains(instance, (java.util.Set) streamReader.readObject());
    setMyUserId(instance, streamReader.readString());
    
  }
  
  public static de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent instance) throws SerializationException {
    streamWriter.writeBoolean(getIsLocal(instance));
    streamWriter.writeBoolean(getIsTimeout(instance));
    streamWriter.writeObject(getMyDomains(instance));
    streamWriter.writeString(getMyUserId(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer.deserialize(reader, (de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer.serialize(writer, (de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent)object);
  }
  
}

package de.novanic.eventservice.client.event.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class EventService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["de.novanic.eventservice.client.event.DefaultDomainEvent/3924906731"] = [
        @de.novanic.eventservice.client.event.DefaultDomainEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.DefaultDomainEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lde/novanic/eventservice/client/event/DefaultDomainEvent;),
      ];
    
    result["[Lde.novanic.eventservice.client.event.DefaultDomainEvent;/4107875583"] = [
        @de.novanic.eventservice.client.event.DefaultDomainEvent_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.DefaultDomainEvent_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lde/novanic/eventservice/client/event/DefaultDomainEvent;),
      ];
    
    result["[Lde.novanic.eventservice.client.event.DomainEvent;/2573218216"] = [
        @de.novanic.eventservice.client.event.DomainEvent_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.DomainEvent_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lde/novanic/eventservice/client/event/DomainEvent;),
      ];
    
    result["de.novanic.eventservice.client.event.domain.DefaultDomain/240262385"] = [
        @de.novanic.eventservice.client.event.domain.DefaultDomain_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.domain.DefaultDomain_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lde/novanic/eventservice/client/event/domain/DefaultDomain;),
        @de.novanic.eventservice.client.event.domain.DefaultDomain_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lde/novanic/eventservice/client/event/domain/DefaultDomain;)
      ];
    
    result["[Lde.novanic.eventservice.client.event.filter.AppendableEventFilter;/3140808580"] = [
        @de.novanic.eventservice.client.event.filter.AppendableEventFilter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.filter.AppendableEventFilter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lde/novanic/eventservice/client/event/filter/AppendableEventFilter;),
        @de.novanic.eventservice.client.event.filter.AppendableEventFilter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lde/novanic/eventservice/client/event/filter/AppendableEventFilter;)
      ];
    
    result["[Lde.novanic.eventservice.client.event.filter.CascadingEventFilter;/4218008474"] = [
        @de.novanic.eventservice.client.event.filter.CascadingEventFilter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.filter.CascadingEventFilter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lde/novanic/eventservice/client/event/filter/CascadingEventFilter;),
        @de.novanic.eventservice.client.event.filter.CascadingEventFilter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lde/novanic/eventservice/client/event/filter/CascadingEventFilter;)
      ];
    
    result["[Lde.novanic.eventservice.client.event.filter.CompositeEventFilter;/3667622880"] = [
        @de.novanic.eventservice.client.event.filter.CompositeEventFilter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.filter.CompositeEventFilter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lde/novanic/eventservice/client/event/filter/CompositeEventFilter;),
        @de.novanic.eventservice.client.event.filter.CompositeEventFilter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lde/novanic/eventservice/client/event/filter/CompositeEventFilter;)
      ];
    
    result["de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter/2036315829"] = [
        @de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lde/novanic/eventservice/client/event/filter/DefaultCompositeEventFilter;),
        @de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lde/novanic/eventservice/client/event/filter/DefaultCompositeEventFilter;)
      ];
    
    result["[Lde.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter;/2853401946"] = [
        @de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lde/novanic/eventservice/client/event/filter/DefaultCompositeEventFilter;),
        @de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lde/novanic/eventservice/client/event/filter/DefaultCompositeEventFilter;)
      ];
    
    result["de.novanic.eventservice.client.event.filter.DefaultEventFilter/3359357329"] = [
        @de.novanic.eventservice.client.event.filter.DefaultEventFilter_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.filter.DefaultEventFilter_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lde/novanic/eventservice/client/event/filter/DefaultEventFilter;),
        @de.novanic.eventservice.client.event.filter.DefaultEventFilter_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lde/novanic/eventservice/client/event/filter/DefaultEventFilter;)
      ];
    
    result["[Lde.novanic.eventservice.client.event.filter.DefaultEventFilter;/2136978271"] = [
        @de.novanic.eventservice.client.event.filter.DefaultEventFilter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.filter.DefaultEventFilter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lde/novanic/eventservice/client/event/filter/DefaultEventFilter;),
        @de.novanic.eventservice.client.event.filter.DefaultEventFilter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lde/novanic/eventservice/client/event/filter/DefaultEventFilter;)
      ];
    
    result["[Lde.novanic.eventservice.client.event.filter.EventFilter;/836210305"] = [
        @de.novanic.eventservice.client.event.filter.EventFilter_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.filter.EventFilter_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lde/novanic/eventservice/client/event/filter/EventFilter;),
        @de.novanic.eventservice.client.event.filter.EventFilter_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lde/novanic/eventservice/client/event/filter/EventFilter;)
      ];
    
    result["de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent/2862324233"] = [
        @de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lde/novanic/eventservice/client/event/listener/unlisten/DefaultUnlistenEvent;),
        @de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lde/novanic/eventservice/client/event/listener/unlisten/DefaultUnlistenEvent;)
      ];
    
    result["de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener$Scope/4054018674"] = [
        ,
        ,
        @de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener_Scope_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lde/novanic/eventservice/client/event/listener/unlisten/UnlistenEventListener$Scope;)
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Double/858496421"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Double;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["java.lang.Long/4227064769"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Long;),
        @com.google.gwt.user.client.rpc.core.java.lang.Long_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Long;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptySet/3523698179"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Set;)
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.HashSet/3273092938"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ];
    
    result["java.util.LinkedHashSet/1826081506"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1346942793"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/4043497002"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.ApplicationInfo/198003162"] = [
        @org.opennms.features.poller.remote.gwt.client.ApplicationInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.ApplicationInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/ApplicationInfo;),
        @org.opennms.features.poller.remote.gwt.client.ApplicationInfo_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/ApplicationInfo;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.GWTLatLng/1863811288"] = [
        @org.opennms.features.poller.remote.gwt.client.GWTLatLng_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.GWTLatLng_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/GWTLatLng;),
        @org.opennms.features.poller.remote.gwt.client.GWTLatLng_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/GWTLatLng;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.GWTMarkerState/769195374"] = [
        @org.opennms.features.poller.remote.gwt.client.GWTMarkerState_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.GWTMarkerState_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/GWTMarkerState;),
        @org.opennms.features.poller.remote.gwt.client.GWTMarkerState_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/GWTMarkerState;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.GWTMonitoredService/3053769463"] = [
        @org.opennms.features.poller.remote.gwt.client.GWTMonitoredService_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.GWTMonitoredService_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/GWTMonitoredService;),
        @org.opennms.features.poller.remote.gwt.client.GWTMonitoredService_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/GWTMonitoredService;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.Status/3305880894"] = [
        @org.opennms.features.poller.remote.gwt.client.Status_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.Status_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/Status;),
        @org.opennms.features.poller.remote.gwt.client.Status_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/Status;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.StatusDetails/1028121827"] = [
        @org.opennms.features.poller.remote.gwt.client.StatusDetails_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.StatusDetails_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/StatusDetails;),
        @org.opennms.features.poller.remote.gwt.client.StatusDetails_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/StatusDetails;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.location.LocationInfo/2206349969"] = [
        @org.opennms.features.poller.remote.gwt.client.location.LocationInfo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.location.LocationInfo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/location/LocationInfo;),
        @org.opennms.features.poller.remote.gwt.client.location.LocationInfo_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/location/LocationInfo;)
      ];
    
    result["[Lorg.opennms.features.poller.remote.gwt.client.location.LocationInfo;/3548475532"] = [
        @org.opennms.features.poller.remote.gwt.client.location.LocationInfo_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.location.LocationInfo_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/opennms/features/poller/remote/gwt/client/location/LocationInfo;),
        @org.opennms.features.poller.remote.gwt.client.location.LocationInfo_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/opennms/features/poller/remote/gwt/client/location/LocationInfo;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent/2904292512"] = [
        @org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/ApplicationRemovedRemoteEvent;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/ApplicationRemovedRemoteEvent;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent/1012962694"] = [
        @org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/ApplicationUpdatedRemoteEvent;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/ApplicationUpdatedRemoteEvent;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingFinishedRemoteEvent/3524912777"] = [
        @org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingFinishedRemoteEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingFinishedRemoteEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/GeocodingFinishedRemoteEvent;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingFinishedRemoteEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/GeocodingFinishedRemoteEvent;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent/77623537"] = [
        @org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/GeocodingUpdatingRemoteEvent;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/GeocodingUpdatingRemoteEvent;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent/3906183700"] = [
        @org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/LocationUpdatedRemoteEvent;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/LocationUpdatedRemoteEvent;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent/3484899072"] = [
        @org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/LocationsUpdatedRemoteEvent;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/LocationsUpdatedRemoteEvent;)
      ];
    
    result["org.opennms.features.poller.remote.gwt.client.remoteevents.UpdateCompleteRemoteEvent/2535967224"] = [
        @org.opennms.features.poller.remote.gwt.client.remoteevents.UpdateCompleteRemoteEvent_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.UpdateCompleteRemoteEvent_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/UpdateCompleteRemoteEvent;),
        @org.opennms.features.poller.remote.gwt.client.remoteevents.UpdateCompleteRemoteEvent_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/features/poller/remote/gwt/client/remoteevents/UpdateCompleteRemoteEvent;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.DefaultDomainEvent::class)] = "de.novanic.eventservice.client.event.DefaultDomainEvent/3924906731";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.DefaultDomainEvent[]::class)] = "[Lde.novanic.eventservice.client.event.DefaultDomainEvent;/4107875583";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.DomainEvent[]::class)] = "[Lde.novanic.eventservice.client.event.DomainEvent;/2573218216";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.domain.DefaultDomain::class)] = "de.novanic.eventservice.client.event.domain.DefaultDomain/240262385";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.filter.AppendableEventFilter[]::class)] = "[Lde.novanic.eventservice.client.event.filter.AppendableEventFilter;/3140808580";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.filter.CascadingEventFilter[]::class)] = "[Lde.novanic.eventservice.client.event.filter.CascadingEventFilter;/4218008474";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.filter.CompositeEventFilter[]::class)] = "[Lde.novanic.eventservice.client.event.filter.CompositeEventFilter;/3667622880";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter::class)] = "de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter/2036315829";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter[]::class)] = "[Lde.novanic.eventservice.client.event.filter.DefaultCompositeEventFilter;/2853401946";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.filter.DefaultEventFilter::class)] = "de.novanic.eventservice.client.event.filter.DefaultEventFilter/3359357329";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.filter.DefaultEventFilter[]::class)] = "[Lde.novanic.eventservice.client.event.filter.DefaultEventFilter;/2136978271";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.filter.EventFilter[]::class)] = "[Lde.novanic.eventservice.client.event.filter.EventFilter;/836210305";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent::class)] = "de.novanic.eventservice.client.event.listener.unlisten.DefaultUnlistenEvent/2862324233";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener.Scope::class)] = "de.novanic.eventservice.client.event.listener.unlisten.UnlistenEventListener$Scope/4054018674";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double::class)] = "java.lang.Double/858496421";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Long::class)] = "java.lang.Long/4227064769";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptySet::class)] = "java.util.Collections$EmptySet/3523698179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/3273092938";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/1826081506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/4043497002";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.ApplicationInfo::class)] = "org.opennms.features.poller.remote.gwt.client.ApplicationInfo/198003162";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.GWTLatLng::class)] = "org.opennms.features.poller.remote.gwt.client.GWTLatLng/1863811288";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.GWTMarkerState::class)] = "org.opennms.features.poller.remote.gwt.client.GWTMarkerState/769195374";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.GWTMonitoredService::class)] = "org.opennms.features.poller.remote.gwt.client.GWTMonitoredService/3053769463";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.Status::class)] = "org.opennms.features.poller.remote.gwt.client.Status/3305880894";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.StatusDetails::class)] = "org.opennms.features.poller.remote.gwt.client.StatusDetails/1028121827";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.location.LocationInfo::class)] = "org.opennms.features.poller.remote.gwt.client.location.LocationInfo/2206349969";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.location.LocationInfo[]::class)] = "[Lorg.opennms.features.poller.remote.gwt.client.location.LocationInfo;/3548475532";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent::class)] = "org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationRemovedRemoteEvent/2904292512";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent::class)] = "org.opennms.features.poller.remote.gwt.client.remoteevents.ApplicationUpdatedRemoteEvent/1012962694";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingFinishedRemoteEvent::class)] = "org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingFinishedRemoteEvent/3524912777";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent::class)] = "org.opennms.features.poller.remote.gwt.client.remoteevents.GeocodingUpdatingRemoteEvent/77623537";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent::class)] = "org.opennms.features.poller.remote.gwt.client.remoteevents.LocationUpdatedRemoteEvent/3906183700";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent::class)] = "org.opennms.features.poller.remote.gwt.client.remoteevents.LocationsUpdatedRemoteEvent/3484899072";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.features.poller.remote.gwt.client.remoteevents.UpdateCompleteRemoteEvent::class)] = "org.opennms.features.poller.remote.gwt.client.remoteevents.UpdateCompleteRemoteEvent/2535967224";
    return result;
  }-*/;
  
  public EventService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}

package org.opennms.dashboard.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class SurveillanceService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
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
    result["com.google.gwt.i18n.client.impl.DateRecord/3220471373"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
      ];
    
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
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
      ];
    
    result["[[Ljava.lang.String;/4182515373"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[[Ljava/lang/String;),
      ];
    
    result["java.sql.Date/730999118"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
      ];
    
    result["java.sql.Time/1816797103"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
      ];
    
    result["java.sql.Timestamp/3040052672"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
      ];
    
    result["java.util.Date/3385151746"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
      ];
    
    result["org.opennms.dashboard.client.Alarm/3803682980"] = [
        @org.opennms.dashboard.client.Alarm_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.Alarm_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/dashboard/client/Alarm;),
      ];
    
    result["[Lorg.opennms.dashboard.client.Alarm;/3072532678"] = [
        @org.opennms.dashboard.client.Alarm_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.Alarm_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/opennms/dashboard/client/Alarm;),
      ];
    
    result["org.opennms.dashboard.client.NodeRtc/1201430884"] = [
        @org.opennms.dashboard.client.NodeRtc_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.NodeRtc_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/dashboard/client/NodeRtc;),
      ];
    
    result["[Lorg.opennms.dashboard.client.NodeRtc;/932533021"] = [
        @org.opennms.dashboard.client.NodeRtc_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.NodeRtc_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/opennms/dashboard/client/NodeRtc;),
      ];
    
    result["org.opennms.dashboard.client.Notification/4129746275"] = [
        @org.opennms.dashboard.client.Notification_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.Notification_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/dashboard/client/Notification;),
      ];
    
    result["[Lorg.opennms.dashboard.client.Notification;/1758348408"] = [
        @org.opennms.dashboard.client.Notification_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.Notification_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/opennms/dashboard/client/Notification;),
      ];
    
    result["org.opennms.dashboard.client.SurveillanceData/474793641"] = [
        @org.opennms.dashboard.client.SurveillanceData_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.SurveillanceData_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/dashboard/client/SurveillanceData;),
      ];
    
    result["org.opennms.dashboard.client.SurveillanceGroup/3539037879"] = [
        @org.opennms.dashboard.client.SurveillanceGroup_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.SurveillanceGroup_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/dashboard/client/SurveillanceGroup;),
        @org.opennms.dashboard.client.SurveillanceGroup_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/dashboard/client/SurveillanceGroup;)
      ];
    
    result["[Lorg.opennms.dashboard.client.SurveillanceGroup;/2655813322"] = [
        @org.opennms.dashboard.client.SurveillanceGroup_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.SurveillanceGroup_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/opennms/dashboard/client/SurveillanceGroup;),
      ];
    
    result["org.opennms.dashboard.client.SurveillanceIntersection/1394102736"] = [
        @org.opennms.dashboard.client.SurveillanceIntersection_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.SurveillanceIntersection_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/opennms/dashboard/client/SurveillanceIntersection;),
        @org.opennms.dashboard.client.SurveillanceIntersection_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/dashboard/client/SurveillanceIntersection;)
      ];
    
    result["[Lorg.opennms.dashboard.client.SurveillanceIntersection;/3015663375"] = [
        @org.opennms.dashboard.client.SurveillanceIntersection_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.SurveillanceIntersection_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/opennms/dashboard/client/SurveillanceIntersection;),
      ];
    
    result["[[Lorg.opennms.dashboard.client.SurveillanceIntersection;/4032250433"] = [
        @org.opennms.dashboard.client.SurveillanceIntersection_Array_Rank_2_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.opennms.dashboard.client.SurveillanceIntersection_Array_Rank_2_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[[Lorg/opennms/dashboard/client/SurveillanceIntersection;),
      ];
    
    result["org.opennms.dashboard.client.SurveillanceSet$DefaultSurveillanceSet/3027078367"] = [
        ,
        ,
        @org.opennms.dashboard.client.SurveillanceSet_DefaultSurveillanceSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/opennms/dashboard/client/SurveillanceSet$DefaultSurveillanceSet;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/3220471373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[][]::class)] = "[[Ljava.lang.String;/4182515373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/730999118";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/1816797103";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/3040052672";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/3385151746";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.Alarm::class)] = "org.opennms.dashboard.client.Alarm/3803682980";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.Alarm[]::class)] = "[Lorg.opennms.dashboard.client.Alarm;/3072532678";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.NodeRtc::class)] = "org.opennms.dashboard.client.NodeRtc/1201430884";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.NodeRtc[]::class)] = "[Lorg.opennms.dashboard.client.NodeRtc;/932533021";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.Notification::class)] = "org.opennms.dashboard.client.Notification/4129746275";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.Notification[]::class)] = "[Lorg.opennms.dashboard.client.Notification;/1758348408";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.SurveillanceData::class)] = "org.opennms.dashboard.client.SurveillanceData/474793641";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.SurveillanceGroup::class)] = "org.opennms.dashboard.client.SurveillanceGroup/3539037879";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.SurveillanceGroup[]::class)] = "[Lorg.opennms.dashboard.client.SurveillanceGroup;/2655813322";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.SurveillanceIntersection::class)] = "org.opennms.dashboard.client.SurveillanceIntersection/1394102736";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.SurveillanceIntersection[]::class)] = "[Lorg.opennms.dashboard.client.SurveillanceIntersection;/3015663375";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.SurveillanceIntersection[][]::class)] = "[[Lorg.opennms.dashboard.client.SurveillanceIntersection;/4032250433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.opennms.dashboard.client.SurveillanceSet.DefaultSurveillanceSet::class)] = "org.opennms.dashboard.client.SurveillanceSet$DefaultSurveillanceSet/3027078367";
    return result;
  }-*/;
  
  public SurveillanceService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}

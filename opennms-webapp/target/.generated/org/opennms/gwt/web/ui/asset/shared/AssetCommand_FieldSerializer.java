package org.opennms.gwt.web.ui.asset.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AssetCommand_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getM_additionalhardware(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_additionalhardware;
  }-*/;
  
  private static native void setM_additionalhardware(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_additionalhardware = value;
  }-*/;
  
  private static native java.lang.String getM_address1(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_address1;
  }-*/;
  
  private static native void setM_address1(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_address1 = value;
  }-*/;
  
  private static native java.lang.String getM_address2(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_address2;
  }-*/;
  
  private static native void setM_address2(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_address2 = value;
  }-*/;
  
  private static native java.lang.String getM_admin(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_admin;
  }-*/;
  
  private static native void setM_admin(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_admin = value;
  }-*/;
  
  private static native boolean getM_allowModify(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_allowModify;
  }-*/;
  
  private static native void setM_allowModify(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, boolean value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_allowModify = value;
  }-*/;
  
  private static native java.lang.String getM_assetNumber(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_assetNumber;
  }-*/;
  
  private static native void setM_assetNumber(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_assetNumber = value;
  }-*/;
  
  private static native java.lang.String getM_autoenable(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_autoenable;
  }-*/;
  
  private static native void setM_autoenable(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_autoenable = value;
  }-*/;
  
  private static native java.util.ArrayList getM_autoenableOptions(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_autoenableOptions;
  }-*/;
  
  private static native void setM_autoenableOptions(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.util.ArrayList value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_autoenableOptions = value;
  }-*/;
  
  private static native java.lang.String getM_building(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_building;
  }-*/;
  
  private static native void setM_building(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_building = value;
  }-*/;
  
  private static native java.lang.String getM_category(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_category;
  }-*/;
  
  private static native void setM_category(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_category = value;
  }-*/;
  
  private static native java.lang.String getM_circuitId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_circuitId;
  }-*/;
  
  private static native void setM_circuitId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_circuitId = value;
  }-*/;
  
  private static native java.lang.String getM_city(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_city;
  }-*/;
  
  private static native void setM_city(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_city = value;
  }-*/;
  
  private static native java.lang.String getM_comment(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_comment;
  }-*/;
  
  private static native void setM_comment(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_comment = value;
  }-*/;
  
  private static native java.lang.String getM_connection(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_connection;
  }-*/;
  
  private static native void setM_connection(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_connection = value;
  }-*/;
  
  private static native java.util.ArrayList getM_connectionOptions(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_connectionOptions;
  }-*/;
  
  private static native void setM_connectionOptions(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.util.ArrayList value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_connectionOptions = value;
  }-*/;
  
  private static native java.lang.String getM_cpu(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_cpu;
  }-*/;
  
  private static native void setM_cpu(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_cpu = value;
  }-*/;
  
  private static native java.lang.String getM_dateInstalled(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_dateInstalled;
  }-*/;
  
  private static native void setM_dateInstalled(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_dateInstalled = value;
  }-*/;
  
  private static native java.lang.String getM_department(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_department;
  }-*/;
  
  private static native void setM_department(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_department = value;
  }-*/;
  
  private static native java.lang.String getM_description(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_description;
  }-*/;
  
  private static native void setM_description(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_description = value;
  }-*/;
  
  private static native java.lang.String getM_displayCategory(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_displayCategory;
  }-*/;
  
  private static native void setM_displayCategory(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_displayCategory = value;
  }-*/;
  
  private static native java.lang.String getM_division(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_division;
  }-*/;
  
  private static native void setM_division(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_division = value;
  }-*/;
  
  private static native java.lang.String getM_enable(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_enable;
  }-*/;
  
  private static native void setM_enable(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_enable = value;
  }-*/;
  
  private static native java.lang.String getM_floor(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_floor;
  }-*/;
  
  private static native void setM_floor(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_floor = value;
  }-*/;
  
  private static native java.lang.String getM_hdd1(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd1;
  }-*/;
  
  private static native void setM_hdd1(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd1 = value;
  }-*/;
  
  private static native java.lang.String getM_hdd2(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd2;
  }-*/;
  
  private static native void setM_hdd2(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd2 = value;
  }-*/;
  
  private static native java.lang.String getM_hdd3(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd3;
  }-*/;
  
  private static native void setM_hdd3(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd3 = value;
  }-*/;
  
  private static native java.lang.String getM_hdd4(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd4;
  }-*/;
  
  private static native void setM_hdd4(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd4 = value;
  }-*/;
  
  private static native java.lang.String getM_hdd5(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd5;
  }-*/;
  
  private static native void setM_hdd5(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd5 = value;
  }-*/;
  
  private static native java.lang.String getM_hdd6(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd6;
  }-*/;
  
  private static native void setM_hdd6(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_hdd6 = value;
  }-*/;
  
  private static native java.lang.Integer getM_id(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_id;
  }-*/;
  
  private static native void setM_id(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.Integer value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_id = value;
  }-*/;
  
  private static native java.lang.String getM_inputpower(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_inputpower;
  }-*/;
  
  private static native void setM_inputpower(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_inputpower = value;
  }-*/;
  
  private static native java.lang.String getM_lastModifiedBy(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_lastModifiedBy;
  }-*/;
  
  private static native void setM_lastModifiedBy(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_lastModifiedBy = value;
  }-*/;
  
  private static native java.util.Date getM_lastModifiedDate(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_lastModifiedDate;
  }-*/;
  
  private static native void setM_lastModifiedDate(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.util.Date value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_lastModifiedDate = value;
  }-*/;
  
  private static native java.lang.String getM_lease(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_lease;
  }-*/;
  
  private static native void setM_lease(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_lease = value;
  }-*/;
  
  private static native java.lang.String getM_leaseExpires(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_leaseExpires;
  }-*/;
  
  private static native void setM_leaseExpires(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_leaseExpires = value;
  }-*/;
  
  private static native java.lang.String getM_loggedInUser(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_loggedInUser;
  }-*/;
  
  private static native void setM_loggedInUser(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_loggedInUser = value;
  }-*/;
  
  private static native java.lang.String getM_maintContractExpiration(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_maintContractExpiration;
  }-*/;
  
  private static native void setM_maintContractExpiration(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_maintContractExpiration = value;
  }-*/;
  
  private static native java.lang.String getM_maintcontract(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_maintcontract;
  }-*/;
  
  private static native void setM_maintcontract(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_maintcontract = value;
  }-*/;
  
  private static native java.lang.String getM_manufacturer(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_manufacturer;
  }-*/;
  
  private static native void setM_manufacturer(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_manufacturer = value;
  }-*/;
  
  private static native java.lang.String getM_modelNumber(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_modelNumber;
  }-*/;
  
  private static native void setM_modelNumber(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_modelNumber = value;
  }-*/;
  
  private static native java.lang.Integer getM_nextNodeId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_nextNodeId;
  }-*/;
  
  private static native void setM_nextNodeId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.Integer value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_nextNodeId = value;
  }-*/;
  
  private static native java.lang.String getM_nodeId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_nodeId;
  }-*/;
  
  private static native void setM_nodeId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_nodeId = value;
  }-*/;
  
  private static native java.lang.String getM_nodeLabel(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_nodeLabel;
  }-*/;
  
  private static native void setM_nodeLabel(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_nodeLabel = value;
  }-*/;
  
  private static native java.lang.String getM_notifyCategory(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_notifyCategory;
  }-*/;
  
  private static native void setM_notifyCategory(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_notifyCategory = value;
  }-*/;
  
  private static native java.lang.String getM_numpowersupplies(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_numpowersupplies;
  }-*/;
  
  private static native void setM_numpowersupplies(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_numpowersupplies = value;
  }-*/;
  
  private static native java.lang.String getM_operatingSystem(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_operatingSystem;
  }-*/;
  
  private static native void setM_operatingSystem(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_operatingSystem = value;
  }-*/;
  
  private static native java.lang.String getM_password(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_password;
  }-*/;
  
  private static native void setM_password(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_password = value;
  }-*/;
  
  private static native java.lang.String getM_pollerCategory(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_pollerCategory;
  }-*/;
  
  private static native void setM_pollerCategory(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_pollerCategory = value;
  }-*/;
  
  private static native java.lang.String getM_port(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_port;
  }-*/;
  
  private static native void setM_port(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_port = value;
  }-*/;
  
  private static native java.lang.Integer getM_previousNodeId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_previousNodeId;
  }-*/;
  
  private static native void setM_previousNodeId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.Integer value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_previousNodeId = value;
  }-*/;
  
  private static native java.lang.String getM_rack(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_rack;
  }-*/;
  
  private static native void setM_rack(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_rack = value;
  }-*/;
  
  private static native java.lang.String getM_rackunitheight(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_rackunitheight;
  }-*/;
  
  private static native void setM_rackunitheight(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_rackunitheight = value;
  }-*/;
  
  private static native java.lang.String getM_ram(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_ram;
  }-*/;
  
  private static native void setM_ram(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_ram = value;
  }-*/;
  
  private static native java.lang.String getM_region(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_region;
  }-*/;
  
  private static native void setM_region(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_region = value;
  }-*/;
  
  private static native java.lang.String getM_room(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_room;
  }-*/;
  
  private static native void setM_room(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_room = value;
  }-*/;
  
  private static native java.lang.String getM_serialNumber(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_serialNumber;
  }-*/;
  
  private static native void setM_serialNumber(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_serialNumber = value;
  }-*/;
  
  private static native java.lang.String getM_slot(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_slot;
  }-*/;
  
  private static native void setM_slot(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_slot = value;
  }-*/;
  
  private static native java.lang.String getM_snmpSysContact(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysContact;
  }-*/;
  
  private static native void setM_snmpSysContact(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysContact = value;
  }-*/;
  
  private static native java.lang.String getM_snmpSysDescription(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysDescription;
  }-*/;
  
  private static native void setM_snmpSysDescription(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysDescription = value;
  }-*/;
  
  private static native java.lang.String getM_snmpSysLocation(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysLocation;
  }-*/;
  
  private static native void setM_snmpSysLocation(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysLocation = value;
  }-*/;
  
  private static native java.lang.String getM_snmpSysName(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysName;
  }-*/;
  
  private static native void setM_snmpSysName(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysName = value;
  }-*/;
  
  private static native java.lang.String getM_snmpSysObjectId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysObjectId;
  }-*/;
  
  private static native void setM_snmpSysObjectId(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpSysObjectId = value;
  }-*/;
  
  private static native java.lang.String getM_snmpcommunity(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpcommunity;
  }-*/;
  
  private static native void setM_snmpcommunity(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_snmpcommunity = value;
  }-*/;
  
  private static native java.lang.String getM_state(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_state;
  }-*/;
  
  private static native void setM_state(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_state = value;
  }-*/;
  
  private static native java.lang.String getM_storagectrl(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_storagectrl;
  }-*/;
  
  private static native void setM_storagectrl(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_storagectrl = value;
  }-*/;
  
  private static native java.lang.String getM_supportPhone(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_supportPhone;
  }-*/;
  
  private static native void setM_supportPhone(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_supportPhone = value;
  }-*/;
  
  private static native java.lang.String getM_thresholdCategory(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_thresholdCategory;
  }-*/;
  
  private static native void setM_thresholdCategory(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_thresholdCategory = value;
  }-*/;
  
  private static native java.lang.String getM_username(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_username;
  }-*/;
  
  private static native void setM_username(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_username = value;
  }-*/;
  
  private static native java.lang.String getM_vendor(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_vendor;
  }-*/;
  
  private static native void setM_vendor(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_vendor = value;
  }-*/;
  
  private static native java.lang.String getM_vendorAssetNumber(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_vendorAssetNumber;
  }-*/;
  
  private static native void setM_vendorAssetNumber(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_vendorAssetNumber = value;
  }-*/;
  
  private static native java.lang.String getM_vendorFax(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_vendorFax;
  }-*/;
  
  private static native void setM_vendorFax(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_vendorFax = value;
  }-*/;
  
  private static native java.lang.String getM_vendorPhone(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_vendorPhone;
  }-*/;
  
  private static native void setM_vendorPhone(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_vendorPhone = value;
  }-*/;
  
  private static native java.lang.String getM_zip(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_zip;
  }-*/;
  
  private static native void setM_zip(org.opennms.gwt.web.ui.asset.shared.AssetCommand instance, java.lang.String value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetCommand::m_zip = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) throws SerializationException {
    setM_additionalhardware(instance, streamReader.readString());
    setM_address1(instance, streamReader.readString());
    setM_address2(instance, streamReader.readString());
    setM_admin(instance, streamReader.readString());
    setM_allowModify(instance, streamReader.readBoolean());
    setM_assetNumber(instance, streamReader.readString());
    setM_autoenable(instance, streamReader.readString());
    setM_autoenableOptions(instance, (java.util.ArrayList) streamReader.readObject());
    setM_building(instance, streamReader.readString());
    setM_category(instance, streamReader.readString());
    setM_circuitId(instance, streamReader.readString());
    setM_city(instance, streamReader.readString());
    setM_comment(instance, streamReader.readString());
    setM_connection(instance, streamReader.readString());
    setM_connectionOptions(instance, (java.util.ArrayList) streamReader.readObject());
    setM_cpu(instance, streamReader.readString());
    setM_dateInstalled(instance, streamReader.readString());
    setM_department(instance, streamReader.readString());
    setM_description(instance, streamReader.readString());
    setM_displayCategory(instance, streamReader.readString());
    setM_division(instance, streamReader.readString());
    setM_enable(instance, streamReader.readString());
    setM_floor(instance, streamReader.readString());
    setM_hdd1(instance, streamReader.readString());
    setM_hdd2(instance, streamReader.readString());
    setM_hdd3(instance, streamReader.readString());
    setM_hdd4(instance, streamReader.readString());
    setM_hdd5(instance, streamReader.readString());
    setM_hdd6(instance, streamReader.readString());
    setM_id(instance, (java.lang.Integer) streamReader.readObject());
    setM_inputpower(instance, streamReader.readString());
    setM_lastModifiedBy(instance, streamReader.readString());
    setM_lastModifiedDate(instance, (java.util.Date) streamReader.readObject());
    setM_lease(instance, streamReader.readString());
    setM_leaseExpires(instance, streamReader.readString());
    setM_loggedInUser(instance, streamReader.readString());
    setM_maintContractExpiration(instance, streamReader.readString());
    setM_maintcontract(instance, streamReader.readString());
    setM_manufacturer(instance, streamReader.readString());
    setM_modelNumber(instance, streamReader.readString());
    setM_nextNodeId(instance, (java.lang.Integer) streamReader.readObject());
    setM_nodeId(instance, streamReader.readString());
    setM_nodeLabel(instance, streamReader.readString());
    setM_notifyCategory(instance, streamReader.readString());
    setM_numpowersupplies(instance, streamReader.readString());
    setM_operatingSystem(instance, streamReader.readString());
    setM_password(instance, streamReader.readString());
    setM_pollerCategory(instance, streamReader.readString());
    setM_port(instance, streamReader.readString());
    setM_previousNodeId(instance, (java.lang.Integer) streamReader.readObject());
    setM_rack(instance, streamReader.readString());
    setM_rackunitheight(instance, streamReader.readString());
    setM_ram(instance, streamReader.readString());
    setM_region(instance, streamReader.readString());
    setM_room(instance, streamReader.readString());
    setM_serialNumber(instance, streamReader.readString());
    setM_slot(instance, streamReader.readString());
    setM_snmpSysContact(instance, streamReader.readString());
    setM_snmpSysDescription(instance, streamReader.readString());
    setM_snmpSysLocation(instance, streamReader.readString());
    setM_snmpSysName(instance, streamReader.readString());
    setM_snmpSysObjectId(instance, streamReader.readString());
    setM_snmpcommunity(instance, streamReader.readString());
    setM_state(instance, streamReader.readString());
    setM_storagectrl(instance, streamReader.readString());
    setM_supportPhone(instance, streamReader.readString());
    setM_thresholdCategory(instance, streamReader.readString());
    setM_username(instance, streamReader.readString());
    setM_vendor(instance, streamReader.readString());
    setM_vendorAssetNumber(instance, streamReader.readString());
    setM_vendorFax(instance, streamReader.readString());
    setM_vendorPhone(instance, streamReader.readString());
    setM_zip(instance, streamReader.readString());
    
  }
  
  public static org.opennms.gwt.web.ui.asset.shared.AssetCommand instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.gwt.web.ui.asset.shared.AssetCommand();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.gwt.web.ui.asset.shared.AssetCommand instance) throws SerializationException {
    streamWriter.writeString(getM_additionalhardware(instance));
    streamWriter.writeString(getM_address1(instance));
    streamWriter.writeString(getM_address2(instance));
    streamWriter.writeString(getM_admin(instance));
    streamWriter.writeBoolean(getM_allowModify(instance));
    streamWriter.writeString(getM_assetNumber(instance));
    streamWriter.writeString(getM_autoenable(instance));
    streamWriter.writeObject(getM_autoenableOptions(instance));
    streamWriter.writeString(getM_building(instance));
    streamWriter.writeString(getM_category(instance));
    streamWriter.writeString(getM_circuitId(instance));
    streamWriter.writeString(getM_city(instance));
    streamWriter.writeString(getM_comment(instance));
    streamWriter.writeString(getM_connection(instance));
    streamWriter.writeObject(getM_connectionOptions(instance));
    streamWriter.writeString(getM_cpu(instance));
    streamWriter.writeString(getM_dateInstalled(instance));
    streamWriter.writeString(getM_department(instance));
    streamWriter.writeString(getM_description(instance));
    streamWriter.writeString(getM_displayCategory(instance));
    streamWriter.writeString(getM_division(instance));
    streamWriter.writeString(getM_enable(instance));
    streamWriter.writeString(getM_floor(instance));
    streamWriter.writeString(getM_hdd1(instance));
    streamWriter.writeString(getM_hdd2(instance));
    streamWriter.writeString(getM_hdd3(instance));
    streamWriter.writeString(getM_hdd4(instance));
    streamWriter.writeString(getM_hdd5(instance));
    streamWriter.writeString(getM_hdd6(instance));
    streamWriter.writeObject(getM_id(instance));
    streamWriter.writeString(getM_inputpower(instance));
    streamWriter.writeString(getM_lastModifiedBy(instance));
    streamWriter.writeObject(getM_lastModifiedDate(instance));
    streamWriter.writeString(getM_lease(instance));
    streamWriter.writeString(getM_leaseExpires(instance));
    streamWriter.writeString(getM_loggedInUser(instance));
    streamWriter.writeString(getM_maintContractExpiration(instance));
    streamWriter.writeString(getM_maintcontract(instance));
    streamWriter.writeString(getM_manufacturer(instance));
    streamWriter.writeString(getM_modelNumber(instance));
    streamWriter.writeObject(getM_nextNodeId(instance));
    streamWriter.writeString(getM_nodeId(instance));
    streamWriter.writeString(getM_nodeLabel(instance));
    streamWriter.writeString(getM_notifyCategory(instance));
    streamWriter.writeString(getM_numpowersupplies(instance));
    streamWriter.writeString(getM_operatingSystem(instance));
    streamWriter.writeString(getM_password(instance));
    streamWriter.writeString(getM_pollerCategory(instance));
    streamWriter.writeString(getM_port(instance));
    streamWriter.writeObject(getM_previousNodeId(instance));
    streamWriter.writeString(getM_rack(instance));
    streamWriter.writeString(getM_rackunitheight(instance));
    streamWriter.writeString(getM_ram(instance));
    streamWriter.writeString(getM_region(instance));
    streamWriter.writeString(getM_room(instance));
    streamWriter.writeString(getM_serialNumber(instance));
    streamWriter.writeString(getM_slot(instance));
    streamWriter.writeString(getM_snmpSysContact(instance));
    streamWriter.writeString(getM_snmpSysDescription(instance));
    streamWriter.writeString(getM_snmpSysLocation(instance));
    streamWriter.writeString(getM_snmpSysName(instance));
    streamWriter.writeString(getM_snmpSysObjectId(instance));
    streamWriter.writeString(getM_snmpcommunity(instance));
    streamWriter.writeString(getM_state(instance));
    streamWriter.writeString(getM_storagectrl(instance));
    streamWriter.writeString(getM_supportPhone(instance));
    streamWriter.writeString(getM_thresholdCategory(instance));
    streamWriter.writeString(getM_username(instance));
    streamWriter.writeString(getM_vendor(instance));
    streamWriter.writeString(getM_vendorAssetNumber(instance));
    streamWriter.writeString(getM_vendorFax(instance));
    streamWriter.writeString(getM_vendorPhone(instance));
    streamWriter.writeString(getM_zip(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.gwt.web.ui.asset.shared.AssetCommand_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.gwt.web.ui.asset.shared.AssetCommand_FieldSerializer.deserialize(reader, (org.opennms.gwt.web.ui.asset.shared.AssetCommand)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.gwt.web.ui.asset.shared.AssetCommand_FieldSerializer.serialize(writer, (org.opennms.gwt.web.ui.asset.shared.AssetCommand)object);
  }
  
}

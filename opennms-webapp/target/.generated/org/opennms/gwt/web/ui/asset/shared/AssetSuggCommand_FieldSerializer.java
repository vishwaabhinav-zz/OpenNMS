package org.opennms.gwt.web.ui.asset.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AssetSuggCommand_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Set getM_additionalhardware(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_additionalhardware;
  }-*/;
  
  private static native void setM_additionalhardware(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_additionalhardware = value;
  }-*/;
  
  private static native java.util.Set getM_address1(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_address1;
  }-*/;
  
  private static native void setM_address1(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_address1 = value;
  }-*/;
  
  private static native java.util.Set getM_address2(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_address2;
  }-*/;
  
  private static native void setM_address2(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_address2 = value;
  }-*/;
  
  private static native java.util.Set getM_admin(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_admin;
  }-*/;
  
  private static native void setM_admin(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_admin = value;
  }-*/;
  
  private static native java.util.Set getM_building(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_building;
  }-*/;
  
  private static native void setM_building(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_building = value;
  }-*/;
  
  private static native java.util.Set getM_category(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_category;
  }-*/;
  
  private static native void setM_category(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_category = value;
  }-*/;
  
  private static native java.util.Set getM_circuitId(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_circuitId;
  }-*/;
  
  private static native void setM_circuitId(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_circuitId = value;
  }-*/;
  
  private static native java.util.Set getM_city(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_city;
  }-*/;
  
  private static native void setM_city(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_city = value;
  }-*/;
  
  private static native java.util.Set getM_cpu(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_cpu;
  }-*/;
  
  private static native void setM_cpu(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_cpu = value;
  }-*/;
  
  private static native java.util.Set getM_department(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_department;
  }-*/;
  
  private static native void setM_department(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_department = value;
  }-*/;
  
  private static native java.util.Set getM_description(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_description;
  }-*/;
  
  private static native void setM_description(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_description = value;
  }-*/;
  
  private static native java.util.Set getM_displayCategory(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_displayCategory;
  }-*/;
  
  private static native void setM_displayCategory(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_displayCategory = value;
  }-*/;
  
  private static native java.util.Set getM_division(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_division;
  }-*/;
  
  private static native void setM_division(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_division = value;
  }-*/;
  
  private static native java.util.Set getM_floor(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_floor;
  }-*/;
  
  private static native void setM_floor(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_floor = value;
  }-*/;
  
  private static native java.util.Set getM_hdd1(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd1;
  }-*/;
  
  private static native void setM_hdd1(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd1 = value;
  }-*/;
  
  private static native java.util.Set getM_hdd2(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd2;
  }-*/;
  
  private static native void setM_hdd2(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd2 = value;
  }-*/;
  
  private static native java.util.Set getM_hdd3(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd3;
  }-*/;
  
  private static native void setM_hdd3(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd3 = value;
  }-*/;
  
  private static native java.util.Set getM_hdd4(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd4;
  }-*/;
  
  private static native void setM_hdd4(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd4 = value;
  }-*/;
  
  private static native java.util.Set getM_hdd5(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd5;
  }-*/;
  
  private static native void setM_hdd5(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd5 = value;
  }-*/;
  
  private static native java.util.Set getM_hdd6(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd6;
  }-*/;
  
  private static native void setM_hdd6(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_hdd6 = value;
  }-*/;
  
  private static native java.util.Set getM_inputpower(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_inputpower;
  }-*/;
  
  private static native void setM_inputpower(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_inputpower = value;
  }-*/;
  
  private static native java.util.Set getM_lease(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_lease;
  }-*/;
  
  private static native void setM_lease(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_lease = value;
  }-*/;
  
  private static native java.util.Set getM_maintcontract(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_maintcontract;
  }-*/;
  
  private static native void setM_maintcontract(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_maintcontract = value;
  }-*/;
  
  private static native java.util.Set getM_manufacturer(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_manufacturer;
  }-*/;
  
  private static native void setM_manufacturer(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_manufacturer = value;
  }-*/;
  
  private static native java.util.Set getM_modelNumber(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_modelNumber;
  }-*/;
  
  private static native void setM_modelNumber(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_modelNumber = value;
  }-*/;
  
  private static native java.util.Set getM_notifyCategory(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_notifyCategory;
  }-*/;
  
  private static native void setM_notifyCategory(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_notifyCategory = value;
  }-*/;
  
  private static native java.util.Set getM_numpowersupplies(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_numpowersupplies;
  }-*/;
  
  private static native void setM_numpowersupplies(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_numpowersupplies = value;
  }-*/;
  
  private static native java.util.Set getM_operatingSystem(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_operatingSystem;
  }-*/;
  
  private static native void setM_operatingSystem(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_operatingSystem = value;
  }-*/;
  
  private static native java.util.Set getM_pollerCategory(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_pollerCategory;
  }-*/;
  
  private static native void setM_pollerCategory(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_pollerCategory = value;
  }-*/;
  
  private static native java.util.Set getM_rack(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_rack;
  }-*/;
  
  private static native void setM_rack(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_rack = value;
  }-*/;
  
  private static native java.util.Set getM_ram(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_ram;
  }-*/;
  
  private static native void setM_ram(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_ram = value;
  }-*/;
  
  private static native java.util.Set getM_region(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_region;
  }-*/;
  
  private static native void setM_region(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_region = value;
  }-*/;
  
  private static native java.util.Set getM_room(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_room;
  }-*/;
  
  private static native void setM_room(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_room = value;
  }-*/;
  
  private static native java.util.Set getM_snmpcommunity(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_snmpcommunity;
  }-*/;
  
  private static native void setM_snmpcommunity(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_snmpcommunity = value;
  }-*/;
  
  private static native java.util.Set getM_state(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_state;
  }-*/;
  
  private static native void setM_state(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_state = value;
  }-*/;
  
  private static native java.util.Set getM_storagectrl(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_storagectrl;
  }-*/;
  
  private static native void setM_storagectrl(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_storagectrl = value;
  }-*/;
  
  private static native java.util.Set getM_supportPhone(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_supportPhone;
  }-*/;
  
  private static native void setM_supportPhone(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_supportPhone = value;
  }-*/;
  
  private static native java.util.Set getM_thresholdCategory(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_thresholdCategory;
  }-*/;
  
  private static native void setM_thresholdCategory(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_thresholdCategory = value;
  }-*/;
  
  private static native java.util.Set getM_vendor(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_vendor;
  }-*/;
  
  private static native void setM_vendor(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_vendor = value;
  }-*/;
  
  private static native java.util.Set getM_vendorFax(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_vendorFax;
  }-*/;
  
  private static native void setM_vendorFax(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_vendorFax = value;
  }-*/;
  
  private static native java.util.Set getM_vendorPhone(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_vendorPhone;
  }-*/;
  
  private static native void setM_vendorPhone(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_vendorPhone = value;
  }-*/;
  
  private static native java.util.Set getM_zip(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) /*-{
    return instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_zip;
  }-*/;
  
  private static native void setM_zip(org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance, java.util.Set value) 
  /*-{
    instance.@org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand::m_zip = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) throws SerializationException {
    setM_additionalhardware(instance, (java.util.Set) streamReader.readObject());
    setM_address1(instance, (java.util.Set) streamReader.readObject());
    setM_address2(instance, (java.util.Set) streamReader.readObject());
    setM_admin(instance, (java.util.Set) streamReader.readObject());
    setM_building(instance, (java.util.Set) streamReader.readObject());
    setM_category(instance, (java.util.Set) streamReader.readObject());
    setM_circuitId(instance, (java.util.Set) streamReader.readObject());
    setM_city(instance, (java.util.Set) streamReader.readObject());
    setM_cpu(instance, (java.util.Set) streamReader.readObject());
    setM_department(instance, (java.util.Set) streamReader.readObject());
    setM_description(instance, (java.util.Set) streamReader.readObject());
    setM_displayCategory(instance, (java.util.Set) streamReader.readObject());
    setM_division(instance, (java.util.Set) streamReader.readObject());
    setM_floor(instance, (java.util.Set) streamReader.readObject());
    setM_hdd1(instance, (java.util.Set) streamReader.readObject());
    setM_hdd2(instance, (java.util.Set) streamReader.readObject());
    setM_hdd3(instance, (java.util.Set) streamReader.readObject());
    setM_hdd4(instance, (java.util.Set) streamReader.readObject());
    setM_hdd5(instance, (java.util.Set) streamReader.readObject());
    setM_hdd6(instance, (java.util.Set) streamReader.readObject());
    setM_inputpower(instance, (java.util.Set) streamReader.readObject());
    setM_lease(instance, (java.util.Set) streamReader.readObject());
    setM_maintcontract(instance, (java.util.Set) streamReader.readObject());
    setM_manufacturer(instance, (java.util.Set) streamReader.readObject());
    setM_modelNumber(instance, (java.util.Set) streamReader.readObject());
    setM_notifyCategory(instance, (java.util.Set) streamReader.readObject());
    setM_numpowersupplies(instance, (java.util.Set) streamReader.readObject());
    setM_operatingSystem(instance, (java.util.Set) streamReader.readObject());
    setM_pollerCategory(instance, (java.util.Set) streamReader.readObject());
    setM_rack(instance, (java.util.Set) streamReader.readObject());
    setM_ram(instance, (java.util.Set) streamReader.readObject());
    setM_region(instance, (java.util.Set) streamReader.readObject());
    setM_room(instance, (java.util.Set) streamReader.readObject());
    setM_snmpcommunity(instance, (java.util.Set) streamReader.readObject());
    setM_state(instance, (java.util.Set) streamReader.readObject());
    setM_storagectrl(instance, (java.util.Set) streamReader.readObject());
    setM_supportPhone(instance, (java.util.Set) streamReader.readObject());
    setM_thresholdCategory(instance, (java.util.Set) streamReader.readObject());
    setM_vendor(instance, (java.util.Set) streamReader.readObject());
    setM_vendorFax(instance, (java.util.Set) streamReader.readObject());
    setM_vendorPhone(instance, (java.util.Set) streamReader.readObject());
    setM_zip(instance, (java.util.Set) streamReader.readObject());
    
  }
  
  public static org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand instance) throws SerializationException {
    streamWriter.writeObject(getM_additionalhardware(instance));
    streamWriter.writeObject(getM_address1(instance));
    streamWriter.writeObject(getM_address2(instance));
    streamWriter.writeObject(getM_admin(instance));
    streamWriter.writeObject(getM_building(instance));
    streamWriter.writeObject(getM_category(instance));
    streamWriter.writeObject(getM_circuitId(instance));
    streamWriter.writeObject(getM_city(instance));
    streamWriter.writeObject(getM_cpu(instance));
    streamWriter.writeObject(getM_department(instance));
    streamWriter.writeObject(getM_description(instance));
    streamWriter.writeObject(getM_displayCategory(instance));
    streamWriter.writeObject(getM_division(instance));
    streamWriter.writeObject(getM_floor(instance));
    streamWriter.writeObject(getM_hdd1(instance));
    streamWriter.writeObject(getM_hdd2(instance));
    streamWriter.writeObject(getM_hdd3(instance));
    streamWriter.writeObject(getM_hdd4(instance));
    streamWriter.writeObject(getM_hdd5(instance));
    streamWriter.writeObject(getM_hdd6(instance));
    streamWriter.writeObject(getM_inputpower(instance));
    streamWriter.writeObject(getM_lease(instance));
    streamWriter.writeObject(getM_maintcontract(instance));
    streamWriter.writeObject(getM_manufacturer(instance));
    streamWriter.writeObject(getM_modelNumber(instance));
    streamWriter.writeObject(getM_notifyCategory(instance));
    streamWriter.writeObject(getM_numpowersupplies(instance));
    streamWriter.writeObject(getM_operatingSystem(instance));
    streamWriter.writeObject(getM_pollerCategory(instance));
    streamWriter.writeObject(getM_rack(instance));
    streamWriter.writeObject(getM_ram(instance));
    streamWriter.writeObject(getM_region(instance));
    streamWriter.writeObject(getM_room(instance));
    streamWriter.writeObject(getM_snmpcommunity(instance));
    streamWriter.writeObject(getM_state(instance));
    streamWriter.writeObject(getM_storagectrl(instance));
    streamWriter.writeObject(getM_supportPhone(instance));
    streamWriter.writeObject(getM_thresholdCategory(instance));
    streamWriter.writeObject(getM_vendor(instance));
    streamWriter.writeObject(getM_vendorFax(instance));
    streamWriter.writeObject(getM_vendorPhone(instance));
    streamWriter.writeObject(getM_zip(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand_FieldSerializer.deserialize(reader, (org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand_FieldSerializer.serialize(writer, (org.opennms.gwt.web.ui.asset.shared.AssetSuggCommand)object);
  }
  
}

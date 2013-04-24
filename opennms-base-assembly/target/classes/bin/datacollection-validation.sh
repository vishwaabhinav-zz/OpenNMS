#!/bin/sh - 

JAVA_OPTIONS="-Xmx256m"
opennms_home="/media/Study/workspace/opennms-1.10.8-1/target/opennms-1.10.8"

app_class=org.opennms.netmgt.config.DataCollectionConfigFactory

exec $opennms_home/bin/runjava -r -- $JAVA_OPTIONS \
    -Dopennms.home=$opennms_home \
    -Dopennms.manager.class=$app_class \
    -jar $opennms_home/lib/opennms_bootstrap.jar

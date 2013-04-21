#!/bin/sh

OPENNMS_HOME="/home/anonymous/workspace/opennms-1.10.8-1/target/opennms-1.10.8"

if [ -f "$OPENNMS_HOME/etc/opennms.conf" ]; then
	. "$OPENNMS_HOME/etc/opennms.conf"
fi

for FILE in $OPENNMS_HOME/lib/*.jar; do
	CP="$FILE:$CP"
done

exec /home/anonymous/workspace/opennms-1.10.8-1/target/opennms-1.10.8/bin/runjava -r -- \
	$ADDITIONAL_MANAGER_OPTIONS -Dopennms.home="$OPENNMS_HOME" -cp "$CP" "$@"


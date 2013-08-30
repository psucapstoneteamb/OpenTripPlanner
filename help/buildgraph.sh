#!/bin/bash
# Script to build Graph.obj for OpenTripPlanner Analyst Module
# BUILDER_PATH points to the jar file (built with current version of OTP).
# CONF_PATH points to an XML file following OTP's format.
#       Quick start: graph-builder-conf.xml
#               line 13: config TriMet GTFS URL
#               line 34: config OpenStreetMap predownloaded file
#               line 62: config output directory for Graph.obj
# Read more at https://github.com/openplans/OpenTripPlanner/wiki/GraphBuilder

# Configurables
BUILDER_PATH="/stash/portal/__WithinReach/ori_otp/OpenTripPlanner/opentripplanner-graph-builder/target/graph-builder.jar"
CONF_PATH="/stash/portal/__WithinReach/otp/graph-builder-conf.xml"

echo "About to build Graph.obj using settings in $CONF_PATH"
echo "Builder: $BUILDER_PATH"
echo ""
read -p "Please verify all settings are correct before continue. Continue? [Y/N] " -n 1 CONTINUE
echo ""
if [[ ${CONTINUE} =~ ^[Yy]$ ]]; then
	java -Xmx2048m -jar $BUILDER_PATH $CONF_PATH
else
	exit
fi

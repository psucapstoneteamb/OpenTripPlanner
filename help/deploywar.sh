#!/bin/bash
# Script to deploy OTP war files on tomcat7
# Make sure old webapps are undeployed completely before running this.

# Configurables
OTP_ROOT="/stash/portal/__WithinReach/ori_otp/OpenTripPlanner/"
WEBAPP_DIR="/var/lib/tomcat7/webapps/"


echo "About to deploy 3 OTP war files into $WEBAPP_DIR"
echo "OTP root: $OTP_ROOT"
echo ""
echo "Before continue, please verify all settings are correct"
read -p "AND old webapps are undeployed completely. Continue? [Y/N] " -n 1 CONTINUE
echo ""
if [[ ${CONTINUE} =~ ^[Yy]$ ]]; then
	cp $OTP_ROOT"opentripplanner-webapp/target/opentripplanner-webapp.war" $WEBAPP_DIR
	cp $OTP_ROOT"opentripplanner-api-webapp/target/opentripplanner-api-webapp.war" $WEBAPP_DIR
	cp $OTP_ROOT"opentripplanner-analyst-client/target/opentripplanner-analyst-client.war" $WEBAPP_DIR

	chmod 755 $WEBAPP_DIR"opentripplanner-webapp.war"
	chmod 755 $WEBAPP_DIR"opentripplanner-api-webapp.war"
	chmod 755 $WEBAPP_DIR"opentripplanner-analyst-client.war"
else
	exit
fi

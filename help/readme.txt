Set up OTP on queue (or similar machine)

Presumptions:
	OTP source is in /stash/portal/__WithinReach/ori_otp/OpenTripPlanner (tweaked to fit WithinReach).
	Webapps are packaged into war files (done using Maven).
	Tomcat7 is running, webapps directory is at /var/lib/tomcat7/webapps.
	Write permission for the webapps directory is given.

1. Build Graph.obj
	Graph builder will get data from TriMet and OpenStreetMap to build Graph.obj.

	Read through buildgraph.sh, modify BUILDER_PATH and CONF_PATH if necessary.
	
	Verify settings in graph-builder-conf.xml. Current settings:
		TriMet data: http://developer1.trimet.org/schedule/gtfs.zip
		OpenStreetMap data: predownloaded file at /stash/portal/__WithinReach/otp/osm/or-wa.osm
		Output directory: /stash/portal/__WithinReach/otp/newgraph/

	Run buildgraph.sh.

2. Put Graph.obj in the right place
	Currently, OTP webapps is set to find Graph.obj in /var/lib/tomcat7/webapps/
	Put Graph.obj into that directory, give tomcat7 read permission.

3. Deploy webapps
	Give tomcat7 at least 4GB of memory.
	Read through deploywar.sh, modify OTP_ROOT and WEBAPP_DIR if necessary.
	Run it.

4. Restart tomcat7 if it does not automatically deploy the new war files.
	Graph.obj will be loaded when war files are being deployed. This usually takes
	more than 60 seconds before the server is up and running.

5. Are we done?
	Webapps are successfully deployed? try navigate to http://queue.its.pdx.edu:8080/opentripplanner-analyst-client/
	Graph.obj is loaded? http://queue.its.pdx.edu:8080/opentripplanner-api-webapp/ws/metadata should return an XML file.

-------------------
* NOTE:
	Graph.obj needs to be rebuilt at least every 2 months (or more often if routing for
	dates far in the future is needed). At the time of building, graph builder will grab
	the latest TriMet GTFS data which contains 60-day transit schedule starting from the
	beginning of the current week.
	
	Once new Graph.obj is built and put in the right directory, restart tomcat7 so the
	webapps can load the new Graph.obj (no need to redeploy web apps).

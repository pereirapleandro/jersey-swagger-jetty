lppinfo-rest-template
=====================

Template of rest application using maven, jetty plugin and resteasy.

Build and Start APP
- mvn clean install package
- mvn jetty:run-war

XML
- http://localhost:8080/rest/book/list [default]
- http://localhost:8080/rest/book/list.xml

JSON
- http://localhost:8080/rest/book/list.json
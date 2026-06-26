FROM tomcat:10.1-jdk17

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/myapp-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/myapp.war

EXPOSE 8080

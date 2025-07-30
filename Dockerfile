FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY target/nagp-vg-assignment.jar /opt/app/vgnagp.jar
CMD ["java","-Dspring.profiles.active=prod","-jar", "/opt/app/vgnagp.jar"]
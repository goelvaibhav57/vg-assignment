FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY target/nagp-vg-assignment.jar /opt/app/vgnagp.jar
CMD ["java", "-jar", "/opt/app/vgnagp.jar"]
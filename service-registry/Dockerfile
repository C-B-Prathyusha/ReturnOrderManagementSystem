FROM openjdk:11
EXPOSE 8761
ADD "target/*.jar" "service.jar"
ENTRYPOINT [ "java", "-jar", "/service.jar" ]
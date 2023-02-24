FROM openjdk:11
EXPOSE 8000
ADD "target/*.jar" "auth.jar"
ENTRYPOINT [ "java", "-jar", "/auth.jar" ]
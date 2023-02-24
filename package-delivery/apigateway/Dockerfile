FROM openjdk:11
EXPOSE 8080
ADD "target/*.jar" "apigateway.jar"
ENTRYPOINT [ "java", "-jar", "/apigateway.jar" ]
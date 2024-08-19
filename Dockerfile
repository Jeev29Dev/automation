from eclipse-temurin:17
copy target/automation.jar automation.jar
cmd ["java","-jar","automation.jar"]
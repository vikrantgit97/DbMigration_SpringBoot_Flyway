FROM adoptopenjdk/openjdk11
EXPOSE 8080
ADD target/*.jar spring_boot_db_migration_app.jar
ENTRYPOINT ["java","-jar","spring_boot_db_migration_app.jar"]
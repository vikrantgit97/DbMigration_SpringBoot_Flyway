# SpringBoot with Database Migration using flyway 
    Databases are crucial for applications and during the development of the project.
    these changes imply the modification in the database structure. 
    These changes are versioned nowhere, meaning if we want to roll back, 
    there is no way to know which changes have been made to the database structure.
    
    Migration is a change applied to the database structure stored in a file.
    The filename follows a specific naming that allows keeping the order of changes with Version.
    Some tools help us handle the versioning of the database.

    Flyway migration filename pattern
    There is already a folder created where to put the migration file, it is located at resources/db/migration.
    Create the "/db/migration" directories under resources directory if they don't exist.    
    the name of the file must follow a specific pattern.
    1: The name always starts with letter "V" in uppercase.
    2: Migration version it can be 1, 001,  1.2.3, Ater that two underscores (__)
    3: Migration description: Use underscores or spaces to separate words, with a file extension of .sql (e.g., V1__CREATE_TABLES.sql)    
    4: spring.jpa.hibernate.ddl-auto set to none or validate
#### flyway dependency maven
		<dependency>
			<groupId>org.flywaydb</groupId>
			<artifactId>flyway-core</artifactId>
		</dependency>
#### Requirements
Make sure to have the followings installed:
* To run locally
    - MySQL Server [Installation guide](https://www.mysql.com/downloads/)
* To run with Docker
    - Docker (Ubuntu 22.04 [Installation guide](https://docs.docker.com/engine/install/ubuntu/))
    - Docker-compose (Ubuntu 22.04 [Installation guide](https://docs.docker.com/compose/install/)))
#### Getting Started
To get started with this project, you will need to have the following installed on your local machine:
* JDK 11+
* Maven 3+
* MySQL
#### Technologies used
    Java-11
    Spring-boot
    MySQL
    Flyway
#### Build and Run the project, follow these steps
* Locally
    - Clone the repository: `git clone https://github.com/vikrantgit97/DbMigration_SpringBoot_Flyway.git`
    - Navigate to the project directory
    - Create a database in MySql `db_migration`
    - Build the project: `mvn clean install`
    - Run `mvn clean package spring-boot:run` to build the artifact and run the application
* Docker
    - Run `docker-compose up --build -d` to run the docker services
#### Documentation (Swagger)
[SwaggerDocumentation_SpringBoot_DbMigration_Application](http://localhost:8080/swagger-ui.html) to visualize the exposed API
#### SpringBoot With Database Migration References
1)[Flyway Docs (Official)](https://flywaydb.org/documentation/usage/plugins/springboot)

2)[SpringBoot Docs with Flyway (Official)](https://docs.spring.io/spring-boot/docs/2.1.0.RELEASE/reference/html/howto-database-initialization.html)

3)[Introduction of Flyway with Spring Boot](https://medium.com/swlh/introduction-of-flyway-with-spring-boot-d7c11145d012)

4)[Database Migrations with Flyway](https://www.baeldung.com/database-migrations-with-flyway)

5)[Spring Boot - Flyway Database](https://www.tutorialspoint.com/spring_boot/spring_boot_flyway_database.htm)

6)[Database Migration in Spring Boot using Flyway](https://medium.com/javarevisited/database-migration-in-spring-boot-using-flyway-ee791db8aea0)

7)[Database Migration with Flyway](https://springframework.guru/database-migration-with-flyway/)

8)[Using Liquibase with Spring Boot](https://contribute.liquibase.com/extensions-integrations/directory/integration-docs/springboot/springboot/)

9)[Liquibase with SpringBoot](https://medium.com/javarevisited/liquibase-with-springboot-d69e08e8bf56)

10)[Use Liquibase to Safely Evolve Your Database Schema](https://www.baeldung.com/liquibase-refactor-schema-of-java-app)

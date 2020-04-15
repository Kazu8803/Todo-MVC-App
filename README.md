# Todo-MVC-App

Adaptation of Java application below to Kotlin:

https://hellokoding.com/build-a-full-stack-todomvc-web-app-and-rest-api-service-with-spring-boot-jpa-hibernate-mysql-freemarker-vuejs-and-docker/

To run the application:

1 - On file application.properties the variable "spring.datasource.url" must have value "jdbc:mysql://hk-mysql:3306/test?useSSL=false"
    and then type: docker-compose up
    
2 - After that update the value to "jdbc:mysql://localhost:3306/test?useSSL=false" and run the Todo-MVC-App

3 - Type localhost:8080 on browser
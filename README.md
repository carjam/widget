# widget

Template project for quick-start of a POC java REST API w/ mysql flyway integration.

steps to get here:
```
mysql -u root
 > CREATE USER 'carjam'@'localhost' IDENTIFIED BY 'password'
 > GRANT ALL PRIVILEGES ON *.* TO 'carjam'@'localhost';
 > FLUSH PRIVILEGES;
 > CREATE DATABASE widget;
 > GRANT ALL ON widget TO carjam@localhost ;
 > GRANT ALL PRIVILEGES ON `widget`.* TO 'carjam'@'localhost';
 > ALTER USER 'carjam'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
```

create tables & data:
Install Maven: https://maven.apache.org/install.html
Follow directions to assure JAVA_HOME and the maven bin directory are in your path.
Build: 
```
> mvn package
```
 run MainApplicationClass and flyway will automatically run:
 ```
 > mvn spring-boot:run
 ```
 verify running at http://localhost:8081/Widget/1
 (or whatever port you've specified in the application.properties file)

 to manually run flyway:
   from /widget directory > mvn compile flyway:migrate

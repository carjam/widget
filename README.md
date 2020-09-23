# widget

Contrived template project for quickly launching a POC java REST API w/ mysql flyway integration.

steps to get here:
```
mysql -u root
 > CREATE USER 'carjam'@'localhost' IDENTIFIED BY 'password'
 > GRANT ALL PRIVILEGES ON * . * TO 'carjam';
 > FLUSH PRIVILEGES;
 > CREATE DATABASE widget;
 > GRANT ALL  ON widget TO carjam ;
 > GRANT ALL PRIVILEGES ON `widget`.* TO 'carjam'@'localhost';
```

create tables & data:
Install Maven: https://maven.apache.org/install.html
Follow directions to assure JAVA_HOME and the maven bin directory are in your path.
Build: 
```
> mvn package
```
 run MainApplicationClass and flyway will automatically run
 verify running at http://localhost:8080/Widget/1

 to manually run flyway:
   from /widget directory > mvn compile flyway:migrate

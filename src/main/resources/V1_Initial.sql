-- steps to get here:
-- mysql -u root
-- > CREATE USER 'carjam'@'localhost' IDENTIFIED BY 'password'
-- > GRANT ALL PRIVILEGES ON * . * TO 'carjam';
-- > FLUSH PRIVILEGES;
-- >  CREATE DATABASE widget;
-- > GRANT ALL  ON widget TO carjam ;

USE widget;

CREATE TABLE widget (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(500) NOT NULL
);
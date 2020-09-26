CREATE USER carjam IDENTIFIED BY 'password'
--GRANT ALL PRIVILEGES ON *.* TO carjam;
--FLUSH PRIVILEGES;
USE widget;
--GRANT ALL ON widget TO carjam ;
--GRANT ALL PRIVILEGES ON `widget`.* TO carjam;
ALTER USER carjam IDENTIFIED WITH mysql_native_password BY 'password';

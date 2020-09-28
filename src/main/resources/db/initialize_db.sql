ALTER USER carjam IDENTIFIED WITH mysql_native_password BY 'password';
USE widget;
GRANT ALL ON widget TO carjam ;

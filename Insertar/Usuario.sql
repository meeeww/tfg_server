CREATE USER CoffeeTub IDENTIFIED BY "123";
ALTER USER CoffeeTub ACCOUNT UNLOCK;
ALTER USER CoffeeTub IDENTIFIED BY "123";
GRANT CREATE SESSION TO CoffeeTub;
GRANT CREATE TABLE TO CoffeeTub;
GRANT CREATE TABLESPACE TO CoffeeTub;
GRANT ALL PRIVILEGES TO CoffeeTub IDENTIFIED BY "123" WITH ADMIN OPTION;
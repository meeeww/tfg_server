CREATE TABLE TRABAJOS (
	ID_TRABAJO NUMBER(38) PRIMARY KEY,
	ID_USUARIO NUMBER(38) NOT NULL,
    SEGUNDO_APELLIDO VARCHAR(20),
    SSC VARCHAR(20),
    CODIGO_POSTAL VARCHAR(10),
    CIUDAD VARCHAR(100),
    CONDADO VARCHAR(100),
    ESTADO VARCHAR(100),
    PUESTO_TRABAJO VARCHAR(20),
    FECHA_NACIMIENTO DATE);
    
ALTER TABLE TRABAJOS ADD CONSTRAINT FK_ID_USUARIO
FOREIGN KEY (ID_USUARIO)
REFERENCES USUARIOS(ID_USUARIO);



INSERT INTO trabajos (id_trabajo, id_usuario, segundo_apellido, ssc, codigo_postal, ciudad, condado, estado, puesto_trabajo, fecha_nacimiento ) VALUES (1, 1, 'sancho', '12345', '43543', 'gtrhtr', 'htrhtr', 'htr', 'any', '01/01/1980');
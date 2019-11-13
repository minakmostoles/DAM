--------------------------------------------------------
-- Archivo creado  - domingo-abril-28-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Type TIPO_CUIDADOR
--------------------------------------------------------

  CREATE OR REPLACE TYPE "SYSTEM"."TIPO_CUIDADOR" UNDER TIPO_PERSONA ( 
    DNI varchar2(20),
    DIRECCION varchar2(100),
    OVERRIDING member function getNombre return VARCHAR2 --Lo agnado para practicar va a devolver NOMBRE + APELLIDOS1 + APELLIDO2;
);
/
CREATE OR REPLACE TYPE BODY "SYSTEM"."TIPO_CUIDADOR" AS
  OVERRIDING member function getNombre return VARCHAR2 AS
    NOMBRECOMPLETO VARCHAR(100);
  BEGIN
    NOMBRECOMPLETO := NOMBRE || ' ' || APELLIDO1 || ' ' || APELLIDO2;
    RETURN NOMBRECOMPLETO; --DEVUELVO EL NOMBRE COMPLETO
  END getNombre;
END;

/
--------------------------------------------------------
--  DDL for Type TIPO_MASCOTA
--------------------------------------------------------

  CREATE OR REPLACE TYPE "SYSTEM"."TIPO_MASCOTA" AS OBJECT ( 
    IDMASCOTA VARCHAR2(20),
    EDAD NUMBER,
    CUIDADOR TIPO_CUIDADOR, -- AQUI HAGO UNA PEQUEÑA MODIFICICACION
    VACUNAS TIPO_VACUNAS
);

/
--------------------------------------------------------
--  DDL for Type TIPO_PERSONA
--------------------------------------------------------

  CREATE OR REPLACE TYPE "SYSTEM"."TIPO_PERSONA" AS OBJECT ( 
    nombre varchar2(50),
    apellido1 varchar2(50),
    apellido2 varchar2(50),
    member function getNombre return VARCHAR2,
    member procedure setNombre (inputTexto VARCHAR2),
    member function getApellido1 return VARCHAR2,
    member procedure setApellido1 (inputTexto VARCHAR2),
    member function getApellido2 return VARCHAR2,
    member procedure setApellido2 (inputTexto VARCHAR2)
)NOT FINAL;
/
CREATE OR REPLACE TYPE BODY "SYSTEM"."TIPO_PERSONA" AS
  member function getNombre return VARCHAR2 AS
  BEGIN
    RETURN NOMBRE;
  END getNombre;

  member procedure setNombre (inputTexto VARCHAR2) AS
  BEGIN
    NOMBRE:=inputTexto;
  END setNombre;

  member function getApellido1 return VARCHAR2 AS
  BEGIN
    RETURN APELLIDO1;
  END getApellido1;

  member procedure setApellido1 (inputTexto VARCHAR2) AS
  BEGIN
    APELLIDO1:=inputTexto;
  END setApellido1;

  member function getApellido2 return VARCHAR2 AS
  BEGIN
    RETURN APELLIDO2;
  END getApellido2;

  member procedure setApellido2 (inputTexto VARCHAR2) AS
  BEGIN
    APELLIDO2:=inputTexto;
  END setApellido2;
END;

/
--------------------------------------------------------
--  DDL for Type TIPO_VACUNAS
--------------------------------------------------------

  CREATE OR REPLACE TYPE "SYSTEM"."TIPO_VACUNAS" AS VARRAY(10) OF VARCHAR2(100);

/
--------------------------------------------------------
--  DDL for Table TABLA_MASCOTAS
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."TABLA_MASCOTAS" OF "SYSTEM"."TIPO_MASCOTA" 
 OIDINDEX  ( PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ) 
 PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.TABLA_MASCOTAS
SET DEFINE OFF;
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('A001','1',SYSTEM.TIPO_CUIDADOR('Mario', 'Rubio', 'Avila', '12345678D', 'C/CALLE'),SYSTEM.TIPO_VACUNAS('Parvovirus', 'Moquillo canino', 'Coronavirus'));
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('A002','2',SYSTEM.TIPO_CUIDADOR('Bea', 'Mendez', 'Blas', '12345679A', 'C/CALLE'),SYSTEM.TIPO_VACUNAS('Parvovirus', 'Moquillo canino', 'Coronavirus', 'Hepatitis', 'Parainfluenza', 'Leptospirosis', 'Rabia', 'parainfluenza'));
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('A003','2',SYSTEM.TIPO_CUIDADOR('Laura', 'De Domingo', 'Hernandez', '12345680B', 'C/CALLE'),SYSTEM.TIPO_VACUNAS('Parvovirus', 'Moquillo canino', 'Coronavirus', 'Hepatitis', 'Rabia'));
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('D03','4',SYSTEM.TIPO_CUIDADOR('00000002C', 'Jorge', 'Campos', 'Mendoza', 'Av.Atocha Madrid'),SYSTEM.TIPO_VACUNAS('Parvovirus', 'Moquillo canino', 'Coronavirus', 'Hepatitis', 'Rabia'));
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('D04','8',SYSTEM.TIPO_CUIDADOR('00000003D', 'Rocio', 'Fuente', 'Diaz', 'C/Constitucion Fuenlabra'),SYSTEM.TIPO_VACUNAS('Parvovirus', 'Moquillo canino', 'Coronavirus', 'Rabia'));
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('D05','2',SYSTEM.TIPO_CUIDADOR('00000004E', 'Beatriz', 'Mendez', 'Blas', 'C/Larga Alcorcon'),SYSTEM.TIPO_VACUNAS('Parvovirus'));
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('Ñ01','1',SYSTEM.TIPO_CUIDADOR('2343', 'Beatriz', 'Campos', 'Hernandez',  'Cuatro Caminos Madrid'),SYSTEM.TIPO_VACUNAS('Parvo', 'Moquillo'));
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('D01','1',SYSTEM.TIPO_CUIDADOR('00000000A', 'Marco', 'Herraz', 'Rodriguez', 'Cuatro Caminos Madrid'),SYSTEM.TIPO_VACUNAS('Parvo', 'Moquillo canino', 'Coronavirus', 'Koko'));
Insert into SYSTEM.TABLA_MASCOTAS (IDMASCOTA,EDAD,CUIDADOR,VACUNAS) values ('D02','3',SYSTEM.TIPO_CUIDADOR('00000001B', 'Mario', 'Rubio', 'Avila', 'Av.Estrecho Madrid'),SYSTEM.TIPO_VACUNAS('Parvovirus', 'Moquillo canino', 'Coronavirus', 'Hepatitis', 'Parainfluenza', 'Leptospirosis', 'Rabia'));

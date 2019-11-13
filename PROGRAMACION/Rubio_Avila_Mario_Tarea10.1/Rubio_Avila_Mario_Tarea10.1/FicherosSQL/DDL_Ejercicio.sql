--Tipo persona (No se pide pero era para practicar herencias)
CREATE OR REPLACE TYPE TIPO_PERSONA AS OBJECT ( 
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
--Body del tipo persona
CREATE OR REPLACE TYPE BODY TIPO_PERSONA AS
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
--Tipo cuidador 
CREATE OR REPLACE TYPE TIPO_CUIDADOR UNDER TIPO_PERSONA ( 
    DNI varchar2(20),
    DIRECCION varchar2(100),
    OVERRIDING MEMBER FUNCTION getNombre return VARCHAR2 --Lo agnado para practicar va a devolver NOMBRE + APELLIDOS1 + APELLIDO2;
);

--BODY DEL CUIDADOR
CREATE OR REPLACE
TYPE BODY TIPO_CUIDADOR AS
  OVERRIDING member function getNombre return VARCHAR2 AS
    NOMBRECOMPLETO VARCHAR(100);
  BEGIN
    NOMBRECOMPLETO := NOMBRE || ' ' || APELLIDO1 || ' ' || APELLIDO2;
    RETURN NOMBRECOMPLETO; --DEVUELVO EL NOMBRE COMPLETO
  END getNombre;
END;

/
--Creo la tabla de cuidadores (USADO PARA UNAS PRUEBAS QUE REALICE)
CREATE TABLE TABLA_CUIDADORES OF TIPO_CUIDADOR( CONSTRAINT "DNI" PRIMARY KEY ("DNI"));

--Tipo vacunas que es un array de textos
CREATE OR REPLACE TYPE TIPO_VACUNAS AS VARRAY(10) OF VARCHAR2(100);

/
--Tipo Mascota
CREATE OR REPLACE TYPE TIPO_MASCOTA AS OBJECT ( 
    IDMASCOTA VARCHAR2(20),
    EDAD NUMBER,
    CUIDADOR TIPO_CUIDADOR, -- AQUI HAGO UNA PEQUEÑA MODIFICICACION
    VACUNAS TIPO_VACUNAS
);
/
--Creo la tabla mascotas
CREATE TABLE TABLA_MASCOTAS OF TIPO_MASCOTA (CONSTRAINT "IDMASCOTA" PRIMARY KEY ("IDMASCOTA"));
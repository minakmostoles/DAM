INSERT INTO TABLA_MASCOTAS VALUES(
TIPO_MASCOTA('B001',1,
TIPO_CUIDADOR('Mario','Rubio','Avila','12345678D','C/CALLE'),
TIPO_VACUNAS ('Parvovirus','Moquillo canino','Coronavirus'))
);--FIN REGISTRO
INSERT INTO TABLA_MASCOTAS VALUES(
TIPO_MASCOTA('A002',2,
TIPO_CUIDADOR('Bea','Hernandez','Gutierrez','12345679A','C/CALLE'),
TIPO_VACUNAS ('Parvovirus','Moquillo canino','Coronavirus','Hepatitis','Parainfluenza','Leptospirosis','Rabia','parainfluenza'))
);--FIN REGISTRO
INSERT INTO TABLA_MASCOTAS VALUES(
TIPO_MASCOTA('A003',2,
TIPO_CUIDADOR('Laura','Torremocha','Hernandez','12345680B','C/CALLE'),
TIPO_VACUNAS ('Parvovirus','Moquillo canino','Coronavirus','Hepatitis','Rabia'))
);--FIN REGISTRO

SELECT * FROM TABLA_MASCOTAS;

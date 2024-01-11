CREATE DATABASE Act2
CREATE TABLE empleado (
	 DNI char (9) Not Null  ,
	 PRIMARY KEY(DNI)
	)
CREATE TABLE departamento (
	 ndepartamento int Not Null  ,
	 PRIMARY KEY(ndepartamento)
	)

CREATE TABLE trabaja  (
	   DNI char (9),
	   ndepartamento int,
	   CONSTRAINT pktrabaja primary key (DNI,ndepartamento),
	   CONSTRAINT fktrabajaempleados FOREIGN KEY (DNI) REFERENCES empleado (DNI), 
	   CONSTRAINT fktrabaja FOREIGN KEY (ndepartamento) REFERENCES departamento (ndepartamento),
	)
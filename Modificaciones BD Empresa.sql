
CREATE DATABASE IF NOT EXISTS Ejemplos;

USE Ejemplos;
/*Neos Rafael Ruiz */
    
 CREATE TABLE Empleados (
    numemp INT,
    nombre VARCHAR(50),
    edad INT,
    oficina VARCHAR(50),
    puesto VARCHAR(50),
    fecha_contrato DATE,
    jefe INT,
    cuota DECIMAL(8,2),
    ventas DECIMAL(8,2)
);

CREATE TABLE Clientes (
    numclie INT,
    nombre VARCHAR(50),
    resp INT,
    limitecredito DECIMAL(8,2)
);

CREATE TABLE Oficinas (
    oficina VARCHAR(50),
    ciudad VARCHAR(50),
    region VARCHAR(50),
    dir INT,
    objetivo DECIMAL(8,2),
    ventas DECIMAL(8,2)
);

CREATE TABLE Productos (
    idfab INT,
    idproducto INT,
    descripcion VARCHAR(100),
    precio DECIMAL(8,2),
    existencias INT
);

CREATE TABLE Pedidos (
    numpedido INT,
    fechapedido DATE,
    clie INT,
    resp INT,
    fab INT,
    producto INT,
    cant INT,
    importe DECIMAL(8,2)
);

/*Añadir las PK y FK a las tablas*/
    
ALTER TABLE Empleados ADD PRIMARY KEY (numemp);
ALTER TABLE Empleados ADD FOREIGN KEY (oficina) REFERENCES Oficinas (oficina);
ALTER TABLE Empleados ADD FOREIGN KEY (jefe) REFERENCES Empleados (numemp);

ALTER TABLE Clientes ADD PRIMARY KEY (numclie);
ALTER TABLE Clientes ADD FOREIGN KEY (resp) REFERENCES Empleados (numemp);

ALTER TABLE Oficinas ADD PRIMARY KEY (oficina);
ALTER TABLE Oficinas ADD FOREIGN KEY (dir) REFERENCES Empleados (numemp);

ALTER TABLE Productos ADD PRIMARY KEY (idfab, idproducto);

ALTER TABLE Pedidos ADD PRIMARY KEY (numpedido);
ALTER TABLE Pedidos ADD FOREIGN KEY (clie) REFERENCES Clientes (numclie);
ALTER TABLE Pedidos ADD FOREIGN KEY (resp) REFERENCES Empleados (numemp);
ALTER TABLE Pedidos ADD FOREIGN KEY (fab) REFERENCES Productos (idfab);
ALTER TABLE Pedidos ADD FOREIGN KEY (producto) REFERENCES Productos (idproducto);

/*Eliminar las restricciones de las tablas*/
 
ALTER TABLE Empleados DROP PRIMARY KEY;
ALTER TABLE Empleados DROP FOREIGN KEY Empleados_ibfk_1;
ALTER TABLE Empleados DROP FOREIGN KEY Empleados_ibfk_2;

ALTER TABLE Clientes DROP PRIMARY KEY;
ALTER TABLE Clientes DROP FOREIGN KEY Clientes_ibfk_1;

ALTER TABLE Oficinas DROP PRIMARY KEY;
ALTER TABLE Oficinas DROP FOREIGN KEY Oficinas_ibfk_1;

ALTER TABLE Productos DROP PRIMARY KEY;

ALTER TABLE Pedidos DROP PRIMARY KEY;
ALTER TABLE Pedidos DROP FOREIGN KEY Pedidos_ibfk_1;
ALTER TABLE Pedidos DROP FOREIGN KEY Pedidos_ibfk_2;
ALTER TABLE Pedidos DROP FOREIGN KEY Pedidos_ibfk_3;
ALTER TABLE Pedidos DROP FOREIGN KEY Pedidos_ibfk_4;

/*Añadir nuevos campos a las tablas*/
 
ALTER TABLE Empleados ADD sueldo DECIMAL(8,2);
ALTER TABLE Clientes ADD cuenta_bancaria VARCHAR(20);
ALTER TABLE Productos ADD color VARCHAR(20);

/*Modificar el tipo de datos de un campo de una tabla*/
 
ALTER TABLE Empleados MODIFY sueldo DECIMAL(3,1);
ALTER TABLE Empleados MODIFY nombre VARCHAR(50);
ALTER TABLE Oficinas MODIFY ventas DECIMAL(4,1);

/*Eliminar los campos añadidos en el paso anterior*/
 

ALTER TABLE Empleados DROP COLUMN sueldo;
ALTER TABLE Clientes DROP COLUMN cuenta_bancaria;
ALTER TABLE Productos DROP COLUMN color;

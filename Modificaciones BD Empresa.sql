
CREATE DATABASE IF NOT EXISTS Ejemplos;

USE Ejemplos;

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

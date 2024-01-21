
CREATE DATABASE IF NOT EXISTS Ejemplos;

USE Ejemplos;

CREATE TABLE DatosRestrictivos (
    ID SmallInt AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(15) NOT NULL UNIQUE CHECK (NOT (Nombre LIKE 'N%' OR Nombre LIKE 'X%')),
    Numpelos Int CHECK (Numpelos BETWEEN 0 AND 150000),
    TipoRopa Char(1) CHECK (TipoRopa IN ('C', 'F', 'E', 'P', 'B', 'N')),
    NumSuerte TinyInt CHECK (NumSuerte BETWEEN 10 AND 40 AND NumSuerte % 3 = 0),
    Minutos TinyInt CHECK ((Minutos BETWEEN 20 AND 85) OR (Minutos BETWEEN 120 AND 185))
);


CREATE TABLE DatosRelacionados (
    NombreRelacionado VARCHAR(15),
    FOREIGN KEY (NombreRelacionado) REFERENCES DatosRestrictivos(Nombre),
    PalabraTabu VARCHAR(20) CHECK (PalabraTabu NOT IN ('MENA', 'Gurtel', 'ERE', 'Procés', 'sobresueldo') AND NOT PalabraTabu LIKE '%eo%'),
    NumRarito TinyInt CHECK (NumRarito < 20 AND NumRarito NOT IN (2, 3, 5, 7, 11, 13, 17, 19)),
    NumMasgrande SmallInt CHECK (NumMasgrande BETWEEN NumRarito AND 1000),
    PRIMARY KEY (NumMasgrande)
);

CREATE TABLE DatosAlMogollon (
    ID SmallInt CHECK (ID % 5 <> 0) PRIMARY KEY,
    LimiteSuperior SmallInt CHECK (LimiteSuperior BETWEEN 1500 AND 2000),
    OtroNumero SmallInt UNIQUE CHECK (OtroNumero > ID AND OtroNumero < LimiteSuperior),
    NumeroQueVinoDelMasAlla SmallInt,
    FOREIGN KEY (NumeroQueVinoDelMasAlla) REFERENCES DatosRelacionados(NumMasgrande),
    Etiqueta VARCHAR(3) CHECK (Etiqueta NOT IN ('lao', 'leo', 'lio', 'luo'))
);

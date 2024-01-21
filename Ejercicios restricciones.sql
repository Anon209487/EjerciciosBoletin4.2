CREATE TABLE CriaturitasRaras(
	ID tinyint Not NULL,
	Nombre nvarchar(30) Not NULL,
	FechaNac Date NULL, 
	NumeroPie SmallInt NULL CHECK (NumeroPie BETWEEN 25 AND 60),
	NivelIngles NChar(2) NULL CHECK (NivelIngles IN ('A0', 'A1', 'A2', 'B1', 'B2', 'C1', 'C2')),
	Historieta VarChar(300) NULL CHECK (Historieta NOT LIKE '%oscuro%' AND Historieta NOT LIKE '%apocalipsis%'),
	NumeroChico TinyInt NULL CHECK (NumeroChico < 1000),
	NumeroGrande BigInt NULL CHECK (NumeroGrande > NumeroChico * 100),
	NumeroIntermedio SmallInt NULL CHECK (NumeroIntermedio % 2 = 0 AND NumeroIntermedio BETWEEN NumeroChico AND NumeroGrande),
	Temperatura Decimal(3,1) NULL CHECK (Temperatura BETWEEN 32.5 AND 44),
	CONSTRAINT [PK_CriaturitasEx] PRIMARY KEY(ID),
	CONSTRAINT [FK_CriaturitasFecha] CHECK (FechaNac < CURRENT_DATE)
);

// Escribe un programa que muestre la tabla de multiplicar de un número.
// Tiene que solicitar el número y luego mostrar la tabla de la siguientr forma:
// Nx1 =....
// Nx2 =....
// Nx3 =....

Proceso EjercicioTema0_12
	Definir i,j, num Como Entero;
	Escribir "Introduce un número";
	Leer num;
	j <- 1;

	
	
	Para i<-num Hasta num*10 Con Paso num Hacer
		j <- j+j;
		Escribir num, "x",j," =", i;
	FinPara
	
	
FinProceso

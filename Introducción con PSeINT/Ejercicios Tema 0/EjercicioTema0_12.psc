// Escribe un programa que muestre la tabla de multiplicar de un n�mero.
// Tiene que solicitar el n�mero y luego mostrar la tabla de la siguientr forma:
// Nx1 =....
// Nx2 =....
// Nx3 =....

Proceso EjercicioTema0_12
	Definir i,j, num Como Entero;
	Escribir "Introduce un n�mero";
	Leer num;
	j <- 1;

	
	
	Para i<-num Hasta num*10 Con Paso num Hacer
		j <- j+j;
		Escribir num, "x",j," =", i;
	FinPara
	
	
FinProceso

// Escribe un programa que muestre la tabla de multiplicar de un número. Tiene que solicitar el número y luego mostrar la tabla de la siguiente forma:
// Nx1 = ?
// Nx2 = ?
// Nx3 = ?
//Nx10 = ?

Proceso EjercicioTema0_12
	
	//Declaro las variavles y pregunto un número por consola
	Definir num, i, result Como Entero;
	Escribir "Introduce el número del que quieres saber su tabla de multiplicar: ";
	Leer num;
	
	//Utilizo un bucle for para imprimir por pantalla el resultado.
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		result <- num * i;
		Escribir num, "x", i, "=", result;
	FinPara
	
	
	
FinProceso

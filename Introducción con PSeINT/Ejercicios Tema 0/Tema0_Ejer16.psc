//Escribe un programa que dibuje una pirámide de altura N. Tendrás que solicitar la altura de la pirámide y luego debes pintarla de la siguiente manera:
//Altura 6:
//	    *
//     ***
//    *****
//   *******
//  *********
// ***********

Proceso Tema0_Ejer16
	Definir altura, i, j Como Entero;
	
	//Solicito la altura de la pirámide por consola
	Escribir "¿Cómo de alta es la pirámide?";
	Leer altura;
	
	// Bucle para dibujar la piramide
	Para i<-1 Hasta altura Con Paso 1 Hacer
		// Espacios en blanco
		Para j<-1 Hasta altura-i Con Paso 1 Hacer
			Escribir " " Sin Saltar;
		FinPara
		// Cantidad de *
		Para j<-1 Hasta 2*i-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar;
		FinPara
		// Salto de línea para comenzar el siguiente nivel de la pirámide
		Escribir "";
	FinPara
	
FinProceso


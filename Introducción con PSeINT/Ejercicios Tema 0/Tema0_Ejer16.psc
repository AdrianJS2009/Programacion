//Escribe un programa que dibuje una pir�mide de altura N. Tendr�s que solicitar la altura de la pir�mide y luego debes pintarla de la siguiente manera:
//Altura 6:
//	    *
//     ***
//    *****
//   *******
//  *********
// ***********

Proceso Tema0_Ejer16
	Definir altura, i, j Como Entero;
	
	//Solicito la altura de la pir�mide por consola
	Escribir "�C�mo de alta es la pir�mide?";
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
		// Salto de l�nea para comenzar el siguiente nivel de la pir�mide
		Escribir "";
	FinPara
	
FinProceso


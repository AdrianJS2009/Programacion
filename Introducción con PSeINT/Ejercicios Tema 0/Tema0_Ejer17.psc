//Escribe un programa igual que el anterior pero con la pir�mide invertida

Proceso Tema0_Ejer17
	Definir altura, i, j Como Entero;
	
	// Solicito la altura de la pir�mide invertida
	Escribir "�Qu� altura tiene la pir�mide invertida?";
	Leer altura;
	
	// Bucle para dibujar la piramide invertida
	Para i<-altura Hasta 1 Con Paso -1 Hacer
		// Espacios en blanco
		Para j<-1 Hasta altura-i Con Paso 1 Hacer
			Escribir " " Sin Saltar;
		FinPara
		// Cantidad de *
		Para j<-1 Hasta 2*i-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar;
		FinPara
		// Salto de l�nea para ir al siguiente nivel de la pir�mide
		Escribir "";
	FinPara
FinProceso

//Escribe un programa igual que el anterior pero con la pirámide invertida

Proceso Tema0_Ejer17
	Definir altura, i, j Como Entero;
	
	// Solicito la altura de la pirámide invertida
	Escribir "¿Qué altura tiene la pirámide invertida?";
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
		// Salto de línea para ir al siguiente nivel de la pirámide
		Escribir "";
	FinPara
FinProceso

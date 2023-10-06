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


//Otra forma de hacer el ejercicio

//Definir altura, asteriscos, espacios, nivel, i Como Entero;
//
//Escribir "Dame la altura de tú piramide": Sin Saltar;
//	Leer altura;
//	
//	asteriscos <- (2*altura)-1;
//	espacios <- 0;
//	nivel <- 1; // Variable que almacena el nivel en el que me encuentro
//	
//	Mientras (nivel <= altura) Hacer
//		// Espacios por delante
//		Para i<- Hasta espacios Hacer
//			Escribir " ";
//		FinPara
//		
//		// Dibujamos astericos
//		Para i<-1 Hasta asteriscos Hacer
//			Escribir "*" Sin Saltar;
//		FinPara
//		// Salto de linea
//		Escribir " ";
//		
//		//Actualizo variables
//		espacios <- espacios+1;
//		asteriscos <- asteriscos -2;
//		nivel <- nivel +1;
//		
//	FinMientras
//FinMientras
//		
//Realiza un programa en pseudocódigo con PSeInt que pida la base y la altura de un rectángulo para pintarlo por pantalla utilizando asteriscos (*). Tras solicitar estos dos datos, debe mostrarse el siguiente menú:
//		1. Pinta el rectángulo verticalmente (normal).
//		2. Pinta el rectángulo horizontalmente (invertido).
//		3. Salir.
//		El programa mostrará dichas opciones mientras no se seleccione la opción 3 de salir. Es decir cada vez que realiza una acción tiene que volver a pintar el menú y permanecer a la espera de elegir otra opción. Si la opción elegida es la 3, el programa debe terminar.
//				
//El rectángulo se ha de pintar con asteriscos (*). Cada asterisco identifica a una unidad de la dimensión.


Proceso examen_problema2
	
		
		// Declaración de variables
		Definir base, altura, opcion, i, j Como Entero;
	
		
		// Solicitar la base y altura del rectángulo
		Escribir "Introduce la base del rectangulo: ";
		Leer base;
		Escribir "Introduce la altura del rectangulo: ";
		Leer altura;
		
		Mientras base <= 0 O altura <= 0 Hacer
			Escribir "Por favor, introduce valores positivos y mayores a 0 para la base y la altura.";
			Escribir "Introduce la base del rectangulo: ";
			Leer base;
			Escribir "Introduce la altura del rectangulo: ";
			Leer altura;
		FinMientras
		
		//Bucle para menejar el menu hasta seleccionar "3"
		Repetir
			Escribir "########################################";
			Escribir "Selecciona una opción:";
			Escribir "1. Pinta el rectangulo verticalmente (normal).";
			Escribir "2. Pinta el rectangulo horizontalmente (invertido).";
			Escribir "3. Salir.";
			Escribir "#########################################";
			Leer opcion;
			
			// Si se escoge la opción 1:
			Segun opcion Hacer
				Caso 1:
					// dibujar rectangulo de forma vertical
					Para i <- 1 Hasta altura Hacer
						Para j <- 1 Hasta base Hacer
							Escribir Sin Saltar "*";
						FinPara
						Escribir "";
					FinPara
				Caso 2:
					// dibujar rectangulo de forma horizontal
					Para i <- 1 Hasta base Hacer
						Para j <- 1 Hasta altura Hacer
							Escribir Sin Saltar "*";
						FinPara
						Escribir "";
					FinPara
				Caso 3:
					// salir del menu
					Escribir "Has salido del programa...";
				De Otro Modo:
					Escribir "Por favor, selecciona una de las opciones disponibles, 1, 2 o 3.";
			FinSegun
			
		Hasta Que opcion = 3
	
FinProceso

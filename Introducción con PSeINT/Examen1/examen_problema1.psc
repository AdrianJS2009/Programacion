//Realiza un programa en pseudocódigo con PSeInt que permita introducir un año y determine si es bisiesto o no. Un año se considera bisiesto si se cumple alguna de las siguientes condiciones:
//			
//			El año es divisible por 4 y no por 100.
//			El año es divisible por 100 y 400.
//		Ejemplo de salida del programa:
//		Introduzca un año: 2024
//			El año 2024 es bisiesto.


Proceso examen_problema1
	
	
	// Defino las variables que voy a utilizar
	
		Definir fecha Como Entero;
		Escribir "Introduce un año: ";
		Leer fecha;
		

		// Controlo que el año introducido es entero y positivo
		Mientras fecha < 1 Hacer
			Escribir "Por favor, introduce un año válido: ";
			Leer fecha;
		FinMientras
		
		// Controlo si es bisiesto o no
		Si fecha % 4 = 0 Y fecha % 100 <> 0 Entonces
			Escribir "El año ", fecha, " es bisiesto.";
		Si fecha % 400 = 0 Entonces
			Escribir "El año ", fecha, " es bisiesto.";
		FinSi;
		
		Sino
			Escribir "El año ", fecha, " no es bisiesto.";
		FinSi
			
	
FinProceso

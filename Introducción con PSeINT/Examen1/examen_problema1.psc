//Realiza un programa en pseudoc�digo con PSeInt que permita introducir un a�o y determine si es bisiesto o no. Un a�o se considera bisiesto si se cumple alguna de las siguientes condiciones:
//			
//			El a�o es divisible por 4 y no por 100.
//			El a�o es divisible por 100 y 400.
//		Ejemplo de salida del programa:
//		Introduzca un a�o: 2024
//			El a�o 2024 es bisiesto.


Proceso examen_problema1
	
	
	// Defino las variables que voy a utilizar
	
		Definir fecha Como Entero;
		Escribir "Introduce un a�o: ";
		Leer fecha;
		

		// Controlo que el a�o introducido es entero y positivo
		Mientras fecha < 1 Hacer
			Escribir "Por favor, introduce un a�o v�lido: ";
			Leer fecha;
		FinMientras
		
		// Controlo si es bisiesto o no
		Si fecha % 4 = 0 Y fecha % 100 <> 0 Entonces
			Escribir "El a�o ", fecha, " es bisiesto.";
		Si fecha % 400 = 0 Entonces
			Escribir "El a�o ", fecha, " es bisiesto.";
		FinSi;
		
		Sino
			Escribir "El a�o ", fecha, " no es bisiesto.";
		FinSi
			
	
FinProceso

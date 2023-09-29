//	Escribe un programa que determine si el número introducido es positivo o negativo

Proceso Tema0_Ejer2
	//Defino la variable num con la que voy a trabajar.
	Definir num Como Entero;
	
		//Pregunto por consola al usuario que introduza un número.
		Escribir "Introduce un número: ";
		Leer num;
		
		Si num > 0 Entonces
			Escribir "El número es positivo.";
		Sino Si num < 0 Entonces
			Escribir "El número es negativo.";
		Sino
			Escribir "El número es igual a cero.";
			Fin Si
		Fin Si
FinProceso


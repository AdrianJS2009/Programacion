//	Escribe un programa que determine si el n�mero introducido es positivo o negativo

Proceso Tema0_Ejer2
	//Defino la variable num con la que voy a trabajar.
	Definir num Como Entero;
	
		//Pregunto por consola al usuario que introduza un n�mero.
		Escribir "Introduce un n�mero: ";
		Leer num;
		
		Si num > 0 Entonces
			Escribir "El n�mero es positivo.";
		Sino Si num < 0 Entonces
			Escribir "El n�mero es negativo.";
		Sino
			Escribir "El n�mero es igual a cero.";
			Fin Si
		Fin Si
FinProceso


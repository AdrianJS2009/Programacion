//Escribe un programa que sume los n primeros números.
//Tendrás que solicitar cúantos números habrá que sumar.

Proceso Tema0_Ejer12
	
	Definir num, i, suma Como Entero;
	Escribir "Introduce la cantidad de números que quieres sumar: ";
	Leer num;
	suma <- 0;
	
	//Bucle for para sumar los N primeros números
	//Siendo n el número guardado en la variable num.
	
	Para i <- 1 Hasta num Con Paso 1 Hacer
		suma <- suma + i;
	FinPara
	
	//Muestro el resultado por pantalla.
	Escribir "La suma de los ", num, " primeros números es:", suma;
FinProceso

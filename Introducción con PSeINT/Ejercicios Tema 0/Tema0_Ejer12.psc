//Escribe un programa que sume los n primeros n�meros.
//Tendr�s que solicitar c�antos n�meros habr� que sumar.

Proceso Tema0_Ejer12
	
	Definir num, i, suma Como Entero;
	Escribir "Introduce la cantidad de n�meros que quieres sumar: ";
	Leer num;
	suma <- 0;
	
	//Bucle for para sumar los N primeros n�meros
	//Siendo n el n�mero guardado en la variable num.
	
	Para i <- 1 Hasta num Con Paso 1 Hacer
		suma <- suma + i;
	FinPara
	
	//Muestro el resultado por pantalla.
	Escribir "La suma de los ", num, " primeros n�meros es:", suma;
FinProceso

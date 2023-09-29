//Escribe un programa que calcule el factorial de un n�mero.
//Tendr�s que solicitar el n�mero para acto seguido mostrar el factorial del mismo.
//Factorial de n = (n)*(n-1)*(n-2)*...*(1)

Proceso Tema0_Ejer15
	Definir num, i, fact Como Entero;
	
	//Solicito el n�mero por consola
	Escribir "Introduce un n�mero:";
	Leer num;
	
	fact <- 1;
	
	//Bucle for para calcular el factorial del n�mero
	Para i<-2 Hasta num Con Paso 1 Hacer
		fact <- fact * i;
	FinPara
	
	// Muestro el resultado por pantalla
	Escribir "Factorial de ", num, " es:", fact;
FinProceso

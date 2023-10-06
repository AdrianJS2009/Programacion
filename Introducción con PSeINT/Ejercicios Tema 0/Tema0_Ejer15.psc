//Escribe un programa que calcule el factorial de un número.
//Tendrás que solicitar el número para acto seguido mostrar el factorial del mismo.
//Factorial de n = (n)*(n-1)*(n-2)*...*(1)

Proceso Tema0_Ejer15
	Definir num, i, fact Como Entero;
	
	//Solicito el número por consola
	Escribir "Introduce un número para saber su factorial:";
	Leer num;
	
	fact <- 1;
	
	//Bucle for para calcular el factorial del número
	Para i<-1 Hasta num Con Paso 1 Hacer
		fact <- fact * i;
	FinPara
	
	// Muestro el resultado por pantalla
	Escribir "Factorial de ", num, " es: ", fact;
FinProceso

// Realizado con un While.

//Mientras (i<=num) Hacer
//	fact <- fact * i;
//	i<- i + 1;
//FinMientras



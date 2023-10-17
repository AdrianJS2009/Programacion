//Realiza un programa en pseudoc�digo con PSeInt que solicite dos n�meros. Una vez introducidos debe mostrar los divisores propios de cada n�mero, incluyendo el 1 pero no al propio n�mero. Adem�s, debe tambi�n mostrar la suma de dichos divisores para determinar al final si ambos son n�meros amigos, es decir, si la suma de dichos divisores es igual que el otro n�mero introducido.
//			
//		Ejemplo de salida del programa:
//		Introduzca un n�mero: 220
//		Introduzca otro n�mero: 284
//		Los divisores propios de 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
//		La suma de los divisores de 220 es = 284
//			
//		Los divisores propios de 284 son: 1, 2, 4, 71, 142
//		La suma de los divisores de 284 es = 220
//		220 y 284 son n�meros amigos
//			

Proceso examen_problema3
	
		
		// Declaro las variables que voy a usar
		Definir num1, num2, suma1, suma2, i Como Entero;
		
		// Pregunto num1 y num2 al usuario y los almaceno.
		Escribir "Introduce un n�mero: ";
		Leer num1;
		Escribir "Introduce otro n�mero: ";
		Leer num2;
		
		// Controlo que los n�meros almacenados son positivos y entero.
		Mientras num1 <= 0 O num2 <= 0 Hacer
			Escribir "Por favor, introduce n�meros que sean positivos y adem�s mayor que 0";
			Escribir "Introduce un n�mero: ";
			Leer num1;
			Escribir "Introduce el segundo n�mero: ";
			Leer num2;
		FinMientras
		
		// Inicio ambas sumas a 0
		suma1 <- 0;
		suma2 <- 0;
		
		// Encuentro con el for los divisores del primer n�mero y los sumo
		Escribir "Los divisores propios de ", num1, " son: ";
		Para i <- 1 Hasta num1/2 Hacer
			Si num1 % i = 0 Entonces
				Escribir Sin Saltar i, " ";
				suma1 <- suma1 + i;
			FinSi
		FinPara
		
		Escribir "";
		Escribir "La suma de los divisores de ", num1, " es = ", suma1;
		
		// Encuentro con otro for los divisores del segundo n�mero y y los sumo
		Escribir "Los divisores propios de ", num2, " son: ";
		Para i <- 1 Hasta num2/2 Hacer
			Si num2 % i = 0 Entonces
				Escribir Sin Saltar i, " ";
				suma2 <- suma2 + i;
			FinSi
		FinPara
		
		
		Escribir "";
		Escribir "La suma de los divisores de ", num2, " es = ", suma2;
		
		// Confirmo si ambos n�meros son "n�meros amigos"
		Si suma1 = num2 Y suma2 = num1 Entonces
			Escribir num1, " y ", num2, " son n�meros amigos.";
		Sino
			Escribir num1, " y ", num2, " no son n�meros amigos.";
		FinSi

	
FinProceso

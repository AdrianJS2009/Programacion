//Realiza un programa en pseudocódigo con PSeInt que solicite dos números. Una vez introducidos debe mostrar los divisores propios de cada número, incluyendo el 1 pero no al propio número. Además, debe también mostrar la suma de dichos divisores para determinar al final si ambos son números amigos, es decir, si la suma de dichos divisores es igual que el otro número introducido.
//			
//		Ejemplo de salida del programa:
//		Introduzca un número: 220
//		Introduzca otro número: 284
//		Los divisores propios de 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110
//		La suma de los divisores de 220 es = 284
//			
//		Los divisores propios de 284 son: 1, 2, 4, 71, 142
//		La suma de los divisores de 284 es = 220
//		220 y 284 son números amigos
//			

Proceso examen_problema3
	
		
		// Declaro las variables que voy a usar
		Definir num1, num2, suma1, suma2, i Como Entero;
		
		// Pregunto num1 y num2 al usuario y los almaceno.
		Escribir "Introduce un número: ";
		Leer num1;
		Escribir "Introduce otro número: ";
		Leer num2;
		
		// Controlo que los números almacenados son positivos y entero.
		Mientras num1 <= 0 O num2 <= 0 Hacer
			Escribir "Por favor, introduce números que sean positivos y además mayor que 0";
			Escribir "Introduce un número: ";
			Leer num1;
			Escribir "Introduce el segundo número: ";
			Leer num2;
		FinMientras
		
		// Inicio ambas sumas a 0
		suma1 <- 0;
		suma2 <- 0;
		
		// Encuentro con el for los divisores del primer número y los sumo
		Escribir "Los divisores propios de ", num1, " son: ";
		Para i <- 1 Hasta num1/2 Hacer
			Si num1 % i = 0 Entonces
				Escribir Sin Saltar i, " ";
				suma1 <- suma1 + i;
			FinSi
		FinPara
		
		Escribir "";
		Escribir "La suma de los divisores de ", num1, " es = ", suma1;
		
		// Encuentro con otro for los divisores del segundo número y y los sumo
		Escribir "Los divisores propios de ", num2, " son: ";
		Para i <- 1 Hasta num2/2 Hacer
			Si num2 % i = 0 Entonces
				Escribir Sin Saltar i, " ";
				suma2 <- suma2 + i;
			FinSi
		FinPara
		
		
		Escribir "";
		Escribir "La suma de los divisores de ", num2, " es = ", suma2;
		
		// Confirmo si ambos números son "números amigos"
		Si suma1 = num2 Y suma2 = num1 Entonces
			Escribir num1, " y ", num2, " son números amigos.";
		Sino
			Escribir num1, " y ", num2, " no son números amigos.";
		FinSi

	
FinProceso

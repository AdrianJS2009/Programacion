Proceso Tema0_Ejer19
	Definir num, i, counter Como Entero;
	
	//Solicito el número por consola
	Escribir "Introduce un número:";
	Leer num;
	
	//Usaré un contador para contar los divisores de num
	counter <- 0;
	
	
	//Uso un bucle For que lee desde 1 hasta num
	//Si el número de "i" se divide por "num" y el resto es 0, el contador aumenta
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si num MOD i = 0 Entonces
			counter <- counter + 1;
		FinSi
	FinPara
	
	//Si el contador es = a 2 el número es primo
	Si counter = 2 Entonces
		Escribir "El número ", num, " es primo.";
	Sino
		Escribir "El número ", num, " no es primo.";
	FinSi
	
FinProceso

//Otra forma de hacerlo mediante un do while
//Repetir
//	counter <- num MOD;
//	Si resto = 0 Entonces
//		primo <- Falso;
//	FinSi
//	i <- i + 1;
//Hasta Que primo = falso;



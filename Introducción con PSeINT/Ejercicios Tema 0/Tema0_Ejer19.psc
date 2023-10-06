Proceso Tema0_Ejer19
	Definir num, i, counter Como Entero;
	
	//Solicito el n�mero por consola
	Escribir "Introduce un n�mero:";
	Leer num;
	
	//Usar� un contador para contar los divisores de num
	counter <- 0;
	
	
	//Uso un bucle For que lee desde 1 hasta num
	//Si el n�mero de "i" se divide por "num" y el resto es 0, el contador aumenta
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si num MOD i = 0 Entonces
			counter <- counter + 1;
		FinSi
	FinPara
	
	//Si el contador es = a 2 el n�mero es primo
	Si counter = 2 Entonces
		Escribir "El n�mero ", num, " es primo.";
	Sino
		Escribir "El n�mero ", num, " no es primo.";
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



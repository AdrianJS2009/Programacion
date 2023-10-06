//Escribe los n primeros números de la sucesión de Fibonacci.
// (1 1 2 3 5 8 13 ...)
//Tendrás que solicitar cuántos números de la sucesión de Fibonacci se quieren mostrar.


Proceso Tema0_Ejer14
	
	Definir i, sum, num, a, b Como Entero;
	EScribir "¿Cúantos números de Fibonacci deseas mostrar?";
	Leer num;
	
	//El primer y segundo número siempre son 1.
	a<- 0;
	b<- 1;
	
	//Los muestro por pantalla
	Escribir a;
	Escribir b;
	
	//Bucle for para calcular y mostrar la sucesión de Fibonacci
	Para i<-3 Hasta num Con Paso 1 Hacer
		sum <- a+b; // Calculo el siguiente número sumando los dos anteriores.
		Escribir sum;
		a <- b; // Muevo lo que está almacenado en b a la variable a.
		b <- sum; //Muevo lo que está guardado en sum a b.
	FinPara
	
	
	//Forma de hacerlo sin dependes de dos variables predefinidas con Escribir.
	
//	Definir i, sum, num, a, b,c Como Entero;
//	EScribir "¿Cúantos números de Fibonacci deseas mostrar?";
//	Leer num;
//	
//	//El primer y segundo número siempre son 1.
//	a<- 1;
//	b<- 1;
//	c<-0;
//	
//	
//	
//	//Bucle for para calcular y mostrar la sucesión de Fibonacci
//	Para i<-1 Hasta num Con Paso 1 Hacer
//		Escribir a;
//		c<-a+b;
//		a<-c;
//		b<-c;
//	FinPara
	
FinProceso

//Escribe los n primeros n�meros de la sucesi�n de Fibonacci.
// (1 1 2 3 5 8 13 ...)
//Tendr�s que solicitar cu�ntos n�meros de la sucesi�n de Fibonacci se quieren mostrar.


Proceso Tema0_Ejer14
	
	Definir i, sum, num, a, b Como Entero;
	EScribir "�C�antos n�meros de Fibonacci deseas mostrar?";
	Leer num;
	
	//El primer y segundo n�mero siempre son 1.
	a<- 0;
	b<- 1;
	
	//Los muestro por pantalla
	Escribir a;
	Escribir b;
	
	//Bucle for para calcular y mostrar la sucesi�n de Fibonacci
	Para i<-3 Hasta num Con Paso 1 Hacer
		sum <- a+b; // Calculo el siguiente n�mero sumando los dos anteriores.
		Escribir sum;
		a <- b; // Muevo lo que est� almacenado en b a la variable a.
		b <- sum; //Muevo lo que est� guardado en sum a b.
	FinPara
	
	
	//Forma de hacerlo sin dependes de dos variables predefinidas con Escribir.
	
//	Definir i, sum, num, a, b,c Como Entero;
//	EScribir "�C�antos n�meros de Fibonacci deseas mostrar?";
//	Leer num;
//	
//	//El primer y segundo n�mero siempre son 1.
//	a<- 1;
//	b<- 1;
//	c<-0;
//	
//	
//	
//	//Bucle for para calcular y mostrar la sucesi�n de Fibonacci
//	Para i<-1 Hasta num Con Paso 1 Hacer
//		Escribir a;
//		c<-a+b;
//		a<-c;
//		b<-c;
//	FinPara
	
FinProceso

Proceso Tema0_Ejer9
	Definir num1, num2, num3, menor, medio, mayor Como Entero;
	
	Escribir "Introduce el primer n�mero";
	Leer num1;
	
	Escribir "Introduce el segundo n�mero";
	Leer num2;
	
	Escribir "Introduce el tercer n�mero";
	Leer num3;
	
	//Comparo los n�meros utilizando una estructura If/Else If para determinar la posici�n de los n�meros.
	Si num1 <= num2 Entonces
		Si num1 <= num3 Entonces
			menor <- num1;
			Si num2 <= num3 Entonces
				medio <- num2;
				mayor <- num3;
			SiNo
				medio <- num3;
				mayor <- num2;
			FinSi
		SiNo
			menor <- num3;
			medio <- num1;
			mayor <- num2;
		FinSi
	SiNo
		Si num2 <= num3 Entonces
			menor <- num2;
			Si num1 <= num3 Entonces
				medio <- num3;
				mayor <- num1;
			FinSi
		SiNo
			menor <- num3;
			medio <- num2;
			mayor <- num1;
		FinSi
	FinSi
	
	Escribir "Los n�meros ordenados de menos a mayor son: ", menor, ", ", medio, ", ", mayor;
	
FinProceso

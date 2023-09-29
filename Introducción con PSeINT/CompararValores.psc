Proceso CompararValores
	Definir num1, num2 Como Real;
	Escribir "Introduce el primer valor a ser comparado";
	Leer num1;
	Escribir "Introduce el segundo valor a ser comparado";
	Leer num2;
	Si num1>=num2 Entonces
		Si num1=num2 Entonces
			Escribir "Ambos valores son iguales";
		SiNo
			Escribir "El primer valor es mayor";
		FinSi
		Escribir "El primer valor introducido es mayor";
	SiNo
		Escribir "El segundo valor introducido es mayor";
	FinSi
FinProceso

		
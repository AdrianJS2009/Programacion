//Escribe un programa que solicite los n�meros y muestre el valor medio de los mismos.
//Tendr�s que pedir c�antos n�meros se van a introducir par acto seguido ir
//solicitando valores. Una vez le�dos todos los valores debes mostrar el resultado
//de la media de los valores. Media = Suma de los valores dividido entre
//el n�mero de valores.

Proceso Tema0_Ejer13
	Definir num, i, val, suma, media Como Real;
	
	//Solicitar por consola c�antos n�meros se introducir�n
	Escribir "�C�antos n�meros quieres introducir?";
	Leer num;
	suma <- 0;
	
	//Bucle for para leer y sumar n�meros
	Para i<-1 Hasta num Con Paso 1 Hacer
		Escribir "Introduce el valor ", "n�", i, ":";
		Leer val;
		suma <- suma + val;
	FinPara
	
	//Calcular y mostrar el valor medio
	media <- suma/num;
	Escribir "El valor medio es:", media;
FinProceso

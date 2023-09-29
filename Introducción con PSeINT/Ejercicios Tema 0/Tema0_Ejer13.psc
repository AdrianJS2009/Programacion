//Escribe un programa que solicite los números y muestre el valor medio de los mismos.
//Tendrás que pedir cúantos números se van a introducir par acto seguido ir
//solicitando valores. Una vez leídos todos los valores debes mostrar el resultado
//de la media de los valores. Media = Suma de los valores dividido entre
//el número de valores.

Proceso Tema0_Ejer13
	Definir num, i, val, suma, media Como Real;
	
	//Solicitar por consola cúantos números se introducirán
	Escribir "¿Cúantos números quieres introducir?";
	Leer num;
	suma <- 0;
	
	//Bucle for para leer y sumar números
	Para i<-1 Hasta num Con Paso 1 Hacer
		Escribir "Introduce el valor ", "nº", i, ":";
		Leer val;
		suma <- suma + val;
	FinPara
	
	//Calcular y mostrar el valor medio
	media <- suma/num;
	Escribir "El valor medio es:", media;
FinProceso

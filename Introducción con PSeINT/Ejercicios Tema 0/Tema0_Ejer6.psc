//Escribe un programa que pida 2 n�meros y a continuaci�n la operaci�n a realizar (1. suma, 2. resta, 3. multiplicaci�n, 4. divisi�n). 
//El programa debe devolver el resultado de la operaci�n indicada.

//Defino dos variables donde guardare dos n�meros como n�meros reales.
Proceso Tema0_Ejer6
	Definir num1, num2, operacion Como Real;
	Escribir "Dame el primer valor n�merico";
	Leer num1;
	Escribir "Dame el segundo valor n�merico";
	Leer num2;
	
	//Defino una variable llamada operaci�n que recoge la respuesta introducida por teclado a la pregunta.
	Escribir "Selecciona la operaci�n a realizar";
	Escribir"1. Suma";
	Escribir"2. Resta";
	Escribir"3. Multiplicaci�n";
	Escribir"4. Divisi�n";
	Leer operacion;
	
	//Utilizo Cases en respuesta a la pregunta por el usuario, suma, resta, multiplicaci�n o divisi�n.
	Segun operacion Hacer
		1:
			Escribir "Resultado: ", num1 + num2;
		2:
			Escribir "Resultado: ", num1 - num2;
		3:
			Escribir "Resultado: ", num1 * num2;
		4:
			Escribir "Resultado: ", num1 / num2;
		De Otro Modo:
			Escribir "No has seleccionado una operaci�n v�lida";
	FinSegun
	
FinProceso

//Escribe un programa que pida 2 números y a continuación la operación a realizar (1. suma, 2. resta, 3. multiplicación, 4. división). 
//El programa debe devolver el resultado de la operación indicada.

//Defino dos variables donde guardare dos números como números reales.
Proceso Tema0_Ejer6
	Definir num1, num2, operacion Como Real;
	Escribir "Dame el primer valor númerico";
	Leer num1;
	Escribir "Dame el segundo valor númerico";
	Leer num2;
	
	//Defino una variable llamada operación que recoge la respuesta introducida por teclado a la pregunta.
	Escribir "Selecciona la operación a realizar";
	Escribir"1. Suma";
	Escribir"2. Resta";
	Escribir"3. Multiplicación";
	Escribir"4. División";
	Leer operacion;
	
	//Utilizo Cases en respuesta a la pregunta por el usuario, suma, resta, multiplicación o división.
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
			Escribir "No has seleccionado una operación válida";
	FinSegun
	
FinProceso

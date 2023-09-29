Proceso Operadores_Logicos
	
	//Pregunto un número por pantalla
	Definir num1 Como Entero;
	// Escribir "Indica un número entero";
	// Leer num1;
	num1 <- 3;
	
	Definir operadorY, operadorO, operadorNO Como Logico;
	
	operadorY <- (num1 > 3) Y (num1 < 10);
	operadorO <- (num1 = 3) O (num1 = -2);
	operadorNO <- NO(num1 > 1);
	Escribir "Y: ", operadorY;
	Escribir "O: ", operadorO;
	Escribir "NO: ", operadorNO;
	
	
FinProceso

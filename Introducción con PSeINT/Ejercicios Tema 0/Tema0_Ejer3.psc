// 3.	Escribe un programa que determine si el n�mero introducido tiene 3 d�gitos o no. (7 puntos)
Proceso Tema0_Ejer3
	
	//Defino la variable num, que es con la que voy a encontrar.
	Definir num, resultado Como Real;
	Escribir "Introduce un n�mero, comprobar� si tiene 3 d�gitos.";
	Leer num;
	
	resultado <- num / 1000;
	//Aqui uso un If, si el valor de num se encuentra entre 100 y 999 entonces interpreta que tiene 3 n�meros.
	//Si no se encuentra en ese rango, entonces no se trata de un n�mero con 3 d�gitos.
	Si (resultado < 1 Y resultado >= 0.1) O (resultado > -1 Y resultado <= -0.1) Entonces
		
		Escribir "S�, ", num, " tiene 3 n�meros.";
	SiNo
		Escribir "El valor introducido no tiene 3 n�meros.";
	FinSi
FinProceso

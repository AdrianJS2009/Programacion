// 3.	Escribe un programa que determine si el número introducido tiene 3 dígitos o no. (7 puntos)
Proceso Tema0_Ejer3
	
	//Defino la variable num, que es con la que voy a encontrar.
	Definir num, resultado Como Real;
	Escribir "Introduce un número, comprobaré si tiene 3 dígitos.";
	Leer num;
	
	resultado <- num / 1000;
	//Aqui uso un If, si el valor de num se encuentra entre 100 y 999 entonces interpreta que tiene 3 números.
	//Si no se encuentra en ese rango, entonces no se trata de un número con 3 dígitos.
	Si (resultado < 1 Y resultado >= 0.1) O (resultado > -1 Y resultado <= -0.1) Entonces
		
		Escribir "Sí, ", num, " tiene 3 números.";
	SiNo
		Escribir "El valor introducido no tiene 3 números.";
	FinSi
FinProceso

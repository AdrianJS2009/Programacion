Funcion resultado <- esPrimo(num)
	Definir resultado Como Logico;
	Definir i, resto Como Entero;
	resultado <- Verdadero;
	
	Para i <- 2 Hasta num -1 Hacer
	resto <- num Mod i;
		Si resto = 0 Entonces
			resultado <- Falso;
		FinSi
	FinPara
	
FinFuncion

Proceso Tema0_Ejer20
	
	Definir x Como Entero;
	Definir resultado Como Logico;
	Escribir "Introduce un n�mero para saber si es primo o no:" Sin Saltar;
	Leer x;
	
	resultado <- esPrimo(x);
	
	Si resultado Entonces
		Escribir "El n�mero ", x, " Es primo";
	SiNo
		Escribir "El n�mero ", x, " No es primo";
		
	FinSi
	
FinProceso

Proceso Practocca_Bucles4
	
	Definir altura, base, i, j Como Entero;
	Escribir " *** Vamos a crear un rectangulo *** ";
	Escribir "Introduce la altura del rectangulo (entre 4 y 12)" Sin Saltar;
	Leer altura;
	
	
	Si altura >= 4 Y altura <= 12 Entonces
		Escribir "Teclea la base (entre 20 y 40)" Sin Saltar;
		Leer base;
	SiNo
		Escribir "Valor inválido";
	FinSi
	
	
	Si base >= 20 Y base <= 40 Entonces
		Para j<-1 Hasta base Con Paso 1 Hacer
			Para i<-1 Hasta altura Con Paso 1 Hacer
				Escribir "#" Sin Saltar;
			FinPara
			
		FinPara
	SiNo
		Escribir "Valor inválido";
	FinSi
	
	
FinProceso

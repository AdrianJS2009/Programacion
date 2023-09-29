Proceso Practica_Bucles1
	
	Definir i,num Como Entero;
	Definir result Como Real;
	
	i <- 0;
	
	Repetir
		i <- i+1;
		num <- Aleatorio(20,50);
		result <- num/5;
		Escribir "El número aleatorio escogido es el: ", num;
	Hasta Que result = trunc(result);
	Escribir "Hemos necesitado ", i, " veces para encontrar el número";
	
	
FinProceso

Proceso Tema0_Ejer18
	Definir altura, i, j Como Entero;
	
	// Solicitar altura del cuadrado
	Escribir "¿Cuál es la altura del cuadrado?";
	Leer altura;
	
	// Bucle para dibujar el cuadrado
	
	//Sí i es = a la primera linea o = a la altura introducida dibujar *
	Para i<-1 Hasta altura Con Paso 1 Hacer
		Si i=1 o i=altura Entonces
			Para j<-1 Hasta altura Hacer
				Escribir "*" Sin Saltar;
			FinPara
			
	//Si no es la primera ni última línea, dibujar * al principio con espacios en blanco (Es el borde)
		Sino
			Escribir "*" Sin Saltar;
			Para j<-2 Hasta altura-1 Con Paso 1 Hacer
				Escribir " " Sin Saltar;
			FinPara
			Escribir "*" Sin Saltar;
		FinSi
		// Salto de línea para ir al siguiente nivel del cuadrado
		Escribir "";
	FinPara
	
FinProceso

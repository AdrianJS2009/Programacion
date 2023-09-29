// Escribe un programa que muestre en pantalla los n primeros números pares.
// Solicitar el valor de n por pantalla.
	
	Proceso EjercicioTema0_11
		Definir i, num Como Entero;
		Escribir "Introduce un número";
		Leer num;
		
		
		Para i<-0 Hasta num*2 Con Paso 2 Hacer
			Escribir "Los números pares son: ", i;
		FinPara

FinProceso

Proceso Operadores_Relacionales
	
		//Creo dos variables que son de tipo int
		Definir a, b Como Entero;
		
		//Pregunto al usuario por ambos números
		Escribir "Introduce del primer número: ";
		Leer a;
		Escribir "Introduce el segundo número: ";
		Leer b;
		
		//Creo las variables correspondientes a las operaciones relacionales
		Definir igual, distinto, menor, menorIgual, mayor, mayorIgual Como Logico;
		igual <- a = b;
		distinto <- a <> b;
		menor <- a > b;
		menorIgual <- a >= b;
		mayor <- a < b;
		mayorIgual <- a <= b;
 		
		//Imprimo por pantalla el resultado de las distintas operaciones relacionales
		Escribir "¿Es a igual que b? ", igual;
		Escribir "¿Es a distinto que b? ", distinto;
		Escribir "¿Es a menor que b? ", menor;
		Escribir "¿Es a menor o igual que b?" , menorIgual;
		Escribir "¿Es a mayor que b? ", mayor;
		Escribir "¿Es a mayor o igual que b? ", mayorIgual;
FinProceso

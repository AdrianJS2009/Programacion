Proceso Operadores_Aritmeticos
	//Creo dos variables que son de tipo int
	Definir a, b Como Entero;
	
	//Pregunto al usuario por ambos n�meros
	Escribir "Introduce del primer n�mero: ";
	Leer a;
	Escribir "Introduce el segundo n�mero: ";
	Leer b;
	
	//Creo las variables correspondientes a las operaciones aritmeticas, siendo todas int excepto la divisi�n que es float/real
	Definir suma, resta, multiplicacion, potencia, resto Como Entero;
	Definir division Como Real;
	
	suma <- a + b;
	resta <- a - b;
	multiplicacion <- a * b;
	potencia <- a ^ b;
	division <- a / b;
	resto <- a MOD b;
	
	//Imprimo por pantalla el resultado de las distintas operaciones aritmeticas
	Escribir "La suma de ambos n�meros es: ", suma;
	Escribir "La resta de ambos n�meros es: ", resta;
	Escribir "La multiplicaci�n de ambos n�meros es: ", multiplicacion;
	Escribir "La potencia de ambos n�meros es: ", potencia;
	Escribir "La divisi�n de ambos n�meros es: ", division;
	Escribir "El resto de ambos n�meros es: ", resto;
	
FinProceso

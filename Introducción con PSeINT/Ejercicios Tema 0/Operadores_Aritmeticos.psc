Proceso Operadores_Aritmeticos
	//Creo dos variables que son de tipo int
	Definir a, b Como Entero;
	
	//Pregunto al usuario por ambos números
	Escribir "Introduce del primer número: ";
	Leer a;
	Escribir "Introduce el segundo número: ";
	Leer b;
	
	//Creo las variables correspondientes a las operaciones aritmeticas, siendo todas int excepto la división que es float/real
	Definir suma, resta, multiplicacion, potencia, resto Como Entero;
	Definir division Como Real;
	
	suma <- a + b;
	resta <- a - b;
	multiplicacion <- a * b;
	potencia <- a ^ b;
	division <- a / b;
	resto <- a MOD b;
	
	//Imprimo por pantalla el resultado de las distintas operaciones aritmeticas
	Escribir "La suma de ambos números es: ", suma;
	Escribir "La resta de ambos números es: ", resta;
	Escribir "La multiplicación de ambos números es: ", multiplicacion;
	Escribir "La potencia de ambos números es: ", potencia;
	Escribir "La división de ambos números es: ", division;
	Escribir "El resto de ambos números es: ", resto;
	
FinProceso

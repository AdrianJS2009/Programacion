//Escribe un programa que pida 2 n�meros e indique si el primero es m�ltiplo del segundo.
Proceso Tema0_Ejer4
	
	//Defino las variables para almacenar dos n�meros distintos y los pido al usuario.
    Definir num1, num2 Como Entero;
	
    Escribir "Introduce el primer n�mero: ";
    Leer num1;
	
    Escribir "Introduce el segundo n�mero: ";
    Leer num2;
	
	//Usando If compruebo si el primer n�mero es m�ltiplo del segundo.
    Si num1 MOD num2 = 0 Entonces
        Escribir "El primer n�mero es m�ltiplo del segundo.";
    Sino
        Escribir "El primer n�mero no es m�ltiplo del segundo.";
    Fin Si
FinProceso


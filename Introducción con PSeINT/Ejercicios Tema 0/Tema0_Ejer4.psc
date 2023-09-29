//Escribe un programa que pida 2 números e indique si el primero es múltiplo del segundo.
Proceso Tema0_Ejer4
	
	//Defino las variables para almacenar dos números distintos y los pido al usuario.
    Definir num1, num2 Como Entero;
	
    Escribir "Introduce el primer número: ";
    Leer num1;
	
    Escribir "Introduce el segundo número: ";
    Leer num2;
	
	//Usando If compruebo si el primer número es múltiplo del segundo.
    Si num1 MOD num2 = 0 Entonces
        Escribir "El primer número es múltiplo del segundo.";
    Sino
        Escribir "El primer número no es múltiplo del segundo.";
    Fin Si
FinProceso


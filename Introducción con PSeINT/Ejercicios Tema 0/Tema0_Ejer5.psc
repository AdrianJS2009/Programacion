//Escribe un programa que determine si el n�mero introducido termina en 5 (positivo o negativo)

Proceso Tema0_Ejer5
	
	//Defino la variable num,donde almacemar� un n�mero entero.
    Definir num Como Entero;
	
    Escribir "Introduce un n�mero: ";
    Leer num;
	
	//Utilizo un IF y el resultado del c�lculo del resto para saber si el n�mero termina en 5 o -5
    Si num MOD 10 = 5 o num MOD 10 = -5 Entonces
        Escribir "El n�mero termina en 5.";
    Sino
        Escribir "El n�mero no termina en 5.";
    Fin Si
FinProceso


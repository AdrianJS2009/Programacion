//Escribe un programa que determine si el número introducido termina en 5 (positivo o negativo)

Proceso Tema0_Ejer5
	
	//Defino la variable num,donde almacemaré un número entero.
    Definir num Como Entero;
	
    Escribir "Introduce un número: ";
    Leer num;
	
	//Utilizo un IF y el resultado del cálculo del resto para saber si el número termina en 5 o -5
    Si num MOD 10 = 5 o num MOD 10 = -5 Entonces
        Escribir "El número termina en 5.";
    Sino
        Escribir "El número no termina en 5.";
    Fin Si
FinProceso


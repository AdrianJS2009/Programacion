Proceso Tema0_Ejer1
    // Defino las variables que usar� en el programa.
    // Pregunto por consola el nombre y apellidos y asigno la respuesta a la variable nombre.
    Definir nombre, apellidos, genero Como Caracter;
    Escribir "�Cu�l es su nombre? Indique su nombre y despu�s su apellido.";
    Leer nombre;
	
    // Pregunto por consola los apellidos y asigno la respuesta a la variable apellidos.
    Escribir "Por favor, introduzca sus apellidos: ";
    Leer apellidos;
	
    // Pregunto por consola el g�nero y asigno la respuesta a la variable genero.
    Escribir "Muchas gracias ", nombre, ". �Qu� g�nero es usted? Indique si es hombre o mujer.";
    Leer genero;
	
    // Verifico el g�nero y muestro el saludo apropiado.
    Si genero == "hombre" Entonces
        Escribir "Bienvenido Sr. ", nombre, " ", apellidos;
    Sino 
        Si genero == "mujer" Entonces
            Escribir "Bienvenida Sra. ", nombre, " ", apellidos;
        Sino
            Escribir "G�nero no reconocido. Por favor, introduzca hombre o mujer.";
        FinSi
    FinSi
	
FinProceso

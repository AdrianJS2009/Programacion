Algoritmo SignoZodiacal
    Definir repeat, nombre Como Caracter;
    Definir dia, mes Como Entero;
    Definir fechaValida Como Logico;
	
    repeat <- 's';
	
	// Este mientras engloba la repetición del programa controlado por s/n al final.
    Mientras repeat = 's' Hacer
	fechaValida <- Falso;
		
        Mientras fechaValida = Falso Hacer
            Escribir "Introduce tu nombre:";
            Leer nombre;
			
            Escribir "Introduce tu día de nacimiento:";
            Leer dia;
			
            Escribir "Introduce tu mes de nacimiento:";
            Leer mes;
			
            // Controlar la validez de la fecha mediante if/else
            Si (mes >= 1 Y mes <= 12) Entonces
                Si (dia >= 1 Y dia <= 31) Entonces
                    fechaValida <- Verdadero;
                Sino
                    Escribir "Día inválido. Por favor, introduce los datos nuevamente.";
                FinSi;
            Sino
                Escribir "Mes inválido. Por favor, introduce los datos nuevamente.";
            FinSi;
        FinMientras;
		
        // Según la fecha de nacimiento asigno un zodiaco u otro.
        Si (dia >= 21 Y mes = 3) O (dia <= 19 Y mes = 4) Entonces
			Escribir nombre, ", tu signo zodiacal es Aries.";
		FinSi

		Si (dia >= 20 Y mes = 4) O (dia <= 20 Y mes = 5) Entonces
			Escribir nombre, ", tu signo zodiacal es Tauro.";
		FinSi
			
		Si (dia >= 21 Y mes = 5) O (dia <= 20 Y mes = 6) Entonces
			Escribir nombre, ", tu signo zodiacal es Géminis.";
		FinSi
		
		Si (dia >= 21 Y mes = 6) O (dia <= 22 Y mes = 7) Entonces
			Escribir nombre, ", tu signo zodiacal es Cáncer.";
		FinSi
		
		Si (dia >= 23 Y mes = 7) O (dia <= 22 Y mes = 8) Entonces
			Escribir nombre, ", tu signo zodiacal es Leo.";
		FinSi
		
		Si (dia >= 23 Y mes = 8) O (dia <= 22 Y mes = 9) Entonces
			Escribir nombre, ", tu signo zodiacal es Virgo.";
		FinSi
		
		Si (dia >= 23 Y mes = 9) O (dia <= 22 Y mes = 10) Entonces
			Escribir nombre, ", tu signo zodiacal es Libra.";
		FinSi
								
		Si (dia >= 23 Y mes = 10) O (dia <= 21 Y mes = 11) Entonces
			Escribir nombre, ", tu signo zodiacal es Escorpio.";
		FinSi
		
		Si (dia >= 22 Y mes = 11) O (dia <= 21 Y mes = 12) Entonces
			Escribir nombre, ", tu signo zodiacal es Sagitario.";
		FinSi
		
		Si (dia >= 22 Y mes = 12) O (dia <= 19 Y mes = 1) Entonces
			Escribir nombre, ", tu signo zodiacal es Capricornio.";
		FinSi
		
		Si (dia >= 20 Y mes = 1) O (dia <= 18 Y mes = 2) Entonces
			Escribir nombre, ", tu signo zodiacal es Acuario.";
		FinSi
		
		Si (dia >= 19 Y mes = 2) O (dia <= 20 Y mes = 3) Entonces
			Escribir nombre, ", tu signo zodiacal es Piscis.";
		FinSi
			
			// Preguntar si quiere hacer el proceso de nuevo con datos distintos
			Escribir "¿Quieres introducir otros datos? (s/n)";
			Leer repeat;
		FinMientras;
FinAlgoritmo


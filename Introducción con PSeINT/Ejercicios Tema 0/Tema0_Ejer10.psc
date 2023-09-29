Proceso Tema0_Ejer10
    Definir cantidadZapatos, precioBase, precioTotal, descuento Como Entero;
	
	//El valor de cada zapato es de 80?
    precioBase <- 80;
	
    Escribir "Ingrese la cantidad de pares de zapatos a comprar: ";
    Leer cantidadZapatos;
	
    // Calculo el descuento según la cantidad de zapatos comprados.
    Si cantidadZapatos > 30 Entonces
        descuento <- 40;
        Si cantidadZapatos > 20 Entonces
            descuento <- 20;
        Sino 
            Si cantidadZapatos > 10 Entonces
                descuento <- 10;
            Sino
                descuento <- 0;
            FinSi
        FinSi
    FinSi
	
    // Calculamos el precio total antes del descuento.
    precioTotal <- cantidadZapatos * precioBase;
	
    // Aplicamos el descuento.
    precioTotal <- precioTotal - (precioTotal * descuento / 100);
	
    Escribir "El precio total de la compra es: ", precioTotal, " euros.";
	
FinProceso

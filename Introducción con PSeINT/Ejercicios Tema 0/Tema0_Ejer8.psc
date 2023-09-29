//Escribe un programa que calcule el aumento al sueldo de un empleado; si el sueldo es mayor a 500.000? su aumento será del 12%, pero si su sueldo es menor, el aumento será del 15%.

Proceso Tema0_Ejer8
	
	Definir sueldo, aumento, nuevoSueldo Como Real;
	
	Escribir "Introduce el sueldo del empleado en euros: ";
	Leer sueldo;
	
	//Calculo el aumento del 12% si el sueldo es mayor 500,000?
	Si sueldo > 5000000 Entonces
		aumento <- sueldo * 0.12;
	//Si la primera condición no se cumple, entonces, es que el sueldo es menor a 500,000?
	Sino
		aumento <- sueldo * 0.15;
	FinSi
	
	// Calculo el nuevo sueldo con el aumento correspondiente.
	nuevoSueldo <- sueldo + aumento;
	
	Escribir "El aumento de sueldo es de ", aumento, " euros.";
	Escribir "El nuevo sueldo del empleado es de ", nuevoSueldo, " euros.";
FinProceso

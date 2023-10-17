Proceso Ejemeplo_Case_Switch
	Definir dia Como Entero;
	Escribir  "Escribe un número de la semana";
	Leer dia;
	
	Segun dia Hacer
		1:
			Escribir "Lunes";
		2:
			Escribir "Martes";
		3:
			Escribir "Miercoles";
		4:
			Escribir "Jueves";
		5:
			Escribir "Viernes";
		6,7:
			Escribir "Fin de semana";
		De Otro Modo:
			Escribir "No has introducido un valor válido.";
	FinSegun
	
FinProceso

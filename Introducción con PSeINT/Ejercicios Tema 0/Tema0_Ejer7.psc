Proceso Tema0_Ejer7
    Definir altura, peso, imc Como Real;
	
	
    Escribir "Introduce tu altura en metros: ";
    Leer altura;
	
    Escribir "Ingrese su peso en kilogramos: ";
    Leer peso;
	
	//Calculo el IMC seg�n los datos introducitos
    imc <- peso / (altura * altura);
	
    Escribir "Su �ndice de masa corporal (IMC) es: ", imc;
	
	//Uso una estructura If/Else If para sacar los resultados en base al c�lculo del IMC
    Si imc < 18.5 Entonces
        Escribir "Tu peso es bajo";
    Sino 
        Si imc < 24.9 Entonces
            Escribir "Tu peso es normal";
        Sino 
            Si imc < 29.9 Entonces
                Escribir "Te encuentras en sobrepeso";
            Sino
                Escribir "Te encuentras en obesidad";
            FinSi
        FinSi
    FinSi
FinProceso

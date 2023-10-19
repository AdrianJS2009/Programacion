package practicas;

import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */

public class EjerciciosTema01 {

  public static void main(String[] args) {
    
     boolean continuar = true;
        String opcion;
        Scanner scMenu = new Scanner(System.in);
        EjerciciosTema01 programa = new EjerciciosTema01();
        
        while (continuar) {
            System.out.println("");
            System.out.println("Ejercicios de salida de datos por pantalla.");
            System.out.println("-----------------------------------------------------------");
            System.out.println("");
            System.out.println("Escoja el ejercicio a realizar:");
            System.out.println("1. Escribir un programa que muestre tu nombre por pantalla");
            System.out.println("2. Mostrar dirección y número de telefono junto con el nombre");
            System.out.println("3. Mostrar por pantalla 10 palabras en inglés con su traducción");
            System.out.println("4. Mostrar el horario de clase");
            System.out.println("5. Mostrrar el horario de clase añadiendo colores");
            System.out.println("6. Pinta por pantalla una pirámide rellena de *");
            System.out.println("7. Pinta por pantalla una pirámide hueca");
            System.out.println("8. Pinta por pantalla una pirámide hueca y invertida");
            System.out.println("9. Pinta por pantalla una escena de un gato");
            System.out.println("10. Pinta por pantalla la escena de un gato añadiendo color");
            System.out.println("Cualquier otra entrada: SALIR");
            
            opcion = scMenu.nextLine();
            
            
            
            switch (opcion) {
                case "1": programa.Ejercicio1();
                    break;
                case "2": programa.Ejercicio2();
                    break;
                case "3": programa.Ejercicio3();
                    break;
                case "4": programa.Ejercicio4();
                    break;    
                case "5": programa.Ejercicio5();
                    break;
                case "6": programa.Ejercicio6();
                    break;
                case "7": programa.Ejercicio7();
                    break;
                case "8": programa.Ejercicio8();
                    break;
                case "9": programa.Ejercicio9();
                    break;
                case "10": programa.Ejercicio10();
                    break;
                default: continuar = false;
            }
            
        }
        
    }

    public void Ejercicio1() {

      System.out.println("Mi nombre es Adrián Jiménez Santiago");
    }

    public void Ejercicio2() {

      System.out.println("Mi nombre es Adrián Jiménez Santiago");
      System.out.println("Vivo en la calle Santa Ana, Cártama");
      System.out.println("Mi número de teléfono es: 154978465");
    }
  }


  


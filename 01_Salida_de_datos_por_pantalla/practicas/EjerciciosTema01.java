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

    public void Ejercicio3() {

      System.out.println("Inglés                Español");
      System.out.println("-----------------------------");
      System.out.printf("%-10s  %15s", "Car", "Coche\n");
      System.out.printf("%-10s  %15s", "Room", "Habitación\n");
      System.out.printf("%-10s  %15s", "Desk", "Escritorio\n");
      System.out.printf("%-10s  %15s", "Wheel", "Rueda\n");
      System.out.printf("%-10s  %15s", "Window", "Ventana\n");
      System.out.printf("%-10s  %15s", "Night", "Noche\n");
      System.out.printf("%-10s  %15s", "Laptop", "Portátil\n");
      System.out.printf("%-10s  %15s", "Music", "Música\n");
      System.out.printf("%-10s  %15s", "Backpack", "Mochila\n");
      System.out.printf("%-10s  %15s", "Bag", "Bolsa\n");

    }

    public void Ejercicio4() {

      System.out.println("--------------------------------------------");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Día", "Horas", "Asignaturas");
      System.out.println("--------------------------------------------");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Lunes", "15:15-16:15", "FOL");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "FOL");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "FOL");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "Sistemas Informáticos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "Sistemas Informáticos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "Sistemas Informáticos");
      System.out.println("#######################################################");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Martes", "15:15-16:15", "Programación");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "Programación");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "Bases de Datos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "Bases de Datos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "Lenguaje de marcas");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "Lenguaje de marcas");
      System.out.println("#######################################################");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Miércoles", "15:15-16:15", "Entornos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "Entornos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "Bases de Datos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "Bases de Datos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "Programación");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "Programación");
      System.out.println("#######################################################");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Jueves", "15:15-16:15", "Base de Datos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "Base de Datos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "Lenguaje de marcas");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "Lenguaje de marcas");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "Programación");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "Programación");
      System.out.println("#######################################################");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Viernes", "15:15-16:15", "Programación");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "Programación");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "Entornos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "Sistemas Informáticos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "Sistemas Informáticos");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "Sistemas Informáticos");
      System.out.println("--------------------------------------------");
    }

    public void Ejercicio5() {
      System.out.println("\033[0m"); // Reseteo de color
      System.out.println("--------------------------------------------");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Día", "Horas", "Asignaturas");
      System.out.println("--------------------------------------------");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Lunes", "15:15-16:15", "\033[33m FOL");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "\033[33m FOL");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "\033[33m FOL");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "\033[34m Sistemas Informáticos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "\033[34m Sistemas Informáticos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "\033[34m Sistemas Informáticos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.println("#######################################################");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Martes", "15:15-16:15", "\033[31m Programación");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "\033[31m Programación");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "\033[35m Bases de Datos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "\033[35m Bases de Datos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "\033[32m Lenguaje de marcas");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "\033[32m Lenguaje de marcas");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.println("#######################################################");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Miércoles", "15:15-16:15", "\033[36m Entornos de Desarrollo");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "\033[36m Entornos de Desarrollo");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "\033[35m Bases de Datos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "\033[35m Bases de Datos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "\033[31m Programación");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "\033[31m Programación");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.println("#######################################################");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Jueves", "15:15-16:15", "\033[35m Base de Datos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "\033[35m Base de Datos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "\033[32m Lenguaje de marcas");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "\033[32m Lenguaje de marcas");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "\033[31m Programación");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "\033[31m Programación");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.println("#######################################################");
      System.out.printf("| %-9s | %-5s | %-10s |\n", "Viernes", "15:15-16:15", "\033[31m Programación");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "16:15-17:15", "\033[31m Programación");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "17:15-18:15", "\033[36m Entornos de Desarollo");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "18:30-19:30", "\033[34m Sistemas Informáticos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "19:30-20:30", "\033[34m Sistemas Informáticos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.printf("| %-9s | %-5s | %-10s |\n", "", "20:30-21:15", "\033[34m Sistemas Informáticos");
      System.out.println("\033[0m"); // Reseteo de color
      System.out.println("--------------------------------------------");

    }

    public void Ejercicio6() {
      System.out.println("    *    ");
      System.out.println("   ***   ");
      System.out.println("  *****  ");
      System.out.println(" ******* ");
      System.out.println("*********");
    }


    public void Ejercicio7() {
      System.out.println("    *    ");
      System.out.println("   * *   ");
      System.out.println("  *   *  ");
      System.out.println(" *     * ");
      System.out.println("*********");
    }

    public void Ejercicio8(){
      System.out.println("*********");
      System.out.println(" *     * ");
      System.out.println("  *   *  ");
      System.out.println("   * *   ");
      System.out.println("    *    ");
    }
    public void Ejercicio9(){
      System.out.println("*********");
      System.out.println(" ******* ");
      System.out.println("  *****  ");
      System.out.println("   ***   ");
      System.out.println("    *    ");
    }

  }


  


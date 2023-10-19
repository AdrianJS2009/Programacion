/**
 * El mismo horario escolar, pero marcando las asignaturas con colores.
 * 
 * @author Adrián Jiménez Santiago
 */

public class Ejercicio5 {
  
  public static void main(String[] args) {
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
}

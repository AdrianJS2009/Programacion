package ejemplos;

/**
 * 
 Muestra varias palabras en el color que corresponde.

 @author Adrián Jiménez Santiago
 */

public class Colores {
  public static void main(String[] args) {

    // Colores en texto de salida
    System.out.print("\033[33m mandarina");
    System.out.print("\033[32m hierba");
    System.out.print("\033[31m tomate");
    System.out.print("\033[37m sábanas");
    System.out.print("\033[36m cielo");
    System.out.print("\033[35m nazareno");
    System.out.print("\033[34m mar");

    System.out.println("\033[0m"); // Reseteo de color

    // Con fondo
    System.out.print("\033[43m mandarina");
    System.out.print("\033[42m hierba");
    System.out.print("\033[41m tomate");
    System.out.print("\033[47m sábanas");
    System.out.print("\033[46m cielo");
    System.out.print("\033[45m nazareno");
    System.out.print("\033[44m mar");

    System.out.println("\033[0m"); // Reseteo de color

    // En negrita, usando 1;
    System.out.print("\033[1;33m mandarina");
    System.out.print("\033[1;32m hierba");
    System.out.print("\033[1;31m tomate");
    System.out.print("\033[1;37m sábanas");
    System.out.print("\033[1;36m cielo");
    System.out.print("\033[1;35m nazareno");
    System.out.print("\033[1;34m mar");
  }
}

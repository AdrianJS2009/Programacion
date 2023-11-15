import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */
public class T05_Ejercicio07 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int intentos = 4;
    boolean accesoConcedido = false;
    int combinacionCorrecta = 1234;

    while (intentos > 0 && !accesoConcedido) {
      System.out.println("Introduce la combinación:");
      int combinacionUsuario = sc.nextInt();

      if (combinacionUsuario == combinacionCorrecta) {
        accesoConcedido = true;
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } else {
        intentos--;
        System.out.println("Lo siento, esa no es la combinación. Intentos restantes: " + intentos);
      }
    }

    if (!accesoConcedido) {
      System.out.println("Se han agotado los intentos.");
    }

    sc.close();

  }

}
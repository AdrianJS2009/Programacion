
/** 
 * En un edificio residencial, se desea simular el comportamiento de un ascensor mediante un programa en Java. El ascensor tiene un límite de peso y de personas y puede viajar entre diferentes pisos. Se te pide que implementes un programa que maneje el funcionamiento del ascensor con las siguientes condiciones:
* El ascensor puede viajar entre un mínimo de dos pisos. Por ejemplo, si el ascensor está en el piso 1, no subirá al 2 ni bajará al 0.
* El ascensor no puede ir más allá del piso máximo (10) ni por debajo del piso mínimo (0).
* El ascensor puede subir o bajar dependiendo del piso actual y el piso seleccionado.
* Debe haber un límite de peso máximo de 300 kg que el ascensor puede soportar. Decláralo como una constante.
* Debe haber un límite de hasta 4 personas. Decláralo como una constante.
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.Scanner;

public class Problema02 {
  // Constantes fijas para fijar valores no cambiantes
  static final int LIMITE_PESO = 300;
  static final int LIMITE_PERSONAS = 4;
  static final int PISO_MAXIMO = 10;

  public static void main(String[] args) {
    // Declaraciones globales
    int pisoDestino = 0;
    int pisoActual = 0;

    Scanner sc = new Scanner(System.in);

    // Control del ascensor
    while (pisoDestino != -1) {
      System.out.println("Piso actual: " + pisoActual);
      System.out.print("¿A qué piso quieres ir (-1 para salir)? ");
      pisoDestino = sc.nextInt();

      if (pisoDestino == -1) {
        System.out.println("Gracias por utilizar Elevadores Ajimsan S.L...");
        break;
      }

      System.out.print("Número de personas: ");
      int numPersonas = sc.nextInt();

      System.out.print("Peso total (en kg): ");
      int pesoTotal = sc.nextInt();

      // Compruebo si el ascensor puede moverse al piso introducido
      if (pisoDestino >= 0 && pisoDestino <= PISO_MAXIMO && pisoDestino != pisoActual) {
        // Compruebo que no se pasa de los limites establecidos en el enunciado
        if (numPersonas <= LIMITE_PERSONAS && pesoTotal <= LIMITE_PESO) {

          if (pisoDestino > pisoActual) {
            System.out.println("Subiendo...");
            pisoActual = pisoDestino;
          } else {
            System.out.println("Bajando...");
            pisoActual = pisoDestino;
          }
          System.out.println("Llegando al piso...  " + pisoActual);
        } else {
          System.out
              .println("Lo sentimos, la cantidad de personas o el peso excede el máximo soportado de este ascensor.");
        }
      } else {
        System.out.println("Solicitud inválida: Piso inválido o el ascensor ya se encuentra en ese piso.");
      }
    }

    sc.close();
  }
}

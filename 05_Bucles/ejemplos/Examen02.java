
/** 
 * Juego del piedra papel tijera
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.Scanner;

public class Examen02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int puntosJugador1 = 0, puntosJugador2 = 0;
    String jugadaJugador1, jugadaJugador2;
    String nombreJugador1, nombreJugador2;
    int longitudMaxima;

    // Obtener nombres de los jugadores
    System.out.print("Nombre del Jugador 1: ");
    nombreJugador1 = sc.nextLine();
    System.out.print("Nombre del Jugador 2: ");
    nombreJugador2 = sc.nextLine();

    // Saco la longitud máxima de ambos nombres para definir el ancho del formato.
    longitudMaxima = Math.max(nombreJugador1.length(), nombreJugador2.length());

    while (puntosJugador1 < 3 && puntosJugador2 < 3) {
      // Registro el movimiento del Jugador1
      System.out.print(nombreJugador1 + ", introduce tu jugada (piedra, papel, tijera): ");
      jugadaJugador1 = sc.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();

      // Registro el movimiento del Jugador2
      System.out.print(nombreJugador2 + ", introduce tu jugada (piedra, papel, tijera): ");
      jugadaJugador2 = sc.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();

      // Compruebo si las jugadas son válidas
      boolean jugadaValidaJugador1 = jugadaJugador1.equals("piedra") || jugadaJugador1.equals("papel")
          || jugadaJugador1.equals("tijera");
      boolean jugadaValidaJugador2 = jugadaJugador2.equals("piedra") || jugadaJugador2.equals("papel")
          || jugadaJugador2.equals("tijera");

      if (!jugadaValidaJugador1 || !jugadaValidaJugador2) {
        System.out.println("Jugada inválida");
      } else if ((jugadaJugador1.equals("piedra") && jugadaJugador2.equals("tijera")) ||
          (jugadaJugador1.equals("papel") && jugadaJugador2.equals("piedra")) ||
          (jugadaJugador1.equals("tijera") && jugadaJugador2.equals("papel"))) {
        System.out.println("Gana " + nombreJugador1);
        puntosJugador1++;
      } else if ((jugadaJugador2.equals("piedra") && jugadaJugador1.equals("tijera")) ||
          (jugadaJugador2.equals("papel") && jugadaJugador1.equals("piedra")) ||
          (jugadaJugador2.equals("tijera") && jugadaJugador1.equals("papel"))) {
        System.out.println("Gana " + nombreJugador2);
        puntosJugador2++;
      } else {
        System.out.println("Habeis empatado");
      }
    }

    /*
     * Hacerlo con switch seria...
     * 
     * 
     * String jugadas = jugadaJugador1 + jugadaJugador2;
     * 
     * switch (jugadas) {
     * case "piedratijera":
     * case "papelpiedra":
     * case "tijerapapel":
     * System.out.println("Gana " + nombreJugador1);
     * puntosJugador1++;
     * break;
     * case "tijerapiedra":
     * case "piedrapapel":
     * case "papeltijera":
     * System.out.println("Gana " + nombreJugador2);
     * puntosJugador2++;
     * break;
     * default:
     * System.out.println("Habeis empatado");
     * break;
     * }
     * 
     */

    // Muestro el marcador
    int totalGuiones = (longitudMaxima + 2) * 2 + (3 * 2) + 7; // Vaya chorizo para mostrar los guiones correctos

    for (int i = 0; i < totalGuiones; i++)
      System.out.print("-");
    System.out.println();
    System.out.printf("| %-" + (longitudMaxima + 2) + "s | %d | %d | %-" + (longitudMaxima + 2) + "s |\n",
        nombreJugador1, puntosJugador1, puntosJugador2, nombreJugador2);
    for (int i = 0; i < totalGuiones; i++)
      System.out.print("-");
    System.out.println();
  }
}

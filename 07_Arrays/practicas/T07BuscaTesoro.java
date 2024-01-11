import java.util.Scanner;

/**
 * Minijuego "Busqueda del Tesoro"
 * Se coloca una mina y un tesoro de forma aleatoria en un cuadrante de
 * cuatro filas por cinco columnas. el usuario intentará averiguar donde está el
 * tesoro
 * 
 * @author Adrián Jiménez Santiago
 */
public class T07BuscaTesoro {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Constantes que represetan las casillas
    final int VACIA = 0;
    final int TESORO = 1;
    final int MINA = 2;
    final int JUGADAS = 3;

    int fila;
    int columna;

    // Tablero bidimensional 4 filas y 5 columnas
    int[][] tablero = new int[4][5];

    // Inicializamos el tablero con casillas vacias
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero.length; j++) {
        tablero[i][j] = VACIA;

      }
    }

    // Se coloca una casilla de TESORO de forma aleatoria en el tablero
    int tesoroFila = (int) (Math.random() * 4); // Número aleatorio entre [0,4]
    int tesoroColumna = (int) (Math.random() * 5); // Número aleatorio entre [0,5]
    tablero[tesoroFila][tesoroColumna] = TESORO;

    // Se coloca una casilla de MINa de forma aleatoria en el tablero
    // Pero no puede ser la misma casilla que la del tesoro

    int minaFila;
    int minaColumna;

    do {
      minaFila = (int) (Math.random() * 4); // Número aleatorio entre [0,4]
      minaColumna = (int) (Math.random() * 5); // Número aleatorio entre [0,4]
    } while ((tesoroFila == minaFila) && (tesoroColumna == minaColumna));
    tablero[minaFila][minaColumna] = MINA;

    // Iniciamos el juego
    System.out.println("#### Bienvenido al juego del Tesoro ####");
    boolean salir = false;

    do {
      // Pintamos el tablero
      for (int i = tablero.length - 1; i >= 0; i--) {
        System.out.print(i + " |");
        for (int j = 0; j < tablero[i].length; j++) {
          if (tablero[i][j] == JUGADAS) {
            System.out.printf("%2s", "X");
          } else {
            System.out.printf("%2s", " ");
          }
        }
        System.out.println(); // Saltamos de linea para pintar la siguiente
      }
      System.out.print("   ");
      for (int i = 0; i < (3 * tablero[0].length); i++) {
        System.out.print("-");
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d", j);
      }
      System.out.println();

      // Pido las coordenadas
      System.out.print("Introduce fila: ");
      fila = sc.nextInt();
      System.out.print("Introduce la columna: ");
      columna = sc.nextInt();

      // Compruebo lo que hay en las coordenadas introducidas por el jugador
      switch (tablero[fila][columna]) {
        case VACIA:
          tablero[fila][columna] = JUGADAS;
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salir = true;
        case TESORO:
          System.out.println("Has ganado, enohrabuena.");
          salir = true;
        default:
          break;
      }
    } while (!salir); // Si salimos del do-while es por que hemos encontrado la mina o el tesoro

    // Pintamos el tablero final, en el estado en el que está una vez la partida ha
    // finalizado

    String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "*";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADAS:
            c = "X";
            break;
          default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3 * tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d", j);
    }

  }
}

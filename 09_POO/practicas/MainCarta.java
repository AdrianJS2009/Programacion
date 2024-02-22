
/** 
 * Explica tu código aquí
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.ArrayList;
public class MainCarta {

  private static boolean contieneCarta(ArrayList<Carta> baraja, Carta nuevaCarta) {

    for (Carta carta : baraja) {
      if (carta.getPalo().equals(nuevaCarta.getPalo()) && carta.getNumero() == nuevaCarta.getNumero()) {
        return true; // sigue iterando
      }
    }
    return false; // añade la carta
  }

  public static void main(String[] args) {
    String[] palos = { "Oros", "Copas", "Espadas", "Bastos" };
    ArrayList<Carta> baraja = new ArrayList<>();

    while (baraja.size() < 10) {
      int numero = (int) (Math.random() * 10) + 1; // le añado un numero del 1 al 10 random
      String palo = palos[(int) (Math.random() * 4)]; // le añado un palo random
      Carta carta = new Carta(palo, numero);

      // si la funcion devuelve false se añade la carta
      if (!contieneCarta(baraja, carta)) {
        baraja.add(carta);
      }
    }

    System.out.println("Cartas: ");
    for (Carta carta : baraja) {
      System.out.println(carta);
    }
  }
}

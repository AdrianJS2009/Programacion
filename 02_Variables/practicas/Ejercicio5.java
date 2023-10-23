/**
 * Lo mismo que el ejercicio anterior, pero convirtiendo euros a pesetas.
 * 
 * @author Adrián Jiménez Santiago
 */

public class Ejercicio5 {
  public static void main(String[] args) {
    int pesetas = 54978;
    double euros = pesetas / 166.386;

      System.out.println(pesetas + " de pesetas convertidas a euros son: " + euros + " euros.");
      System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);

  }
  
}
/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */

public class LeeNumeros {
  public static void main(String[] args) {
    String linea; // Variable que almacenará cada linea que introduzcamos por teclado

    System.out.println("Introduce un número entero: "); // Pedimos el primer número
    linea = System.console().readLine();

    int num1;
    num1 = Integer.parseInt(linea); // Convertimos de String a Int

    System.out.println("Introduce un segundo número entero: "); // Pedimos el segundo número
    linea = System.console().readLine();

    int num2;
    num2 = Integer.parseInt(linea);

    System.out.printf("El primer número es: %d\n", num1);
    System.out.printf("El segundo número es: %d\n", num2);

    System.out.println("El doble del número " + num1 + " es " + (num1 * 2));
    System.out.println(num1 + num2);

    // Parseamos float
    System.out.println("Introduce un número real: ");
    linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);
    System.out.printf("El número real introducido es: %.2f", numReal);

  }

}

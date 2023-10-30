import java.util.Scanner;

/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * dias, buenas o buenas noches se´gun la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. Sólo se tienen en cuenta las horas, los
 * minuots no se deben introductir por teclado.
 * 
 * @author Adrián Jiménez Santiago
 */

public class T04Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la hora (formato de 0 a 23): ");
    int hora = sc.nextInt();

    if (hora >= 6 && hora <= 12) {
      System.out.println("Buenos días");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("Buenas tardes");
    } else {
      System.out.println("Buenas noches");
    }

    sc.close();
  }
}

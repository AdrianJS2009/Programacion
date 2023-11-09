import java.util.Scanner;

/**
 * Escribe un programa que diga cúal es la último cifra de un número entero
 * introducido por teclado
 * 
 * @author Adrián Jiménez Santiago
 */
public class T04Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero: ");
    int numero = sc.nextInt();

    int ultimaCifra = Math.abs(numero) % 10;

    System.out.println("La última cifra del número es: " + ultimaCifra);

    sc.close();
  }
}

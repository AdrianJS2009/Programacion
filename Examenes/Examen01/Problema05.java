import java.util.Scanner;

/**
 * scribe un programa que convierta una cantidad de días a su equivalente en
 * años, meses y días. Al final de la pregunta se te proporciona la tabla de
 * códigos de colores Años tiene que tener un fondo rojo claro, meses amarillo,
 * y dias verde. También puedes usar el selector de color de Google.
 * 
 * NOTA: Considera que cada 30 días, se considera 1 mes.
 * 
 * 
 * Ejemplo I:
 * 
 * CALCULADORA DE TIEMPO
 * 
 * =====================
 * 
 * Introduce una cantidad de días: 60
 * 
 * 60 días son 0 años, 2 meses y 0 días.
 * 
 * 
 * Ejemplo II:
 * 
 * CALCULADORA DE TIEMPO
 * 
 * =====================
 * 
 * Introduce una cantidad de días: 397
 * 
 * 397 días son 1 años, 1 meses y 2 días.
 * 
 * 
 * 
 * @author Adrián Jiménez Santiago
 */

public class Problema05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("CALCULADORA DE TIEMPO");
    System.out.println("=====================");

    // Pregunto por la cantidad de dias
    System.out.print("Introduce una cantidad de días: ");
    int totalDias = sc.nextInt();

    // Calculo los años meses y dias
    int anos = totalDias / 365;
    int meses = (totalDias % 365) / 30;
    int dias = (totalDias % 365) % 30;

    System.out.print(totalDias + " dias son ");
    System.out.print("\u001B[101m" + anos + " años\u001B[0m, ");
    System.out.print("\u001B[103m" + meses + " meses\u001B[0m y ");
    System.out.println("\u001B[102m" + dias + " días\u001B[0m.");

    sc.close();
  }
}

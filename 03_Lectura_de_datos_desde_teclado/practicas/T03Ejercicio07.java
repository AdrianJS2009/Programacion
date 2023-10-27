import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print(" Introduce la base imponible de la factura: ");
    double baseImponible = sc.nextDouble();

    double impuesto = baseImponible * 0.21;
    double totalFactura = baseImponible + impuesto;

    // Imprime el resultado
    System.out.println("Base Imponible: €" + baseImponible);
    System.out.println("Impuesto (21%): €" + impuesto);
    System.out.println("Total de la factura: €" + totalFactura);

  }
}

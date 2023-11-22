
/** 
 * Realiza un programa para gestionar el ticket de compra de un supermercado. 
 * El usuario deberá escoger el número de opción de un menú que se muestre por pantalla, escribir el nombre del producto, el número de unidades y el precio por unidad
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.Scanner;

public class Problema01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double total = 0.0;

    while (true) {
      System.out.println("Menú de opciones:");
      System.out.println("1. Alimentación");
      System.out.println("2. Farmacia");
      System.out.println("3. Electrónica");
      System.out.println("4. Moda");
      System.out.println("5. Salir");
      System.out.print("Elija una opción (1-5): ");
      int opcion = sc.nextInt();

      if (opcion == 5) {
        break;
      }

      String nombreProducto;
      int unidades;
      double precioPorUnidad;
      double iva = 0.0;

      System.out.print("Nombre del producto: ");
      sc.nextLine();
      nombreProducto = sc.nextLine();

      System.out.print("Número de unidades: ");
      unidades = sc.nextInt();

      System.out.print("Precio por unidad: ");
      precioPorUnidad = sc.nextDouble();

      double subtotal = unidades * precioPorUnidad;

      // Calcular IVA
      switch (opcion) {
        case 1: // Alimentación TODO:Submenu de tipo de productos
          System.out.print("Introduzca código promocional (SINIVA/NO): ");
          sc.nextLine();
          String codigoPromocionalAlimentacion = sc.nextLine();

          if ("SINIVA".equalsIgnoreCase(codigoPromocionalAlimentacion)) {
            iva = 0.04 * subtotal; // 4% de IVA
            subtotal -= iva;
          }
          break;
        case 3: // Electrónica
          System.out.print("Introduzca código promocional (PROMO50/NO): ");
          sc.nextLine();
          String codigoPromocionalElectronica = sc.nextLine();

          if ("PROMO50".equalsIgnoreCase(codigoPromocionalElectronica)) {
            iva = 0.21 * subtotal; // 21% de IVA
            subtotal -= 0.5 * subtotal; // Descuento del 50%
          }
          break;
        case 4: // Moda
          System.out.print("Introduzca código promocional (PROMO3X2/NO): ");
          sc.nextLine();
          String codigoPromocionalModa = sc.nextLine();

          if ("PROMO3X2".equalsIgnoreCase(codigoPromocionalModa)) {
            int aPagar = unidades - (unidades / 3);
            subtotal = aPagar * precioPorUnidad;
          }
          iva = 0.21 * subtotal; // 21% de IVA
          break;
      }

      total += subtotal;

      System.out.println("---------------------------------------------");
      System.out.printf("%-20s %s%n", "Artículo", nombreProducto);
      System.out.printf("%-20s %.2f € / unidad%n", "Precio", precioPorUnidad);
      System.out.printf("%-20s %d%n", "Cantidad", unidades);
      System.out.printf("%-20s %.2f €%n", "Total", subtotal);
      System.out.printf("%-20s %.2f €%n", "IVA", iva);
      System.out.println("---------------------------------------------");
      System.out.printf("%-40s %.2f €%n", "Total con IVA", total); // Lógica del cálculo de IVA al revés?
    }
    sc.close();
  }
}

import java.util.Scanner;

/**
 * La franquicia de tiendas de ropa VísteT nos ha pedido que realicemos un
 * programa para su terminal de punto de venta. El programa deberá solicitar el
 * nombre del artículo a vender, su precio base en euros (sin IVA) y la cantidad
 * de unidades que se desean.
 * Al estar en periodo de rebajas, se aplica un descuento del 15 % sobre el
 * precio base. Con estos datos, el programa mostrará por pantalla el total de
 * la compra, aplicándole el 21% de IVA. Toda la información deberá presentarse
 * en pantalla tal y como ves en el ejemplo.
 * 
 * @author Adrián Jiménez Santiago
 */

public class Problema01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Solicito los datos del árticulo
    System.out.print("Nombre del artículo: ");
    String nombreArticulo = sc.nextLine();

    System.out.print("Precio (sin IVA) por unidad del artículo: ");
    double precioBase = sc.nextDouble();

    System.out.print("Cantidad de artículos: ");
    int cantidad = sc.nextInt();

    // Calculo el descuento y subtotal
    double descuento = precioBase * 0.15 * cantidad;
    double subtotalSinDescuento = precioBase * cantidad;
    double subtotalConDescuento = subtotalSinDescuento - descuento;

    // Calculo el IVA y el total con el descuento
    double iva = subtotalConDescuento * 0.21;
    double total = subtotalConDescuento + iva;

    System.out.println("Factura ######## Tienda VisteT");
    System.out.println("================================");
    System.out.printf("%-20s %s\n", "Artículo", nombreArticulo);
    System.out.printf("%-20s %.2f€/unidad\n", "Precio", precioBase);
    System.out.printf("%-20s %d\n", "Cantidad", cantidad);
    System.out.printf("%-20s %.2f€\n", "Subtotal", subtotalSinDescuento);
    System.out.printf("%-20s -%.2f€\n", "Descuento(15%)", descuento);
    System.out.printf("%-20s %.2f€\n", "Subtotal con descuento", subtotalConDescuento);
    System.out.printf("%-20s %.2f€\n", "IVA(21%)", iva);
    System.out.println("================================");
    System.out.printf("\u001B[1m\u001B[47m%-20s %.2f€\u001B[0m\n", "TOTAL", total);

    sc.close();
  }
}

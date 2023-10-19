/**
 * Salida formateada utilizando entero, decimales y decimales con precisión
 * 
 * @author Adrián Jiménez Santiago
 */

public class SalidaFormateada01 {
  public static void main(String[] args) {
    //En %d se introducirá "21" en este caso
    System.out.printf("El número %d no tiene decimales en pantalla. \n", 21);

    //En %f se introducirá 21.3, al ser un float y imprimirá sus decimales, 6 por defecto.
    System.out.printf("El número %f sale con  seis decimales en pantalla. \n", 21.3);

    //En %.3f se introducirá 50.4, el cual es un float y esta vez lo imprimirá con 3 decimales exactos.
    System.out.printf("El número %.3f sale exactamente con %d decimales. \n", 50.4, 3);

    //Aqui %c imprime en pantalla el equivalente introducido en ASCII, en este caso 83 = S.
    System.out.printf("Letra: %c. \n,", 83);
    
  }
}

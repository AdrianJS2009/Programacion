import java.util.Scanner;

public class T05_Ejercicio37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroDecimal = sc.nextInt();
    sc.close();

    // Transformo el dígito a palotes
    String resultado = convertirAPalotes(numeroDecimal);

    System.out.println("El " + numeroDecimal + " en decimal es el " + resultado + " en el sistema de palotes.");
  }

  // Función para convertir un número a palotes
  public static String convertirAPalotes(int numero) {
    String palotes = "";

    // En caso de que sea 0
    if (numero == 0) {
      return "|";
    }

    // Convierto todos los dígitos a palotes
    while (numero > 0) {
      int digito = numero % 10;
      palotes = convertirDigitoAPalotes(digito) + " " + palotes;

      // Agregar un espacio y un guión ("-") entre grupos de 5 palotes
      if (numero > 9) {
        palotes = "- " + palotes;
      }

      numero /= 10;
    }

    // Elimino espacios en blanco al principio y al final del String
    return palotes.trim();
  }

  // Con esta función convierto dígitos a palos
  public static String convertirDigitoAPalotes(int digito) {
    // Utilizo "|" para representar el 0
    if (digito == 0) {
      return "|";
    }

    String palotes = "";
    for (int i = 0; i < digito; i++) {
      palotes += "|";
    }
    return palotes;
  }
}

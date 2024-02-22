
/** 
 * Explica tu código aquí
 * 
* @author Adrián Jiménez Santiago
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioEvaluable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Atributos
    int puntuacion = 0;

    // Almaceno los paises y sus capitales en un hashmap
    HashMap<String, String> paisesCorrectos = new HashMap<>();
    paisesCorrectos.put("España", "Madrid");
    paisesCorrectos.put("Francia", "París");
    paisesCorrectos.put("Italia", "Roma");
    paisesCorrectos.put("Alemania", "Berlín");
    paisesCorrectos.put("Portugal", "Lisboa");
    paisesCorrectos.put("Rusia", "Moscú");
    paisesCorrectos.put("Reino Unido", "Londres");
    paisesCorrectos.put("Grecia", "Atenas");
    paisesCorrectos.put("Noruega", "Oslo");
    paisesCorrectos.put("Suecia", "Estocolmo");

    // En un arraylist las incorrectas, .addAll para ahorrarme los control+v
    ArrayList<String> capitalesMalas = new ArrayList<>();
    Collections.addAll(capitalesMalas,
        "Viena", "Bruselas", "Helsinki", "Dublín", "Nicosia", "Praga", "Tallín", "Riga", "Vilna", "La Valeta",
        "Ámsterdam", "Varsovia", "Bucarest", "Belgrado", "Sofía", "Berna", "Bakú", "Minsk", "Sarajevo", "Skopie");

    ArrayList<String> paises = new ArrayList<>(paisesCorrectos.keySet());
    Collections.shuffle(paises);

    for (int i = 0; i < 10; i++) {
      String paisActual = paises.get(i);
      String capitalCorrecta = paisesCorrectos.get(paisActual);

      ArrayList<String> opciones = new ArrayList<>();
      while (opciones.size() < 2) {
        String capitalIncorrecta = capitalesMalas.get((int) (Math.random() * capitalesMalas.size()));
        if (!capitalIncorrecta.equals(capitalCorrecta) && !opciones.contains(capitalIncorrecta)) {
          opciones.add(capitalIncorrecta);
        }
      }
      opciones.add(capitalCorrecta);
      Collections.shuffle(opciones);

      // preguntamos
      System.out.println("¿Cuál es la capital de " + paisActual + "?");
      for (int j = 0; j < 3; j++) {
        System.out.println((j + 1) + ". " + opciones.get(j));
      }

      System.out.print("Respuesta: ");
      int respuesta = sc.nextInt() - 1;

      // acumulador de puntuacion
      if (respuesta >= 0 && respuesta < 3 && opciones.get(respuesta).equals(capitalCorrecta)) {
        System.out.println("¡Correcto!");
        puntuacion++;
      } else {
        System.out.println("Incorrecto. La respuesta correcta es " + capitalCorrecta);
      }
    }

    System.out.println("Puntuación: " + puntuacion + ".");
    if (puntuacion >= 5) {
      System.out.println("¡Enhorabuena! ¡Has aprobado!");
    } else {
      System.out.println("Has suspendido, haber estudiado más.");
    }
  }
}

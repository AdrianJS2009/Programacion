
/**
 * Quiniela
 * 
 * @author Adrián Jiménez Santiago
 */

import java.util.Random;

public class EjercicioEvaluable01 {

  public static void main(String[] args) {

    // Atributos
    Random random = new Random();
    String resultado;
    String apuesta;

    // Arrays que almacenan las apuestas y los goles y un acumulador de aciertos.
    String[] apuestas = { "1", "X", "2" };
    String[] goles = { "0", "1", "2", "M" };
    int[] aciertos = new int[3];

    for (int i = 1; i <= 15; i++) { // 14 partidos mas el pleno [15]
      System.out.printf("Partido %2d: ", i);

      for (int j = 0; j < 3; j++) { // Tres columnas de apuestas
        if (i <= 14) { // Para los primeros 14 partidos
          apuesta = apuestas[random.nextInt(apuestas.length)];
        } else { // Pleno al 15
          apuesta = goles[random.nextInt(goles.length)] + "-" + goles[random.nextInt(goles.length)];
        }
        System.out.print(apuesta + "   ");

      }
      // Generar y mostrar resultado
      if (i <= 14) {
        resultado = apuestas[random.nextInt(apuestas.length)];
      } else {
        resultado = goles[random.nextInt(goles.length)] + "-" + goles[random.nextInt(goles.length)];
      }
      System.out.println(" Resultado: " + resultado);

      // Acumulador aciertos TODO: La he liado con los aciertos?
      for (int j = 0; j < 3; j++) {
        if (i <= 14) {
          apuesta = apuestas[random.nextInt(apuestas.length)];
        } else {
          apuesta = goles[random.nextInt(goles.length)] + "-" + goles[random.nextInt(goles.length)];
        }
        if (apuesta.equals(resultado)) {
          aciertos[j]++;
        }
      }
    }

    // Muestro número de aciertos y control de premio
    for (int i = 0; i < aciertos.length; i++) {
      System.out.println("Apuesta " + (i + 1) + " tiene " + aciertos[i] + " aciertos.");
      if (aciertos[i] >= 10) {
        System.out.println("¡Has obtenido un premio!");
      }
    }
  }
}

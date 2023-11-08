import java.time.LocalTime;

/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche
 * 
 * @author Adrián Jiménez Santiago
 */

public class T04Ejercicio11 {

  public static void main(String[] args) {
    // Obtener la hora actual
    LocalTime horaActual = LocalTime.now();

    // Calcular los segundos hasta medianoche
    long segundosHastaMedianoche = horaActual.until(LocalTime.MAX, java.time.temporal.ChronoUnit.SECONDS);

    // Verificar si es medianoche
    if (segundosHastaMedianoche == 0) {
      System.out.println("¡Es medianoche!");
    } else {
      // Imprimir los segundos restantes hasta medianoche
      System.out.println("Segundos hasta medianoche: " + segundosHastaMedianoche);
    }
  }
}

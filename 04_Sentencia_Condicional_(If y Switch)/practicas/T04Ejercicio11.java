import java.time.LocalTime;

/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche
 * 
 * @author Adrián Jiménez Santiago
 */

public class T04Ejercicio11 {

  public static void main(String[] args) {
    // Obtengo mi hora a través de LocalTime
    LocalTime horaActual = LocalTime.now();

    // Calculo los segundos que faltan hasta las 00:00
    long segundosHastaMedianoche = horaActual.until(LocalTime.MAX, java.time.temporal.ChronoUnit.SECONDS);

    // Controlo que sea media noche por si acaso
    if (segundosHastaMedianoche == 0) {
      System.out.println("¡Es medianoche!");
    } else {
      // Imprimir los segundos restantes hasta medianoche
      System.out.println("Segundos hasta medianoche: " + segundosHastaMedianoche);
    }
  }
}

/**
 * 
 * 
 * int hora;
 * int minutos;
 * 
 * int segundosTranscurridos = hora (hora * 3600) + (minutos * 60);
 * int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
 * System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d
 * segundos. \n", hora, minutos, segundos)
 */

import java.util.Scanner;

/**
 * Uno de los factores que mide la vita útil de un disco duro SSD es la cantidad
 * de TWB (TeraBytes Written). Así, un SSD Crucial MX500 con 360 TWB, si
 * queremos que tenga una vida útil de 10 años, puedes escribir como máximo
 * aproximadamente 0.0986 terabytes (98.6 GB) de datos por día.
 * 
 * Implemente un programa que pida la cantidad del factor TWB de un disco duro
 * SSD y que calcule el número de terabytes (TB) y su equivalencia en gigabytes
 * GB de datos que podemos escribir por día como máximo si deseas que tu SSD
 * dure 6 años.
 * 
 * NOTA: Considera, por defecto, que un año son 365 días.
 * 
 * Ejemplo de salida:
 * 
 * VIDA ÚTIL SSD
 * 
 * =========
 * 
 * Introduzca el factor TBW de tu disco duro SSD: 360
 * 
 * La cantidad máxima de terabytes que puedes escribir por día es: 0.0986 TB
 * (98.6 GB)
 * 
 * @author Adrián Jiménez Santiago
 */

public class Problema04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("VIDA ÚTIL SSD");
    System.out.println("========");

    // Pregunto el factor TBW al usuario.
    System.out.print("Introduzca el factor TBW de tu disco duro SSD: ");
    double tbw = sc.nextDouble();

    // Calculos los TB y GB que puede escribir al día.
    int diasAno = 365;
    int duracionEsperada = 6;
    double tbPorDia = tbw / (duracionEsperada * diasAno);
    double gbPorDia = tbPorDia * 1024; // Conversión de TB a GB

    System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es: %.4f TB (%.1f GB)\n", tbPorDia,
        gbPorDia);

    sc.close();
  }
}

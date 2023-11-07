import java.util.Scanner;

/**
 * Explicación del código
 * Escribe un programa que calcule el volumen de un tronco de cono según la
 * siguiente fórmula:
 * 
 * V = (1/3)πh(R2 + r2 + Rr)
 * 
 * @author Adrián Jiménez Santiago
 */

public class Problema03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Creo que el titulo está en negrita Sergio, por eso lo he formateado así
    System.out.println("\u001B[1mVOLUMEN DE UN TRONCO DE CONO\u001B[0m");
    System.out.println("=====================");

    // Solicito los datos al usuario
    System.out.print("Introduzca el radio de la base mayor R (cm): ");
    double R = sc.nextDouble();

    System.out.print("Introduzca el radio de la base menor r (cm): ");
    double r = sc.nextDouble();

    System.out.print("Introduzca la altura h (cm): ");
    double h = sc.nextDouble();

    // Calculo el volumen
    double volumen = (1.0 / 3.0) * Math.PI * h * (Math.pow(R, 2) + Math.pow(r, 2) + R * r);

    // Muestro el resultado por pantalla
    System.out.printf("[31mEl volumen del tronco de cono es de \u001B[31m%.4f cm\u00B3\n\u001B[0m", volumen);

    sc.close();
  }

}

import java.util.Scanner;

/**
 * Explicación del código
 * 
 * @author Adrián Jiménez Santiago
 */
public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cúantas horas has trabajado?");
    double horas = sc.nextDouble();

    double extra = horas * 12;

    double salarioSemanal = extra;

    System.out.println("Tu horario esta semana es de: " + salarioSemanal + "€");
  }
}

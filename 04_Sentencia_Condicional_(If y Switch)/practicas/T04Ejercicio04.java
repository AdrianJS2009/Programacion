import java.util.Scanner;

/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcula el salario semanal de un
 * trabajador teniendo en que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 * 
 * @author Adrián Jiménez Santiago
 */
public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número de horas que has trabajado durante la semana");
    int horasTrabajadas = sc.nextInt();
    int sueldoSemanal;

    if (horasTrabajadas >= 40) {
      sueldoSemanal = horasTrabajadas * 12;
    } else {
      sueldoSemanal = (40 * 20) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("El sueldo que corresponde es de " + sueldoSemanal + " €");

  }
}

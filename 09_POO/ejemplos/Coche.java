/**
 * ejemplo de una clase coche
 * 
 * @author Adrián Jiménez Santiago
 */

public class Coche {

  // Atributos

  String matricula;
  String marca;
  String modelo;
  String color;
  int puertas;
  int potencia;

  public static void main(String[] args) {

    // Para crear un objeto de una clase se hace:
    // Nombre_clase seguido de nombre_objeto = new Nombre_clase();
    Coche miCoche = new Coche(); // Coche1
    Coche tuCoche = new Coche(); // Coche 2

    miCoche.matricula = "1234ABC";
    tuCoche.matricula = "5678DEF";

    System.out.println("Matrícula coche 1: " + miCoche.matricula);
    System.out.println("Potencia coche 1: " + miCoche.potencia);

    System.out.println("Matrícula coche 2: " + tuCoche.matricula);
    System.out.println("Potencia coche 2: " + tuCoche.potencia);
  }
}

/**
 * ejemplo de una clase coche
 * 
 * @author Adrián Jiménez Santiago
 */

public class Coche {

  // Atributos

  private String matricula;
  private String marca;
  private String modelo;
  private int kilometraje;
  private static int kimoletrajeTotal = 0;

  public Coche(String matricula, String marca, String modelo, int kilometraje) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.kilometraje = 0;
  }

  public int getKilometraje() {
    return this.kilometraje;
  }

  public void recorre(int cantidad) {
    this.kilometraje += cantidad;
    kimoletrajeTotal += cantidad;
  }

  // Métodos de la clase

  public static int getKilometrajeTotal() {
    return kimoletrajeTotal;
  }

}
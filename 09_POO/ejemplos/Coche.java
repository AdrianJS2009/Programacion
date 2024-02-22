/**
 * ejemplo de una clase coche
 * 
 * @author Adrián Jiménez Santiago
 */

public class Coche extends Vehiculo {

  // Atributos

  private String matricula;
  private String marca;
  private String modelo;

  public Coche(String matricula, String marca, String modelo, int kilometraje) {
    super();
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;

  }

  public void quemaRueda() {
    System.out.println("Brooom ~");
  }

}
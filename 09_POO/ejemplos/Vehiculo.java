public abstract class Vehiculo {
  // Atributos de Clase

  private static int vehiculosCreados;
  private static int kilometrosTotales;

  // Atributos de Objeto

  private int kilometrosRecorridos;

  // Constructor

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public void recorre(int km) {
    this.kilometrosRecorridos += km;
    kilometrosTotales += km;
  }

  // Método de Clase
  public static int getKiloetrosTotales() {
    return kilometrosTotales;
  }
}

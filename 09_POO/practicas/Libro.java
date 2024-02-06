/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class Libro extends Publicacion implements Prestable {
  // Atributos

  private boolean disponible = false;

  // Constructor

  public Libro(String isbn, String titulo, int año) {
    super(isbn, titulo, año);
  }

  // Hacemos Override del método prestar de la interfaz prestable
  @Override
  public void prestar() {
    if (this.disponible) {
      System.out.println("El libro no está disponible por que ya está prestado.");
    } else {
      this.disponible = true;
    }
  }

  // Override para el mñetodo devolver
  @Override
  public void devolver() {
    this.disponible = false;
  }

  // Override del toString
  @Override
  public String toString() {
    return super.toString() + " (" + (this.disponible ? "no disponible" : "disponible") + ")";
  }

  // Override de estaPrestado
  @Override
  public boolean estaPrestado() {
    return this.disponible;
  }
}

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

// Clase Padre
public class Publicacion {
  // Atributos

  private String isbn;
  private String titulo;
  private int año;

  // Constructor
  public Publicacion(String isbn, String titulo, int año) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.año = año;
  }

  @Override
  public String toString() {

    return "ISBN: " + isbn + ", titulo: " + titulo + ", año de la publicación: " + año;
  }

}

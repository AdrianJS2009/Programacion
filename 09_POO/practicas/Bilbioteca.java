/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class Bilbioteca {

  public static void main(String[] args) {
    // Constructores
    // Libros
    Libro libro1 = new Libro("159879", "Canción de Hielo y Fuego", 2010);
    Libro libro2 = new Libro("547987", "Da Vinci", 2019);
    Libro libro3 = new Libro("1456549", "Camino de los Reyes", 2016);
    Libro libro4 = new Libro("915765", "Mistborn", 2012);

    // Revistas
    Revista revista1 = new Revista("87987", "Revista Pop", 2010, 6);
    Revista revista2 = new Revista("15689", "Revista MARCA", 2019, 246);

    // Los muestro por pantalla
    System.out.println(libro1);
    System.out.println(libro2);
    System.out.println(libro3);
    System.out.println(revista1);
    System.out.println(revista2);
    libro2.prestar();
    if (libro2.estaPrestado()) {
      System.out.println("El libro está prestado");
    }
    libro2.prestar();
    libro2.devolver();
    if (libro2.estaPrestado()) {
    }
    System.out.println("El libro está prestado");
  }
  // libro3.prestar();
  // System.out.println(libro2);
  // System.out.println(libro3);

}

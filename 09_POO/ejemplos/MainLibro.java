/**
 * El Main de la clase Libro
 * 
 * @author Adrián Jiménez Santiago
 */

public class MainLibro {
  public static void main(String[] args) {
    Libro recetas = new Libro();
    Libro chistes = new Libro();
    Libro cuentos = new Libro();

    recetas.titulo = "Recetas Arguiñano para salvar tu Navidad";
    recetas.autor = "Carlos Arguiñanos";
    recetas.numeroPaginas = 189;

    System.out.println("Titulo: " + recetas.titulo);
    System.out.println("Autor: " + recetas.autor);
    System.out.println("Número de páginas: " + recetas.numeroPaginas);
    System.out.println("Edición: " + recetas.numeroEdicion);
  }
}

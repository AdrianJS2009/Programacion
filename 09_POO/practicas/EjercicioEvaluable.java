import java.util.HashMap;
import java.util.Scanner;

/**
 * 3 intentos para acceder
 * 
 * usuario y contraseña por hashmap
 */
public class EjercicioEvaluable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> bbdd = new HashMap<>();

    String usuario;
    String pass;
    boolean acceso = false;
    int intentos = 3;

    bbdd.put("admin", "112233");
    bbdd.put("adrian", "ajimsan");
    bbdd.put("ismael", "jimenez");

    do {
      System.out.println("Por favor introduce el nombre de usuario con el que quieres logear: ");
      usuario = sc.nextLine();
      System.out.println("Introduce la contraseña por favor");
      pass = sc.nextLine();

      if (bbdd.containsKey(usuario)) { // El usuario existe
        if (bbdd.get(usuario).equals(pass)) { // La contraseña coincide
          System.out.println("Bienvenido " + usuario + " disfruta de tu estancia");
          acceso = true;
        } else {
          System.out.println("La contraseña para el usuario " + usuario + " es incorrecta");
        }
      } else {
        System.out.println("El usuario introducido no está registrado");
      }
      intentos--;
    } while (!acceso && intentos > 0);

  }

}
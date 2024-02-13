public class MainCoche {
  public static void main(String[] args) {
    Coche cocheDeLuis = new Coche("aaaa", "Seat", "Cordoba", 25);
    Coche cocheDeAdroam = new Coche("bbbbb", "Nissan", "Qashqai", 40);
    cocheDeAdroam.recorre(25);
    cocheDeLuis.recorre(105);

    System.out.println("El coche de Luis ha recorrido " + cocheDeLuis.getKilometraje() + "km");
    System.out.println("El coche de Adrian ha reccorido " + cocheDeAdroam.getKilometraje() + "km");

  }
}

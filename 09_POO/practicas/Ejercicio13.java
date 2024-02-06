class Ejercicio13 {

  // Atributos
  private String numero = "";
  private double saldo;

  // Constructores
  public Ejercicio13() {
    this.generaNumero();
  }

  public Ejercicio13(double saldo) {
    this.generaNumero();
    this.saldo = saldo;
  }

  // Métodos

  private void generaNumero() {
    for (int i = 0; i < 10; i++) {
      numero += (int) (Math.random() * 10);
    }
  }

  @Override
  public String toString() {
    return "Número de cta: " + numero + " Saldo: " + String.format("%.2f", saldo) + " €";
  }

  void ingreso(int dinero) {
    saldo += dinero;
  }

  void cargo(int dinero) {
    saldo -= dinero;
  }

  void transferencia(Ejercicio13 cuentaDestino, int dinero) {
    saldo -= dinero;
    cuentaDestino.saldo += dinero;
  }
}
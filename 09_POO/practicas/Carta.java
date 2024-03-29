/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */

public class Carta {
    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}

import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Adrián Jiménez Santiago
 */
public class T05_Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        // Convierto mi variabile numero a un String
        String numeroStr = Integer.toString(numero);

        // Hago uso del .lenght y voy en negativo (al revés) y localizo el caracter
        // usando .charAt (que solo funciona con String)
        String numeroAlReves = "";
        for (int i = numeroStr.length() - 1; i >= 0; i--) {
            numeroAlReves += numeroStr.charAt(i);
        }

        System.out.println(numero + " al revés es: " + numeroAlReves);

        sc.close();
    }
}

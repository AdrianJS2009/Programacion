import java.util.InputMismatchException;
import java.util.Scanner;

public class T05_EjercicioHistograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeros = ""; // String vacio para guardarme los números
        int maxNum = 0;

        System.out.println("Introduce números entre 0 y 9 (negativo para terminar):");

        while (true) {
            try {
                int num = sc.nextInt();
                if (num < 0) {
                    break; // Salgo del bucle si se introduce un número negativo
                }

                if (num >= 0 && num <= 9) {
                    numeros += num; // Añado el número al String numeros
                    if (num > maxNum) {
                        maxNum = num; // Aqui actualizo cual es el número máximo para saber como de larga tengo que
                                      // hacer la tabla
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número entero válido.");
                sc.next();
            }
        }

        // Aqui leo los números introducidos anteriormete y monto la tabla.
        for (int i = 0; i < numeros.length(); i++) {
            int num = Character.getNumericValue(numeros.charAt(i));

            // Primera línea de ---
            for (int j = 0; j < maxNum + 2; j++) {
                System.out.print("--- ");
            }
            System.out.println();

            // Imprimo la fila con el número y asteriscos correspondientes a la longitud del
            // número
            System.out.print("| \033[33m" + num + "\033[0m |"); // Número en amarillo
            for (int j = 0; j < maxNum; j++) {
                if (j < num) {
                    System.out.print(" \033[32m*\033[0m |"); // Asterisco en verde
                } else {
                    System.out.print("   |");
                }
            }
            if (num == maxNum) {
                System.out.println(" \033[32m*\033[0m |"); // Último asterisco si el número es igual a maxNum
            } else {
                System.out.println();
            }
        }

        // Línea final de la tabla
        for (int i = 0; i < maxNum + 2; i++) {
            System.out.print("--- ");
        }
    }
}

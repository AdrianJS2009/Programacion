import java.util.InputMismatchException;
import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder numeros = new StringBuilder();
        int maxNum = 0;

        System.out.println("Introduce números entre 0 y 9 (negativo para terminar):");
        while (true) {
            try {
                int num = scanner.nextInt();
                if (num < 0)
                    break;
                if (num >= 0 && num <= 9) {
                    numeros.append(num);
                    if (num > maxNum)
                        maxNum = num;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
                continue;
            }
        }

        String numOriginal = numeros.toString();

        // Bucle inicial para crear la tabla a partir de los números introducidos
        for (int i = 0; i < numOriginal.length(); i++) {
            int num = Character.getNumericValue(numOriginal.charAt(i));

            // Imprimir línea divisoria
            for (int j = 0; j < maxNum + 2; j++) {
                System.out.print("--- ");
            }
            System.out.println();

            // Muestra por pantalla la fila con número y asteriscos correspondientes
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

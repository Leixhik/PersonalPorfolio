/*
    Read two series of 10 integers, which will be sorted in ascending order.
    Merge the two arrays into a third array, so that they remain sorted.
 */

import java.util.Scanner;

public class excercise14_fusionarTablas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar las variables
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        int[] numeros3 = new int[20];
        int i = 0, j = 0;

        // Leer las dos series de números
        System.out.print("Introduzca los números de la primera serie:");
        for (i = 0; i < numeros1.length; i++) {
            numeros1[i] = scanner.nextInt();
        }

        System.out.print("Introduzca los números de la segunda serie:");
        for (j = 0; j < numeros2.length; j++) {
            numeros2[j] = scanner.nextInt();
        }

        // Fusionar las dos series
        i = 0;
        j = 0;
        while (i < numeros1.length && j < numeros2.length) {
            if (numeros1[i] <= numeros2[j]) {
                numeros3[i + j] = numeros1[i];
                i++;
            } else {
                numeros3[i + j] = numeros2[j];
                j++;
            }
        }

        // Añadir los elementos restantes
        if (i < numeros1.length) {
            System.arraycopy(numeros1, i, numeros3, i + j, numeros1.length - i);
        }

        if (j < numeros2.length) {
            System.arraycopy(numeros2, j, numeros3, i + j, numeros2.length - j);
        }

        // Mostrar la serie fusionada
        System.out.print("Serie fusionada:");
        for (int numero : numeros3) {
            System.out.print(numero + " ");
        }
    }
}

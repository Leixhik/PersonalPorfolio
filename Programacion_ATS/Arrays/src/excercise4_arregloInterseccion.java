/*
  Read 10 integer numbers, store them in an array.
  Display the numbers in the following order:
  first, last, second, penultimate, etc
 */

import java.util.Scanner;

public class excercise4_arregloInterseccion {
        public static void main(String[] args) {
            // Inicializar un arreglo para almacenar los 10 números
            int[] numeros = new int[10];

            // Leer 10 números enteros y guardarlos en el arreglo
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese un número entero: ");
                numeros[i] = scanner.nextInt();
            }

            // Llamar a la función para mostrar los números en el orden especificado
            mostrarEnOrden(numeros);
        }

        // Definir una función para mostrar los números en el orden especificado
        public static void mostrarEnOrden(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n / 2; i++) {
                System.out.println(nums[i] + " " + nums[n - 1 - i]);
            }

            // Si el número total es impar, imprimir el elemento central
            if (n % 2 != 0) {
                System.out.println(nums[n / 2]);
            }
        }
    }

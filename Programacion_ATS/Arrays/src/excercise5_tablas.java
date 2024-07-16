/*
    Read two arrays of 10 integers each from the keyboard and merge them into a third array in the following way:
     the 1st element from array A, the 1st element from array B, the 2nd element from array A,
     the 2nd element from array B, and so on.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class excercise5_tablas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[10]; //Array 10 elements.
        b = new int[10]; //Array 10 elements.
        c = new int[20]; //Array 20 elements.

        //Pedir Array A:
        System.out.println("Ingresa el primer arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Ingresa un valor: ");
            a[i] = entrada.nextInt();
        }

        //Pedir Array B:
        System.out.println("Ingresa el segundo arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Ingresa un valor: ");
            b[i] = entrada.nextInt();
        }
        //Mezclar arreglos en C:
        //se utilizará el iterador i para a y b
        //y el iterador j para el arreglo c.
        int j=0;
        for (int i=0;i<10;i++){
            c[j] = a[i]; //1°A, 2°A...
            j++;
            c[j] = b[i]; //1°B, 2°B...
            j++;
        }

        System.out.println("\nEl tercer arreglo es: ");
        for (int i=0;i<20;i++){
            System.out.println(c[i]+" ");
        }
        System.out.println();
    }
}
//Si puedes imaginarlo...
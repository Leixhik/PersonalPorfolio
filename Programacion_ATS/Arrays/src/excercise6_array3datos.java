/*
    Read the data corresponding to two tables of 12 numeric elements and mix them into a third table as follows:
    3 from table A, 3 from table B, another 3 from A, another 3 from B, etc.
 */

import java.util.Scanner;

public class excercise6_array3datos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[12];
        b = new int[12];
        c = new int[24];

        //Array A
        System.out.println("Lista A");
        for (int i=0;i<12;i++){
            System.out.print((i+1)+". Ingresa el valor (A): ");
            a[i] = entrada.nextInt();
        }

        //Array B
        System.out.println("Lista B");
        for (int i=0;i<12;i++){
            System.out.print((i+1)+". Ingresa el valor (B):");
            b[i] = entrada.nextInt();
        }

        //Array C
        c= new int[a.length+b.length];
        for (int i = 0, j = 0; i < a.length; i += 3, j += 6) {
            System.arraycopy(a, i, c, j, 3);
            System.arraycopy(b, i, c, j + 3, 3);
        }
        for (int elemento : c) {
            System.out.print(elemento + " ");
        }
    }
}

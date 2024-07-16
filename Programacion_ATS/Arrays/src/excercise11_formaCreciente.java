/*
    Read 5 numerical elements that will be entered in increasing order. These will be stored in a table of size 10.
    Read a number N, and insert it in the appropriate place so that the table continues to be ordered.
 */

import java.util.Scanner;

public class excercise11_formaCreciente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitio_num=0, j=0;

        System.out.println("Llenar el arreglo");
        do {
            //Llenar Arreglo
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Ingresa un valor: ");
                arreglo[i] = entrada.nextInt();
            }

            //Comprobar si el arreglo está ordenado en orden creciente.
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) { //Creciente: 1,2,3...
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) { //Decreciente: 3,2,1
                    creciente = false;
                    break;
                }

                if (creciente == false) {
                    System.out.println("\nEl arreglo no está ordenado en forma creciente.");
                }
            }
        } while (creciente == false);

        System.out.print("\nDigita un elemento a insertar: ");
        numero = entrada.nextInt();

        //En que posición va el numero
        while (arreglo[j]<numero && j<5){
            sitio_num++;
            j++;
        }

        //Trasladar una posicion en el arreGlo a los elementos
        //que van detras del numero.
        for (int i=4;i>=sitio_num;i--){
            arreglo[i+1]= arreglo[i];
        }

        //Insertar numero que usuario usó
         arreglo[sitio_num] = numero;

        System.out.println("\nEl arreglo queda: ");
        for (int i=0;i<6;i++){
            System.out.print(arreglo[i] +" - ");
        }
        System.out.println();

    }
}

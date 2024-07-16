/*
    Read from the keyboard an array of 10 integer numbers and a position (between 0 and 9).
    Delete the element located at the given position without leaving gaps.
 */

import java.util.Scanner;

public class excercise12_eliminarArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int num;

        //Pedir los 10 numeros
        System.out.println("Ingresa los 10 numeros: ");
        for (int i=0; i<10;i++){
            System.out.print(i+1+". Ingrese el número: ");
            arreglo[i] = entrada.nextInt();
        }

        //Pedir la posición a eliminar
        do {
            System.out.print("Ingresa la posicion a eliminar(entre 0 y 9): ");
            num = entrada.nextInt();
        } while (num>=10 || num<0);

        //Eliminar el numero de la posicion obtenida
        for (int i = 0; i<9;i++){
            if (i>=num){
                arreglo[i]=arreglo[i+1];
            }
        }

        //Impresión del resultado
        System.out.println("El resultado es: ");
        for (int i=0; i<9;i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
    }
}

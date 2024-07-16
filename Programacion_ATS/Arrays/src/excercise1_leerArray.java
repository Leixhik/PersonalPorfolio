import javax.swing.*;
import java.util.Scanner;

/*
    Read 5 numbers, store them in an array, and display them in the same order they were entered
 */
public class excercise1_leerArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float[5];

        System.out.println("Guardando los datos en el arreglo");
        for (int i=0;i<5;i++){
            System.out.print((i+1)+".Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }

        System.out.println("\nImprimir los elementos del arreglo");
        for (Float i:numeros){
            System.out.println(i);
        }
    }
}

/*
    Read 5 numbers, save them in array and show the array in the reverse order
    when entering it
*/

import javax.swing.*;
import java.util.Scanner;

public class excercise2_arregloInverso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];

        System.out.println("Guardando los datos del arreglo");
        for (int i=4;i>=0;i--){
            System.out.println("Ingresa un valor: ");
            numeros[i] =entrada.nextFloat();
        }
        for (float i:numeros){
            System.out.println(i);
        }
    }
}
//Este programa fue con ayuda de la comunidad.

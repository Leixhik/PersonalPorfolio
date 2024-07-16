/*
    Create a program that reads an array of 10 integers from the keyboard and shifts it down one position:
    the first becomes the second, the second becomes the third, and so on. The last one becomes the first.
 */
import java.util.Scanner;
public class excercise9_desplazamiento {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int arreglo[]= new int[10];
       int ultimo;

        System.out.println("Llenar el Arreglo");
        for (int i=0;i<10;i++){
            System.out.print(i+". Ingresa un valor: ");
            arreglo[i] = entrada.nextInt();
        }

        ultimo = arreglo[9]; //Se guarda el ultimo elemento.

        for (int i=8;i>=0;i--){ // Avanzar una posicion abajo en el arreglo.
            arreglo[i+1] = arreglo[i];
        }

        arreglo[0]= ultimo; // Ultimo elemento como Primero.

        System.out.println("\nEL nuevo arreglo es: ");
        for (int i=0;i<10;i++){
            System.out.println(i+".Número : "+arreglo[i]);
        }
    }
}

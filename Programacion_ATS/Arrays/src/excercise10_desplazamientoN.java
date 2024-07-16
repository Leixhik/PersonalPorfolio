import java.util.Scanner;

/*
    Create a program that reads an array of 10 integers from the keyboard and shifts it N positions
    in the array (N is entered by the user).
 */

public class excercise10_desplazamientoN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];

        //Llenar Arreglo
        System.out.println("Llenar Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i + ". Ingresa el valor: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.print("Arreglo Original: ");
        for (int numero: arreglo){
            System.out.print(numero + " ");
        }
        System.out.println(" ");

        System.out.println("Ingresa el numero de posiciones a desplazar: ");
        int n = entrada.nextInt();
        desplazarArray(arreglo, n);

        System.out.println("Arreglo desplazado "+ n +" posiciones: ");
        for (int numero : arreglo){
            System.out.println(numero + " ");
        }
        System.out.println("");
    }

    public static void desplazarArray(int[] array, int n) {
        int[] ultimo = new int[n];
        for (int i = array.length-n; i< array.length;i++){
            ultimo[i - (array.length - n)] = array[i];
        }
        for (int i=array.length-1;i>=n;i--){
            array[i] = array[i-n];
        }
        for (int i=0;i<n;i++){
            array[i] = ultimo[i];
        }

    }
}

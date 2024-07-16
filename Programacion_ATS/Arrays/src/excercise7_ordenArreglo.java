/*
    Read a series of 10 integers from the keyboard.
    The application should indicate to us if the numbers are ordered
    in increasing, decreasing, or disordered order.
 */

import java.util.Scanner;

public class excercise7_ordenArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente = false;

        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Ingresa un valor: ");
            arreglo[i] = entrada.nextInt();
        }
        for (int i=0;i<9;i++){
            if (arreglo[i] < arreglo[i+1]){ // Creciente: 1, 2, 3...
                creciente = true;
            }

            if (arreglo[i] > arreglo[i+1]){ // Decreciente: 3, 2, 1...
                decreciente = true;
            }
        }
        if (creciente==true && decreciente==false){
            System.out.print("\nEl Arreglo está en forma creciente: ");
        } else if (creciente==false && decreciente==true) {
            System.out.print("\nEl Arreglo está en forma decreciente: ");
        }else if(creciente==true && decreciente ==true){
            System.out.print("\nEl Arrelgo está desordenado");
        }else if(creciente==false && decreciente==false){
            System.out.print("\nTodos los numeros son iguales");
        }
    }
}

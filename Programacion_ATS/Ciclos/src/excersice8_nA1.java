/*
    Get a number N and show all the numbers from 1 to N.
 */


import java.util.Scanner;

public class excersice8_nA1 {

    public static void main(String[] args) {

        //Variables
        int x;

        Scanner var = new Scanner(System.in);
        System.out.println("Ingresa el numero al que deseas llegar: ");
        x = var.nextInt();

        for (int i=1; i<=x; i+=1){ //int = Decalarar variable, i=1 es el valor inicial de i, i<=x es el valor limite de i, i+=1 es el valor que ira incrementando.
            System.out.println(i); //Imprimir i x cada repetición.
        }
    }

}

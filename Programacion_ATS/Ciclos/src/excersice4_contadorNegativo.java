/*
    Pedir números hasta que se teclee uno negativo.
    Ir mostrando cuantos números se han introducido.
 */


import javax.swing.*;
import java.util.Scanner;

public class excersice4_contadorNegativo {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero, contador=0;

        System.out.println("Ingresa un número: ");
        numero = entrada.nextInt();

        while(numero>=0) {
            contador++;
            System.out.println("Ingresa otro número: ");
            numero = entrada.nextInt();
        }
        System.out.println("Se registraron "+contador+" numeros");
    }
}


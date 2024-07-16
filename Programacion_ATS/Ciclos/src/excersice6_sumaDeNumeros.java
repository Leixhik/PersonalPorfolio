/*
    Ask for numbers until 0 is entered. Then, show the sum of all the entered numbers
 */

import javax.swing.*;

public class excersice6_sumaDeNumeros {

    public static void  main(String[] args){
        int numero, contador = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

            contador +=numero;
        } while(numero != 0); // Seguir ejecutando mientras no sea un cero el numero ingresado.
        System.out.println("La suma de todos tus numeros ingresadors será de: "+contador);
    }
}

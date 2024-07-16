/*
    Ask for numbers until the user enters a negative number and calculate the average.
 */


import javax.swing.*;

public class excersice7_Media {

    public static void main(String[] args){
        int numero, elementos = 0, suma = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        while (numero >=0) {
            suma += numero;//Suma iterativa
            elementos++; //Aumentar 1 a elementos

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));
        }

        if (elementos == 0) {
            System.out.println("Error: la división entre 0 no existe");
        }
        else {
            media = (float) suma/elementos;
            System.out.println("La media es: "+media);
        }

    }
}

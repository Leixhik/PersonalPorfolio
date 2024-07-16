/*
    Ask for 10 numbers and write the total sum.
 */

import javax.swing.*;

public class excersice10_10NumAdd {

    public static void main(String[] args){
        //Variables
        int x, suma;
        suma = 0;

        //Ejercicio
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor: "));

        for (int i=1; i<=10; i+=1){
            suma += x;
            System.out.println("Numero: "+i);
            System.out.println("Suma: "+suma);
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro valor: "));
        }

        System.out.println("Fin del programa");
    }
}

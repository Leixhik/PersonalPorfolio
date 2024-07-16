/*
    Aks for a number and calculate its factorial.
 */

import javax.swing.*;

public class excersice12_Factorial {

    public static void main(String[] args){

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor: "));
        long factorial = 1;

        for (int i=1; i<=num; i++){
            factorial *=i;

        }
        System.out.println("El factorial de "+num+" es "+factorial);
    }
}



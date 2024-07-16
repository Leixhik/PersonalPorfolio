/*
    Ask for 10 numbers and show at the end  if any negative numbers have been entered.
 */

import javax.swing.*;

public class excercise21_mostrarNegativo {
    public static void main(String[] args) {
        int n, negativo;
        boolean hay_negativo = false;

        for (int i = 1; i <= 10;i++){
            n = Integer.parseInt(JOptionPane.showInputDialog(i+".Ingresa un numero: "));
            if (n<0){
                hay_negativo = true;
            }
        }
        if (hay_negativo==true){
            System.out.println("Hay al menos un numero negativo");
        } else {
            System.out.println("No hay numeros negativos");
        }
    }
}

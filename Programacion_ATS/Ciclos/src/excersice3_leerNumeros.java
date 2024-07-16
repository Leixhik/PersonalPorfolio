/*
    Leer numeros hasta que se introduzca un 0.
    Para cada uno indicar si es par o impar.
 */

import javax.swing.*;

public class excersice3_leerNumeros {

    public static void main(String[] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));

        while (numero != 0){
            if (numero%2 == 0){
                JOptionPane.showMessageDialog(null,"El número "+numero+" es Par.");
            } else{
                JOptionPane.showMessageDialog(null,"El número "+numero+" es Impar.");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número o tecléa 0 para salir: "));
        }
    }
}

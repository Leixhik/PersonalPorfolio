import javax.swing.*;

public class ejercicio2_operadores {
    // Crea un programa que solicite al usuario ingresar 2 números y calcule las 4 operacione básicas +-*/
    public static void main(String[] args) {

        float n1 = Float.parseFloat(JOptionPane.showInputDialog("1. Ingresa un valor: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("2. Ingresa un valor: "));

        float suma = n1 + n2;
        float resta = n1 - n2;
        float multi = n1 * n2;
        float div = n1 / n2;

        System.out.println("El resultado de la operaciones son: " +
                "\nsuma = " + suma + "\nresta = " + resta + "\nmultiplicación = " + multi + "\ndivisión = " + div);
    }
}

/* Hacer Programa que simule un cajero automático con un saldo inicial de $1000 dlls con el siguiente menú
de opciones:
1. Ingresar dinero a la cuenta.
2. Retirar dinero de la cuenta.
3. Salir.
*/

import javax.swing.*;

public class excercise13_cajero {

    public static void main(String[] args) {
        final int saldonInicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su Cuenta\n"
                + "1. Ingresar dinero a la Cuenta\n"
                + "2. Retirar dinero de la cuenta\n"
                + "3. Salir"));

        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digita la cantidad a Ingresar en Cuenta"));
                saldoActual = saldonInicial + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                break;

            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Digita la cantidad a Retirar de Cuenta"));

                if (retiro > saldonInicial) {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo Suficiente");
                } else {
                    saldoActual = saldonInicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                }
                break;

            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se puede seleccionar esta opción");
        }

    }
}

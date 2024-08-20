package org.leijap.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingresa un entero: ");
        int divisor;

        try {
            divisor = Integer.parseInt(valor);
            int division = 10/divisor;
            System.out.println(division);
        } catch (NumberFormatException e) {
            System.out.println("Se detectó una excepción: Por favor ingresa un valor numérico." + e.getMessage());
            main(args);
        }
        catch (ArithmeticException e) {
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("Fin del programa, esto se ejecuta siempre, con o sin Exception.");
        }
        System.out.println("Continuamos con la ejecución");

    }
}

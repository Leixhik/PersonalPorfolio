package org.leijap.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingresa un entero: ");
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println(division);
        } catch (NumberFormatException e) {
            System.out.println("Se detectó una excepción: Por favor ingresa un valor numérico." + e.getMessage());
            main(args);
        }
        catch (DivisionPorZeroException e) {
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("Fin del programa, esto se ejecuta siempre, con o sin Exception.");
        }
        System.out.println("Continuamos con la ejecución");

    }

}

package org.leijap.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingresa un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingresa un entero denominador: ");

        try {
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("Division 2: " + division2);
        }
        catch (FormatoNumeroException e){
            System.out.println("¡Se detectó una excepción! Ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
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

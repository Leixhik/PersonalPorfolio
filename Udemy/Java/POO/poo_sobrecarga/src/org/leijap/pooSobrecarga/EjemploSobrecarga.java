package org.leijap.pooSobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        System.out.println("Sumar int: " + cal.sumar(10, 5));
        System.out.println("Sumar floar: " + cal.sumar(10.0F, 5F));
        System.out.println("Sumar float-int: " + cal.sumar(10f, 5));
        System.out.println("Sumar int-float: " + cal.sumar(10, 5.0f));
        System.out.println("Sumar double: " + cal.sumar(10d, 5D));
        System.out.println("Sumar string: " + cal.sumar("10", "5"));
        System.out.println("Sumar tres enteros: " + cal.sumar(10, 5, 3));

        System.out.println("Sumar long: " + cal.sumar(10L, 5L));
        


    }
}

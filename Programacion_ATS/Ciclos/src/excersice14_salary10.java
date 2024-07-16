/*
    Ask for a 10 numbers and show add for all and > $1000
 */


import javax.swing.*;

public class excersice14_salary10 {
    public static void main(String[] args) {
        int num, contM = 0;
        int suma = 0, mayor = 0, menor = 0;

        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un sueldo:  "));

            if (num >= 1000) {
                mayor += num;
                contM ++;
            } else {
                menor += num;
            }

        }
        suma = menor + mayor;
        System.out.println("La suma total de los sueldos es: "+suma);
        System.out.println("El numero de sueldos mayores a $1000 son: "+contM);
    }
}

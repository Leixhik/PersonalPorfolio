/*
    Ask for a number N, input N salaries, and display the maximum salary.
 */

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class excercise20_sueldoMax {
    public static void main(String[] args) {
        int nSalarios;
        float nIngreso, conteoSal = 0, sueldoMax = 0;

        nSalarios = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de Salarios a ingresar: "));

        for (int i = 1; i <= nSalarios; i++){
            nIngreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario "+i+":"));
            conteoSal= nIngreso;
            sueldoMax = conteoSal;
            if (sueldoMax<nIngreso){
                sueldoMax = nIngreso;
            }
        }
        System.out.println("El sueldo maximo fue: "+sueldoMax);
    }
}

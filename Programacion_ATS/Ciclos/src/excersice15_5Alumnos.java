/*
    Given the ages and heights of 5 students, show the average age and height, the number of students over
    18 years old, and the number of students taller than 1.75
 */

import javax.swing.*;

public class excersice15_5Alumnos {
    public static void main(String[] args) {
        int edad, suma_edad = 0, cont_18= 0, cont_alt=0;
        float altura, suma_altura = 0, mediaEdad, mediaAltura;

        for (int i=1; i<=5;i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa su estatura(Metros): "));

            suma_edad+= edad;
            suma_altura+= altura;

            if (edad > 18){
                cont_18++;
            }
            if (altura > 1.75){
                cont_alt++;
            }
        }
        mediaEdad = suma_edad/5;
        mediaAltura = suma_altura/5;

        System.out.println("La edad promedio es: "+mediaEdad);
        System.out.println("La altura promedio es: "+mediaAltura);
        System.out.println("La cantidad de alumnos > 18: "+cont_18);
        System.out.println("La cantidad de alumnos > 1.75m: "+cont_alt);

    }
}

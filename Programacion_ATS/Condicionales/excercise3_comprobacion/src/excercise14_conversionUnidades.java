/* Hacer programa que pase de KG a otra unidad de medida de masa, mostrar en pantalla un menú con las
opciones posibles.*/

import javax.swing.*;

public class excercise14_conversionUnidades {

    public static void main(String[] args) {
        float kg, ton, g, lb, oz, conver;
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("A que unidad deseas convertir: \n"
                + "1. Tonelada\n"
                + "2. Gramo\n"
                + "3. Libra\n"
                + "4. Onza"));


        switch (opcion) {
            case 1:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingresa los Kg a convertir en Toneladas "));
                ton = (kg * 0.001f);
                JOptionPane.showMessageDialog(null, "La conversion de Kg a Ton es = " + ton+" ton.");
                break;

            case 2:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingresa los Kg a convertir en Gramos "));
                g = (kg * 1000f);
                JOptionPane.showMessageDialog(null, "La conversion de Kg a g es = " + g + " g.");
                break;

            case 3:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingresa los Kg a convertir en Libras "));
                lb = (kg * 2.2046f);
                JOptionPane.showMessageDialog(null, "La conversion de Kg a lb es = " + lb + " lb.");
                break;

            case 4:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingresa los Kg a convertir en Onzas "));
                oz = (kg * 35.2739f);
                JOptionPane.showMessageDialog(null, "La conversion de Kg a oz es = " + oz + " oz.");
                break;


            default:
                JOptionPane.showMessageDialog(null, "No se pudo completar la oprecación");
        }
    }
}

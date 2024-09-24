import javax.swing.*;

public class ejercicio1_variables_y_tipos_de_datos {
    public static void main(String[] args) {
        // Ejercicio 1 - Declare variables para almacenar tu nombre, edad y altura.
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura: "));

        System.out.println("Hola, mi nombre es: " + nombre + ", tengo " + edad + " años y mido " + altura + ".");
    }
}

import javax.swing.*;

public class ejercicio3_usuario_bienvenida {

    // Crea un programa que solicite al usuario su nombre y apellido.
    // Después mostrar un mensaje de bienvenida con eso.

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese su nombre: ");

        JOptionPane.showMessageDialog(null,"¡Bienvenido " + nombre + " " + apellido + "!");
    }
}

/*Pedir una nota de 0  10 y mostrarla de la forma:
Insuficiente, Suficiente, Bien, Notable, Sobresaliente.*/


import javax.swing.*;

public class excercise_12 {

    public static void main(String[] args){
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu nota: "));

        if (nota == 10){
            JOptionPane.showMessageDialog(null,"¡Calificación Sobresaliente!");
        } else if (nota == 9) {
            JOptionPane.showMessageDialog(null, "¡Calificación Notable!");
        } else if (nota == 8) {
            JOptionPane.showMessageDialog(null, "Calificacion Buena");
        } else if (nota == 7) {
            JOptionPane.showMessageDialog(null, "Calificacion Suficiente");
        } else if (nota <= 6) {
            JOptionPane.showMessageDialog(null, "Calificación Insuficiente");
        }
        else {
            JOptionPane.showMessageDialog(null, "Calificacion no válida");
        }
    }
}

import javax.swing.*;

public class example5_califFinal {

    public static void main(String[] args) {
        float c1, c2, c3, c4, ctotal;

        c1 = Float.parseFloat(JOptionPane.showInputDialog("Calificación de Participación: "));
        c2 = Float.parseFloat(JOptionPane.showInputDialog("Calificación de 1er Parcial: "));
        c3 = Float.parseFloat(JOptionPane.showInputDialog("Calificación de 2do Parcial: "));
        c4 = Float.parseFloat(JOptionPane.showInputDialog("Calificación de Examen Final: "));

        c1 *= .1f;
        c2 *= .25f;
        c3 *= .25f;
        c4 *= .4f;

        ctotal = c1+c2+c3+c4;


        JOptionPane.showMessageDialog(null, "La calificación final es: " + ctotal + "%");

    }
}

import javax.swing.*;

public class calificacion {

    public static void  main(String [] args) {
        float calif1,calif2,calif3, resultado;

       /* calif1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu primer valor: "));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu segundo valor: "));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu tercer valor: "));*/
        calif1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu primer valor"));
        calif2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu segundo valor"));
        calif3 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu tercer valor"));

        resultado = (calif1+calif2+calif3)/3;

        JOptionPane.showMessageDialog(null, "Su calificación es: "+resultado);

    }
}

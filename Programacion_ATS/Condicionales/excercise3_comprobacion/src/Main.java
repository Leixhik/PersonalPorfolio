import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Ingresa una letra: ").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es una letra mayúscula");
        }
        else{
            JOptionPane.showMessageDialog(null,"Esta es una letra minúscula");
        }

    }
}
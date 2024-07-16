import javax.swing.*;

public class excersice2_positiveOrNegative {

    public static void main(String[] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

        while (numero != 0){
            if (numero<0){
                JOptionPane.showMessageDialog(null,"El numero "+numero+" es negativo");
            } else {
                JOptionPane.showMessageDialog(null,"El numero "+numero+" es positivo");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número"));
        }
    }
}

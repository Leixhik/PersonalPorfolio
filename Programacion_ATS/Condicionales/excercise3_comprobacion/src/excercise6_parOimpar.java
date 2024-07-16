import javax.swing.*;

public class excercise6_parOimpar {

    public static void main(String[] args){
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero: "));

        if (numero1%2 == 0 && numero2%2==0){
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        } else if (numero1%2 == 0 && numero2%2==1) {
            JOptionPane.showMessageDialog(null,"Solo el "+numero1+" es par");
        } else if (numero1%2 == 1 && numero2%2 == 0) {
            JOptionPane.showMessageDialog(null,"Solo el numero "+numero2+ " es par");
        } else {
            JOptionPane.showMessageDialog(null,"Ambos numeros son impares");
        }
    }
}

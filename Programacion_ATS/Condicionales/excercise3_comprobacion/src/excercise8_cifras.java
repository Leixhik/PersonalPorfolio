import javax.swing.*;

public class excercise8_cifras {

    public static void main(String[] args){

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

        if (n1<10){
            JOptionPane.showMessageDialog(null,"Su número tiene una cifra");
        } else if (n1<100) {
            JOptionPane.showMessageDialog(null,"Su número tiene dos cifras");
        } else if (n1<1000) {
            JOptionPane.showMessageDialog(null,"Su número tiene tres cifras");
        } else if (n1<10000) {
            JOptionPane.showMessageDialog(null,"Su número tiene cuatro cifras");
        } else if (n1<100000) {
            JOptionPane.showMessageDialog(null,"Su número tiene cinco cifras");
        }else {
            JOptionPane.showMessageDialog(null,"Su número sobrepasa los límites");
        }
    }
}

import javax.swing.*;

public class excersice1_Cuadrado {

    public static void main(String[] args){
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        while (numero >= 0){ //mientras el numero sea 0 o positivo.
            cuadrado = (int)Math.pow(numero,2);

            JOptionPane.showMessageDialog(null,"El numero "+numero+" al cuadrado es "+cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));

        }
    }
}

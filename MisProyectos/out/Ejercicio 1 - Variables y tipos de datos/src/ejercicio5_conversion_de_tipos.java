import javax.swing.*;

public class ejercicio5_conversion_de_tipos {
    //Solicita al usuario que ingrese un número decimal y conviertelo a un número entero.
    //Imprime ambos valores para verificar la conversión.
    public static void main(String[] args) {

        float n = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un valor decimal: "));
        System.out.println(n);
        int n1 = (int) n;
        System.out.println(n1);
    }
}

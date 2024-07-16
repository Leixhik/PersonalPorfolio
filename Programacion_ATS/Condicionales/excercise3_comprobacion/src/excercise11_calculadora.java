import javax.swing.*;

public class excercise11_calculadora {

    public static void main(String[] args){

        int n1, n2, suma, resta, multiplicacion, division;
        char operacion;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero: "));

        operacion = JOptionPane.showInputDialog("Digita la operacion que deseas realizar: ").charAt(0);

        switch (operacion){
            case 's':
            case 'S': suma = n1 + n2;
                        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                        break;
            case 'r':
            case 'R': resta = n1 - n2;
                        JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                        break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': multiplicacion = n1 * n2;
                        JOptionPane.showMessageDialog(null, "La resta es: "+multiplicacion);
                        break;
            case 'd':
            case 'D': division = n1 / n2;
                        JOptionPane.showMessageDialog(null, "La resta es: "+division);
                        break;
            default: JOptionPane.showMessageDialog(null, "Error en la operación.");
                        break;
        }
    }
}

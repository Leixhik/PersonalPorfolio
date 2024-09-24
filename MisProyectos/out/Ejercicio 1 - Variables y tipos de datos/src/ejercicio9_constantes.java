import javax.swing.*;

public class ejercicio9_constantes {
    //Definir una constante para PI y usarla para calcular el área de un circulo.

    public static void main(String[] args) {
        final float PI = 3.1416f;
        float radio = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del radio: "));
        float area = PI * (radio*radio);

        System.out.println("El área del circulo es: " + area);
    }
}

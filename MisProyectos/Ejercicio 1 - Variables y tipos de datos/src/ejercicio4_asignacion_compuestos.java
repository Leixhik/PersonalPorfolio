import javax.swing.*;

public class ejercicio4_asignacion_compuestos {
    /* Crear programa que incremente el valor de un variable en 5 de dos formas diferentes:
    1. usando el operador de asignacion compuesto y luego usando la suma directa.*/
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que será sumado +5: "));
        int n1 = n;
        n += 5;
        System.out.println(n);
        n1 = n1 +5;
        System.out.println(n1);
    }
}

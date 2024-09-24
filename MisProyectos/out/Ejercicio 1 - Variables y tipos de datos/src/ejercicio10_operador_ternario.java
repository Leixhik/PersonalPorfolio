import javax.swing.*;

public class ejercicio10_operador_ternario {
    // Escribir un programa que determine si un número es par o impar utilizando el operador ternario.

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor: "));
        String resultado;

        resultado = (n%2 == 0) ? "Es par" : "Es impar";
        System.out.println(resultado);
    }
}

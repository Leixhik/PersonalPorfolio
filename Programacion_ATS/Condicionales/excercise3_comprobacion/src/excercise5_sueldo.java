import javax.swing.*;

public class excercise5_sueldo {

    public static void main(String[] args) {
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas: "));

        int salario = 16, extra = 20, horasEx, total;

        if (horas > 40) {
            horasEx = extra * (horas - 40);
            salario = salario * 40;
            total = horasEx + salario;

            JOptionPane.showMessageDialog(null, "El salario sera de: " + total);
        } else {
            total = salario * horas;

            JOptionPane.showMessageDialog(null, "El salario será de: " + total);
        }
    }
}

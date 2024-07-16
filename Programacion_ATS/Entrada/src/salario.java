import javax.swing.*;

public class salario {

    public static void main(String[] args) {

        float salario, horasSemana, horasTotales, salarioHora;

        salarioHora = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu salario x hora: "));
        horasSemana = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el numero de horas trabajadas a la semana (min 1, max 56)"));

        salario = salarioHora * horasSemana;

        JOptionPane.showMessageDialog(null, "Tu salario semanal será de: " + salario);


    }
}

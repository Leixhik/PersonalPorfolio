import javax.swing.*;

public class excersice9_30dias {

    public static void main(String[] args) {
        int dia, mes, year;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año: "));

        if ((dia >= 1) && (dia <= 30)) { //Si el dia es correcto
            if ((mes >= 1) && (mes <= 12)) { //Si el mes es correcto
                if ((year != 0)) { //Si el año es correcto
                    JOptionPane.showMessageDialog(null, "Fecha Correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha Incorrecta, año incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha Incorrecta, mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, día incorrecto");
        }
    }
}

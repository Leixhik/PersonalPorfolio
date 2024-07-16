import javax.swing.*;
import java.text.spi.BreakIteratorProvider;

/*
    Given 6 grades, write the number of students approved, conditional(=4) and failed.
 */
public class excercise19_6notas {
    public static void main(String[] args) {
        float nota;
        int aprobado = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <=6;i++){
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digita una nota entre 0 a 10: "));
            } while (nota <0 || nota > 10);

            if (nota == 4){
                condicionados++;
            } else if (nota>=5) {
                aprobado++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Cantidad de Aprobados: "+aprobado);
        System.out.println("Cantidad de Condicionales: "+condicionados);
        System.out.println("Cantidad de Suspendidos: "+suspensos);
    }
}

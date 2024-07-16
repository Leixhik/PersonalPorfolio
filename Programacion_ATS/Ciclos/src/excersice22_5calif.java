import javax.swing.*;

/*
    Ask for 5 student grades, and say at the end if there are any failures.
 */
public class excersice22_5calif {
    public static void main(String[] args) {
        float calif;
         boolean susp = false;

        for (int i = 1; i <=5; i++){
            calif = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion del alumno "+i));
            if (calif<7){
                susp = true;
            }
        }
        if (susp){
            System.out.println("Hay al menos un reprobado.");
        }else {
            System.out.println("No hay ningun reprobado");
        }
    }
}

import javax.swing.*;

public class example3_dinero {

    public static void  main(String[] args){
        float guille, luis, juan,total;

        guille = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el dinero de Guillermo: "));
        luis = guille/2;
        juan = (luis+guille)/2;

        total = guille+luis+juan;


        JOptionPane.showMessageDialog(null, "El dinero de Guillermo será de: "+guille);
        JOptionPane.showMessageDialog(null, "El dinero de Luis será de: "+luis);
        JOptionPane.showMessageDialog(null, "El dinero de Juan será de: "+juan);
        JOptionPane.showMessageDialog(null, "El dinero total será de: "+total);


    }
}

import javax.swing.*;

public class excersice10_fechaNormal {

    public static void main(String[] args){

        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Indica el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Indica el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Indica el año: "));

        if (((dia>0)&&(dia<=31))&&((mes==1)||(mes==3)||(mes==5)||(mes==8)||(mes==10)||(mes==12))&&(año!=0))
        {
            JOptionPane.showMessageDialog(null, "Es una fecha correcta.");
        }
        else if (((dia>0)&&(dia<=30))&&((mes==4)||(mes==6)||(mes==7)||(mes==8)||(mes==9)||(mes==11))&&(año!=0))
        {
            JOptionPane.showMessageDialog(null, "Es una fecha correcta.");
        }
        else if (((dia>0)&&(dia<=28))&&(mes==2)&&(año!=0))
        {
            JOptionPane.showMessageDialog(null, "Es una fecha correcta.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Es una fecha incorrecta.");
        }
    }

}

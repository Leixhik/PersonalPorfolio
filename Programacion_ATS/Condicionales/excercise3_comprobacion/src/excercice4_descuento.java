import javax.swing.*;

public class excercice4_descuento {

    public static void main(String[] args){
        float pago;

        pago = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de tu compra: "));

        if(pago > 300f){
            pago = pago / 1.2f;
            JOptionPane.showMessageDialog(null,"Su total será de: "+pago);
        }
        else{
            JOptionPane.showMessageDialog(null,"Su total será de: "+pago);
        }
    }
}

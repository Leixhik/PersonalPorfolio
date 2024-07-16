import javax.swing.*;

public class example4_salarioAuto {

    public static void main(String[] args){

        String vendedor;
        float salarioFijo, comisionVenta, comisionValor, valorAuto, autosVendidos,total;

        vendedor = JOptionPane.showInputDialog("Vendedor: ");
        salarioFijo = 1000f;
        autosVendidos = Float.parseFloat(JOptionPane.showInputDialog("Autos Vendidos: "));
        valorAuto = Float.parseFloat(JOptionPane.showInputDialog("Valor individual del auto: "));
        comisionVenta = autosVendidos*150f;
        comisionValor = valorAuto*0.05f*autosVendidos;

        total = salarioFijo+(comisionVenta+comisionValor);

        JOptionPane.showMessageDialog(null,vendedor+" , tu salario mensual es de: "+total);


    }
}

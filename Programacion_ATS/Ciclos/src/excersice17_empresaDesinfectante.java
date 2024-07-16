/*
    A company that sells disinfectants needs a program to manage invoices.
    Each invoice contains: the item code, the quantity sold in liters and the price per liter.
    5 invoices are requested to be entered: Total turnover, quantity in liters sold of item 1
    and how many invoices were issued for more than $600.
 */

import javax.swing.*;

public class excersice17_empresaDesinfectante {
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro, importeFactura, facturacionTotal = 0;

        for (int i = 1;i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo n: " + i + "\n Digita el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo n: " + i + "\n Digita la cantidad de litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo n: " + i + "\n Digite el precio por litro: "));

            importeFactura = (float) litros * precioLitro; // importe por factura.
            facturacionTotal += importeFactura; //Suma iterativa x factura.

            if (codigo == 1){
                litrosArticulo1 +=  litros;
            }
            if (importeFactura > 600){
                conteoMas600++;
            }
        }

        System.out.println("Resumen de ventas");
        System.out.println("Facturacion Total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
    }

}

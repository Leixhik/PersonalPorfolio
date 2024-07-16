/*
    A company that sells disinfectants needs a program to manage invoices.
    Each invoice contains: the item code and the quantity sold in liters.
    5 invoices are requested to be entered: Total turnover, quantity in liters sold of item 1
    and how many invoices were issued for more than $600.
 */

import javax.swing.*;

public class excersice18_17mod {

    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float impTot = 0, importeFactura1 = 0, importeFactura2 = 0, importeFactura3 = 0, facturacionTotal1 = 0, facturacionTotal2 = 0, facturacionTotal3 = 0, factTotal = 0;
        float c1 = 0.6F, c2=3.0F, c3=1.25F, ltArt1 = 0, ltArt2 = 0, ltArt3 = 0;

        for (int i = 1;i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo n: " + i + "\n Digita el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo n: " + i + "\n Digita la cantidad de litros: "));

            switch (codigo){
                case 1: importeFactura1 = (float)c1 * litros;
                        facturacionTotal1 += importeFactura1;
                        break;
                case 2: importeFactura2 = (float)c2 * litros;
                        facturacionTotal2 += importeFactura2;
                        break;
                case 3: importeFactura3 = (float)c3 * litros;
                        facturacionTotal3 += importeFactura3;
                        break;
            }
            
            if (codigo == 1){
                ltArt1 +=  litros;
            } else if (codigo == 2) {
                ltArt2 += litros;
            } else if (codigo ==3) {
                ltArt3 += litros;
            }
            if (impTot > 600){
                conteoMas600++;
            }
        }
        impTot = importeFactura1 + importeFactura2 + importeFactura3;
        factTotal = facturacionTotal1 + facturacionTotal2 + facturacionTotal3;

        System.out.println("Resumen de ventas");
        System.out.println("Facturacion Total: "+factTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: "+ltArt1);
        System.out.println("Cantidad en litros vendidos del articulo 2: "+ltArt2);
        System.out.println("Cantidad en litros vendidos del articulo 3: "+ltArt3);
        System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
    }

}



package org.leijap.appFacturas;

import org.leijap.appFacturas.modelo.*;

import java.util.Scanner;

public class EjemploFacturar {
    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        cliente.setNif("1822271");
        cliente.setNombre("Rodolfo");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa una descripción de la Factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
//        String nombre;
//        float precio;
//        int cantidad;

        System.out.println();

        for (int i=0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingresa producto n° " + producto.getCodigo() + ": ");
//            nombre = s.nextLine(); // Sólo una palabra. 2 palabras crashea.
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
//            precio = s.nextFloat();
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
//            cantidad = s.nextInt();

//            ItemFactura item = new ItemFactura(s.nextInt(), producto);
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
//        System.out.println(factura.generarDetalle());
            System.out.println(factura);
    }

}

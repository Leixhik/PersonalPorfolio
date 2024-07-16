package org.leijap.appFacturas;

import org.leijap.appFacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Rodolfo");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        for (int i = 0; i<5;i++){
            producto = new Producto();
            System.out.print("Ingresa producto n " + producto.getCodigo() + ": ");
            nombre = s.next(); // Nombre sin espacios.
            producto.setNombre(nombre);

            System.out.print("Ingresa el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingresa la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
    // Que es toString, constructor, getter y setter (ver con ejemplos)
}

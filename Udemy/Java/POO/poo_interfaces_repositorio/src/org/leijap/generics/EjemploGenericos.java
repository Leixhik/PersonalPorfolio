package org.leijap.generics;

import org.leijap.poointerfaces.modelo.Cliente;
import org.leijap.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Guzmán"));

        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Luci", "Martinez"),
                new Cliente("Andres", "Guzmán")}; //Crear varios clientes por medio de un Array.

        Integer[] enterosArreglo = {1, 2, 3}; // Cuando se agrega el [] después del tipo de objeto,
                                                // quiere decir que se ingresarán varios valores, no sólo uno.

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe",
        "Luci", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientePremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernandez")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientePremiumList);

    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);/*Este método convierte un array de cualquier tipo T a una lista del mismo tipo T.*/
    }
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c); /*restricción: solo puede trabajar con arrays de tipos que extiendan Number (como Integer, Double, Float, etc.).*/
    }
    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);/*La expresión lambda System.out::println proporciona una forma concisa de imprimir cada elemento.*/
    }
}

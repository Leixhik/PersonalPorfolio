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

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6, 7.8 es: " + maximo(3.9, 11.6, 7.8));
        System.out.println("Máximo de zanahoria, arándanosn manzana es: " + maximo("zanahoria", "arándanos", "manzana"));

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

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){ //Comparar a,b,c para ver cuál es el mayor.
        T max = a; //a será el mayor al inicio y será el comparado con los demás.
        if (b.compareTo(max) > 0){ //Se puede utilizar compareTo gracias al extends Comparable.
            max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}

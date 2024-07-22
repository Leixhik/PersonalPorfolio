package org.leijap.generics;

import org.leijap.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Guzmán"));

        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Luci", "Martinez"),
                new Cliente("Andres", "Guzmán")};
        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
}

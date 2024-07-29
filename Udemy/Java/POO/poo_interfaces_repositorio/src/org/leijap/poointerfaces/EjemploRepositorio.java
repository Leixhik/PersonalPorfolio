package org.leijap.poointerfaces;

import org.leijap.poointerfaces.modelo.Cliente;
import org.leijap.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        FullRepo repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Pérez"));
        repo.crear(new Cliente("Bea", "Gonzáles"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andres", "Guzmán"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("===== paginable =====");
        List<Cliente> paginable = (repo)
                .listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenAsc = (repo)
                .listar("nombre", Direccion.ASC);

        for (Cliente c : clientesOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        System.out.println("=============");

        (repo).listar("nombre", Direccion.DESC)
                .forEach(System.out::println);

        System.out.println("===== eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("======= Total========");
        System.out.println("Total registros: " + repo.total());
    }
}
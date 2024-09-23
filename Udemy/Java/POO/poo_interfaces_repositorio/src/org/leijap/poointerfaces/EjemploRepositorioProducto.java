package org.leijap.poointerfaces;

import org.leijap.poointerfaces.modelo.Cliente;
import org.leijap.poointerfaces.modelo.Producto;
import org.leijap.poointerfaces.repositorio.Direccion;
import org.leijap.poointerfaces.repositorio.FullRepo;
import org.leijap.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.leijap.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.leijap.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) throws AccesoDatoException {

        FullRepo<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("mesa", 50.52));
        repo.crear(new Producto("silla", 18));
        repo.crear(new Producto("lampara", 15.5));
        repo.crear(new Producto("notebook", 400.89));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);

        System.out.println("\n===== paginable =====");
        List<Producto> paginable = (repo)
                .listar(1, 4); //Aquí se Toma el id 1 como 0.
        paginable.forEach(System.out::println);

        System.out.println("\n===== ordenar =====");
        List<Producto> productosOrdenAsc = (repo)
                .listar("descripción", Direccion.ASC);

        for (Producto c : productosOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("\n===== editar =====");
        Producto lamparaActualizar = new Producto("lampara", 23);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.porId(3);
        System.out.println(lampara);

        System.out.println("\n=============");

        (repo).listar("precio", Direccion.DESC)
                .forEach(System.out::println);

        System.out.println("\n===== eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("\n======= Total========");
        System.out.println("Total registros: " + repo.total());
    }
}

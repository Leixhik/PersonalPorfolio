package org.example;

import org.example.modelo.Producto;
import org.example.repositorio.ProductoRepositorioImpl;
import org.example.repositorio.Repositorio;
import org.example.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()) {
            // Crea una instancia del repositorio de productos
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();

            System.out.println("======================= listar =======================");

            // Lista todos los productos y los imprime
            repositorio.listar().forEach(System.out::println);

            System.out.println("======================= obtener por ID =======================");

            // Obtiene un producto por su ID y lo imprime
            System.out.println(repositorio.porId(1L));

            System.out.println("======================= editar nuevo producto =======================");

            Producto producto = new Producto();

            producto.setId(3L);
            producto.setNombre("Teclado Razer Mecánico");
            producto.setPrecio(700);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con éxito");
            // Volver a listar...
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

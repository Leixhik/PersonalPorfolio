package org.example;

import org.example.modelo.Producto;
import org.example.repositorio.ProductoRepositorioImpl;
import org.example.repositorio.Repositorio;
import org.example.util.ConexionBaseDatos;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()) {
            // Crea una instancia del repositorio de productos
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();

            // Lista todos los productos y los imprime
            repositorio.listar().forEach(System.out::println);

            // Obtiene un producto por su ID y lo imprime
            System.out.println(repositorio.porId(2L));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

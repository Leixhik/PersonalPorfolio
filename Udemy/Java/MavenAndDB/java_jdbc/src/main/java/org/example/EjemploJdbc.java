package org.example;

import org.example.modelo.Producto;
import org.example.repositorio.ProductoRepositorioImpl;
import org.example.repositorio.Repositorio;
import org.example.util.ConexionBaseDatos;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            repositorio.listar().forEach(p -> System.out.println(p.getNombre()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

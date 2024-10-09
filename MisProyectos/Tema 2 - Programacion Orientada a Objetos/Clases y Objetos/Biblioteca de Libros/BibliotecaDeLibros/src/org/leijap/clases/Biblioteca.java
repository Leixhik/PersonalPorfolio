package org.leijap.clases;

import java.util.ArrayList;

public class Biblioteca {

    //Lista de Libros
    private ArrayList<Libro> libros;

    public Biblioteca(){
        libros = new ArrayList<>();
    }
    // Agregar libros al ArrayList
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    // Busqueda de libro por titulo
    public Libro buscarLibroPorTitulo(String titulo){
        for (Libro libro : libros){
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null; //Si no se encuentra el titulo
    }

    // Prestar Libro
    public void prestarLibro(String titulo) {
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null){
            if (!libro.estaPrestado()){
                libro.prestar();
                System.out.println("Libro prestado exitosamente.");
            }else{
                System.out.println("El libro ya está prestado.");
            }
        }else {
            System.out.println("Libro no encontrado.");
        }
    }
    // Devolver Libro (pendiente)
    public void devolverLibro(String titulo){
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null){
            if (!Libro.estaPrestado()){
                libro.devolver();
                System.out.println("Libro devuelto correctamente.");
            }else {
                System.out.println("El libro ya está prestado");
            }
        }else {
            System.out.println("Libro no encontrado");
        }
    }

    // Mostrar Catálogo(pendiente)
    public void mostrarCatalogo(){
        System.out.println("-----------------");
        System.out.println("Catálogo de la biblioteca");
        for (Libro libro : libros){ /*recorre cada elemento (libro) dentro del arrayList.*/
            libro.mostrarInformacion(); /*para cada libro , se llama al metodo mostrar informacion.*/
        }
    }
}

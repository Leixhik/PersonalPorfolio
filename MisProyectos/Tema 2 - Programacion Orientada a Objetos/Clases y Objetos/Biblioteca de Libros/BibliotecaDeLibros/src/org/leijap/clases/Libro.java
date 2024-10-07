package org.leijap.clases;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    private static boolean prestado;

    // Constructor.
    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    // Métodos Préstamo.
    public void prestar(){
        prestado = true;
        System.out.println("Libro prestado correctamente.");
    }
    public void devolver(){
        prestado = false;
        System.out.println("Libro devuelto correctamente");
    }
    public static boolean estaPrestado(){
        return prestado;
    }

    // Método Mostrar Información.
    public void mostrarInformacion(){
        System.out.println("Libro '" + titulo
                + "'\nAutor: " + autor
                + "\nAño de Publicación: "+ añoPublicacion
                +  "\nISBN: " + isbn);
    }

    // **** Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

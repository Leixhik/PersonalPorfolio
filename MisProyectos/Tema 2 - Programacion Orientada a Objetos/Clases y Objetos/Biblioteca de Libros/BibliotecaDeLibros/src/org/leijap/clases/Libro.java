package org.leijap.clases;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    //Métodos
    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

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

    public void prestar(){
        System.out.println("Prestando Libro");
    }

    public void devolver(){
        System.out.println("Devolviendo Libro");
    }

    public void mostrarInformacion(){
        System.out.println("Libro '" + titulo
                        + "' \nAutor: " + autor
                        + "\nAño de Publicación: "+ añoPublicacion
                        +  "\nISBN: " + isbn);
    }
}

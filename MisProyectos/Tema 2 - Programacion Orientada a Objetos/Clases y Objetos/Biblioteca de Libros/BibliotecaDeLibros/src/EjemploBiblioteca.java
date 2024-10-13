import org.leijap.clases.Biblioteca;
import org.leijap.clases.Libro;

public class EjemploBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Creación de libros
        Libro libro1 = new Libro("El señor de lo anillos", "J.R.R. Tolkien", 1954, "ISBN123");
        Libro libro2 = new Libro("1984", "George Orwell", 1949, "ISBN456");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Buscar un libro
        Libro libroEncontrado = biblioteca.buscarLibroPorTitulo("1984");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getTitulo());
        }else {
            System.out.println("Libro no encontrado.");
        }

        // Préstamo de Libro

    }
}

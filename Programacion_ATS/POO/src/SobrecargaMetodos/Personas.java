package SobrecargaMetodos;

public class Personas {
    // Atributos
    String nombre;
    int edad;
    String dni;

    // Métodos (Clic Derecho> Generate> Constructor > Seleccionar Atributos para Construcción)

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Personas(String dni) {
        this.dni = dni;
    }

    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo un maratón.");
    }

    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros.");
    }
}

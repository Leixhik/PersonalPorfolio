package Herencia;

//extends -> palabra exclusiva para herencia
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    //Constructor de Clase Estudiante
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad); //inicializar atributos de persona
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCódigo Estudiante: "+codigoEstudiante+
                "\nNota Final: "+notaFinal);
    }

}

//Encapsulamiento y Métodos Accesores (Getter y Setter)
package Encapsulamiento;


public class Clase1 {
     private  int edad;
     private String nombre;

     //Método Setter: Establecemos la Edad
     public void setEdad(int edad){
         this.edad = edad;
     }

     //Método Getter: Mostramos la Edad
    public int getEdad(){
         return edad;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}



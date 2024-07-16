package MetodoConstructor;

public class Persona {
    //Atributos
    String nombre;
    int edad;

    //Métodos

    //Método Constructor 1
   /* public Persona(String _nombre, int _edad){
        nombre = _nombre; //_en algun momento
        edad = _edad;
    }*/

    //Método Constructor 2
    public Persona(String _nombre, int _edad){
        this.nombre = _nombre;
        this.edad = _edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

    public void correr() {
    }

}

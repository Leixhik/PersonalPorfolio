package org.leijap.pooherencia;

public class Profesor extends Persona{
<<<<<<< HEAD
    private String asignatura;

    //Métodos
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
=======
    private String materia;

    // Métodos
    public Profesor(){
        System.out.println("Profesor: inicializando constructor");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String materia){
        super(nombre, apellido);
        this.materia = materia;
    }
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String saludar() {
        return "Buenos días soy el Profesor de " + getMateria()
                + ", mi nombre es " + getNombre();
>>>>>>> 652a7569e0ddf56d37ea274370873e092694a8ae
    }
}

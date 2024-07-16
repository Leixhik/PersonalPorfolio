package org.leijap.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Rodolfo");
        alumno.setApellido("Leija");

        Profesor profesor = new Profesor();
        profesor.setNombre("Axel");
        profesor.setApellido("Leija");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor de " + profesor.getAsignatura()
                + ": "+ profesor.getNombre()
                + " "+ profesor.getApellido());
    }
}

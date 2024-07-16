package ejemplo;

import org.leijap.pooherencia.*;

public class EjemploMainConstructores {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de Alumno=========");
        Alumno alumno = new Alumno("Axel", "Leija", 20, "UANL");
//        Persona alumno = new Alumno(); <---- Formato Cast
//        ((Alumno)alumno).setInstitucion("UANL"); <---- Formato Cast
        alumno.setNotaEsp(5.5);
        alumno.setNotaMate(4.9);
        alumno.setNotaHist(6.3);
        alumno.setEmail("pawish@hotmail.com");

        System.out.println("======== Creando la instancia de Alumno internacional====== ");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("David", "Leija", "Apodubái");
        alumnoInt.setEdad(21);
        alumnoInt.setInstitucion("Mederos");
        alumnoInt.setNotaIdiomas(8.8);
        alumnoInt.setNotaEsp(6.2);
        alumnoInt.setNotaHist(8.5);
        alumnoInt.setNotaMate(9.0);
        alumnoInt.setEmail("pakish@hotmail.com");

        System.out.println("======== Creando la instancia de Profesor====== ");
        Profesor profesor = new Profesor("Pakis", "Pawish", "Programación");

        System.out.println("======== - ===============");

        imprimirObjetos(alumno);
        imprimirObjetos(alumnoInt);
        imprimirObjetos(profesor);
    }

    public static void imprimirObjetos(Persona persona){
        System.out.println("Imprimiento los datos del tipo Persona: ");
        System.out.println("Nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());
        // + " " + ((Alumno) alumno).getInstitucion()); <---- Formato Cast
        if (persona instanceof Alumno){
            System.out.println("Imprimiento los datos del tipo Alumno: ");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMate());
            System.out.println("Nota español: " + ((Alumno) persona).getNotaEsp());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHist());


            //instanceof para AlumnoInternacional
            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiento los datos del tipo Alumno Internacional: ");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }

            System.out.println("========== Sobre Escritura Promedio=============");
            System.out.println("Promedio: "+((Alumno) persona).calcularPromedio());
            System.out.println("========== Sobre Escritura Promedio=============");
        }

        if (persona instanceof Profesor){
            System.out.println("Imprimiento los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getMateria());
        }

        System.out.println("========== Sobre Escritura Saludar=============");
        System.out.println(persona.saludar());
        System.out.println("=======================");

    }
}

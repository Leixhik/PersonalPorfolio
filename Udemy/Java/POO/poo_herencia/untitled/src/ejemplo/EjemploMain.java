package ejemplo;

import org.leijap.pooherencia.Alumno;
import org.leijap.pooherencia.AlumnoInternacional;
import org.leijap.pooherencia.Profesor;

public class EjemploMain {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de Alumno=========");
        Alumno alumno = new Alumno();
//        Persona alumno = new Alumno(); <---- Formato Cast
        alumno.setNombre("Axelito");
        alumno.setApellido("Leijita");
        alumno.setInstitucion("UANL");
//        ((Alumno)alumno).setInstitucion("UANL"); <---- Formato Cast
        alumno.setNotaEsp(5.5);
        alumno.setNotaMate(4.9);
        alumno.setNotaMate(6.3);

        System.out.println("======== Creando la instancia de Alumno internacional====== ");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("David");
        alumnoInt.setApellido("Leija");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(21);
        alumnoInt.setInstitucion("Mederos");
        alumnoInt.setNotaIdiomas(8.8);
        alumnoInt.setNotaEsp(6.2);
        alumnoInt.setNotaHist(8.5);
        alumnoInt.setNotaMate(9.0);

        System.out.println("======== Creando la instancia de Profesor====== ");
        Profesor profesor = new Profesor();
        profesor.setNombre("Pakis");
        profesor.setApellido("Pawish");
        profesor.setMateria("Matematicas");

        System.out.println("======== - ===============");
        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());
               // + " " + ((Alumno) alumno).getInstitucion()); <---- Formato Cast

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais());

        System.out.println("Profesor de " + profesor.getMateria()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}

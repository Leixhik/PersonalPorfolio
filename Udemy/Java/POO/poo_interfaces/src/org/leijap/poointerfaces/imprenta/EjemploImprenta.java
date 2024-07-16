package org.leijap.poointerfaces.imprenta;

import org.leijap.poointerfaces.imprenta.modelo.*;

import static org.leijap.poointerfaces.imprenta.modelo.Genero.*;
import static org.leijap.poointerfaces.imprenta.modelo.Imprimible.imprimir;
import static org.leijap.poointerfaces.imprenta.modelo.Imprimible.TEXTO_DEFECTO;


public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John", "Doe"),
                "Ingeniero en Sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Desarrollador FullStack")
        .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseños: elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler") ,
                new Persona("James", "Gosling"), "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        Imprimible objImpr = new Imprimible(){
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase manual.";
            }
        };

        System.out.println(TEXTO_DEFECTO); //Imprimiendo un valor x defecto
    }
}

/*
    Construir un programa para una competencia de atletismo. El programa debe gestionar
    una serie de atletas con nombre y tiempo de carrera, al final el programa debe mostrar
    los datos del atleta ganador de la carrera.
 */
package Ejercicio4_atletismoGanador;

public class Atleta {
    //Atributos
    private String nombre;
    private double tiempo;

    //Métodos
    public Atleta(String nombre, double tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public double getTiempo(){
        return tiempo;
    }

    public String mostrarDatos(){
        return "Atleta: "+nombre+"\nTiempo: "+tiempo+" seg.";
    }

}

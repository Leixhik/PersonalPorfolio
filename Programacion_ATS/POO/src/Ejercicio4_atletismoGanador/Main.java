/*
    Construir un programa para una competencia de atletismo. El programa debe gestionar
    una serie de atletas con nombre y tiempo de carrera, al final el programa debe mostrar
    los datos del atleta ganador de la carrera.
 */

package Ejercicio4_atletismoGanador;

import java.util.Scanner;

public class Main {
    public static int indiceAtletaMasRapido(Atleta atletas[]){
        double tiempo;
        int indice = 0;

        //Algoritmo de Comparación
        tiempo = atletas[0].getTiempo();
        for (int i=0; i<atletas.length;i++){
            if (atletas[i].getTiempo() < tiempo){
                tiempo = atletas[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double tiempo;

        int nAtleta, indiceTiempo;

        System.out.print("Ingresa la cantidad de Atletas: ");
        nAtleta = entrada.nextInt();

        // Crear objeto Atletas
        Atleta atletas[] = new Atleta[nAtleta];


        //Datos de Atletas
        for (int i=0; i<atletas.length;i++){
            entrada.nextLine();
            System.out.println("\nIngresa las características del Atleta");
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Tiempo Recorrido: ");
            tiempo = entrada.nextDouble();
            atletas[i] = new Atleta(nombre, tiempo); // <- Crear Array de Atletas
        }

        indiceTiempo = indiceAtletaMasRapido(atletas);
        System.out.println("\n¡El Atleta más rápido!");
        System.out.println(atletas[indiceTiempo].mostrarDatos());
    }
}

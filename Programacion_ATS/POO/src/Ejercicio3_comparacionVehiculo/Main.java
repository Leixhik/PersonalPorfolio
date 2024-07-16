/*
    Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio,
    imprima las propiedades del vehículo más barato. Para ello, se deberán leer por teclado las
    características de cada vehículo y crear una clase que represente a cada uno de ellos.
 */

package Ejercicio3_comparacionVehiculo;

import java.util.Scanner;

public class Main {
    public static  int indiceCocheMBarato(Vehiculo coches[]) {
        float precio;
        int indice = 0;

        // Simple algoritmo de Comparación de "Objetos".
        precio = coches[0].getPrecio(); // Almacena todos los precios de todos los coches
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        System.out.print("Ingresa la cantidad de vehículos: ");
        numeroVehiculos = entrada.nextInt();

        //Crear arreglo por medio de Creación de Objeto.
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i=0; i< coches.length;i++){ // Nota: también puede ser i<numeroVehiculos.
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del Coche "+(i+1));
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca Precio: $");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio); //Creas un vehículo único cada vez que se acaba un ciclo.
        }

        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche más barato es");
        System.out.print(coches[indiceBarato].mostrarDatos());
    }
}

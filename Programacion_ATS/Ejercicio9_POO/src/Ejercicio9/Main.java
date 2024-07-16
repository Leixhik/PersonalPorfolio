package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Arreglo Dinamico para guardar Polígonos(NO se le indica cuántos arreglos tendrá, él solito irá creciendo)
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Llenar un Polígono
        llenarPoligono();

        //mostrar Datos y Área de cada Polígono
        mostrarResultados();
    }

    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite qué Polígono desea");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();
            }while (opcion < 1 || opcion > 2);

            switch (opcion){
                case 1: llenarTriangulo(); //Llenar un Triángulo
                    break;
                case 2: llenarRectangulo(); //llenar un Rectángulo
                    break;
            }

            System.out.println("\nDesea introducir otro Polígono (s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while (respuesta =='s' || respuesta == 'S');
    }

    public static void llenarTriangulo(){
        double lado1, lado2, lado3;

        System.out.println("\nDigita el lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("\nDigita el lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("\nDigita el lado 3 del triángulo: ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        poligono.add(triangulo); //Almacenas Triangulos dentro del Arreglo del Polígono
    }

    public static void llenarRectangulo(){
        double lado1, lado2;

        System.out.println("\nDigita el lado 1 del Rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("\nDigita el lado 2 del Rectángulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        poligono.add(rectangulo); // Almacena Rectangulos dentro del Array del Polígono
    }

    public static void mostrarResultados(){
        //Recorrer Arreglo de Polígonos
        for (Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area = "+poli.area());
            System.out.println("");
        }
    }
}

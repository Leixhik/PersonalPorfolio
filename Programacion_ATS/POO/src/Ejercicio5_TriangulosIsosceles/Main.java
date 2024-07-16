package Ejercicio5_TriangulosIsosceles;

import java.util.Scanner;

public class Main {
    public static double mayorArea(Triangulo_Isosceles triangulos[]){
        double area;

        area = triangulos[0].obtenerArea();
        for (int i=1; i< triangulos.length;i++){
            if (triangulos[i].obtenerArea() > area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.println("Digita el número de triangulos a ingresar: ");
        nTriangulos = entrada.nextInt();

        Triangulo_Isosceles triangulos[]= new Triangulo_Isosceles[nTriangulos];

        for (int i=0;i<triangulos.length;i++){
            System.out.println("\nIngresa los valores para el Triángulo "+(i+1));
            System.out.print("Introduzca la base: ");
            base = entrada.nextDouble();
            System.out.print("Ingresa el lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new Triangulo_Isosceles(base, lado);

            System.out.println("\nEl Perímetro del triángulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("\nEl Área del triangulo es: "+triangulos[i].obtenerArea());
        }

        System.out.println("\nEl área con mayor superficie es: "+mayorArea(triangulos));
    }
}

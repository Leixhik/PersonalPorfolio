package Ejercicio6_numerosComplejos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la parte real del primer número complejo:");
        double parteReal1 = scanner.nextDouble();
        System.out.println("Ingrese la parte imaginaria del primer número complejo:");
        double parteImaginaria1 = scanner.nextDouble();
        NumeroComplejo num1 = new NumeroComplejo(parteReal1, parteImaginaria1);

        System.out.println("Ingrese la parte real del segundo número complejo:");
        double parteReal2 = scanner.nextDouble();
        System.out.println("Ingrese la parte imaginaria del segundo número complejo:");
        double parteImaginaria2 = scanner.nextDouble();
        NumeroComplejo num2 = new NumeroComplejo(parteReal2, parteImaginaria2);

        System.out.println("Menu:");
        System.out.println("1. Sumar dos números complejos");
        System.out.println("2. Multiplicar dos números complejos");
        System.out.println("3. Comparar dos números complejos");
        System.out.println("4. Multiplicar un número complejo por un entero");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                NumeroComplejo suma = num1.sumar(num2);
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                NumeroComplejo producto = num1.multiplicar(num2);
                System.out.println("El producto es: " + producto);
                break;
            case 3:
                boolean igualdad = num1.esIgual(num2);
                System.out.println("Los números complejos son " + (igualdad ? "iguales" : "diferentes"));
                break;
            case 4:
                System.out.println("Ingrese un entero:");
                int entero = scanner.nextInt();
                NumeroComplejo resultadoMultiplicacion = num1.multiplicarPorEntero(entero);
                System.out.println("El resultado de la multiplicación por el entero es: " + resultadoMultiplicacion);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
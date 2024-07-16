package Ejercicio9;

public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) { //El número de lados de un rectangulo ya lo sabemos, se elimina el numeroLados
        super(2); //Se define que solo son 2 lados
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString()+ "\nlado 1 = " + lado1 + ", lado 2 =" + lado2; // En el super.toString se trae la función numeroLados del Padre
    }

    @Override
    public double area() {
        return lado1 * lado2; // -> Con esto se saca el área del Rectangulo
    }
}

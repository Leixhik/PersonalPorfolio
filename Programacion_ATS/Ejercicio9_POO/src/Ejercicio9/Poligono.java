package Ejercicio9;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Número de Lados=" + numeroLados;
    }
    //Declaramos el método área como Abstracto
    public abstract double area();
}

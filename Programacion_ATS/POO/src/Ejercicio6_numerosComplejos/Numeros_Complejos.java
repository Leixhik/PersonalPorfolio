package Ejercicio6_numerosComplejos;

class NumeroComplejo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NumeroComplejo sumar(NumeroComplejo otro) {
        double nuevaParteReal = this.parteReal + otro.parteReal;
        double nuevaParteImaginaria = this.parteImaginaria + otro.parteImaginaria;
        return new NumeroComplejo(nuevaParteReal, nuevaParteImaginaria);
    }

    public NumeroComplejo multiplicar(NumeroComplejo otro) {
        double nuevaParteReal = this.parteReal * otro.parteReal - this.parteImaginaria * otro.parteImaginaria;
        double nuevaParteImaginaria = this.parteReal * otro.parteImaginaria + this.parteImaginaria * otro.parteReal;
        return new NumeroComplejo(nuevaParteReal, nuevaParteImaginaria);
    }

    public boolean esIgual(NumeroComplejo otro) {
        return this.parteReal == otro.parteReal && this.parteImaginaria == otro.parteImaginaria;
    }

    public NumeroComplejo multiplicarPorEntero(int entero) {
        double nuevaParteReal = this.parteReal * entero;
        double nuevaParteImaginaria = this.parteImaginaria * entero;
        return new NumeroComplejo(nuevaParteReal, nuevaParteImaginaria);
    }

    public String toString() {
        return this.parteReal + " + " + this.parteImaginaria + "i";
    }
}

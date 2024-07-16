package SobrecargaMetodos;

import MetodoConstructor.Persona;

public class Main {
    public static void main(String[] args) {
        Personas persona1 = new Personas("Alejandro", 21);
        persona1.correr();

        Personas persona2 = new Personas("121212");
        persona2.correr(50);
    }
}

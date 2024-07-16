package Ejemplo;

public class Persona extends Animal {
    @Override //Sobre escribir
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}

package ClasesYObjetos;

import javax.swing.*;

public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int mult;
    int div;

    //Método para pedir a usuario que nos digite 2 numeros
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero: "));
    }

    //Método para sumar ambos números
    public void sumar(){
        suma = numero1 + numero2;
    }
    //Método para restar ambos números
    public void restar(){
        resta = numero1 - numero2;
    }
    //Método para multiplicar ambos números
    public void multiplicar(){
        mult = numero1 * numero2;
    }
    //Método para dividir ambos números
    public void dividir(){
        div = numero1 / numero2;
    }

    //Método para mostrar Resutados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);
    }

}

package ParametrosYArgumentos;

import javax.swing.*;

public class Operaciones {

        //Atributos (Variables Globales)
        int suma;
        int resta;
        int mult;
        int div;

        //Método para sumar ambos números ((Variables Locales))
        public void sumar(int numero1, int numero2){
            suma = numero1 + numero2;
        }
        //Método para restar ambos números
        public void restar(int numero1, int numero2){
            resta = numero1 - numero2;
        }
        //Método para multiplicar ambos números
        public void multiplicar(int numero1, int numero2){
            mult = numero1 * numero2;
        }
        //Método para dividir ambos números
        public void dividir(int numero1, int numero2){
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


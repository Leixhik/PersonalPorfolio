/*
    Ask for 10 numbers and show positive mid-numbers, negative mid-numbers and zeros.
*/

import javax.swing.*;

public class excersice13_Mid10 {

    public static void main(String[] args) {
        int numero, sumaP = 0, sumaN = 0, contP = 0, contN = 0, contC = 0;
        float mediaP, mediaN;

        for (int i = 1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));

            if (numero == 0){
                contC++; //Aumenta 1 el conteo de ceros.
            } else if (numero>0) { //Si el numero es positivo
                sumaP+=numero; //Suma iterativa de positivos
                contP++;
            } else{ //Si el numero es negativo
                sumaN+=numero;
                contN++;
            }
        }
        //Numeros Positivos
        if (contP==0){
            System.out.println("No se puede sacar la media de los positivos");
        } else {
            mediaP= (float) sumaP/contP;
            System.out.println("La media de los numeros positivos es: "+mediaP);
        }

        //Numeros negativos
        if (contN ==0){
            System.out.println("No se puede sacar la media de los negativos");
        } else {
            mediaN = (float) sumaN/ contN;
            System.out.println("La media de los negativos es: "+mediaN);
        }

        System.out.println("La cantidad de Ceros es: "+contC);
    }
}

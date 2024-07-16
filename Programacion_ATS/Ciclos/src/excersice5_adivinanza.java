/*
    "Played a game of guessing a number. To do this, generate a random number between 0 and 100,
    and then start asking for random numbers, indicating whether they are higher or lower compared
    to the unknown number (N). The process ends when the user guesses correctly, and it shows the number
    of attempts made."
 */

import javax.swing.*;

public class excersice5_adivinanza {

    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100);

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));

            if (aleatorio > numero) {
                System.out.println("Ingresa un numero mayor");
            } else {
                System.out.println("Ingresa un numero menor");
            }
            contador++;
        } while (numero != aleatorio);

        System.out.println("\nGenial!!! Adivinaste el número en: "+contador+" intentos");
    }
}

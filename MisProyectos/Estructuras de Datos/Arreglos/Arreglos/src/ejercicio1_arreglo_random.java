import java.util.Random;

public class ejercicio1_arreglo_random {
    // Crear un arreglo con 10 número aleatorios.

    public static void main(String[] args) {
        int[] arreglo = new int[10]; //Defines los espacios que tendrá el arreglo
        Random randon = new Random(); // Creas clase para generar y llenar arreglo.

        for (int i = 0; i < arreglo.length ; i++){
            arreglo[i] = randon.nextInt(100); // # aleatorios del 0 - 99
        }

        //Ciclo For-each.
        for (int numero : arreglo){
            System.out.println(numero);
        }
    }
}

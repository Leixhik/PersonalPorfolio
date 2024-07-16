/*
    Read 5 numbers per line, store them in an array,
    and calculate the median of positive numbers,
    the median of negative numbers, and count the number of zeros.
 */

import java.util.Scanner;

public class excercise3_mediaPosNegCero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float suma_positivos =0, suma_negativo=0, media_positivos, media_negativos;
        int conteo_positivos =0, conteo_negativo=0, conteo_ceros=0;

        System.out.println("Guardando los numeros en el arreglo: ");
        for (int i=0;i<5;i++){
            System.out.println((i+1)+". Digita un numero: ");
            numeros[i] = entrada.nextFloat();

            if (numeros[i]==0){
                conteo_ceros ++;
            } else if (numeros[i]>0) {
                suma_positivos += numeros[i];
                conteo_positivos++;
            }else {
                suma_negativo+=numeros[i];
                conteo_negativo++;
            }
        }
        //Media de los numeros positivos
        if (conteo_positivos ==0){
            System.out.println("No se puede sacar la media de los numeros positivos.");
        }else{
            media_positivos = suma_positivos/conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+media_positivos);
        }
        //Media de los numeros negativos
        if (conteo_negativo==0){
            System.out.println("No se puede sacar la media de los numeros negativos.");
        }else {
            media_negativos = suma_negativo/conteo_negativo;
            System.out.println("La media de los numeros negativos es: "+media_negativos);
        }
        //Contador Ceros
        System.out.println("El total de ceros fue: "+conteo_ceros);
    }
}

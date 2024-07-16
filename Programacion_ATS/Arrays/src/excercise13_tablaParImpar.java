/*
    Read 10 integer elements into an array.
     Store the even elements of the first array in another array, followed by the odd elements.
 */

import java.util.Scanner;

public class excercise13_tablaParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[10]; //arreglo para 10 elementos
        int conteo_pares=0, conteo_impares=0;

        System.out.println("Llenar el arreglo: ");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". Digita un numero: ");
            arreglo[i] = entrada.nextInt();

            if(arreglo[i]%2==0){    //Si el numero es par
                conteo_pares++;  //par aumenta
            }else {
                conteo_impares++;   //impar aumenta
            }
        }
        //Crear los arreglos de pares e impares
        int par[] = new int[conteo_pares];
        int impar[]= new int[conteo_impares];

        conteo_pares=0; //iterador
        conteo_impares=0; //iterador

        //Almacenar los numeros pares e impares en sus arreglos
        for (int i=0;i<10;i++){
            if (arreglo[i] % 2 == 0){
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            }else{
                impar[conteo_impares]=arreglo[i];
                conteo_impares++;
            }
        }

        System.out.print("\nArreglo pares: ");
        for (int i=0;i<conteo_pares;i++){
            System.out.print(par[i]+" - ");
        }
        System.out.println("");

        System.out.print("\nArreglo impares: ");
        for (int i=0;i<conteo_impares;i++){
            System.out.print(impar[i]+" - ");
        }
        System.out.println("");

    }
}

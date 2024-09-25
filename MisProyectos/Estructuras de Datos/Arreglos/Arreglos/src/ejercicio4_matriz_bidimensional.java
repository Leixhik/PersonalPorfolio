import javax.swing.*;
import java.util.Scanner;

public class ejercicio4_matriz_bidimensional {
    //Crea una matríz bidimensional y realiza operaciones con ella

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int nfilas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        int ncolumnas = entrada.nextInt();

        // Definir tamaño de Matriz
        int[][] matrix = new int[nfilas][ncolumnas];

        // Ingreso de Valores a Matriz
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                System.out.print("Valor de Matriz en [" + i + "][" + j + "]: ");
                matrix[i][j] = entrada.nextInt();
            }
        }

        // Impresión de Matriz Original
        for (int i = 0; i<nfilas; i++) {
            for (int j = 0; j<ncolumnas; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Suma de Filas
        for (int i = 0; i < nfilas; i++){
            int suma = 0;
            for (int j = 0; j < ncolumnas; j++){
                System.out.printf("%d\t", matrix[j][i]);
                suma += matrix[j][i];
            }
            System.out.printf("= %d\n", suma);
        }


    }
}

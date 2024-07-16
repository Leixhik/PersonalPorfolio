import javax.swing.*;
import java.util.Scanner;

/*
    Given two matrices of size 5x9 and 9x5, load the first one and transpose it into the second one.
 */
public class exercise6_dobleMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];

        //Matriz 1
        for (int i=0;i<matriz1.length;i++){
            for (int j=0;j< matriz1.length;j++){
                System.out.print("Ingresa un valor para la matriz(1) ["+i+"] ["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        for (int i=0;i<6;i++) {
            for (int j = 0; i < 10; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}


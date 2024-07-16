import javax.swing.*;
import java.util.Scanner;

/*
    To create and load a matrix of size n x m, and display the sum of each row and column.
 */
public class exercise5_sumaDeMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumFila, sumCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digita la matriz");
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }

        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.print(matriz[i][j] + "");
            }
            System.out.println("");
        }

        //Suma de Filas
        for (int i=0; i<nFilas;i++) {
            sumFila = 0;
            for (int j=0;j<nCol;j++){
                sumFila += matriz[i][j];
            }
            System.out.println("\nLa suma de la fila ["+i+"] es: "+sumFila);
        }
        System.out.println("");

        //Suma de Columnas
        for (int j=0;j<nCol;j++){
            sumCol = 0;
            for (int i=0;i<nFilas;i++){
                sumCol += matriz[i][j];
            }
            System.out.println("\nLa suma de la columna ["+j+"] es: "+sumCol);
        }
        System.out.println("");
    }
}

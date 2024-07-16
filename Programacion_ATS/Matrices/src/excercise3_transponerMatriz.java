import java.util.Scanner;

/*
    Create and load a 3x3 matrix, transpose it, and display it.
 */
public class excercise3_transponerMatriz {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int matriz[][]= new int[3][3];

        System.out.println("Digita la Matriz:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz Original: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        //Transponer la Matriz
        int aux;
        for (int i=0;i<3;i++){
            for (int j=0; j<i;j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
            System.out.println();
        }


        System.out.println("\nLa matriz transpuesta es: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }


    }
}

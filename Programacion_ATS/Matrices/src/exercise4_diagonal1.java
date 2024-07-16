/*
    Create a 7x7 matrix and fill it so that the elements of the main diagonal are 1
    and the rest are 0.
 */

public class exercise4_diagonal1 {
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];

        //Rellenar Matrix
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        //Impresión de Matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

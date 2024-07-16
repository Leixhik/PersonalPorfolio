import java.util.Scanner;

/*
    Design an application that declares a table of 10 integer elements.
    Read 8 numbers from the keyboard. Then, you should ask for a number and a position,
    insert it in the specified position, shifting those behind.
 */
public class excercise8_posiciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] a= new int[10];

        //Completar Array
        for (int i = 0; i<8; i++){
            System.out.print("Introduce el valor "+(i+1)+ ": ");
            a[i] = entrada.nextInt();
        }

        //Pedir numero y posicion
        System.out.print("Introduce el numero a insertar: ");
        int numero = entrada.nextInt();
        System.out.print("Introduce su posición: ");
        int posicion = entrada.nextInt();

        //Insertar numeros en posición
        for (int i=9; 9>posicion;i--){
            a[i] = a[i-1];
        }
        a[posicion] = numero;

        //Mostrar Tabla
        for (int i=0; i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}

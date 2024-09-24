
import java.util.Scanner;

public class ejercicio7_operadores_de_bit {
    /* Realiza operaciones bit a bit (AND Or, NOT, XOR, desplazamiento a la izquierda y derecha)
    con dos números enteros. Imprime el resultado en binario y decimal.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un valor entero: ");
        int a = sc.nextInt();
        System.out.println("Ingresa otro valor entero: ");
        int b = sc.nextInt();

        //Operador AND
        int resultAND = a & b;
        System.out.println(a + " & " + b + " = " + resultAND + " (binario: " + Integer.toBinaryString(resultAND) + ")");
        //Operador OR
        int resultOR = a | b;
        System.out.println(a + " | " + b + " = " + resultOR + " (binario: " + Integer.toBinaryString(resultOR) + ")");
        //Operador XOR
        int resultXOR = a ^ b;
        System.out.println(a + " ^ " + b + " = " + resultXOR + " (binario: " + Integer.toBinaryString(resultXOR) + ")" );
        //Operaador NOT
        int resultNOT = ~a;
        System.out.println(a + " NOT = " + resultNOT + " (binario: " + Integer.toBinaryString(resultNOT) + ")");
        //Desplazamiento izquierda
        int desplazaminetoIzquierda = a << 2;
        System.out.println(a + " << 2 = " + desplazaminetoIzquierda + " (binario: " + Integer.toBinaryString(desplazaminetoIzquierda) + ")");
        //Desplazamiento derecha
        int desplazaminetoDerecha = a >> 2;
        System.out.println(a + " >> 2 = " + desplazaminetoDerecha + " (binario: " + Integer.toBinaryString(desplazaminetoDerecha) + ")");
    }
}

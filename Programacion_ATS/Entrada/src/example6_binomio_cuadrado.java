
import java.util.Scanner;

public class example6_binomio_cuadrado {

    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);

        System.out.println("Ingresa el valor de a: ");
        int a = variable.nextInt();

        System.out.println("Ingresa el valor de b: ");
        int b = variable.nextInt();

        int cuadrado = (a * a) + (2 * a * b) + (b * b);

        System.out.println("El cuadrado de la suma es: " + cuadrado);

        variable.close();
    }
}

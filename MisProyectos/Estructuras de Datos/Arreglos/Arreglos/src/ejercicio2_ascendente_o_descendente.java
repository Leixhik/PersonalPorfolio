import javax.swing.*;
import java.util.Arrays;


public class ejercicio2_ascendente_o_descendente {
    //Crear un arreglo que se ordene de forma ascendente o descendente

    public static void main(String[] args) {

        int[] arreglo = new int[10];

        for (int i = 0; i < arreglo.length ; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingresa un valor: "));
        }

        Arrays.sort(arreglo);

        for (int numero : arreglo){
            System.out.println(numero);
        }
    }
}

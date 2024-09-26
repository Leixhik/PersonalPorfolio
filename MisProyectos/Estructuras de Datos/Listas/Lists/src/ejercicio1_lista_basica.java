import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio1_lista_basica {
    // Empieza con listas pequeñas y operaciones básicas para familiarizarte con
    //la sintaxis.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        String entrada;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingresa un elemento(o escribe 'salir' para terminar): ");
            entrada = scanner.nextLine(); // Captura elementos semi-infinidamente

            if (entrada.equalsIgnoreCase("salir")) { //equalsIgnoreCase: Se usa para ignorar si el usuario escribe "salir" con mayúsculas o minúsculas.
                continuar = false; // Hace que el while cierre
            } else{
                lista.add(entrada); //Se agrega elemento a la lista
            }
        }

        // Mostrar todos los elementos ingresados
        System.out.println("Los elementos ingresados son: \n" + lista);
        scanner.close();
    }
}

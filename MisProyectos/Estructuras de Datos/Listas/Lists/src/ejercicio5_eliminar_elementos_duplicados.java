import java.util.*;

public class ejercicio5_eliminar_elementos_duplicados {
    //Crear una lista y eliminar elemntos duplicados

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        String entrada;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese valor ('salir' para terminar): ");
            entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                lista.add(Integer.parseInt(entrada));
            }
        }
        Set <Integer> set = new HashSet(lista);
        lista.clear();
        lista.addAll(set);

        System.out.println("Lista de elementos: \n" + set);
        sc.close();
    }
}

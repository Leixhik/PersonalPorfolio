import java.util.*;

public class ejercicio3_lista_nombres {
    //Crear una List de nombres y ordenarla alfabéticamente.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> nombres = new ArrayList<>();

        String entrada;
        Boolean continuar = true;

        while(continuar){
            System.out.println("Ingresa un elemento ('salir' para terminar): ");
            entrada = scanner.nextLine();

            if(entrada.equalsIgnoreCase("salir")){
                continuar = false;
            } else{
                nombres.add(entrada);
            }
        }
        Collections.sort(nombres); //Collections.sort ordena por cualquier orden de inicio a final la list.
        System.out.println("Lista en orden Alfabetico: \n" + nombres + "\n");
        scanner.close();
    }
}

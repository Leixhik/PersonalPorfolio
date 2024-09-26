import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio2_lista_dinamica {

    //Crearé una Lista la cuál el usuario va a definir que tipo es
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Object> lista = new ArrayList<>();

        System.out.println("¿Qué tipo de datos deseas ingresar a la lista? "
                + "\n1. String"
                + "\n2. Integer"
                + "\n3. Double");

        System.out.print("Respuesta: ");
        int tipo = scanner.nextInt(); //Capturar la decisión del usuario
        scanner.nextLine(); // Consumir salto de línea

        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese un valor (o escriba 'salir' para terminar): ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                continuar = false;
            } else{
              // Convertir la entrada al tipo adecuado y agregar a la lista
              switch (tipo) {
                  case 1: //Tipo String (entrada ya está definida como String)
                      lista.add(entrada);
                      break;
                  case 2: // Tipo Integer
                      try {
                          int valorInt = Integer.parseInt(entrada); // convertir el tipo String a Int
                          lista.add(valorInt);
                      } catch (NumberFormatException e){
                          System.out.println("El valor ingresado no es un número entero.");
                      }
                      break;
                  case 3: // Tipo String
                      try {
                          double valorDouble = Double.parseDouble(entrada);
                          lista.add(valorDouble);
                      } catch (NumberFormatException e){
                          System.out.println("El valor ingresado no es un número decimal.");
                      }
                      break;
                  default:
                      System.out.println("Tipo de dato no válido");
                      continuar = false;
              }
            }
        }

        // Mostrar los elementos ingresados en la lista
        System.out.println("Los elementos ingresados son: \n" + lista);
        scanner.close();

        /*Primerp definí la clase Scanner y La List como objeto para que no tenga ningun valor definido
        * Luego se creó un while para independientemente del dato, estará almacenando hasta que el usuario
        * diga 'salir'. Para saber el tipo de dato a crear utilicé un switch que si es String, sólo agregara
        * el dato, pues la entrada ya está en tipo string. Mientras que el tipo Int y Double, serán convertidas
        * de String a Int o Double, usando un try-catch para capturar en caso de no ser el tipo de dato
        * y no rompa el programa.
        *
        * Finalmente mostrará los datos de la lista.*/
    }
}

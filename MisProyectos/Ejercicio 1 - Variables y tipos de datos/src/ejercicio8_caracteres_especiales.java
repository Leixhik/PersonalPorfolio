public class ejercicio8_caracteres_especiales {
    //Formatear un texto mediante tabulaciones, saltos de línea y comillas.

    public static void main(String[] args) {

        //Ejemplo con IA assist """
        System.out.println("""
                ¡Hola! \
                
                Mi nombre es Rodolfo\tITS\
                
                Estoy estudiando Programación para ser un: \
                
                 "Backend\"""");

        System.out.println("\n---------------");

        //Mi forma de hacerlo (aprender a corregir y tener una estetica).
        System.out.println("¡Hola! " +
                "\n" + "Mi nombre es Rodolfo" + "\t" + "ITS"
                + "\n" + "Estoy estudiando Programación para ser un: "
                +   "\n \"Backend\"");
    }
}

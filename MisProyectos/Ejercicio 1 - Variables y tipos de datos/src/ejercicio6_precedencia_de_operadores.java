public class ejercicio6_precedencia_de_operadores {
    /* Escribir una expresión que involucre varios operadores aritmeticos y de comparación.
    Luego, sin usar paréntesis, modifica el orden de las operaciones para obtener diferentes
    resultados. (entender cómo Java evalúa expresiones con múltiples operadores.)
    */
    public static void main(String[] args) {

        int a=10, b=15, c=20, d=25;
        System.out.println(a + b - c * d / a);
    }
}

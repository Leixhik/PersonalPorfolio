package RetornoDeVariables;

public class Operaciones {

    //Método para sumar ambos números ((Variables Locales))
    public int sumar(int numero1, int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    //Método para restar ambos números
    public int restar(int numero1, int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    //Método para multiplicar ambos números
    public int multiplicar(int numero1, int numero2){
        int mult = numero1 * numero2;
        return mult;
    }
    //Método para dividir ambos números
    public int dividir(int numero1, int numero2){
        int div = numero1 / numero2;
        return div;
    }

    //Método para mostrar Resutados
    public int mostrarResultados(int suma, int resta, int mult, int div){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);
        return suma;
    }
}

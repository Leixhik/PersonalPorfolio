public class ejercicio1_clase_coche {
    //Crearemos una clase Coche

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.marca = "Toyota";
        coche1.modelo = "Corolla";
        coche1.año = 2023;

        coche1.acelerar();
        coche1.acelerar();
        coche1.acelerar();
        coche1.frenar();

        coche1.mostrarDatos();

    }

    public static class Coche {
        //Atributos
        private String marca;
        private String modelo;
        private int año;
        private int velocidad = 0;
        private static final int ACELERACION = 10;

        //Métodos
        public void acelerar(){
            velocidad += ACELERACION;
            System.out.println("Subiendo velocidad: " + velocidad+ " km/h");
        }

        public void frenar(){
            if (velocidad >= 10){
                velocidad -= 10;
                System.out.println("Bajando velocidad: " + velocidad+ " km/h");
            } else {
                System.out.println("La velocidad ya es 0 km/h.");
            }
        }

        public void mostrarDatos(){
            System.out.println("Marca: " + marca
                            + "\nModelo: " + modelo
                            + "\nAño: " + año
                            + "\nVelocidad: " + velocidad);
        }
    }
}

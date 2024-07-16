package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4]; //Recuerda reservar la memoria en []

        misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo(4,"GH67", "Ferrarri", "A88");
        misVehiculos[2] = new VehiculoDeportivo("GH67", "Audi", "98", 5);
        misVehiculos[3] = new VehiculoFurgoneta("PAWISH67", "Plauchi", "A27", 2000);

        for (Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }

}

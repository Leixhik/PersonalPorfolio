package org.leijapl.Principal;

import org.leijapl.personasCompania.Cliente;
import org.leijapl.personasCompania.Empleado;
import org.leijapl.personasCompania.Gerente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Arreglo Dinámico para Empleado //
    static ArrayList<Empleado> empleado = new ArrayList<Empleado>();
    static Scanner entrada = new Scanner(System.in);

    // Main //
    public static void main(String[] args) {
       // Llenar Persona
        llenarPersona();
    }

    // Tipo de persona //
    public static void llenarPersona(){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("¿Cúal es tu rol en el establecimiento?");
                System.out.println("1. Empleado.");
                System.out.println("2. Gerente.");
                System.out.println("3. Cliente.");
                System.out.println("Opción: ");
                opcion = entrada.nextInt();
            }while (opcion < 1 || opcion > 2);

            switch (opcion){
                case 1: llenarEmpleado();
                    break;
                case 2: llenarGerente();
                    break;
                case 3: llenarCliente();
                    break;
            }
            System.out.println("\n¿Desea ingresar algo más?(s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println(" ");
        }while (respuesta == 's' || respuesta == 'S');
    }

    // Llenar Empleado //
    public static void llenarEmpleado(){
        String nombre, apellido, numeroFiscal, direccion;
        double remuneracion;
        int empleadoID;

        entrada.nextLine();
        System.out.print("\nIngresa tu Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("\nIngresa tu Apellido");
        apellido = entrada.nextLine();
        System.out.print("\nIngresa tu Número Fiscal: ");
        numeroFiscal = entrada.nextLine();
        System.out.print("\nIngresa tu Dirección: ");
        direccion = entrada.nextLine();
        System.out.print("\nIngresa tu Salario: ");
        remuneracion = entrada.nextDouble();
        System.out.print("\nIngresa tu ID: ");
        empleadoID = entrada.nextInt();


        Empleado empleado = new Empleado(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoID);
    }

    //Llenar Gerente //
    public static void llenarGerente(){
        String nombre, apellido, numeroFiscal, direccion;
        double remuneracion, presupuestoID;
        int empleadoID;

        entrada.nextLine();
        System.out.print("\nIngresa tu Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("\nIngresa tu Apellido");
        apellido = entrada.nextLine();
        System.out.print("\nIngresa tu Número Fiscal: ");
        numeroFiscal = entrada.nextLine();
        System.out.print("\nIngresa tu Dirección: ");
        direccion = entrada.nextLine();
        System.out.print("\nIngresa tu Salario: ");
        remuneracion = entrada.nextDouble();
        System.out.print("\nIngresa tu ID: ");
        empleadoID = entrada.nextInt();
        System.out.print("\nIngresa tu ID de Presupuesto: ");
        presupuestoID = entrada.nextDouble();

        Gerente gerente = new Gerente(nombre, apellido,numeroFiscal,direccion,remuneracion,empleadoID,presupuestoID);
    }

    // Llenar Cliente //
    public static void llenarCliente(){
        String nombre, apellido, numeroFiscal, direccion;
        int clienteID;

        entrada.nextLine();
        System.out.print("\nIngresa tu Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("\nIngresa tu Apellido");
        apellido = entrada.nextLine();
        System.out.print("\nIngresa tu Número Fiscal: ");
        numeroFiscal = entrada.nextLine();
        System.out.print("\nIngresa tu Dirección: ");
        direccion = entrada.nextLine();
        System.out.print("\nIngresa tu ID: ");
        clienteID = entrada.nextInt();


        Cliente cliente = new Cliente(nombre, apellido, numeroFiscal,direccion,clienteID);
    }



}

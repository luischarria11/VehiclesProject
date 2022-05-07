package ui;

import java.util.Scanner;

import model.VehicleController;

public class Main {

    private VehicleController vehicles;
    private Scanner sc;

    public Main() {
        vehicles = new VehicleController();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {

        System.out.println("Initing the program");
        Main ppal = new Main();

        int option = 0;
        do {
            option = ppal.showMenu();
            ppal.executeOperation(option);

        } while (option != 0);

    }

    public int showMenu() {
        int option = 0;

        System.out.println(
                "Seleccione una opción para empezar\n" +
                        "(1) Registrar vehículos\n" +
                        "(2) Calcular el precio total de venta de un vehículo\n" +
                        "(3) Generar informes con todos los datos de los vehículos  \n" +
                        "(4) Mostrar el estado de los documentos de los vehículos\n" +
                        "(5) Ver mapa del parqueadero\n" +
                        "(6) Ver informe de la ocupación del parqueadero\n" +
                        "(0) Para salir");
        option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    public void executeOperation(int operation) {

        switch (operation) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;

            default:
                System.out.println("Error, opción no válida");

        }
    }
}
package views;

import java.util.Scanner;

import controllers.ProductosController;

public class ProductosView {
    ProductosController controladorProductos;
    Scanner scanner;

    public ProductosView(ProductosController controladorProductos, Scanner scanner) {
        this.controladorProductos = controladorProductos;
        this.scanner = scanner;
    }

    public void mostrarPartes() {
        System.out.println("Catalogo de Partes \n\n");
        controladorProductos.devolverPartes()
                .forEach((nombre, precio) -> System.out.println("Nombre: " + nombre + " --- Precio: " + precio));

    }

    public void mostrarBicicletas() {
        System.out.println("Catalogo de Bicicletas \n\n");
        controladorProductos.devolverBicis()
                .forEach((nombre, precio) -> System.out.println("Nombre: " + nombre + " --- Precio: " + precio));
    }

    public void mostrarOfertas() {
        System.out.println("Catalogo de Ofertas \n\n");
        controladorProductos.devolverOfertas()
                .forEach((nombre, precio) -> System.out.println("Nombre: " + nombre + " --- Precio: " + precio));
    }

    public void menuElegirProductos() {
        int opcionElegida;
        System.out.println(
                "Elegi una opcion o toca alguna letra para salir \n\n [1]--> Mostrar Partes \n [2]--> Mostrar Bicicletas \n [3]--> Mostrar Ofertas ");
        while (true) {
            try {
                opcionElegida = (scanner.nextInt());
                while (opcionElegida > 3 || opcionElegida < 1) {
                    System.out.println("Valor Incorrecto, intentelo de nuevo por favor");
                    opcionElegida = (scanner.nextInt());
                }
                switch (opcionElegida) {
                    case 1:
                        mostrarPartes();
                        break;
                    case 2:
                        mostrarBicicletas();
                        break;
                    case 3:
                        mostrarOfertas();
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Muchas gracias por probarme!!");
                break;
            }
        }

    }

}

import java.util.Scanner;

import controllers.ProductosController;
import repositories.Bicicleteria;
import views.ProductosView;

public class App {

    public static void main(String[] args) {
        ProductosView view = new ProductosView(
                new ProductosController(new Bicicleteria(Bicicleteria.generarInventarioPrueba())),
                new Scanner(System.in));
        System.out.println(
                "Bienvenido a la bicicleteria Oro Verde!! \n A continuacion se desplegara el menu para ver nuestros productos disponibles");
        view.menuElegirProductos();
    }
}
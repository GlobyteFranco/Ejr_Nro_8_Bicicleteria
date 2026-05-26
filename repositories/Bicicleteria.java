package repositories;

import java.util.ArrayList;
import java.util.List;

import models.Bici;
import models.Oferta;
import models.ParteBici;
import models.ProductoBicicleteria;

public class Bicicleteria {
    List<ProductoBicicleteria> listaProductoBicicleterias;

    public Bicicleteria(List<ProductoBicicleteria> listaProductoBicicleterias) {
        this.listaProductoBicicleterias = listaProductoBicicleterias;
    }

    public void agragaProducto(ProductoBicicleteria productoAgregar) {
        this.listaProductoBicicleterias.add(productoAgregar);
    }

    public <T extends ProductoBicicleteria> List<T> devolverListaProductoMismoTipo(Class<T> tipoObjeto) {
        List<T> listaObjetosDevolver = new ArrayList<>();

        for (ProductoBicicleteria productoBicicleteria : listaProductoBicicleterias) {
            if (tipoObjeto.isInstance(productoBicicleteria)) {
                listaObjetosDevolver.add(tipoObjeto.cast(productoBicicleteria));
            }
        }
        return listaObjetosDevolver;
    }

    public static List<ProductoBicicleteria> generarInventarioPrueba() { // Obviamente datos hardcodeados con IA
        List<ProductoBicicleteria> inventario = new ArrayList<>();

        ParteBici cuadroRuta = new ParteBici(1, "Aluminio ultra liviano aero", 50000, "Cuadro de Ruta Ligero");
        ParteBici ruedaRuta = new ParteBici(2, "Rodado 28 llanta fina", 15000, "Rueda de Ruta 28");
        ParteBici frenoHerradura = new ParteBici(3, "Frenos de aluminio a patín", 8000, "Freno de Herradura");
        ParteBici asientoRuta = new ParteBici(4, "Asiento aerodinámico duro", 5000, "Asiento Aero");

        ParteBici cuadroPaseo = new ParteBici(5, "Acero con soporte para canasto", 30000, "Cuadro Paseo Vintage");
        ParteBici ruedaPaseo = new ParteBici(6, "Rodado 26 banda blanca", 12000, "Rueda Paseo 26");
        ParteBici asientoResortes = new ParteBici(7, "Asiento ancho extra confort", 7000,
                "Asiento Confort con Resortes");

        ParteBici casco = new ParteBici(8, "Casco negro mate talle L", 10000, "Casco Urbano L");
        ParteBici linga = new ParteBici(9, "Linga de acero trenzado con llave", 4000, "Linga de Seguridad");
        ParteBici inflador = new ParteBici(10, "Inflador de mano portátil", 3000, "Inflador Compacto");

        inventario.add(cuadroRuta);
        inventario.add(ruedaRuta);
        inventario.add(frenoHerradura);
        inventario.add(asientoRuta);
        inventario.add(cuadroPaseo);
        inventario.add(ruedaPaseo);
        inventario.add(asientoResortes);
        inventario.add(casco);
        inventario.add(linga);
        inventario.add(inflador);

        List<ParteBici> componentesRuta = new ArrayList<>();
        componentesRuta.add(cuadroRuta);
        componentesRuta.add(ruedaRuta);
        componentesRuta.add(ruedaRuta); // 2 ruedas
        componentesRuta.add(frenoHerradura);
        componentesRuta.add(asientoRuta);

        Bici biciRuta = new Bici(componentesRuta, 101, "Bicicleta ideal para asfalto y velocidad",
                "Bici de Ruta Flash");
        inventario.add(biciRuta);

        List<ParteBici> componentesPaseo = new ArrayList<>();
        componentesPaseo.add(cuadroPaseo);
        componentesPaseo.add(ruedaPaseo);
        componentesPaseo.add(ruedaPaseo); // 2 ruedas
        componentesPaseo.add(asientoResortes);

        Bici biciPaseo = new Bici(componentesPaseo, 102, "Bicicleta cómoda para la ciudad", "Bici Paseo Vintage");
        inventario.add(biciPaseo);

        List<ProductoBicicleteria> elementosSeguridad = new ArrayList<>();
        elementosSeguridad.add(casco);
        elementosSeguridad.add(linga);

        Oferta ofertaSeguridad = new Oferta(elementosSeguridad, "Combo Seguridad Urbana");
        inventario.add(ofertaSeguridad);

        List<ProductoBicicleteria> elementosPromo = new ArrayList<>();
        elementosPromo.add(biciPaseo);
        elementosPromo.add(casco);
        elementosPromo.add(inflador);

        Oferta promoVerano = new Oferta(elementosPromo, "Súper Promo Verano Vintage");
        inventario.add(promoVerano);

        List<ProductoBicicleteria> elementosPremium = new ArrayList<>();
        elementosPremium.add(biciRuta);
        elementosPremium.add(ofertaSeguridad); // Agregamos un combo entero adentro de este combo

        Oferta promoPremium = new Oferta(elementosPremium, "Pack Corredor Premium");
        inventario.add(promoPremium);

        return inventario;
    }
}

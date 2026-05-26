package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Bici;
import models.Oferta;
import models.ParteBici;
import models.ProductoBicicleteria;
import repositories.Bicicleteria;

public class ProductosController {
    private Bicicleteria repositorioBicicleteria;

    public ProductosController(Bicicleteria repositorioBicicleteria) {
        this.repositorioBicicleteria = repositorioBicicleteria;
    }

    public Bicicleteria getRepositorioBicicleteria() {
        return repositorioBicicleteria;
    }

    public void setRepositorioBicicleteria(Bicicleteria repositorioBicicleteria) {
        this.repositorioBicicleteria = repositorioBicicleteria;
    }

    public Map<String, Integer> devolverBicis() {
        return devoverProductoEspecifico(Bici.class);
    }

    public Map<String, Integer> devolverPartes() {
        return devoverProductoEspecifico(ParteBici.class);
    }

    public Map<String, Integer> devolverOfertas() {
        return devoverProductoEspecifico(Oferta.class);
    }

    private Map<String, Integer> devoverProductoEspecifico(Class<? extends ProductoBicicleteria> tipo) {
        Map<String, Integer> mapaObjetos = new HashMap<>();
        repositorioBicicleteria.devolverListaProductoMismoTipo(tipo)
                .forEach((objeto) -> mapaObjetos.put(objeto.devolverNombre(), objeto.calcularPrecio()));
        return mapaObjetos;
    }

}

package models;

import java.util.List;

public class Oferta implements ProductoBicicleteria {
    private List<ProductoBicicleteria> listaProductosBicicleteria;
    private String nombre;

    public Oferta(List<ProductoBicicleteria> listaProductosBicicleteria, String nombreOferta) {
        this.listaProductosBicicleteria = listaProductosBicicleteria;
        this.nombre = nombreOferta;
    }

    @Override
    public int calcularPrecio() {
        int precioTotal = 0;
        for (ProductoBicicleteria productoBicicleteria : listaProductosBicicleteria) {
            precioTotal += productoBicicleteria.calcularPrecio();
        }
        return precioTotal;
    }

    public List<ProductoBicicleteria> getListaProductosBicicleteria() {
        return listaProductosBicicleteria;
    }

    public void setListaProductosBicicleteria(List<ProductoBicicleteria> listaProductosBicicleteria) {
        this.listaProductosBicicleteria = listaProductosBicicleteria;
    }

    public void agregarProducto(ProductoBicicleteria productoAgregar) {
        listaProductosBicicleteria.add(productoAgregar);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String devolverNombre() {
        return getNombre();
    }

}

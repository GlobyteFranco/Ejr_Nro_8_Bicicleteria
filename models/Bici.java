package models;

import java.util.List;

public class Bici implements ProductoBicicleteria {
    private List<ParteBici> listaPartesBici;
    private int id;
    private String descripcion;
    private String nombre;

    public Bici(List<ParteBici> listaPartesBici, int id, String descripcion, String nombre) {
        this.listaPartesBici = listaPartesBici;
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    @Override
    public int calcularPrecio() {
        int precioTotal = 0;
        for (ParteBici parteBici : listaPartesBici) {
            precioTotal += parteBici.calcularPrecio();
        }
        return precioTotal;
    }

    public List<ParteBici> getListaPartesBici() {
        return listaPartesBici;
    }

    public void setListaPartesBici(List<ParteBici> listaPartesBici) {
        this.listaPartesBici = listaPartesBici;
    }

    public void agregarPrate(ParteBici parteBici) {
        this.listaPartesBici.add(parteBici);
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

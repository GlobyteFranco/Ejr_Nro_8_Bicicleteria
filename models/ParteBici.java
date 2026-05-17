package models;

public class ParteBici implements ProductoBicicleteria {
    private int id;
    private String descripcion;
    private int precio;
    private String nombre;

    public ParteBici(int id, String descripcion, int precio, String nombre) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
    }

    @Override
    public int calcularPrecio() {
        return this.getPrecio();
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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

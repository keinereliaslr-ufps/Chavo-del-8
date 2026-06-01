package modelo;

public class Accion {

    private String nombre;
    private String descripcion;

    public Accion() {
    }

    public Accion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void ejecutar() {
        System.out.println(nombre + ": " + descripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

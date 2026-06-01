package modelo;

public class ObjetoInteractivo {

    private String nombre;
    private String descripcion;

    public ObjetoInteractivo() {
    }

    public ObjetoInteractivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void usar() {
        System.out.println("Usando " + nombre);
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

    @Override
    public String toString() {
        return nombre;
    }
}

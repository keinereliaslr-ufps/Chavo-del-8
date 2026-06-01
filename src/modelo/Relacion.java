package modelo;

public class Relacion {

    private String tipo;
    private String descripcion;
    private Personaje personaje1;
    private Personaje personaje2;

    public Relacion() {
    }

    public Relacion(String tipo, String descripcion, Personaje personaje1, Personaje personaje2) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Personaje getPersonaje1() {
        return personaje1;
    }

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public Personaje getPersonaje2() {
        return personaje2;
    }

    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }
}

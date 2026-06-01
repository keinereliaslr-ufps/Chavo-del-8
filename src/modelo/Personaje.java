package modelo;

public class Personaje {

    private String nombre;
    private int edad;
    private String personalidad;
    private String rol;
    private Lugar lugarActual;

    public Personaje() {
    }

    public Personaje(String nombre, int edad, String personalidad, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.personalidad = personalidad;
        this.rol = rol;
    }

    public void hablar() {
        System.out.println(nombre + " dice algo");
    }

    public void actuar() {
        System.out.println(nombre + " hace una acción");
    }

    public void interactuarCon(Personaje personaje) {
        if (personaje != null) {
            System.out.println(nombre + " interactúa con " + personaje.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Lugar getLugarActual() {
        return lugarActual;
    }

    public void setLugarActual(Lugar lugarActual) {
        this.lugarActual = lugarActual;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

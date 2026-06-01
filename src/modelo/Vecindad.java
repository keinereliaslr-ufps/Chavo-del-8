package modelo;

import java.util.ArrayList;

public class Vecindad {

    private String nombre;
    private ArrayList<Lugar> lugares;
    private ArrayList<Personaje> personajes;
    private ArrayList<ObjetoInteractivo> objetos;

    public Vecindad() {
        this("La vecindad");
    }

    public Vecindad(String nombre) {
        this.nombre = nombre;
        this.lugares = new ArrayList<Lugar>();
        this.personajes = new ArrayList<Personaje>();
        this.objetos = new ArrayList<ObjetoInteractivo>();
    }

    public void agregarLugar(Lugar lugar) {
        lugares.add(lugar);
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void agregarObjeto(ObjetoInteractivo objeto) {
        objetos.add(objeto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public ArrayList<ObjetoInteractivo> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<ObjetoInteractivo> objetos) {
        this.objetos = objetos;
    }
}

package modelo;

import java.util.ArrayList;
import main.Main;

public class Juego {

    private String titulo;
    private ArrayList<String> plataformas;
    private Vecindad vecindad;

    public Juego() {
        this.titulo = "Juego El Chavo del Ocho - Vecindad";
        this.plataformas = new ArrayList<String>();
        this.vecindad = new Vecindad("La vecindad");
    }

    public static void main(String[] args) {
        Main.main(args);
    }

    public void iniciar() {
        System.out.println("Iniciando juego...");
    }

    public void guardar() {
        System.out.println("Guardar todavía no");
    }

    public void cargar() {
        System.out.println("Cargar todavía no");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(ArrayList<String> plataformas) {
        this.plataformas = plataformas;
    }

    public Vecindad getVecindad() {
        return vecindad;
    }

    public void setVecindad(Vecindad vecindad) {
        this.vecindad = vecindad;
    }
}

package modelo;

public class Dialogo {

    private String texto;

    public Dialogo() {
    }

    public Dialogo(String texto) {
        this.texto = texto;
    }

    public void ejecutar() {
        System.out.println(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

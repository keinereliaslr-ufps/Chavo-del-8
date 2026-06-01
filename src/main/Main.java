package main;

import controlador.ControladorJuego;
import javax.swing.SwingUtilities;
import modelo.Juego;
import vista.VentanaPrincipal;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Juego juego = new Juego();
                VentanaPrincipal vista = new VentanaPrincipal();
                new ControladorJuego(juego, vista);
                vista.setVisible(true);
            }
        });
    }
}

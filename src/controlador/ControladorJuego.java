package controlador;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import modelo.Barril;
import modelo.Casa;
import modelo.DonRamon;
import modelo.DonaFlorinda;
import modelo.ElChavo;
import modelo.Juego;
import modelo.Lugar;
import modelo.ObjetoInteractivo;
import modelo.Patio;
import modelo.Personaje;
import modelo.Quico;
import modelo.SenorBarrera;
import modelo.Vecindad;
import vista.VentanaPrincipal;

public class ControladorJuego {

    private final Juego juego;
    private final VentanaPrincipal vista;

    public ControladorJuego(Juego juego, VentanaPrincipal vista) {
        this.juego = juego;
        this.vista = vista;
        cargarDatosEjemplo();
        configurarVista();
        conectarEventos();
    }

    private void cargarDatosEjemplo() {
        ArrayList<String> plataformas = new ArrayList<String>();
        plataformas.add("PC");
        plataformas.add("Móvil");
        juego.setPlataformas(plataformas);

        Vecindad vecindad = new Vecindad("La vecindad del Chavo");

        Lugar patio = new Patio("Patio", "El lugar donde todos se encuentran");
        Lugar casaDonRamon = new Casa("Casa de Don Ramón", "Una casa humilde con puerta de madera");
        Lugar barril = new Barril("Barril", "El barril favorito del Chavo");

        vecindad.agregarLugar(patio);
        vecindad.agregarLugar(casaDonRamon);
        vecindad.agregarLugar(barril);

        Personaje chavo = new ElChavo("El Chavo", 8, "Inocente y alegre", "Niño");
        Personaje quico = new Quico("Quico", 9, "Presumido y sensible", "Niño");
        Personaje donaFlorinda = new DonaFlorinda("Doña Florinda", 40, "Protectora", "Mamá de Quico");
        Personaje donRamon = new DonRamon("Don Ramón", 42, "Relajado", "Vecino");
        Personaje senorBarrera = new SenorBarrera("Señor Barrera", 50, "Paciente", "Profesor");

        chavo.setLugarActual(barril);
        quico.setLugarActual(patio);
        donaFlorinda.setLugarActual(casaDonRamon);
        donRamon.setLugarActual(casaDonRamon);
        senorBarrera.setLugarActual(patio);

        vecindad.agregarPersonaje(chavo);
        vecindad.agregarPersonaje(quico);
        vecindad.agregarPersonaje(donaFlorinda);
        vecindad.agregarPersonaje(donRamon);
        vecindad.agregarPersonaje(senorBarrera);

        vecindad.agregarObjeto(new ObjetoInteractivo("Pelota", "Una pelota vieja para jugar"));
        vecindad.agregarObjeto(new ObjetoInteractivo("Sandwich", "Un sandwich de jamón"));
        vecindad.agregarObjeto(new ObjetoInteractivo("Escoba", "Escoba para limpiar el patio"));

        juego.setVecindad(vecindad);
    }

    private void configurarVista() {
        vista.setTituloJuego(juego.getTitulo());
        cargarCombos();
        mostrarPersonajeSeleccionado();
        vista.agregarLog("Bienvenido a la vecindad.");
    }

    private void cargarCombos() {
        DefaultComboBoxModel<Personaje> personajesModel = new DefaultComboBoxModel<Personaje>();
        DefaultComboBoxModel<Personaje> otrosModel = new DefaultComboBoxModel<Personaje>();
        DefaultComboBoxModel<Lugar> lugaresModel = new DefaultComboBoxModel<Lugar>();
        DefaultComboBoxModel<ObjetoInteractivo> objetosModel = new DefaultComboBoxModel<ObjetoInteractivo>();

        ArrayList<Personaje> personajes = juego.getVecindad().getPersonajes();
        for (int i = 0; i < personajes.size(); i++) {
            personajesModel.addElement(personajes.get(i));
            otrosModel.addElement(personajes.get(i));
        }

        ArrayList<Lugar> lugares = juego.getVecindad().getLugares();
        for (int i = 0; i < lugares.size(); i++) {
            lugaresModel.addElement(lugares.get(i));
        }

        ArrayList<ObjetoInteractivo> objetos = juego.getVecindad().getObjetos();
        for (int i = 0; i < objetos.size(); i++) {
            objetosModel.addElement(objetos.get(i));
        }

        vista.getCmbPersonajes().setModel(personajesModel);
        vista.getCmbOtroPersonaje().setModel(otrosModel);
        vista.getCmbLugares().setModel(lugaresModel);
        vista.getCmbObjetos().setModel(objetosModel);
    }

    private void conectarEventos() {
        vista.getBtnIniciar().addActionListener(e -> {
            juego.iniciar();
            vista.agregarLog("Juego iniciado. ¡A divertirse!");
        });

        vista.getCmbPersonajes().addActionListener(e -> mostrarPersonajeSeleccionado());

        vista.getBtnHablar().addActionListener(e -> {
            Personaje personaje = getPersonajeSeleccionado();
            if (personaje != null) {
                personaje.hablar();
                vista.agregarLog(personaje.getNombre() + " dice: ¡Hola, amigos!");
            }
        });

        vista.getBtnActuar().addActionListener(e -> {
            Personaje personaje = getPersonajeSeleccionado();
            if (personaje != null) {
                personaje.actuar();
                vista.agregarLog(personaje.getNombre() + " hizo una travesura.");
            }
        });

        vista.getBtnInteractuar().addActionListener(e -> {
            Personaje personaje = getPersonajeSeleccionado();
            Personaje otro = (Personaje) vista.getCmbOtroPersonaje().getSelectedItem();
            if (personaje != null && otro != null && personaje != otro) {
                personaje.interactuarCon(otro);
                vista.agregarLog(personaje.getNombre() + " interactuó con " + otro.getNombre() + ".");
            } else {
                vista.agregarLog("Elige dos personajes distintos para interactuar.");
            }
        });

        vista.getBtnUsarObjeto().addActionListener(e -> {
            Personaje personaje = getPersonajeSeleccionado();
            ObjetoInteractivo objeto = (ObjetoInteractivo) vista.getCmbObjetos().getSelectedItem();
            if (personaje != null && objeto != null) {
                objeto.usar();
                vista.agregarLog(personaje.getNombre() + " usó " + objeto.getNombre() + ".");
            }
        });

        vista.getBtnMover().addActionListener(e -> {
            Personaje personaje = getPersonajeSeleccionado();
            Lugar lugar = (Lugar) vista.getCmbLugares().getSelectedItem();
            if (personaje != null && lugar != null) {
                personaje.setLugarActual(lugar);
                vista.agregarLog(personaje.getNombre() + " ahora está en " + lugar.getNombre() + ".");
                mostrarPersonajeSeleccionado();
            }
        });

        vista.getChkDescripcionLarga().addActionListener(e -> mostrarPersonajeSeleccionado());
    }

    private Personaje getPersonajeSeleccionado() {
        return (Personaje) vista.getCmbPersonajes().getSelectedItem();
    }

    private void mostrarPersonajeSeleccionado() {
        Personaje personaje = getPersonajeSeleccionado();
        if (personaje == null) {
            vista.setLblDatos("Sin personaje seleccionado");
            return;
        }

        String datos = "Nombre: " + personaje.getNombre()
                + " | Edad: " + personaje.getEdad()
                + " | Rol: " + personaje.getRol();

        if (vista.getChkDescripcionLarga().isSelected()) {
            String lugar = "Sin lugar";
            if (personaje.getLugarActual() != null) {
                lugar = personaje.getLugarActual().getNombre();
            }
            datos = datos + " | Personalidad: " + personaje.getPersonalidad() + " | Lugar: " + lugar;
        }

        vista.setLblDatos(datos);
    }
}

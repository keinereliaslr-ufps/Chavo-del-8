package vista;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void setTituloJuego(String titulo) {
        lblTitulo.setText(titulo);
    }

    public void setLblDatos(String texto) {
        lblDatos.setText(texto);
    }

    public void agregarLog(String texto) {
        txtLog.append(texto + "\n");
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    public JButton getBtnHablar() {
        return btnHablar;
    }

    public JButton getBtnActuar() {
        return btnActuar;
    }

    public JButton getBtnInteractuar() {
        return btnInteractuar;
    }

    public JButton getBtnUsarObjeto() {
        return btnUsarObjeto;
    }

    public JButton getBtnMover() {
        return btnMover;
    }

    public JComboBox getCmbPersonajes() {
        return cmbPersonajes;
    }

    public JComboBox getCmbOtroPersonaje() {
        return cmbOtroPersonaje;
    }

    public JComboBox getCmbLugares() {
        return cmbLugares;
    }

    public JComboBox getCmbObjetos() {
        return cmbObjetos;
    }

    public JCheckBox getChkDescripcionLarga() {
        return chkDescripcionLarga;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        lblPersonaje = new javax.swing.JLabel();
        cmbPersonajes = new javax.swing.JComboBox<>();
        lblDatos = new javax.swing.JLabel();
        chkDescripcionLarga = new javax.swing.JCheckBox();
        lblOtro = new javax.swing.JLabel();
        cmbOtroPersonaje = new javax.swing.JComboBox<>();
        btnHablar = new javax.swing.JButton();
        btnActuar = new javax.swing.JButton();
        btnInteractuar = new javax.swing.JButton();
        lblLugar = new javax.swing.JLabel();
        cmbLugares = new javax.swing.JComboBox<>();
        btnMover = new javax.swing.JButton();
        lblObjeto = new javax.swing.JLabel();
        cmbObjetos = new javax.swing.JComboBox<>();
        btnUsarObjeto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego del Chavo");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("Juego El Chavo del Ocho - Vecindad");

        btnIniciar.setText("Iniciar juego");

        lblPersonaje.setText("Personaje:");

        cmbPersonajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        lblDatos.setText("Datos del personaje");

        chkDescripcionLarga.setText("Mostrar descripción larga");

        lblOtro.setText("Otro personaje:");

        cmbOtroPersonaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btnHablar.setText("Hablar");

        btnActuar.setText("Actuar");

        btnInteractuar.setText("Interactuar con otro personaje");

        lblLugar.setText("Cambiar lugar:");

        cmbLugares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btnMover.setText("Mover personaje");

        lblObjeto.setText("Objeto:");

        cmbObjetos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btnUsarObjeto.setText("Usar objeto");

        txtLog.setColumns(20);
        txtLog.setRows(5);
        txtLog.setEditable(false);
        jScrollPane1.setViewportView(txtLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(btnIniciar)
                            .addComponent(lblPersonaje)
                            .addComponent(cmbPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatos)
                            .addComponent(chkDescripcionLarga)
                            .addComponent(lblOtro)
                            .addComponent(cmbOtroPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHablar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActuar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInteractuar))
                            .addComponent(lblLugar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMover))
                            .addComponent(lblObjeto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUsarObjeto)))
                        .addGap(0, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPersonaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDescripcionLarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOtro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbOtroPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHablar)
                    .addComponent(btnActuar)
                    .addComponent(btnInteractuar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblObjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsarObjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActuar;
    private javax.swing.JButton btnHablar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnInteractuar;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnUsarObjeto;
    private javax.swing.JCheckBox chkDescripcionLarga;
    private javax.swing.JComboBox cmbLugares;
    private javax.swing.JComboBox cmbObjetos;
    private javax.swing.JComboBox cmbOtroPersonaje;
    private javax.swing.JComboBox cmbPersonajes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblLugar;
    private javax.swing.JLabel lblObjeto;
    private javax.swing.JLabel lblOtro;
    private javax.swing.JLabel lblPersonaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
}

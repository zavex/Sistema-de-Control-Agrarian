
package vista;

import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Permisos;
import modelo.Producto;


public class ifrmTraspaso extends javax.swing.JInternalFrame {
    Main mp;
    Permisos permisos;
    Producto producto;
    JDesktopPane desk;
    
    
    public ifrmTraspaso(Main mp, JDesktopPane desk, Permisos permiso,Producto producto) {
        initComponents();
        Conexion con = new Conexion();
        this.mp = mp;
        this.permisos = permiso;
        this.producto = new Producto(con);
        this.desk = desk;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarArticulo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panBG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaTraslado = new com.toedter.calendar.JDateChooser();
        panArticulos = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        btnBuscarArt = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JTextField();
        panAlmacenes = new javax.swing.JPanel();
        lblOrigen = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        btnBuscarOrigen = new javax.swing.JButton();
        lblDestino = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        btnDestino = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResumen = new javax.swing.JTable();
        panFunciones = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        dummy1 = new javax.swing.JButton();
        dummy2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        BuscarArticulo.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                BuscarArticuloWindowOpened(evt);
            }
        });
        BuscarArticulo.getContentPane().setLayout(new java.awt.GridLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        BuscarArticulo.getContentPane().add(jPanel2);

        setClosable(true);
        setTitle("Traspasos");
        setMaximumSize(new java.awt.Dimension(442, 509));
        setMinimumSize(new java.awt.Dimension(442, 509));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                VentanaAbierta(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout());

        panBG.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Fecha de registro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fechaTraslado, jLabel1});

        panArticulos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Artículos"));

        lblDescripcion.setText("Descripción");

        btnBuscarArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        btnBuscarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarArtActionPerformed(evt);
            }
        });

        lblCantidad.setText("Cantidad");

        jLabel5.setText("Disponibles:");

        txtCantidad1.setEditable(false);

        javax.swing.GroupLayout panArticulosLayout = new javax.swing.GroupLayout(panArticulos);
        panArticulos.setLayout(panArticulosLayout);
        panArticulosLayout.setHorizontalGroup(
            panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(lblCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panArticulosLayout.createSequentialGroup()
                        .addComponent(txtDescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panArticulosLayout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panArticulosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCantidad, txtCantidad1});

        panArticulosLayout.setVerticalGroup(
            panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArticulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panArticulosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCantidad, txtCantidad1});

        panAlmacenes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Información de almacenes"));

        lblOrigen.setText("Origen");

        btnBuscarOrigen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N

        lblDestino.setText("Destino");

        btnDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N

        javax.swing.GroupLayout panAlmacenesLayout = new javax.swing.GroupLayout(panAlmacenes);
        panAlmacenes.setLayout(panAlmacenesLayout);
        panAlmacenesLayout.setHorizontalGroup(
            panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAlmacenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrigen)
                    .addComponent(txtDestino))
                .addGap(18, 18, 18)
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarOrigen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panAlmacenesLayout.setVerticalGroup(
            panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAlmacenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panAlmacenesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDestino, txtOrigen});

        tablaResumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaResumen);

        panFunciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panFunciones.setLayout(new java.awt.GridLayout());

        jButton3.setText("Salir");
        panFunciones.add(jButton3);

        dummy1.setBorderPainted(false);
        dummy1.setContentAreaFilled(false);
        dummy1.setEnabled(false);
        dummy1.setFocusPainted(false);
        dummy1.setFocusable(false);
        panFunciones.add(dummy1);

        dummy2.setBorderPainted(false);
        dummy2.setContentAreaFilled(false);
        dummy2.setEnabled(false);
        dummy2.setFocusPainted(false);
        dummy2.setFocusable(false);
        panFunciones.add(dummy2);

        jButton5.setBackground(new java.awt.Color(204, 255, 204));
        jButton5.setText("Guardar");
        panFunciones.add(jButton5);

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setText("Agregar");

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setText("Eliminar");

        javax.swing.GroupLayout panBGLayout = new javax.swing.GroupLayout(panBG);
        panBG.setLayout(panBGLayout);
        panBGLayout.setHorizontalGroup(
            panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panFunciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panAlmacenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBGLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        panBGLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton4});

        panBGLayout.setVerticalGroup(
            panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panAlmacenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panBGLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton4});

        getContentPane().add(panBG);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        mp.ventTraspasoAb = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnBuscarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArtActionPerformed
        BuscarArticulo.setSize(694, 440);
        BuscarArticulo.setLocationRelativeTo(this);
        BuscarArticulo.setModal(true);
        BuscarArticulo.setVisible(true);
        
    }//GEN-LAST:event_btnBuscarArtActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void VentanaAbierta(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_VentanaAbierta
        Date fecha = new Date();
        fechaTraslado.setDate(fecha);
    }//GEN-LAST:event_VentanaAbierta

    private void BuscarArticuloWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_BuscarArticuloWindowOpened
        consultarArticulo();
    }//GEN-LAST:event_BuscarArticuloWindowOpened

    public void consultarArticulo(){
        tabla.setModel(producto.consultarProductoTotales());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog BuscarArticulo;
    private javax.swing.JButton btnBuscarArt;
    private javax.swing.JButton btnBuscarOrigen;
    private javax.swing.JButton btnDestino;
    private javax.swing.JButton dummy1;
    private javax.swing.JButton dummy2;
    private com.toedter.calendar.JDateChooser fechaTraslado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JPanel panAlmacenes;
    private javax.swing.JPanel panArticulos;
    private javax.swing.JPanel panBG;
    private javax.swing.JPanel panFunciones;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaResumen;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidad1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}

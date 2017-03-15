package vista;

import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

public class RegistrarProducto extends javax.swing.JInternalFrame {
    
    Producto producto;
    Permisos permisos;
    Log ll = new Log();
    Date date = new Date ();
    
    public RegistrarProducto(Permisos p, Producto pp) {
        this.permisos = p;
        this.producto = pp;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        lblIdProducto = new javax.swing.JLabel();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegProducto = new com.toedter.calendar.JDateChooser();
        btnLimpiarProducto = new javax.swing.JButton();
        btnCancelarProducto = new javax.swing.JButton();
        btnRegistrarProducto = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        PanelDetallesProducto = new javax.swing.JPanel();
        lblNombreProducto = new javax.swing.JLabel();
        lblPrecioSugeridoProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioSugeridoProducto = new javax.swing.JTextField();
        lblDescripcionProducto = new javax.swing.JLabel();
        cbxMedidaProducto = new javax.swing.JComboBox<>();
        cbxPresentacionProducto = new javax.swing.JComboBox<>();
        lblMedidaProducto = new javax.swing.JLabel();
        lblPresentacionProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcionProducto = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRAR PRODUCTO");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
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
                formInternalFrameOpened(evt);
            }
        });

        txtIdProducto.setEditable(false);

        lblIdProducto.setText("ID PRODUCTO");

        lblFechaReg.setText("FECHA REGISTRO");

        DateChooserFechaRegProducto.setEnabled(false);

        btnLimpiarProducto.setText("LIMPIAR");
        btnLimpiarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProductoActionPerformed(evt);
            }
        });

        btnCancelarProducto.setText("CANCELAR");
        btnCancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProductoActionPerformed(evt);
            }
        });

        btnRegistrarProducto.setText("REGISTRAR");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N

        PanelDetallesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N
        PanelDetallesProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreProducto.setText("NOMBRE");
        PanelDetallesProducto.add(lblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 31, 52, -1));

        lblPrecioSugeridoProducto.setText("PRECIO SUGERIDO");
        PanelDetallesProducto.add(lblPrecioSugeridoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 77, -1, -1));

        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });
        PanelDetallesProducto.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 52, 253, -1));

        txtPrecioSugeridoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioSugeridoProductoActionPerformed(evt);
            }
        });
        txtPrecioSugeridoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioSugeridoProductoKeyTyped(evt);
            }
        });
        PanelDetallesProducto.add(txtPrecioSugeridoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 104, 91, -1));

        lblDescripcionProducto.setText("DESCRIPCIÓN");
        PanelDetallesProducto.add(lblDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 135, -1, -1));

        cbxMedidaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TM Toneladas", "KG Kilogramos", "S   Sacos" }));
        cbxMedidaProducto.setSelectedIndex(-1);
        PanelDetallesProducto.add(cbxMedidaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 58, 130, -1));

        cbxPresentacionProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GRANEL", "ENVASADO" }));
        cbxPresentacionProducto.setSelectedIndex(-1);
        cbxPresentacionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPresentacionProductoActionPerformed(evt);
            }
        });
        PanelDetallesProducto.add(cbxPresentacionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 176, 130, -1));

        lblMedidaProducto.setText("MEDIDA");
        PanelDetallesProducto.add(lblMedidaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 31, 47, -1));

        lblPresentacionProducto.setText("PRESENTACIÓN");
        PanelDetallesProducto.add(lblPresentacionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 149, 119, -1));

        txtAreaDescripcionProducto.setColumns(20);
        txtAreaDescripcionProducto.setRows(5);
        txtAreaDescripcionProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaDescripcionProductoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaDescripcionProducto);

        PanelDetallesProducto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 156, 253, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(lblFechaReg)
                        .addGap(6, 6, 6)
                        .addComponent(DateChooserFechaRegProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(image))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarProducto)
                        .addGap(6, 6, 6)
                        .addComponent(btnRegistrarProducto))
                    .addComponent(PanelDetallesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdProducto)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DateChooserFechaRegProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaReg)))
                            .addComponent(image))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(PanelDetallesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarProducto)
                    .addComponent(btnCancelarProducto)
                    .addComponent(btnRegistrarProducto))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean camposCompletos () {
        if (!txtNombreProducto.getText().isEmpty() && !txtPrecioSugeridoProducto.getText().isEmpty() && 
                !txtAreaDescripcionProducto.getText().isEmpty() && 
                cbxMedidaProducto.getSelectedIndex()!=-1 && cbxPresentacionProducto.getSelectedIndex()!=-1) {
           return true;
        }else {
           JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           return false;
        }
    }
    
    
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed

        
            if(cbxMedidaProducto.getSelectedIndex() == 0) {
                producto.setMedida("TM");
            }
            if(cbxMedidaProducto.getSelectedIndex() == 1) {
                producto.setMedida("KG");
            }
            if(cbxMedidaProducto.getSelectedIndex() == 2) {
                producto.setMedida("S");
            }
            if(cbxPresentacionProducto.getSelectedIndex() == 0) {
                producto.setPresentacion("GRANEL");
            }
            if(cbxPresentacionProducto.getSelectedIndex() == 1) {
                producto.setPresentacion("ENVASADO");
            }
            
            if (camposCompletos()) {
                try {
                    producto.setNombre(txtNombreProducto.getText());
                    producto.setDescripcion(txtAreaDescripcionProducto.getText());
                    producto.setPrecioSugerido(Double.parseDouble(txtPrecioSugeridoProducto.getText()));
                    producto.registrarProducto();
                    JOptionPane.showMessageDialog(null,"Registro Exitoso");
                    ll.agregarAccion(date.toString(),"Registro de Producto");
                    limpiarCajas();
                    txtIdProducto.setText(String.valueOf(producto.obtenerNoId()));
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                }
            }     
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    public void limpiarCajas() {
        
        txtAreaDescripcionProducto.setText(null);
        txtNombreProducto.setText(null);
        txtPrecioSugeridoProducto.setText(null);
        cbxMedidaProducto.setSelectedIndex(-1);
        cbxPresentacionProducto.setSelectedIndex(-1);
        
    }
    
    private void txtPrecioSugeridoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioSugeridoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioSugeridoProductoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateChooserFechaRegProducto.setDate(new Date());    //al iniciar setear la fecha actual
        txtIdProducto.setText(String.valueOf(producto.obtenerNoId()));    //

    }//GEN-LAST:event_formInternalFrameOpened

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        String nombre = txtNombreProducto.getText();
        if (nombre.length()>19) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtPrecioSugeridoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioSugeridoProductoKeyTyped
        String msg = String.valueOf(evt.getKeyChar());
        String precioSugeridoo = txtPrecioSugeridoProducto.getText();
            int precioSugerido = txtPrecioSugeridoProducto.getText().length();
            if (!(msg.matches("[.0-9]"))) {
                    evt.consume();
                    getToolkit().beep(); 
            }
            if (precioSugerido >= 1) {
                    for (int j = 0; j < precioSugerido; j++) {
                            if (precioSugeridoo.charAt(j) == '.') {
                                    if (!msg.matches(("[0-9]"))) {
                                            evt.consume();
                                            getToolkit().beep(); 
                                    }
                            }
                    }
            }
    }//GEN-LAST:event_txtPrecioSugeridoProductoKeyTyped

    private void txtAreaDescripcionProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDescripcionProductoKeyTyped
        String descripcion = txtAreaDescripcionProducto.getText();
        if (descripcion.length()>39) {
            evt.consume();
            getToolkit().beep();
        }    
        
    }//GEN-LAST:event_txtAreaDescripcionProductoKeyTyped

    private void btnCancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProductoActionPerformed
       
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarProductoActionPerformed

    private void btnLimpiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProductoActionPerformed
   
        limpiarCajas();
        
    }//GEN-LAST:event_btnLimpiarProductoActionPerformed

    private void cbxPresentacionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPresentacionProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPresentacionProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFechaRegProducto;
    private javax.swing.JPanel PanelDetallesProducto;
    private javax.swing.JButton btnCancelarProducto;
    private javax.swing.JButton btnLimpiarProducto;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JComboBox<String> cbxMedidaProducto;
    private javax.swing.JComboBox<String> cbxPresentacionProducto;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcionProducto;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblMedidaProducto;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecioSugeridoProducto;
    private javax.swing.JLabel lblPresentacionProducto;
    private javax.swing.JTextArea txtAreaDescripcionProducto;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioSugeridoProducto;
    // End of variables declaration//GEN-END:variables
}

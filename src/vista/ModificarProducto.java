package vista;

import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.*;

public class ModificarProducto extends javax.swing.JInternalFrame {
    
    Producto producto;
    
    Conexion conexion = new Conexion ();
    Permisos permisos = new Permisos (conexion);
    boolean userName = false;
    Vector fila;
    boolean flag;
    Log ll = new Log();
    Date date = new Date ();
    
    
    public ModificarProducto(Permisos p, Producto prod, Vector vector) {
        
        this.permisos = p;
        this.producto = prod;
        this.fila = vector;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdProducto = new javax.swing.JTextField();
        lblIdProducto = new javax.swing.JLabel();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegProducto = new com.toedter.calendar.JDateChooser();
        btnLimpiarProducto = new javax.swing.JButton();
        btnCancelarProducto = new javax.swing.JButton();
        btnGuardarCambiosProducto = new javax.swing.JButton();
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MODIFICAR PRODUCTO");
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

        btnGuardarCambiosProducto.setText("GUARDAR CAMBIOS");
        btnGuardarCambiosProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosProductoActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N

        PanelDetallesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        lblNombreProducto.setText("NOMBRE");

        lblPrecioSugeridoProducto.setText("PRECIO SUGERIDO");

        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });

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

        lblDescripcionProducto.setText("DESCRIPCION");

        cbxMedidaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TM", "KG", "S" }));
        cbxMedidaProducto.setSelectedIndex(-1);

        cbxPresentacionProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GRANEL", "ENVASADO" }));
        cbxPresentacionProducto.setSelectedIndex(-1);

        lblMedidaProducto.setText("MEDIDA");

        lblPresentacionProducto.setText("PRESENTACION");

        txtAreaDescripcionProducto.setColumns(20);
        txtAreaDescripcionProducto.setRows(5);
        txtAreaDescripcionProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaDescripcionProductoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaDescripcionProducto);

        javax.swing.GroupLayout PanelDetallesProductoLayout = new javax.swing.GroupLayout(PanelDetallesProducto);
        PanelDetallesProducto.setLayout(PanelDetallesProductoLayout);
        PanelDetallesProductoLayout.setHorizontalGroup(
            PanelDetallesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetallesProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetallesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetallesProductoLayout.createSequentialGroup()
                        .addGroup(PanelDetallesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreProducto)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(lblPrecioSugeridoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecioSugeridoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(PanelDetallesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxMedidaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedidaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPresentacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPresentacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDetallesProductoLayout.createSequentialGroup()
                        .addGroup(PanelDetallesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcionProducto))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 98, Short.MAX_VALUE))
        );
        PanelDetallesProductoLayout.setVerticalGroup(
            PanelDetallesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetallesProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDetallesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetallesProductoLayout.createSequentialGroup()
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecioSugeridoProducto))
                    .addGroup(PanelDetallesProductoLayout.createSequentialGroup()
                        .addComponent(lblMedidaProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxMedidaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioSugeridoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescripcionProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDetallesProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetallesProductoLayout.createSequentialGroup()
                        .addComponent(lblPresentacionProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxPresentacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblIdProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(lblFechaReg)
                                .addGap(6, 6, 6)
                                .addComponent(DateChooserFechaRegProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(image)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiarProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelarProducto)
                                .addGap(6, 6, 6)
                                .addComponent(btnGuardarCambiosProducto))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelDetallesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateChooserFechaRegProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIdProducto)
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaReg))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(image)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(PanelDetallesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarProducto)
                    .addComponent(btnCancelarProducto)
                    .addComponent(btnGuardarCambiosProducto))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean camposCompletos () {
        if (!txtNombreProducto.getText().isEmpty() && !txtPrecioSugeridoProducto.getText().isEmpty() && !txtAreaDescripcionProducto.getText().isEmpty() && 
               cbxMedidaProducto.getSelectedIndex() != -1 && cbxPresentacionProducto.getSelectedIndex() != -1) {           
            return true;
        }else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
            return false;
        }
    }
    
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        
        return new java.sql.Date(date.getTime());
    
    }
    
    private void btnGuardarCambiosProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosProductoActionPerformed
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
                    producto.setIdProducto(Integer.parseInt(txtIdProducto.getText()));
                    producto.setNombre(txtNombreProducto.getText());
                    producto.setDescripcion(txtAreaDescripcionProducto.getText());
                    producto.setPrecioSugerido(Double.parseDouble(txtPrecioSugeridoProducto.getText()));
                    producto.modificarProducto();
                    JOptionPane.showMessageDialog(null,"Producto Actualizado");
                    ll.agregarAccion(date.toString(),"Modificacion de Producto");
                    this.dispose();
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                }
            }            
    }//GEN-LAST:event_btnGuardarCambiosProductoActionPerformed

    private void txtPrecioSugeridoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioSugeridoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioSugeridoProductoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         try {            
            txtIdProducto.setText(fila.get(0).toString());  
            DateChooserFechaRegProducto.setDate((Date) fila.get(1));
            txtNombreProducto.setText(fila.get(2).toString());
            txtAreaDescripcionProducto.setText(fila.get(3).toString());
            System.out.println(fila.get(4).toString());
            cbxMedidaProducto.setSelectedItem(fila.get(4).toString());
            System.out.println(cbxMedidaProducto.getSelectedItem());
            cbxPresentacionProducto.setSelectedItem(fila.get(5).toString());
            txtPrecioSugeridoProducto.setText(fila.get(6).toString());
            int dig = Integer.parseInt(txtIdProducto.getText());
          } catch(Exception e) {
              JOptionPane.showMessageDialog(this, e);
          }
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtAreaDescripcionProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDescripcionProductoKeyTyped
        String descripcion = txtAreaDescripcionProducto.getText();
        if (descripcion.length()>39) {
            evt.consume();
            getToolkit().beep();
        }        
    }//GEN-LAST:event_txtAreaDescripcionProductoKeyTyped

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

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        String nombre = txtNombreProducto.getText();
        if (nombre.length()>19) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void btnLimpiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProductoActionPerformed
        txtAreaDescripcionProducto.setText(null);
        txtNombreProducto.setText(null);
        txtPrecioSugeridoProducto.setText(null);
        cbxMedidaProducto.setSelectedIndex(-1);
        cbxPresentacionProducto.setSelectedIndex(-1);
        
    }//GEN-LAST:event_btnLimpiarProductoActionPerformed

    private void btnCancelarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProductoActionPerformed
       
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFechaRegProducto;
    private javax.swing.JPanel PanelDetallesProducto;
    private javax.swing.JButton btnCancelarProducto;
    private javax.swing.JButton btnGuardarCambiosProducto;
    private javax.swing.JButton btnLimpiarProducto;
    private javax.swing.JComboBox<String> cbxMedidaProducto;
    private javax.swing.JComboBox<String> cbxPresentacionProducto;
    private javax.swing.JLabel image;
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

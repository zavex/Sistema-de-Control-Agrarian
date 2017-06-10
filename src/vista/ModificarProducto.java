package vista;

import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.*;

/**
 * Este formulario se encarga de mostrar la ventana de modificación de productos.
 * @author ainiguez
 */
public class ModificarProducto extends javax.swing.JInternalFrame {
    
    Producto producto;
    
    Conexion conexion = new Conexion ();
    Permisos permisos = new Permisos (conexion);
    boolean userName = false;
    Vector fila;
    boolean flag;
    Log ll = new Log();
    Date date = new Date ();
    
    /**
     * Constructor de la vista de modificación de cliente.
     * @param p     Recibe la instancia de la clase permisos.
     * @param prod  Recibe la instancia de la clase producto.
     * @param vector    Recibe información de la fila seleccionada en la vista de consulta de productos.
     */
    public ModificarProducto(Permisos p, Producto prod, Vector vector) {
        
        this.permisos = p;
        this.producto = prod;
        this.fila = vector;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIdProducto = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegProducto = new com.toedter.calendar.JDateChooser();
        image = new javax.swing.JLabel();
        PanelDetallesProducto = new javax.swing.JPanel();
        lblNombreProducto = new javax.swing.JLabel();
        lblPrecioSugeridoProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioSugeridoProducto = new javax.swing.JTextField();
        lblDescripcionProducto = new javax.swing.JLabel();
        cbxMedidaProducto = new javax.swing.JComboBox<String>();
        cbxPresentacionProducto = new javax.swing.JComboBox<String>();
        lblMedidaProducto = new javax.swing.JLabel();
        lblPresentacionProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcionProducto = new javax.swing.JTextArea();
        btnCancelarProducto = new javax.swing.JButton();
        btnLimpiarProducto = new javax.swing.JButton();
        btnGuardarCambiosProducto = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Producto");
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblIdProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblIdProducto.setText("Id Producto");

        txtIdProducto.setEditable(false);

        lblFechaReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaReg.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaReg.setText("Fecha de Registro");

        DateChooserFechaRegProducto.setEnabled(false);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N

        PanelDetallesProducto.setBackground(new java.awt.Color(255, 255, 255));
        PanelDetallesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblNombreProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreProducto.setText("Nombre");

        lblPrecioSugeridoProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrecioSugeridoProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblPrecioSugeridoProducto.setText("Precio Sugerido");

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

        lblDescripcionProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDescripcionProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblDescripcionProducto.setText("Descripcion");

        cbxMedidaProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TM", "KG", "S" }));
        cbxMedidaProducto.setSelectedIndex(-1);

        cbxPresentacionProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Granel", "Envasado" }));
        cbxPresentacionProducto.setSelectedIndex(-1);

        lblMedidaProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMedidaProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblMedidaProducto.setText("Medida");

        lblPresentacionProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPresentacionProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblPresentacionProducto.setText("Presentacion");

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

        btnCancelarProducto.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarProducto.setText("Cancelar");
        btnCancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProductoActionPerformed(evt);
            }
        });

        btnLimpiarProducto.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarProducto.setText("Limpiar");
        btnLimpiarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProductoActionPerformed(evt);
            }
        });

        btnGuardarCambiosProducto.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardarCambiosProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarCambiosProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambiosProducto.setText("Guardar Cambios");
        btnGuardarCambiosProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblIdProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(lblFechaReg)
                .addGap(6, 6, 6)
                .addComponent(DateChooserFechaRegProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDetallesProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarProducto)
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardarCambiosProducto)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateChooserFechaRegProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIdProducto)
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaReg))))
                    .addComponent(image))
                .addGap(18, 18, 18)
                .addComponent(PanelDetallesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarProducto)
                    .addComponent(btnCancelarProducto)
                    .addComponent(btnGuardarCambiosProducto))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Verifica que toda la información haya sido introducida al formulario
     * @return Regresa un valor booleano para indicar si se completado información. 
     */
    public boolean camposCompletos () {
        if (!txtNombreProducto.getText().isEmpty() && !txtPrecioSugeridoProducto.getText().isEmpty() && !txtAreaDescripcionProducto.getText().isEmpty() && 
               cbxMedidaProducto.getSelectedIndex() != -1 && cbxPresentacionProducto.getSelectedIndex() != -1) {           
            return true;
        }else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
            return false;
        }
    }
    
    /**
     * Método para convertir fecha de tipo java.util.date a un formato compatible con SQL
     * @param date  fecha de tipo java date.
     * @return regresa un dato de tipo sql date.
     */
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        
        return new java.sql.Date(date.getTime());
    
    }
    
    /**
     * Recopila la información cargada en la vista y la envía al método alojado en la clase de producto para su respectiva actualización en la base de datos.
     * @param evt 
     */
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

    /**
     * Método obstoleto o no usado
     * @param evt 
     */
    private void txtPrecioSugeridoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioSugeridoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioSugeridoProductoActionPerformed

    /**
     * Método de apertura, se encarga de cargar la información almacenada en el vector recibido previamente en el constructor.
     * @param evt 
     */
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

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, solo permite ingresar hasta 40 caracteres.
     * @param evt 
     */
    private void txtAreaDescripcionProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDescripcionProductoKeyTyped
        String descripcion = txtAreaDescripcionProducto.getText();
        if (descripcion.length()>39) {
            evt.consume();
            getToolkit().beep();
        }        
    }//GEN-LAST:event_txtAreaDescripcionProductoKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar números, destruye letras.
     * @param evt 
     */
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

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, solo permite ingresar hasta 20 caracteres.
     * @param evt 
     */
    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        String nombre = txtNombreProducto.getText();
        if (nombre.length()>19) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    /**
     * Éste método elimina la información introducida en la vista.
     * @param evt 
     */
    private void btnLimpiarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProductoActionPerformed
        txtAreaDescripcionProducto.setText(null);
        txtNombreProducto.setText(null);
        txtPrecioSugeridoProducto.setText(null);
        cbxMedidaProducto.setSelectedIndex(-1);
        cbxPresentacionProducto.setSelectedIndex(-1);
        
    }//GEN-LAST:event_btnLimpiarProductoActionPerformed

    /**
     * Se encarga de cerrar la ventana de modificación
     * @param evt 
     */
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
    private javax.swing.JPanel jPanel1;
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

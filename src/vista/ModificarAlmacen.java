package vista;

import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.*;


public class ModificarAlmacen extends javax.swing.JInternalFrame {
    
    Almacen almacen;
    Empleado empleado;
    
    Conexion conexion = new Conexion ();
    Permisos permisos = new Permisos (conexion);
    boolean userName = false;
    Vector fila;
    boolean flag;
    Log ll = new Log();
    Date date = new Date ();

    
    
    public ModificarAlmacen(Permisos p, Almacen alm, Vector vector, Empleado emp) {
        
        this.permisos = p;
        this.almacen = alm;
        this.fila = vector;
        this.empleado = emp;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdAlmacen = new javax.swing.JTextField();
        lblIdAlmacen = new javax.swing.JLabel();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegAlmacen = new com.toedter.calendar.JDateChooser();
        btnLimpiarAlmacen = new javax.swing.JButton();
        btnCancelarCambiosAlmacen = new javax.swing.JButton();
        btnGuardarCambiosAlmacen = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        PanelDetallesAlmacen = new javax.swing.JPanel();
        lblNombreAlmacen = new javax.swing.JLabel();
        lblDireccionAlmacen = new javax.swing.JLabel();
        txtNombreAlmacen = new javax.swing.JTextField();
        txtDireccionAlmacen = new javax.swing.JTextField();
        lblTelefonoAlmacen = new javax.swing.JLabel();
        txtTelefonoAlmacen = new javax.swing.JTextField();
        lblIdEmpleado = new javax.swing.JLabel();
        lblCapacidadAlmacen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        spnToneladas = new javax.swing.JSpinner();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MODIFICAR ALMACEN");
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

        txtIdAlmacen.setEditable(false);

        lblIdAlmacen.setText("ID ALMACEN");

        lblFechaReg.setText("FECHA DE REGISTRO");

        DateChooserFechaRegAlmacen.setEnabled(false);

        btnLimpiarAlmacen.setText("LIMPIAR");
        btnLimpiarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAlmacenActionPerformed(evt);
            }
        });

        btnCancelarCambiosAlmacen.setText("CANCELAR");
        btnCancelarCambiosAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCambiosAlmacenActionPerformed(evt);
            }
        });

        btnGuardarCambiosAlmacen.setText("GUARDAR CAMBIOS");
        btnGuardarCambiosAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosAlmacenActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N

        PanelDetallesAlmacen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Almacen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N
        PanelDetallesAlmacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreAlmacen.setText("NOMBRE");
        PanelDetallesAlmacen.add(lblNombreAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 52, -1));

        lblDireccionAlmacen.setText("DIRECCION");
        PanelDetallesAlmacen.add(lblDireccionAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNombreAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlmacenActionPerformed(evt);
            }
        });
        txtNombreAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAlmacenKeyTyped(evt);
            }
        });
        PanelDetallesAlmacen.add(txtNombreAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 253, -1));

        txtDireccionAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionAlmacenActionPerformed(evt);
            }
        });
        txtDireccionAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionAlmacenKeyTyped(evt);
            }
        });
        PanelDetallesAlmacen.add(txtDireccionAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 253, -1));

        lblTelefonoAlmacen.setText("TELEFONO");
        PanelDetallesAlmacen.add(lblTelefonoAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        txtTelefonoAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoAlmacenKeyTyped(evt);
            }
        });
        PanelDetallesAlmacen.add(txtTelefonoAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 215, -1));

        lblIdEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEmpleado.setText("EMPLEADO");
        PanelDetallesAlmacen.add(lblIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblCapacidadAlmacen.setText("CAPACIDAD");
        PanelDetallesAlmacen.add(lblCapacidadAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel2.setText("TONELADAS");
        PanelDetallesAlmacen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        txtIdEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEmpleadoActionPerformed(evt);
            }
        });
        txtIdEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEmpleadoKeyTyped(evt);
            }
        });
        PanelDetallesAlmacen.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 64, -1));

        txtNombreEmpleado.setEditable(false);
        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });
        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyTyped(evt);
            }
        });
        PanelDetallesAlmacen.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 404, -1));

        spnToneladas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        PanelDetallesAlmacen.add(spnToneladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 110, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelDetallesAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiarAlmacen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarCambiosAlmacen)
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardarCambiosAlmacen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblIdAlmacen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(lblFechaReg)
                        .addGap(6, 6, 6)
                        .addComponent(DateChooserFechaRegAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(image)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateChooserFechaRegAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIdAlmacen)
                                .addComponent(txtIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaReg))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(image)))
                .addGap(18, 18, 18)
                .addComponent(PanelDetallesAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarAlmacen)
                    .addComponent(btnCancelarCambiosAlmacen)
                    .addComponent(btnGuardarCambiosAlmacen))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean camposCompletos () {
        if (!txtNombreAlmacen.getText().isEmpty() && !txtTelefonoAlmacen.getText().isEmpty() && Integer.parseInt(spnToneladas.getValue().toString())!=0 && 
                !txtDireccionAlmacen.getText().isEmpty() && !txtIdEmpleado.getText().isEmpty()) {
          
            return true;
        
        }else {
        
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           
            return false;
        
        }
    
    }  
    
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    private void btnGuardarCambiosAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosAlmacenActionPerformed
  
           if (camposCompletos()) {
                try {
                    almacen.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
                    almacen.setNombreA(txtNombreAlmacen.getText());
                    almacen.setDireccion(txtDireccionAlmacen.getText());
                    almacen.setTelefono(txtTelefonoAlmacen.getText());
                    almacen.setCapacidad(spnToneladas.getValue().toString());
                    almacen.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
                    almacen.modificarAlmacen();
                    
                    JOptionPane.showMessageDialog(null,"Actualización exitosa");
                    ll.agregarAccion(date.toString(),"Modificacion de Almacen");
                    this.dispose();
                
                }catch (Exception e) {
                
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                
                }
            }        
    }//GEN-LAST:event_btnGuardarCambiosAlmacenActionPerformed

    private void txtDireccionAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionAlmacenActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            txtIdAlmacen.setText(fila.get(0).toString());  
            DateChooserFechaRegAlmacen.setDate((Date) fila.get(1));
            txtNombreAlmacen.setText(fila.get(2).toString());
            txtDireccionAlmacen.setText(fila.get(3).toString());
            txtTelefonoAlmacen.setText(fila.get(4).toString());
            spnToneladas.setValue(Integer.valueOf(fila.get(5).toString()));
            //spnToneladas.setValue(fila.get(5).toString());
            txtIdEmpleado.setText(fila.get(6).toString());
            int dig = Integer.parseInt(txtIdAlmacen.getText());
            
          } catch(Exception e) {
           JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_formInternalFrameOpened

    private void txtNombreAlmacenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAlmacenKeyTyped
        char c=evt.getKeyChar(); 
        String nombre = txtNombreAlmacen.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }       
        if(nombre.length()>9){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreAlmacenKeyTyped

    private void txtTelefonoAlmacenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoAlmacenKeyTyped
        char c = evt.getKeyChar();
        String telefono = txtTelefonoAlmacen.getText(); 
        
        if(telefono.length()>11){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); }
    }//GEN-LAST:event_txtTelefonoAlmacenKeyTyped

    private void txtDireccionAlmacenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionAlmacenKeyTyped
        if(txtDireccionAlmacen.getText().length()>49){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtDireccionAlmacenKeyTyped

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed

        if (txtNombreEmpleado.getText().length() != 0) {

            if (empleado.buscarEmpleadoN(txtNombreEmpleado.getText())) {

                txtIdEmpleado.setText(String.valueOf(empleado.getIdEmpleado()));
                txtNombreEmpleado.setText(empleado.getNombre());

            }

        } else {

            JOptionPane.showMessageDialog(this, "Este campo no debe estar vacio", "Error de busqueda", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void txtNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyTyped

        char c=evt.getKeyChar();
        String nomEmpleado = txtNombreEmpleado.getText();

        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
        if (nomEmpleado.length()>50) {
            evt.consume();
            getToolkit().beep();
        }

    }//GEN-LAST:event_txtNombreEmpleadoKeyTyped

    private void txtIdEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEmpleadoKeyTyped
         char c = evt.getKeyChar();
         String idEmp = txtIdEmpleado.getText();
        
         if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }
        
    }//GEN-LAST:event_txtIdEmpleadoKeyTyped

    private void txtIdEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEmpleadoActionPerformed
        
        if(txtIdEmpleado.getText().length() != 0) {

            try {
               
                if (empleado.buscarEmpleado(Integer.parseInt(txtIdEmpleado.getText()))) {
                            
                    txtNombreEmpleado.setText(empleado.getNombre());

                }

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this, "Solo debes ingresar números en este campo", "Error de busqueda", JOptionPane.WARNING_MESSAGE);

            }

        } else {

        JOptionPane.showMessageDialog(this, "Este campo no debe estar vacio", "Error de busqueda", JOptionPane.WARNING_MESSAGE);

        }
        
    }//GEN-LAST:event_txtIdEmpleadoActionPerformed

    private void btnCancelarCambiosAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCambiosAlmacenActionPerformed
       
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarCambiosAlmacenActionPerformed

    private void btnLimpiarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAlmacenActionPerformed

        limpiarCajas();
        
    }//GEN-LAST:event_btnLimpiarAlmacenActionPerformed

    private void txtNombreAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlmacenActionPerformed

      public void limpiarCajas() {
        
        txtDireccionAlmacen.setText(null);
        txtIdEmpleado.setText(null);
        txtNombreAlmacen.setText(null);
        txtNombreEmpleado.setText(null);
        txtTelefonoAlmacen.setText(null);
        spnToneladas.setValue(0);
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFechaRegAlmacen;
    private javax.swing.JPanel PanelDetallesAlmacen;
    private javax.swing.JButton btnCancelarCambiosAlmacen;
    private javax.swing.JButton btnGuardarCambiosAlmacen;
    private javax.swing.JButton btnLimpiarAlmacen;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCapacidadAlmacen;
    private javax.swing.JLabel lblDireccionAlmacen;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblIdAlmacen;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblNombreAlmacen;
    private javax.swing.JLabel lblTelefonoAlmacen;
    private javax.swing.JSpinner spnToneladas;
    private javax.swing.JTextField txtDireccionAlmacen;
    private javax.swing.JTextField txtIdAlmacen;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombreAlmacen;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtTelefonoAlmacen;
    // End of variables declaration//GEN-END:variables
}

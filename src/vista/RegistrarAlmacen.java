package vista;

import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

public class RegistrarAlmacen extends javax.swing.JInternalFrame {
    
    Almacen almacen;
    Permisos permisos;
    Empleado empleado;
    Log ll = new Log();
    Date date = new Date ();
    
    public RegistrarAlmacen(Permisos p, Almacen a, Empleado e) {
        this.permisos = p;
        this.almacen = a;
        this.empleado = e;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        lblIdAlmacen = new javax.swing.JLabel();
        txtIdAlmacen = new javax.swing.JTextField();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegAlmacen = new com.toedter.calendar.JDateChooser();
        PanelDetallesAlmacen = new javax.swing.JPanel();
        lblNombreAlmacen = new javax.swing.JLabel();
        lblDireccionAlmacen = new javax.swing.JLabel();
        txtNombreAlmacen = new javax.swing.JTextField();
        txtDireccionAlmacen = new javax.swing.JTextField();
        lblTelefonoAlmacen = new javax.swing.JLabel();
        txtTelefonoAlmacen = new javax.swing.JTextField();
        lblIdEmpleado = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        lblCapacidadAlmacen = new javax.swing.JLabel();
        spnToneladas = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiarAlmacen = new javax.swing.JButton();
        btnCancelarAlmacen = new javax.swing.JButton();
        btnRegistrarAlmacen = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Almacén");
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

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N

        lblIdAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdAlmacen.setForeground(new java.awt.Color(0, 0, 102));
        lblIdAlmacen.setText("Id Almacén");

        txtIdAlmacen.setEditable(false);

        lblFechaReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaReg.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaReg.setText("Fecha de Registro");

        DateChooserFechaRegAlmacen.setEnabled(false);

        PanelDetallesAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        PanelDetallesAlmacen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Almacén", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDetallesAlmacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreAlmacen.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreAlmacen.setText("Nombre");
        PanelDetallesAlmacen.add(lblNombreAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 52, -1));

        lblDireccionAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccionAlmacen.setForeground(new java.awt.Color(0, 0, 102));
        lblDireccionAlmacen.setText("Dirección");
        PanelDetallesAlmacen.add(lblDireccionAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

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

        lblTelefonoAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefonoAlmacen.setForeground(new java.awt.Color(0, 0, 102));
        lblTelefonoAlmacen.setText("Teléfono");
        PanelDetallesAlmacen.add(lblTelefonoAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        txtTelefonoAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoAlmacenKeyTyped(evt);
            }
        });
        PanelDetallesAlmacen.add(txtTelefonoAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 215, -1));

        lblIdEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblIdEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEmpleado.setText("Empleado");
        PanelDetallesAlmacen.add(lblIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

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
        PanelDetallesAlmacen.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 55, -1));
        PanelDetallesAlmacen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 173, -1, -1));

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
        PanelDetallesAlmacen.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 413, -1));

        lblCapacidadAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCapacidadAlmacen.setForeground(new java.awt.Color(0, 0, 102));
        lblCapacidadAlmacen.setText("Capacidad");
        PanelDetallesAlmacen.add(lblCapacidadAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        spnToneladas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        PanelDetallesAlmacen.add(spnToneladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 70, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Toneladas");
        PanelDetallesAlmacen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        btnLimpiarAlmacen.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiarAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarAlmacen.setText("Limpiar");
        btnLimpiarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAlmacenActionPerformed(evt);
            }
        });

        btnCancelarAlmacen.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAlmacen.setText("Cancelar");
        btnCancelarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlmacenActionPerformed(evt);
            }
        });

        btnRegistrarAlmacen.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAlmacen.setText("Registrar");
        btnRegistrarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlmacenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(lblFechaReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DateChooserFechaRegAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiarAlmacen)
                        .addGap(7, 7, 7)
                        .addComponent(btnCancelarAlmacen)
                        .addGap(10, 10, 10)
                        .addComponent(btnRegistrarAlmacen))
                    .addComponent(PanelDetallesAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateChooserFechaRegAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIdAlmacen)
                                    .addComponent(txtIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaReg)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(image)))
                .addGap(12, 12, 12)
                .addComponent(PanelDetallesAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarAlmacen)
                    .addComponent(btnCancelarAlmacen)
                    .addComponent(btnRegistrarAlmacen))
                .addGap(20, 20, 20))
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
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean camposCompletos () {
        if (!txtNombreAlmacen.getText().isEmpty() && !txtTelefonoAlmacen.getText().isEmpty() && !txtDireccionAlmacen.getText().isEmpty() && 
                !txtIdEmpleado.getText().isEmpty() && Integer.parseInt(spnToneladas.getValue().toString())!=0 && !txtNombreEmpleado.getText().isEmpty()) {
           return true;
        }else {
           JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           return false;
        }
    }
    
    
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    private void btnRegistrarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlmacenActionPerformed
       if (camposCompletos()) {
           try {
                    almacen.setNombreA(txtNombreAlmacen.getText());
                    almacen.setDireccion(txtDireccionAlmacen.getText());
                    almacen.setTelefono(txtTelefonoAlmacen.getText());
                    almacen.setCapacidad(spnToneladas.getValue().toString());
                    almacen.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
                    almacen.registrarAlmacen();
                    JOptionPane.showMessageDialog(null,"Registro Exitoso");
                    ll.agregarAccion(date.toString(),"Registro de Almacen");
                    limpiarCajas();
                    txtIdAlmacen.setText(String.valueOf(almacen.obtenerNoId()));
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                }
            }
    }//GEN-LAST:event_btnRegistrarAlmacenActionPerformed

    private void txtDireccionAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionAlmacenActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateChooserFechaRegAlmacen.setDate(new Date());    //al iniciar setear la fecha actual
        txtIdAlmacen.setText(String.valueOf(almacen.obtenerNoId()));    //
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtNombreAlmacenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAlmacenKeyTyped
        char c=evt.getKeyChar(); 
        String nombre = txtNombreAlmacen.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (nombre.length()>19) {
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
            getToolkit().beep(); 
        }
    }//GEN-LAST:event_txtTelefonoAlmacenKeyTyped

    private void txtDireccionAlmacenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionAlmacenKeyTyped
        String direccion = txtDireccionAlmacen.getText();
        if(direccion.length()>49){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtDireccionAlmacenKeyTyped

    private void btnLimpiarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAlmacenActionPerformed
        
        limpiarCajas();
        
    }//GEN-LAST:event_btnLimpiarAlmacenActionPerformed

    private void btnCancelarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlmacenActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarAlmacenActionPerformed

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

    private void txtIdEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEmpleadoKeyTyped
        
        char c = evt.getKeyChar();
        String idEmp = txtIdEmpleado.getText();
        
         if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }
        
    }//GEN-LAST:event_txtIdEmpleadoKeyTyped

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
    private javax.swing.JButton btnCancelarAlmacen;
    private javax.swing.JButton btnLimpiarAlmacen;
    private javax.swing.JButton btnRegistrarAlmacen;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
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

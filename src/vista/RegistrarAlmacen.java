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
        txtIdAlmacen = new javax.swing.JTextField();
        lblIdAlmacen = new javax.swing.JLabel();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegAlmacen = new com.toedter.calendar.JDateChooser();
        btnLimpiarAlmacen = new javax.swing.JButton();
        btnCancelarAlmacen = new javax.swing.JButton();
        btnRegistrarAlmacen = new javax.swing.JButton();
        image = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRAR ALMACÉN");
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdAlmacen.setEditable(false);
        getContentPane().add(txtIdAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 41, -1));

        lblIdAlmacen.setText("ID ALMACÉN");
        getContentPane().add(lblIdAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 32, 70, -1));

        lblFechaReg.setText("FECHA REGISTRO");
        getContentPane().add(lblFechaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        DateChooserFechaRegAlmacen.setEnabled(false);
        getContentPane().add(DateChooserFechaRegAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 29, 136, -1));

        btnLimpiarAlmacen.setText("LIMPIAR");
        btnLimpiarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        btnCancelarAlmacen.setText("CANCELAR");
        btnCancelarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        btnRegistrarAlmacen.setText("REGISTRAR");
        btnRegistrarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 11, -1, -1));

        PanelDetallesAlmacen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Almacén", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N
        PanelDetallesAlmacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreAlmacen.setText("NOMBRE");
        PanelDetallesAlmacen.add(lblNombreAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 63, 52, -1));

        lblDireccionAlmacen.setText("DIRECCIÓN");
        PanelDetallesAlmacen.add(lblDireccionAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 115, -1, -1));

        txtNombreAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAlmacenKeyTyped(evt);
            }
        });
        PanelDetallesAlmacen.add(txtNombreAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 84, 253, -1));

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
        PanelDetallesAlmacen.add(txtDireccionAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 136, 253, -1));

        lblTelefonoAlmacen.setText("TELÉFONO");
        PanelDetallesAlmacen.add(lblTelefonoAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 63, -1, -1));

        txtTelefonoAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoAlmacenKeyTyped(evt);
            }
        });
        PanelDetallesAlmacen.add(txtTelefonoAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 84, 215, -1));

        lblIdEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEmpleado.setText("EMPLEADO");
        PanelDetallesAlmacen.add(lblIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 173, -1, -1));

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
        PanelDetallesAlmacen.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 194, 55, -1));
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
        PanelDetallesAlmacen.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 194, 413, -1));

        lblCapacidadAlmacen.setText("CAPACIDAD");
        PanelDetallesAlmacen.add(lblCapacidadAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        spnToneladas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        PanelDetallesAlmacen.add(spnToneladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 70, -1));

        jLabel2.setText("TONELADAS");
        PanelDetallesAlmacen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        getContentPane().add(PanelDetallesAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 540, 240));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 560, -1));

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
    private javax.swing.JSeparator jSeparator1;
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

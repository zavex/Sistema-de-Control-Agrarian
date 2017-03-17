package vista;

import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

public class RegistrarCliente extends javax.swing.JInternalFrame {
    
    Cliente cliente;
    Permisos permisos;
    Log ll = new Log();
    Date date = new Date ();
    
    public RegistrarCliente(Permisos p, Cliente c) {
        this.permisos = p;
        this.cliente = c;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegCliente = new com.toedter.calendar.JDateChooser();
        PanelDatosDemograficos = new javax.swing.JPanel();
        lblCpCliente = new javax.swing.JLabel();
        lblMunicipioCliente = new javax.swing.JLabel();
        txtCpCliente = new javax.swing.JTextField();
        txtMunicipioCliente = new javax.swing.JTextField();
        lblDireccionCliente = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        lblEstadoCliente = new javax.swing.JLabel();
        txtEstadoCliente = new javax.swing.JTextField();
        btnLimpiarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        PanelDatosContacto = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        lblRfcCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtRfcCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblTelefonoCliente = new javax.swing.JLabel();
        lblCorreoCliente = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        lblContactoCliente = new javax.swing.JLabel();
        txtContactoCliente = new javax.swing.JTextField();
        PanelDatosAcceso = new javax.swing.JPanel();
        lblPasswordCliente = new javax.swing.JLabel();
        txtPasswordCliente = new javax.swing.JTextField();
        btnGenerarPassword = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRAR CLIENTE");
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

        txtIdCliente.setEditable(false);

        lblIdCliente.setText("ID CLIENTE");

        lblFechaReg.setText("FECHA REGISTRO");

        DateChooserFechaRegCliente.setEnabled(false);

        PanelDatosDemograficos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Demográficos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        lblCpCliente.setText("CP");

        lblMunicipioCliente.setText("MUNICIPIO");

        txtCpCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpClienteActionPerformed(evt);
            }
        });
        txtCpCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpClienteKeyTyped(evt);
            }
        });

        txtMunicipioCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMunicipioClienteKeyTyped(evt);
            }
        });

        lblDireccionCliente.setText("DIRECCIÓN");

        txtDireccionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionClienteKeyTyped(evt);
            }
        });

        lblEstadoCliente.setText("ESTADO");

        txtEstadoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelDatosDemograficosLayout = new javax.swing.GroupLayout(PanelDatosDemograficos);
        PanelDatosDemograficos.setLayout(PanelDatosDemograficosLayout);
        PanelDatosDemograficosLayout.setHorizontalGroup(
            PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosDemograficosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccionCliente))
                .addGap(26, 26, 26)
                .addGroup(PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosDemograficosLayout.createSequentialGroup()
                        .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblCpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtCpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDireccionCliente))
                .addContainerGap())
        );
        PanelDatosDemograficosLayout.setVerticalGroup(
            PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosDemograficosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionCliente)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMunicipioCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCpCliente)
                        .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstadoCliente)
                        .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpiarCliente.setText("LIMPIAR");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente.setText("CANCELAR");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setText("REGISTRAR");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N

        PanelDatosContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N
        PanelDatosContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreCliente.setText("NOMBRE");
        PanelDatosContacto.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 52, -1));

        lblRfcCliente.setText("RFC");
        PanelDatosContacto.add(lblRfcCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 52, -1));

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 30, 210, -1));

        txtRfcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcClienteActionPerformed(evt);
            }
        });
        txtRfcCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcClienteKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtRfcCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 70, 210, -1));

        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 230, -1));

        lblTelefonoCliente.setText("TELÉFONO");
        PanelDatosContacto.add(lblTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        lblCorreoCliente.setText("CORREO");
        PanelDatosContacto.add(lblCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 62, -1));

        txtCorreoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoClienteKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 230, -1));

        lblContactoCliente.setText("CONTACTO");
        PanelDatosContacto.add(lblContactoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtContactoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoClienteKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtContactoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 520, -1));

        PanelDatosAcceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Claves de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        lblPasswordCliente.setText("CONTRASEÑA");

        txtPasswordCliente.setEditable(false);

        btnGenerarPassword.setText("GENERAR CONTRASEÑA");
        btnGenerarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDatosAccesoLayout = new javax.swing.GroupLayout(PanelDatosAcceso);
        PanelDatosAcceso.setLayout(PanelDatosAccesoLayout);
        PanelDatosAccesoLayout.setHorizontalGroup(
            PanelDatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnGenerarPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatosAccesoLayout.setVerticalGroup(
            PanelDatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosAccesoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelDatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordCliente)
                    .addComponent(txtPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarPassword))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblIdCliente)
                        .addGap(15, 15, 15)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(lblFechaReg)
                        .addGap(20, 20, 20)
                        .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(image))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpiarCliente)
                                .addGap(7, 7, 7)
                                .addComponent(btnCancelarCliente)
                                .addGap(5, 5, 5)
                                .addComponent(btnRegistrarCliente))
                            .addComponent(PanelDatosContacto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                            .addComponent(PanelDatosDemograficos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelDatosAcceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblIdCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblFechaReg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(image))
                .addGap(2, 2, 2)
                .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(PanelDatosDemograficos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelDatosAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean camposCompletos () {
        if (!txtNombreCliente.getText().isEmpty() && !txtTelefonoCliente.getText().isEmpty() && !txtRfcCliente.getText().isEmpty() && !txtPasswordCliente.getText().isEmpty() &&
                !txtCorreoCliente.getText().isEmpty() && !txtContactoCliente.getText().isEmpty() && !txtDireccionCliente.getText().isEmpty() && !txtMunicipioCliente.getText().isEmpty() && !txtCpCliente.getText().isEmpty() && !txtEstadoCliente.getText().isEmpty()) {
           return true;
        }else {
           JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           return false;
        }
    }
    
    
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
            if (camposCompletos()) {
                try {
                    cliente.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
                    cliente.setContrasena(txtPasswordCliente.getText());
                    cliente.setNombre(txtNombreCliente.getText());
                    cliente.setRfc(txtRfcCliente.getText());
                    cliente.setDireccion(txtDireccionCliente.getText());
                    cliente.setCp(txtCpCliente.getText());
                    cliente.setMunicipio(txtMunicipioCliente.getText());
                    cliente.setEstado(txtEstadoCliente.getText());
                    cliente.setTelefono(txtTelefonoCliente.getText());
                    cliente.setContacto(txtContactoCliente.getText());
                    cliente.setCorreo(txtCorreoCliente.getText());
                    cliente.registrarCliente();
                    JOptionPane.showMessageDialog(null,"Registro Exitoso");
                    ll.agregarAccion(date.toString(),"Registro de Cliente");
                    limpiarCajas();
                    txtIdCliente.setText(String.valueOf(cliente.obtenerNoId()));
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                }
            }
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void txtRfcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcClienteActionPerformed

    private void txtCpClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpClienteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateChooserFechaRegCliente.setDate(new Date());    //al iniciar setear la fecha actual
        txtIdCliente.setText(String.valueOf(cliente.obtenerNoId()));    //

    }//GEN-LAST:event_formInternalFrameOpened

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        char c=evt.getKeyChar(); 
        String nombre = txtNombreCliente.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (nombre.length()>59) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyTyped
        char c = evt.getKeyChar();
        String telefono = txtTelefonoCliente.getText();
        
        if(telefono.length()>11){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }

    }//GEN-LAST:event_txtTelefonoClienteKeyTyped

    private void txtRfcClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcClienteKeyTyped
        String rfc = txtRfcCliente.getText();
        if(rfc.length()>12){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtRfcClienteKeyTyped

    private void txtContactoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoClienteKeyTyped
        char c=evt.getKeyChar(); 
        String contacto = txtContactoCliente.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (contacto.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtContactoClienteKeyTyped

    private void txtDireccionClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionClienteKeyTyped
        String direccion = txtDireccionCliente.getText();
        if (direccion.length()>49) {
            evt.consume();
            getToolkit().beep();
        }         
    }//GEN-LAST:event_txtDireccionClienteKeyTyped

    private void txtMunicipioClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioClienteKeyTyped
        char c=evt.getKeyChar(); 
        String municipio = txtMunicipioCliente.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (municipio.length()>29) {
            evt.consume();
            getToolkit().beep();
        }

    }//GEN-LAST:event_txtMunicipioClienteKeyTyped

    private void txtCpClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpClienteKeyTyped
        char c = evt.getKeyChar();
        String cp = txtCpCliente.getText();
        
        if(cp.length()>4){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }

    }//GEN-LAST:event_txtCpClienteKeyTyped

    private void txtEstadoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoClienteKeyTyped
        char c=evt.getKeyChar(); 
        String nombre = txtEstadoCliente.getText();
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (nombre.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtEstadoClienteKeyTyped

    private void txtCorreoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoClienteKeyTyped
        String correo = txtCorreoCliente.getText();
        if (correo.length()>29) {
            evt.consume();
            getToolkit().beep();
        }  
    }//GEN-LAST:event_txtCorreoClienteKeyTyped

    private void btnGenerarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPasswordActionPerformed
        
       txtPasswordCliente.setText(cliente.CadenaAlfanumAleatoria(5));
        
    }//GEN-LAST:event_btnGenerarPasswordActionPerformed

    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed
       
        limpiarCajas();
        
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    public void limpiarCajas() {
        
        txtTelefonoCliente.setText(null);
        txtRfcCliente.setText(null);
        txtNombreCliente.setText(null);
        txtMunicipioCliente.setText(null);
        txtEstadoCliente.setText(null);
        txtDireccionCliente.setText(null);
        txtCpCliente.setText(null);
        txtCorreoCliente.setText(null);
        txtContactoCliente.setText(null);
        txtPasswordCliente.setText(null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFechaRegCliente;
    private javax.swing.JPanel PanelDatosAcceso;
    private javax.swing.JPanel PanelDatosContacto;
    private javax.swing.JPanel PanelDatosDemograficos;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnGenerarPassword;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContactoCliente;
    private javax.swing.JLabel lblCorreoCliente;
    private javax.swing.JLabel lblCpCliente;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblEstadoCliente;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblMunicipioCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblPasswordCliente;
    private javax.swing.JLabel lblRfcCliente;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JTextField txtContactoCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtCpCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEstadoCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtMunicipioCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPasswordCliente;
    private javax.swing.JTextField txtRfcCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}

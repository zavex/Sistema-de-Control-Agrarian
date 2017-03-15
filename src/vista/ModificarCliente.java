package vista;

import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.*;


public class ModificarCliente extends javax.swing.JInternalFrame {
    
    Cliente cliente;
    
    Conexion conexion = new Conexion ();
    Permisos permisos = new Permisos (conexion);
    boolean userName = false;
    Vector fila;
    boolean flag;
    Log ll = new Log();
    Date date = new Date ();
    
    public ModificarCliente(Permisos p, Cliente c, Vector vector) {
        this.permisos = p;
        this.cliente = c;
        this.fila = vector;
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
        btnGuardarCambiosCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
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
        PanelClavesAcceso = new javax.swing.JPanel();
        lblPassCliente = new javax.swing.JLabel();
        txtPasswordCliente = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MODIFICAR CLIENTE");
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

        txtIdCliente.setEditable(false);
        getContentPane().add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 41, -1));

        lblIdCliente.setText("ID CLIENTE");
        getContentPane().add(lblIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 14, -1, -1));

        lblFechaReg.setText("FECHA REGISTRO");
        getContentPane().add(lblFechaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 20));

        DateChooserFechaRegCliente.setEnabled(false);
        DateChooserFechaRegCliente.setFocusable(false);
        getContentPane().add(DateChooserFechaRegCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 11, 136, -1));

        PanelDatosDemograficos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Demograficos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N
        PanelDatosDemograficos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PanelDatosDemograficosKeyTyped(evt);
            }
        });

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

        lblDireccionCliente.setText("DIRECCION");

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
                    .addComponent(lblDireccionCliente)
                    .addComponent(lblMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosDemograficosLayout.createSequentialGroup()
                        .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(lblCpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtCpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
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
                .addGap(7, 7, 7)
                .addGroup(PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMunicipioCliente)
                        .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCpCliente)
                        .addComponent(txtCpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstadoCliente)
                        .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDatosDemograficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnLimpiarCliente.setText("LIMPIAR");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        btnGuardarCambiosCliente.setText("GUARDAR CAMBIOS");
        btnGuardarCambiosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarCambiosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        btnCancelarCliente.setText("CANCELAR");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 0, -1, -1));

        PanelDatosContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        lblNombreCliente.setText("NOMBRE");

        lblRfcCliente.setText("RFC");

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

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

        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyTyped(evt);
            }
        });

        lblTelefonoCliente.setText("TELEFONO");

        lblCorreoCliente.setText("CORREO");

        txtCorreoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoClienteKeyTyped(evt);
            }
        });

        lblContactoCliente.setText("CONTACTO DIRECTO");

        txtContactoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelDatosContactoLayout = new javax.swing.GroupLayout(PanelDatosContacto);
        PanelDatosContacto.setLayout(PanelDatosContactoLayout);
        PanelDatosContactoLayout.setHorizontalGroup(
            PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                        .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRfcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(txtRfcCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefonoCliente))
                        .addGap(2, 2, 2)
                        .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtCorreoCliente)))
                    .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                        .addComponent(lblContactoCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtContactoCliente))
                .addContainerGap())
        );
        PanelDatosContactoLayout.setVerticalGroup(
            PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreCliente)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefonoCliente)
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRfcCliente)
                        .addComponent(lblCorreoCliente)
                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRfcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblContactoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContactoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDatosContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 54, 621, -1));

        PanelClavesAcceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Claves de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 14))); // NOI18N

        lblPassCliente.setText("CONTRASEÑA");

        txtPasswordCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClavesAccesoLayout = new javax.swing.GroupLayout(PanelClavesAcceso);
        PanelClavesAcceso.setLayout(PanelClavesAccesoLayout);
        PanelClavesAccesoLayout.setHorizontalGroup(
            PanelClavesAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClavesAccesoLayout.createSequentialGroup()
                .addComponent(txtPasswordCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblPassCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelClavesAccesoLayout.setVerticalGroup(
            PanelClavesAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClavesAccesoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelClavesAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassCliente)
                    .addComponent(txtPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        getContentPane().add(PanelClavesAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 80));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 620, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 620, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean camposCompletos () {
        if (!txtNombreCliente.getText().isEmpty() && !txtTelefonoCliente.getText().isEmpty() && !txtRfcCliente.getText().isEmpty() &&
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
    
    private void btnGuardarCambiosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosClienteActionPerformed
        //verificar correo
        cliente.validarCorreo(title);
            if (camposCompletos()) {
                try {
                    cliente.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
                    cliente.setNombre(txtNombreCliente.getText());
                    cliente.setRfc(txtRfcCliente.getText());
                    cliente.setDireccion(txtDireccionCliente.getText());
                    cliente.setTelefono(txtTelefonoCliente.getText());
                    cliente.setCp(txtCpCliente.getText());
                    cliente.setMunicipio(txtMunicipioCliente.getText());
                    cliente.setEstado(txtEstadoCliente.getText());
                    cliente.setCorreo(txtCorreoCliente.getText());
                    cliente.setContacto(txtContactoCliente.getText());
                    cliente.setContrasena(txtPasswordCliente.getText());
                    cliente.modificarCliente();
                    JOptionPane.showMessageDialog(null,"Actualización exitosa");
                    ll.agregarAccion(date.toString(),"Modificacion de Cliente");
                    this.dispose();
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getStackTrace());
                }
            }
    }//GEN-LAST:event_btnGuardarCambiosClienteActionPerformed

    private void txtRfcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcClienteActionPerformed

    private void txtCpClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpClienteActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            txtIdCliente.setText(fila.get(0).toString());  
            txtNombreCliente.setText(fila.get(1).toString());
            txtRfcCliente.setText(fila.get(2).toString());
            txtDireccionCliente.setText(fila.get(3).toString());
            txtTelefonoCliente.setText(fila.get(4).toString());
            txtCpCliente.setText(fila.get(5).toString());
            txtMunicipioCliente.setText(fila.get(6).toString());
            txtEstadoCliente.setText(fila.get(7).toString());
            txtCorreoCliente.setText(fila.get(8).toString());
            txtContactoCliente.setText(fila.get(9).toString());
            txtPasswordCliente.setText(fila.get(10).toString());
            DateChooserFechaRegCliente.setDate((Date) fila.get(11));
            int dig = Integer.parseInt(txtIdCliente.getText());
          } catch(Exception e) {
              JOptionPane.showMessageDialog(this, e);
          }
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        char c=evt.getKeyChar(); 
        String nombre = txtNombreCliente.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if(nombre.length()>59){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyTyped
        char c=evt.getKeyChar(); 
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
        if (rfc.length()>12) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtRfcClienteKeyTyped

    private void txtCorreoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoClienteKeyTyped
        String correo = txtCorreoCliente.getText();
        if (correo.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCorreoClienteKeyTyped

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
        
        if (municipio.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        } 

    }//GEN-LAST:event_txtMunicipioClienteKeyTyped

    private void PanelDatosDemograficosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelDatosDemograficosKeyTyped
               
    }//GEN-LAST:event_PanelDatosDemograficosKeyTyped

    private void txtCpClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpClienteKeyTyped
        char c=evt.getKeyChar(); 
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
        String estado = txtEstadoCliente.getText();
        
        if (estado.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        } 
    }//GEN-LAST:event_txtEstadoClienteKeyTyped

    private void txtPasswordClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordClienteActionPerformed
    }//GEN-LAST:event_txtPasswordClienteActionPerformed

    private void txtContactoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoClienteKeyTyped
        char c=evt.getKeyChar();
        String contacto = txtContactoCliente.getText();
        
        if (contacto.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        } 
    }//GEN-LAST:event_txtContactoClienteKeyTyped

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
    private javax.swing.JPanel PanelClavesAcceso;
    private javax.swing.JPanel PanelDatosContacto;
    private javax.swing.JPanel PanelDatosDemograficos;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnGuardarCambiosCliente;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContactoCliente;
    private javax.swing.JLabel lblCorreoCliente;
    private javax.swing.JLabel lblCpCliente;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblEstadoCliente;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblMunicipioCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblPassCliente;
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
    private javax.swing.JPasswordField txtPasswordCliente;
    private javax.swing.JTextField txtRfcCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}

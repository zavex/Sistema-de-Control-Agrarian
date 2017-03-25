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
        jPanel1 = new javax.swing.JPanel();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegCliente = new com.toedter.calendar.JDateChooser();
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
        PanelDatosDemograficos = new javax.swing.JPanel();
        lblCpCliente = new javax.swing.JLabel();
        lblMunicipioCliente = new javax.swing.JLabel();
        txtCpCliente = new javax.swing.JTextField();
        txtMunicipioCliente = new javax.swing.JTextField();
        lblDireccionCliente = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        lblEstadoCliente = new javax.swing.JLabel();
        txtEstadoCliente = new javax.swing.JTextField();
        PanelClavesAcceso = new javax.swing.JPanel();
        lblPassCliente = new javax.swing.JLabel();
        txtPasswordCliente = new javax.swing.JPasswordField();
        btnLimpiarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        btnGuardarCambiosCliente = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Cliente");
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

        lblIdCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblIdCliente.setText("Id Cliente");

        txtIdCliente.setEditable(false);

        lblFechaReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaReg.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaReg.setText("Fecha de Registro");

        DateChooserFechaRegCliente.setEnabled(false);
        DateChooserFechaRegCliente.setFocusable(false);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N

        PanelDatosContacto.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblNombreCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreCliente.setText("Nombre");

        lblRfcCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRfcCliente.setForeground(new java.awt.Color(0, 0, 102));
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

        lblTelefonoCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefonoCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblTelefonoCliente.setText("Teléfono");

        lblCorreoCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCorreoCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblCorreoCliente.setText("Correo");

        txtCorreoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoClienteKeyTyped(evt);
            }
        });

        lblContactoCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblContactoCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblContactoCliente.setText("Contacto Directo");

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
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtRfcCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefonoCliente))
                        .addGap(2, 2, 2)
                        .addGroup(PanelDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(txtCorreoCliente)))
                    .addComponent(txtContactoCliente)
                    .addGroup(PanelDatosContactoLayout.createSequentialGroup()
                        .addComponent(lblContactoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        PanelDatosDemograficos.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosDemograficos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Demograficos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDatosDemograficos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PanelDatosDemograficosKeyTyped(evt);
            }
        });

        lblCpCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCpCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblCpCliente.setText("CP");

        lblMunicipioCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMunicipioCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblMunicipioCliente.setText("Municipio");

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

        lblDireccionCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccionCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblDireccionCliente.setText("Direccion");

        txtDireccionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionClienteKeyTyped(evt);
            }
        });

        lblEstadoCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEstadoCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblEstadoCliente.setText("Estado");

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
                .addGroup(PanelDatosDemograficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMunicipioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
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
                .addGap(20, 20, 20)
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

        PanelClavesAcceso.setBackground(new java.awt.Color(255, 255, 255));
        PanelClavesAcceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Claves de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblPassCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPassCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblPassCliente.setText("Contraseña");

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

        btnLimpiarCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCliente.setText("Limpiar");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        btnGuardarCambiosCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardarCambiosCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarCambiosCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambiosCliente.setText("Guardar Cambios");
        btnGuardarCambiosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(lblFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(image)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PanelDatosDemograficos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PanelClavesAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiarCliente)
                                .addGap(12, 12, 12)
                                .addComponent(btnCancelarCliente)
                                .addGap(13, 13, 13)
                                .addComponent(btnGuardarCambiosCliente)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image)
                    .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIdCliente)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelDatosDemograficos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelClavesAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarCliente)
                            .addComponent(btnCancelarCliente)
                            .addComponent(btnGuardarCambiosCliente))))
                .addContainerGap(36, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
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

package vista;

import java.util.Date;
import javax.swing.JOptionPane;
import modelo.*;

/**
 * Este formulario se encarga de mostrar la ventana de registro de Clientes.
 * @author Save Soto
 */
public class RegistrarCliente extends javax.swing.JInternalFrame {
    
    Cliente cliente;
    Permisos permisos;
    Log ll = new Log();
    Date date = new Date ();
    
    /**
     * Constructor de la vista de registro de Clientes.
     * @param p Recibe la instancia de la clase Permisos.
     * @param c Recibe la instancia de la clase Cliente.
     */
    public RegistrarCliente(Permisos p, Cliente c) {
        this.permisos = p;
        this.cliente = c;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        lblFechaReg = new javax.swing.JLabel();
        DateChooserFechaRegCliente = new com.toedter.calendar.JDateChooser();
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
        PanelDatosAcceso = new javax.swing.JPanel();
        lblPasswordCliente = new javax.swing.JLabel();
        txtPasswordCliente = new javax.swing.JTextField();
        btnGenerarPassword = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registar Cliente");
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

        lblIdCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblIdCliente.setText("Id Cliente");

        txtIdCliente.setEditable(false);

        lblFechaReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaReg.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaReg.setText("Fecha de Registro");

        DateChooserFechaRegCliente.setEnabled(false);

        PanelDatosContacto.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDatosContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreCliente.setText("Nombre");
        PanelDatosContacto.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 52, -1));

        lblRfcCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRfcCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblRfcCliente.setText("RFC");
        PanelDatosContacto.add(lblRfcCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 52, -1));

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

        lblTelefonoCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefonoCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblTelefonoCliente.setText("Teléfono");
        PanelDatosContacto.add(lblTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        lblCorreoCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCorreoCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblCorreoCliente.setText("Correo");
        PanelDatosContacto.add(lblCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 62, -1));

        txtCorreoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoClienteKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 230, -1));

        lblContactoCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblContactoCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblContactoCliente.setText("Contacto");
        PanelDatosContacto.add(lblContactoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtContactoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoClienteKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtContactoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 520, -1));

        PanelDatosDemograficos.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosDemograficos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Demográficos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

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
        lblDireccionCliente.setText("Dirección");

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

        PanelDatosAcceso.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosAcceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Claves de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblPasswordCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPasswordCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblPasswordCliente.setText("Contraseña");

        txtPasswordCliente.setEditable(false);

        btnGenerarPassword.setBackground(new java.awt.Color(102, 102, 255));
        btnGenerarPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGenerarPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarPassword.setText("Generar Contraseña");
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
                .addGroup(PanelDatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosAccesoLayout.createSequentialGroup()
                        .addComponent(lblPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnGenerarPassword))
                    .addComponent(txtPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatosAccesoLayout.setVerticalGroup(
            PanelDatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPasswordCliente)
                    .addComponent(btnGenerarPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswordCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnRegistrarCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setText("Registrar");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
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

        btnLimpiarCliente.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCliente.setText("Limpiar");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblIdCliente)
                .addGap(15, 15, 15)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(lblFechaReg)
                .addGap(20, 20, 20)
                .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDatosContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDatosDemograficos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDatosAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarCliente)
                .addGap(7, 7, 7)
                .addComponent(btnCancelarCliente)
                .addGap(5, 5, 5)
                .addComponent(btnRegistrarCliente)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(image))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdCliente)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaReg)
                            .addComponent(DateChooserFechaRegCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PanelDatosDemograficos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PanelDatosAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiarCliente))
                .addGap(15, 15, 15))
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
     * Verifica que toda la información haya sido introducida al formulario.
     * @return Regresa un valor booleano para indicar si se completado información.  
     */
    public boolean camposCompletos () {
        if (!txtNombreCliente.getText().isEmpty() && !txtTelefonoCliente.getText().isEmpty() && !txtRfcCliente.getText().isEmpty() && !txtPasswordCliente.getText().isEmpty() &&
                !txtCorreoCliente.getText().isEmpty() && !txtContactoCliente.getText().isEmpty() && !txtDireccionCliente.getText().isEmpty() && !txtMunicipioCliente.getText().isEmpty() && !txtCpCliente.getText().isEmpty() && !txtEstadoCliente.getText().isEmpty()) {
           return true;
        }else {
           JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           return false;
        }
    }
    
    /**
     * Método para convertir fecha de tipo java.util.date a un formato compatible con SQL.
     * @param date  fecha de tipo java date.
     * @return regresa un dato de tipo sql date.  
     */
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    /**
     * Recopila la información cargada en la vista y la envía al método alojado en la clase de Cliente para su respectiva actualización en la base de datos.
     * @param evt 
     */
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

    /**
     * Método obstoleto o no usado.
     * @param evt 
     */
    private void txtRfcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcClienteActionPerformed

    /**
     * Método obstoleto o no usado.
     * @param evt 
     */
    private void txtCpClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpClienteActionPerformed

    /**
     * Método de apertura, se encarga de cargar la fecha y el id generado por la base de datos para su registro.
     * @param evt 
     */
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateChooserFechaRegCliente.setDate(new Date());    //al iniciar setear la fecha actual
        txtIdCliente.setText(String.valueOf(cliente.obtenerNoId()));    //

    }//GEN-LAST:event_formInternalFrameOpened

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar letras, destruye números y solo permite ingresar hasta 60 caracteres.
     * @param evt 
     */
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

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar números, destruye letras y solo permite ingresar hasta 12 caracteres.
     * @param evt 
     */
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

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, solo permite ingresar hasta 13 caracteres.
     * @param evt 
     */
    private void txtRfcClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcClienteKeyTyped
        String rfc = txtRfcCliente.getText();
        if(rfc.length()>12){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtRfcClienteKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar letras, destruye números y solo permite ingresar hasta 30 caracteres.
     * @param evt 
     */
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

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, solo permite ingresar hasta 50 caracteres.
     * @param evt 
     */
    private void txtDireccionClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionClienteKeyTyped
        String direccion = txtDireccionCliente.getText();
        if (direccion.length()>49) {
            evt.consume();
            getToolkit().beep();
        }         
    }//GEN-LAST:event_txtDireccionClienteKeyTyped

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar letras, destruye números y solo permite ingresar hasta 30 caracteres.
     * @param evt 
     */
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

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar números, destruye letras y solo permite ingresar hasta 5 caracteres.
     * @param evt 
     */
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

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, este solo permite ingresar letras, destruye números y solo permite ingresar hasta 30 caracteres.
     * @param evt 
     */
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

    /**
     * Valida el tipo de caracter escrito en los cuadros de texto, solo permite ingresar hasta 30 caracteres.
     * @param evt 
     */
    private void txtCorreoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoClienteKeyTyped
        String correo = txtCorreoCliente.getText();
        if (correo.length()>29) {
            evt.consume();
            getToolkit().beep();
        }  
    }//GEN-LAST:event_txtCorreoClienteKeyTyped

    /**
     * Invoca el método de generación de contraseña.
     * @param evt 
     * @see cliente.CadenaAlfanumAleatoria()
     */
    private void btnGenerarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPasswordActionPerformed
        
       txtPasswordCliente.setText(cliente.CadenaAlfanumAleatoria(5));
        
    }//GEN-LAST:event_btnGenerarPasswordActionPerformed

    /**
     * Invoca el método de limpieza de ventana. 
     * @param evt 
     */
    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed
       
        limpiarCajas();
        
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed

    /**
     * Se encarga de cerrar la ventana de registro.
     * @param evt 
     */
    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    /**
     * Elimina los datos ingresados en las casillas del formulario.
     */
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

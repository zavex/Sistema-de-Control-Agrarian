package vista;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import modelo.*;

public class ModificarEmpleado extends javax.swing.JInternalFrame {

    Conexion conexion = new Conexion ();
    Permisos permisos = new Permisos (conexion);
    Empleado empleado;
    boolean userName = false;
    Vector fila;
    boolean sinUsuario;
    Log ll = new Log();
    Date date = new Date ();
    
    public ModificarEmpleado(Empleado empleado, Vector vector) {
        this.empleado = empleado;
        this.fila = vector;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupClientePermisos = new javax.swing.ButtonGroup();
        btnGroupEmpleadoPermiso = new javax.swing.ButtonGroup();
        btnGroupProveedorPermiso = new javax.swing.ButtonGroup();
        btnGroupProductoPermiso = new javax.swing.ButtonGroup();
        btnGroupCompraPermiso = new javax.swing.ButtonGroup();
        btnGroupVentaPermiso = new javax.swing.ButtonGroup();
        btnGroupNotasCreditoPermiso = new javax.swing.ButtonGroup();
        btnGroupDevolucionPermiso = new javax.swing.ButtonGroup();
        btnGroupAlmacenPermiso = new javax.swing.ButtonGroup();
        btnGroupFacturaPermiso = new javax.swing.ButtonGroup();
        btnGroupAdminPermiso = new javax.swing.ButtonGroup();
        btnGroupMezclaPermiso = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PanelFecha = new javax.swing.JPanel();
        lblIdEmpleado = new javax.swing.JLabel();
        lblFechaReg = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        DateChooserFechaRegEmpleado = new com.toedter.calendar.JDateChooser();
        PanelDatosContacto = new javax.swing.JPanel();
        lblNombreEmpleado = new javax.swing.JLabel();
        lblRfcEmpleado = new javax.swing.JLabel();
        lblCurpEmpleado = new javax.swing.JLabel();
        lblNssEmpleado = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtRfcEmpleado = new javax.swing.JTextField();
        txtCurpEmpleado = new javax.swing.JTextField();
        txtNssEmpleado = new javax.swing.JTextField();
        lblTelefonoEmpleado = new javax.swing.JLabel();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        lblDireccionEmpleado = new javax.swing.JLabel();
        txtDireccionEmpleado = new javax.swing.JTextField();
        lblCorreoEmpleado = new javax.swing.JLabel();
        txtCorreoEmpleado = new javax.swing.JTextField();
        PanelLaboral = new javax.swing.JPanel();
        lblStatusEmpleado = new javax.swing.JLabel();
        lblDepartamentoEmpleado = new javax.swing.JLabel();
        comboStatusEmpleado = new javax.swing.JComboBox<String>();
        comboDeptoEmpleado = new javax.swing.JComboBox<String>();
        PanelPermisos2 = new javax.swing.JPanel();
        lblClientePermiso2 = new javax.swing.JLabel();
        lblEmpleadoPermiso2 = new javax.swing.JLabel();
        lblProveedorPermiso2 = new javax.swing.JLabel();
        lblProductoPermiso2 = new javax.swing.JLabel();
        lblCompraPermiso2 = new javax.swing.JLabel();
        lblVentaPermiso2 = new javax.swing.JLabel();
        lblNotaCreditoPermiso2 = new javax.swing.JLabel();
        lblDevolucionPermiso2 = new javax.swing.JLabel();
        lblAlmacenPermiso2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNoAccesso2 = new javax.swing.JLabel();
        lblLectura2 = new javax.swing.JLabel();
        lblEscritura2 = new javax.swing.JLabel();
        lblAdminPermisos1 = new javax.swing.JLabel();
        lblMezclas1 = new javax.swing.JLabel();
        lblFacturaPermiso = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radioClienteNoAcceso = new javax.swing.JRadioButton();
        radioClienteLectura = new javax.swing.JRadioButton();
        radioClienteEscritura = new javax.swing.JRadioButton();
        radioEmpleadoEscritura = new javax.swing.JRadioButton();
        radioEmpleadoLectura = new javax.swing.JRadioButton();
        radioEmpleadoNoAcceso = new javax.swing.JRadioButton();
        radioProductoEscritura = new javax.swing.JRadioButton();
        radioProductoLectura = new javax.swing.JRadioButton();
        radioProductoNoAcceso = new javax.swing.JRadioButton();
        radioProveedorNoAcceso = new javax.swing.JRadioButton();
        radioProveedorLectura = new javax.swing.JRadioButton();
        radioProveedorEscritura = new javax.swing.JRadioButton();
        radioDevolucionEscritura = new javax.swing.JRadioButton();
        radioDevolucionLectura = new javax.swing.JRadioButton();
        radioDevolucionNoAcceso = new javax.swing.JRadioButton();
        radioNotasCreditoNoAcceso = new javax.swing.JRadioButton();
        radioNotasCreditoLectura = new javax.swing.JRadioButton();
        radioNotasCreditoEscritura = new javax.swing.JRadioButton();
        radioVentaEscritura = new javax.swing.JRadioButton();
        radioVentaLectura = new javax.swing.JRadioButton();
        radioVentaNoAcceso = new javax.swing.JRadioButton();
        radioCompraNoAcceso = new javax.swing.JRadioButton();
        radioCompraLectura = new javax.swing.JRadioButton();
        radioCompraEscritura = new javax.swing.JRadioButton();
        radioAlmacenEscritura = new javax.swing.JRadioButton();
        radioAlmacenLectura = new javax.swing.JRadioButton();
        radioAlmacenNoAcceso = new javax.swing.JRadioButton();
        radioAdminLectura = new javax.swing.JRadioButton();
        radioAdminNoAcceso = new javax.swing.JRadioButton();
        radioAdminEscritura = new javax.swing.JRadioButton();
        radioMezclaNoAcceso = new javax.swing.JRadioButton();
        radioMezclaLectura = new javax.swing.JRadioButton();
        radioMezclaEscritura = new javax.swing.JRadioButton();
        radioFacturaLectura = new javax.swing.JRadioButton();
        radioFacturaEscritura = new javax.swing.JRadioButton();
        radioFacturaNoAcceso = new javax.swing.JRadioButton();
        rbModificarPermisos = new javax.swing.JRadioButton();
        PanelDatosUsuario = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmarPassword = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        btnCancelarEmpleado = new javax.swing.JButton();
        btnGuardarCambiosEmpleado = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Empleado");
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

        PanelFecha.setBackground(new java.awt.Color(255, 255, 255));

        lblIdEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIdEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblIdEmpleado.setText("Id Empleado");

        lblFechaReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaReg.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaReg.setText("Fecha de Registro");

        txtIdEmpleado.setEditable(false);

        DateChooserFechaRegEmpleado.setEnabled(false);

        javax.swing.GroupLayout PanelFechaLayout = new javax.swing.GroupLayout(PanelFecha);
        PanelFecha.setLayout(PanelFechaLayout);
        PanelFechaLayout.setHorizontalGroup(
            PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateChooserFechaRegEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        PanelFechaLayout.setVerticalGroup(
            PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateChooserFechaRegEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIdEmpleado)
                        .addComponent(lblFechaReg)
                        .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanelDatosContacto.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDatosContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreEmpleado.setText("Nombre");
        PanelDatosContacto.add(lblNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 33, 52, -1));

        lblRfcEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRfcEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblRfcEmpleado.setText("RFC");
        PanelDatosContacto.add(lblRfcEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 58, 52, -1));

        lblCurpEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurpEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblCurpEmpleado.setText("CURP");
        PanelDatosContacto.add(lblCurpEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 33, 63, -1));

        lblNssEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNssEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblNssEmpleado.setText("NSS");
        PanelDatosContacto.add(lblNssEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 83, 36, -1));

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
        PanelDatosContacto.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 31, 200, -1));

        txtRfcEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcEmpleadoActionPerformed(evt);
            }
        });
        txtRfcEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtRfcEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 56, 200, -1));

        txtCurpEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurpEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtCurpEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 31, 210, -1));

        txtNssEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNssEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtNssEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 81, 200, -1));

        lblTelefonoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefonoEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblTelefonoEmpleado.setText("Teléfono");
        PanelDatosContacto.add(lblTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 58, -1, -1));

        txtTelefonoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEmpleadoActionPerformed(evt);
            }
        });
        txtTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 56, 210, -1));

        lblDireccionEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccionEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblDireccionEmpleado.setText("Direccion");
        PanelDatosContacto.add(lblDireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 83, -1, -1));

        txtDireccionEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtDireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 81, 210, -1));

        lblCorreoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCorreoEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblCorreoEmpleado.setText("Correo");
        PanelDatosContacto.add(lblCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 108, 63, -1));

        txtCorreoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 106, 200, -1));

        PanelLaboral.setBackground(new java.awt.Color(255, 255, 255));
        PanelLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Laborales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblStatusEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblStatusEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblStatusEmpleado.setText("Status");

        lblDepartamentoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDepartamentoEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblDepartamentoEmpleado.setText("Departamento");

        comboStatusEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        comboStatusEmpleado.setSelectedIndex(-1);

        comboDeptoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gerencia", "Contabilidad", "Recursos Humanos", "Administracion", "Compras", "Sistemas", "Mercadotecnia", "Finanzas", "Produccion", "Ventas" }));
        comboDeptoEmpleado.setSelectedIndex(-1);

        javax.swing.GroupLayout PanelLaboralLayout = new javax.swing.GroupLayout(PanelLaboral);
        PanelLaboral.setLayout(PanelLaboralLayout);
        PanelLaboralLayout.setHorizontalGroup(
            PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLaboralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLaboralLayout.createSequentialGroup()
                        .addComponent(lblDepartamentoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(comboDeptoEmpleado, 0, 139, Short.MAX_VALUE))
                    .addGroup(PanelLaboralLayout.createSequentialGroup()
                        .addComponent(lblStatusEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboStatusEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelLaboralLayout.setVerticalGroup(
            PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLaboralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusEmpleado)
                    .addComponent(comboStatusEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartamentoEmpleado)
                    .addComponent(comboDeptoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPermisos2.setBackground(new java.awt.Color(255, 255, 255));
        PanelPermisos2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permisos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelPermisos2.setForeground(new java.awt.Color(255, 255, 255));

        lblClientePermiso2.setText("CLIENTE");

        lblEmpleadoPermiso2.setText("EMPLEADO");

        lblProveedorPermiso2.setText("PROVEEDOR");

        lblProductoPermiso2.setText("PRODUCTO");

        lblCompraPermiso2.setText("COMPRA");

        lblVentaPermiso2.setText("VENTA");

        lblNotaCreditoPermiso2.setText("NOTAS CREDITO");

        lblDevolucionPermiso2.setText("DEVOLUCION");

        lblAlmacenPermiso2.setText("ALMACEN");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblNoAccesso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/noAccess.png"))); // NOI18N

        lblLectura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read.png"))); // NOI18N

        lblEscritura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/write.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblNoAccesso2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblLectura2)
                .addGap(20, 20, 20)
                .addComponent(lblEscritura2)
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoAccesso2)
                    .addComponent(lblLectura2)
                    .addComponent(lblEscritura2))
                .addGap(0, 0, 0))
        );

        lblAdminPermisos1.setText("ADMIN");

        lblMezclas1.setText("MEZCLAS");

        lblFacturaPermiso.setText("FACTURA");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnGroupClientePermisos.add(radioClienteNoAcceso);
        radioClienteNoAcceso.setEnabled(false);

        btnGroupClientePermisos.add(radioClienteLectura);
        radioClienteLectura.setEnabled(false);

        radioClienteEscritura.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupClientePermisos.add(radioClienteEscritura);
        radioClienteEscritura.setEnabled(false);

        btnGroupEmpleadoPermiso.add(radioEmpleadoEscritura);
        radioEmpleadoEscritura.setEnabled(false);

        btnGroupEmpleadoPermiso.add(radioEmpleadoLectura);
        radioEmpleadoLectura.setEnabled(false);

        btnGroupEmpleadoPermiso.add(radioEmpleadoNoAcceso);
        radioEmpleadoNoAcceso.setEnabled(false);

        btnGroupProductoPermiso.add(radioProductoEscritura);
        radioProductoEscritura.setEnabled(false);

        btnGroupProductoPermiso.add(radioProductoLectura);
        radioProductoLectura.setEnabled(false);

        btnGroupProductoPermiso.add(radioProductoNoAcceso);
        radioProductoNoAcceso.setEnabled(false);

        btnGroupProveedorPermiso.add(radioProveedorNoAcceso);
        radioProveedorNoAcceso.setEnabled(false);

        btnGroupProveedorPermiso.add(radioProveedorLectura);
        radioProveedorLectura.setEnabled(false);

        btnGroupProveedorPermiso.add(radioProveedorEscritura);
        radioProveedorEscritura.setEnabled(false);

        btnGroupDevolucionPermiso.add(radioDevolucionEscritura);
        radioDevolucionEscritura.setEnabled(false);

        btnGroupDevolucionPermiso.add(radioDevolucionLectura);
        radioDevolucionLectura.setEnabled(false);

        btnGroupDevolucionPermiso.add(radioDevolucionNoAcceso);
        radioDevolucionNoAcceso.setEnabled(false);

        btnGroupNotasCreditoPermiso.add(radioNotasCreditoNoAcceso);
        radioNotasCreditoNoAcceso.setEnabled(false);

        btnGroupNotasCreditoPermiso.add(radioNotasCreditoLectura);
        radioNotasCreditoLectura.setEnabled(false);

        btnGroupNotasCreditoPermiso.add(radioNotasCreditoEscritura);
        radioNotasCreditoEscritura.setEnabled(false);

        btnGroupVentaPermiso.add(radioVentaEscritura);
        radioVentaEscritura.setEnabled(false);

        btnGroupVentaPermiso.add(radioVentaLectura);
        radioVentaLectura.setEnabled(false);

        btnGroupVentaPermiso.add(radioVentaNoAcceso);
        radioVentaNoAcceso.setEnabled(false);

        btnGroupCompraPermiso.add(radioCompraNoAcceso);
        radioCompraNoAcceso.setEnabled(false);

        btnGroupCompraPermiso.add(radioCompraLectura);
        radioCompraLectura.setEnabled(false);

        btnGroupCompraPermiso.add(radioCompraEscritura);
        radioCompraEscritura.setEnabled(false);

        btnGroupAlmacenPermiso.add(radioAlmacenEscritura);
        radioAlmacenEscritura.setEnabled(false);

        btnGroupAlmacenPermiso.add(radioAlmacenLectura);
        radioAlmacenLectura.setEnabled(false);

        btnGroupAlmacenPermiso.add(radioAlmacenNoAcceso);
        radioAlmacenNoAcceso.setEnabled(false);

        btnGroupAdminPermiso.add(radioAdminLectura);
        radioAdminLectura.setEnabled(false);

        btnGroupAdminPermiso.add(radioAdminNoAcceso);
        radioAdminNoAcceso.setEnabled(false);

        btnGroupAdminPermiso.add(radioAdminEscritura);
        radioAdminEscritura.setEnabled(false);

        btnGroupMezclaPermiso.add(radioMezclaNoAcceso);
        radioMezclaNoAcceso.setEnabled(false);

        btnGroupMezclaPermiso.add(radioMezclaLectura);
        radioMezclaLectura.setEnabled(false);

        btnGroupMezclaPermiso.add(radioMezclaEscritura);
        radioMezclaEscritura.setEnabled(false);

        btnGroupFacturaPermiso.add(radioFacturaLectura);
        radioFacturaLectura.setEnabled(false);

        btnGroupFacturaPermiso.add(radioFacturaEscritura);
        radioFacturaEscritura.setEnabled(false);

        btnGroupFacturaPermiso.add(radioFacturaNoAcceso);
        radioFacturaNoAcceso.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioMezclaNoAcceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioMezclaLectura)
                        .addGap(34, 34, 34)
                        .addComponent(radioMezclaEscritura))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioAdminNoAcceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioAdminLectura)
                        .addGap(34, 34, 34)
                        .addComponent(radioAdminEscritura))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioAlmacenNoAcceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioAlmacenLectura)
                        .addGap(34, 34, 34)
                        .addComponent(radioAlmacenEscritura))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioClienteNoAcceso)
                            .addComponent(radioEmpleadoNoAcceso)
                            .addComponent(radioProveedorNoAcceso)
                            .addComponent(radioProductoNoAcceso)
                            .addComponent(radioCompraNoAcceso)
                            .addComponent(radioVentaNoAcceso)
                            .addComponent(radioNotasCreditoNoAcceso)
                            .addComponent(radioDevolucionNoAcceso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioClienteLectura)
                            .addComponent(radioEmpleadoLectura)
                            .addComponent(radioProveedorLectura)
                            .addComponent(radioProductoLectura)
                            .addComponent(radioCompraLectura)
                            .addComponent(radioVentaLectura)
                            .addComponent(radioNotasCreditoLectura)
                            .addComponent(radioDevolucionLectura))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioClienteEscritura)
                            .addComponent(radioEmpleadoEscritura)
                            .addComponent(radioProveedorEscritura)
                            .addComponent(radioProductoEscritura)
                            .addComponent(radioCompraEscritura)
                            .addComponent(radioVentaEscritura)
                            .addComponent(radioNotasCreditoEscritura)
                            .addComponent(radioDevolucionEscritura)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioFacturaNoAcceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(radioFacturaLectura)
                        .addGap(34, 34, 34)
                        .addComponent(radioFacturaEscritura))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioClienteNoAcceso)
                        .addGap(0, 0, 0)
                        .addComponent(radioEmpleadoNoAcceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioProveedorNoAcceso)
                        .addGap(0, 0, 0)
                        .addComponent(radioProductoNoAcceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioCompraNoAcceso)
                        .addGap(0, 0, 0)
                        .addComponent(radioVentaNoAcceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNotasCreditoNoAcceso)
                        .addGap(0, 0, 0)
                        .addComponent(radioDevolucionNoAcceso))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioClienteLectura)
                        .addGap(0, 0, 0)
                        .addComponent(radioEmpleadoLectura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioProveedorLectura)
                        .addGap(0, 0, 0)
                        .addComponent(radioProductoLectura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioCompraLectura)
                        .addGap(0, 0, 0)
                        .addComponent(radioVentaLectura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNotasCreditoLectura)
                        .addGap(0, 0, 0)
                        .addComponent(radioDevolucionLectura))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radioClienteEscritura)
                        .addGap(0, 0, 0)
                        .addComponent(radioEmpleadoEscritura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioProveedorEscritura)
                        .addGap(0, 0, 0)
                        .addComponent(radioProductoEscritura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioCompraEscritura)
                        .addGap(0, 0, 0)
                        .addComponent(radioVentaEscritura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNotasCreditoEscritura)
                        .addGap(0, 0, 0)
                        .addComponent(radioDevolucionEscritura)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioAlmacenNoAcceso)
                    .addComponent(radioAlmacenLectura)
                    .addComponent(radioAlmacenEscritura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioMezclaNoAcceso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radioMezclaLectura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radioMezclaEscritura, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioAdminNoAcceso)
                    .addComponent(radioAdminLectura)
                    .addComponent(radioAdminEscritura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioFacturaNoAcceso)
                    .addComponent(radioFacturaLectura)
                    .addComponent(radioFacturaEscritura))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPermisos2Layout = new javax.swing.GroupLayout(PanelPermisos2);
        PanelPermisos2.setLayout(PanelPermisos2Layout);
        PanelPermisos2Layout.setHorizontalGroup(
            PanelPermisos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPermisos2Layout.createSequentialGroup()
                .addGroup(PanelPermisos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPermisos2Layout.createSequentialGroup()
                        .addGap(0, 108, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPermisos2Layout.createSequentialGroup()
                        .addGroup(PanelPermisos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpleadoPermiso2)
                            .addComponent(lblProveedorPermiso2)
                            .addComponent(lblClientePermiso2)
                            .addComponent(lblProductoPermiso2)
                            .addComponent(lblCompraPermiso2)
                            .addComponent(lblVentaPermiso2)
                            .addGroup(PanelPermisos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNotaCreditoPermiso2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDevolucionPermiso2))
                            .addGroup(PanelPermisos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelPermisos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdminPermisos1)
                                    .addComponent(lblMezclas1)
                                    .addComponent(lblFacturaPermiso))
                                .addComponent(lblAlmacenPermiso2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelPermisos2Layout.setVerticalGroup(
            PanelPermisos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPermisos2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblClientePermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmpleadoPermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProveedorPermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductoPermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCompraPermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVentaPermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNotaCreditoPermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDevolucionPermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlmacenPermiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMezclas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdminPermisos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFacturaPermiso)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPermisos2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        rbModificarPermisos.setBackground(new java.awt.Color(255, 255, 255));
        rbModificarPermisos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbModificarPermisos.setForeground(new java.awt.Color(0, 0, 102));
        rbModificarPermisos.setText("EDITAR PERMISOS");
        rbModificarPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbModificarPermisosActionPerformed(evt);
            }
        });

        PanelDatosUsuario.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDatosUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreUsuario.setText("Nombre Usuario");
        PanelDatosUsuario.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 102));
        lblPassword.setText("Password");
        PanelDatosUsuario.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblConfirmarPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblConfirmarPassword.setForeground(new java.awt.Color(0, 0, 102));
        lblConfirmarPassword.setText("Confirmar pass");
        PanelDatosUsuario.add(lblConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtNombreUsuario.setEnabled(false);
        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyTyped(evt);
            }
        });
        PanelDatosUsuario.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 31, 151, -1));

        txtPassword.setEnabled(false);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        PanelDatosUsuario.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 56, 151, -1));

        txtConfirmarPassword.setEnabled(false);
        PanelDatosUsuario.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 81, 151, -1));

        btnCancelarEmpleado.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEmpleado.setText("Regresar");
        btnCancelarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmpleadoActionPerformed(evt);
            }
        });

        btnGuardarCambiosEmpleado.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardarCambiosEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarCambiosEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambiosEmpleado.setText("Guardar Cambios");
        btnGuardarCambiosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDatosContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PanelLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbModificarPermisos, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(PanelDatosUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelarEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardarCambiosEmpleado)
                                .addGap(22, 22, 22)))
                        .addComponent(PanelPermisos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPermisos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbModificarPermisos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarEmpleado)
                            .addComponent(btnGuardarCambiosEmpleado))))
                .addGap(5, 5, 5))
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

    private void txtRfcEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcEmpleadoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtIdEmpleado.setText(fila.get(0).toString());  //obteniendo datos de empleado
        DateChooserFechaRegEmpleado.setDate((Date) fila.get(1));
        txtNombreEmpleado.setText(fila.get(2).toString());
        txtRfcEmpleado.setText(fila.get(3).toString());
        txtCurpEmpleado.setText(fila.get(4).toString());
        txtNssEmpleado.setText(fila.get(5).toString());
        txtDireccionEmpleado.setText(fila.get(6).toString());
        txtCorreoEmpleado.setText(fila.get(7).toString());
        txtTelefonoEmpleado.setText(fila.get(8).toString());
        comboDeptoEmpleado.setSelectedItem(fila.get(9).toString());
        comboStatusEmpleado.setSelectedItem(fila.get(10).toString());
        obtenerPermisos();
        if (txtNombreUsuario.getText().isEmpty()) {
                sinUsuario = true;
            }
    }//GEN-LAST:event_formInternalFrameOpened

    public void obtenerPermisos () {
        try {
            int dig = Integer.parseInt(txtIdEmpleado.getText());
            if (permisos.existePermiso(dig)) {
                
                String userr = permisos.obtenerUser(dig);
                txtNombreUsuario.setText(userr);
                int[] perm = permisos.consultarPermisos(dig); // obteniendo permisos de empleado
                //Proveedor
                if (perm[0]==0) {
                    radioProveedorNoAcceso.setSelected(true);
                }
                if (perm[0]==1) {
                    radioProveedorLectura.setSelected(true);
                }
                if (perm[0]==2) {
                    radioProveedorEscritura.setSelected(true);
                }
                //Producto
                if (perm[1]==0) {
                    radioProductoNoAcceso.setSelected(true);
                }
                if (perm[1]==1) {
                    radioProductoLectura.setSelected(true);
                }
                if (perm[1]==2) {
                    radioProductoEscritura.setSelected(true);
                }
                //Nota Credito
                if (perm[2]==0) {
                    radioNotasCreditoNoAcceso.setSelected(true);
                }
                if (perm[2]==1) {
                    radioNotasCreditoLectura.setSelected(true);
                }
                if (perm[2]==2) {
                    radioNotasCreditoEscritura.setSelected(true);
                }
                //Empleado
                if (perm[3]==0) {
                    radioEmpleadoNoAcceso.setSelected(true);
                }
                if (perm[3]==1) {
                    radioEmpleadoLectura.setSelected(true);
                }
                if (perm[3]==2) {
                    radioEmpleadoEscritura.setSelected(true);
                }
                //Devolucion
                if (perm[4]==0) {
                    radioDevolucionNoAcceso.setSelected(true);
                }
                if (perm[4]==1) {
                    radioDevolucionLectura.setSelected(true);
                }
                if (perm[4]==2) {
                    radioDevolucionEscritura.setSelected(true);
                }           
                //Cliente
                if (perm[5]==0) {
                    radioClienteNoAcceso.setSelected(true);
                }
                if (perm[5]==1) {
                    radioClienteLectura.setSelected(true);
                }
                if (perm[5]==2) {
                    radioClienteEscritura.setSelected(true);
                }
                //Almacen
                if (perm[6]==0) {
                    radioAlmacenNoAcceso.setSelected(true);
                }
                if (perm[6]==1) {
                    radioAlmacenLectura.setSelected(true);
                }
                if (perm[6]==2) {
                    radioAlmacenEscritura.setSelected(true);
                }
                //Permisos
                if (perm[7]==0) {
                    radioAdminNoAcceso.setSelected(true);
                }
                if (perm[7]==1) {
                    radioAdminLectura.setSelected(true);
                }
                if (perm[7]==2) {
                    radioAdminEscritura.setSelected(true);
                }
                //Compra
                if (perm[8]==0) {
                    radioCompraNoAcceso.setSelected(true);
                }
                if (perm[8]==1) {
                    radioCompraLectura.setSelected(true);
                }
                if (perm[8]==2) {
                    radioCompraEscritura.setSelected(true);
                }
                //Venta
                if (perm[9]==0) {
                    radioVentaNoAcceso.setSelected(true);
                }
                if (perm[9]==1) {
                    radioVentaLectura.setSelected(true);
                }
                if (perm[9]==2) {
                    radioVentaEscritura.setSelected(true);
                }
                //Mezcla
                if (perm[10]==0) {
                    radioMezclaNoAcceso.setSelected(true);
                }
                if (perm[10]==1) {
                    radioMezclaLectura.setSelected(true);
                }
                if (perm[10]==2) {
                    radioMezclaEscritura.setSelected(true);
                }
                //Factura
                if (perm[11]==0) {
                    radioFacturaNoAcceso.setSelected(true);
                }
                if (perm[11]==1) {
                    radioFacturaLectura.setSelected(true);
                }
                if (perm[11]==2) {
                    radioFacturaEscritura.setSelected(true);
                }
                
                
            }
        }catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Excepxión, obtener permisos");
        }
    }
    
    private void rbModificarPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbModificarPermisosActionPerformed
        modificarPermisosUsuario();        
    }//GEN-LAST:event_rbModificarPermisosActionPerformed

    private void txtTelefonoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEmpleadoActionPerformed

    private void txtNssEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNssEmpleadoKeyTyped
        char c = evt.getKeyChar();
        String nss = txtNssEmpleado.getText(); 
        
        if(nss.length()>10){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); }
    }//GEN-LAST:event_txtNssEmpleadoKeyTyped

    private void txtNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyTyped
        char c=evt.getKeyChar(); 
        String nombre = txtNombreEmpleado.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (nombre.length()>50) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreEmpleadoKeyTyped

    private void txtTelefonoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoKeyTyped
        char c = evt.getKeyChar();
        String telefono = txtTelefonoEmpleado.getText();
        
        if(telefono.length()>12){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }
        
    }//GEN-LAST:event_txtTelefonoEmpleadoKeyTyped

    private void btnGuardarCambiosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosEmpleadoActionPerformed
        //validar correo 
        //empleado.validarCorreo(title);
        
        
        if (userName==true) { // true si le da clik a radio button 
            permisos.setUsuario(txtNombreUsuario.getText());
                if (camposCompletos()) {
                    if (veriPass(txtPassword,txtConfirmarPassword)) {
                        try {
                            empleado.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
                            empleado.setNombre(txtNombreEmpleado.getText());
                            empleado.setRfc(txtRfcEmpleado.getText());
                            empleado.setCurp(txtCurpEmpleado.getText());
                            empleado.setNss(txtNssEmpleado.getText());
                            empleado.setDepartamento(String.valueOf(comboDeptoEmpleado.getSelectedItem()));
                            empleado.setStatus(String.valueOf(comboStatusEmpleado.getSelectedItem()));
                            empleado.setTelefono(txtTelefonoEmpleado.getText());
                            empleado.setDireccion(txtDireccionEmpleado.getText());
                            empleado.setCorreo(txtCorreoEmpleado.getText());
                            permisos.setIdEmp(Integer.parseInt(txtIdEmpleado.getText()));;
                            permisos.setContrasena(String.valueOf(txtPassword.getPassword()));
                            generarPermisos();
                            if (sinUsuario) { // si flag es true (sin usuario) se registra permiso, sino solo se actualiza
                            permisos.registrarPermisos();
                            }else {
                            permisos.actualizarPermisos();
                            }
                            empleado.modificarEmpleado();
                            JOptionPane.showMessageDialog(null,"Registro actualizado correctamente");
                            ll.agregarAccion(date.toString(),"Modificacion de Empleado");
                            this.dispose();
                        }catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getStackTrace());
                        }
                    }
                }
        }
        if (userName==false) {
                if (camposCompletos()) {
                        try {
                            empleado.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
                            empleado.setFechaReg(convertJavaDateToSqlDate(DateChooserFechaRegEmpleado.getDate()));
                            empleado.setNombre(txtNombreEmpleado.getText());
                            empleado.setRfc(txtRfcEmpleado.getText());
                            empleado.setCurp(txtCurpEmpleado.getText());
                            empleado.setNss(txtNssEmpleado.getText());
                            empleado.setDireccion(txtDireccionEmpleado.getText());
                            empleado.setCorreo(txtCorreoEmpleado.getText());
                            empleado.setTelefono(txtTelefonoEmpleado.getText());
                            empleado.setDepartamento(String.valueOf(comboDeptoEmpleado.getSelectedItem()));
                            empleado.setStatus(String.valueOf(comboStatusEmpleado.getSelectedItem()));
                            empleado.modificarEmpleado();
                            JOptionPane.showMessageDialog(null,"Registro actualizado correctamente");
                            this.dispose();
                        }catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getStackTrace());
                        }   
                }
        } 
    }//GEN-LAST:event_btnGuardarCambiosEmpleadoActionPerformed

    private void btnCancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmpleadoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarEmpleadoActionPerformed

    private void txtCorreoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEmpleadoKeyTyped
        String correo = txtCorreoEmpleado.getText();
        if (correo.length()>30) {
            evt.consume();
            getToolkit().beep();
        }  
    }//GEN-LAST:event_txtCorreoEmpleadoKeyTyped

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void txtRfcEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcEmpleadoKeyTyped
        String rfc = txtRfcEmpleado.getText(); 
        
        if (rfc.length()>13) {
            evt.consume();
            getToolkit().beep();
        }

    }//GEN-LAST:event_txtRfcEmpleadoKeyTyped

    private void txtCurpEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpEmpleadoKeyTyped
        String curp = txtCurpEmpleado.getText();
        if (curp.length()>18) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCurpEmpleadoKeyTyped

    private void txtDireccionEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionEmpleadoKeyTyped
        String direccion = txtDireccionEmpleado.getText();
        
        if (direccion.length()>50) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtDireccionEmpleadoKeyTyped

    private void txtNombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyTyped
        String user = txtNombreUsuario.getText();
        
        if(user.length()>9){
            evt.consume();
            getToolkit().beep();
        } 
    }//GEN-LAST:event_txtNombreUsuarioKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyTyped

    
    public boolean camposCompletos () {
        if (comboDeptoEmpleado.getSelectedIndex()!=-1 && 
                comboStatusEmpleado.getSelectedIndex()!=-1 && !txtNombreEmpleado.getText().isEmpty() && 
                !txtRfcEmpleado.getText().isEmpty() && !txtCurpEmpleado.getText().isEmpty() && 
                !txtNssEmpleado.getText().isEmpty()) {
           return true;
        }else {
           JOptionPane.showMessageDialog(this, "Debes llenar todos los campos");
           return false;
        }
    }

    public void generarPermisos() {
        permisos.setIdEmp(Integer.parseInt(txtIdEmpleado.getText()));
        if (radioClienteNoAcceso.isSelected()==true) { // PERMISOS CLIENTE
            permisos.setCliente(0);
        }
        if (radioClienteLectura.isSelected()==true) {
            permisos.setCliente(1);
        }
        if (radioClienteEscritura.isSelected()==true) {
            permisos.setCliente(2);
        }
        if (radioEmpleadoNoAcceso.isSelected()==true) { // PERMISOS EMPLEADO
            permisos.setEmpleado(0);
        }
        if (radioEmpleadoLectura.isSelected()==true) {
            permisos.setEmpleado(1);
        }
        if (radioEmpleadoEscritura.isSelected()==true) {
            permisos.setEmpleado(2);
        }
        if (radioProveedorNoAcceso.isSelected()==true) {    // PERMISOS PROVEEDOR
            permisos.setProveedor(0);
        }
        if (radioProveedorLectura.isSelected()==true) {
            permisos.setProveedor(1);
        }
        if (radioProveedorEscritura.isSelected()==true) {
            permisos.setProveedor(2);
        }               
        if (radioProductoNoAcceso.isSelected()==true) { // PERMISOS PRODUCTO
            permisos.setProducto(0);
        }
        if (radioProductoLectura.isSelected()==true) {
            permisos.setProducto(1);
        }
        if (radioProductoEscritura.isSelected()==true) {
            permisos.setProducto(2);
        }        
        if (radioCompraNoAcceso.isSelected()==true) {   // PERMISOS COMPRA
            permisos.setCompra(0);
        }
        if (radioCompraLectura.isSelected()==true) {
            permisos.setCompra(1);
        }
        if (radioCompraEscritura.isSelected()==true) {
            permisos.setCompra(2);
        }        
        if (radioVentaNoAcceso.isSelected()==true) {    // PERMISOS VENTA
            permisos.setVenta(0);
        }
        if (radioVentaLectura.isSelected()==true) {
            permisos.setVenta(1);
        }
        if (radioVentaEscritura.isSelected()==true) {
            permisos.setVenta(2);
        }                
        if (radioNotasCreditoNoAcceso.isSelected()==true) { // PERMISOS NOTA DE CREDITO
            permisos.setNotaCredito(0);
        }
        if (radioNotasCreditoLectura.isSelected()==true) {
            permisos.setNotaCredito(1);
        }
        if (radioNotasCreditoEscritura.isSelected()==true) {
            permisos.setNotaCredito(2);
        }
                
        if (radioDevolucionNoAcceso.isSelected()==true) {   // PERMISOS DEVOLUCION
            permisos.setDevolucion(0);
        }
        if (radioDevolucionLectura.isSelected()==true) {
            permisos.setDevolucion(1);
        }
        if (radioDevolucionEscritura.isSelected()==true) {
            permisos.setDevolucion(2);
        }
                
        if (radioAlmacenNoAcceso.isSelected()==true) {  // PERMISOS ALMACEN
            permisos.setAlmacen(0);
        }
        if (radioAlmacenLectura.isSelected()==true) {
            permisos.setAlmacen(1);
        }
        if (radioAlmacenEscritura.isSelected()==true) {
            permisos.setAlmacen(2);
        }        
        if (radioMezclaNoAcceso.isSelected()==true) {  // PERMISOS MEZCLAS
            permisos.setMezcla(0);
        }
        if (radioMezclaLectura.isSelected()==true) {
            permisos.setMezcla(1);
        }
        if (radioMezclaEscritura.isSelected()==true) {
            permisos.setMezcla(2);
        }
        if (radioAdminNoAcceso.isSelected()==true) { // PERMISOS ADMYN
            permisos.setPermisos(0);
        }
        if (radioAdminLectura.isSelected()==true) {
            permisos.setPermisos(1);
        }
        if (radioAdminEscritura.isSelected()==true) {
            permisos.setPermisos(2);
        }
        if (radioFacturaNoAcceso.isSelected()==true) { // PERMISOS factura
            permisos.setFactura(0);
        }
        if (radioFacturaLectura.isSelected()==true) {
            permisos.setFactura(1);
        }
        if (radioFacturaEscritura.isSelected()==true) {
            permisos.setFactura(2);
        }
    }
    
  
    
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    public void cargarPermisosPorDefecto () {
        radioClienteEscritura.setSelected(true);
        radioEmpleadoEscritura.setSelected(true);
        radioProveedorEscritura.setSelected(true);
        radioProductoEscritura.setSelected(true);
        radioCompraEscritura.setSelected(true);
        radioVentaEscritura.setSelected(true);
        radioNotasCreditoEscritura.setSelected(true);
        radioDevolucionEscritura.setSelected(true);
        radioAlmacenEscritura.setSelected(true);
        radioMezclaEscritura.setSelected(true);
        radioAdminNoAcceso.setSelected(true);
        radioFacturaLectura.setSelected(true);
    }
    
        public void borrarPermisos () {
        btnGroupClientePermisos.clearSelection();
        btnGroupEmpleadoPermiso.clearSelection();
        btnGroupProveedorPermiso.clearSelection();
        btnGroupProductoPermiso.clearSelection();
        btnGroupCompraPermiso.clearSelection();
        btnGroupVentaPermiso.clearSelection();
        btnGroupNotasCreditoPermiso.clearSelection();
        btnGroupDevolucionPermiso.clearSelection();
        btnGroupAlmacenPermiso.clearSelection();
        btnGroupMezclaPermiso.clearSelection();
        btnGroupAdminPermiso.clearSelection();
        btnGroupFacturaPermiso.clearSelection();
    }
        
    public void modificarPermisosUsuario () {
        if (rbModificarPermisos.isSelected()) {
            obtenerPermisos();
            userName = true;            
            txtNombreUsuario.setEnabled(true);
            txtPassword.setEnabled(true);
            txtConfirmarPassword.setEnabled(true);
            radioClienteNoAcceso.setEnabled(true);
            radioClienteLectura.setEnabled(true);
            radioClienteEscritura.setEnabled(true);
            radioEmpleadoNoAcceso.setEnabled(true);
            radioEmpleadoLectura.setEnabled(true);
            radioEmpleadoEscritura.setEnabled(true);
            radioProveedorNoAcceso.setEnabled(true);
            radioProveedorLectura.setEnabled(true);
            radioProveedorEscritura.setEnabled(true);
            radioProductoNoAcceso.setEnabled(true);
            radioProductoLectura.setEnabled(true);
            radioProductoEscritura.setEnabled(true);
            radioCompraNoAcceso.setEnabled(true);
            radioCompraLectura.setEnabled(true);
            radioCompraEscritura.setEnabled(true);
            radioVentaNoAcceso.setEnabled(true);
            radioVentaLectura.setEnabled(true);
            radioVentaEscritura.setEnabled(true);
            radioNotasCreditoNoAcceso.setEnabled(true);
            radioNotasCreditoLectura.setEnabled(true);
            radioNotasCreditoEscritura.setEnabled(true);
            radioDevolucionNoAcceso.setEnabled(true);
            radioDevolucionLectura.setEnabled(true);
            radioDevolucionEscritura.setEnabled(true);
            radioAlmacenNoAcceso.setEnabled(true);
            radioAlmacenLectura.setEnabled(true);
            radioAlmacenEscritura.setEnabled(true);
            radioMezclaNoAcceso.setEnabled(true);
            radioMezclaLectura.setEnabled(true);
            radioMezclaEscritura.setEnabled(true);
            radioAdminNoAcceso.setEnabled(true);
            radioAdminLectura.setEnabled(true);
            radioAdminEscritura.setEnabled(true);
            radioFacturaNoAcceso.setEnabled(true);
            radioFacturaLectura.setEnabled(true);
            radioFacturaEscritura.setEnabled(true);
        }
        else {
            userName = false;
            obtenerPermisos();
            if (sinUsuario) {
                txtNombreUsuario.setText(null);
                borrarPermisos();
            }
            txtNombreUsuario.setEnabled(false);
            txtPassword.setEnabled(false);
            txtConfirmarPassword.setEnabled(false);
            radioClienteNoAcceso.setEnabled(false);
            radioClienteLectura.setEnabled(false);
            radioClienteEscritura.setEnabled(false);
            radioEmpleadoNoAcceso.setEnabled(false);
            radioEmpleadoLectura.setEnabled(false);
            radioEmpleadoEscritura.setEnabled(false);
            radioProveedorNoAcceso.setEnabled(false);
            radioProveedorLectura.setEnabled(false);
            radioProveedorEscritura.setEnabled(false);
            radioProductoNoAcceso.setEnabled(false);
            radioProductoLectura.setEnabled(false);
            radioProductoEscritura.setEnabled(false);
            radioCompraNoAcceso.setEnabled(false);
            radioCompraLectura.setEnabled(false);
            radioCompraEscritura.setEnabled(false);
            radioVentaNoAcceso.setEnabled(false);
            radioVentaLectura.setEnabled(false);
            radioVentaEscritura.setEnabled(false);
            radioNotasCreditoNoAcceso.setEnabled(false);
            radioNotasCreditoLectura.setEnabled(false);
            radioNotasCreditoEscritura.setEnabled(false);
            radioDevolucionNoAcceso.setEnabled(false);
            radioDevolucionLectura.setEnabled(false);
            radioDevolucionEscritura.setEnabled(false);
            radioAlmacenNoAcceso.setEnabled(false);
            radioAlmacenLectura.setEnabled(false);
            radioAlmacenEscritura.setEnabled(false);
            radioMezclaNoAcceso.setEnabled(false);
            radioMezclaLectura.setEnabled(false);
            radioMezclaEscritura.setEnabled(false);
            radioAdminNoAcceso.setEnabled(false);
            radioAdminLectura.setEnabled(false);
            radioAdminEscritura.setEnabled(false);
            radioFacturaNoAcceso.setEnabled(false);
            radioFacturaLectura.setEnabled(false);
            radioFacturaEscritura.setEnabled(false);
        }
    } 
    
    public boolean veriPass(JPasswordField p1, JPasswordField p2){
        boolean veri=false;
        if(p1.getPassword().length>=8){
            if(p1.getText().equals(p2.getText())){
                veri=true;
            } else {
                JOptionPane.showMessageDialog(this, "Las contraseñas que ingresaste no coinciden","Contraseña",JOptionPane.ERROR_MESSAGE);
                    p1.requestFocus();
                    p1.selectAll();
                veri=false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña debe ser mínimo de 8 caracteres", "Contraseña",JOptionPane.INFORMATION_MESSAGE);
            txtPassword.requestFocus();
                p1.requestFocus();
                p1.selectAll();
            veri=false;
        }
        return veri;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserFechaRegEmpleado;
    private javax.swing.JPanel PanelDatosContacto;
    private javax.swing.JPanel PanelDatosUsuario;
    private javax.swing.JPanel PanelFecha;
    private javax.swing.JPanel PanelLaboral;
    private javax.swing.JPanel PanelPermisos2;
    private javax.swing.JButton btnCancelarEmpleado;
    private javax.swing.ButtonGroup btnGroupAdminPermiso;
    private javax.swing.ButtonGroup btnGroupAlmacenPermiso;
    private javax.swing.ButtonGroup btnGroupClientePermisos;
    private javax.swing.ButtonGroup btnGroupCompraPermiso;
    private javax.swing.ButtonGroup btnGroupDevolucionPermiso;
    private javax.swing.ButtonGroup btnGroupEmpleadoPermiso;
    private javax.swing.ButtonGroup btnGroupFacturaPermiso;
    private javax.swing.ButtonGroup btnGroupMezclaPermiso;
    private javax.swing.ButtonGroup btnGroupNotasCreditoPermiso;
    private javax.swing.ButtonGroup btnGroupProductoPermiso;
    private javax.swing.ButtonGroup btnGroupProveedorPermiso;
    private javax.swing.ButtonGroup btnGroupVentaPermiso;
    private javax.swing.JButton btnGuardarCambiosEmpleado;
    private javax.swing.JComboBox<String> comboDeptoEmpleado;
    private javax.swing.JComboBox<String> comboStatusEmpleado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAdminPermisos1;
    private javax.swing.JLabel lblAlmacenPermiso2;
    private javax.swing.JLabel lblClientePermiso2;
    private javax.swing.JLabel lblCompraPermiso2;
    private javax.swing.JLabel lblConfirmarPassword;
    private javax.swing.JLabel lblCorreoEmpleado;
    private javax.swing.JLabel lblCurpEmpleado;
    private javax.swing.JLabel lblDepartamentoEmpleado;
    private javax.swing.JLabel lblDevolucionPermiso2;
    private javax.swing.JLabel lblDireccionEmpleado;
    private javax.swing.JLabel lblEmpleadoPermiso2;
    private javax.swing.JLabel lblEscritura2;
    private javax.swing.JLabel lblFacturaPermiso;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblLectura2;
    private javax.swing.JLabel lblMezclas1;
    private javax.swing.JLabel lblNoAccesso2;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNotaCreditoPermiso2;
    private javax.swing.JLabel lblNssEmpleado;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProductoPermiso2;
    private javax.swing.JLabel lblProveedorPermiso2;
    private javax.swing.JLabel lblRfcEmpleado;
    private javax.swing.JLabel lblStatusEmpleado;
    private javax.swing.JLabel lblTelefonoEmpleado;
    private javax.swing.JLabel lblVentaPermiso2;
    private javax.swing.JRadioButton radioAdminEscritura;
    private javax.swing.JRadioButton radioAdminLectura;
    private javax.swing.JRadioButton radioAdminNoAcceso;
    private javax.swing.JRadioButton radioAlmacenEscritura;
    private javax.swing.JRadioButton radioAlmacenLectura;
    private javax.swing.JRadioButton radioAlmacenNoAcceso;
    private javax.swing.JRadioButton radioClienteEscritura;
    private javax.swing.JRadioButton radioClienteLectura;
    private javax.swing.JRadioButton radioClienteNoAcceso;
    private javax.swing.JRadioButton radioCompraEscritura;
    private javax.swing.JRadioButton radioCompraLectura;
    private javax.swing.JRadioButton radioCompraNoAcceso;
    private javax.swing.JRadioButton radioDevolucionEscritura;
    private javax.swing.JRadioButton radioDevolucionLectura;
    private javax.swing.JRadioButton radioDevolucionNoAcceso;
    private javax.swing.JRadioButton radioEmpleadoEscritura;
    private javax.swing.JRadioButton radioEmpleadoLectura;
    private javax.swing.JRadioButton radioEmpleadoNoAcceso;
    private javax.swing.JRadioButton radioFacturaEscritura;
    private javax.swing.JRadioButton radioFacturaLectura;
    private javax.swing.JRadioButton radioFacturaNoAcceso;
    private javax.swing.JRadioButton radioMezclaEscritura;
    private javax.swing.JRadioButton radioMezclaLectura;
    private javax.swing.JRadioButton radioMezclaNoAcceso;
    private javax.swing.JRadioButton radioNotasCreditoEscritura;
    private javax.swing.JRadioButton radioNotasCreditoLectura;
    private javax.swing.JRadioButton radioNotasCreditoNoAcceso;
    private javax.swing.JRadioButton radioProductoEscritura;
    private javax.swing.JRadioButton radioProductoLectura;
    private javax.swing.JRadioButton radioProductoNoAcceso;
    private javax.swing.JRadioButton radioProveedorEscritura;
    private javax.swing.JRadioButton radioProveedorLectura;
    private javax.swing.JRadioButton radioProveedorNoAcceso;
    private javax.swing.JRadioButton radioVentaEscritura;
    private javax.swing.JRadioButton radioVentaLectura;
    private javax.swing.JRadioButton radioVentaNoAcceso;
    private javax.swing.JRadioButton rbModificarPermisos;
    private javax.swing.JPasswordField txtConfirmarPassword;
    private javax.swing.JTextField txtCorreoEmpleado;
    private javax.swing.JTextField txtCurpEmpleado;
    private javax.swing.JTextField txtDireccionEmpleado;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNssEmpleado;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRfcEmpleado;
    private javax.swing.JTextField txtTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}

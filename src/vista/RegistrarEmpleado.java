package vista;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import modelo.*;

public class RegistrarEmpleado extends javax.swing.JInternalFrame {

    Empleado empleado;
    Permisos permisos;
    boolean userName = false;
    
    Log ll = new Log();
    Date date = new Date ();

 
    public RegistrarEmpleado(Permisos permisos, Empleado empleado) {
        this.permisos = permisos;
        this.empleado = empleado;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoClientePermisos = new javax.swing.ButtonGroup();
        btnGrupoEmpleadoPermiso = new javax.swing.ButtonGroup();
        btnGrupoProveedorPermiso = new javax.swing.ButtonGroup();
        btnGrupoProductoPermiso = new javax.swing.ButtonGroup();
        btnGrupoCompraPermiso = new javax.swing.ButtonGroup();
        btnGrupoVentaPermiso = new javax.swing.ButtonGroup();
        btnGrupoNotasCreditoPermiso = new javax.swing.ButtonGroup();
        btnGrupoDevolucionPermiso = new javax.swing.ButtonGroup();
        btnGrupoAlmacenPermiso = new javax.swing.ButtonGroup();
        btnGrupoAdminPermiso = new javax.swing.ButtonGroup();
        btnGrupoMezclaPermiso = new javax.swing.ButtonGroup();
        btnGrupoFacturaPermisos = new javax.swing.ButtonGroup();
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
        txtNssEmpleado = new javax.swing.JTextField();
        lblTelefonoEmpleado = new javax.swing.JLabel();
        lblDireccionEmpleado = new javax.swing.JLabel();
        txtCorreoEmpleado = new javax.swing.JTextField();
        lblCorreoEmpleado = new javax.swing.JLabel();
        txtDireccionEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        txtCurpEmpleado = new javax.swing.JTextField();
        PanelPermisos = new javax.swing.JPanel();
        lblClientePermiso = new javax.swing.JLabel();
        lblEmpleadoPermiso = new javax.swing.JLabel();
        lblProveedorPermiso = new javax.swing.JLabel();
        lblProductoPermiso = new javax.swing.JLabel();
        lblCompraPermiso = new javax.swing.JLabel();
        lblVentaPermiso = new javax.swing.JLabel();
        lblNotaCreditoPermiso = new javax.swing.JLabel();
        lblDevolucionPermiso = new javax.swing.JLabel();
        lblAlmacenPermiso = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNoAccesso = new javax.swing.JLabel();
        lblLectura = new javax.swing.JLabel();
        lblEscritura = new javax.swing.JLabel();
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
        lblAdminPermisos = new javax.swing.JLabel();
        lblMezclas = new javax.swing.JLabel();
        lblFacturaPermiso = new javax.swing.JLabel();
        PanelLaboral = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblDepartamentoEmpleado = new javax.swing.JLabel();
        comboStatusEmpleado = new javax.swing.JComboBox<String>();
        comboDeptoEmpleado = new javax.swing.JComboBox<String>();
        rbCrearUsuario = new javax.swing.JRadioButton();
        PanelDatosUsuario = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblConfirmarPassword = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmarPassword = new javax.swing.JPasswordField();
        lblPassword1 = new javax.swing.JLabel();
        lblConfirmarPassword1 = new javax.swing.JLabel();
        btnCancelarEmpleado = new javax.swing.JButton();
        btnLimpiarEmpleado = new javax.swing.JButton();
        btnRegistrarEmpleado = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Empleado");
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
                .addGap(12, 12, 12)
                .addComponent(lblIdEmpleado)
                .addGap(21, 21, 21)
                .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(lblFechaReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DateChooserFechaRegEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFechaLayout.setVerticalGroup(
            PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFechaLayout.createSequentialGroup()
                .addGroup(PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFechaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblIdEmpleado))
                    .addGroup(PanelFechaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFechaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateChooserFechaRegEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaReg))))
                .addGap(2, 2, 2))
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
        PanelDatosContacto.add(lblRfcEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 52, -1));

        lblCurpEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCurpEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblCurpEmpleado.setText("CURP");
        PanelDatosContacto.add(lblCurpEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 63, 10));

        lblNssEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNssEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblNssEmpleado.setText("NSS");
        PanelDatosContacto.add(lblNssEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 36, -1));

        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 31, 180, -1));

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
        PanelDatosContacto.add(txtRfcEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 180, -1));

        txtNssEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNssEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtNssEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, -1));

        lblTelefonoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefonoEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblTelefonoEmpleado.setText("Teléfono");
        PanelDatosContacto.add(lblTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 20));

        lblDireccionEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDireccionEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblDireccionEmpleado.setText("Dirección");
        PanelDatosContacto.add(lblDireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 10));

        txtCorreoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 200, -1));

        lblCorreoEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCorreoEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblCorreoEmpleado.setText("Correo");
        PanelDatosContacto.add(lblCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 61, -1));

        txtDireccionEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtDireccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 460, -1));

        txtTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 200, -1));

        txtCurpEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurpEmpleadoKeyTyped(evt);
            }
        });
        PanelDatosContacto.add(txtCurpEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 200, -1));

        PanelPermisos.setBackground(new java.awt.Color(255, 255, 255));
        PanelPermisos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permisos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblClientePermiso.setText("CLIENTE");

        lblEmpleadoPermiso.setText("EMPLEADO");

        lblProveedorPermiso.setText("PROVEEDOR");

        lblProductoPermiso.setText("PRODUCTO");

        lblCompraPermiso.setText("COMPRA");

        lblVentaPermiso.setText("VENTA");

        lblNotaCreditoPermiso.setText("NOTAS CRÉDITO");

        lblDevolucionPermiso.setText("DEVOLUCIÓN");

        lblAlmacenPermiso.setText("ALMACÉN");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblNoAccesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/noAccess.png"))); // NOI18N

        lblLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read.png"))); // NOI18N

        lblEscritura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/write.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblNoAccesso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblLectura)
                .addGap(20, 20, 20)
                .addComponent(lblEscritura)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoAccesso)
                    .addComponent(lblLectura)
                    .addComponent(lblEscritura))
                .addGap(0, 0, 0))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnGrupoClientePermisos.add(radioClienteNoAcceso);
        radioClienteNoAcceso.setEnabled(false);

        btnGrupoClientePermisos.add(radioClienteLectura);
        radioClienteLectura.setEnabled(false);

        btnGrupoClientePermisos.add(radioClienteEscritura);
        radioClienteEscritura.setEnabled(false);

        btnGrupoEmpleadoPermiso.add(radioEmpleadoEscritura);
        radioEmpleadoEscritura.setEnabled(false);

        btnGrupoEmpleadoPermiso.add(radioEmpleadoLectura);
        radioEmpleadoLectura.setEnabled(false);

        btnGrupoEmpleadoPermiso.add(radioEmpleadoNoAcceso);
        radioEmpleadoNoAcceso.setEnabled(false);

        btnGrupoProductoPermiso.add(radioProductoEscritura);
        radioProductoEscritura.setEnabled(false);

        btnGrupoProductoPermiso.add(radioProductoLectura);
        radioProductoLectura.setEnabled(false);

        btnGrupoProductoPermiso.add(radioProductoNoAcceso);
        radioProductoNoAcceso.setEnabled(false);

        btnGrupoProveedorPermiso.add(radioProveedorNoAcceso);
        radioProveedorNoAcceso.setEnabled(false);

        btnGrupoProveedorPermiso.add(radioProveedorLectura);
        radioProveedorLectura.setEnabled(false);

        btnGrupoProveedorPermiso.add(radioProveedorEscritura);
        radioProveedorEscritura.setEnabled(false);

        btnGrupoDevolucionPermiso.add(radioDevolucionEscritura);
        radioDevolucionEscritura.setEnabled(false);

        btnGrupoDevolucionPermiso.add(radioDevolucionLectura);
        radioDevolucionLectura.setEnabled(false);

        btnGrupoDevolucionPermiso.add(radioDevolucionNoAcceso);
        radioDevolucionNoAcceso.setEnabled(false);

        btnGrupoNotasCreditoPermiso.add(radioNotasCreditoNoAcceso);
        radioNotasCreditoNoAcceso.setEnabled(false);

        btnGrupoNotasCreditoPermiso.add(radioNotasCreditoLectura);
        radioNotasCreditoLectura.setEnabled(false);

        btnGrupoNotasCreditoPermiso.add(radioNotasCreditoEscritura);
        radioNotasCreditoEscritura.setEnabled(false);

        btnGrupoVentaPermiso.add(radioVentaEscritura);
        radioVentaEscritura.setEnabled(false);

        btnGrupoVentaPermiso.add(radioVentaLectura);
        radioVentaLectura.setEnabled(false);

        btnGrupoVentaPermiso.add(radioVentaNoAcceso);
        radioVentaNoAcceso.setEnabled(false);

        btnGrupoCompraPermiso.add(radioCompraNoAcceso);
        radioCompraNoAcceso.setEnabled(false);

        btnGrupoCompraPermiso.add(radioCompraLectura);
        radioCompraLectura.setEnabled(false);

        btnGrupoCompraPermiso.add(radioCompraEscritura);
        radioCompraEscritura.setEnabled(false);

        btnGrupoAlmacenPermiso.add(radioAlmacenEscritura);
        radioAlmacenEscritura.setEnabled(false);

        btnGrupoAlmacenPermiso.add(radioAlmacenLectura);
        radioAlmacenLectura.setEnabled(false);

        btnGrupoAlmacenPermiso.add(radioAlmacenNoAcceso);
        radioAlmacenNoAcceso.setEnabled(false);

        btnGrupoAdminPermiso.add(radioAdminLectura);
        radioAdminLectura.setEnabled(false);

        btnGrupoAdminPermiso.add(radioAdminNoAcceso);
        radioAdminNoAcceso.setEnabled(false);

        btnGrupoAdminPermiso.add(radioAdminEscritura);
        radioAdminEscritura.setEnabled(false);

        btnGrupoMezclaPermiso.add(radioMezclaNoAcceso);
        radioMezclaNoAcceso.setEnabled(false);

        btnGrupoMezclaPermiso.add(radioMezclaLectura);
        radioMezclaLectura.setEnabled(false);

        btnGrupoMezclaPermiso.add(radioMezclaEscritura);
        radioMezclaEscritura.setEnabled(false);

        btnGrupoFacturaPermisos.add(radioFacturaLectura);
        radioFacturaLectura.setEnabled(false);

        btnGrupoFacturaPermisos.add(radioFacturaEscritura);
        radioFacturaEscritura.setEnabled(false);

        btnGrupoFacturaPermisos.add(radioFacturaNoAcceso);
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

        lblAdminPermisos.setText("ADMIN");

        lblMezclas.setText("MEZCLAS");

        lblFacturaPermiso.setText("FACTURA");

        javax.swing.GroupLayout PanelPermisosLayout = new javax.swing.GroupLayout(PanelPermisos);
        PanelPermisos.setLayout(PanelPermisosLayout);
        PanelPermisosLayout.setHorizontalGroup(
            PanelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPermisosLayout.createSequentialGroup()
                .addGroup(PanelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPermisosLayout.createSequentialGroup()
                        .addGap(0, 108, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPermisosLayout.createSequentialGroup()
                        .addGroup(PanelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpleadoPermiso)
                            .addComponent(lblProveedorPermiso)
                            .addComponent(lblClientePermiso)
                            .addComponent(lblProductoPermiso)
                            .addComponent(lblCompraPermiso)
                            .addComponent(lblVentaPermiso)
                            .addGroup(PanelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNotaCreditoPermiso, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDevolucionPermiso))
                            .addGroup(PanelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdminPermisos)
                                    .addComponent(lblMezclas)
                                    .addComponent(lblFacturaPermiso))
                                .addComponent(lblAlmacenPermiso)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelPermisosLayout.setVerticalGroup(
            PanelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPermisosLayout.createSequentialGroup()
                .addGroup(PanelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPermisosLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblClientePermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmpleadoPermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProveedorPermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProductoPermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompraPermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVentaPermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNotaCreditoPermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDevolucionPermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAlmacenPermiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMezclas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdminPermisos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFacturaPermiso)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelPermisosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        PanelLaboral.setBackground(new java.awt.Color(255, 255, 255));
        PanelLaboral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Laborales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 0, 102));
        lblStatus.setText("Estatus");

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
                .addGap(12, 12, 12)
                .addGroup(PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLaboralLayout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(comboStatusEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLaboralLayout.createSequentialGroup()
                        .addComponent(lblDepartamentoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(comboDeptoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PanelLaboralLayout.setVerticalGroup(
            PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLaboralLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLaboralLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblStatus))
                    .addComponent(comboStatusEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLaboralLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblDepartamentoEmpleado))
                    .addComponent(comboDeptoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        rbCrearUsuario.setBackground(new java.awt.Color(255, 255, 255));
        rbCrearUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbCrearUsuario.setForeground(new java.awt.Color(0, 0, 102));
        rbCrearUsuario.setText("Crear Usuario");
        rbCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCrearUsuarioActionPerformed(evt);
            }
        });

        PanelDatosUsuario.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDatosUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(0, 0, 102));
        lblNombreUsuario.setText("Nombre Usuario");
        PanelDatosUsuario.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblConfirmarPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblConfirmarPassword.setForeground(new java.awt.Color(0, 0, 102));
        lblConfirmarPassword.setText("Contraseña");
        PanelDatosUsuario.add(lblConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtNombreUsuario.setEnabled(false);
        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyTyped(evt);
            }
        });
        PanelDatosUsuario.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 31, 151, -1));

        txtPassword.setEnabled(false);
        PanelDatosUsuario.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 56, 151, -1));

        txtConfirmarPassword.setEnabled(false);
        PanelDatosUsuario.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 151, -1));

        lblPassword1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPassword1.setForeground(new java.awt.Color(0, 0, 102));
        lblPassword1.setText("Contraseña");
        PanelDatosUsuario.add(lblPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblConfirmarPassword1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblConfirmarPassword1.setForeground(new java.awt.Color(0, 0, 102));
        lblConfirmarPassword1.setText("Confirmar");
        PanelDatosUsuario.add(lblConfirmarPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnCancelarEmpleado.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEmpleado.setText("Regresar");
        btnCancelarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmpleadoActionPerformed(evt);
            }
        });

        btnLimpiarEmpleado.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarEmpleado.setText("Limpiar");
        btnLimpiarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEmpleadoActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setText("Registrar");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDatosContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelarEmpleado)
                                .addGap(36, 36, 36)
                                .addComponent(btnLimpiarEmpleado)
                                .addGap(32, 32, 32)
                                .addComponent(btnRegistrarEmpleado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbCrearUsuario)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PanelLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PanelDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelDatosContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbCrearUsuario)
                        .addGap(21, 21, 21)
                        .addComponent(PanelDatosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarEmpleado)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLimpiarEmpleado)
                                .addComponent(btnRegistrarEmpleado))))
                    .addComponent(PanelPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRfcEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcEmpleadoActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        
        if (userName==true) {   // empleado con usuario
            permisos.setUsuario(txtNombreUsuario.getText());
            if (!permisos.verificarDuplicado()) {
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
                            empleado.registrarEmpleado();
                            permisos.setContrasena(String.valueOf(txtPassword.getPassword()));
                            permisos.setContrasenaBcrypt(permisos.hashPassword(String.valueOf(txtPassword.getPassword())));
                            generarPermisos();
                            permisos.registrarPermisos();
                            JOptionPane.showMessageDialog(null,"Registro Exitoso");
                            ll.agregarAccion(date.toString(),"Registro de Empleado");
                            this.dispose();
                        }catch (Exception e) {
                        }
                    }
                }
            }else {
                        JOptionPane.showMessageDialog(this, "El nombre de usuario ya existe");
                }
        }
        if (userName==false) {  // empleado sin usuario
                if (camposCompletos()) {
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
                            empleado.registrarEmpleado();
                            JOptionPane.showMessageDialog(null,"Registro Exitoso");
                            ll.agregarAccion(date.toString(),"Registro de Empleado");
                            this.dispose();
                        }catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getStackTrace());
                        }   
                }
        }
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DateChooserFechaRegEmpleado.setDate(new Date());    //al iniciar setear la fecha actual
        txtIdEmpleado.setText(String.valueOf(empleado.obtenerNoId()));    //
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void rbCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCrearUsuarioActionPerformed
        habilitarCreacionUsuario();        
    }//GEN-LAST:event_rbCrearUsuarioActionPerformed

    private void txtNssEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNssEmpleadoKeyTyped
        char c = evt.getKeyChar();
        String nss = txtNssEmpleado.getText();
        
        if(nss.length()>10){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }
    }//GEN-LAST:event_txtNssEmpleadoKeyTyped

    private void txtNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyTyped
        char c=evt.getKeyChar(); 
        String nombre = txtNombreEmpleado.getText();
        
        if(Character.isDigit(c)) { 
            getToolkit().beep(); 
            evt.consume(); 
        }
        if (nombre.length()>49) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreEmpleadoKeyTyped

    private void btnCancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmpleadoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarEmpleadoActionPerformed

    private void txtRfcEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcEmpleadoKeyTyped
        String nombre = txtRfcEmpleado.getText();
        if (nombre.length()>12) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtRfcEmpleadoKeyTyped

    private void btnLimpiarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarEmpleadoActionPerformed

    private void txtCorreoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEmpleadoKeyTyped
        String correo = txtCorreoEmpleado.getText();
        if (correo.length()>29) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCorreoEmpleadoKeyTyped

    private void txtTelefonoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoKeyTyped
            char c = evt.getKeyChar();
        String tel = txtTelefonoEmpleado.getText();
        
        if(tel.length()>11){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume(); 
            getToolkit().beep(); 
        }
    }//GEN-LAST:event_txtTelefonoEmpleadoKeyTyped

    private void txtCurpEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpEmpleadoKeyTyped
        
        String curp = txtCurpEmpleado.getText();
        
        if(curp.length()>17){
            evt.consume();
            getToolkit().beep();
        }
        
    }//GEN-LAST:event_txtCurpEmpleadoKeyTyped

    private void txtDireccionEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionEmpleadoKeyTyped
        String direccion = txtDireccionEmpleado.getText();
        
        if(direccion.length()>49){
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

    
    public boolean camposCompletos () {
        if (comboDeptoEmpleado.getSelectedIndex()!=-1 && comboStatusEmpleado.getSelectedIndex()!=-1 && 
                !txtNombreEmpleado.getText().isEmpty() && !txtRfcEmpleado.getText().isEmpty() && 
                !txtCurpEmpleado.getText().isEmpty() && !txtNssEmpleado.getText().isEmpty()) {
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
        if (radioClienteEscritura.isSelected()==true) {
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
        if (radioFacturaNoAcceso.isSelected()==true) { // PERMISOS FACTURA
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
        radioEmpleadoLectura.setSelected(true);
        radioProveedorEscritura.setSelected(true);
        radioProductoEscritura.setSelected(true);
        radioCompraEscritura.setSelected(true);
        radioVentaEscritura.setSelected(true);
        radioNotasCreditoEscritura.setSelected(true);
        radioDevolucionEscritura.setSelected(true);
        radioAlmacenEscritura.setSelected(true);
        radioAdminNoAcceso.setSelected(true);
        radioMezclaEscritura.setSelected(true);
        radioFacturaLectura.setSelected(true);
    }
    
        public void borrarPermisosPorDefecto () {
        btnGrupoClientePermisos.clearSelection();
        btnGrupoEmpleadoPermiso.clearSelection();
        btnGrupoProveedorPermiso.clearSelection();
        btnGrupoProductoPermiso.clearSelection();
        btnGrupoCompraPermiso.clearSelection();
        btnGrupoVentaPermiso.clearSelection();
        btnGrupoNotasCreditoPermiso.clearSelection();
        btnGrupoDevolucionPermiso.clearSelection();
        btnGrupoAlmacenPermiso.clearSelection();
        btnGrupoAdminPermiso.clearSelection();
        btnGrupoMezclaPermiso.clearSelection();
        btnGrupoFacturaPermisos.clearSelection();
    }
        
    public void habilitarCreacionUsuario () {
        
        if (rbCrearUsuario.isSelected()) {
            userName = true;
            cargarPermisosPorDefecto();
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
            radioAdminNoAcceso.setEnabled(true);
            radioAdminLectura.setEnabled(true);
            radioAdminEscritura.setEnabled(true);
            radioMezclaNoAcceso.setEnabled(true);
            radioMezclaLectura.setEnabled(true);
            radioMezclaEscritura.setEnabled(true);
            radioFacturaNoAcceso.setEnabled(true);
            radioFacturaLectura.setEnabled(true);
            radioFacturaEscritura.setEnabled(true);
        }
        else {
            userName = false;
            borrarPermisosPorDefecto();
            txtNombreUsuario.setText(null);
            txtPassword.setText(null);
            txtConfirmarPassword.setText(null);
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
            radioAdminNoAcceso.setEnabled(false);
            radioAdminLectura.setEnabled(false);
            radioAdminEscritura.setEnabled(false);
            radioMezclaNoAcceso.setEnabled(false);
            radioMezclaLectura.setEnabled(false);
            radioMezclaEscritura.setEnabled(false);
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
    private javax.swing.JPanel PanelPermisos;
    private javax.swing.JButton btnCancelarEmpleado;
    private javax.swing.ButtonGroup btnGrupoAdminPermiso;
    private javax.swing.ButtonGroup btnGrupoAlmacenPermiso;
    private javax.swing.ButtonGroup btnGrupoClientePermisos;
    private javax.swing.ButtonGroup btnGrupoCompraPermiso;
    private javax.swing.ButtonGroup btnGrupoDevolucionPermiso;
    private javax.swing.ButtonGroup btnGrupoEmpleadoPermiso;
    private javax.swing.ButtonGroup btnGrupoFacturaPermisos;
    private javax.swing.ButtonGroup btnGrupoMezclaPermiso;
    private javax.swing.ButtonGroup btnGrupoNotasCreditoPermiso;
    private javax.swing.ButtonGroup btnGrupoProductoPermiso;
    private javax.swing.ButtonGroup btnGrupoProveedorPermiso;
    private javax.swing.ButtonGroup btnGrupoVentaPermiso;
    private javax.swing.JButton btnLimpiarEmpleado;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JComboBox<String> comboDeptoEmpleado;
    private javax.swing.JComboBox<String> comboStatusEmpleado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAdminPermisos;
    private javax.swing.JLabel lblAlmacenPermiso;
    private javax.swing.JLabel lblClientePermiso;
    private javax.swing.JLabel lblCompraPermiso;
    private javax.swing.JLabel lblConfirmarPassword;
    private javax.swing.JLabel lblConfirmarPassword1;
    private javax.swing.JLabel lblCorreoEmpleado;
    private javax.swing.JLabel lblCurpEmpleado;
    private javax.swing.JLabel lblDepartamentoEmpleado;
    private javax.swing.JLabel lblDevolucionPermiso;
    private javax.swing.JLabel lblDireccionEmpleado;
    private javax.swing.JLabel lblEmpleadoPermiso;
    private javax.swing.JLabel lblEscritura;
    private javax.swing.JLabel lblFacturaPermiso;
    private javax.swing.JLabel lblFechaReg;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblLectura;
    private javax.swing.JLabel lblMezclas;
    private javax.swing.JLabel lblNoAccesso;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNotaCreditoPermiso;
    private javax.swing.JLabel lblNssEmpleado;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblProductoPermiso;
    private javax.swing.JLabel lblProveedorPermiso;
    private javax.swing.JLabel lblRfcEmpleado;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelefonoEmpleado;
    private javax.swing.JLabel lblVentaPermiso;
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
    private javax.swing.JRadioButton rbCrearUsuario;
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

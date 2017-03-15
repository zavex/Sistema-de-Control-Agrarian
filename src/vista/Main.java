package vista;

import modelo.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletOutputStream;
import modelo.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class Main extends javax.swing.JFrame {
    Conexion conexion = new Conexion ();
    Proveedor proveedor = new Proveedor (conexion);
    Empleado empleado = new Empleado (conexion);
    Cliente cliente = new Cliente (conexion);
    Producto producto = new Producto (conexion);
    Almacen almacen = new Almacen (conexion);
    Devolucion devolucion = new Devolucion (conexion);
    Venta venta = new Venta (conexion);
    Compra compra = new Compra (conexion);
    Factura factura = new Factura (conexion);
    NotaCredito notaCredito = new NotaCredito (conexion);
    Permisos permiso = new Permisos (conexion);
    Formula formula = new Formula (conexion);
    VentaProducto ventaProducto = new VentaProducto (conexion);
    AlmacenProducto almacenProducto = new AlmacenProducto (conexion); 
    CompraProducto compraProducto = new CompraProducto (conexion);
    DevolucionProducto devolucionProducto = new DevolucionProducto (conexion); 
    String Usuario;
    String idEmp;
    Log ll = new Log();
    Date date = new Date ();
    String usuarioActual;
    
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaLogin = new javax.swing.JDialog();
        PanelLogo = new javax.swing.JPanel();
        PanelAcceso = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        lblUsuario1 = new javax.swing.JLabel();
        textoPassword = new javax.swing.JPasswordField();
        buttonSalir = new javax.swing.JButton();
        ButtonEntrar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JDesktopPane();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAccesoRapidoRealizarMezcla = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAccesoRapidoVerClientes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAccesoRapidoVerProductos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblBienvenido = new javax.swing.JLabel();
        lblUsuarioActivo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuRegistro = new javax.swing.JMenu();
        SubmenuCliente = new javax.swing.JMenu();
        ItemCapturarCliente = new javax.swing.JMenuItem();
        ItemConsultarCliente = new javax.swing.JMenuItem();
        SubmenuProveedor = new javax.swing.JMenu();
        ItemCapturarProveedor = new javax.swing.JMenuItem();
        ItemConsultarProveedor = new javax.swing.JMenuItem();
        SubmenuProductos = new javax.swing.JMenu();
        ItemCapturarProducto = new javax.swing.JMenuItem();
        ItemConsultarProducto = new javax.swing.JMenuItem();
        SubmenuEmpleados = new javax.swing.JMenu();
        ItemCapturarEmpleado = new javax.swing.JMenuItem();
        ItemConsultarEmpleado = new javax.swing.JMenuItem();
        MenuMovimiento = new javax.swing.JMenu();
        SubmenuVenta = new javax.swing.JMenu();
        ItemGenerarVenta = new javax.swing.JMenuItem();
        ItemConsultarVenta = new javax.swing.JMenuItem();
        SubmenuCompra = new javax.swing.JMenu();
        ItemGenerarCompra = new javax.swing.JMenuItem();
        ItemConsultarCompra = new javax.swing.JMenuItem();
        SubmenuNotaCredito = new javax.swing.JMenu();
        ItemGenerarNotaCredito = new javax.swing.JMenuItem();
        ItemConsultarNotaCredito = new javax.swing.JMenuItem();
        SubmenuDevolucion = new javax.swing.JMenu();
        ItemGenerarDevolucion = new javax.swing.JMenuItem();
        ItemConsultarDevolucion = new javax.swing.JMenuItem();
        MenuAlmacenes = new javax.swing.JMenu();
        ItemAgregarAlmacen = new javax.swing.JMenuItem();
        ItemConsultarAlmacen = new javax.swing.JMenuItem();
        MenuMezclas = new javax.swing.JMenu();
        ItemRealizarMezclas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        ItemAyuda = new javax.swing.JMenuItem();

        VentanaLogin.setTitle("ACCESO AL SISTEMA");
        VentanaLogin.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                VentanaLoginWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                VentanaLoginWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblUsuario.setText("Usuario");

        lblUsuario1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblUsuario1.setText("Contraseña");

        textoPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPasswordActionPerformed(evt);
            }
        });

        buttonSalir.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        buttonSalir.setText("SALIR");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        ButtonEntrar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ButtonEntrar.setText("ENTRAR");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 0, 0));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelAccesoLayout = new javax.swing.GroupLayout(PanelAcceso);
        PanelAcceso.setLayout(PanelAccesoLayout);
        PanelAccesoLayout.setHorizontalGroup(
            PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAccesoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAccesoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAccesoLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(buttonSalir)
                                .addGap(49, 49, 49)
                                .addComponent(ButtonEntrar))
                            .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAccesoLayout.createSequentialGroup()
                                    .addComponent(lblUsuario1)
                                    .addGap(8, 8, 8)
                                    .addComponent(textoPassword))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAccesoLayout.createSequentialGroup()
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        PanelAccesoLayout.setVerticalGroup(
            PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAccesoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textoUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalir)
                    .addComponent(ButtonEntrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Agrarian - copia.jpg"))); // NOI18N

        javax.swing.GroupLayout VentanaLoginLayout = new javax.swing.GroupLayout(VentanaLogin.getContentPane());
        VentanaLogin.getContentPane().setLayout(VentanaLoginLayout);
        VentanaLoginLayout.setHorizontalGroup(
            VentanaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaLoginLayout.createSequentialGroup()
                .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(PanelAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VentanaLoginLayout.setVerticalGroup(
            VentanaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaLoginLayout.createSequentialGroup()
                .addGroup(VentanaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaLoginLayout.createSequentialGroup()
                        .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL AGRARIAN S.A. DE C.V.");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        clockDigital1.setBackground(new java.awt.Color(0, 102, 102));
        clockDigital1.setForeground(new java.awt.Color(255, 255, 255));
        clockDigital1.setAlignmentY(0.7F);
        clockDigital1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/campo.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LINKS DE RÁPIDO ACCESO");

        btnAccesoRapidoRealizarMezcla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/mix.png"))); // NOI18N
        btnAccesoRapidoRealizarMezcla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoRapidoRealizarMezclaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REALIZAR MEZCLAS");

        btnAccesoRapidoVerClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/clients.png"))); // NOI18N
        btnAccesoRapidoVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoRapidoVerClientesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONSULTAR CLIENTES");

        btnAccesoRapidoVerProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/productos.png"))); // NOI18N
        btnAccesoRapidoVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoRapidoVerProductosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VER PRODUCTOS");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Escritorio.setLayer(clockDigital1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(btnAccesoRapidoRealizarMezcla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(btnAccesoRapidoVerClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(btnAccesoRapidoVerProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAccesoRapidoRealizarMezcla, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addComponent(btnAccesoRapidoVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnAccesoRapidoVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccesoRapidoVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EscritorioLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(btnAccesoRapidoVerClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnAccesoRapidoRealizarMezcla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        lblBienvenido.setText("Bienvenido");

        MenuRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MenuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/productos24x24.png"))); // NOI18N
        MenuRegistro.setText("Registros");
        MenuRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        SubmenuCliente.setText("Cliente");
        SubmenuCliente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ItemCapturarCliente.setText("Capturar nuevo");
        ItemCapturarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCapturarClienteActionPerformed(evt);
            }
        });
        SubmenuCliente.add(ItemCapturarCliente);

        ItemConsultarCliente.setText("Consultar");
        ItemConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarClienteActionPerformed(evt);
            }
        });
        SubmenuCliente.add(ItemConsultarCliente);

        MenuRegistro.add(SubmenuCliente);

        SubmenuProveedor.setText("Proveedor");
        SubmenuProveedor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ItemCapturarProveedor.setText("Capturar nuevo");
        ItemCapturarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCapturarProveedorActionPerformed(evt);
            }
        });
        SubmenuProveedor.add(ItemCapturarProveedor);

        ItemConsultarProveedor.setText("Consultar");
        ItemConsultarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarProveedorActionPerformed(evt);
            }
        });
        SubmenuProveedor.add(ItemConsultarProveedor);

        MenuRegistro.add(SubmenuProveedor);

        SubmenuProductos.setText("Productos");
        SubmenuProductos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ItemCapturarProducto.setText("Capturar nuevo");
        ItemCapturarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCapturarProductoActionPerformed(evt);
            }
        });
        SubmenuProductos.add(ItemCapturarProducto);

        ItemConsultarProducto.setText("Consultar");
        ItemConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarProductoActionPerformed(evt);
            }
        });
        SubmenuProductos.add(ItemConsultarProducto);

        MenuRegistro.add(SubmenuProductos);

        SubmenuEmpleados.setText("Empleado");
        SubmenuEmpleados.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ItemCapturarEmpleado.setText("Capturar nuevo");
        ItemCapturarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCapturarEmpleadoActionPerformed(evt);
            }
        });
        SubmenuEmpleados.add(ItemCapturarEmpleado);

        ItemConsultarEmpleado.setText("Consultar");
        ItemConsultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarEmpleadoActionPerformed(evt);
            }
        });
        SubmenuEmpleados.add(ItemConsultarEmpleado);

        MenuRegistro.add(SubmenuEmpleados);

        jMenuBar1.add(MenuRegistro);

        MenuMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MenuMovimiento.setText("Movimientos");
        MenuMovimiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        SubmenuVenta.setText("Venta");
        SubmenuVenta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ItemGenerarVenta.setText("Generar nueva");
        ItemGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGenerarVentaActionPerformed(evt);
            }
        });
        SubmenuVenta.add(ItemGenerarVenta);

        ItemConsultarVenta.setText("Consultar");
        ItemConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarVentaActionPerformed(evt);
            }
        });
        SubmenuVenta.add(ItemConsultarVenta);

        MenuMovimiento.add(SubmenuVenta);

        SubmenuCompra.setText("Compra");
        SubmenuCompra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ItemGenerarCompra.setText("Generar nueva");
        ItemGenerarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGenerarCompraActionPerformed(evt);
            }
        });
        SubmenuCompra.add(ItemGenerarCompra);

        ItemConsultarCompra.setText("Consultar");
        ItemConsultarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarCompraActionPerformed(evt);
            }
        });
        SubmenuCompra.add(ItemConsultarCompra);

        MenuMovimiento.add(SubmenuCompra);

        SubmenuNotaCredito.setText("Nota de Crédito");
        SubmenuNotaCredito.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ItemGenerarNotaCredito.setText("Generar nueva");
        ItemGenerarNotaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGenerarNotaCreditoActionPerformed(evt);
            }
        });
        SubmenuNotaCredito.add(ItemGenerarNotaCredito);

        ItemConsultarNotaCredito.setText("Consultar");
        ItemConsultarNotaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarNotaCreditoActionPerformed(evt);
            }
        });
        SubmenuNotaCredito.add(ItemConsultarNotaCredito);

        MenuMovimiento.add(SubmenuNotaCredito);

        SubmenuDevolucion.setText("Devolución");
        SubmenuDevolucion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ItemGenerarDevolucion.setText("Generar nueva");
        ItemGenerarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGenerarDevolucionActionPerformed(evt);
            }
        });
        SubmenuDevolucion.add(ItemGenerarDevolucion);

        ItemConsultarDevolucion.setText("Consultar");
        ItemConsultarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarDevolucionActionPerformed(evt);
            }
        });
        SubmenuDevolucion.add(ItemConsultarDevolucion);

        MenuMovimiento.add(SubmenuDevolucion);

        jMenuBar1.add(MenuMovimiento);

        MenuAlmacenes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MenuAlmacenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/almacen.png"))); // NOI18N
        MenuAlmacenes.setText("Almacenes");
        MenuAlmacenes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        ItemAgregarAlmacen.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ItemAgregarAlmacen.setText("Agregar nuevo");
        ItemAgregarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAgregarAlmacenActionPerformed(evt);
            }
        });
        MenuAlmacenes.add(ItemAgregarAlmacen);

        ItemConsultarAlmacen.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ItemConsultarAlmacen.setText("Consultar");
        ItemConsultarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarAlmacenActionPerformed(evt);
            }
        });
        MenuAlmacenes.add(ItemConsultarAlmacen);

        jMenuBar1.add(MenuAlmacenes);

        MenuMezclas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MenuMezclas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/mix24x24.png"))); // NOI18N
        MenuMezclas.setText("Mezclas");
        MenuMezclas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        ItemRealizarMezclas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ItemRealizarMezclas.setText("Realizar Mezcla");
        ItemRealizarMezclas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRealizarMezclasActionPerformed(evt);
            }
        });
        MenuMezclas.add(ItemRealizarMezclas);

        jMenuBar1.add(MenuMezclas);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/graph-5.png"))); // NOI18N
        jMenu1.setText("Reportes");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem1.setText("Ver Productos por Almacén");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem2.setText("Ver Ventas por Almacén ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        MenuAyuda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MenuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/ayuda.png"))); // NOI18N
        MenuAyuda.setText("Ayuda");
        MenuAyuda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        ItemAyuda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ItemAyuda.setText("Acerca de");
        MenuAyuda.add(ItemAyuda);

        jMenuBar1.add(MenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1190, Short.MAX_VALUE)
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuarioActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarVentaActionPerformed
        ConsultarVenta consVenta = new ConsultarVenta (venta,Escritorio,factura,permiso);
        Escritorio.add(consVenta);
        consVenta.setVisible(true);
    }//GEN-LAST:event_ItemConsultarVentaActionPerformed

    private void ItemConsultarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarDevolucionActionPerformed
        ConsultarDevolucion consDev = new ConsultarDevolucion (devolucion,Escritorio,permiso);
        Escritorio.add(consDev);
        consDev.setVisible(true);
    }//GEN-LAST:event_ItemConsultarDevolucionActionPerformed

    private void ItemConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarProductoActionPerformed
        ConsultarProducto consProd = new ConsultarProducto (producto,Escritorio,permiso);
        Escritorio.add(consProd);
        consProd.setVisible(true);
    }//GEN-LAST:event_ItemConsultarProductoActionPerformed

    private void textoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPasswordActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_ButtonEntrarActionPerformed

    private void ItemConsultarNotaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarNotaCreditoActionPerformed
        ConsultarNotaCredito consNotaCred = new ConsultarNotaCredito (notaCredito,Escritorio,permiso);
        Escritorio.add(consNotaCred);
        consNotaCred.setVisible(true);
    }//GEN-LAST:event_ItemConsultarNotaCreditoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        abrirVentanaAcceso();
        
    }//GEN-LAST:event_formWindowOpened

    private void ItemCapturarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCapturarEmpleadoActionPerformed
        RegistrarEmpleado regEmp = new RegistrarEmpleado (permiso,empleado);
        Escritorio.add(regEmp);
        regEmp.setVisible(true);
    }//GEN-LAST:event_ItemCapturarEmpleadoActionPerformed

    private void ItemConsultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarEmpleadoActionPerformed
        ConsultarEmpleado conEmp = new ConsultarEmpleado (empleado,Escritorio,permiso);
        Escritorio.add(conEmp);
        conEmp.setVisible(true);

    }//GEN-LAST:event_ItemConsultarEmpleadoActionPerformed

    private void ItemCapturarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCapturarClienteActionPerformed
        RegistrarCliente regCli = new RegistrarCliente (permiso,cliente);
        Escritorio.add(regCli);
        regCli.setVisible(true);
    }//GEN-LAST:event_ItemCapturarClienteActionPerformed

    private void ItemConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarClienteActionPerformed
        ConsultarCliente conCli = new ConsultarCliente (cliente,Escritorio,permiso);
        Escritorio.add(conCli);
        conCli.setVisible(true);
        
    }//GEN-LAST:event_ItemConsultarClienteActionPerformed

    private void ItemCapturarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCapturarProveedorActionPerformed
        RegistrarProveedor regProv = new RegistrarProveedor (permiso,proveedor);
        Escritorio.add(regProv);
        regProv.setVisible(true);
    }//GEN-LAST:event_ItemCapturarProveedorActionPerformed

    private void ItemCapturarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCapturarProductoActionPerformed
        RegistrarProducto capProd = new RegistrarProducto (permiso,producto);
        Escritorio.add(capProd);
        capProd.setVisible(true);
    }//GEN-LAST:event_ItemCapturarProductoActionPerformed

    private void ItemConsultarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarProveedorActionPerformed
        ConsultarProveedor consProv = new ConsultarProveedor (proveedor,Escritorio,permiso);
        Escritorio.add(consProv);
        consProv.setVisible(true);
    }//GEN-LAST:event_ItemConsultarProveedorActionPerformed

    private void ItemGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGenerarVentaActionPerformed
        RegistrarVenta regVenta = new RegistrarVenta (permiso,venta,producto, ventaProducto, almacenProducto, factura);
        Escritorio.add(regVenta);
        regVenta.setVisible(true);
    }//GEN-LAST:event_ItemGenerarVentaActionPerformed
 
    private void ItemGenerarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGenerarCompraActionPerformed
        RegistrarCompra regCompra = new RegistrarCompra (permiso,compra,producto,compraProducto,almacenProducto);
        Escritorio.add(regCompra);
        regCompra.setVisible(true);
    }//GEN-LAST:event_ItemGenerarCompraActionPerformed

    private void ItemConsultarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarCompraActionPerformed
        ConsultarCompra consCompra = new ConsultarCompra (compra,Escritorio,permiso);
        Escritorio.add(consCompra);
        consCompra.setVisible(true);
    }//GEN-LAST:event_ItemConsultarCompraActionPerformed

    private void ItemGenerarNotaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGenerarNotaCreditoActionPerformed
        RegistrarNotaCredito regNotaCredito = new RegistrarNotaCredito (permiso,notaCredito);
        Escritorio.add(regNotaCredito);
        regNotaCredito.setVisible(true);
    }//GEN-LAST:event_ItemGenerarNotaCreditoActionPerformed

    private void ItemGenerarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGenerarDevolucionActionPerformed
        RegistrarDevolucion regDevol = new RegistrarDevolucion (permiso,devolucion,almacenProducto,devolucionProducto);
        Escritorio.add(regDevol);
        regDevol.setVisible(true);
    }//GEN-LAST:event_ItemGenerarDevolucionActionPerformed

    private void ItemAgregarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAgregarAlmacenActionPerformed
        RegistrarAlmacen regAlma = new RegistrarAlmacen (permiso,almacen,empleado);
        Escritorio.add(regAlma);
        regAlma.setVisible(true);
    }//GEN-LAST:event_ItemAgregarAlmacenActionPerformed

    private void ItemConsultarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarAlmacenActionPerformed
        ConsultarAlmacen consAlma = new ConsultarAlmacen (almacen,Escritorio,permiso,empleado);
        Escritorio.add(consAlma);
        consAlma.setVisible(true);
    }//GEN-LAST:event_ItemConsultarAlmacenActionPerformed

    private void ItemRealizarMezclasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRealizarMezclasActionPerformed
        RealizarMezcla realMez = new RealizarMezcla (permiso,formula,producto,almacenProducto);
        Escritorio.add(realMez);
        realMez.setVisible(true);
    }//GEN-LAST:event_ItemRealizarMezclasActionPerformed

    private void VentanaLoginWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_VentanaLoginWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaLoginWindowOpened

    private void VentanaLoginWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_VentanaLoginWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaLoginWindowIconified

    private void btnAccesoRapidoRealizarMezclaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoRapidoRealizarMezclaActionPerformed
        RealizarMezcla realMez = new RealizarMezcla (permiso,formula,producto,almacenProducto);
        Escritorio.add(realMez);
        realMez.setVisible(true);
    }//GEN-LAST:event_btnAccesoRapidoRealizarMezclaActionPerformed

    private void btnAccesoRapidoVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoRapidoVerClientesActionPerformed
        ConsultarCliente conCli = new ConsultarCliente (cliente,Escritorio,permiso);
        Escritorio.add(conCli);
        conCli.setVisible(true);
    }//GEN-LAST:event_btnAccesoRapidoVerClientesActionPerformed

    private void btnAccesoRapidoVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoRapidoVerProductosActionPerformed
        ConsultarProducto consProd = new ConsultarProducto (producto,Escritorio,permiso);
        Escritorio.add(consProd);
        consProd.setVisible(true);
    }//GEN-LAST:event_btnAccesoRapidoVerProductosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String path = "C:\\Users\\zawex\\Documents\\GitHub\\agrarian2\\src\\reports\\reportProductosPorAlmacen.jasper";
        JasperReport jr = null;
        try {
            Connection conexion = DriverManager.getConnection("jdbc:sqlserver://localhost\\MSSQLSERVER1;databaseName=agrarian","sa","12345678");
            jr = (JasperReport) JRLoader.loadObject(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer jv = new JasperViewer(jp,false); 
            jv.setTitle(path);
            jv.setVisible(true);
            conexion.close();
        }catch (Exception e) {System.out.println(e.getMessage());}
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            String path = "C:\\Users\\zawex\\Documents\\5 cuatri\\Proyecto Agrarian\\AgrarianJ\\src\\reports\\reportVentasPorAlmacen.jasper";
        JasperReport jr = null;
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/agrarian", "root", "");
            jr = (JasperReport) JRLoader.loadObject(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conexion);
            JasperViewer jv = new JasperViewer(jp,false); 
            jv.setVisible(true);
            jv.setTitle(path);
            conexion.close();
        }catch (Exception e) {System.out.println(e.getMessage());}
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Date date1 = new Date();
        ll.agregarAccionFinal(date1.toString(),usuarioActual,"Cierre de Sesion");
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date date1 = new Date();
        ll.agregarAccion(date1.toString(),"Cierre de Sesion");
        System.out.println(lblUsuarioActivo.getText());
        //dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void iniciarSesion() {
        usuarioActual = textoUsuario.getText();
        try {
            if(permiso.AccederSistema(textoUsuario.getText(), String.valueOf(textoPassword.getPassword())) == 0){
                lblStatus.setText("Usuario o contraseña incorrecta");
            } else {
                int id = permiso.AccederSistema(textoUsuario.getText(), String.valueOf(textoPassword.getPassword()));
                Log ll = new Log(textoUsuario.getText());
                ll.agregarAccion(date.toString(),"Inicio de Sesion");
                System.out.println(id);
                permiso.setIdEmp(id);
                permiso.verificarPermisos();
                lblUsuarioActivo.setText(textoUsuario.getText()+" ("+id+")");
                textoUsuario.setText(null);
                textoPassword.setText(null);
                VentanaLogin.dispose();
                cargarAccesosCliente();
                cargarAccesosEmpleado();
                cargarAccesosProveedor();
                cargarAccesosProducto();
                cargarAccesosCompra();
                cargarAccesosVenta();
                cargarAccesosNotaCredito();
                cargarAccesosDevolucion();
                cargarAccesosAlmacen();
                cargarAccesosMezcla();
                this.setVisible(true);
                this.idEmp = String.valueOf(id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarAccesosProveedor () {
        switch (permiso.getProveedor()) {
            case 0:
                SubmenuProveedor.setVisible(false);
                break;
            case 1:
                SubmenuProveedor.setVisible(true);
                ItemCapturarProveedor.setVisible(false);
                ItemConsultarProveedor.setVisible(true);
                break;
            case 2:
                SubmenuProveedor.setVisible(true);
                ItemCapturarProveedor.setVisible(true);
                ItemConsultarProveedor.setVisible(true);                
                break;
        }
    }

    public void cargarAccesosProducto () {
        switch (permiso.getProducto()) {
            case 0:
                SubmenuProductos.setVisible(false);
                btnAccesoRapidoVerProductos.setVisible(false);
                break;
            case 1:
                SubmenuProductos.setVisible(true);
                ItemCapturarProducto.setVisible(false);
                ItemConsultarProducto.setVisible(true);
                btnAccesoRapidoVerProductos.setVisible(true);
                break;
            case 2:
                SubmenuProductos.setVisible(true);
                ItemCapturarProducto.setVisible(true);
                ItemConsultarProducto.setVisible(true);    
                btnAccesoRapidoVerProductos.setVisible(true);
                break;
        }
    }

    public void cargarAccesosNotaCredito () {
        switch (permiso.getNotaCredito()) {
            case 0:
                SubmenuNotaCredito.setVisible(false);
                break;
            case 1:
                SubmenuNotaCredito.setVisible(true);
                ItemGenerarNotaCredito.setVisible(false);
                ItemConsultarNotaCredito.setVisible(true);
                break;
            case 2:
                SubmenuNotaCredito.setVisible(true);
                ItemGenerarNotaCredito.setVisible(true);
                ItemConsultarNotaCredito.setVisible(true);                
                break;
        }    
    }

    public void cargarAccesosEmpleado () {
        switch (permiso.getEmpleado()) {
            case 0:
                SubmenuEmpleados.setVisible(false);
                break;
            case 1:
                SubmenuEmpleados.setVisible(true);
                ItemCapturarEmpleado.setVisible(false);
                ItemConsultarEmpleado.setVisible(true);
                break;
            case 2:
                SubmenuEmpleados.setVisible(true);
                ItemCapturarEmpleado.setVisible(true);                
                ItemConsultarEmpleado.setVisible(true);                
                break;
        }
    }

    public void cargarAccesosDevolucion () {
        switch (permiso.getDevolucion()) {
            case 0:
                SubmenuDevolucion.setVisible(false);
                break;
            case 1:
                SubmenuDevolucion.setVisible(true);
                ItemGenerarDevolucion.setVisible(false);
                ItemConsultarDevolucion.setVisible(true);
                break;
            case 2:
                SubmenuDevolucion.setVisible(true);
                ItemGenerarDevolucion.setVisible(true);
                ItemConsultarDevolucion.setVisible(true);                
                break;
        } 
    }

    public void cargarAccesosCliente () {
        switch (permiso.getCliente()) {
            case 0:
                SubmenuCliente.setVisible(false);
                btnAccesoRapidoVerClientes.setVisible(false);
                break;
            case 1:
                SubmenuCliente.setVisible(true);
                ItemCapturarCliente.setVisible(false);
                ItemConsultarCliente.setVisible(true);
                btnAccesoRapidoVerClientes.setVisible(true);
                break;
            case 2:
                SubmenuCliente.setVisible(true);
                ItemCapturarCliente.setVisible(true);
                ItemConsultarCliente.setVisible(true);    
                btnAccesoRapidoVerClientes.setVisible(true);
                break;
        }    
    }

    public void cargarAccesosAlmacen () {
        switch (permiso.getAlmacen()) {
            case 0:
                MenuAlmacenes.setVisible(false);
                break;
            case 1:
                MenuAlmacenes.setVisible(true);
                ItemAgregarAlmacen.setVisible(false);
                ItemConsultarAlmacen.setVisible(true);
                break;
            case 2:
                MenuAlmacenes.setVisible(true);
                ItemAgregarAlmacen.setVisible(true);
                ItemConsultarAlmacen.setVisible(true);                
                break;
        }
    }

    public void cargarAccesosCompra () {
        switch (permiso.getCompra()) {
            case 0:
                SubmenuCompra.setVisible(false);
                break;
            case 1:
                SubmenuCompra.setVisible(true);
                ItemGenerarCompra.setVisible(false);
                ItemConsultarCompra.setVisible(true);
                break;
            case 2:
                SubmenuCompra.setVisible(true);
                ItemGenerarCompra.setVisible(true);
                ItemConsultarCompra.setVisible(true);                
                break;
        }
    }

    public void cargarAccesosVenta () {
        switch (permiso.getVenta()) {
            case 0:
                SubmenuVenta.setVisible(false);
                break;
            case 1:
                SubmenuVenta.setVisible(true);
                ItemGenerarVenta.setVisible(false);
                ItemConsultarVenta.setVisible(true);
                break;
            case 2:
                SubmenuVenta.setVisible(true);
                ItemGenerarVenta.setVisible(true);
                ItemConsultarVenta.setVisible(true);                
                break;
        }
    }
   
    public void cargarAccesosMezcla () {
        switch (permiso.getMezcla()) {
            case 0:
                MenuMezclas.setVisible(false);
                btnAccesoRapidoRealizarMezcla.setVisible(false);
                break;
            case 1:
                MenuMezclas.setVisible(true);
                ItemRealizarMezclas.setVisible(true);                
                btnAccesoRapidoRealizarMezcla.setVisible(true);
                break;
            case 2:
                MenuMezclas.setVisible(true);
                ItemRealizarMezclas.setVisible(true);
                btnAccesoRapidoRealizarMezcla.setVisible(true);
                break;

        }
    }
    
    public void abrirVentanaAcceso(){
        this.setVisible(false);
        VentanaLogin.setModal(true);
        VentanaLogin.setUndecorated(true);
        VentanaLogin.setSize(460, 320);
        VentanaLogin.setLocationRelativeTo(null);
        VentanaLogin.setVisible(true);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem ItemAgregarAlmacen;
    private javax.swing.JMenuItem ItemAyuda;
    private javax.swing.JMenuItem ItemCapturarCliente;
    private javax.swing.JMenuItem ItemCapturarEmpleado;
    private javax.swing.JMenuItem ItemCapturarProducto;
    private javax.swing.JMenuItem ItemCapturarProveedor;
    private javax.swing.JMenuItem ItemConsultarAlmacen;
    private javax.swing.JMenuItem ItemConsultarCliente;
    private javax.swing.JMenuItem ItemConsultarCompra;
    private javax.swing.JMenuItem ItemConsultarDevolucion;
    private javax.swing.JMenuItem ItemConsultarEmpleado;
    private javax.swing.JMenuItem ItemConsultarNotaCredito;
    private javax.swing.JMenuItem ItemConsultarProducto;
    private javax.swing.JMenuItem ItemConsultarProveedor;
    private javax.swing.JMenuItem ItemConsultarVenta;
    private javax.swing.JMenuItem ItemGenerarCompra;
    private javax.swing.JMenuItem ItemGenerarDevolucion;
    private javax.swing.JMenuItem ItemGenerarNotaCredito;
    private javax.swing.JMenuItem ItemGenerarVenta;
    private javax.swing.JMenuItem ItemRealizarMezclas;
    private javax.swing.JMenu MenuAlmacenes;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuMezclas;
    private javax.swing.JMenu MenuMovimiento;
    private javax.swing.JMenu MenuRegistro;
    private javax.swing.JPanel PanelAcceso;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JMenu SubmenuCliente;
    private javax.swing.JMenu SubmenuCompra;
    private javax.swing.JMenu SubmenuDevolucion;
    private javax.swing.JMenu SubmenuEmpleados;
    private javax.swing.JMenu SubmenuNotaCredito;
    private javax.swing.JMenu SubmenuProductos;
    private javax.swing.JMenu SubmenuProveedor;
    private javax.swing.JMenu SubmenuVenta;
    private javax.swing.JDialog VentanaLogin;
    private javax.swing.JButton btnAccesoRapidoRealizarMezcla;
    private javax.swing.JButton btnAccesoRapidoVerClientes;
    private javax.swing.JButton btnAccesoRapidoVerProductos;
    private javax.swing.JButton buttonSalir;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuarioActivo;
    private javax.swing.JPasswordField textoPassword;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}

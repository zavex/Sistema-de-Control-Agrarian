package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import modelo.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import modelo.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Menú principal del programa
 * @author Ivani
 */
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
    boolean ventTraspasoAb = false,ventConsultaTras=false;
    int seg = 0;
    Arbol nuevo;
    
    //Objetos
    PrintWriter archivoEntrada;
    Scanner archivoEntradaa;
    JFileChooser archivo;

    
    //Variables de clase
    String msje = null, nomArchivo = null, lineaLeida = null;
    int countLineas=0;
    public final String user="";
    static String usua;
    PrintWriter archivoSalida;
    
    /**
     * Temporizador usado para resaltar el mensaje de error en la ventana de inicio de sesión.
     */
    Timer tempo = new Timer(500, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            seg++;
            if(seg==6){
                tempo.stop();
                lblStatus.setForeground(Color.black);
                seg=0;
            }
            if(seg==1){
               lblStatus.setForeground(Color.red);
               
            }
            if(seg==2){
               lblStatus.setForeground(Color.black);
            }
            if(seg==3){
                lblStatus.setForeground(Color.red);
            }
            if(seg==4){
                lblStatus.setForeground(Color.black);
            }
            if(seg==5){
                lblStatus.setForeground(Color.red);
                lblStatus.setText("");
            }
        }
    });
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaLogin = new javax.swing.JDialog();
        panBG = new javax.swing.JPanel();
        PanelLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelAcceso = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        lblUsuario1 = new javax.swing.JLabel();
        textoPassword = new javax.swing.JPasswordField();
        lblStatus = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnNull1 = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        ButtonEntrar = new javax.swing.JButton();
        Escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblUsuarioActivo = new javax.swing.JLabel();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        jToolBar2 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        itemAgregarMovimiento = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuMezclas = new javax.swing.JMenu();
        ItemRealizarMezclas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
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

        panBG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PanelLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelLogo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Agrarian - copia.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelLogo.add(jLabel1);

        PanelAcceso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblUsuario.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblUsuario.setText("Usuario");

        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });

        lblUsuario1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblUsuario1.setText("Contraseña");

        textoPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPasswordActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 0, 0));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelAccesoLayout = new javax.swing.GroupLayout(PanelAcceso);
        PanelAcceso.setLayout(PanelAccesoLayout);
        PanelAccesoLayout.setHorizontalGroup(
            PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccesoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAccesoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAccesoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelAccesoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textoPassword, textoUsuario});

        PanelAccesoLayout.setVerticalGroup(
            PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelAccesoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblUsuario, lblUsuario1, textoPassword, textoUsuario});

        panelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotones.setLayout(new java.awt.GridLayout(1, 0));

        btnNull1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnNull1.setBorderPainted(false);
        btnNull1.setContentAreaFilled(false);
        btnNull1.setEnabled(false);
        btnNull1.setFocusable(false);
        btnNull1.setRequestFocusEnabled(false);
        panelBotones.add(btnNull1);

        buttonSalir.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        buttonSalir.setText("SALIR");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });
        panelBotones.add(buttonSalir);

        ButtonEntrar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ButtonEntrar.setText("ENTRAR");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        panelBotones.add(ButtonEntrar);

        javax.swing.GroupLayout panBGLayout = new javax.swing.GroupLayout(panBG);
        panBG.setLayout(panBGLayout);
        panBGLayout.setHorizontalGroup(
            panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panBGLayout.setVerticalGroup(
            panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout VentanaLoginLayout = new javax.swing.GroupLayout(VentanaLogin.getContentPane());
        VentanaLogin.getContentPane().setLayout(VentanaLoginLayout);
        VentanaLoginLayout.setHorizontalGroup(
            VentanaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        VentanaLoginLayout.setVerticalGroup(
            VentanaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/campo.jpg"))); // NOI18N

        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblBienvenido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(0, 0, 102));
        lblBienvenido.setText("Bienvenido");

        lblUsuarioActivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUsuarioActivo.setForeground(new java.awt.Color(0, 0, 102));

        clockDigital1.setBackground(new java.awt.Color(0, 102, 102));
        clockDigital1.setForeground(new java.awt.Color(0, 0, 102));
        clockDigital1.setAlignmentY(0.7F);
        clockDigital1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N

        jToolBar2.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/mix24x24.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/utilidades24x24.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton2);

        MenuRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MenuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/registro2.0.png"))); // NOI18N
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
        MenuMovimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/movimientos2.0.png"))); // NOI18N
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
        MenuAlmacenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/almacen2.0.png"))); // NOI18N
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

        itemAgregarMovimiento.setText("Registrar traspaso");
        itemAgregarMovimiento.setContentAreaFilled(false);
        itemAgregarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarMovimientoActionPerformed(evt);
            }
        });
        MenuAlmacenes.add(itemAgregarMovimiento);

        jMenuItem4.setText("Consulta traspasos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuAlmacenes.add(jMenuItem4);

        jMenuBar1.add(MenuAlmacenes);

        MenuMezclas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MenuMezclas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/mezla2.0.png"))); // NOI18N
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

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/report2.0.png"))); // NOI18N
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

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/utilidades2.0.png"))); // NOI18N
        jMenu2.setText("Utilerias");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem3.setText("Ver Log");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem5.setText("Generar Log Encriptado");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        MenuAyuda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MenuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/ayuda2.0.png"))); // NOI18N
        MenuAyuda.setText("Ayuda");
        MenuAyuda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem6.setText("Iniciar Chat");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        MenuAyuda.add(jMenuItem6);

        ItemAyuda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ItemAyuda.setText("Acerca de");
        MenuAyuda.add(ItemAyuda);

        jMenuBar1.add(MenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBienvenido)
                    .addComponent(lblUsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBienvenido)
                        .addGap(0, 0, 0)
                        .addComponent(lblUsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Invoca la ventana de consulta de ventas.
     * @param evt 
     */
    private void ItemConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarVentaActionPerformed
        ConsultarVenta consVenta = new ConsultarVenta (venta,Escritorio,factura,permiso);
        Escritorio.add(consVenta);
        centrarVentana(consVenta);
        consVenta.setVisible(true);
    }//GEN-LAST:event_ItemConsultarVentaActionPerformed

    /**
     * Invoca la ventana de consulta de devoluciones.
     * @param evt 
     */
    private void ItemConsultarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarDevolucionActionPerformed
        ConsultarDevolucion consDev = new ConsultarDevolucion (devolucion,Escritorio,permiso);
        Escritorio.add(consDev);
        centrarVentana(consDev);
        consDev.setVisible(true);
    }//GEN-LAST:event_ItemConsultarDevolucionActionPerformed

    /**
     * Invoca la ventana de consulta de productos.
     * @param evt 
     */
    private void ItemConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarProductoActionPerformed
        ConsultarProducto consProd = new ConsultarProducto (producto,Escritorio,permiso);
        Escritorio.add(consProd);
        centrarVentana(consProd);
        consProd.setVisible(true);
    }//GEN-LAST:event_ItemConsultarProductoActionPerformed
    
    /**
     * Verifica si las cajas de texto del menú de login están llenas.
     * @param caja1 Recibe la caja de texto 1.
     * @param caja2 Recibe la caja de texto 2.
     */
    public void cajitaFeliz(JTextField caja1, JTextField caja2){
        if(!caja1.getText().isEmpty() && !caja2.getText().isEmpty()){
            iniciarSesion();
        } else if (!caja1.getText().isEmpty() && caja2.getText().isEmpty()){
            caja2.requestFocus();
        }
        
    }
    
    /**
     * Llama al método de verificación de cajas de texto.
     * @param evt
     * @see cajitaFeliz()
     */
    private void textoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPasswordActionPerformed
        cajitaFeliz(textoPassword, textoUsuario);
    }//GEN-LAST:event_textoPasswordActionPerformed

    /**
     * Verifica si las casillas de usuario y contraseña están llenas y regresa un valor booleano.
     * @return 
     */
    public boolean validarLlenado(){
        boolean user = false,  pass = false;
        if(!textoUsuario.getText().isEmpty()){
            user = true;
        } else {
            user = false;
            textoUsuario.requestFocus();
        }
        if(!textoPassword.getText().isEmpty()){
            pass = true;
        } else { 
            pass = false;
            textoPassword.requestFocus();
        }
        
        if(user && pass){ 
            return true;
        } else {
            return false;
        }
    }
    
    
    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSalirActionPerformed

    /**
     * Manda llamar al método validarLlenado(), si cumple la condición ejecuta el proceso de inicio de sesión.
     * @param evt 
     */
    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        if(validarLlenado()){
            iniciarSesion();
        }
    }//GEN-LAST:event_ButtonEntrarActionPerformed

    /**
     * Invoca la ventana de consulta de notas de crédito.
     * @param evt 
     */
    private void ItemConsultarNotaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarNotaCreditoActionPerformed
        ConsultarNotaCredito consNotaCred = new ConsultarNotaCredito (notaCredito,Escritorio,permiso);
        Escritorio.add(consNotaCred);
        centrarVentana(consNotaCred);
        consNotaCred.setVisible(true);
    }//GEN-LAST:event_ItemConsultarNotaCreditoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        abrirVentanaAcceso();
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * Invoca la ventana de captura de empleados.
     * @param evt 
     */
    private void ItemCapturarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCapturarEmpleadoActionPerformed
        RegistrarEmpleado regEmp = new RegistrarEmpleado (permiso,empleado);
        Escritorio.add(regEmp);
        centrarVentana(regEmp);
        regEmp.setVisible(true);
    }//GEN-LAST:event_ItemCapturarEmpleadoActionPerformed

    /**
     * Invoca la ventana de consulta de empleados.
     * @param evt 
     */
    private void ItemConsultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarEmpleadoActionPerformed
        ConsultarEmpleado conEmp = new ConsultarEmpleado (empleado,Escritorio,permiso);
        Escritorio.add(conEmp);
        centrarVentana(conEmp);
        conEmp.setVisible(true);

    }//GEN-LAST:event_ItemConsultarEmpleadoActionPerformed

    /**
     * Invoca la ventana de captura de clientes.
     * @param evt 
     */
    private void ItemCapturarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCapturarClienteActionPerformed
        RegistrarCliente regCli = new RegistrarCliente (permiso,cliente);
        Escritorio.add(regCli);
        centrarVentana(regCli);
        regCli.setVisible(true);
    }//GEN-LAST:event_ItemCapturarClienteActionPerformed

    /**
     * Invoca la ventana de consulta de clientes.
     * @param evt 
     */
    private void ItemConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarClienteActionPerformed
        ConsultarCliente conCli = new ConsultarCliente (cliente,Escritorio,permiso);
        Escritorio.add(conCli);
        centrarVentana(conCli);
        conCli.setVisible(true);
        
    }//GEN-LAST:event_ItemConsultarClienteActionPerformed

    /**
     * Invoca la ventana de captura de proveedores.
     * @param evt 
     */
    private void ItemCapturarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCapturarProveedorActionPerformed
        RegistrarProveedor regProv = new RegistrarProveedor (permiso,proveedor);
        Escritorio.add(regProv);
        centrarVentana(regProv);
        regProv.setVisible(true);
    }//GEN-LAST:event_ItemCapturarProveedorActionPerformed

    /**
     * Invoca la ventana de captura de productos.
     * @param evt 
     */
    private void ItemCapturarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCapturarProductoActionPerformed
        RegistrarProducto capProd = new RegistrarProducto (permiso,producto);
        Escritorio.add(capProd);
        centrarVentana(capProd);
        capProd.setVisible(true);
    }//GEN-LAST:event_ItemCapturarProductoActionPerformed

    /**
     * Invoca la ventana de consulta de proveedores.
     * @param evt 
     */
    private void ItemConsultarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarProveedorActionPerformed
        ConsultarProveedor consProv = new ConsultarProveedor (proveedor,Escritorio,permiso);
        Escritorio.add(consProv);
        centrarVentana(consProv);
        consProv.setVisible(true);
    }//GEN-LAST:event_ItemConsultarProveedorActionPerformed

    /**
     * Invoca la ventana de captura de ventas.
     * @param evt 
     */
    private void ItemGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGenerarVentaActionPerformed
        RegistrarVenta regVenta = new RegistrarVenta (permiso,venta,producto, ventaProducto, almacenProducto, factura);
        Escritorio.add(regVenta);
        centrarVentana(regVenta);
        regVenta.setVisible(true);
    }//GEN-LAST:event_ItemGenerarVentaActionPerformed
 
    /**
     * Invoca la ventana de captura de compras.
     * @param evt 
     */
    private void ItemGenerarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGenerarCompraActionPerformed
        RegistrarCompra regCompra = new RegistrarCompra (permiso,compra,producto,compraProducto,almacenProducto);
        Escritorio.add(regCompra);
        centrarVentana(regCompra);
        regCompra.setVisible(true);
    }//GEN-LAST:event_ItemGenerarCompraActionPerformed

    /**
     * Invoca la ventana de consulta de compras.
     * @param evt 
     */
    private void ItemConsultarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarCompraActionPerformed
        ConsultarCompra consCompra = new ConsultarCompra (compra,Escritorio,permiso);
        Escritorio.add(consCompra);
        centrarVentana(consCompra);
        consCompra.setVisible(true);
    }//GEN-LAST:event_ItemConsultarCompraActionPerformed

    /**
     * Invoca la ventana de captura de notas de crédito.
     * @param evt 
     */
    private void ItemGenerarNotaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGenerarNotaCreditoActionPerformed
        RegistrarNotaCredito regNotaCredito = new RegistrarNotaCredito (permiso,notaCredito);
        Escritorio.add(regNotaCredito);
        centrarVentana(regNotaCredito);
        regNotaCredito.setVisible(true);
    }//GEN-LAST:event_ItemGenerarNotaCreditoActionPerformed

    /**
     * Invoca la ventana de captura de devoluciones.
     * @param evt 
     */
    private void ItemGenerarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGenerarDevolucionActionPerformed
        RegistrarDevolucion regDevol = new RegistrarDevolucion (permiso,devolucion,almacenProducto,devolucionProducto);
        Escritorio.add(regDevol);
        centrarVentana(regDevol);
        regDevol.setVisible(true);
    }//GEN-LAST:event_ItemGenerarDevolucionActionPerformed

    /**
     * Invoca la ventana de captura de almacenes.
     * @param evt 
     */
    private void ItemAgregarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAgregarAlmacenActionPerformed
        RegistrarAlmacen regAlma = new RegistrarAlmacen (permiso,almacen,empleado);
        Escritorio.add(regAlma);
        centrarVentana(regAlma);
        regAlma.setVisible(true);
    }//GEN-LAST:event_ItemAgregarAlmacenActionPerformed

    /**
     * Invoca la ventana de consulta de almacenes.
     * @param evt 
     */
    private void ItemConsultarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarAlmacenActionPerformed
        ConsultarAlmacen consAlma = new ConsultarAlmacen (almacen,Escritorio,permiso,empleado);
        Escritorio.add(consAlma);
        centrarVentana(consAlma);
        consAlma.setVisible(true);
    }//GEN-LAST:event_ItemConsultarAlmacenActionPerformed

    /**
     * Invoca la ventana para generar mezclas de producto.
     * @param evt 
     */
    private void ItemRealizarMezclasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRealizarMezclasActionPerformed
        RealizarMezcla realMez = new RealizarMezcla (permiso,formula,producto,almacenProducto);
        Escritorio.add(realMez);
        centrarVentana(realMez);
        realMez.setVisible(true);
    }//GEN-LAST:event_ItemRealizarMezclasActionPerformed

    private void VentanaLoginWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_VentanaLoginWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaLoginWindowOpened

    private void VentanaLoginWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_VentanaLoginWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaLoginWindowIconified

    /**
     * Éste evento genera un reporte de prodctos que hay en cada almacén
     * @param evt 
     */
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

    /**
     * Éste evento genera un reporte de ventas por almacén
     * @param evt 
     */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String path = "C:\\Users\\zawex\\Documents\\GitHub\\agrarian2\\src\\reports\\report1.jasper";
        JasperReport jr = null;
        try {
            Connection conexion = DriverManager.getConnection("jdbc:sqlserver://localhost\\MSSQLSERVER1;databaseName=agrarian","sa","12345678");
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

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    /**
     * Invoca la ventana de consulta del log del sistema.
     * @param evt 
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConsultarLog cl = new ConsultarLog (Escritorio);
        Escritorio.add(cl);
        centrarVentana(cl);
        cl.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * Éste evento espera que se presione la tecla de salto de línea(enter) para invocar el método de verificación de cajas llenas de la
     * ventana de inicio de sesión.
     * @param evt 
     */
    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        cajitaFeliz(textoUsuario, textoPassword);
    }//GEN-LAST:event_textoUsuarioActionPerformed

    /**
     * Invoca la ventana de captura de movimientos de almacén.
     * @param evt 
     */
    private void itemAgregarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarMovimientoActionPerformed
        if(ventTraspasoAb == false){
            ifrmTraspaso ifrt = new ifrmTraspaso(this,Escritorio,permiso,producto);
            Escritorio.add(ifrt);
            centrarVentana(ifrt);
            ifrt.setVisible(true);
            ventTraspasoAb = true;
        }
        
    }//GEN-LAST:event_itemAgregarMovimientoActionPerformed

    /**
     * Invoca la ventana de consulta de movimientos de almacén.
     * @param evt 
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(ventConsultaTras == false){
            ifrmConsultaTraspaso ifrt = new ifrmConsultaTraspaso(this,Escritorio,permiso,producto);
            Escritorio.add(ifrt);
            centrarVentana(ifrt);
            ifrt.setVisible(true);
            ventConsultaTras = true;
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * Éste método se encarga de generar la bitácora de acciones del sistema.
     * @param evt 
     */
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        archivo = new JFileChooser();
        nuevo = new Arbol();
        String texto = ""; 
        int cantidad=0;
        if (archivo.showDialog(null, "Guardar Archivo") == JFileChooser.APPROVE_OPTION) { 
            try {
                nomArchivo = archivo.getSelectedFile().toString();
                archivoSalida = new PrintWriter(new FileWriter(nomArchivo,true));
                msje = "";
                nomArchivo = "C:\\Users\\zawex\\Desktop\\log.txt";
                try {
                    archivoEntradaa = new Scanner (new FileReader (nomArchivo));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                lineaLeida = "";
                countLineas = 0;
                while (archivoEntradaa.hasNext()) { 
                    lineaLeida = archivoEntradaa.nextLine();
                    texto += lineaLeida;
                }
                int tamaño = texto.length();                
                nuevo.convertir(texto);
                //System.out.println("----------------------");
                String cad = nuevo.regresarCadEnc();
                //System.out.println("cad: " + cad);
                archivoSalida.println(cad);
                JOptionPane.showMessageDialog(null,"Información guardada en archivo");
                archivoSalida.close();
            }catch (Exception e) {
                archivoSalida = null;
                JOptionPane.showConfirmDialog(null, "Error al leer el archivo"+countLineas, 
                        "Mensaje",JOptionPane.OK_OPTION);
            }
        }else {
            JOptionPane.showConfirmDialog(null, "Opción cancelada", 
                        "Mensaje",JOptionPane.OK_OPTION);
        }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * Invoca la ventana de chat para solicitar soporte técnico.
     * @param evt 
     */
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        chat cliente = new chat();
        cliente.conectar("localhost", lblUsuarioActivo.getText());
        cliente.setSize(326, 384);
        cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * Este método se encarga de obtener el usuario y contraseña, para compararlo con la información de la base de datos, si se encuentra la información
     * le permitirá el acceso al usuario y cargará los permisos asociados a este.
     */
    public void iniciarSesion() {
        usuarioActual = textoUsuario.getText();
        try {
            if(permiso.AccederSistema(textoUsuario.getText(), String.valueOf(textoPassword.getPassword())) == 0){
                lblStatus.setText("Usuario o contraseña incorrecta");
                tempo.start();
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
    
    /**
     * Carga los permisos del usuario para el módulo de proveedores.
     */
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
    
    /**
     * Carga los permisos del usuario para el módulo de producto.
     */
    public void cargarAccesosProducto () {
        switch (permiso.getProducto()) {
            case 0:
                SubmenuProductos.setVisible(false);
//                btnAccesoRapidoVerProductos.setVisible(false);
                break;
            case 1:
                SubmenuProductos.setVisible(true);
                ItemCapturarProducto.setVisible(false);
                ItemConsultarProducto.setVisible(true);
                //btnAccesoRapidoVerProductos.setVisible(true);
                break;
            case 2:
                SubmenuProductos.setVisible(true);
                ItemCapturarProducto.setVisible(true);
                ItemConsultarProducto.setVisible(true);    
                //btnAccesoRapidoVerProductos.setVisible(true);
                break;
        }
    }

    /**
     * Carga los permisos del usuario para el módulo de notas de crédito.
     */
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

    /**
     * Carga los permisos del usuario para el módulo de empleados.
     */
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

    /**
     * Carga los permisos del usuario para el módulo de devoluciones.
     */
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

    /**
     * Carga los permisos del usuario para el módulo de clientes.
     */
    public void cargarAccesosCliente () {
        switch (permiso.getCliente()) {
            case 0:
                SubmenuCliente.setVisible(false);
                //btnAccesoRapidoVerClientes.setVisible(false);
                break;
            case 1:
                SubmenuCliente.setVisible(true);
                ItemCapturarCliente.setVisible(false);
                ItemConsultarCliente.setVisible(true);
                //btnAccesoRapidoVerClientes.setVisible(true);
                break;
            case 2:
                SubmenuCliente.setVisible(true);
                ItemCapturarCliente.setVisible(true);
                ItemConsultarCliente.setVisible(true);    
                //btnAccesoRapidoVerClientes.setVisible(true);
                break;
        }    
    }

    /**
     * Carga los permisos del usuario para el módulo de almacén.
     */
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

    /**
     * Carga los permisos del usuario para el módulo de compras.
     */
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

    /**
     * Carga los permisos del usuario para el módulo de ventas.
     */
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
   
    /**
     * Carga los permisos del usuario para el módulo de mezclas.
     */
    public void cargarAccesosMezcla () {
        switch (permiso.getMezcla()) {
            case 0:
                MenuMezclas.setVisible(false);
//                btnAccesoRapidoRealizarMezcla.setVisible(false);
                break;
            case 1:
                MenuMezclas.setVisible(true);
                ItemRealizarMezclas.setVisible(true);                
//                btnAccesoRapidoRealizarMezcla.setVisible(true);
                break;
            case 2:
                MenuMezclas.setVisible(true);
                ItemRealizarMezclas.setVisible(true);
//                btnAccesoRapidoRealizarMezcla.setVisible(true);
                break;

        }
    }
    
    /**
     * Establece el tamaño, le indica que depende de la ventana principal y centra la ventana de inicio de sesión.
     */
    public void abrirVentanaAcceso(){
        this.setVisible(false);
        VentanaLogin.setModal(true);
        VentanaLogin.setUndecorated(true);
        VentanaLogin.setSize(482, 324);
        VentanaLogin.setLocationRelativeTo(null);
        VentanaLogin.setVisible(true);
    }
    
    /**
     * Método utilizado para centrar las ventanas, puede ser utilizado por cualquier objeto de la ventana principal.
     * @param ventana Recibe un objeto de tipo JInternalFrame y lo centra.
     */
    public void centrarVentana(JInternalFrame ventana){
        int tamaño = (Escritorio.getWidth() - ventana.getWidth()) / 2;
        ventana.setLocation(tamaño,0);
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
    private javax.swing.JButton btnNull1;
    private javax.swing.JButton buttonSalir;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private javax.swing.JMenuItem itemAgregarMovimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuarioActivo;
    private javax.swing.JPanel panBG;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPasswordField textoPassword;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}

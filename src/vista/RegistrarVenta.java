package vista;

import modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RegistrarVenta extends javax.swing.JInternalFrame {
    
    DecimalFormat df = new DecimalFormat("0.00");//para dos decimales
    Conexion conexion = new Conexion();
    
    Venta venta;
    Permisos permiso;
    Producto producto;
    Empleado empleado;
    VentaProducto ventaProd;
    AlmacenProducto almacenProd;
    Cliente cliente;
    //Conexion conexion;
    JDesktopPane escritorio;
    Factura factura;
    
    boolean userName = false;
    boolean elegirPrivilegios = false;
    int filasListaVenta=0;
    double subtotalArt=0, totalArt = 0;
    
    Log ll = new Log();
    Date date = new Date ();
    
    public RegistrarVenta(Permisos permiso, Venta venta, Producto producto, VentaProducto ventaProd, AlmacenProducto almacenProd , Factura factura ) {
        
        this.permiso = permiso;
        this.venta = venta;
        this.producto = producto;
        this.ventaProd = ventaProd;
        this.almacenProd = almacenProd;
        this.factura = factura;
        initComponents();
        
       // folioVenta.setText(String.valueOf(venta.obtenerNoRegistro()));
       // java.util.Date fecha = new Date();
       // fechaa.setDate(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFechaRegistro = new javax.swing.JLabel();
        fechaa = new com.toedter.calendar.JDateChooser();
        txtFolioVenta = new javax.swing.JTextField();
        lblFolioVenta = new javax.swing.JLabel();
        cbxEstatusVenta = new javax.swing.JComboBox<String>();
        lblEstatusVenta = new javax.swing.JLabel();
        PanelDetallesMovimiento = new javax.swing.JPanel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        lblEmpleado = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblAlmacen = new javax.swing.JLabel();
        txtIdAlmacen = new javax.swing.JTextField();
        comboAlmacenes = new javax.swing.JComboBox<String>();
        comboEmpleado = new javax.swing.JComboBox<String>();
        comboCliente = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelDetalleSaldo = new javax.swing.JPanel();
        lblIvaVenta = new javax.swing.JLabel();
        lblTotalVenta = new javax.swing.JLabel();
        lblSubtotalVenta = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        lblSignoDinero = new javax.swing.JLabel();
        txtIva = new javax.swing.JLabel();
        lblSignoDinero1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        lblSignoDinero2 = new javax.swing.JLabel();
        rbGenerarFactura = new javax.swing.JRadioButton();
        PanelDetallesVenta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblPrducto = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        lblPrecioProducto = new javax.swing.JLabel();
        lblCantidadComprarProducto = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        lblUnidadMedida = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        comboProducto = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        txtMedidaProducto = new javax.swing.JTextField();
        lblCantidadActual = new javax.swing.JLabel();
        txtCantidadActual = new javax.swing.JTextField();
        lblPrecioSugerido = new javax.swing.JLabel();
        txtPrecioSugerido = new javax.swing.JTextField();
        lblAgregarProd = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        lblAlmacenado = new javax.swing.JLabel();
        txtAlmacenado = new javax.swing.JTextField();
        btnCancelarVenta = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Venta");
        setToolTipText("");
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

        lblFechaRegistro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFechaRegistro.setForeground(new java.awt.Color(0, 0, 102));
        lblFechaRegistro.setText("Fecha");

        fechaa.setEnabled(false);

        txtFolioVenta.setEditable(false);
        txtFolioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioVentaActionPerformed(evt);
            }
        });

        lblFolioVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFolioVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblFolioVenta.setText("Folio Venta");

        cbxEstatusVenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTIVA", "CANCELADA" }));
        cbxEstatusVenta.setEnabled(false);

        lblEstatusVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEstatusVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblEstatusVenta.setText("Estatus");

        PanelDetallesMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        PanelDetallesMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Movimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDetallesMovimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdEmpleado.setEditable(false);
        PanelDetallesMovimiento.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 64, 41, -1));

        txtIdCliente.setEditable(false);
        PanelDetallesMovimiento.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 94, 41, -1));

        lblEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(0, 0, 102));
        lblEmpleado.setText("Empleado");
        PanelDetallesMovimiento.add(lblEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 66, -1, -1));

        lblCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(0, 0, 102));
        lblCliente.setText("Cliente");
        PanelDetallesMovimiento.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 96, -1, -1));

        lblAlmacen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAlmacen.setForeground(new java.awt.Color(0, 0, 102));
        lblAlmacen.setText("Almacén");
        PanelDetallesMovimiento.add(lblAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 36, -1, -1));

        txtIdAlmacen.setEditable(false);
        PanelDetallesMovimiento.add(txtIdAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 34, 41, -1));

        comboAlmacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlmacenesActionPerformed(evt);
            }
        });
        PanelDetallesMovimiento.add(comboAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 31, 231, -1));

        comboEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpleadoActionPerformed(evt);
            }
        });
        PanelDetallesMovimiento.add(comboEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 61, 231, -1));

        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });
        PanelDetallesMovimiento.add(comboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 91, 231, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        PanelDetallesMovimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 33, 19, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        PanelDetallesMovimiento.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 63, 19, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        PanelDetallesMovimiento.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 93, 19, -1));

        PanelDetalleSaldo.setBackground(new java.awt.Color(255, 255, 255));
        PanelDetalleSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Saldo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        lblIvaVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIvaVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblIvaVenta.setText("IVA");

        lblTotalVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTotalVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblTotalVenta.setText("Total");

        lblSubtotalVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSubtotalVenta.setForeground(new java.awt.Color(0, 0, 102));
        lblSubtotalVenta.setText("Subtotal");

        lblSignoDinero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSignoDinero.setForeground(new java.awt.Color(0, 0, 102));
        lblSignoDinero.setText("$");

        lblSignoDinero1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSignoDinero1.setForeground(new java.awt.Color(0, 0, 102));
        lblSignoDinero1.setText("$");

        lblSignoDinero2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSignoDinero2.setForeground(new java.awt.Color(0, 0, 102));
        lblSignoDinero2.setText("$");

        javax.swing.GroupLayout PanelDetalleSaldoLayout = new javax.swing.GroupLayout(PanelDetalleSaldo);
        PanelDetalleSaldo.setLayout(PanelDetalleSaldoLayout);
        PanelDetalleSaldoLayout.setHorizontalGroup(
            PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIvaVenta)
                    .addComponent(lblSubtotalVenta)
                    .addComponent(lblTotalVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDetalleSaldoLayout.createSequentialGroup()
                                .addComponent(lblSignoDinero1)
                                .addGap(0, 0, 0)
                                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                                .addComponent(lblSignoDinero2)
                                .addGap(0, 0, 0)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addComponent(lblSignoDinero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        PanelDetalleSaldoLayout.setVerticalGroup(
            PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                                .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSignoDinero)
                                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSignoDinero1)
                                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelDetalleSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSignoDinero2)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDetalleSaldoLayout.createSequentialGroup()
                        .addComponent(lblSubtotalVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIvaVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalVenta)))
                .addContainerGap())
        );

        rbGenerarFactura.setBackground(new java.awt.Color(255, 255, 255));
        rbGenerarFactura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbGenerarFactura.setForeground(new java.awt.Color(0, 0, 102));
        rbGenerarFactura.setText("Generar Factura");

        PanelDetallesVenta.setBackground(new java.awt.Color(255, 255, 255));
        PanelDetallesVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        PanelDetallesVenta.setPreferredSize(new java.awt.Dimension(571, 343));
        PanelDetallesVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(new java.awt.Color(0, 0, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id de Producto", "Id de Almacén", "Descripción", "Precio Unitario", "Num Unidades", "Medida", "Importe"
            }
        ));
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);

        PanelDetallesVenta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 590, 140));

        lblPrducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrducto.setForeground(new java.awt.Color(0, 0, 102));
        lblPrducto.setText("Producto");
        PanelDetallesVenta.add(lblPrducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtIdProducto.setEditable(false);
        PanelDetallesVenta.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 30));

        lblPrecioProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrecioProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblPrecioProducto.setText("Precio por Unidad");
        PanelDetallesVenta.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        lblCantidadComprarProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCantidadComprarProducto.setForeground(new java.awt.Color(0, 0, 102));
        lblCantidadComprarProducto.setText("Cantidad a Vender");
        PanelDetallesVenta.add(lblCantidadComprarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 130, -1));

        txtCantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadProductoKeyTyped(evt);
            }
        });
        PanelDetallesVenta.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 70, -1));

        lblUnidadMedida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUnidadMedida.setForeground(new java.awt.Color(0, 0, 102));
        lblUnidadMedida.setText("Unidad de Medida");
        PanelDetallesVenta.add(lblUnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        txtPrecioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProductoKeyTyped(evt);
            }
        });
        PanelDetallesVenta.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 70, -1));

        comboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductoActionPerformed(evt);
            }
        });
        PanelDetallesVenta.add(comboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 34, 430, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/read1.png"))); // NOI18N
        PanelDetallesVenta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 30, 30));

        txtMedidaProducto.setEditable(false);
        txtMedidaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedidaProductoKeyTyped(evt);
            }
        });
        PanelDetallesVenta.add(txtMedidaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 70, -1));

        lblCantidadActual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCantidadActual.setForeground(new java.awt.Color(0, 0, 102));
        lblCantidadActual.setText("Cantidad Actual");
        PanelDetallesVenta.add(lblCantidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtCantidadActual.setEditable(false);
        txtCantidadActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadActualKeyTyped(evt);
            }
        });
        PanelDetallesVenta.add(txtCantidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 70, -1));

        lblPrecioSugerido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrecioSugerido.setForeground(new java.awt.Color(0, 0, 102));
        lblPrecioSugerido.setText("Precio Sugerido por TM");
        PanelDetallesVenta.add(lblPrecioSugerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtPrecioSugerido.setEditable(false);
        txtPrecioSugerido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioSugeridoKeyTyped(evt);
            }
        });
        PanelDetallesVenta.add(txtPrecioSugerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 70, -1));

        lblAgregarProd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAgregarProd.setForeground(new java.awt.Color(0, 0, 102));
        lblAgregarProd.setText("Agregar");
        PanelDetallesVenta.add(lblAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/button_plus_blue.png"))); // NOI18N
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        PanelDetallesVenta.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 33, 33));

        lblAlmacenado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAlmacenado.setForeground(new java.awt.Color(0, 0, 102));
        lblAlmacenado.setText("Id Almacén");
        PanelDetallesVenta.add(lblAlmacenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtAlmacenado.setEditable(false);
        txtAlmacenado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlmacenadoKeyTyped(evt);
            }
        });
        PanelDetallesVenta.add(txtAlmacenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 70, -1));

        btnCancelarVenta.setBackground(new java.awt.Color(102, 102, 255));
        btnCancelarVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });
        PanelDetallesVenta.add(btnCancelarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        btnRegistrarVenta.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVenta.setText("Vender");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });
        PanelDetallesVenta.add(btnRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 96, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFolioVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFolioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFechaRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblEstatusVenta)
                        .addGap(4, 4, 4)
                        .addComponent(cbxEstatusVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelDetallesMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelDetalleSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rbGenerarFactura)))
                        .addContainerGap())
                    .addComponent(PanelDetallesVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFolioVenta)
                                .addComponent(txtFolioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFechaRegistro))
                            .addComponent(fechaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxEstatusVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEstatusVenta)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDetallesMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelDetalleSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbGenerarFactura)))
                .addGap(5, 5, 5)
                .addComponent(PanelDetallesVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cargarComboAlmacenes() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombreA from almacen");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboAlmacenes.addItem(rs.getString(1));          
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }   
    
    public void cargarComboEmpleados() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombre from empleado");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboEmpleado.addItem(rs.getString(1));         
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }
    
    public void cargarComboProductos() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombre from producto");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
             comboProducto.addItem(rs.getString(1));         
        }
        conexion.desconectarSQL();
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        } 
        
    }
        
    
        
    public boolean fieldsVentaOk () {
        String idEmpOk = txtIdEmpleado.getText();
        String idCliOk = txtIdCliente.getText();
        String idAlmOk = txtIdAlmacen.getText();
        String ivaOk = txtIva.getText();
        if ( !idEmpOk.isEmpty() && !idCliOk.isEmpty() && !ivaOk.isEmpty() && !idAlmOk.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
    
    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        if(fieldsVentaOk()){
                try {
                    venta.setIdEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
                    venta.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
                    venta.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
                    venta.setSubtotal(Double.parseDouble(txtSubtotal.getText()));
                    venta.setIva(Double.parseDouble(txtIva.getText()));
                    venta.setTotal(Double.parseDouble(txtTotal.getText()));
                    venta.setEstatus("ACTIVA");
                    venta.registrarVenta();
                    for (int i = 0; i < filasListaVenta; i++) {
                        //almacenar datos en venta_producto
                        ventaProd.setFolioVenta(Integer.parseInt(txtFolioVenta.getText()));
                        ventaProd.setIdProducto(Integer.parseInt(table.getModel().getValueAt(i, 0).toString()));
                        ventaProd.setPrecio(Double.parseDouble(table.getModel().getValueAt(i, 6).toString()));
                        ventaProd.setCantidad(Double.parseDouble(table.getModel().getValueAt(i, 4).toString()));
                        //almacenar datos en almacen_producto
                        almacenProd.setIdAlmacen(Integer.parseInt(table.getModel().getValueAt(i, 1).toString()));
                        almacenProd.setIdProducto(Integer.parseInt(table.getModel().getValueAt(i, 0).toString()));
                        almacenProd.setCantidad(Double.parseDouble(table.getModel().getValueAt(i, 4).toString()));
                        ventaProd.registrarVentaProd();
                        almacenProd.registarSalidaProducto();
                    }

                    JOptionPane.showMessageDialog(null,"Venta Realizada");
                    ll.agregarAccion(date.toString(),"Registro de Venta");
                    this.dispose();
                }catch (Exception e) {}
            }
        else {
                JOptionPane.showMessageDialog(null,"Llene todos los datos");
        }
        
        if (rbGenerarFactura.isSelected()) {
                try {
                    factura.setFolioVenta(Integer.parseInt(txtFolioVenta.getText()));
                    factura.setSubtotal(Double.parseDouble(txtSubtotal.getText()));
                    factura.setIva(Double.parseDouble(txtIva.getText()));
                    factura.setTotal(Double.parseDouble(txtTotal.getText()));
                    factura.setEstatus("Activa");
                    factura.generarFactura();
                    JOptionPane.showMessageDialog(null,"Factura Generada");
                    }
                catch (Exception e){}
            }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
            this.dispose();
    }//GEN-LAST:event_btnCancelarVentaActionPerformed
  /* 
  
    private double obtenerImporte() {
        double importe = 0;
    try{
        double precioInd = Double.parseDouble(preciouGenerado.getText());
        double cantidadComprada = Double.parseDouble(cantidadCompra.getText());
        importe = (precioInd * cantidadComprada);
        subtotalArt+= importe;
        totalArt = (subtotalArt + (subtotalArt * .16));
        df.format(totalArt);
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Solo numeros");
    }
        
        return importe;
        
    }*/
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       
       fechaa.setDate(new Date());    //al iniciar setear la fecha actual
       txtFolioVenta.setText(String.valueOf(venta.obtenerFolio())); 
       cargarComboClientes();
       cargarComboProductos();
       cargarComboEmpleados();
       cargarComboAlmacenes();
    }//GEN-LAST:event_formInternalFrameOpened
    
    public void cargarComboClientes() {
        conexion.conexionSQL();
        PreparedStatement comando = null;
        try
        {
        comando = conexion.getConexion().prepareStatement("select nombre from cliente");
        ResultSet rs = comando.executeQuery();
        while(rs.next()){
            comboCliente.addItem(rs.getString(1));           
        }        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }finally {
            conexion.desconectarSQL();
        }
    }
    
    private void txtFolioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioVentaActionPerformed

    private void txtCantidadProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProductoKeyTyped
        char c = evt.getKeyChar();
        String cantidad = txtCantidadProducto.getText();

        if(cantidad.length()>2){
            evt.consume();
            getToolkit().beep();
        }
        if(Character.isLetter(c)) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtCantidadProductoKeyTyped

    private void txtPrecioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProductoKeyTyped
        String msg = String.valueOf(evt.getKeyChar());
        String precioVentaa = txtPrecioProducto.getText();
        int precioVenta = txtPrecioProducto.getText().length();
        if (!(msg.matches("[.0-9]"))) {
                evt.consume();
        }
        if (precioVenta >= 1) {
                for (int j = 0; j < precioVenta; j++) {
                        if (precioVentaa.charAt(j) == '.') {
                                if (!msg.matches(("[0-9]"))) {
                                        evt.consume();
                                }
                        }
                }
        }
    }//GEN-LAST:event_txtPrecioProductoKeyTyped

    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
            String cantventa =txtCantidadProducto.getText();
            if (!cantventa.isEmpty()){
                DefaultTableModel modelo = (DefaultTableModel)table.getModel();
                modelo.addRow(new Object[filasListaVenta]);
                double cantidadStock = Double.parseDouble(txtCantidadActual.getText());
                double cantidadVender = Double.parseDouble(txtCantidadProducto.getText());
                    if(cantidadStock>=cantidadVender) {
                        try {
                            table.setValueAt(txtIdProducto.getText(), filasListaVenta, 0);
                            table.setValueAt(txtAlmacenado.getText(), filasListaVenta, 1);
                            table.setValueAt(String.valueOf(comboProducto.getSelectedItem()), filasListaVenta, 2);
                            table.setValueAt(txtPrecioProducto.getText(), filasListaVenta, 3);
                            table.setValueAt(txtCantidadProducto.getText(), filasListaVenta, 4);
                            table.setValueAt(txtMedidaProducto.getText(), filasListaVenta, 5);
                            table.setValueAt(obtenerImporte(), filasListaVenta, 6); 
                            txtIva.setText(String.valueOf((subtotalArt * .16)));
                            txtSubtotal.setText(String.valueOf(subtotalArt));
                            txtTotal.setText(String.valueOf(totalArt));
                            filasListaVenta++;
                        } 
                        catch (Exception e) {}
                    }else {
                        JOptionPane.showMessageDialog(null,"Producto en inventario insuficiente, seleccione una cantidad menor");
                    }
                }else {
                JOptionPane.showMessageDialog(null,"Introduzca precio y cantidad");
            }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed
    
     private double obtenerImporte() {
        double importe = 0;
    try{
        double precioInd = Double.parseDouble(txtPrecioProducto.getText());
        double cantidadComprada = Double.parseDouble(txtCantidadProducto.getText());
        importe = (precioInd * cantidadComprada);
        subtotalArt+= importe;
        totalArt = (subtotalArt + (subtotalArt * .16));
        df.format(totalArt);
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Solo numeros");
    }
    return importe;    
    }
    
    
    private void comboAlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlmacenesActionPerformed
        txtIdAlmacen.setText(String.valueOf(regresarIdAlmacen()));
    }//GEN-LAST:event_comboAlmacenesActionPerformed

    private void comboEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpleadoActionPerformed
        txtIdEmpleado.setText(String.valueOf(regresarIdEmp()));
    }//GEN-LAST:event_comboEmpleadoActionPerformed

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        txtIdCliente.setText(String.valueOf(regresarIdCli()));
    }//GEN-LAST:event_comboClienteActionPerformed

    private void comboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductoActionPerformed

            txtIdProducto.setText(String.valueOf(regresarIdProd()));
            txtMedidaProducto.setText(regresarMedidaProducto());
            txtCantidadActual.setText(regresarCantidadActual());
            txtPrecioSugerido.setText(regresarPrecioSugerido());
            txtAlmacenado.setText(String.valueOf(regresarAlmacenProducto()));
    }//GEN-LAST:event_comboProductoActionPerformed

    private void txtMedidaProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedidaProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedidaProductoKeyTyped

    private void txtCantidadActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadActualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActualKeyTyped

    private void txtPrecioSugeridoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioSugeridoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioSugeridoKeyTyped

    private void txtAlmacenadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlmacenadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlmacenadoKeyTyped
       
    public int regresarAlmacenProducto () {
        int idAlmacenProd=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String empleadoo = comboProducto.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select ap.idAlmacen from almacen_producto ap join producto p on ap.idProducto = p.idProducto where p.nombre = ?");
        comando.setString(1, empleadoo);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idAlmacenProd = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idAlmacenProd;       
    }
    
    public String regresarCantidadActual () {
        String medidaProd=null;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String idProducto = comboProducto.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement(" select ap.cantidad from almacen_producto ap join producto p on ap.idProducto = p.idProducto where p.nombre = ?");
        comando.setString(1, idProducto);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            medidaProd = rs.getString(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return medidaProd;
    }
        
    public String regresarPrecioSugerido () {
        String medidaProd=null;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String idProducto = comboProducto.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement(" select precioSugerido from producto where nombre = ?");
        comando.setString(1, idProducto);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            medidaProd = rs.getString(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return medidaProd;
    }
    
    
    public String regresarMedidaProducto () {
        String medidaProd=null;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String idProducto = comboProducto.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement(" select medida from producto where nombre = ?");
        comando.setString(1, idProducto);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){      
            medidaProd = rs.getString(1);
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return medidaProd;
    }
        
        
    public int regresarIdEmp () {
        int idEmpleado=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String empleadoo = comboEmpleado.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select idEmpleado from empleado where nombre=?");
        comando.setString(1, empleadoo);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idEmpleado = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idEmpleado;   
    }
 
    public int regresarIdProd () {
        int idProducto=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String productoo = comboProducto.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select idProducto from producto where nombre=?");
        comando.setString(1, productoo);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idProducto = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idProducto;   
    }
        
    public int regresarIdCli () {
        
        int idCliente=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String clientee = comboCliente.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select idCliente from cliente where nombre=?");
        comando.setString(1, clientee);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idCliente = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idCliente;   
    }
  
    public int regresarIdAlmacen () {
        int idAlmacen=0;
        conexion.conexionSQL();
        PreparedStatement comando = null;
        String almacenn = comboAlmacenes.getSelectedItem().toString();
        try{
        comando = conexion.getConexion().prepareStatement("select idAlmacen from almacen where nombreA=?");
        comando.setString(1, almacenn);
        ResultSet rs = comando.executeQuery();
        while(rs.next()){                            
            idAlmacen = rs.getInt(1);   
        }
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error");
        }
        conexion.desconectarSQL();
        return idAlmacen;   
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDetalleSaldo;
    private javax.swing.JPanel PanelDetallesMovimiento;
    private javax.swing.JPanel PanelDetallesVenta;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JComboBox<String> cbxEstatusVenta;
    private javax.swing.JComboBox<String> comboAlmacenes;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JComboBox<String> comboEmpleado;
    private javax.swing.JComboBox<String> comboProducto;
    private com.toedter.calendar.JDateChooser fechaa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarProd;
    private javax.swing.JLabel lblAlmacen;
    private javax.swing.JLabel lblAlmacenado;
    private javax.swing.JLabel lblCantidadActual;
    private javax.swing.JLabel lblCantidadComprarProducto;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblEstatusVenta;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblFolioVenta;
    private javax.swing.JLabel lblIvaVenta;
    private javax.swing.JLabel lblPrducto;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblPrecioSugerido;
    private javax.swing.JLabel lblSignoDinero;
    private javax.swing.JLabel lblSignoDinero1;
    private javax.swing.JLabel lblSignoDinero2;
    private javax.swing.JLabel lblSubtotalVenta;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JLabel lblUnidadMedida;
    private javax.swing.JRadioButton rbGenerarFactura;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAlmacenado;
    private javax.swing.JTextField txtCantidadActual;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtFolioVenta;
    private javax.swing.JTextField txtIdAlmacen;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JLabel txtIva;
    private javax.swing.JTextField txtMedidaProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtPrecioSugerido;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
